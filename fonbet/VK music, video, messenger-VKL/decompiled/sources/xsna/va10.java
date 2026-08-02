package xsna;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.design.view.badge.MarketDiscountBadge;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.wid0;

/* compiled from: MarketProductBadgeAdapter.kt */
/* loaded from: classes18.dex */
public final class va10 extends RecyclerView.Adapter<a> {
    public List<? extends wid0> c;

    /* compiled from: MarketProductBadgeAdapter.kt */
    public final class b extends a {
        public final MarketDiscountBadge l;

        public b(ViewGroup viewGroup) {
            super(new MarketDiscountBadge(viewGroup.getContext(), null, 6, 0));
            this.l = (MarketDiscountBadge) this.itemView;
        }

        @Override // xsna.va10.a
        public final void V5(wid0 wid0Var) {
            wid0.a.InterfaceC3933a interfaceC3933a;
            wid0.a aVar = wid0Var instanceof wid0.a ? (wid0.a) wid0Var : null;
            if (aVar == null || (interfaceC3933a = aVar.a) == null) {
                return;
            }
            boolean z = interfaceC3933a instanceof wid0.a.InterfaceC3933a.C3934a;
            MarketDiscountBadge marketDiscountBadge = this.l;
            if (z) {
                marketDiscountBadge.setDiscountFromText(((wid0.a.InterfaceC3933a.C3934a) interfaceC3933a).a);
            } else {
                if (!(interfaceC3933a instanceof wid0.a.InterfaceC3933a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                marketDiscountBadge.setDiscountFromValue(((wid0.a.InterfaceC3933a.b) interfaceC3933a).a);
            }
        }
    }

    /* compiled from: MarketProductBadgeAdapter.kt */
    public final class c extends a {
        public final o610 l;

        public c(ViewGroup viewGroup) {
            super(new o610(viewGroup.getContext()));
            this.l = (o610) this.itemView;
        }

        @Override // xsna.va10.a
        public final void V5(wid0 wid0Var) {
            if (wid0Var instanceof wid0.b) {
                this.l.setPrefix(((wid0.b) wid0Var).a);
            }
        }
    }

    /* compiled from: MarketProductBadgeAdapter.kt */
    public final class d extends a {
        public final c010 l;

        public d(ViewGroup viewGroup) {
            super(new c010(viewGroup.getContext()));
            this.l = (c010) this.itemView;
        }

        @Override // xsna.va10.a
        public final void V5(wid0 wid0Var) {
            ely elyVar;
            wid0.d dVar = wid0Var instanceof wid0.d ? (wid0.d) wid0Var : null;
            if (dVar == null || (elyVar = dVar.a) == null) {
                return;
            }
            TypedValue typedValue = krv0.a;
            this.l.b(elyVar.c, elyVar.d, epx.f(krv0.i(this.itemView.getContext()), Boolean.TRUE) ? elyVar.b : elyVar.a);
        }
    }

    /* compiled from: MarketProductBadgeAdapter.kt */
    public final class e extends a {
        @Override // xsna.va10.a
        public final void V5(wid0 wid0Var) {
            String str;
            View view = this.itemView;
            l910 l910Var = view instanceof l910 ? (l910) view : null;
            if (l910Var != null) {
                wid0.c cVar = wid0Var instanceof wid0.c ? (wid0.c) wid0Var : null;
                if (cVar != null && (str = cVar.a) != null) {
                    l910Var.setPrefix(str);
                }
                l910Var.b();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        wid0 wid0Var = this.c.get(i);
        if (wid0Var instanceof wid0.a) {
            return 1;
        }
        if (wid0Var instanceof wid0.c) {
            return 3;
        }
        if (wid0Var instanceof wid0.d) {
            return 4;
        }
        if (wid0Var instanceof wid0.b) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        aVar.V5(this.c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 3) {
            return i != 4 ? i != 5 ? new b(viewGroup) : new c(viewGroup) : new d(viewGroup);
        }
        viewGroup.getContext();
        e eVar = new e(new l910(viewGroup.getContext()));
        viewGroup.getContext();
        new bpn0(new t210(viewGroup, 2));
        new bpn0(new daz(1));
        new bpn0(new xrj(viewGroup, 19));
        return eVar;
    }

    /* compiled from: MarketProductBadgeAdapter.kt */
    public static abstract class a extends RecyclerView.e0 {
        public void V5(wid0 wid0Var) {
        }
    }
}
