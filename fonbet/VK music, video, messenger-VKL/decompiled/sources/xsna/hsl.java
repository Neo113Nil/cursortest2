package xsna;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: DeferredSocketAdapter.kt */
/* loaded from: classes11.dex */
public final class hsl implements iek0 {
    public final a a;
    public iek0 b;

    /* compiled from: DeferredSocketAdapter.kt */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        iek0 b(SSLSocket sSLSocket);
    }

    public hsl(a aVar) {
        this.a = aVar;
    }

    @Override // xsna.iek0
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // xsna.iek0
    public final void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        iek0 d = d(sSLSocket);
        if (d != null) {
            d.b(sSLSocket, str, list);
        }
    }

    @Override // xsna.iek0
    public final String c(SSLSocket sSLSocket) {
        iek0 d = d(sSLSocket);
        if (d != null) {
            return d.c(sSLSocket);
        }
        return null;
    }

    public final synchronized iek0 d(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // xsna.iek0
    public final boolean isSupported() {
        return true;
    }
}
