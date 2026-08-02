package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Peer;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vkontakte.android.R;

/* compiled from: CommunityChatsAdapter.kt */
/* loaded from: classes5.dex */
public final class bvg extends zoj0<tmb, RecyclerView.e0> implements c.i {
    public final boolean e;
    public final hvg f;
    public final cpu g;
    public final mxv h;

    public bvg(boolean z, hvg hvgVar, cpu cpuVar, mxv mxvVar) {
        this.e = z;
        this.f = hvgVar;
        this.g = cpuVar;
        this.h = mxvVar;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return ((ListDataSet) this.c).d.size() == 0;
    }

    public final void K0(Peer peer) {
        ddg ddgVar = new ddg(new ns1(peer, 25), 1);
        hg6<T> hg6Var = this.c;
        ListDataSet listDataSet = (ListDataSet) hg6Var;
        tmb tmbVar = (tmb) listDataSet.t(ddgVar);
        if (tmbVar == null) {
            return;
        }
        jsb jsbVar = tmbVar instanceof jsb ? (jsb) tmbVar : null;
        if (jsbVar != null) {
            jsbVar.b.g = System.currentTimeMillis() / 1000;
        }
        hg6Var.d(listDataSet.v(tmbVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((tmb) this.c.c(i)).a;
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
        if (i == 1) {
            return new avg(viewGroup, this.g, this.h);
        }
        zug zugVar = new zug(tf3.b(viewGroup, R.layout.item_community_chats_create, viewGroup, false));
        zugVar.itemView.setOnClickListener(new bt8(this.f, 1));
        return zugVar;
    }
}
