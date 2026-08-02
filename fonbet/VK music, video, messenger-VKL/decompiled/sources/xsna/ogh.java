package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvd0;
import xsna.hgh;
import xsna.klh;
import xsna.vjh;
import xsna.xfh;
import xsna.yeh;

/* compiled from: CommunityProfileContentClipsViewHolder.kt */
/* loaded from: classes5.dex */
public final class ogh extends wjh<Clips> {
    public final zih E;
    public final vjh.b F;
    public final hlh G;
    public final hgh H;
    public final glh<ClipsPlaylist, RecyclerView.e0> I;
    public final ffh J;
    public final yeh K;
    public final xfh L;

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((vjh.b) this.receiver).b(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).d(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).e(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).g(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).f(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).a(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentClipsViewHolder.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<RecyclerView.e0, klh.b> {
        @Override // xsna.izs
        public final klh.b invoke(RecyclerView.e0 e0Var) {
            return ((ogh) this.receiver).b6(e0Var);
        }
    }

    public ogh(View view, UserId userId, FragmentImpl fragmentImpl, f8d f8dVar, zih zihVar, vjh.b bVar, gzs<s3q0> gzsVar) {
        super(view, userId, fragmentImpl, new a(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new b(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new c(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new d(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new e(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new f(1, bVar, vjh.b.class, "onTabSecondButtonClicked", "onTabSecondButtonClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0));
        this.E = zihVar;
        this.F = bVar;
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
        this.G = new hlh(view.getContext().getString(R.string.profile_content_tab_playlists), 0, 6);
        hgh hghVar = new hgh(new com.vk.movika.sdk.base.observable.w(this, 29), gzsVar);
        this.H = hghVar;
        glh<ClipsPlaylist, RecyclerView.e0> glhVar = new glh<>(hghVar, 56, new sv0(10));
        glhVar.f = true;
        this.I = glhVar;
        this.J = new ffh(glhVar, userId, fragmentImpl, new g(1, this, ogh.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), 0, 0, 0, 0, new p3h(this, 1), PsExtractor.VIDEO_STREAM_MASK);
        this.K = new yeh(new ss3(5, view, userId));
        this.L = new xfh(f8dVar, userId, new jd4(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    @Override // xsna.wjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V5(Clips clips) {
        boolean z;
        Clips clips2 = clips;
        cvd0.f fVar = clips2.j;
        List<ClipsPlaylist> list = clips2.k;
        Integer num = clips2.z;
        boolean z2 = clips2.A;
        i6(clips2);
        super.V5(clips2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        RecyclerView.Adapter adapter = recyclerPaginatedView.getRecyclerView().getAdapter();
        xfh xfhVar = this.L;
        ffh ffhVar = this.J;
        yeh yehVar = this.K;
        if (adapter == null && fVar != null) {
            boolean z3 = z2 && num != null;
            if (z2) {
                ArrayList arrayList = fVar.a;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((VideoFile) it.next()).getType(), "short_video")) {
                            break;
                        }
                    }
                }
            }
            if (list == null || !(!list.isEmpty())) {
                z = false;
                AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
                dVar.c(3);
                dVar.e = new pgh(z, z3);
                dVar.a();
                recyclerPaginatedView.getRecyclerView().addItemDecoration(new ijh(3, iah0.a(2), iah0.a(6), !z ? 3 : z3 ? 1 : 0, 0, 48));
                d920 d920Var = new d920();
                if (!z) {
                    d920Var.x0(this.G);
                    d920Var.x0(ffhVar);
                    d920Var.x0(yehVar);
                } else if (z3) {
                    d920Var.x0(yehVar);
                }
                d920Var.x0(xfhVar);
                recyclerPaginatedView.setAdapter(d920Var);
            }
            z = true;
            AbstractPaginatedView.d dVar2 = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
            dVar2.c(3);
            dVar2.e = new pgh(z, z3);
            dVar2.a();
            recyclerPaginatedView.getRecyclerView().addItemDecoration(new ijh(3, iah0.a(2), iah0.a(6), !z ? 3 : z3 ? 1 : 0, 0, 48));
            d920 d920Var2 = new d920();
            if (!z) {
            }
            d920Var2.x0(xfhVar);
            recyclerPaginatedView.setAdapter(d920Var2);
        }
        yehVar.setItems(Collections.singletonList(new yeh.a(this.itemView.getContext().getString(R.string.profile_content_tab_clips), (!z2 || num == null) ? null : enj.f(R.plurals.profile_content_invitation_count, num.intValue(), this.itemView.getContext()))));
        xfhVar.setItems(fVar != null ? fVar.a : EmptyList.b);
        hgh hghVar = this.H;
        hghVar.g = z2;
        hghVar.setItems(list == null ? EmptyList.b : list);
        CommunityProfileContentItem.State state = clips2.v;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        boolean z4 = state == state2;
        glh<ClipsPlaylist, RecyclerView.e0> glhVar = this.I;
        zoj0<ClipsPlaylist, RecyclerView.e0> zoj0Var = glhVar.c;
        if (z4 && glhVar.g) {
            throw new IllegalStateException("only one of showAllVisible && isLoadingNextVisible can be true");
        }
        if (glhVar.h != z4) {
            if (z4) {
                glhVar.notifyItemInserted(zoj0Var.getItemCount());
            } else {
                glhVar.notifyItemRemoved(zoj0Var.getItemCount());
            }
            glhVar.h = z4;
        }
        if (list != null && (!list.isEmpty())) {
            ffhVar.notifyItemChanged(0);
        }
        CommunityProfileContentItem.State state3 = clips2.u;
        if (state3 == state2) {
            recyclerPaginatedView.lb();
        } else if (state3 == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(Clips clips) {
        Clips clips2 = clips;
        return clips2 != null && clips2.n && clips2.u.h();
    }

    @Override // xsna.wjh
    public final void a6() {
        super.a6();
        this.J.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        List<ClipsPlaylist> list;
        if (!(e0Var instanceof xfh.a)) {
            if (!(e0Var instanceof hgh.c)) {
                return null;
            }
            return new klh.b(((ClipsPlaylist) r9.m).b, CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS_PLAYLISTS, ((hgh.c) e0Var).getAbsoluteAdapterPosition(), null);
        }
        xfh.a aVar = (xfh.a) e0Var;
        long o0 = ((VideoFile) aVar.m).o0();
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS;
        int absoluteAdapterPosition = aVar.getAbsoluteAdapterPosition();
        Clips clips = (Clips) this.t;
        int i = 1;
        if (clips == null || (list = clips.k) == null || !(!list.isEmpty())) {
            Clips clips2 = (Clips) this.t;
            if ((clips2 != null ? clips2.z : null) == null) {
                i = 0;
            }
        } else {
            i = 3;
        }
        return new klh.b(o0, commonCommunitiesStat$TypeTabContentType, absoluteAdapterPosition - i, ((VideoFile) aVar.m).r());
    }

    @Override // xsna.wjh
    public final void m6(Clips clips) {
        this.x.setContent(new jai(-1395810371, new gd4(clips, 1), true));
    }

    @Override // xsna.wjh
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final void i6(Clips clips) {
        Clips clips2 = (Clips) this.t;
        if (clips2 == null) {
            return;
        }
        if (clips2.l == clips.l && !clips.B) {
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        wjh.j6(recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.getRecyclerView().setAdapter(null);
    }
}
