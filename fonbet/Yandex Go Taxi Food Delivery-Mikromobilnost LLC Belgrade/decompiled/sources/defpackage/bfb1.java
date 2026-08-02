package defpackage;

import android.widget.ListView;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public abstract class bfb1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1190685358);
        dmw0 dmw0Var = btsVar.a;
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 n = ljs0.n(an91.l(c530Var, 16.0f, 20.0f), 311.0f, 16.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530Var);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            com.yandex.go.design.compose.loading.b.a(n, null, false, null, null, null, false, btsVar, 6, 254);
            com.yandex.go.design.compose.loading.b.a(n, null, false, null, null, null, false, btsVar, 6, 254);
            com.yandex.go.design.compose.loading.b.a(n, null, false, null, null, null, false, btsVar, 6, 254);
            WeakHashMap weakHashMap = a.w;
            f530 n2 = an91.n(c530Var, 12.0f, 8.0f, 12.0f, w8a1.f(vuz.o(btsVar).e, btsVar).a() + 8.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, n2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object Q = btsVar.Q();
            int i2 = 12;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new bgc(i2);
                btsVar.o0(Q);
            }
            e4d.a.getClass();
            d17.c(x2yVar, false, null, null, null, (sls) Q, e4d.b, btsVar, 1769472, 30);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar2 = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new bgc(12);
                btsVar.o0(Q2);
            }
            d17.c(x2yVar2, false, null, null, null, (sls) Q2, e4d.c, btsVar, 1769472, 30);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, 8);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1962977343);
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            long K = uh6.K(str.length() > 2 ? 24.0f : 28.0f, 4294967296L);
            c530 c530Var = c530.a;
            f530 c = bzk0.c(hbb1.c(ljs0.m(c530Var, 64.0f), dbb1.b(btsVar), true, 50.0f, null, 8), AppColor$Palette.BgFloating, cyk0.a);
            z910 d = pi6.d(x4c.y, false);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            jeb1.f(str, c530Var, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0.a(xya1.e(btsVar).e.d, 0L, K, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i2 & 14) | 48, 0, 16252);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, 5);
        }
    }

    public static boolean c(ListView listView) {
        return listView.canScrollList(-1);
    }
}
