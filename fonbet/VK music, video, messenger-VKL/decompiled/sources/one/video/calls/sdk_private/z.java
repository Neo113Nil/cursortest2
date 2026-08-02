package one.video.calls.sdk_private;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.X509TrustManager;
import one.video.calls.sdk_private.f;
import xsna.de;
import xsna.mby0;
import xsna.mnh0;
import xsna.sp;
import xsna.ury0;

/* compiled from: Http3Client.java */
/* loaded from: classes8.dex */
public final class z extends de {
    public final Duration b;
    public final boolean c;
    public final X509TrustManager e;
    public final f.h f;
    public final sp g;
    public final ury0 h = new ury0(this);
    public final mnh0 d = new mnh0();
    public final ExecutorService i = Executors.newCachedThreadPool(new mby0("http3"));

    public z(Duration duration, boolean z, X509TrustManager x509TrustManager, f.h hVar, sp spVar) {
        this.b = duration;
        this.c = z;
        this.e = x509TrustManager;
        this.f = hVar;
        this.g = spVar;
    }
}
