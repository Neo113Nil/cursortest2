package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupChat;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.klh;
import xsna.vfh;
import xsna.vjh;

/* compiled from: CommunityProfileContentChatViewHolder.kt */
/* loaded from: classes5.dex */
public final class ufh extends wjh<pzb> {
    public final nph E;
    public final vfh F;

    public ufh(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, vjh.b bVar) {
        super(view, userId, fragmentImpl, new pfh(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new qfh(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new rfh(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new sfh(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new tfh(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = nphVar;
        vfh vfhVar = new vfh(new wl0(this, 26));
        this.F = vfhVar;
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
        if (this.w.getRecyclerView().getAdapter() == null) {
            RecyclerPaginatedView recyclerPaginatedView = this.w;
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            this.itemView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerPaginatedView.setAdapter(vfhVar);
        }
    }

    @Override // xsna.wjh
    public final void V5(pzb pzbVar) {
        pzb pzbVar2 = pzbVar;
        super.V5(pzbVar2);
        Collection collection = pzbVar2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.F.setItems(collection);
        CommunityProfileContentItem.State state = pzbVar2.q;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(pzb pzbVar) {
        pzb pzbVar2 = pzbVar;
        return pzbVar2 != null && pzbVar2.k && pzbVar2.q.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof vfh.a)) {
            return null;
        }
        vfh.a aVar = (vfh.a) e0Var;
        return new klh.b(((GroupChat) aVar.m).h, CommonCommunitiesStat$TypeTabContentType.CHATS, aVar.getAbsoluteAdapterPosition(), null);
    }

    @Override // xsna.wjh
    public final void m6(pzb pzbVar) {
        this.x.setContent(imj0.d);
    }
}
