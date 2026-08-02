package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.adapter.RecyclerViewState;

/* compiled from: ModalController.kt */
/* loaded from: classes17.dex */
public final class cz20 extends RecyclerView.t {
    public final /* synthetic */ com.vk.core.ui.bottomsheet.internal.e b;

    public cz20(com.vk.core.ui.bottomsheet.internal.e eVar) {
        this.b = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.b.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        com.vk.core.ui.bottomsheet.internal.e eVar = this.b;
        RecyclerView recyclerView2 = eVar.r;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        boolean canScrollVertically = recyclerView2.canScrollVertically(-1);
        RecyclerView recyclerView3 = eVar.r;
        boolean canScrollVertically2 = (recyclerView3 != null ? recyclerView3 : null).canScrollVertically(1);
        izs<? super RecyclerViewState, s3q0> izsVar = eVar.Y0;
        if (izsVar != null) {
            izsVar.invoke((canScrollVertically && canScrollVertically2) ? RecyclerViewState.CAN_SCROLL_BOTH : canScrollVertically2 ? RecyclerViewState.CAN_SCROLL_BOTTOM : canScrollVertically ? RecyclerViewState.CAN_SCROLL_TOP : RecyclerViewState.CANT_SCROLL);
        }
        super.onScrolled(recyclerView, i, i2);
    }
}
