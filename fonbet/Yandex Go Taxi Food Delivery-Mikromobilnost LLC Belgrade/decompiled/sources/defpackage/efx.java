package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class efx extends cfx {
    public final boolean a;
    public final lxj b;
    public final ujd c;
    public List w = EmptyList.a;

    public efx(z0x z0xVar, List list, boolean z, pdh pdhVar) {
        this.a = z;
        this.b = new lxj(z0xVar, list);
        this.c = new ujd(z0xVar, pdhVar);
    }

    @Override // defpackage.cfx
    public final List f() {
        return this.w;
    }

    @Override // defpackage.cfx
    public final void g(List list) {
        i f = kp50.f(new dfx(this.w, list, this.c), this.a);
        this.w = list;
        f.b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((z0x) this.b.c).g((u0x) this.w.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        this.b.j(x0Var, (u0x) this.w.get(i), i, EmptyList.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ArrayList arrayList;
        lxj lxjVar = this.b;
        List list = (List) lxjVar.a;
        boolean z = lxjVar.b;
        if (z) {
            arrayList = lxjVar.i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((y70) it.next()).getClass();
                arrayList.add(null);
            }
        } else {
            arrayList = null;
        }
        x0 d = ((z0x) lxjVar.c).a(i).d(viewGroup);
        if (z) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                y70 y70Var = (y70) obj;
                if (arrayList != null) {
                    arrayList.get(i2);
                }
                y70Var.getClass();
                i2 = i3;
            }
            lxjVar.m(arrayList);
        }
        return d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        lxj lxjVar = this.b;
        if (lxjVar.b) {
            Iterator it = ((List) lxjVar.a).iterator();
            while (it.hasNext()) {
                ((y70) it.next()).c();
            }
        }
        ((z0x) lxjVar.c).n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        lxj lxjVar = this.b;
        lxjVar.getClass();
        ((z0x) lxjVar.c).a(x0Var.y).getClass();
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        lxj lxjVar = this.b;
        lxjVar.getClass();
        ((z0x) lxjVar.c).a(x0Var.y).f(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        lxj lxjVar = this.b;
        lxjVar.getClass();
        ((z0x) lxjVar.c).a(x0Var.y).g(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        lxj lxjVar = this.b;
        if (lxjVar.b) {
            Iterator it = ((List) lxjVar.a).iterator();
            while (it.hasNext()) {
                ((y70) it.next()).d(x0Var);
            }
        }
        ((z0x) lxjVar.c).a(x0Var.y).h(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        this.b.j(x0Var, (u0x) this.w.get(i), i, list);
    }
}
