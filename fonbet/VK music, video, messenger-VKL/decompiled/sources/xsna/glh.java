package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileContentShowAllWrapperAdapter.kt */
/* loaded from: classes5.dex */
public final class glh<T, VH extends RecyclerView.e0> extends RecyclerView.Adapter<RecyclerView.e0> {
    public final zoj0<T, VH> c;
    public final Integer d;
    public final gzs<s3q0> e;
    public boolean f;
    public boolean g;
    public boolean h;

    /* compiled from: CommunityProfileContentShowAllWrapperAdapter.kt */
    public static final class a extends RecyclerView.i {
        public int a;
        public final /* synthetic */ glh<T, VH> b;

        public a(glh<T, VH> glhVar) {
            this.b = glhVar;
            this.a = glhVar.c.getItemCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            glh<T, VH> glhVar = this.b;
            zoj0<T, VH> zoj0Var = glhVar.c;
            if (zoj0Var.getItemCount() != this.a) {
                this.a = zoj0Var.getItemCount();
                glhVar.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            this.b.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            c(i, i2);
            this.b.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            this.a += i2;
            this.b.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            this.b.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            this.a -= i2;
            this.b.notifyItemRangeRemoved(i, i2);
        }
    }

    public glh(zoj0<T, VH> zoj0Var, Integer num, gzs<s3q0> gzsVar) {
        this.c = zoj0Var;
        this.d = num;
        this.e = gzsVar;
        zoj0Var.registerAdapterDataObserver(new a(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.getItemCount() + ((this.g || this.h) ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        zoj0<T, VH> zoj0Var = this.c;
        return i >= zoj0Var.getItemCount() ? this.g ? Integer.MAX_VALUE : 2147483646 : this.f ? zoj0Var.getItemViewType(i) : super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        zoj0<T, VH> zoj0Var = this.c;
        if (i < zoj0Var.getItemCount()) {
            zoj0Var.onBindViewHolder(e0Var, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 2147483646:
                return new jjh(viewGroup, R.layout.community_item_content_loading_next_item, 0);
            case Integer.MAX_VALUE:
                return new flh(viewGroup, this.e, this.d);
            default:
                return this.c.onCreateViewHolder(viewGroup, i);
        }
    }

    public final void x0(boolean z) {
        if (z && this.h) {
            throw new IllegalStateException("only one of showAllVisible && isLoadingNextVisible can be true");
        }
        if (this.g != z) {
            zoj0<T, VH> zoj0Var = this.c;
            if (z) {
                notifyItemInserted(zoj0Var.getItemCount());
            } else {
                notifyItemRemoved(zoj0Var.getItemCount());
            }
            this.g = z;
        }
    }
}
