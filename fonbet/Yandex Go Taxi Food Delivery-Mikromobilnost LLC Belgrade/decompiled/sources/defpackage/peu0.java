package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import just.adapter.sticky.a;

/* loaded from: classes9.dex */
public final class peu0 extends RecyclerView.g {
    public final /* synthetic */ a a;

    public peu0(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (!layoutManager.I()) {
            i = i2;
        }
        this.a.c(tje.f0(i), i);
    }
}
