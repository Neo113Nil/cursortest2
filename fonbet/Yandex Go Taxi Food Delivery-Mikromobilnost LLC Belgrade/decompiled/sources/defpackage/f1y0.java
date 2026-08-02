package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedScrollUpButton;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;

/* loaded from: classes14.dex */
public final class f1y0 extends RecyclerView.g {
    public final /* synthetic */ TaxiOrderFeedView a;

    public f1y0(TaxiOrderFeedView taxiOrderFeedView) {
        this.a = taxiOrderFeedView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        TaxiOrderFeedScrollUpButton taxiOrderFeedScrollUpButton;
        taxiOrderFeedScrollUpButton = this.a.scrollUpButton;
        if (taxiOrderFeedScrollUpButton != null) {
            taxiOrderFeedScrollUpButton.setFeedIsScrolled(recyclerView.canScrollVertically(-1));
        }
    }
}
