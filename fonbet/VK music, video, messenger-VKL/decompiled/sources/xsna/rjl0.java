package xsna;

import com.vk.api.generated.market.dto.MarketCatalogFilterDto;
import com.vk.api.generated.market.dto.MarketCatalogSortingDto;
import com.vk.dto.common.GoodAlbum;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dpl0;
import xsna.hjl0;
import xsna.oml0;
import xsna.xll0;

/* compiled from: StorefrontActor.kt */
/* loaded from: classes18.dex */
public final class rjl0 extends al50<apl0, hjl0, on50, dpl0, oml0, xll0> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        mpl0 mpl0Var;
        String str;
        List<GoodAlbum> list;
        GoodAlbum goodAlbum;
        ja9 ja9Var;
        List<b5u> list2;
        hjl0 hjl0Var = (hjl0) lj50Var;
        if (hjl0Var instanceof hjl0.g) {
            a(dpl0.c.b);
            return;
        }
        if (hjl0Var instanceof hjl0.b) {
            hjl0.b bVar = (hjl0.b) hjl0Var;
            if (bVar instanceof hjl0.b.a) {
                a(dpl0.g.b);
                return;
            } else {
                if (!(bVar instanceof hjl0.b.C3004b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a(new dpl0.a(((hjl0.b.C3004b) bVar).b));
                return;
            }
        }
        if (hjl0Var instanceof mjl0) {
            ay00 ay00Var = ((mjl0) hjl0Var).b;
            if (ay00Var instanceof gu00) {
                e(new oml0.q(((gu00) ay00Var).a, ProductTileCtaButtonType.GO_TO_CART));
                return;
            }
            if (ay00Var instanceof iu00) {
                e(new oml0.q(((iu00) ay00Var).a, ProductTileCtaButtonType.ADD_TO_CART));
                return;
            }
            if (ay00Var instanceof hu00) {
                hu00 hu00Var = (hu00) ay00Var;
                e(new oml0.q(hu00Var.a, hu00Var.b - hu00Var.c == 0 ? ProductTileCtaButtonType.ADD_TO_CART : ProductTileCtaButtonType.GO_TO_CART));
                return;
            } else {
                if (ay00Var instanceof ju00) {
                    e(new oml0.d(((ju00) ay00Var).a));
                    return;
                }
                if (ay00Var instanceof fu00) {
                    e(new oml0.d(((fu00) ay00Var).a));
                    return;
                } else {
                    if (ay00Var instanceof ku00) {
                        ku00 ku00Var = (ku00) ay00Var;
                        e(new oml0.e(ku00Var.b, ku00Var.a));
                        return;
                    }
                    return;
                }
            }
        }
        if (!(hjl0Var instanceof hjl0.a)) {
            if (hjl0Var instanceof hjl0.e) {
                a(dpl0.f.b);
                return;
            }
            if (hjl0Var instanceof hjl0.d) {
                a(dpl0.e.b);
                return;
            }
            if (hjl0Var instanceof hjl0.c) {
                hjl0.c cVar = (hjl0.c) hjl0Var;
                a(new dpl0.i(cVar.b, cVar.c));
                return;
            } else if (hjl0Var instanceof pjl0) {
                a(new dpl0.j(((pjl0) hjl0Var).b));
                return;
            } else {
                if (hjl0Var instanceof hjl0.f) {
                    e(oml0.g.a);
                    return;
                }
                return;
            }
        }
        hjl0.a aVar = (hjl0.a) hjl0Var;
        if (aVar instanceof hjl0.a.k) {
            c(new xll0.a.l(((hjl0.a.k) aVar).b));
            return;
        }
        if (aVar instanceof hjl0.a.g) {
            a(new dpl0.b(((hjl0.a.g) aVar).b));
            return;
        }
        boolean z = aVar instanceof hjl0.a.l;
        String str2 = null;
        r1 = null;
        Integer num = null;
        str2 = null;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            t8u t8uVar = ((apl0) sj50Var.getCurrentState()).f;
            if (t8uVar != null && (list2 = t8uVar.a) != null) {
                num = i7o0.g(list2, new qjl0(aVar, 0));
            }
            c(new xll0.a.c(((hjl0.a.l) aVar).b, num));
            return;
        }
        if (aVar instanceof hjl0.a.j) {
            igr igrVar = ((apl0) sj50Var.getCurrentState()).c;
            if (igrVar != null) {
                MarketCatalogFilterDto marketCatalogFilterDto = igrVar.a;
                igr igrVar2 = ((apl0) sj50Var.getCurrentState()).c;
                c(new xll0.a.k(marketCatalogFilterDto, igrVar2 != null ? igrVar2.c : null));
                return;
            }
            return;
        }
        if (aVar instanceof hjl0.a.f) {
            igr igrVar3 = ((apl0) sj50Var.getCurrentState()).c;
            if (igrVar3 != null) {
                MarketCatalogSortingDto marketCatalogSortingDto = igrVar3.b;
                igr igrVar4 = ((apl0) sj50Var.getCurrentState()).c;
                c(new xll0.a.j(marketCatalogSortingDto, igrVar4 != null ? igrVar4.c : null));
                return;
            }
            return;
        }
        if (aVar instanceof hjl0.a.b) {
            c(xll0.a.g.a);
            return;
        }
        if (aVar instanceof jjl0) {
            c(new xll0.a.b.C4018b(CommonMarketStat$TypeCtaButtonPositionType.DEFAULT));
            return;
        }
        if (aVar instanceof ijl0) {
            pju pjuVar = ((apl0) sj50Var.getCurrentState()).b;
            if (pjuVar == null || (ja9Var = pjuVar.l) == null) {
                return;
            }
            if (ja9Var.a == 2) {
                a(new dpl0.k(ja9Var, ((ijl0) aVar).b));
                return;
            } else {
                c(new xll0.a.b.C4017a(ja9Var, ((ijl0) aVar).b));
                return;
            }
        }
        if (aVar instanceof hjl0.a.m) {
            c(xll0.a.m.a);
            return;
        }
        if (aVar instanceof hjl0.a.n) {
            uvw uvwVar = ((apl0) sj50Var.getCurrentState()).g;
            c(new xll0.a.n(uvwVar != null ? uvwVar.c : null));
            return;
        }
        if (aVar instanceof hjl0.a.c) {
            c(xll0.a.C4016a.a);
            return;
        }
        if (aVar instanceof hjl0.a.d) {
            c(xll0.a.h.a);
            return;
        }
        if (aVar instanceof hjl0.a.e) {
            c(xll0.a.i.a);
            return;
        }
        if (aVar instanceof hjl0.a.C3003a) {
            hr1 hr1Var = ((apl0) sj50Var.getCurrentState()).d;
            if (hr1Var == null || (list = hr1Var.a) == null || (goodAlbum = (GoodAlbum) j5g.b0(((hjl0.a.C3003a) aVar).b, list)) == null) {
                return;
            }
            int i = goodAlbum.b;
            hr1 hr1Var2 = ((apl0) sj50Var.getCurrentState()).d;
            c(new xll0.a.f(i, hr1Var2 != null ? hr1Var2.b : false, goodAlbum.d));
            return;
        }
        if (aVar instanceof hjl0.a.i) {
            c(new xll0.a.e(((apl0) sj50Var.getCurrentState()).j));
            return;
        }
        if (aVar instanceof hjl0.a.h) {
            c(xll0.a.d.a);
            return;
        }
        if (aVar instanceof hjl0.a.o) {
            igr igrVar5 = ((apl0) sj50Var.getCurrentState()).c;
            Integer g = igrVar5 != null ? igrVar5.a.g() : null;
            igr igrVar6 = ((apl0) sj50Var.getCurrentState()).c;
            c(new xll0.a.p(g, igrVar6 != null ? igrVar6.c : null));
            return;
        }
        if (aVar instanceof hjl0.a.p) {
            c(xll0.a.q.a);
            return;
        }
        if (aVar instanceof kjl0) {
            c(new xll0.a.r(true));
            return;
        }
        if (aVar instanceof ljl0) {
            c(new xll0.a.r(false));
            return;
        }
        if (aVar instanceof hjl0.a.r) {
            c(new xll0.a.u(((hjl0.a.r) aVar).b));
            return;
        }
        if (aVar instanceof hjl0.a.q) {
            a(dpl0.h.b);
            return;
        }
        if (aVar instanceof hjl0.a.s) {
            pju pjuVar2 = ((apl0) sj50Var.getCurrentState()).b;
            if (pjuVar2 == null || (str = pjuVar2.m) == null) {
                return;
            }
            c(new xll0.a.o(str));
            return;
        }
        if (!(aVar instanceof hjl0.a.t)) {
            throw new NoWhenBranchMatchedException();
        }
        hr1 hr1Var3 = ((apl0) sj50Var.getCurrentState()).d;
        if (hr1Var3 != null && (mpl0Var = hr1Var3.d) != null) {
            str2 = mpl0Var.b;
        }
        c(new xll0.a.s(str2));
    }
}
