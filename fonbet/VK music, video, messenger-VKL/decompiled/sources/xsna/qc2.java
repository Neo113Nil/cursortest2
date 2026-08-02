package xsna;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import xsna.fb2;
import xsna.fta0;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes11.dex */
public class qc2 implements iek0 {
    public static final pc2 f = new pc2();
    public final Class<? super SSLSocket> a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public qc2(Class<? super SSLSocket> cls) {
        this.a = cls;
        this.b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // xsna.iek0
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // xsna.iek0
    public final void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                fta0 fta0Var = fta0.a;
                method.invoke(sSLSocket, fta0.a.b(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // xsna.iek0
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, emb.b);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !epx.f(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // xsna.iek0
    public final boolean isSupported() {
        boolean z = fb2.e;
        return fb2.a.b();
    }
}
