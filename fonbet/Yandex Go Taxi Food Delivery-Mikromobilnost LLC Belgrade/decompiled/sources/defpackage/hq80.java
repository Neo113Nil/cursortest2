package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import core.flex.ui.OrientationAwareRecyclerView;

/* loaded from: classes9.dex */
public final class hq80 extends RecyclerView.g {
    public final /* synthetic */ OrientationAwareRecyclerView a;

    public hq80(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        this.a = orientationAwareRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        this.a.scrolling = i != 0;
    }
}
