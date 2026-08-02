package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public final class pgr0 extends RecyclerView.g {
    public final RecyclerView a;
    public final View b;

    public pgr0(View view, RecyclerView recyclerView) {
        this.a = recyclerView;
        this.b = view;
    }

    public final void a() {
        RecyclerView recyclerView = this.a;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        View view = this.b;
        if (canScrollVertically && view.getVisibility() != 0) {
            view.setVisibility(0);
        } else {
            if (recyclerView.canScrollVertically(-1) || view.getVisibility() != 0) {
                return;
            }
            view.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        a();
    }
}
