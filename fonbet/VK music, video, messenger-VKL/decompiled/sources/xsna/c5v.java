package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.narratives.impl.highlights.HighlightEditFragment;

/* compiled from: HighlightEditViewPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class c5v extends RecyclerView.Adapter<vif0<s3q0>> {
    public final ppl0 c;
    public final ppl0 d;
    public final androidx.recyclerview.widget.r e;
    public final HighlightEditFragment.c f;
    public final RecyclerView.u g = new RecyclerView.u();

    /* compiled from: HighlightEditViewPagerAdapter.kt */
    public static final class a extends c {
        public final ppl0 o;
        public final izs<VkRecyclerPaginatedView, s3q0> p;
        public final VkRecyclerPaginatedView q;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup, RecyclerView.u uVar, ppl0 ppl0Var, HighlightEditFragment.c cVar) {
            super(r1, viewGroup, uVar);
            VkRecyclerPaginatedView vkRecyclerPaginatedView = new VkRecyclerPaginatedView(viewGroup.getContext(), null, 6, 0);
            vkRecyclerPaginatedView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.o = ppl0Var;
            this.p = cVar;
            VkRecyclerPaginatedView vkRecyclerPaginatedView2 = (VkRecyclerPaginatedView) this.itemView;
            s6(vkRecyclerPaginatedView2.getRecyclerView());
            this.q = vkRecyclerPaginatedView2;
        }

        @Override // xsna.c5v.c
        public final void q6() {
            izs<VkRecyclerPaginatedView, s3q0> izsVar = this.p;
            VkRecyclerPaginatedView vkRecyclerPaginatedView = this.q;
            izsVar.invoke(vkRecyclerPaginatedView);
            vkRecyclerPaginatedView.setAdapter(this.o);
        }
    }

    /* compiled from: HighlightEditViewPagerAdapter.kt */
    public static final class b extends c {
        public final ppl0 o;
        public final androidx.recyclerview.widget.r p;
        public final RecyclerView q;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ViewGroup viewGroup, RecyclerView.u uVar, ppl0 ppl0Var, androidx.recyclerview.widget.r rVar) {
            super(r1, viewGroup, uVar);
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.o = ppl0Var;
            this.p = rVar;
            RecyclerView recyclerView2 = (RecyclerView) this.itemView;
            s6(recyclerView2);
            this.q = recyclerView2;
        }

        @Override // xsna.c5v.c
        public final void q6() {
            androidx.recyclerview.widget.r rVar = this.p;
            RecyclerView recyclerView = this.q;
            rVar.l(recyclerView);
            recyclerView.setAdapter(this.o);
        }
    }

    /* compiled from: HighlightEditViewPagerAdapter.kt */
    public static abstract class c extends vif0<s3q0> {
        public final RecyclerView.u n;

        public c(ViewGroup viewGroup, ViewGroup viewGroup2, RecyclerView.u uVar) {
            super(viewGroup, viewGroup2);
            this.n = uVar;
        }

        @Override // xsna.vif0
        public final void i6(s3q0 s3q0Var) {
            q6();
        }

        public abstract void q6();

        public final void s6(RecyclerView recyclerView) {
            recyclerView.setHasFixedSize(true);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(3, 1));
            recyclerView.setRecycledViewPool(this.n);
            recyclerView.addItemDecoration(new hxl0(0, 7));
        }
    }

    public c5v(ppl0 ppl0Var, ppl0 ppl0Var2, androidx.recyclerview.widget.r rVar, HighlightEditFragment.c cVar) {
        this.c = ppl0Var;
        this.d = ppl0Var2;
        this.e = rVar;
        this.f = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(vif0<s3q0> vif0Var, int i) {
        vif0Var.V5(s3q0.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final vif0<s3q0> onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.u uVar = this.g;
        if (i == 0) {
            return new b(viewGroup, uVar, this.c, this.e);
        }
        if (i == 1) {
            return new a(viewGroup, uVar, this.d, this.f);
        }
        throw new IllegalStateException(("Unknown viewType: " + i).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i;
    }
}
