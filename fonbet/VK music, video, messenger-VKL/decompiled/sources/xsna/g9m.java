package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xsna.g9m.a;
import xsna.xtt0;

/* compiled from: DialogAdapter.kt */
/* loaded from: classes8.dex */
public final class g9m<ViewBindingType extends xtt0, ItemType extends a> extends androidx.recyclerview.widget.x<ItemType, b<ViewBindingType>> {
    public final m37<ViewBindingType, ItemType> c;
    public com.vk.movika.sdk.base.observable.w d;

    /* compiled from: DialogAdapter.kt */
    public static class a {
        public final int a;
        public final boolean b;

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }
    }

    /* compiled from: DialogAdapter.kt */
    public static final class b<ViewBindingType extends xtt0> extends RecyclerView.e0 {
        public final ViewBindingType l;

        public b(ViewBindingType viewbindingtype) {
            super(viewbindingtype.getRoot());
            this.l = viewbindingtype;
        }
    }

    public g9m(m37<ViewBindingType, ItemType> m37Var) {
        super(new qxm());
        this.c = m37Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.c.getItemViewType(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        b bVar = (b) e0Var;
        a aVar = (a) getItem(i);
        bVar.itemView.setEnabled(aVar.b);
        bVar.itemView.setOnClickListener(new f9m(0, this, aVar));
        this.c.a(bVar.l, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(this.c.b(i, viewGroup));
    }
}
