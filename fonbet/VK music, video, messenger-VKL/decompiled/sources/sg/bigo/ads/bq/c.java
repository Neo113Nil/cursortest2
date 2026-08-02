package sg.bigo.ads.bq;

import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.commons.http.Http;
import sg.bigo.ads.bo.e;
import sg.bigo.ads.bo.h;
import sg.bigo.ads.br.a;
import sg.bigo.ads.common.utils.i;

/* loaded from: classes9.dex */
public final class c implements UrlRequest$Callback {
    private final b a;
    private final sg.bigo.ads.bo.b b;
    private final sg.bigo.ads.bp.b c;
    private final a d;
    private final List<byte[]> e = new ArrayList();
    private int f = 0;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private String h;

    public interface a {
        void a();
    }

    public c(@NonNull b bVar, @NonNull sg.bigo.ads.bo.b bVar2, @NonNull sg.bigo.ads.bp.b bVar3, a aVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
        this.d = aVar;
    }

    private static String a(UrlResponseInfo urlResponseInfo) {
        String negotiatedProtocol;
        if (urlResponseInfo == null) {
            return null;
        }
        try {
            negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
            return negotiatedProtocol;
        } catch (Throwable th) {
            th.getMessage();
            return "unsupported";
        }
    }

    private void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void onCanceled(@NonNull UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo) {
        this.h = a(urlResponseInfo);
        sg.bigo.ads.bn.a.a(0, "HttpEngineNetClient", "onCanceled");
        a(new h(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, "request cancelled"));
    }

    public final void onFailed(@NonNull UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo, @NonNull HttpException httpException) {
        String message;
        String message2;
        this.h = a(urlResponseInfo);
        StringBuilder sb = new StringBuilder(" onFailed: ");
        message = httpException.getMessage();
        sb.append(message);
        sg.bigo.ads.bn.a.a(0, "HttpEngineNetClient", sb.toString());
        message2 = httpException.getMessage();
        String message3 = message2 != null ? httpException.getMessage() : "";
        a(new h((message3.contains("TIMED_OUT") || message3.contains("timeout") || message3.contains("ERR_CONNECTION_TIMED_OUT")) ? IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, message3));
    }

    public final void onReadCompleted(@NonNull UrlRequest urlRequest, @NonNull UrlResponseInfo urlResponseInfo, @NonNull ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        this.e.add(bArr);
        this.f += remaining;
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(@NonNull UrlRequest urlRequest, @NonNull UrlResponseInfo urlResponseInfo, @NonNull String str) {
        URL url;
        int httpStatusCode;
        int httpStatusCode2;
        String url2;
        this.h = a(urlResponseInfo);
        try {
            url2 = urlResponseInfo.getUrl();
            url = new URL(url2);
        } catch (Exception unused) {
            url = null;
        }
        httpStatusCode = urlResponseInfo.getHttpStatusCode();
        a.C2444a a2 = sg.bigo.ads.br.a.a(httpStatusCode, str, this.a.a.a(), url, this.a.c);
        if (a2 != null) {
            sg.bigo.ads.bo.b bVar = this.b;
            sg.bigo.ads.bs.c<?> cVar = this.a.a;
            httpStatusCode2 = urlResponseInfo.getHttpStatusCode();
            bVar.a(cVar, str, httpStatusCode2);
        }
        if (a2 != null && a2.c != 0) {
            urlRequest.cancel();
            a(new h(a2.c, a2.d));
            return;
        }
        try {
            URL url3 = this.a.c;
            URL url4 = new URL(str);
            if (url3 != null) {
                this.c.a(url3, url4);
            }
        } catch (Exception unused2) {
        }
        b bVar2 = this.a;
        if (bVar2.d) {
            bVar2.a.a("Accept-Encoding");
        }
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(@NonNull UrlRequest urlRequest, @NonNull UrlResponseInfo urlResponseInfo) {
        urlRequest.read(ByteBuffer.allocateDirect(32768));
    }

    public final void onSucceeded(@NonNull UrlRequest urlRequest, @NonNull UrlResponseInfo urlResponseInfo) {
        int httpStatusCode;
        HeaderBlock headers;
        Map asMap;
        HeaderBlock headers2;
        Map asMap2;
        byte[] bArr;
        if (this.g.compareAndSet(false, true)) {
            httpStatusCode = urlResponseInfo.getHttpStatusCode();
            i iVar = new i();
            headers = urlResponseInfo.getHeaders();
            asMap = headers.getAsMap();
            for (Map.Entry entry : asMap.entrySet()) {
                if (entry.getKey() != null) {
                    iVar.a((String) entry.getKey(), entry.getValue());
                }
            }
            headers2 = urlResponseInfo.getHeaders();
            asMap2 = headers2.getAsMap();
            List list = (List) asMap2.get("content-encoding");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (this.a.d && Http.ContentEncoding.GZIP.equalsIgnoreCase(str)) {
                iVar.b(Http.Header.CONTENT_ENCODING);
                iVar.b(Http.Header.CONTENT_LENGTH);
            }
            int i = this.f;
            if (i == 0) {
                bArr = new byte[0];
            } else {
                bArr = new byte[i];
                int i2 = 0;
                for (byte[] bArr2 : this.e) {
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
            }
            String a2 = a(urlResponseInfo);
            this.h = a2;
            sg.bigo.ads.bs.c<?> cVar = this.a.a;
            cVar.p = a2;
            if (this.b.a((sg.bigo.ads.bo.b) cVar, httpStatusCode)) {
                Objects.toString(this.a);
                sg.bigo.ads.bt.c a3 = this.b.a(new sg.bigo.ads.bt.a(this.a.a.j, httpStatusCode, new ByteArrayInputStream(bArr), iVar));
                a();
                this.b.a((sg.bigo.ads.bo.b) this.a.a, (sg.bigo.ads.bs.c<?>) a3);
            } else {
                sg.bigo.ads.bn.a.a(0, "HttpEngineNetClient", "responseCode=" + httpStatusCode + ", invalid.");
                String str2 = new String(bArr);
                StringBuilder sb = new StringBuilder();
                sb.append(!TextUtils.isEmpty(str2) ? str2.concat(", ") : "");
                sb.append("responseCode is ");
                sb.append(httpStatusCode);
                sb.append(", validate fail.");
                String sb2 = sb.toString();
                a();
                this.b.a((sg.bigo.ads.bo.b) this.a.a, (h) new e(httpStatusCode, sb2));
            }
            b();
        }
    }

    private void a() {
        this.a.a.k.c();
    }

    private void b(@NonNull h hVar) {
        if (hVar.getClass() == h.class) {
            this.a.a.k.b();
        } else if (hVar.getClass() == e.class) {
            this.a.a.k.c();
        }
    }

    public final void a(@NonNull h hVar) {
        if (this.g.compareAndSet(false, true)) {
            this.a.a.p = this.h;
            b(hVar);
            this.b.a((sg.bigo.ads.bo.b) this.a.a, hVar);
            b();
        }
    }
}
