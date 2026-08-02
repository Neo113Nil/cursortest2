package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;

/* loaded from: classes14.dex */
public final class n1y0 extends RecyclerView.g {
    public final /* synthetic */ TaxiOrderFlexView a;

    public n1y0(TaxiOrderFlexView taxiOrderFlexView) {
        this.a = taxiOrderFlexView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        TaxiOrderFlexView taxiOrderFlexView = this.a;
        i3 = taxiOrderFlexView.recyclerScrollDY;
        taxiOrderFlexView.recyclerScrollDY = i3 + i2;
        taxiOrderFlexView.feedIsScrolled = recyclerView.canScrollVertically(-1);
    }
}
