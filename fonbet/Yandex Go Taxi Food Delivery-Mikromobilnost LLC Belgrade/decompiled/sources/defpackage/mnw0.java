package defpackage;

import androidx.compose.material3.h;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;

/* loaded from: classes10.dex */
public abstract class mnw0 {
    public static final qwd a = new qwd(new bhw0(4));

    public static final void a(f530 f530Var, ehr0 ehr0Var, final long j, long j2, float f, float f2, final a aVar, fid fidVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f530Var = c530.a;
        }
        if ((i2 & 2) != 0) {
            ehr0Var = qke.q;
        }
        if ((i2 & 8) != 0) {
            j2 = dgc.b(j, fidVar);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        bts btsVar = (bts) fidVar;
        qwd qwdVar = a;
        final float f3 = f + ((y7m) btsVar.m(qwdVar)).a;
        final ehr0 ehr0Var2 = ehr0Var;
        final float f4 = f2;
        final xa6 xa6Var = null;
        final f530 f530Var2 = f530Var;
        sb2.c(new vvf0[]{bfe.a.a(new ldc(j2)), qwdVar.a(new y7m(f3))}, wwg.S(421772006, true, new wls() { // from class: hnw0
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                fid fidVar2 = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V = btsVar2.V(intValue & 1, (intValue & 3) != 2);
                zy11 zy11Var = zy11.a;
                if (!V) {
                    btsVar2.Y();
                    return zy11Var;
                }
                f530 c = mnw0.c(f530.this, ehr0Var2, mnw0.d(j, f3, btsVar2), xa6Var, ((fwi) btsVar2.m(j.h)).w0(f4));
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = new oxv0(11);
                    btsVar2.o0(Q);
                }
                f530 b = fnq0.b(c, false, (tls) Q);
                Object Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                    Q2 = a12.m;
                    btsVar2.o0(Q2);
                }
                f530 a2 = exw0.a(b, zy11Var, (PointerInputEventHandler) Q2);
                z910 d = pi6.d(x4c.b, true);
                int S = cma1.S(btsVar2);
                r1b0 o = btsVar2.o();
                f530 d2 = b.d(btsVar2, a2);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar2.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, d.f, d);
                qje.W(btsVar2, d.e, o);
                wls wlsVar = d.g;
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar2, S, wlsVar);
                }
                qje.W(btsVar2, d.d, d2);
                nnm.p(0, aVar, btsVar2, true);
                return zy11Var;
            }
        }, btsVar), btsVar, 56);
    }

    public static final void b(final sls slsVar, final f530 f530Var, boolean z, final ehr0 ehr0Var, final long j, long j2, float f, final float f2, zx40 zx40Var, final a aVar, fid fidVar, int i, int i2) {
        final zx40 zx40Var2;
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        bts btsVar = (bts) fidVar;
        if (zx40Var == null) {
            btsVar.e0(-1701074900);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar);
            }
            btsVar.t(false);
            zx40Var2 = (zx40) Q;
        } else {
            btsVar.e0(2023335947);
            btsVar.t(false);
            zx40Var2 = zx40Var;
        }
        bts btsVar2 = (bts) fidVar;
        qwd qwdVar = a;
        final float f4 = ((y7m) btsVar2.m(qwdVar)).a + f3;
        final xa6 xa6Var = null;
        sb2.c(new vvf0[]{bfe.a.a(new ldc(j2)), qwdVar.a(new y7m(f4))}, wwg.S(849208527, true, new wls() { // from class: jnw0
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                fid fidVar2 = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    bqu bquVar = h.a;
                    f530 k = q791.b(mnw0.c(f530.this.k(mi20.a), ehr0Var, mnw0.d(j, f4, btsVar3), xa6Var, ((fwi) btsVar3.m(j.h)).w0(f2)), zx40Var2, esk0.a(7, 0.0f, false), z2, null, null, slsVar, 24).k(new upb(new teb(20)));
                    z910 d = pi6.d(x4c.b, true);
                    int S = cma1.S(btsVar3);
                    r1b0 o = btsVar3.o();
                    f530 d2 = b.d(btsVar3, k);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, d);
                    qje.W(btsVar3, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar3, S, wlsVar);
                    }
                    qje.W(btsVar3, d.d, d2);
                    nnm.p(0, aVar, btsVar3, true);
                } else {
                    btsVar3.Y();
                }
                return zy11.a;
            }
        }, btsVar2), btsVar2, 56);
    }

    public static final f530 c(f530 f530Var, ehr0 ehr0Var, long j, xa6 xa6Var, float f) {
        ehr0 ehr0Var2;
        f530 f530Var2;
        f530 f530Var3 = c530.a;
        if (f > 0.0f) {
            ehr0Var2 = ehr0Var;
            f530Var2 = androidx.compose.ui.graphics.d.b(0.0f, 0.0f, 0.0f, f, ehr0Var2, 124895);
        } else {
            ehr0Var2 = ehr0Var;
            f530Var2 = f530Var3;
        }
        f530 k = f530Var.k(f530Var2);
        if (xa6Var != null) {
            f530Var3 = aab1.b(f530Var3, xa6Var.a, xa6Var.b, ehr0Var2);
        }
        return ymb1.l(m4m0.b(k.k(f530Var3), j, ehr0Var2), ehr0Var2);
    }

    public static final long d(long j, float f, bts btsVar) {
        agc agcVar = (agc) btsVar.m(dgc.a);
        boolean booleanValue = ((Boolean) btsVar.m(dgc.b)).booleanValue();
        long j2 = agcVar.p;
        if (!ldc.c(j, j2) || !booleanValue) {
            return j;
        }
        if (y7m.b(f, 0.0f)) {
            return j2;
        }
        return rzo.k(ldc.b(agcVar.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j2);
    }
}
