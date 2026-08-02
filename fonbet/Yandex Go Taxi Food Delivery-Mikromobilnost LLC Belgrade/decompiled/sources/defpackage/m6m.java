package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonView;

/* loaded from: classes6.dex */
public final class m6m extends ViewPager2.a {
    public final /* synthetic */ DoubleTariffRibbonView a;

    public m6m(DoubleTariffRibbonView doubleTariffRibbonView) {
        this.a = doubleTariffRibbonView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        boolean z;
        k6m k6mVar;
        sf31 sf31Var;
        int i2;
        boolean z2 = i != 0;
        DoubleTariffRibbonView doubleTariffRibbonView = this.a;
        doubleTariffRibbonView.isVerticalPageScrolling = z2;
        z = doubleTariffRibbonView.isVerticalPageScrolling;
        if (z) {
            return;
        }
        k6mVar = doubleTariffRibbonView.presenter;
        sf31Var = doubleTariffRibbonView.verticalPagerAdapter;
        i2 = doubleTariffRibbonView.targetSelectedPage;
        elx0 elx0Var = (elx0) a.S(i2, sf31Var.G);
        Object obj = null;
        String str = elx0Var != null ? elx0Var.a : null;
        if (str == null) {
            k6mVar.getClass();
            jst.e.c("Scrolling finished without verticals");
        } else {
            boolean z3 = k6mVar.P;
            if (k6mVar.Eg()) {
                fnx0 n = ((k) k6mVar.x).n();
                if (!jl40.l(n != null ? n.d : null, str)) {
                    Iterator it = ((k) k6mVar.y).j().a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((za31) next).d, str)) {
                            obj = next;
                            break;
                        }
                    }
                    za31 za31Var = (za31) obj;
                    if (za31Var == null) {
                        jst.e.k(new IllegalStateException(), "Try to select unknown vertical: ".concat(str));
                        k6mVar.P = false;
                    } else {
                        mi31 mi31Var = za31Var.c;
                        if (mi31Var != null) {
                            k6mVar.E.Xf(mi31Var.a.J0, mi31Var.b, false);
                        }
                        oa31 oa31Var = za31Var.a;
                        if ((oa31Var.d() || oa31Var.c() || oa31Var.b()) && mi31Var == null) {
                            g8e.A(jst.e, "Try to select vertical without selected tariff");
                            k6mVar.P = false;
                        } else {
                            if (!k6mVar.P) {
                                k6mVar.Kg(str, VerticalSelectorAnalytics$SelectionChangeReason.Swipe);
                            }
                            k6mVar.P = false;
                        }
                    }
                }
            } else {
                g8e.A(jst.e, "Try to change vertical if view detached");
            }
            if (!z3) {
                k6mVar.K.a(HubOpenReason.SWIPE);
                k6mVar.F.a(str);
            }
            k6mVar.z.h = true;
        }
        doubleTariffRibbonView.refreshBubbleState();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        kk31 kk31Var;
        kk31Var = this.a.verticalsView;
        kk31Var.updateHeaderState(i, f);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        boolean z;
        int i2;
        int i3;
        DoubleTariffRibbonView doubleTariffRibbonView = this.a;
        z = doubleTariffRibbonView.isVerticalPageScrolling;
        if (z) {
            doubleTariffRibbonView.targetSelectedPage = i;
            return;
        }
        i2 = doubleTariffRibbonView.targetSelectedPage;
        if (i2 != i) {
            i3 = doubleTariffRibbonView.targetSelectedPage;
            doubleTariffRibbonView.updateCurrentPage(i3, false);
        }
    }
}
