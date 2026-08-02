package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.klh;
import xsna.ljh;
import xsna.qjh;

/* compiled from: CommunityProfileContentServicesViewHolder.kt */
/* loaded from: classes5.dex */
public final class elh extends wjh<Services> {
    public static final /* synthetic */ int M = 0;
    public final nph E;
    public final eeh F;
    public final ljh G;
    public final ykh H;
    public final qjh I;
    public final glh<GoodAlbum, qjh.b> J;
    public final ffh K;
    public final hlh L;

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public elh(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, q530 q530Var, jhj jhjVar) {
        super(view, userId, fragmentImpl, jhjVar.a, jhjVar.b, jhjVar.c, jhjVar.d, jhjVar.e, null);
        this.E = nphVar;
        float f = 6;
        int i = 0;
        int i2 = 1;
        this.F = new eeh(iah0.a(f), new xv2(i2, this, elh.class, "onPromoteClick", "onPromoteClick(Ljava/lang/String;)V", i, 8));
        i37 i37Var = new i37(i2, this, elh.class, "onServiceClicked", "onServiceClicked(Lcom/vk/dto/common/Good;)V", i, 5);
        int i3 = 0;
        int i4 = 2;
        this.G = new ljh(q530Var, i37Var, new clh(i4, this, elh.class, "onServiceFaveClicked", "onServiceFaveClicked(Lcom/vk/profile/community/impl/ui/profile/state/GoodListItem;I)V", i, i3), new dlh(i4, this, elh.class, "onItemCtaClicked", "onItemCtaClicked(Lcom/vk/profile/community/impl/ui/profile/state/GoodListItem;I)V", i, i3), null, 32);
        this.H = new ykh(new n8(1, this, elh.class, "onServiceClicked", "onServiceClicked(Lcom/vk/dto/common/Good;)V", 0, 3));
        qjh qjhVar = new qjh(new q69(1, this, elh.class, "onServiceAlbumClicked", "onServiceAlbumClicked(Lcom/vk/dto/common/GoodAlbum;)V", 0, 4), true);
        this.I = qjhVar;
        glh<GoodAlbum, qjh.b> glhVar = new glh<>(qjhVar, 88, new ncg(this, 5));
        this.J = glhVar;
        this.K = new ffh(glhVar, userId, fragmentImpl, new blh(1, this, elh.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), 0, iah0.a(10), 0, 0, null, 448);
        this.L = new hlh(view.getContext().getString(R.string.community_profile_services), iah0.a(f), 4);
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
    }

    @Override // xsna.wjh
    public final void V5(Services services) {
        List<? extends hfz> list;
        Services services2 = services;
        osi0 osi0Var = services2.j;
        Services.ViewType viewType = services2.q;
        e11 e11Var = services2.s;
        Services services3 = (Services) this.t;
        boolean f = epx.f(e11Var, services3 != null ? services3.s : null);
        Services services4 = (Services) this.t;
        boolean z = (services4 != null ? services4.q : null) != viewType;
        i6(services2);
        super.V5(services2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (recyclerPaginatedView.getRecyclerView().getAdapter() == null || z || !f) {
            v6(services2);
        }
        if (viewType == Services.ViewType.VIEW_TYPE_ROWS) {
            list = osi0Var != null ? osi0Var.a : null;
            if (list == null) {
                list = EmptyList.b;
            }
            this.H.setItems(list);
        } else {
            list = osi0Var != null ? osi0Var.a : null;
            if (list == null) {
                list = EmptyList.b;
            }
            this.G.setItems(list);
        }
        Collection collection = services2.k;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.I.setItems(collection);
        if (e11Var != null) {
            this.F.setItems(Collections.singletonList(e11Var));
        }
        this.J.x0(services2.p);
        CommunityProfileContentItem.State state = services2.x;
        if (state == CommunityProfileContentItem.State.LOADING) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(Services services) {
        Services services2 = services;
        return services2 != null && services2.o && services2.x.h();
    }

    @Override // xsna.wjh
    public final void a6() {
        super.a6();
        this.K.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        CommunityProfileContentItem.ContentType contentType;
        if (!(e0Var instanceof ljh.b)) {
            if (!(e0Var instanceof qjh.b)) {
                return null;
            }
            return new klh.b(((GoodAlbum) r9.m).b, CommonCommunitiesStat$TypeTabContentType.SERVICES_ALBUMS, ((qjh.b) e0Var).getAbsoluteAdapterPosition(), null);
        }
        ljh.b bVar = (ljh.b) e0Var;
        f5u f5uVar = bVar.q;
        long longValue = (f5uVar != null ? f5uVar : null).getItemId().longValue();
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = CommonCommunitiesStat$TypeTabContentType.SERVICES;
        int absoluteAdapterPosition = bVar.getAbsoluteAdapterPosition();
        Services services = (Services) this.t;
        return new klh.b(longValue, commonCommunitiesStat$TypeTabContentType, absoluteAdapterPosition - ((services == null || (contentType = services.l) == null || !contentType.l()) ? 0 : 3), null);
    }

    @Override // xsna.wjh
    public final void m6(Services services) {
        this.x.setContent(c4g0.e);
    }

    @Override // xsna.wjh
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final void i6(Services services) {
        Services services2 = (Services) this.t;
        if (services2 == null || services2.l == services.l) {
            return;
        }
        awt0.x(this.w.getRecyclerView(), 0, 0, 0, 0, 8);
        v6(services);
    }

    public final void v6(Services services) {
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        wjh.j6(recyclerPaginatedView.getRecyclerView());
        e11 e11Var = services.s;
        CommunityProfileContentItem.ContentType contentType = services.l;
        boolean z = e11Var != null;
        boolean z2 = services.q == Services.ViewType.VIEW_TYPE_ROWS;
        ljh ljhVar = this.G;
        RecyclerView.Adapter adapter = z2 ? this.H : ljhVar;
        boolean i = contentType.i();
        if (z2) {
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            this.itemView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        } else {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
            dVar.c(2);
            dVar.e = new alh(z, i);
            dVar.a();
        }
        d920 d920Var = new d920();
        if (z) {
            d920Var.x0(this.F);
        }
        boolean l = contentType.l();
        hlh hlhVar = this.L;
        if (l) {
            d920Var.x0(new hlh(this.itemView.getContext().getString(R.string.community_profile_goods_albums), 0, 6));
            d920Var.x0(this.K);
            d920Var.x0(hlhVar);
            d920Var.x0(adapter);
            if (!z2) {
                recyclerPaginatedView.getRecyclerView().addItemDecoration(z ? ljhVar.p : ljhVar.q);
            }
        } else if (contentType.h()) {
            d920Var.x0(this.J);
        } else {
            if (z) {
                d920Var.x0(hlhVar);
            }
            d920Var.x0(adapter);
            if (!z2) {
                recyclerPaginatedView.getRecyclerView().addItemDecoration(ljhVar.r);
            }
        }
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setAdapter(d920Var);
    }
}
