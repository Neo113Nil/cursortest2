package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InfoItemsAdapter.kt */
/* loaded from: classes5.dex */
public class zvw extends zoj0<we6, RecyclerView.e0> implements mf7, jjv0, zzc0 {

    /* compiled from: InfoItemsAdapter.kt */
    public static final class a extends vif0<we6> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(we6 we6Var) {
        }
    }

    public zvw() {
        this(null);
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        return ((we6) this.c.c(i)).f(i2);
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        return ((we6) this.c.c(i)).e();
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        uuk uukVar = this.c;
        if (i >= ((ListDataSet) uukVar).d.size()) {
            return 0;
        }
        return ((we6) uukVar.c(i)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((we6) this.c.c(i)).h();
    }

    public int n1(int i) {
        return (((we6) this.c.c(i)).b() & 2) == 2 ? 1 : 0;
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
            we6 we6Var = (we6) it.next();
            if (we6Var.h() == i) {
                return we6Var.a(viewGroup);
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

    public zvw(Object obj) {
        super(new ListDataSet());
    }
}
