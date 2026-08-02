package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: StoryCreateQuestionColorsAdapter.kt */
/* loaded from: classes16.dex */
public final class v0m0 extends zoj0<t0m0, u0m0> {
    public final fux<t0m0> e;

    public v0m0(z0m0 z0m0Var) {
        this.e = z0m0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((u0m0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new u0m0(viewGroup, this.e);
    }
}
