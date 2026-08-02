package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper$Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.routestops.RouteStopsModalView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class mcl0 extends ItemTouchHelper$Callback {
    public final ddl0 d;
    public final hcl0 e;
    public int f;
    public RecyclerView g;
    public final /* synthetic */ pcl0 h;

    public mcl0(pcl0 pcl0Var, ddl0 ddl0Var, hcl0 hcl0Var) {
        this.h = pcl0Var;
        this.d = ddl0Var;
        this.e = hcl0Var;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean a(x0 x0Var) {
        return ((ncl0) x0Var).Z();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int e(x0 x0Var) {
        if (((ncl0) x0Var).Z()) {
            return ItemTouchHelper$Callback.k(3, 0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean i() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean j() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2) {
        ((mdl0) this.d).b(x0Var.F(), x0Var2.F());
        if (recyclerView.getAdapter() != null) {
            lcl0 lcl0Var = (lcl0) x0Var;
            lcl0 lcl0Var2 = (lcl0) x0Var2;
            int F = lcl0Var.F();
            pcl0 pcl0Var = this.h;
            lcl0Var.X(pcl0Var.g(F, pcl0Var.getItemCount()), true);
            lcl0Var2.X(pcl0Var.g(lcl0Var2.F(), pcl0Var.getItemCount()), false);
        }
        this.g = recyclerView;
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void o(x0 x0Var, int i) {
        idl0 idl0Var;
        if (i == 0 && this.f == 2) {
            idl0Var = ((RouteStopsModalView) ((sue0) this.e).b).presenter;
            mdl0 mdl0Var = idl0Var.J;
            if (mdl0Var != null) {
                ArrayList arrayList = (ArrayList) mdl0Var.z;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zfu0) it.next()).a(arrayList2);
                }
                idl0Var.E.g(arrayList2);
            }
            RecyclerView recyclerView = this.g;
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ncl0 ncl0Var = (ncl0) this.g.findViewHolderForAdapterPosition(i2);
                    lcl0 lcl0Var = ncl0Var instanceof lcl0 ? (lcl0) ncl0Var : null;
                    if (lcl0Var != null) {
                        int F = ((lcl0) ncl0Var).F();
                        pcl0 pcl0Var = this.h;
                        lcl0Var.X(pcl0Var.g(F, pcl0Var.getItemCount()), false);
                    }
                }
            }
            this.g = null;
        }
        this.f = i;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void p(x0 x0Var, int i) {
    }
}
