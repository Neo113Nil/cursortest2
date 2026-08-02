package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.egj;
import xsna.klh;
import xsna.vjh;

/* compiled from: CommunityProfileContentDiscussionViewHolder.kt */
/* loaded from: classes5.dex */
public final class jhh extends wjh<tan> {
    public final nph E;
    public final egj F;

    public jhh(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, vjh.b bVar) {
        super(view, userId, fragmentImpl, new ehh(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new fhh(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new ghh(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new hhh(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new ihh(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = nphVar;
        egj egjVar = new egj(new dhh(this, 0));
        this.F = egjVar;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        recyclerPaginatedView.getRecyclerView().setItemAnimator(null);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerPaginatedView.setAdapter(egjVar);
    }

    @Override // xsna.wjh
    public final void V5(tan tanVar) {
        tan tanVar2 = tanVar;
        super.V5(tanVar2);
        Collection collection = tanVar2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.F.setItems(collection);
        CommunityProfileContentItem.State state = tanVar2.q;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(tan tanVar) {
        tan tanVar2 = tanVar;
        return tanVar2 != null && tanVar2.k && tanVar2.q.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof egj.b)) {
            return null;
        }
        return new klh.b(((ii7) r8.m).a, CommonCommunitiesStat$TypeTabContentType.DISCUSSIONS, ((egj.b) e0Var).getAbsoluteAdapterPosition(), null);
    }
}
