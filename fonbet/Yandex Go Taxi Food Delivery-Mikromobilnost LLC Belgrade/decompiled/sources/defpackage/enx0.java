package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class enx0 extends RecyclerView.g {
    public final LinearLayoutManager a;
    public final boolean b;
    public final int c;
    public final dnx0 d = new dnx0();

    public enx0(LinearLayoutManager linearLayoutManager, boolean z, int i) {
        this.a = linearLayoutManager;
        this.b = z;
        this.c = i;
    }

    public final void a(float f, int i) {
        float f2 = -f;
        LinearLayoutManager linearLayoutManager = this.a;
        int d0 = linearLayoutManager.d0();
        for (int i2 = 0; i2 < d0; i2++) {
            View c0 = linearLayoutManager.c0(i2);
            if (c0 != null) {
                float viewLayoutPosition = this.c * ((((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition() - i) + f2);
                if (this.b) {
                    viewLayoutPosition = -viewLayoutPosition;
                }
                c0.setTranslationX(viewLayoutPosition);
            }
        }
    }

    public final void b() {
        LinearLayoutManager linearLayoutManager = this.a;
        int K1 = linearLayoutManager.K1();
        dnx0 dnx0Var = this.d;
        dnx0Var.a = K1;
        if (K1 == -1) {
            dnx0Var.a = -1;
            dnx0Var.b = 0.0f;
            return;
        }
        View X = linearLayoutManager.X(K1);
        if (X == null) {
            dnx0Var.a = -1;
            dnx0Var.b = 0.0f;
        } else {
            int left = this.b ? X.getLeft() : -X.getLeft();
            int width = X.getWidth();
            dnx0Var.b = width != 0 ? left / width : 0.0f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            b();
            int i2 = this.d.a;
            if (i2 >= 0) {
                a(0.0f, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        b();
        dnx0 dnx0Var = this.d;
        a(dnx0Var.b, Math.max(dnx0Var.a, 0));
    }
}
