package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InfoItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class yvw extends zoj0<xe6, RecyclerView.e0> implements mf7, jjv0, zzc0 {

    /* compiled from: InfoItemsAdapter.kt */
    public static final class a extends vif0<xe6> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(xe6 xe6Var) {
        }
    }

    public yvw() {
        this(null);
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        ((xe6) this.c.c(i)).getClass();
        return null;
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        ((xe6) this.c.c(i)).getClass();
        return 0;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        uuk uukVar = this.c;
        if (i >= ((ListDataSet) uukVar).d.size()) {
            return 0;
        }
        ((xe6) uukVar.c(i)).getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((xe6) this.c.c(i)).b();
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        ((xe6) this.c.c(i)).getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
        if (vif0Var != null) {
            vif0Var.V5(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Iterator it = ((ArrayList) y0()).iterator();
        while (it.hasNext()) {
            xe6 xe6Var = (xe6) it.next();
            if (xe6Var.b() == i) {
                return xe6Var.a(viewGroup);
            }
        }
        return new a(new View(viewGroup.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        vif0 vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
        if (vif0Var != null) {
            vif0Var.l6();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        vif0 vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
        if (vif0Var != null) {
            vif0Var.m6();
        }
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }

    public yvw(Object obj) {
        super(new ListDataSet());
    }
}
