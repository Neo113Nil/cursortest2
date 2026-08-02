package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UpdatePaddingProfileRoundedCardAction.kt */
/* loaded from: classes4.dex */
public final class v8q0 extends gux {
    public final RecyclerView a;

    public v8q0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // xsna.gux
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), 0);
    }
}
