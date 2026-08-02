package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DzenArticlesCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class kto extends RecyclerView.i {
    public final /* synthetic */ lto a;

    public kto(lto ltoVar) {
        this.a = ltoVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        lto ltoVar = this.a;
        ltoVar.F.post(new qb3(ltoVar, 5));
    }
}
