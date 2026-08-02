package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InterestingStoriesBlockLayout.kt */
/* loaded from: classes6.dex */
public final class mex extends RecyclerView.t {
    public final /* synthetic */ kex b;

    public mex(kex kexVar) {
        this.b = kexVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kex.a(this.b);
    }
}
