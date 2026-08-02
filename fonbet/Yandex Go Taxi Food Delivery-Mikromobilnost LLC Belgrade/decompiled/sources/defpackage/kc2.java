package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes9.dex */
public class kc2 implements l5t0 {
    public static final seu e = new seu(16);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public kc2(Class cls) {
        this.a = cls;
        this.b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.l5t0
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.l5t0
    public final String b(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, uza.a);
                }
            } catch (IllegalAccessException e2) {
                ny61.f(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !jl40.l(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    ny61.f(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.l5t0
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                d72 d72Var = dvc0.a;
                method.invoke(sSLSocket, rms.i(list));
            } catch (IllegalAccessException e2) {
                ny61.f(e2);
            } catch (InvocationTargetException e3) {
                ny61.f(e3);
            }
        }
    }

    @Override // defpackage.l5t0
    public final boolean isSupported() {
        int i = pb2.d;
        kva1.e();
        return false;
    }
}
