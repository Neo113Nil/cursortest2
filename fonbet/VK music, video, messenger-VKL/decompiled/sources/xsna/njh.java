package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.design.view.tile.MarketProductTileView;

/* compiled from: CommunityProfileContentMarketAdapter.kt */
/* loaded from: classes5.dex */
public final class njh extends RecyclerView.n {
    public final /* synthetic */ ljh b;

    public njh(ljh ljhVar) {
        this.b = ljhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int K0 = ljh.K0(this.b, recyclerView.getChildLayoutPosition(view));
        if (view instanceof MarketProductTileView) {
            int i = K0 % 2;
            rect.left = i == 0 ? iah0.a(10) : 0;
            rect.right = i != 0 ? iah0.a(10) : 0;
            rect.bottom = iah0.a(6);
        }
    }
}
