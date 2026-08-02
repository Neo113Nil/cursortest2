package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class ey91 {
    public static final void a(u0s0 u0s0Var, f530 f530Var, a aVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bzr0 bzr0Var = u0s0Var.d;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-232317985);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u0s0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(aVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = u0s0Var.e != null;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object Q = btsVar.Q();
            int i4 = 28;
            if (z2 || Q == did.a) {
                Q = new a5p0(i4, tlsVar, u0s0Var);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 c = rx21.c(c530Var, z, (tls) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            s3b1.a(bzr0Var.b, ymb1.l(ljs0.c, cyk0.c(bzr0Var.c)), null, wwg.S(-629598812, true, new y740(i4, u0s0Var, aVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
            qj4 qj4Var = u0s0Var.f;
            if (qj4Var == null) {
                btsVar.e0(-1281616805);
                btsVar.t(false);
            } else {
                btsVar.e0(-1281616804);
                b(qj4Var, btsVar, 6);
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) u0s0Var, f530Var2, (Object) aVar, (Object) tlsVar, i, 10);
        }
    }

    public static final void b(qj4 qj4Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2046227393);
        int i2 = (btsVar.k(qj4Var) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            y3b1.c(qj4Var.a, sm91.e(cj6.a.a(c530.a, x4c.w), 4.0f, -4.0f), qj4Var.b, qj4Var.c, btsVar, 0, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e0s0(qj4Var, i);
        }
    }

    public static final void c(bj6 bj6Var, g0s0 g0s0Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(116981922);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(g0s0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = bj6Var.b(c530.a);
            z910 d = pi6.d(g0s0Var.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            aVar.invoke(g0s0Var.a, btsVar, Integer.valueOf((i2 >> 3) & 112));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(bj6Var, g0s0Var, aVar, i, 14);
        }
    }

    public static boolean d(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static xvm f(svm svmVar) {
        if (svmVar.c.length() == 0) {
            return xvm.g;
        }
        return new xvm(svmVar.a, svmVar.c, 0, svmVar.d, svmVar.b, svmVar.e, 4);
    }

    public static String g(long j) {
        return "PointerId(value=" + j + ')';
    }
}
