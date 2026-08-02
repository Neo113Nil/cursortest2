package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.fave.fragments.FavesTabSearchFragment;

/* compiled from: FaveInputAdapter.kt */
/* loaded from: classes18.dex */
public final class lqq extends zoj0<g990, h990> implements mf7 {
    public final FavesTabSearchFragment.c e;

    public lqq(FavesTabSearchFragment.c cVar) {
        this.e = cVar;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((h990) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new h990(viewGroup, this.e);
        }
        throw new IllegalStateException();
    }
}
