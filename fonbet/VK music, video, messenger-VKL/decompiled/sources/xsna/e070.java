package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedStoriesBlockPlugin.kt */
/* loaded from: classes4.dex */
public final class e070 extends RecyclerView.t {
    public final /* synthetic */ d070 b;

    public e070(d070 d070Var) {
        this.b = d070Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        xif0 xif0Var = this.b.w;
        if (xif0Var != null) {
            xif0Var.a();
        }
    }
}
