package defpackage;

import androidx.compose.material3.h;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class jzw0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final l1t0 f;

    static {
        float f2 = uzw0.c;
        a = f2;
        b = uzw0.i;
        c = uzw0.h;
        float f3 = uzw0.e;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new l1t0();
    }

    public static final void a(boolean z, tls tlsVar, f530 f530Var, wls wlsVar, boolean z2, syw0 syw0Var, zx40 zx40Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        zx40 zx40Var2;
        zx40 zx40Var3;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-263339167);
        if ((i & 6) == 0) {
            i2 = (btsVar2.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(wlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.a(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.k(syw0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.k(zx40Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (599187 & i3) != 599186)) {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            if (zx40Var == null) {
                btsVar2.e0(1768510810);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = ly3.i(btsVar2);
                }
                zx40Var2 = (zx40) Q;
                btsVar2.t(false);
            } else {
                btsVar2.e0(334142749);
                btsVar2.t(false);
                zx40Var2 = zx40Var;
            }
            if (tlsVar != null) {
                bqu bquVar = h.a;
                zx40Var3 = zx40Var2;
                f530Var2 = r5a1.u(mi20.a, z, zx40Var3, null, z2, new awk0(2), tlsVar);
            } else {
                zx40Var3 = zx40Var2;
                f530Var2 = c530.a;
            }
            int i4 = i3 << 3;
            int i5 = i3 >> 6;
            btsVar = btsVar2;
            b(ljs0.j(ljs0.v(f530Var.k(f530Var2), x4c.y, 2), c, d), z, z2, syw0Var, wlsVar, zx40Var3, zir0.b(uzw0.a, btsVar2), btsVar, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i4 & HProv.ALG_CLASS_ALL));
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vx20(z, tlsVar, f530Var, wlsVar, z2, syw0Var, zx40Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0131, code lost:
    
        if (defpackage.jl40.l(r0.Q(), java.lang.Integer.valueOf(r9)) == false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, boolean z, boolean z2, syw0 syw0Var, wls wlsVar, h8w h8wVar, ehr0 ehr0Var, fid fidVar, int i) {
        int i2;
        dmw0 dmw0Var;
        long j;
        int i3;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-670917213);
        dmw0 dmw0Var2 = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(syw0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(wlsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(h8wVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.k(ehr0Var) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            long j2 = z2 ? z ? syw0Var.b : syw0Var.f : z ? syw0Var.j : syw0Var.n;
            long j3 = z2 ? z ? syw0Var.a : syw0Var.e : z ? syw0Var.i : syw0Var.m;
            ehr0 b2 = zir0.b(uzw0.g, btsVar);
            float f2 = uzw0.f;
            if (z2) {
                dmw0Var = dmw0Var2;
                j = z ? syw0Var.c : syw0Var.g;
            } else {
                dmw0Var = dmw0Var2;
                j = z ? syw0Var.k : syw0Var.o;
            }
            f530 b3 = m4m0.b(aab1.a(f2, j, f530Var, b2), j2, b2);
            z910 d2 = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b3);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, d2);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar.S) {
                i3 = i2;
            } else {
                i3 = i2;
            }
            b64.z(S, btsVar, S, wlsVar4);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d3);
            f530 b4 = m4m0.b(lrv.a(cj6.a.a(c530.a, x4c.x).k(new k0z0(h8wVar, z, hob1.e(MotionSchemeKeyTokens.FastSpatial, btsVar))), h8wVar, esk0.a(4, uzw0.d / 2.0f, false)), j3, ehr0Var);
            z910 d4 = pi6.d(x4c.y, false);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d5 = b.d(btsVar, b4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, d4);
            qje.W(btsVar, wlsVar3, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d5);
            if (wlsVar != null) {
                btsVar.e0(1235836927);
                sb2.b(bfe.a.a(new ldc(z2 ? z ? syw0Var.d : syw0Var.h : z ? syw0Var.l : syw0Var.p)), wlsVar, btsVar, ((i3 >> 9) & 112) | 8);
                z3 = false;
            } else {
                z3 = false;
                btsVar.e0(1228606611);
            }
            btsVar.t(z3);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vx20(f530Var, z, z2, syw0Var, wlsVar, h8wVar, ehr0Var, i);
        }
    }
}
