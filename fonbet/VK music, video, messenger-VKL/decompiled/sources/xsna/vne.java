package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsOverscrollEdgeEffectFactory.kt */
/* loaded from: classes4.dex */
public final class vne extends RecyclerView.t {
    public final /* synthetic */ une b;

    public vne(une uneVar) {
        this.b = uneVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        une uneVar = this.b;
        uneVar.e += i;
        une.b(uneVar);
    }
}
