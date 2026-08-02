package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.taxi.summary.shared.expanded.repository.c;
import com.yandex.go.taxi.tariffs.repository.g;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.d;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;
import ru.yandex.taxi.requirements.glued.ui.ui.b;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class ckx0 extends RecyclerView.Adapter implements nwy0 {
    public final zkx0 a;
    public t690 b = wwn.b;
    public act0 c = act0.a;
    public List w = EmptyList.a;

    public ckx0(zkx0 zkx0Var) {
        this.a = zkx0Var;
        setHasStableIds(true);
    }

    @Override // defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        notifyItemRangeChanged(0, this.w.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        ikx0 ikx0Var = (ikx0) a.S(i, this.w);
        if (ikx0Var == null) {
            return 0L;
        }
        int i2 = ikx0Var.a;
        String str = ikx0Var.b.a;
        return (ikx0Var.h != yfh0.card_type_vertical || evu0.J(str)) ? !evu0.J(str) ? str.hashCode() + i2 : i2 : str.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ikx0 ikx0Var = (ikx0) a.S(i, this.w);
        if (ikx0Var != null) {
            return ikx0Var.h;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        e eVar = (e) x0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(eVar, i, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yhj yhjVar = (yhj) it.next();
            eVar.W((ikx0) yhjVar.a, (ikx0) yhjVar.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        String str;
        x0 vn40Var;
        zkx0 zkx0Var = this.a;
        zkx0Var.getClass();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == yfh0.card_type_regular) {
            str = "TariffPagerView.ViewHolder.Common";
            fva0.f(zkx0Var.a, "TariffPagerView.ViewHolder.Common", PerformanceAnalytics$Type.Inflate, 0L, 4);
            uqc uqcVar = zkx0Var.b;
            View inflate = from.inflate(xrh0.solid_tariff_page_with_order_button, viewGroup, false);
            tqc tqcVar = uqcVar.a;
            vn40Var = new sqc(inflate, (ykx0) tqcVar.a.get(), (jkt) tqcVar.b.get(), (y9j0) tqcVar.c.get(), (SummaryStateTracker) tqcVar.d.get(), (ppw0) tqcVar.e.get(), (dkx0) tqcVar.f.get(), (c) ((xvf0) tqcVar.g).get(), (vm6) ((xvf0) tqcVar.h).get(), (pav) ((xvf0) tqcVar.i).get(), tqcVar.j, (ao4) tqcVar.k.get(), (b) ((v8c0) tqcVar.u).get(), (spi) tqcVar.l.get(), (fva0) tqcVar.m.get(), (ru.yandex.taxi.orderbutton.summary.solid.interactors.c) ((cys0) tqcVar.v).get(), (ff9) tqcVar.n.get(), (com.yandex.go.taxi.auction.domain.a) tqcVar.o.get(), (z0a0) tqcVar.p.get(), (d) ((by8) tqcVar.w).get(), (ajj0) tqcVar.q.get(), (c9i) ((k4) tqcVar.x).get(), (vev0) tqcVar.r.get(), (ru.yandex.taxi.widget.c) tqcVar.s.get(), (en6) ((yc) tqcVar.y).get(), (pwy0) tqcVar.t.get(), (ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a) ((uc50) tqcVar.z).get());
        } else if (i == yfh0.card_type_vertical) {
            str = "TariffPagerView.ViewHolder.Verticals";
            fva0.f(zkx0Var.a, "TariffPagerView.ViewHolder.Verticals", PerformanceAnalytics$Type.Inflate, 0L, 4);
            si31 si31Var = zkx0Var.d;
            View inflate2 = from.inflate(xrh0.vertical_tariff_page_with_order_button, viewGroup, false);
            ri31 ri31Var = si31Var.a;
            vn40Var = new f(inflate2, (ykx0) ri31Var.a.get(), (jkt) ri31Var.b.get(), (y9j0) ri31Var.c.get(), (osx0) ri31Var.d.get(), (SummaryStateTracker) ri31Var.e.get(), (ppw0) ri31Var.f.get(), (dkx0) ri31Var.g.get(), (c) ri31Var.h.get(), (vm6) ri31Var.i.get(), ri31Var.j, (ao4) ri31Var.k.get(), (b) ri31Var.l.get(), (spi) ri31Var.m.get(), (fva0) ri31Var.n.get(), (g) ri31Var.o.get(), (ru.yandex.taxi.orderbutton.summary.solid.interactors.c) ri31Var.p.get(), (ff9) ri31Var.q.get(), (com.yandex.go.taxi.auction.domain.a) ri31Var.r.get(), (z0a0) ri31Var.s.get(), (d) ri31Var.t.get(), (pav) ri31Var.u.get(), (c9i) ri31Var.v.get(), (ajj0) ri31Var.w.get(), (vev0) ri31Var.x.get(), (mqv0) ri31Var.y.get(), (ru.yandex.taxi.widget.c) ri31Var.z.get(), (en6) ri31Var.A.get(), (pwy0) ri31Var.B.get(), (rqo) ri31Var.C.get(), (ico) ri31Var.D.get(), (ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a) ri31Var.E.get());
        } else {
            if (i != yfh0.card_type_multi_tariff) {
                ny61.g(oyr.i(i, "Unknown view type "));
                return null;
            }
            str = "TariffPagerView.ViewHolder.Multiclass";
            fva0.f(zkx0Var.a, "TariffPagerView.ViewHolder.Multiclass", PerformanceAnalytics$Type.Inflate, 0L, 4);
            xn40 xn40Var = zkx0Var.c;
            View inflate3 = from.inflate(xrh0.solid_multi_tariff_page_content, viewGroup, false);
            wn40 wn40Var = xn40Var.a;
            vn40Var = new vn40(inflate3, (ykx0) ((xvf0) wn40Var.a).get(), (SummaryStateTracker) ((xvf0) wn40Var.b).get(), (ppw0) ((xvf0) wn40Var.c).get(), (dkx0) ((xvf0) wn40Var.d).get(), (c) ((xvf0) wn40Var.e).get(), (vm6) ((xvf0) wn40Var.f).get(), (xvf0) wn40Var.g, (ao4) ((xvf0) wn40Var.h).get(), (fva0) ((xvf0) wn40Var.i).get(), (g) ((w0g) wn40Var.w).get(), (pav) ((xvf0) wn40Var.j).get(), (ru.yandex.taxi.orderbutton.summary.solid.interactors.c) ((xvf0) wn40Var.k).get(), (ff9) ((xvf0) wn40Var.l).get(), (com.yandex.go.taxi.auction.domain.a) ((xvf0) wn40Var.m).get(), (z0a0) ((xvf0) wn40Var.n).get(), (d) ((xvf0) wn40Var.o).get(), (ajj0) ((xvf0) wn40Var.p).get(), (vev0) ((xvf0) wn40Var.q).get(), (mqv0) ((xvf0) wn40Var.r).get(), (ru.yandex.taxi.widget.c) ((xvf0) wn40Var.s).get(), (en6) ((xvf0) wn40Var.t).get(), (pwy0) ((xvf0) wn40Var.u).get(), (rqo) ((u0g) wn40Var.x).get(), (ico) ((q02) wn40Var.y).get(), (ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a) ((xvf0) wn40Var.v).get());
        }
        fva0.b(zkx0Var.a, str, PerformanceAnalytics$Type.Inflate, null, 4);
        return vn40Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        ((e) x0Var).getClass();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        e eVar = (e) x0Var;
        super.onViewAttachedToWindow(eVar);
        eVar.m0 = this.b;
        act0 act0Var = this.c;
        ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar = eVar.q0;
        if (dVar != null) {
            dVar.b.i = act0Var;
        }
        eVar.Y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        e eVar = (e) x0Var;
        super.onViewDetachedFromWindow(eVar);
        eVar.m0 = wwn.b;
        ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar = eVar.q0;
        if (dVar != null) {
            dVar.b.i = act0.a;
        }
        eVar.Z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        e eVar = (e) x0Var;
        super.onViewRecycled(eVar);
        eVar.X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        e eVar = (e) x0Var;
        ikx0 ikx0Var = (ikx0) a.S(i, this.w);
        if (ikx0Var == null) {
            return;
        }
        eVar.W(null, ikx0Var);
    }
}
