package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.lists.ListDataSet;

/* compiled from: DataSetWarmUpVideosProvider.kt */
/* loaded from: classes16.dex */
public final class vuk {
    public final ListDataSet<UIBlock> a;
    public lb b;
    public final a c = new a();

    /* compiled from: DataSetWarmUpVideosProvider.kt */
    public static final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            vuk vukVar = vuk.this;
            lb lbVar = vukVar.b;
            if (lbVar != null) {
                lbVar.invoke(rli0.A(vukVar.a(new i5g(vukVar.a.d))));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            vuk vukVar = vuk.this;
            lb lbVar = vukVar.b;
            if (lbVar != null) {
                lbVar.invoke(rli0.A(vukVar.a(rli0.y(rli0.i(new i5g(vukVar.a.d), i), i2))));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            c(i, i2);
            vuk vukVar = vuk.this;
            lb lbVar = vukVar.b;
            if (lbVar != null) {
                lbVar.invoke(rli0.A(vukVar.a(rli0.y(rli0.i(new i5g(vukVar.a.d), i), i2))));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            vuk vukVar = vuk.this;
            lb lbVar = vukVar.b;
            if (lbVar != null) {
                lbVar.invoke(rli0.A(vukVar.a(rli0.y(rli0.i(new i5g(vukVar.a.d), i), i2))));
            }
        }
    }

    public vuk(ListDataSet<UIBlock> listDataSet) {
        this.a = listDataSet;
    }

    public final cor a(uki0 uki0Var) {
        return rli0.o(uki0Var, new r9k(this, 3));
    }
}
