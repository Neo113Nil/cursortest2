package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.x0;
import com.yandex.go.coroutines.b;
import com.yandex.go.routestops.RouteStopsAdapter$onAttachedToRecyclerView$$inlined$safeCollectIn$1;
import com.yandex.go.routestops.RouteStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$1;
import com.yandex.go.routestops.RouteStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$2;
import com.yandex.go.routestops.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.IntConsumer;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class pcl0 extends RecyclerView.Adapter {
    public final LayoutInflater A;
    public final mcl0 B;
    public final s C;
    public final n0 D;
    public pzt0 E;
    public pzt0 F;
    public pzt0 G;
    public final tse a;
    public final ddl0 b;
    public final IntConsumer c;
    public final hcl0 w;
    public final sgu0 x;
    public final String y;
    public final sls z;

    public pcl0(Context context, tse tseVar, ddl0 ddl0Var, IntConsumer intConsumer, hcl0 hcl0Var, sgu0 sgu0Var, String str, sls slsVar) {
        this.a = tseVar;
        this.b = ddl0Var;
        this.c = intConsumer;
        this.w = hcl0Var;
        this.x = sgu0Var;
        this.y = str;
        this.z = slsVar;
        this.A = LayoutInflater.from(context);
        mcl0 mcl0Var = new mcl0(this, ddl0Var, hcl0Var);
        this.B = mcl0Var;
        this.C = new s(mcl0Var);
        this.D = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public static final int f(pcl0 pcl0Var, int i) {
        int i2;
        int i3;
        if (i == -1) {
            i2 = pcl0Var.h() - 1;
            i3 = pcl0Var.i();
        } else {
            i2 = i - 1;
            i3 = pcl0Var.i();
        }
        return i3 + i2;
    }

    public final int g(int i, int i2) {
        mdl0 mdl0Var = (mdl0) this.b;
        ArrayList arrayList = (ArrayList) mdl0Var.z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zfu0) it.next()).a(arrayList2);
        }
        if (i >= i2 - (arrayList2.size() < mdl0Var.a ? 2 : 1)) {
            return -1;
        }
        return (i - i()) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) ((mdl0) this.b).z).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        zfu0 zfu0Var = (zfu0) ((ArrayList) ((mdl0) this.b).z).get(i);
        if (zfu0Var.d()) {
            return 2;
        }
        if (zfu0Var.c()) {
            return 1;
        }
        return zfu0Var.e() ? 3 : 0;
    }

    public final int h() {
        ArrayList<zfu0> arrayList = (ArrayList) ((mdl0) this.b).z;
        int i = 0;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        for (zfu0 zfu0Var : arrayList) {
            if (!zfu0Var.c() && !zfu0Var.d() && !zfu0Var.e() && (i = i + 1) < 0) {
                scc.l();
                throw null;
            }
        }
        return i;
    }

    public final int i() {
        int i;
        ArrayList arrayList = (ArrayList) ((mdl0) this.b).z;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((zfu0) it.next()).d()) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        if (arrayList != null && arrayList.isEmpty()) {
            return i;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((zfu0) it2.next()).e()) {
                return i + 1;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.C.f(recyclerView);
        this.E = tje.N(this.a, null, null, new RouteStopsAdapter$onAttachedToRecyclerView$$inlined$safeCollectIn$1(b.j(this.D, 300L), null, this), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ncl0 ncl0Var = (ncl0) x0Var;
        ncl0Var.W((zfu0) ((ArrayList) ((mdl0) this.b).z).get(i));
        ncl0Var.X(g(ncl0Var.F(), getItemCount()), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        pcl0 pcl0Var;
        ncl0 lcl0Var;
        LayoutInflater layoutInflater = this.A;
        if (i != 0) {
            if (i == 1) {
                lcl0Var = new gcl0(layoutInflater.inflate(sjh0.route_stop_item_add_button, viewGroup, false), this.z, this.y);
            } else if (i == 2) {
                lcl0Var = new gcl0(layoutInflater.inflate(sjh0.route_stop_header, viewGroup, false));
            } else {
                if (i != 3) {
                    ny61.g(oyr.i(i, "Unsupported viewType: "));
                    return null;
                }
                lcl0Var = new icl0(layoutInflater.inflate(sjh0.route_stop_item, viewGroup, false));
            }
            pcl0Var = this;
        } else {
            pcl0Var = this;
            lcl0Var = new lcl0(pcl0Var, layoutInflater.inflate(sjh0.route_stop_item, viewGroup, false), this.C, this.B, this.x);
        }
        RouteStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$1 routeStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$1 = new RouteStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$1(new com.yandex.go.routestops.b(lcl0Var.N), null, pcl0Var);
        tse tseVar = pcl0Var.a;
        pcl0Var.F = tje.N(tseVar, null, null, routeStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$1, 3);
        pcl0Var.G = tje.N(tseVar, null, null, new RouteStopsAdapter$onCreateViewHolder$$inlined$safeCollectIn$2(new d(lcl0Var.Y()), null, pcl0Var), 3);
        return lcl0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = null;
        pzt0 pzt0Var2 = this.F;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.F = null;
        pzt0 pzt0Var3 = this.G;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.G = null;
    }
}
