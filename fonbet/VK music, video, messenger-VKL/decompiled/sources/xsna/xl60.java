package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedInlineCommentScrollController.kt */
/* loaded from: classes4.dex */
public final class xl60 extends RecyclerView.t {
    public final /* synthetic */ yl60 b;

    public xl60(yl60 yl60Var) {
        this.b = yl60Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.b.b.a(recyclerView, i);
    }
}
