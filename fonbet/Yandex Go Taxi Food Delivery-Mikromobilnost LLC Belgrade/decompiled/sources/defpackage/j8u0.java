package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class j8u0 extends RecyclerView.g {
    public final LinearLayoutManager a;
    public final l8u0 b;
    public volatile int c;

    public j8u0(LinearLayoutManager linearLayoutManager, l8u0 l8u0Var) {
        this.a = linearLayoutManager;
        this.b = l8u0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        GoConstraintLayout goConstraintLayout;
        Object value;
        View X = this.a.X(0);
        if (X == null || (goConstraintLayout = (GoConstraintLayout) X.findViewById(yfh0.ultima_header_layout)) == null) {
            return;
        }
        Object parent = goConstraintLayout.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        boolean z = (goConstraintLayout.getHeight() + (goConstraintLayout.getTop() + view.getTop())) - i2 > this.c / 2;
        r0 r0Var = this.b.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, k8u0.a((k8u0) value, false, null, z, false, false, 27)));
    }
}
