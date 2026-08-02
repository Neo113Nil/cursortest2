package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import xsna.sst0;
import xsna.tlh;

/* compiled from: CommunityProfileContentGrowthTrapAdapter.kt */
/* loaded from: classes5.dex */
public final class pih extends zoj0<sst0.a, vif0<sst0.a>> {
    public final tlh.i e;
    public final tlh.j f;
    public int g;

    /* compiled from: CommunityProfileContentGrowthTrapAdapter.kt */
    public static final class a extends m.e<sst0.a> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(sst0.a aVar, sst0.a aVar2) {
            return aVar.equals(aVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(sst0.a aVar, sst0.a aVar2) {
            return aVar.equals(aVar2);
        }
    }

    public pih(tlh.i iVar, tlh.j jVar) {
        super(new com.vk.lists.a(new a()));
        this.e = iVar;
        this.f = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new xoh(this.g, viewGroup, this.e, this.f);
    }
}
