package xsna;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ChatView.java */
/* loaded from: classes16.dex */
public final class mzb extends RecyclerView.t {
    public final /* synthetic */ nzb b;

    public mzb(nzb nzbVar) {
        this.b = nzbVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        nzb nzbVar = this.b;
        int w = nzbVar.e.w();
        int itemCount = nzbVar.b.getAdapter().getItemCount();
        if (i != 0) {
            nzbVar.j = true;
        } else if (w != itemCount - 1) {
            nzbVar.j = true;
        } else {
            nzbVar.setNewCommentsVisibility(false);
            nzbVar.j = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        nzb nzbVar = this.b;
        if (nzbVar.b.canScrollVertically(1)) {
            return;
        }
        nzbVar.setNewCommentsVisibility(false);
    }
}
