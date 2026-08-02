package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class dd01 {
    public static final byk0 a = cyk0.c(20.0f);

    public static final void a(ed01 ed01Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(304491333);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i & 6;
        c530 c530Var = c530.a;
        if (i3 == 0) {
            i2 = (btsVar.k(c530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ed01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 l = ymb1.l(c530Var, a);
            ed01Var.getClass();
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new i5y0(20, tlsVar, ed01Var);
                btsVar.o0(Q);
            }
            f530 c = bzk0.c(q791.b(l, null, null, false, null, new awk0(0), (sls) Q, 8), AppColor$Palette.BgMinor, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            ydb1.a(null, null, wwg.S(912258450, true, new jvx0(15, ed01Var), btsVar), null, wwg.S(401326412, true, new ays0(15, ed01Var, tlsVar), btsVar), null, SlotSize.M, false, btsVar, 1597824, HProv.PP_REFCOUNT);
            btsVar.e0(-118074899);
            btsVar.t(false);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(ed01Var, tlsVar, i);
        }
    }
}
