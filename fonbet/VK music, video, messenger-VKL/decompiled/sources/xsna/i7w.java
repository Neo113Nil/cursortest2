package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ImItemListStoriesHelper.kt */
/* loaded from: classes2.dex */
public final class i7w extends RecyclerView.t {
    public final /* synthetic */ j7w b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ o5w d;

    public i7w(j7w j7wVar, RecyclerView recyclerView, o5w o5wVar) {
        this.b = j7wVar;
        this.c = recyclerView;
        this.d = o5wVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.b.a(this.c, this.d.h.f);
        }
    }
}
