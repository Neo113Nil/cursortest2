package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.klh;
import xsna.vjh;

/* compiled from: CommunityProfileContentPodcastViewHolder.kt */
/* loaded from: classes5.dex */
public final class ukh extends wjh<xkb0> implements View.OnAttachStateChangeListener {
    public final nph E;
    public final kxg F;
    public final w6b0<zoj0<MusicTrack, se50<MusicTrack>>> G;

    public ukh(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, u2b0 u2b0Var, vjh.b bVar) {
        super(view, userId, fragmentImpl, new pkh(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new qkh(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new rkh(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new skh(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new tkh(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = nphVar;
        kxg kxgVar = new kxg(u2b0Var, new gr3(this, 25));
        this.F = kxgVar;
        this.G = new w6b0<>(this.w.getRecyclerView(), u2b0Var, kxgVar, new j21((byte) 0, 4));
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.wjh
    public final void V5(xkb0 xkb0Var) {
        xkb0 xkb0Var2 = xkb0Var;
        super.V5(xkb0Var2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        RecyclerView.Adapter adapter = recyclerPaginatedView.getRecyclerView().getAdapter();
        kxg kxgVar = this.F;
        if (adapter == null) {
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            this.itemView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerPaginatedView.setAdapter(kxgVar);
        }
        Collection collection = xkb0Var2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        kxgVar.setItems(collection);
        CommunityProfileContentItem.State state = xkb0Var2.q;
        if (state == CommunityProfileContentItem.State.LOADING) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(xkb0 xkb0Var) {
        xkb0 xkb0Var2 = xkb0Var;
        return xkb0Var2 != null && xkb0Var2.k && xkb0Var2.q.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof se50)) {
            return null;
        }
        se50 se50Var = (se50) e0Var;
        if (se50Var.l instanceof MusicTrack) {
            return new klh.b(((MusicTrack) r0).b, CommonCommunitiesStat$TypeTabContentType.PODCASTS, se50Var.getAbsoluteAdapterPosition(), null);
        }
        return null;
    }

    @Override // xsna.wjh
    public final void m6(xkb0 xkb0Var) {
        this.x.setContent(s200.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        w6b0<zoj0<MusicTrack, se50<MusicTrack>>> w6b0Var = this.G;
        w6b0Var.b.P0(w6b0Var, true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        w6b0<zoj0<MusicTrack, se50<MusicTrack>>> w6b0Var = this.G;
        w6b0Var.b.n0(w6b0Var);
    }
}
