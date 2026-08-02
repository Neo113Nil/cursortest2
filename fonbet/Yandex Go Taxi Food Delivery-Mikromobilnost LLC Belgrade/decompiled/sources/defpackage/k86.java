package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.BoldVerticalsView;

/* loaded from: classes6.dex */
public final class k86 extends RecyclerView.g {
    public final /* synthetic */ BoldVerticalsView a;

    public k86(BoldVerticalsView boldVerticalsView) {
        this.a = boldVerticalsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        km4 km4Var;
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            km4Var = this.a.badgeShownDelegate;
            km4Var.a(recyclerView);
        }
    }
}
