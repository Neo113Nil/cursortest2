package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardCouponView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerView;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class mhw extends y {
    public final pav a;
    public final k7x0 b;
    public final pdc c;
    public final xen w;

    public mhw(pav pavVar, k7x0 k7x0Var, pdc pdcVar, xen xenVar) {
        super(new thw());
        this.a = pavVar;
        this.b = k7x0Var;
        this.c = pdcVar;
        this.w = xenVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int i2 = lhw.a[((khw) getItem(i)).e.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        w511.b();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        if (x0Var instanceof vhw) {
            vhw vhwVar = (vhw) x0Var;
            khw khwVar = (khw) getItem(i);
            IntercityDashboardPromoBannerView intercityDashboardPromoBannerView = vhwVar.N;
            intercityDashboardPromoBannerView.setTitle(khwVar.b);
            intercityDashboardPromoBannerView.setSubtitle(khwVar.c);
            intercityDashboardPromoBannerView.setBackground(khwVar.f);
            intercityDashboardPromoBannerView.setIcon(khwVar.d);
            c.z(new t7j(22, vhwVar, khwVar.g, khwVar.h), intercityDashboardPromoBannerView);
            return;
        }
        if (x0Var instanceof xbw) {
            xbw xbwVar = (xbw) x0Var;
            khw khwVar2 = (khw) getItem(i);
            IntercityDashboardCouponView intercityDashboardCouponView = xbwVar.N;
            intercityDashboardCouponView.setTitle(khwVar2.b);
            intercityDashboardCouponView.setSubtitle(khwVar2.c);
            intercityDashboardCouponView.setBackground(khwVar2.f);
            intercityDashboardCouponView.setIcon(khwVar2.d);
            c.z(new t7j(21, xbwVar, khwVar2.g, khwVar2.h), intercityDashboardCouponView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        xen xenVar = this.w;
        pdc pdcVar = this.c;
        k7x0 k7x0Var = this.b;
        pav pavVar = this.a;
        if (i == 0) {
            return new vhw(new IntercityDashboardPromoBannerView(viewGroup.getContext(), pavVar, k7x0Var, pdcVar), xenVar);
        }
        if (i == 1) {
            return new xbw(new IntercityDashboardCouponView(viewGroup.getContext(), pavVar, k7x0Var, pdcVar), xenVar);
        }
        ny61.k();
        return null;
    }
}
