package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;

/* loaded from: classes14.dex */
public final class hy7 extends RecyclerView.g {
    public final /* synthetic */ CancelReasonsV2View a;

    public hy7(CancelReasonsV2View cancelReasonsV2View) {
        this.a = cancelReasonsV2View;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.updateBottomElevation();
    }
}
