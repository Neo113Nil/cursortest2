package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class l070 extends RecyclerView.g {
    public final htk a;

    public l070(htk htkVar) {
        this.a = htkVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        sx31.a(recyclerView, this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        sx31.a(recyclerView, this.a);
    }
}
