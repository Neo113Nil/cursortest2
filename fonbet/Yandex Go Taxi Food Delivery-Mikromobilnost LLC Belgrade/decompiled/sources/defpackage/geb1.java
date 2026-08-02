package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.animation.a;

/* loaded from: classes11.dex */
public abstract class geb1 {
    public static final void a(tys0 tys0Var, ldc ldcVar, boolean z, sls slsVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(730693857);
        int i2 = i | (btsVar.k(tys0Var) ? 4 : 2) | (btsVar.k(ldcVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ukr0(25);
                btsVar.o0(Q);
            }
            tls tlsVar2 = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ukr0(26);
                btsVar.o0(Q2);
            }
            a.b(tys0Var, null, tlsVar2, null, "SmartCameraScreenTransition", (tls) Q2, wwg.S(-786329391, true, new gv9(ldcVar, tlsVar, z, slsVar), btsVar), btsVar, (i2 & 14) | 1794432, 10);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(tys0Var, ldcVar, z, slsVar, tlsVar, i);
        }
    }

    public static zkj b() {
        if (zkj.b != null) {
            return zkj.b;
        }
        synchronized (zkj.class) {
            try {
                if (zkj.b == null) {
                    zkj.b = new zkj(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zkj.b;
    }

    public static iju c() {
        if (iju.c != null) {
            return iju.c;
        }
        synchronized (iju.class) {
            try {
                if (iju.c == null) {
                    iju.c = new iju();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iju.c;
    }

    public static myw d() {
        if (myw.c != null) {
            return myw.c;
        }
        synchronized (myw.class) {
            try {
                if (myw.c == null) {
                    myw.c = new myw();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return myw.c;
    }

    public static final boolean e(Exception exc) {
        String message = exc.getMessage();
        return message != null && cvu0.x(message, "InputStream exceeded maximum size", false);
    }

    public static k6u f() {
        if (jd00.a != null) {
            return jd00.a;
        }
        synchronized (jd00.class) {
            try {
                if (jd00.a == null) {
                    jd00.a = new k6u(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jd00.a;
    }
}
