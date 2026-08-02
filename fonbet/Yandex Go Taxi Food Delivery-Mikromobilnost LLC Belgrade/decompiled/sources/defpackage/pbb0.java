package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;

/* loaded from: classes3.dex */
public final class pbb0 extends RecyclerView.g {
    public final /* synthetic */ PfmFragment a;

    public pbb0(PfmFragment pfmFragment) {
        this.a = pfmFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z;
        PfmFragment pfmFragment = this.a;
        z = pfmFragment.shouldExpandAppBarOnIdleScrolling;
        if (z && i == 0) {
            pfmFragment.shouldExpandAppBarOnIdleScrolling = false;
            PfmFragment.access$getBinding(pfmFragment).b.setExpanded(true);
            PfmFragment.access$getBinding(pfmFragment).f.setExpanded(true);
        }
    }
}
