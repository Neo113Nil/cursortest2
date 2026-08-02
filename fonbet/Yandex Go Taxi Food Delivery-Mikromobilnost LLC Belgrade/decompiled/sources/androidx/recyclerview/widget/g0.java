package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class g0 implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public g0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.mIsAttached) {
            recyclerView.requestLayout();
        } else if (recyclerView.mLayoutSuppressed) {
            recyclerView.mLayoutWasDefered = true;
        } else {
            recyclerView.consumePendingUpdateOperations();
        }
    }
}
