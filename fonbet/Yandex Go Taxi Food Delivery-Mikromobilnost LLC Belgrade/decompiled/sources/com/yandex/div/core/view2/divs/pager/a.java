package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.f;
import com.yandex.div2.DivPager$ItemAlignment;
import defpackage.aw5;
import defpackage.hgk;
import defpackage.sls;
import defpackage.u1l;
import defpackage.zik;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends zik {
    public final aw5 B;
    public final hgk C;
    public final SparseArray D;
    public final f E;
    public final DivPagerView F;
    public final u1l G;
    public int H;
    public DivPager$ItemAlignment I;
    public boolean J;
    public int K;

    public a(List list, aw5 aw5Var, hgk hgkVar, SparseArray sparseArray, f fVar, com.yandex.div.core.state.b bVar, DivPagerView divPagerView) {
        super(aw5Var, bVar, list);
        this.B = aw5Var;
        this.C = hgkVar;
        this.D = sparseArray;
        this.E = fVar;
        this.F = divPagerView;
        this.G = new u1l(0, this);
        this.I = DivPager$ItemAlignment.START;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void b(int i) {
        if (!this.J) {
            notifyItemChanged(i);
        } else {
            notifyItemChanged(i + 2);
            n(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void d(int i) {
        if (!this.J) {
            notifyItemInserted(i);
        } else {
            notifyItemInserted(i + 2);
            n(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void e(int i) {
        this.K++;
        if (!this.J) {
            notifyItemRemoved(i);
        } else {
            notifyItemRemoved(i + 2);
            n(i);
        }
    }

    @Override // com.yandex.div.core.view2.divs.y, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.G.size();
    }

    public final int m() {
        return this.J ? 2 : 0;
    }

    public final void n(int i) {
        if (i >= 0 && i < 2) {
            notifyItemRangeChanged(g().size() + i, 2 - i);
            return;
        }
        int size = g().size() - 2;
        if (i >= g().size() || size > i) {
            return;
        }
        notifyItemRangeChanged((i - g().size()) + 2, 2);
    }

    @Override // defpackage.zik, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(c cVar, int i) {
        super.onBindViewHolder(cVar, p(i));
        Float f = (Float) this.D.get(i);
        if (f != null) {
            float floatValue = f.floatValue();
            int i2 = this.H;
            View view = cVar.a;
            if (i2 == 0) {
                view.setTranslationX(floatValue);
            } else {
                view.setTranslationY(floatValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(this.B, new DivPagerPageLayout(this.B.a.getContext(), new sls() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$view$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf(a.this.H == 0);
            }
        }), this.C, this.E, new DivPagerAdapter$onCreateViewHolder$1(this), new DivPagerAdapter$onCreateViewHolder$2(this));
    }

    public final int p(int i) {
        int size = g().size();
        Integer valueOf = Integer.valueOf(size);
        if (size <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue = valueOf.intValue();
        return ((i - m()) + intValue) % intValue;
    }
}
