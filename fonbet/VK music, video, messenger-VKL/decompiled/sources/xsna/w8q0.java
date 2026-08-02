package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UpdatePaddingRoundedCardAction.kt */
/* loaded from: classes4.dex */
public final class w8q0 extends gux {
    public final RecyclerView a;
    public final boolean b;

    public w8q0(RecyclerView recyclerView, boolean z) {
        this.a = recyclerView;
        this.b = z;
    }

    @Override // xsna.gux
    public final void a() {
        int b = this.b ? cn70.b(8) : 0;
        RecyclerView recyclerView = this.a;
        recyclerView.setScrollBarStyle(33554432);
        recyclerView.setClipToPadding(false);
        gjf0.d(recyclerView, recyclerView.getContext(), b, 8);
    }
}
