package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.interests.impl.ui.recycler.ClipsInterestsRecyclerView;

/* compiled from: ScrollEnabledController.kt */
/* loaded from: classes16.dex */
public final class cfh0 extends wtt0<ClipsInterestsViewState.d> {
    public final RecyclerView d;

    public cfh0(ClipsInterestsRecyclerView clipsInterestsRecyclerView, pkn0 pkn0Var) {
        super(pkn0Var);
        this.d = clipsInterestsRecyclerView;
    }

    @Override // xsna.wtt0
    public final void a(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        RecyclerView recyclerView = this.d;
        if (recyclerView.isNestedScrollingEnabled()) {
            recyclerView.setNestedScrollingEnabled(false);
            this.a.execute(new xqc(this, 10));
        }
    }

    @Override // xsna.wtt0
    public final /* bridge */ /* synthetic */ boolean b(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        return true;
    }
}
