package defpackage;

import com.yandex.go.preorder.navigation.n;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.communications.model.widgets.d;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.summary.deeplink.a;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.summary.promotions.analytics.c;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class mnv0 {
    public final oep0 a;
    public final smv0 b;
    public final yvf0 c;
    public final psf0 d;
    public final jas0 e;
    public final c f;
    public final cyx g;
    public final h3y h;
    public final m2v i;
    public final ykz0 j;
    public final wiq0 k;
    public final mj21 l;
    public final h3y m;
    public final qdq0 n;
    public final oe3 o;

    public mnv0(oep0 oep0Var, smv0 smv0Var, yvf0 yvf0Var, psf0 psf0Var, jas0 jas0Var, c cVar, cyx cyxVar, h3y h3yVar, m2v m2vVar, ykz0 ykz0Var, wiq0 wiq0Var, mj21 mj21Var, h3y h3yVar2, qdq0 qdq0Var, oe3 oe3Var) {
        this.a = oep0Var;
        this.b = smv0Var;
        this.c = yvf0Var;
        this.d = psf0Var;
        this.e = jas0Var;
        this.f = cVar;
        this.g = cyxVar;
        this.h = h3yVar;
        this.i = m2vVar;
        this.j = ykz0Var;
        this.k = wiq0Var;
        this.l = mj21Var;
        this.m = h3yVar2;
        this.n = qdq0Var;
        this.o = oe3Var;
    }

    public final String a() {
        is60 is60Var;
        pex0 m = ((k) this.k).m();
        if (m == null || (is60Var = m.J0.b) == null) {
            return null;
        }
        return is60Var.a();
    }

    public final void b(zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, ActionButton actionButton) {
        this.b.b(zkv0Var, summaryPromotionsAnalytics$SummaryState, null, a());
        this.e.c(zkv0Var.a);
        b bVar = actionButton.e;
        if (bVar instanceof ActionButton.a) {
            this.l.a.l(((ActionButton.a) bVar).a);
            return;
        }
        if (bVar instanceof ActionButton.l) {
            ActionButton.l lVar = (ActionButton.l) bVar;
            qdq0 qdq0Var = this.n;
            qdq0Var.getClass();
            b4a0 b4a0Var = PaymentMethod$Type.Companion;
            String str = lVar.a;
            b4a0Var.getClass();
            e4a0 a = b4a0.a(str);
            if (a == null) {
                a = e4a0.R3;
            }
            kv90 kv90Var = lv90.Companion;
            String str2 = lVar.b;
            kv90Var.getClass();
            lv90 a2 = kv90.a(a, str2, null);
            if (qdq0Var.b.b(a2)) {
                qdq0Var.a.a();
                return;
            } else {
                qdq0Var.c.b(a2);
                return;
            }
        }
        if (bVar instanceof d) {
            kcv0 kcv0Var = (kcv0) this.m.get();
            ((pep0) kcv0Var.d).f(new y4c0((com.yandex.go.promocodes.d) kcv0Var.c.get(), kcv0Var.d, kcv0Var.a, new but0(5, kcv0Var), 15), new qrf0(lrf0.a), hxx.a);
            return;
        }
        boolean z = bVar instanceof ActionButton.d;
        v770 v770Var = v770.b;
        h3y h3yVar = this.h;
        if (z) {
            a aVar = (a) h3yVar.get();
            String str3 = ((ActionButton.d) bVar).a;
            aVar.getClass();
            aVar.a(str3, v770Var, SelectionOrigin.DEEPLINK);
            return;
        }
        a aVar2 = (a) h3yVar.get();
        String str4 = actionButton.a;
        aVar2.getClass();
        aVar2.a(str4, v770Var, SelectionOrigin.DEEPLINK);
    }

    public final void c(zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState) {
        Iterator it;
        this.b.b(zkv0Var, summaryPromotionsAnalytics$SummaryState, null, a());
        String str = zkv0Var.a;
        z051 z051Var = zkv0Var.f;
        boolean z = z051Var instanceof l051;
        jas0 jas0Var = this.e;
        if (!z) {
            boolean z2 = z051Var instanceof p051;
            v770 v770Var = v770.b;
            h3y h3yVar = this.h;
            if (z2) {
                String str2 = ((p051) z051Var).a.c;
                if (str2.length() > 0) {
                    jas0Var.c(str);
                    ((a) h3yVar.get()).a(str2, v770Var, SelectionOrigin.PROMOTION);
                    return;
                }
                return;
            }
            boolean z3 = z051Var instanceof r051;
            oep0 oep0Var = this.a;
            if (z3) {
                if (((r051) z051Var).a.c != null) {
                    new lnv0(0, this);
                    this.d.getClass();
                    jas0Var.c(str);
                    ((pep0) oep0Var).f((m950) this.c.get(), pdm.a, hxx.a);
                    return;
                }
                return;
            }
            if (z051Var instanceof o051) {
                String str3 = ((o051) z051Var).a.a;
                a aVar = (a) h3yVar.get();
                aVar.getClass();
                aVar.a(str3, v770Var, SelectionOrigin.DEEPLINK);
                return;
            }
            if (!(z051Var instanceof u051)) {
                if ((z051Var instanceof m051) || (z051Var instanceof v051) || z051Var.equals(s051.a)) {
                    g8e.A(jst.e, "Can't handle promotion");
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            t76 t76Var = zkv0Var.i;
            if (t76Var != null) {
                jas0Var.c(str);
                ((pep0) oep0Var).f((m950) this.o.get(), new v330(t76Var.a), hxx.a);
                return;
            } else {
                if (t76Var == null) {
                    return;
                }
                w511.b();
                return;
            }
        }
        List list = ((l051) z051Var).a.c;
        if (list.isEmpty()) {
            return;
        }
        jas0Var.c(str);
        String str4 = zkv0Var.a;
        m2v m2vVar = this.i;
        m2vVar.getClass();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            baq0 baq0Var = (baq0) it2.next();
            int i = m00.a[baq0Var.a.ordinal()];
            if (i == 1) {
                it = it2;
                vu1 vu1Var = baq0Var.b;
                pex0 m = ((k) ((wiq0) m2vVar.w)).m();
                if (m == null) {
                    g8e.A(jst.e, "Selected tariff not found");
                } else {
                    pex0 b = m.t0.b(vu1Var.a);
                    if (b == null) {
                        unr0.D(new Object[]{vu1Var.a}, 1, "Alternative tariff with offer: %s does not found", jst.e, new IllegalStateException());
                    } else {
                        ((c4r0) m2vVar.b).c(SelectionOrigin.USER, b, false);
                    }
                }
            } else if (i == 2) {
                it = it2;
                ((yfj0) m2vVar.c).a(baq0Var.c.toString(), "summary");
            } else if (i != 3) {
                if (i != 4) {
                    jst.e.getClass();
                }
                it = it2;
            } else {
                rft0 rft0Var = (rft0) m2vVar.a;
                String str5 = baq0Var.d;
                String str6 = baq0Var.e;
                List<z3b0> list2 = baq0Var.f;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (z3b0 z3b0Var : list2) {
                    arrayList.add(new g4b0(z3b0Var.d, z3b0Var.e, z3b0Var.a, z3b0Var.b, z3b0Var.c, z3b0Var.f, z3b0Var.g, z3b0Var.h, z3b0Var.i, z3b0Var.j));
                    it2 = it2;
                }
                it = it2;
                h4b0 h4b0Var = new h4b0(str4, "summary", str5, str6, baq0Var.g, baq0Var.h, arrayList);
                n nVar = ((qht0) rft0Var).b;
                nVar.A((m950) nVar.k0.get(), h4b0Var, sy60.Q2);
            }
            it2 = it;
        }
    }

    public final void d(zkv0 zkv0Var, u051 u051Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, boolean z) {
        mi31 mi31Var;
        mi31 a;
        this.b.b(zkv0Var, summaryPromotionsAnalytics$SummaryState, Boolean.valueOf(z), a());
        ykz0 ykz0Var = this.j;
        wiq0 wiq0Var = ykz0Var.b;
        akz0 akz0Var = u051Var.a;
        gkz0 gkz0Var = z ? akz0Var.b : akz0Var.c;
        k kVar = (k) wiq0Var;
        fnx0 n = kVar.n();
        if (n == null || (mi31Var = n.a) == null) {
            return;
        }
        mi31 mi31Var2 = mi31Var;
        for (ckz0 ckz0Var : gkz0Var.a) {
            if (ckz0Var instanceof gt60) {
                pex0 e = ru.yandex.taxi.tariffs.model.b.e(mi31Var2.a, ((gt60) ckz0Var).b);
                a = e != null ? mi31.a(mi31Var2, e, null, 30) : null;
                if (a != null) {
                    ykz0Var.e.a(a.a.J0.b.a());
                    mi31Var2 = a;
                } else {
                    g8e.A(jst.e, "Promo block toggle action change offer is unavailable");
                }
            } else if (ckz0Var instanceof slx0) {
                a = b8r.d(ykz0Var.c, ((slx0) ckz0Var).a, kVar.h(), 4);
                if (a != null) {
                    mi31Var2 = a;
                } else {
                    g8e.A(jst.e, "Promo block toggle action change tariff is unavailable");
                }
            } else if (ckz0Var instanceof x1s) {
                y1s y1sVar = ykz0Var.d;
                boolean z2 = ((x1s) ckz0Var).a;
                y1sVar.b(z2);
                if (z2) {
                    ykz0Var.f.a(msb1.F);
                }
            } else {
                if (!(ckz0Var instanceof x8j0) && !jl40.l(ckz0Var, j121.INSTANCE)) {
                    w511.b();
                    return;
                }
                jst.e.getClass();
            }
        }
        if (mi31Var2 != mi31Var) {
            ykz0Var.a.a(new gnx0(new fnx0(mi31Var2, SelectionOrigin.REDIRECT), true));
        }
    }
}
