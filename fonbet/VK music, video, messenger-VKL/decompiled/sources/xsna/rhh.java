package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.fgj;
import xsna.klh;
import xsna.vjh;

/* compiled from: CommunityProfileContentDocumentViewHolder.kt */
/* loaded from: classes5.dex */
public final class rhh extends wjh<sun> {
    public final nph E;
    public final fgj F;

    public rhh(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, vjh.b bVar) {
        super(view, userId, fragmentImpl, new mhh(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new nhh(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new ohh(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new phh(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new qhh(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = nphVar;
        fgj fgjVar = new fgj(new yve(this, 7));
        this.F = fgjVar;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        recyclerPaginatedView.getRecyclerView().setItemAnimator(null);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerPaginatedView.setAdapter(fgjVar);
    }

    @Override // xsna.wjh
    public final void V5(sun sunVar) {
        sun sunVar2 = sunVar;
        super.V5(sunVar2);
        Collection collection = sunVar2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.F.setItems(collection);
        CommunityProfileContentItem.State state = sunVar2.q;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(sun sunVar) {
        sun sunVar2 = sunVar;
        return sunVar2 != null && sunVar2.k && sunVar2.q.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof fgj.b)) {
            return null;
        }
        return new klh.b(((Document) r8.m).b, CommonCommunitiesStat$TypeTabContentType.FILES, ((fgj.b) e0Var).getAbsoluteAdapterPosition(), null);
    }

    @Override // xsna.wjh
    public final void m6(sun sunVar) {
        this.x.setContent(mnh0.d);
    }
}
