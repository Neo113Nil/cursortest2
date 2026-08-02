package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DzenArticlesCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class jto extends RecyclerView.t {
    public final /* synthetic */ lto b;

    public jto(lto ltoVar) {
        this.b = ltoVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            lto.b7(this.b);
        }
    }
}
