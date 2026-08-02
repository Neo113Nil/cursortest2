package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SelectedImagesPreviewView.kt */
/* loaded from: classes17.dex */
public final class vai0 extends RecyclerView.t {
    public final /* synthetic */ wai0 b;

    public vai0(wai0 wai0Var) {
        this.b = wai0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        wai0 wai0Var = this.b;
        int w = wai0Var.f.w();
        RecyclerView.Adapter adapter = wai0Var.b.getAdapter();
        awt0.v(wai0Var.c, w < (adapter != null ? adapter.getItemCount() : 0) - 1);
    }
}
