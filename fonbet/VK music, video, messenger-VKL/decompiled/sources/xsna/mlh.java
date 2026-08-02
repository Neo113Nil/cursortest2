package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import xsna.sst0;
import xsna.tlh;

/* compiled from: CommunityProfileContentVideoAdapter.kt */
/* loaded from: classes5.dex */
public final class mlh extends zoj0<sst0.b, vif0<sst0.b>> {
    public final qwe e;
    public final tlh.k f;
    public final bpn0 g;

    /* compiled from: CommunityProfileContentVideoAdapter.kt */
    public static final class a extends m.e<sst0.b> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(sst0.b bVar, sst0.b bVar2) {
            return bVar.equals(bVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(sst0.b bVar, sst0.b bVar2) {
            return epx.f(bVar.a.a1(), bVar2.a.a1());
        }
    }

    public mlh(qwe qweVar, tlh.k kVar) {
        super(new com.vk.lists.a(new a()));
        this.e = qweVar;
        this.f = kVar;
        this.g = new bpn0(new vv0(14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((sst0.b) this.c.c(i)).e ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        bpn0 bpn0Var = this.g;
        tlh.k kVar = this.f;
        qwe qweVar = this.e;
        return i != 1 ? i != 2 ? ((Boolean) bpn0Var.getValue()).booleanValue() ? new avh(viewGroup, qweVar, kVar) : new vuh(viewGroup, qweVar, kVar) : new dph(viewGroup) : ((Boolean) bpn0Var.getValue()).booleanValue() ? new avh(viewGroup, qweVar, kVar) : new vuh(viewGroup, qweVar, kVar);
    }
}
