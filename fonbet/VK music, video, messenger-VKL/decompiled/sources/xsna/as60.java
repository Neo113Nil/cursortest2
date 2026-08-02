package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.common.util.k;

/* compiled from: NewsfeedListStatisticsViewsPlugin.kt */
/* loaded from: classes4.dex */
public final class as60 implements zjf0<ol60> {
    public final /* synthetic */ bs60 b;

    public as60(bs60 bs60Var) {
        this.b = bs60Var;
    }

    @Override // xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        ol60 ol60Var2 = ol60Var;
        if (((e0Var instanceof vto) || (e0Var instanceof sto) || (e0Var instanceof w3c0) || (e0Var instanceof f1c0) || (e0Var instanceof h1c0)) && (ol60Var2 instanceof z1c0)) {
            u1c0 u1c0Var = ((z1c0) ol60Var2).h;
            bs60 bs60Var = this.b;
            if (bs60Var.i && !bs60Var.n) {
                String str = bs60Var.h;
                if (str != null) {
                    com.vk.newsfeed.common.util.k.a(str, u1c0Var);
                    return;
                }
                return;
            }
            String str2 = com.vk.newsfeed.common.util.k.a;
            twq twqVar = new twq(bs60Var, 1);
            k.a a = k.b.a(u1c0Var);
            if (a == null) {
                return;
            }
            com.vk.newsfeed.common.util.k.o(a, twqVar);
        }
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
    }
}
