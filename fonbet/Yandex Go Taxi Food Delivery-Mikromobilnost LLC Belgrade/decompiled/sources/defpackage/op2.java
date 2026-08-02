package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.c;

/* loaded from: classes.dex */
public final class op2 extends RecyclerView.g {
    public final float a;
    public final /* synthetic */ c b;

    public op2(c cVar, float f) {
        this.b = cVar;
        this.a = f;
    }

    public final void a(RecyclerView recyclerView) {
        float g = c.g(recyclerView) / this.a;
        if (g > 1.0f) {
            g = 1.0f;
        }
        this.b.j(g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        a(recyclerView);
    }
}
