package xsna;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvd0;
import xsna.iij;
import xsna.klh;
import xsna.vjh;
import xsna.zjh;

/* compiled from: CommunityProfileContentPhotoViewHolder.kt */
/* loaded from: classes5.dex */
public final class gkh extends wjh<iea0> {
    public final zih E;
    public final kdg0 F;
    public final hlh G;
    public final zjh H;
    public final glh<PhotoAlbum, zjh.c> I;
    public final ffh J;
    public final hlh K;
    public final iij L;

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((vjh.b) this.receiver).b(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).d(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).e(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).g(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).f(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).a(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final class g extends m.e<Photo> {
        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Photo photo, Photo photo2) {
            return true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(Photo photo, Photo photo2) {
            return photo.c == photo2.c;
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<RecyclerView.e0, klh.b> {
        @Override // xsna.izs
        public final klh.b invoke(RecyclerView.e0 e0Var) {
            return ((gkh) this.receiver).b6(e0Var);
        }
    }

    /* compiled from: CommunityProfileContentPhotoViewHolder.kt */
    public static final class i extends GridLayoutManager.c {
        public final /* synthetic */ iea0 d;
        public final /* synthetic */ int e;

        public i(iea0 iea0Var, int i) {
            this.d = iea0Var;
            this.e = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            if (!this.d.l.l() || i > 2) {
                return 1;
            }
            return this.e;
        }
    }

    public gkh(View view, UserId userId, FragmentImpl fragmentImpl, zih zihVar, vjh.b bVar, kdg0 kdg0Var) {
        super(view, userId, fragmentImpl, new a(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new b(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new c(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new d(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new e(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new f(1, bVar, vjh.b.class, "onTabSecondButtonClicked", "onTabSecondButtonClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0));
        this.E = zihVar;
        this.F = kdg0Var;
        this.G = new hlh(view.getContext().getString(R.string.profile_content_tab_albums), 0, 6);
        zjh zjhVar = new zjh(kdg0Var, new vs(this, 27));
        this.H = zjhVar;
        glh<PhotoAlbum, zjh.c> glhVar = new glh<>(zjhVar, 108, new b3(this, 25));
        this.I = glhVar;
        float f2 = 0;
        this.J = new ffh(glhVar, userId, fragmentImpl, new h(1, this, gkh.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), iah0.a(f2), 0, 0, iah0.a(f2), null, 352);
        this.K = new hlh(view.getContext().getString(R.string.photos), iah0.a(10), 4);
        this.L = new iij(this, new WeakReference(this.w.getRecyclerView()), new com.vk.lists.a(new g()));
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
    }

    @Override // xsna.wjh
    public final void V5(iea0 iea0Var) {
        iea0 iea0Var2 = iea0Var;
        i6(iea0Var2);
        super.V5(iea0Var2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (recyclerPaginatedView.getRecyclerView().getAdapter() == null) {
            v6(iea0Var2);
        }
        cvd0.c cVar = iea0Var2.k;
        this.H.setItems(cVar != null ? cVar.a : EmptyList.b);
        if (iea0Var2.l.l()) {
            this.I.x0(iea0Var2.o);
        }
        cvd0.d dVar = iea0Var2.j;
        this.L.setItems(dVar != null ? dVar.a : EmptyList.b);
        CommunityProfileContentItem.State state = iea0Var2.u;
        if (state == CommunityProfileContentItem.State.LOADING) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(iea0 iea0Var) {
        iea0 iea0Var2 = iea0Var;
        return iea0Var2 != null && iea0Var2.n && iea0Var2.u.h();
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
        if (!(e0Var instanceof iij.a)) {
            if (!(e0Var instanceof zjh.c)) {
                return null;
            }
            return new klh.b(((PhotoAlbum) r8.m).b, CommonCommunitiesStat$TypeTabContentType.PHOTOS_ALBUMS, ((zjh.c) e0Var).getAbsoluteAdapterPosition(), null);
        }
        iij.a aVar = (iij.a) e0Var;
        long j = ((Photo) aVar.m).c;
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = CommonCommunitiesStat$TypeTabContentType.PHOTOS;
        int absoluteAdapterPosition = aVar.getAbsoluteAdapterPosition();
        iea0 iea0Var = (iea0) this.t;
        return new klh.b(j, commonCommunitiesStat$TypeTabContentType, absoluteAdapterPosition - ((iea0Var == null || (contentType = iea0Var.l) == null || !contentType.l()) ? 0 : 3), null);
    }

    @Override // xsna.wjh
    public final void m6(iea0 iea0Var) {
        this.x.setContent(new jai(1838061815, new jkg(iea0Var, 1), true));
    }

    @Override // xsna.wjh
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final void i6(iea0 iea0Var) {
        iea0 iea0Var2 = (iea0) this.t;
        if (iea0Var2 == null || iea0Var2.l == iea0Var.l) {
            return;
        }
        awt0.x(this.w, 0, 0, 0, 0, 10);
        wjh.j6(this.w.getRecyclerView());
        v6(iea0Var);
    }

    public final void v6(iea0 iea0Var) {
        CommunityProfileContentItem.ContentType contentType = iea0Var.l;
        int i2 = contentType.k() ? 3 : 2;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.c(i2);
        dVar.e = new i(iea0Var, i2);
        dVar.a();
        d920 d920Var = new d920();
        boolean l = contentType.l();
        iij iijVar = this.L;
        zjh zjhVar = this.H;
        if (l) {
            zjhVar.g = false;
            d920Var.x0(this.G);
            d920Var.x0(this.J);
            d920Var.x0(this.K);
            d920Var.x0(iijVar);
            recyclerPaginatedView.getRecyclerView().addItemDecoration(new ijh(3, iah0.a(2), 0, 3, 0, 48));
        } else if (contentType.h()) {
            zjhVar.g = true;
            d920Var.x0(zjhVar);
            recyclerPaginatedView.getRecyclerView().addItemDecoration(new ijh(2, iah0.a(2), iah0.a(6), 0, 0, 40));
            float f2 = 10;
            awt0.x(this.w, iah0.a(f2), 0, iah0.a(f2), 0, 10);
        } else {
            d920Var.x0(iijVar);
            recyclerPaginatedView.getRecyclerView().addItemDecoration(new ijh(3, iah0.a(2), iah0.a(6), 0, 0, 56));
        }
        recyclerPaginatedView.setAdapter(d920Var);
    }
}
