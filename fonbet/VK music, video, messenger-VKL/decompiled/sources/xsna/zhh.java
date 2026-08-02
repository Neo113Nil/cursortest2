package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.hgj;
import xsna.klh;
import xsna.vjh;

/* compiled from: CommunityProfileContentEventsViewHolder.kt */
/* loaded from: classes5.dex */
public final class zhh extends wjh<y0q> {
    public final nph E;
    public final hgj F;

    public zhh(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, vjh.b bVar) {
        super(view, userId, fragmentImpl, new uhh(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new vhh(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new whh(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new xhh(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new yhh(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = nphVar;
        hgj hgjVar = new hgj(new x2e(this, 2));
        this.F = hgjVar;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        recyclerPaginatedView.getRecyclerView().setItemAnimator(null);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerPaginatedView.setAdapter(hgjVar);
    }

    @Override // xsna.wjh
    public final void V5(y0q y0qVar) {
        y0q y0qVar2 = y0qVar;
        super.V5(y0qVar2);
        Collection collection = y0qVar2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.F.setItems(collection);
        CommunityProfileContentItem.State state = y0qVar2.q;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(y0q y0qVar) {
        y0q y0qVar2 = y0qVar;
        return y0qVar2 != null && y0qVar2.k && y0qVar2.q.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof hgj.b)) {
            return null;
        }
        hgj.b bVar = (hgj.b) e0Var;
        return new klh.b(((Group) bVar.m).c.b, CommonCommunitiesStat$TypeTabContentType.EVENTS, bVar.getAbsoluteAdapterPosition(), null);
    }

    @Override // xsna.wjh
    public final void m6(y0q y0qVar) {
        this.x.setContent(jgz.g);
    }
}
