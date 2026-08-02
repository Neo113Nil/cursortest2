package xsna;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvd0;
import xsna.klh;
import xsna.nlh;
import xsna.sst0;
import xsna.vjh;

/* compiled from: CommunityProfileContentVideoViewHolder.kt */
/* loaded from: classes5.dex */
public final class tlh extends wjh<sst0> {
    public final zih E;
    public final qwe F;
    public final mlh G;
    public final nlh H;
    public final glh<VideoAlbum, nlh.b> I;
    public final ffh J;
    public final pih K;

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((vjh.b) this.receiver).b(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).d(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).e(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).g(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).f(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContentItem.ContentType.values().length];
            try {
                iArr[CommunityProfileContentItem.ContentType.ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final class g extends GridLayoutManager.c {
        public final /* synthetic */ sst0 d;
        public final /* synthetic */ int e;

        public g(sst0 sst0Var, int i) {
            this.d = sst0Var;
            this.e = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            sst0 sst0Var = this.d;
            sst0.a aVar = sst0Var.p;
            int i2 = this.e;
            if (aVar != null && i == 0) {
                return i2;
            }
            if (!sst0Var.l.l() || i > 2) {
                return 1;
            }
            return i2;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<RecyclerView.e0, klh.b> {
        @Override // xsna.izs
        public final klh.b invoke(RecyclerView.e0 e0Var) {
            return ((tlh) this.receiver).b6(e0Var);
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((zih) this.receiver).c();
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((zih) this.receiver).g();
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentVideoViewHolder.kt */
    public static final class k implements suh {
        public k() {
        }

        @Override // xsna.suh
        public final void a(String str) {
            tlh tlhVar = tlh.this;
            sst0 sst0Var = (sst0) tlhVar.t;
            if (sst0Var != null) {
                zih.a(tlhVar.E, sst0Var, new khs0(str), null, 12);
            }
        }

        @Override // xsna.suh
        public final void b(VideoFile videoFile, h270 h270Var) {
            tlh tlhVar = tlh.this;
            sst0 sst0Var = (sst0) tlhVar.t;
            if (sst0Var != null) {
                zih.a(tlhVar.E, sst0Var, new gbs0(videoFile, sst0Var, h270Var), null, 12);
            }
        }

        @Override // xsna.suh
        public final void c(sst0.b.C3688b c3688b) {
            tlh tlhVar = tlh.this;
            sst0 sst0Var = (sst0) tlhVar.t;
            if (sst0Var != null) {
                zih.a(tlhVar.E, sst0Var, new jhs0(c3688b), null, 12);
            }
        }
    }

    public tlh(View view, UserId userId, FragmentImpl fragmentImpl, zih zihVar, vjh.b bVar, qwe qweVar) {
        super(view, userId, fragmentImpl, new a(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new b(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new c(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new d(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new e(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = zihVar;
        this.F = qweVar;
        this.G = new mlh(qweVar, new k());
        nlh nlhVar = new nlh(new rlh(this, 0));
        this.H = nlhVar;
        glh<VideoAlbum, nlh.b> glhVar = new glh<>(nlhVar, 88, new pff(this, 9));
        this.I = glhVar;
        this.J = new ffh(glhVar, userId, fragmentImpl, new h(1, this, tlh.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), 0, iah0.a(10), iah0.a(1), iah0.a(6), null, 256);
        this.K = new pih(new i(0, zihVar, zih.class, "onGrowthTrapBannerClick", "onGrowthTrapBannerClick()V", 0), new j(0, zihVar, zih.class, "onGrowthTrapBannerShown", "onGrowthTrapBannerShown()V", 0));
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
    }

    @Override // xsna.wjh
    public final void V5(sst0 sst0Var) {
        List list;
        sst0 sst0Var2 = sst0Var;
        i6(sst0Var2);
        super.V5(sst0Var2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (recyclerPaginatedView.getRecyclerView().getAdapter() == null) {
            v6(sst0Var2);
        }
        if (sst0Var2.l.l()) {
            this.I.x0(sst0Var2.o);
        }
        this.K.setItems(e43.m(sst0Var2.p));
        Collection collection = sst0Var2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.G.setItems(collection);
        cvd0.e eVar = sst0Var2.k;
        if (eVar == null || (list = eVar.a) == null) {
            list = EmptyList.b;
        }
        this.H.setItems(list);
        CommunityProfileContentItem.State state = sst0Var2.v;
        if (state == CommunityProfileContentItem.State.LOADING) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(sst0 sst0Var) {
        sst0 sst0Var2 = sst0Var;
        return sst0Var2 != null && sst0Var2.n && sst0Var2.v.h();
    }

    @Override // xsna.wjh
    public final void a6() {
        super.a6();
        this.J.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        CommunityProfileContentItem.ContentType contentType;
        CommunityProfileContentItem.ContentType contentType2;
        CommunityProfileContentItem.ContentType contentType3;
        int i2 = 0;
        if (e0Var instanceof vuh) {
            vuh vuhVar = (vuh) e0Var;
            long o0 = ((sst0.b) vuhVar.m).a.o0();
            CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = CommonCommunitiesStat$TypeTabContentType.VIDEOS;
            int absoluteAdapterPosition = vuhVar.getAbsoluteAdapterPosition();
            sst0 sst0Var = (sst0) this.t;
            if (sst0Var != null && (contentType3 = sst0Var.l) != null && contentType3.l()) {
                i2 = 3;
            }
            return new klh.b(o0, commonCommunitiesStat$TypeTabContentType, absoluteAdapterPosition - i2, ((sst0.b) vuhVar.m).a.r());
        }
        if (e0Var instanceof avh) {
            avh avhVar = (avh) e0Var;
            long o02 = ((sst0.b) avhVar.m).a.o0();
            CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.VIDEOS;
            int absoluteAdapterPosition2 = avhVar.getAbsoluteAdapterPosition();
            sst0 sst0Var2 = (sst0) this.t;
            if (sst0Var2 != null && (contentType2 = sst0Var2.l) != null && contentType2.l()) {
                i2 = 3;
            }
            return new klh.b(o02, commonCommunitiesStat$TypeTabContentType2, absoluteAdapterPosition2 - i2, ((sst0.b) avhVar.m).a.r());
        }
        if (!(e0Var instanceof dph)) {
            if (!(e0Var instanceof nlh.b)) {
                return null;
            }
            return new klh.b(((VideoAlbum) r11.m).b, CommonCommunitiesStat$TypeTabContentType.VIDEOS_PLAYLISTS, ((nlh.b) e0Var).getAbsoluteAdapterPosition(), null);
        }
        dph dphVar = (dph) e0Var;
        long o03 = ((sst0.b) dphVar.m).a.o0();
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType3 = CommonCommunitiesStat$TypeTabContentType.VIDEOS;
        int absoluteAdapterPosition3 = dphVar.getAbsoluteAdapterPosition();
        sst0 sst0Var3 = (sst0) this.t;
        if (sst0Var3 != null && (contentType = sst0Var3.l) != null && contentType.l()) {
            i2 = 3;
        }
        return new klh.b(o03, commonCommunitiesStat$TypeTabContentType3, absoluteAdapterPosition3 - i2, ((sst0.b) dphVar.m).a.r());
    }

    @Override // xsna.wjh
    public final void m6(sst0 sst0Var) {
        this.x.setContent(new jai(1446324151, new oac(sst0Var, 2), true));
    }

    @Override // xsna.wjh
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final void i6(sst0 sst0Var) {
        sst0 sst0Var2 = (sst0) this.t;
        if (sst0Var2 == null || sst0Var2.l == sst0Var.l) {
            return;
        }
        awt0.x(this.w, 0, 0, 0, 0, 8);
        wjh.j6(this.w.getRecyclerView());
        v6(sst0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v6(sst0 sst0Var) {
        int a2;
        int i2;
        sst0.a aVar;
        CommunityProfileContentItem.ContentType contentType = sst0Var.l;
        int i3 = contentType.h() ? 2 : 1;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.c(i3);
        dVar.e = new g(sst0Var, i3);
        dVar.a();
        int a3 = contentType.h() ? iah0.a(10) : 0;
        int[] iArr = f.$EnumSwitchMapping$0;
        int i4 = iArr[contentType.ordinal()];
        if (i4 == 1) {
            a2 = iah0.a(2);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 0;
                awt0.x(recyclerPaginatedView.getRecyclerView(), a3, i2, a3, 0, 8);
                recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
                d920 d920Var = new d920();
                aVar = sst0Var.p;
                ffh ffhVar = this.J;
                mlh mlhVar = this.G;
                nlh nlhVar = this.H;
                if (aVar == null) {
                    int i5 = iArr[contentType.ordinal()];
                    pih pihVar = this.K;
                    if (i5 == 1) {
                        pihVar.g = iah0.a(12);
                        d920Var.x0(pihVar);
                        nlhVar.getClass();
                        d920Var.x0(nlhVar);
                    } else if (i5 == 2) {
                        pihVar.g = iah0.a(12);
                        d920Var.x0(pihVar);
                        d920Var.x0(mlhVar);
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nlhVar.getClass();
                        d920Var.x0(pihVar);
                        d920Var.x0(new hlh(this.itemView.getContext().getString(R.string.profile_content_tab_playlists), 0, 2));
                        d920Var.x0(ffhVar);
                        d920Var.x0(new hlh(this.itemView.getContext().getString(R.string.profile_content_tab_video), iah0.a(10), 4));
                        d920Var.x0(mlhVar);
                    }
                } else {
                    int i6 = iArr[contentType.ordinal()];
                    if (i6 == 1) {
                        nlhVar.getClass();
                        d920Var.x0(nlhVar);
                    } else if (i6 == 2) {
                        d920Var.x0(mlhVar);
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nlhVar.getClass();
                        d920Var.x0(new hlh(this.itemView.getContext().getString(R.string.profile_content_tab_playlists), 0, 6));
                        d920Var.x0(ffhVar);
                        d920Var.x0(new hlh(this.itemView.getContext().getString(R.string.profile_content_tab_video), iah0.a(10), 4));
                        d920Var.x0(mlhVar);
                    }
                }
                recyclerPaginatedView.setAdapter(d920Var);
            }
            a2 = iah0.a(7);
        }
        i2 = a2;
        awt0.x(recyclerPaginatedView.getRecyclerView(), a3, i2, a3, 0, 8);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        d920 d920Var2 = new d920();
        aVar = sst0Var.p;
        ffh ffhVar2 = this.J;
        mlh mlhVar2 = this.G;
        nlh nlhVar2 = this.H;
        if (aVar == null) {
        }
        recyclerPaginatedView.setAdapter(d920Var2);
    }
}
