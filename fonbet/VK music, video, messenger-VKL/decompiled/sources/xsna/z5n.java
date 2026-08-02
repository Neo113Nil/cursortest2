package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DiscoverMediaUpdatePaddingAction.kt */
/* loaded from: classes4.dex */
public final class z5n extends gux {
    public final RecyclerView a;

    public z5n(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // xsna.gux
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.setScrollBarStyle(33554432);
        recyclerView.setClipToPadding(false);
        gjf0.c(recyclerView, recyclerView.getContext(), true, 0);
    }
}
