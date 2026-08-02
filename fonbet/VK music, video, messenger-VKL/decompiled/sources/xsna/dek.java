package xsna;

import com.vk.knet.core.http.HttpProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import ru.ok.android.commons.http.Http;

/* compiled from: CronetConnectionBuilder.kt */
/* loaded from: classes2.dex */
public final class dek extends RequestFinishedInfo.Listener {
    public final /* synthetic */ eek a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ckv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dek(eek eekVar, long j, long j2, ckv ckvVar, ExecutorService executorService) {
        super(executorService);
        this.a = eekVar;
        this.b = j;
        this.c = j2;
        this.d = ckvVar;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(final RequestFinishedInfo requestFinishedInfo) {
        final eek eekVar = this.a;
        Executor executor = eekVar.d;
        final long j = this.b;
        final long j2 = this.c;
        final ckv ckvVar = this.d;
        executor.execute(new Runnable() { // from class: xsna.cek
            @Override // java.lang.Runnable
            public final void run() {
                String negotiatedProtocol;
                eek eekVar2 = eek.this;
                wjv wjvVar = eekVar2.b;
                if (wjvVar != null) {
                    RequestFinishedInfo requestFinishedInfo2 = requestFinishedInfo;
                    UrlResponseInfo responseInfo = requestFinishedInfo2.getResponseInfo();
                    long j3 = j;
                    long j4 = j2;
                    ckv ckvVar2 = ckvVar;
                    HttpProtocol httpProtocol = null;
                    if (responseInfo == null) {
                        wjvVar.a(pek.a(requestFinishedInfo2, j3, j4, null, eekVar2.c), ckvVar2, null);
                        return;
                    }
                    Map<String, List<String>> allHeaders = responseInfo.getAllHeaders();
                    String a = eek.a(eekVar2, allHeaders, "Content-Type");
                    String a2 = eek.a(eekVar2, allHeaders, Http.Header.CONTENT_LENGTH);
                    Long n = a2 != null ? arm0.n(a2) : null;
                    int httpStatusCode = responseInfo.getHttpStatusCode();
                    responseInfo.getHttpStatusText();
                    UrlResponseInfo responseInfo2 = requestFinishedInfo2.getResponseInfo();
                    if (responseInfo2 != null && (negotiatedProtocol = responseInfo2.getNegotiatedProtocol()) != null) {
                        httpProtocol = pek.b(negotiatedProtocol);
                    }
                    pkv pkvVar = new pkv(httpStatusCode, a, n, httpProtocol, allHeaders);
                    wjvVar.a(pek.a(requestFinishedInfo2, j3, j4, pkvVar, eekVar2.c), ckvVar2, pkvVar);
                }
            }
        });
    }
}
