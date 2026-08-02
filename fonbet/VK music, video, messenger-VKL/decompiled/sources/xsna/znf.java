package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public final class znf extends RecyclerView.t {
    public final /* synthetic */ aof b;

    public znf(aof aofVar) {
        this.b = aofVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.b.a();
    }
}
