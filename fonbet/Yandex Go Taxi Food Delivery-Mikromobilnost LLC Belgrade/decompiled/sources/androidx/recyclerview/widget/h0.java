package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h0 implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public h0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        RecyclerView.c cVar = recyclerView.mItemAnimator;
        if (cVar != null) {
            cVar.n();
        }
        recyclerView.mPostedAnimatorRunner = false;
    }
}
