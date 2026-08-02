package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.animation.m;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.utils.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class psm {
    public static final int a;

    static {
        qnm qnmVar = qnm.a;
        a = 70;
    }

    public static final void a(boolean z, sls slsVar, f530 f530Var, boolean z2, String str, fid fidVar, int i) {
        int i2;
        long T;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-199537477);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(str) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            btsVar.t(false);
            btsVar.e0(1013405805);
            qxi a2 = a.a(zx40Var, b(), b(), 0.9f, a, btsVar, 27654);
            int i3 = i2;
            btsVar = btsVar;
            btsVar.t(false);
            if (((r17) a2.getValue()).a) {
                btsVar.e0(1518025590);
                qnm qnmVar = qnm.a;
                T = qnm.c(btsVar).W();
                btsVar.t(false);
            } else if (z2) {
                btsVar.e0(1518031721);
                qnm qnmVar2 = qnm.a;
                T = qnm.c(btsVar).T();
                btsVar.t(false);
            } else {
                btsVar.e0(1518028147);
                qnm qnmVar3 = qnm.a;
                T = ldc.b(qnm.c(btsVar).V(), ldc.d(qnm.c(btsVar).V()) * 0.48f, 0.0f, 0.0f, 0.0f, 14);
                btsVar.t(false);
            }
            if (((r17) a2.getValue()).a) {
                btsVar.e0(1518034798);
                qnm qnmVar4 = qnm.a;
                j = qnm.b(btsVar).c;
                btsVar.t(false);
            } else if (z2) {
                btsVar.e0(1518038823);
                qnm qnmVar5 = qnm.a;
                j = qnm.b(btsVar).a;
                btsVar.t(false);
            } else {
                btsVar.e0(1518036951);
                qnm qnmVar6 = qnm.a;
                j = ldc.b(qnm.b(btsVar).a, 0.32f, 0.0f, 0.0f, 0.0f, 14);
                btsVar.t(false);
            }
            long j2 = j;
            if (!z) {
                j2 = ldc.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            }
            long j3 = T;
            m3u0 a3 = m.a(j2, b(), null, btsVar, 0, 12);
            qnm qnmVar7 = qnm.a;
            long j4 = qnm.b(btsVar).j;
            if (!z) {
                j4 = ldc.b(j4, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            }
            m3u0 a4 = m.a(j4, b(), null, btsVar, 0, 12);
            m3u0 b = b.b(z ? 1.0f : 0.0f, b(), null, null, btsVar, 0, 28);
            qnm.c.getClass();
            f530 m = ljs0.m(f530Var, 28.0f);
            float f = ((r17) a2.getValue()).b;
            f530 b2 = gza1.b(m, f, f);
            byk0 byk0Var = cyk0.a;
            f530 i4 = kx91.i(m4m0.b(b2, j3, byk0Var), z, zx40Var, null, z2, null, slsVar);
            btsVar.e0(-1633490746);
            boolean z3 = ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new lo1(str, z2, 6);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            f530 b3 = fnq0.b(i4, false, (tls) Q2);
            uo5 uo5Var = x4c.y;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b3);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            k3r k3rVar = ljs0.c;
            float floatValue = ((Number) b.getValue()).floatValue();
            f530 b4 = m4m0.b(gza1.b(k3rVar, floatValue, floatValue), ((ldc) a3.getValue()).a, byk0Var);
            z910 d3 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, b4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d4);
            pi6.a(m4m0.b(ljs0.m(c530.a, 8.0f), ((ldc) a4.getValue()).a, byk0Var), btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new osm(z, slsVar, f530Var, z2, str, i, 0);
        }
    }

    public static final ck11 b() {
        return sb2.K(a, 0, jsm.b, 2);
    }
}
