package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class jc31 extends RecyclerView.g {
    public final /* synthetic */ VerticalHubV1ModalView a;

    public jc31(VerticalHubV1ModalView verticalHubV1ModalView) {
        this.a = verticalHubV1ModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        bc31 bc31Var;
        bc31 bc31Var2;
        kk31 kk31Var;
        x0 findViewHolderForAdapterPosition;
        x0 findViewHolderForAdapterPosition2;
        if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)) == -1) {
            return;
        }
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.K1()) : null;
        VerticalHubV1ModalView verticalHubV1ModalView = this.a;
        bc31Var = verticalHubV1ModalView.hubItemsAdapter;
        f0v f0vVar = (f0v) a.R(adc.D(bc31Var.x.f, f0v.class));
        if (f0vVar == null) {
            return;
        }
        bc31Var2 = verticalHubV1ModalView.hubItemsAdapter;
        int indexOf = bc31Var2.x.f.indexOf(f0vVar);
        x0 findViewHolderForAdapterPosition3 = recyclerView.findViewHolderForAdapterPosition(indexOf);
        kk31Var = verticalHubV1ModalView.stickyVerticals;
        View asView = kk31Var.asView();
        if (findViewHolderForAdapterPosition3 != null) {
            float top = findViewHolderForAdapterPosition3.a.getTop();
            asView.setTranslationY(top >= 0.0f ? top : 0.0f);
            asView.setVisibility(0);
        } else {
            asView.setTranslationY(0.0f);
            asView.setVisibility((valueOf == null || valueOf.intValue() < indexOf) ? 8 : 0);
        }
        if (valueOf != null && valueOf.intValue() < indexOf && i2 > 0 && (findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(indexOf)) != null) {
            recyclerView.smoothScrollBy(0, findViewHolderForAdapterPosition2.a.getTop());
        }
        if (valueOf == null || valueOf.intValue() >= indexOf || i2 >= 0 || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(valueOf.intValue())) == null) {
            return;
        }
        recyclerView.smoothScrollBy(0, findViewHolderForAdapterPosition.a.getTop());
    }
}
