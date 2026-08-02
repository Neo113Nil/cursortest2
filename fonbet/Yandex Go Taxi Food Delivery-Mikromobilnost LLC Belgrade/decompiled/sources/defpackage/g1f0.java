package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class g1f0 extends RecyclerView.g {
    public final LinearLayoutManager a;
    public final adx0 b;

    public g1f0(LinearLayoutManager linearLayoutManager, adx0 adx0Var) {
        this.a = linearLayoutManager;
        this.b = adx0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View X = this.a.X(0);
        View findViewById = X != null ? X.findViewById(yfh0.tariff_card_price) : null;
        Object parent = findViewById != null ? findViewById.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (findViewById == null || view == null) {
            return;
        }
        qv10.B((findViewById.getHeight() + (findViewById.getTop() + view.getTop())) - i2 > 0, this.b.a, null);
    }
}
