package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.donut.impl.PaidSubscriptionsFragment;

/* compiled from: PaidSubscriptionsAdapter.kt */
/* loaded from: classes18.dex */
public final class ag90 extends zoj0<eg90, j0n0<?>> implements mf7 {
    public final PaidSubscriptionsFragment.c e;
    public final PaidSubscriptionsFragment.d f;
    public dg90 g;

    /* compiled from: PaidSubscriptionsAdapter.kt */
    public static final class a extends j0n0<eg90> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(Object obj) {
        }
    }

    public ag90(hg6 hg6Var, PaidSubscriptionsFragment.c cVar, PaidSubscriptionsFragment.d dVar) {
        super(hg6Var);
        this.e = cVar;
        this.f = dVar;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        eg90 eg90Var = (eg90) this.c.c(i);
        if (eg90Var != null) {
            return eg90Var.a;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        eg90 eg90Var = (eg90) this.c.c(i);
        if (eg90Var != null) {
            return eg90Var.a();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        eg90 eg90Var = (eg90) this.c.c(i);
        if (eg90Var != null) {
            return eg90Var.b();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        j0n0 j0n0Var = (j0n0) e0Var;
        eg90 eg90Var = (eg90) this.c.c(i);
        if (eg90Var != null) {
            j0n0Var.V5(eg90Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new a(new View(viewGroup.getContext()), viewGroup) : new oyn(viewGroup, this.f) : new b8t(viewGroup, this.e) : new b0j0(viewGroup) : new x890(new View(viewGroup.getContext()), viewGroup) : new h3o(viewGroup) : new c0j0(viewGroup);
    }
}
