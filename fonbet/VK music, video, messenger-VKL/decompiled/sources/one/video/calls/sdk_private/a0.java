package one.video.calls.sdk_private;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.net.ssl.X509TrustManager;
import one.video.calls.sdk_private.b0;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.dQ;
import one.video.calls.sdk_private.f;
import xsna.alk;
import xsna.bry0;
import xsna.cqi;
import xsna.hgy0;
import xsna.iqy0;
import xsna.kgy0;
import xsna.kqy0;
import xsna.lvb0;
import xsna.mdy0;
import xsna.na8;
import xsna.ply0;
import xsna.pzl;
import xsna.q4y0;
import xsna.rry0;
import xsna.sni0;
import xsna.sp;
import xsna.thy0;
import xsna.tpy0;
import xsna.wn4;
import xsna.xcl0;
import xsna.yxu;
import xsna.zjy0;

/* compiled from: Http3ClientConnectionImpl.java */
/* loaded from: classes8.dex */
public final class a0 extends b0 implements bry0 {
    public boolean j;
    public tpy0 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0(String str, String str2, int i, Duration duration, z zVar, mdy0 mdy0Var, sp spVar) throws IOException {
        super(r1);
        thy0 thy0Var = new thy0();
        ao$a ao_a = ao$a.a;
        ArrayList arrayList = new ArrayList();
        thy0Var.a = 60000;
        thy0Var.b = 3;
        thy0Var.c = 3;
        thy0Var.d = 2500000L;
        thy0Var.e = 250000L;
        thy0Var.f = 250000L;
        thy0Var.g = 2;
        thy0Var.h = 1500;
        String str3 = System.getenv("QUIC_VERSION");
        if (str3 != null) {
            String lowerCase = str3.trim().toLowerCase();
            if (!lowerCase.equals("1") && lowerCase.equals("2")) {
                ao_a = ao$a.b;
            }
        }
        long millis = duration.toMillis();
        thy0Var.b = 103;
        thy0Var.c = 100;
        boolean z = zVar.c;
        X509TrustManager x509TrustManager = zVar.e;
        kgy0 kgy0Var = null;
        X509TrustManager x509TrustManager2 = x509TrustManager != null ? x509TrustManager : null;
        f.h hVar = zVar.f;
        if (str == null) {
            throw new IllegalStateException("Cannot create connection when URI is not set");
        }
        int i2 = 0;
        while (i2 < 2) {
            int codePointAt = "h3".codePointAt(i2);
            if (!Character.isWhitespace(codePointAt)) {
                if (millis < 1) {
                    throw new IllegalArgumentException("Connect timeout must be larger than 0.");
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(f.b.TLS_AES_128_GCM_SHA256);
                }
                String str4 = str2 == null ? str : str2;
                if (ao_a != null) {
                    int i3 = kgy0.a.a[ao_a.ordinal()];
                    if (i3 == 1) {
                        kgy0Var = kgy0.b;
                    } else if (i3 == 2) {
                        kgy0Var = kgy0.c;
                    }
                }
                bE bEVar = new bE(str, str4, i, millis, thy0Var, kgy0Var, spVar, arrayList, mdy0Var);
                a aVar = bEVar.y;
                if (z) {
                    aVar.s = new hgy0();
                    aVar.t = new sni0(11);
                }
                if (x509TrustManager2 != null) {
                    aVar.s = x509TrustManager2;
                }
                aVar.t = new bE.a(hVar);
                bEVar.E.j = new Consumer() { // from class: xsna.sry0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        new Thread(new v9j(10, one.video.calls.sdk_private.a0.this, (sdy0) obj)).start();
                    }
                };
                return;
            }
            i2 += Character.charCount(codePointAt);
        }
        throw new IllegalStateException("Application protocol must be set");
    }

    public final b0.a e(yxu yxuVar, Duration duration) throws InterruptedException, dj, IOException {
        URI uri = (URI) yxuVar.b;
        if (!this.g.await(duration.toMillis(), TimeUnit.MILLISECONDS)) {
            throw new dj("No SETTINGS frame received in time.");
        }
        if (c(8L).orElse(0L).longValue() != 1) {
            throw new dj("Server does not support Extended Connect (RFC 9220).");
        }
        HashMap hashMap = new HashMap();
        int port = uri.getPort();
        if (port <= 0) {
            port = 443;
        }
        String a = na8.a(port, uri.getHost(), StringUtils.PROCESS_POSTFIX_DELIMITER);
        String path = uri.getPath();
        int length = path.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                path = DomExceptionUtils.SEPARATOR;
                break;
            }
            int codePointAt = path.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        if (uri.getQuery() != null && !uri.getQuery().isEmpty()) {
            path = pzl.b(path, "?", uri.getQuery());
        }
        int i2 = 1;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(":authority", a), new AbstractMap.SimpleEntry(":method", "CONNECT"), new AbstractMap.SimpleEntry(":protocol", "webtransport"), new AbstractMap.SimpleEntry(":scheme", HttpRequest.DEFAULT_SCHEME), new AbstractMap.SimpleEntry(":path", path)};
        HashMap hashMap2 = new HashMap(5);
        for (int i3 = 0; i3 < 5; i3++) {
            Map.Entry entry = entryArr[i3];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap2.put(key, value) != null) {
                throw new IllegalArgumentException(cqi.c(key, "duplicate key: "));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        if (unmodifiableMap.keySet().stream().anyMatch(new ply0(1))) {
            throw new IllegalArgumentException("Pseudo headers must start with ':'");
        }
        zjy0 c = this.b.c(true);
        lvb0 lvb0Var = c.g;
        ArrayList arrayList = new ArrayList();
        unmodifiableMap.entrySet().forEach(new xcl0(arrayList, i2));
        hashMap.entrySet().forEach(new q4y0(arrayList, 2));
        final kqy0 kqy0Var = this.i;
        kqy0Var.getClass();
        final ByteBuffer allocate = ByteBuffer.allocate(arrayList.stream().mapToInt(new iqy0()).sum() + 10);
        allocate.put((byte) 0);
        allocate.put((byte) 0);
        arrayList.forEach(new Consumer() { // from class: xsna.jqy0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry2 = (Map.Entry) obj;
                Charset charset = kqy0.b;
                pqy0 pqy0Var = kqy0.this.a;
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                Objects.requireNonNull(str);
                Objects.requireNonNull(str2);
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    String[] strArr = pqy0Var.a;
                    if (i5 >= strArr.length) {
                        break;
                    }
                    if (str.equals(strArr[i5])) {
                        if (i4 < 0) {
                            i4 = i5;
                        }
                        if (str2.equals(pqy0Var.b[i5])) {
                            i4 = i5;
                            break;
                        }
                    }
                    i5++;
                }
                ByteBuffer byteBuffer = allocate;
                if (i4 < 0) {
                    byte[] bytes = ((String) entry2.getKey()).getBytes(charset);
                    kqy0.a(3, (byte) 32, bytes.length, byteBuffer);
                    byteBuffer.put(bytes);
                    byte[] bytes2 = ((String) entry2.getValue()).getBytes(charset);
                    kqy0.a(7, (byte) 0, bytes2.length, byteBuffer);
                    byteBuffer.put(bytes2);
                    return;
                }
                String[] strArr2 = pqy0Var.a;
                if (strArr2[i4] == null) {
                    throw new dQ();
                }
                if (((String) new AbstractMap.SimpleImmutableEntry(strArr2[i4], pqy0Var.b[i4]).getValue()).equals(entry2.getValue())) {
                    kqy0.a(6, (byte) -64, i4, byteBuffer);
                    return;
                }
                String str3 = (String) entry2.getValue();
                kqy0.a(4, (byte) 80, i4, byteBuffer);
                byte[] bytes3 = str3.getBytes(charset);
                kqy0.a(7, (byte) 0, bytes3.length, byteBuffer);
                byteBuffer.put(bytes3);
            }
        });
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        alk.d(allocate.limit(), allocate2);
        byte[] bArr = new byte[allocate.limit() + allocate2.limit() + 1];
        bArr[0] = 1;
        allocate2.get(bArr, 1, allocate2.limit());
        allocate.get(bArr, allocate2.limit() + 1, allocate.limit());
        lvb0Var.write(bArr);
        wn4 a2 = a(c.f);
        if (!(a2 instanceof rry0)) {
            if (a2 != null) {
                throw new ProtocolException("Expected headers frame, got ".concat(a2.getClass().getSimpleName()));
            }
            throw new ProtocolException("Got empty response from server");
        }
        try {
            rry0 rry0Var = (rry0) a2;
            rry0Var.getClass();
            String str = (String) rry0Var.a.get(":status");
            if (str != null) {
                try {
                    Integer.parseInt(str);
                    int parseInt = Integer.parseInt(str);
                    if (parseInt < 200 || parseInt >= 300) {
                        throw new dj("CONNECT request failed", parseInt);
                    }
                    return new b0.a(this, c);
                } catch (NumberFormatException unused) {
                }
            }
            throw new dx();
        } catch (dx unused2) {
            throw new ProtocolException("Malformed response from server: missing status code");
        }
    }
}
