package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.d920;
import xsna.klh;
import xsna.ljh;
import xsna.qjh;

/* compiled from: CommunityProfileContentGoodsViewHolder.kt */
/* loaded from: classes5.dex */
public final class kih extends wjh<p8u> {
    public static final /* synthetic */ int O = 0;
    public final nph E;
    public final boolean F;
    public final eeh G;
    public final rjh H;
    public final d920 I;
    public final ljh J;
    public final qjh K;
    public final glh<GoodAlbum, qjh.b> L;
    public final ffh M;
    public final hlh N;

    /* compiled from: CommunityProfileContentGoodsViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketInfoBlockModel.SubType.values().length];
            try {
                iArr[MarketInfoBlockModel.SubType.OZON_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketInfoBlockModel.SubType.INTEGRATION_ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public kih(View view, UserId userId, FragmentImpl fragmentImpl, nph nphVar, q530 q530Var, jhj jhjVar) {
        super(view, userId, fragmentImpl, jhjVar.a, jhjVar.b, jhjVar.c, jhjVar.d, jhjVar.e, null);
        this.E = nphVar;
        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
        soccomFeatures.getClass();
        this.F = com.vk.toggle.b.A.a(soccomFeatures);
        int i = 0;
        int i2 = 2;
        this.G = new eeh(iah0.a(8), new hy0(1, this, kih.class, "onPromoteClick", "onPromoteClick(Ljava/lang/String;)V", i, i2));
        this.H = new rjh(new cq6(0, this, kih.class, "onInfoBlockClicked", "onInfoBlockClicked()V", i, i2));
        this.I = new d920();
        this.J = new ljh(q530Var, new ic1(1, this, kih.class, "onGoodClicked", "onGoodClicked(Lcom/vk/dto/common/Good;)V", 0, 1), new p84(2, this, kih.class, "onGoodFaveClicked", "onGoodFaveClicked(Lcom/vk/profile/community/impl/ui/profile/state/GoodListItem;I)V", i, 1), new mih(2, this, kih.class, "onItemCtaClicked", "onItemCtaClicked(Lcom/vk/profile/community/impl/ui/profile/state/GoodListItem;I)V", 0), new nih(0, this, kih.class, "hasInfoBlock", "hasInfoBlock()Z", i, 0), 16);
        qjh qjhVar = new qjh(new g15(1, this, kih.class, "onGoodAlbumClicked", "onGoodAlbumClicked(Lcom/vk/dto/common/GoodAlbum;)V", 0, 5), false);
        this.K = qjhVar;
        glh<GoodAlbum, qjh.b> glhVar = new glh<>(qjhVar, 88, new e4(this, 27));
        this.L = glhVar;
        this.M = new ffh(glhVar, userId, fragmentImpl, new oih(1, this, kih.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), 0, iah0.a(10), 0, 0, null, 448);
        this.N = new hlh(view.getContext().getString(R.string.community_profile_goods), iah0.a(6), 4);
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
    }

    @Override // xsna.wjh
    public final void V5(p8u p8uVar) {
        MarketInfoBlockModel marketInfoBlockModel;
        List list;
        p8u p8uVar2 = p8uVar;
        e11 e11Var = p8uVar2.s;
        p8u p8uVar3 = (p8u) this.t;
        boolean f = epx.f(e11Var, p8uVar3 != null ? p8uVar3.s : null);
        i6(p8uVar2);
        super.V5(p8uVar2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (recyclerPaginatedView.getRecyclerView().getAdapter() == null || !f) {
            v6(p8uVar2);
        }
        p8u p8uVar4 = (p8u) this.t;
        if (p8uVar4 != null && (marketInfoBlockModel = p8uVar4.r) != null) {
            int i = a.$EnumSwitchMapping$0[marketInfoBlockModel.a.ordinal()];
            if (i != 1 ? i != 2 ? false : this.F : true) {
                dly dlyVar = marketInfoBlockModel.c;
                list = Collections.singletonList(new a010(dlyVar != null ? new ely(dlyVar.a, dlyVar.b, dlyVar.c, dlyVar.d) : null, marketInfoBlockModel.b));
            } else {
                list = EmptyList.b;
            }
            this.H.setItems(list);
        }
        Collection collection = p8uVar2.k;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.K.setItems(collection);
        a9u a9uVar = p8uVar2.j;
        List<? extends hfz> list2 = a9uVar != null ? a9uVar.a : null;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        this.J.setItems(list2);
        if (e11Var != null) {
            this.G.setItems(Collections.singletonList(e11Var));
        }
        this.L.x0(p8uVar2.p);
        CommunityProfileContentItem.State state = p8uVar2.x;
        if (state == CommunityProfileContentItem.State.LOADING) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(p8u p8uVar) {
        p8u p8uVar2 = p8uVar;
        return p8uVar2 != null && p8uVar2.o && p8uVar2.x.h();
    }

    @Override // xsna.wjh
    public final void a6() {
        super.a6();
        this.M.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        CommunityProfileContentItem.ContentType contentType;
        if (!(e0Var instanceof ljh.b)) {
            if (!(e0Var instanceof qjh.b)) {
                return null;
            }
            return new klh.b(((GoodAlbum) r9.m).b, CommonCommunitiesStat$TypeTabContentType.MARKET_ALBUMS, ((qjh.b) e0Var).getAbsoluteAdapterPosition(), null);
        }
        ljh.b bVar = (ljh.b) e0Var;
        f5u f5uVar = bVar.q;
        long longValue = (f5uVar != null ? f5uVar : null).getItemId().longValue();
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = CommonCommunitiesStat$TypeTabContentType.MARKET;
        int absoluteAdapterPosition = bVar.getAbsoluteAdapterPosition();
        p8u p8uVar = (p8u) this.t;
        return new klh.b(longValue, commonCommunitiesStat$TypeTabContentType, absoluteAdapterPosition - ((p8uVar == null || (contentType = p8uVar.l) == null || !contentType.l()) ? 0 : 3), null);
    }

    @Override // xsna.wjh
    public final void m6(p8u p8uVar) {
        this.x.setContent(rdi.d);
    }

    @Override // xsna.wjh
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final void i6(p8u p8uVar) {
        p8u p8uVar2 = (p8u) this.t;
        if (p8uVar2 == null || p8uVar2.l == p8uVar.l) {
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        awt0.x(recyclerPaginatedView.getRecyclerView(), 0, 0, 0, 0, 8);
        wjh.j6(recyclerPaginatedView.getRecyclerView());
        v6(p8uVar);
    }

    public final void v6(p8u p8uVar) {
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        wjh.j6(recyclerPaginatedView.getRecyclerView());
        e11 e11Var = p8uVar.s;
        CommunityProfileContentItem.ContentType contentType = p8uVar.l;
        boolean z = e11Var != null;
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.c(2);
        dVar.e = new lih(this);
        dVar.a();
        d920 d920Var = this.I;
        HashMap<RecyclerView.Adapter, d920.a> hashMap = d920Var.e;
        ArrayList<RecyclerView.Adapter> arrayList = d920Var.c;
        Iterator<RecyclerView.Adapter> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.Adapter next = it.next();
            next.unregisterAdapterDataObserver(hashMap.get(next));
            hashMap.remove(next);
        }
        arrayList.clear();
        RecyclerView recyclerView = d920Var.h;
        if (recyclerView != null) {
            wjf0.d(recyclerView);
        }
        if (z) {
            d920Var.x0(this.G);
        }
        d920Var.x0(this.H);
        boolean l = contentType.l();
        hlh hlhVar = this.N;
        ljh ljhVar = this.J;
        if (l) {
            d920Var.x0(new hlh(this.itemView.getContext().getString(R.string.community_profile_goods_albums), 0, 6));
            d920Var.x0(this.M);
            d920Var.x0(hlhVar);
            d920Var.x0(ljhVar);
            recyclerPaginatedView.getRecyclerView().addItemDecoration(z ? ljhVar.p : ljhVar.q);
        } else if (contentType.h()) {
            d920Var.x0(this.L);
        } else {
            if (z) {
                d920Var.x0(hlhVar);
            }
            d920Var.x0(ljhVar);
            recyclerPaginatedView.getRecyclerView().addItemDecoration(ljhVar.r);
        }
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setAdapter(d920Var);
    }
}
