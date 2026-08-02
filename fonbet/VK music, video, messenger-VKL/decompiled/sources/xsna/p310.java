package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GoodReviewsAndCommentsAdapter.kt */
/* loaded from: classes18.dex */
public final class p310 extends androidx.recyclerview.widget.x<c8u, RecyclerView.e0> {
    public final e4u c;
    public final i780 d;
    public final h780 e;
    public final a4u f;
    public final a8u g;
    public final cr20 h;

    public p310(e4u e4uVar, i780 i780Var, h780 h780Var, a4u a4uVar, a8u a8uVar, cr20 cr20Var) {
        super(new o310());
        this.c = e4uVar;
        this.d = i780Var;
        this.e = h780Var;
        this.f = a4uVar;
        this.g = a8uVar;
        this.h = cr20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof g8u) {
            ((g8u) e0Var).V5((h8u) getItem(i));
        } else if (e0Var instanceof z010) {
            ((z010) e0Var).V5((i010) getItem(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new g8u(viewGroup, this.d, this.e, this.g, this.h, false);
        }
        return new z010(viewGroup, this.c, false, this.f);
    }
}
