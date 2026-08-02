package xsna;

import javax.net.ssl.SSLSocket;
import xsna.hsl;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes11.dex */
public final class pc2 implements hsl.a {
    @Override // xsna.hsl.a
    public final boolean a(SSLSocket sSLSocket) {
        return brm0.B(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // xsna.hsl.a
    public final iek0 b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(vr.b(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new qc2(cls2);
    }
}
