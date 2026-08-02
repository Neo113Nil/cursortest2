package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.lang.ref.WeakReference;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvd0;
import xsna.evd0;
import xsna.klh;
import xsna.vjh;

/* compiled from: ProfileContentNarrativesViewHolder.kt */
/* loaded from: classes5.dex */
public final class hvd0 extends wjh<uu50> {
    public static final /* synthetic */ int G = 0;
    public final zih E;
    public final evd0 F;

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((vjh.b) this.receiver).b(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).d(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).e(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).g(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).f(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements wzs<Narrative, WeakReference<View>, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Narrative narrative, WeakReference<View> weakReference) {
            Narrative narrative2 = narrative;
            WeakReference<View> weakReference2 = weakReference;
            hvd0 hvd0Var = (hvd0) this.receiver;
            int i = hvd0.G;
            uu50 uu50Var = (uu50) hvd0Var.t;
            if (uu50Var != null) {
                zih.a(hvd0Var.E, uu50Var, new fu50(narrative2, uu50Var), weakReference2, 8);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentNarrativesViewHolder.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements wzs<Narrative, WeakReference<View>, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Narrative narrative, WeakReference<View> weakReference) {
            Narrative narrative2 = narrative;
            WeakReference<View> weakReference2 = weakReference;
            hvd0 hvd0Var = (hvd0) this.receiver;
            int i = hvd0.G;
            uu50 uu50Var = (uu50) hvd0Var.t;
            if (uu50Var != null) {
                hvd0Var.E.e(new nu50(narrative2, weakReference2, uu50Var));
            }
            return s3q0.a;
        }
    }

    public hvd0(View view, UserId userId, FragmentImpl fragmentImpl, zih zihVar, vjh.b bVar) {
        super(view, userId, fragmentImpl, new a(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new b(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new c(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new d(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new e(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = zihVar;
        evd0 evd0Var = new evd0(new f(2, this, hvd0.class, "onItemClick", "onItemClick(Lcom/vk/dto/narratives/Narrative;Ljava/lang/ref/WeakReference;)V", 0), new g(2, this, hvd0.class, "onItemLongClick", "onItemLongClick(Lcom/vk/dto/narratives/Narrative;Ljava/lang/ref/WeakReference;)V", 0));
        this.F = evd0Var;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.setAdapter(evd0Var);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        float f2 = 16;
        awt0.x(recyclerView, iah0.a(f2), iah0.a(12), iah0.a(f2), 0, 8);
        float f3 = 0;
        recyclerView.addItemDecoration(new ijh(3, iah0.a(32), iah0.a(f3), 0, iah0.a(f3), 24));
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.c(3);
        dVar.a();
    }

    @Override // xsna.wjh
    public final void V5(uu50 uu50Var) {
        uu50 uu50Var2 = uu50Var;
        super.V5(uu50Var2);
        cvd0.b bVar = uu50Var2.j;
        RandomAccess randomAccess = bVar != null ? bVar.a : null;
        if (randomAccess == null) {
            randomAccess = EmptyList.b;
        }
        this.F.setItems(randomAccess);
        CommunityProfileContentItem.State state = uu50Var2.q;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(uu50 uu50Var) {
        uu50 uu50Var2 = uu50Var;
        return uu50Var2 != null && uu50Var2.k && uu50Var2.q.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof evd0.d)) {
            return null;
        }
        return new klh.b(((Narrative) r8.m).b, CommonCommunitiesStat$TypeTabContentType.NARRATIVES, ((evd0.d) e0Var).getAbsoluteAdapterPosition(), null);
    }

    @Override // xsna.wjh
    public final void m6(uu50 uu50Var) {
        this.x.setContent(po40.d);
    }
}
