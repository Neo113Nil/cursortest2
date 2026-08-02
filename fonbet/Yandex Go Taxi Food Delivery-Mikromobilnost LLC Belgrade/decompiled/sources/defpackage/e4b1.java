package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes6.dex */
public abstract class e4b1 {
    public static final void a(e611 e611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(92380731);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.e(e611Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            c530 c530Var = c530.a;
            oeb1.c(btsVar2, ljs0.q(c530Var, 56.0f));
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d2 = b.d(btsVar2, c530Var);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o3);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar4, d2);
            qgy.b(e611Var.a, null, ljs0.c(c530Var, 1.0f), null, uh6.E(13), 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).i.b, null, btsVar2, 24960, 0, 12266);
            f530 o4 = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 2.0f, 16.0f, 2.0f, 1);
            qgy.b(e611Var.b, null, o4, AppColor$Palette.TextMinor, uh6.E(13), 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).i.a, null, btsVar2, 27648, 0, 12258);
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(e611Var, f530Var, i, 26);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2095054092);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(f530Var, (tls) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new bgc(12);
                btsVar.o0(Q3);
            }
            pi6.a(q791.b(a, zx40Var, null, false, null, null, (sls) Q3, 28), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 21);
        }
    }

    public static final EvolveState c(zuo0 zuo0Var) {
        if ((zuo0Var instanceof lrj0) || (zuo0Var instanceof ea90) || (zuo0Var instanceof se90)) {
            return EvolveState.RIDING;
        }
        if (zuo0Var instanceof nrk0) {
            return EvolveState.PARKING;
        }
        w511.b();
        return null;
    }
}
