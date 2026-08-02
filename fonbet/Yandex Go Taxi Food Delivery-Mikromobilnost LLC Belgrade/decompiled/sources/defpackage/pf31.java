package defpackage;

import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.selector.data.TariffCardType;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.b;

/* loaded from: classes6.dex */
public final class pf31 extends RecyclerView.Adapter implements glx0 {
    public boolean A;
    public List B = EmptyList.a;
    public se31 C;
    public lqx0 a;
    public final fva0 b;
    public final unx0 c;
    public final bmq0 w;
    public final hbp0 x;
    public tls y;
    public OneShotPreDrawListener z;

    public pf31(lqx0 lqx0Var, fva0 fva0Var, unx0 unx0Var, bmq0 bmq0Var, hbp0 hbp0Var) {
        this.a = lqx0Var;
        this.b = fva0Var;
        this.c = unx0Var;
        this.w = bmq0Var;
        this.x = hbp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(List list) {
        int g;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (list.isEmpty()) {
            this.B = list;
            notifyDataSetChanged();
            g = g();
        } else {
            elx0 item = getItem(g());
            boolean z4 = list.size() != this.B.size();
            i f = kp50.f(new lds0(this.B, list, new aub(23)), false);
            this.B = list;
            f.b(this);
            g = g();
            elx0 item2 = getItem(g);
            if ((item == null && item2 == null) || (item != null && item2 != null && item.b(item2))) {
                if (jl40.l(item != null ? Boolean.valueOf(item.w) : null, item2 != null ? Boolean.valueOf(item2.w) : null)) {
                    z = false;
                    if (!this.w.a) {
                        if (xtb1.e(item2 != null ? item2.L : null, item != null ? item.L : null)) {
                            z2 = true;
                            if (!z || z4 || z2) {
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    if (!z) {
                    }
                    z3 = true;
                }
            }
            z = true;
            if (!this.w.a) {
            }
            z2 = false;
            if (!z) {
            }
            z3 = true;
        }
        elx0 item3 = getItem(g);
        mr31 mr31Var = item3 != null ? item3.s : null;
        se31 se31Var = this.C;
        if (mr31Var != null) {
            if (se31Var != null) {
                se31Var.invoke(Integer.valueOf(g), mr31Var);
                return z3;
            }
        } else if (se31Var != null) {
            se31Var.invoke(-1, null);
        }
        return z3;
    }

    public final int g() {
        Iterator it = this.B.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((elx0) it.next()).u) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.glx0
    public final elx0 getItem(int i) {
        if (i < 0 || i >= this.B.size()) {
            return null;
        }
        return (elx0) this.B.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.B.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (((elx0) this.B.get(i)).a() ? TariffCardType.Option : TariffCardType.Regular).getViewId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        sb5 sb5Var = (sb5) x0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(sb5Var, i, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yhj yhjVar = (yhj) it.next();
            sb5Var.W((elx0) yhjVar.a, (elx0) yhjVar.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (!this.A) {
            fva0.f(this.b, "TariffsRibbonView.ViewHolder", PerformanceAnalytics$Type.Inflate, 0L, 4);
        }
        sb5 a = this.a.a(viewGroup, i, this.x);
        if (!this.A) {
            this.A = true;
            this.z = fva0.c(this.b, a.a, "TariffsRibbonView.ViewHolder", null, 12);
        }
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        ((sb5) x0Var).X();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        sb5 sb5Var = (sb5) x0Var;
        super.onViewAttachedToWindow(sb5Var);
        sb5Var.b0(new b(this, sb5Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        sb5 sb5Var = (sb5) x0Var;
        super.onViewDetachedFromWindow(sb5Var);
        sb5Var.b0(rb5.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        sb5 sb5Var = (sb5) x0Var;
        super.onViewRecycled(sb5Var);
        sb5Var.Q = null;
        OneShotPreDrawListener oneShotPreDrawListener = this.z;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        sb5 sb5Var = (sb5) x0Var;
        elx0 item = getItem(i);
        if (item != null) {
            sb5Var.W(null, item);
        }
    }
}
