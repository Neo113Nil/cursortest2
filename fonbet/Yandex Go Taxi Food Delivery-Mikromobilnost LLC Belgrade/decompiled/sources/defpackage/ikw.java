package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardSingleTariffContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffView;

/* loaded from: classes14.dex */
public final class ikw implements zo31 {
    public final FrameLayout a;
    public final IntercityDashboardTariffView b;
    public final RecyclerView c;
    public final IntercityDashboardTariffView d;
    public final IntercityDashboardSingleTariffContainerView e;
    public final LinearLayout f;

    public ikw(FrameLayout frameLayout, IntercityDashboardTariffView intercityDashboardTariffView, RecyclerView recyclerView, IntercityDashboardTariffView intercityDashboardTariffView2, IntercityDashboardSingleTariffContainerView intercityDashboardSingleTariffContainerView, LinearLayout linearLayout) {
        this.a = frameLayout;
        this.b = intercityDashboardTariffView;
        this.c = recyclerView;
        this.d = intercityDashboardTariffView2;
        this.e = intercityDashboardSingleTariffContainerView;
        this.f = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
