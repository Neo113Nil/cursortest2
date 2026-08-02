package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.tags.Tag;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.newsfeed.common.views.gallery.HorizontalGalleryView;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.data.PostInteract;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: HorizontalGalleryHolderOld.kt */
/* loaded from: classes4.dex */
public final class tdv extends rp6<vdv, NewsEntry> implements HorizontalGalleryView.g, HorizontalGalleryView.i, HorizontalGalleryView.h, UsableRecyclerView.o, ent0, i7o, FeedGoodsPhotoHolder, FeedGoodsPhotoHolder.a, View.OnAttachStateChangeListener, t0n, a1n, o0n, n880, gv9 {
    public static final /* synthetic */ int O = 0;
    public final Object E;
    public final HorizontalGalleryView F;
    public a160 G;
    public List<? extends r74> H;
    public final fp7 I;
    public final StringBuilder J;
    public io.reactivex.rxjava3.disposables.c K;
    public boolean L;
    public final u060 M;
    public int N;

    /* compiled from: HorizontalGalleryHolderOld.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public tdv(HorizontalGalleryView horizontalGalleryView, ViewGroup viewGroup) {
        super(horizontalGalleryView, viewGroup);
        this.E = msy.a(LazyThreadSafetyMode.NONE, new fc(15));
        HorizontalGalleryView horizontalGalleryView2 = (HorizontalGalleryView) horizontalGalleryView.findViewById(R.id.container);
        this.F = horizontalGalleryView2;
        this.I = new fp7();
        this.J = new StringBuilder();
        ai5 autoPlayProvider = horizontalGalleryView2.getAutoPlayProvider();
        tev tevVar = tev.a;
        this.M = new u060(autoPlayProvider, new uah0(0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 12));
        this.N = 0;
        horizontalGalleryView2.setOnPageChangedListener(this);
        horizontalGalleryView2.setPaginationDelegate(this);
        horizontalGalleryView2.setOnScrollStateChangeListener(this);
        horizontalGalleryView2.addOnAttachStateChangeListener(this);
        s6o s6oVar = this.q;
        if (s6oVar != null) {
            horizontalGalleryView2.setDoubleLikeHelper(s6oVar);
        }
    }

    @Override // com.vk.newsfeed.common.views.gallery.HorizontalGalleryView.h
    public final void A(int i) {
        FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState;
        FeedGoodsPhotoHolder.b G5;
        this.N = ((this.N & MinElf.PN_XNUM) << 16) | (65535 & i);
        HorizontalGalleryView horizontalGalleryView = this.F;
        Object findViewHolderForAdapterPosition = horizontalGalleryView.c.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof FeedGoodsPhotoHolder) {
            Object findViewHolderForAdapterPosition2 = horizontalGalleryView.c.findViewHolderForAdapterPosition(this.N >> 16);
            FeedGoodsPhotoHolder feedGoodsPhotoHolder = findViewHolderForAdapterPosition2 instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) findViewHolderForAdapterPosition2 : null;
            if (feedGoodsPhotoHolder == null || (G5 = feedGoodsPhotoHolder.G5()) == null || (goodsVisibilityState = G5.getState()) == null) {
                goodsVisibilityState = FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN;
            }
            if (goodsVisibilityState != FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN) {
                ((FeedGoodsPhotoHolder) findViewHolderForAdapterPosition).c3(goodsVisibilityState);
            }
        }
    }

    @Override // com.vk.newsfeed.common.views.gallery.HorizontalGalleryView.g
    public final void C0(int i) {
        PostInteract.Type type;
        NewsEntry.TrackData Cb;
        a160 a160Var = this.G;
        int i2 = a160Var != null ? a160Var.f : 0;
        if (a160Var != null) {
            a160Var.f = i;
        }
        NewsEntry t6 = t6();
        if (t6 != null && (Cb = t6.Cb()) != null) {
            Cb.i = i;
        }
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            List<? extends r74> list = this.H;
            postInteract.l = i;
            if (list != null && i < list.size()) {
                postInteract.k = fdi.M(list.get(i).q);
            }
        }
        PostInteract postInteract2 = this.w;
        if (postInteract2 != null) {
            if (i2 < i) {
                type = PostInteract.Type.click_next;
            } else if (i2 <= i) {
                return;
            } else {
                type = PostInteract.Type.click_previous;
            }
            postInteract2.zb(type);
        }
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.itemView;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final FeedGoodsPhotoHolder.b G5() {
        return new io.reactivex.rxjava3.internal.operators.mixed.k(14);
    }

    @Override // xsna.qi6
    public final void I6() {
        this.F.h.clear();
    }

    @Override // com.vk.newsfeed.common.views.gallery.HorizontalGalleryView.i
    public final void N(ImageViewer.c<AttachmentWithMedia> cVar) {
        a160 a160Var = this.G;
        if (a160Var == null) {
            return;
        }
        vdv vdvVar = (vdv) this.C;
        Object q6 = vdvVar != null ? vdvVar.h : q6();
        fsx0 fsx0Var = q6 instanceof fsx0 ? (fsx0) q6 : null;
        if (fsx0Var == null) {
            return;
        }
        List<? extends r74> list = this.H;
        List<? extends r74> list2 = ttp0.f(list) ? list : null;
        List<EntryAttachment> N7 = fsx0Var.N7();
        if (N7 == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 a2 = this.I.a(fsx0Var);
        this.K = a2 != null ? a2.subscribe(new qz(new k2e(N7, this, list2, a160Var, cVar, 1), 22), new lav(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 1)) : null;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.F.setDoubleLikeHelper(s6oVar);
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.F;
    }

    @Override // xsna.n880
    public final View R3() {
        return this.itemView;
    }

    @Override // xsna.rp6
    public final void R6(vdv vdvVar) {
        vdv vdvVar2 = vdvVar;
        List<? extends r74> list = this.H;
        if (list == null) {
            return;
        }
        a160 a160Var = this.G;
        int i = a160Var != null ? a160Var.f : 0;
        Object obj = a160Var != null ? a160Var.g : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int size = list.size();
        fp7 fp7Var = this.I;
        fp7Var.a = size;
        fp7Var.b = false;
        fp7Var.c = true;
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.l = i;
            if (i < list.size()) {
                postInteract.k = fdi.M(list.get(i).q);
            }
        }
        HorizontalGalleryView horizontalGalleryView = this.F;
        horizontalGalleryView.setShouldHideLabel(false);
        horizontalGalleryView.b(list, true);
        horizontalGalleryView.setTotalCount(num);
        horizontalGalleryView.h.setItems(list);
        horizontalGalleryView.setCurrentItem(i);
        horizontalGalleryView.requestLayout();
        horizontalGalleryView.setRatio(vdvVar2.k);
        horizontalGalleryView.setPinController(this);
        this.L = false;
        this.itemView.setContentDescription(null);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.L = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder.a
    public final void a4(String str) {
        zzq zzqVar = (zzq) this.E.getValue();
        Integer valueOf = Integer.valueOf(this.N & MinElf.PN_XNUM);
        zzqVar.getClass();
        zzqVar.a(SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, str, valueOf, null);
    }

    @Override // xsna.o0n
    public final void a5() {
        awt0.q(this.itemView);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof a160) {
            a160 a160Var = (a160) u1c0Var;
            this.G = a160Var;
            this.H = a160Var.q;
        }
        super.a6(u1c0Var);
        List<? extends r74> list = this.H;
        if (list == null) {
            return;
        }
        for (r74 r74Var : list) {
            s1c0 s1c0Var = r74Var.n;
            if (s1c0Var != null) {
                s1c0 s1c0Var2 = this.x;
                r74Var.n = s1c0.a(s1c0Var, s1c0Var2 != null ? s1c0Var2.u : false, s1c0Var2 != null ? s1c0Var2.H : true);
            }
        }
    }

    @Override // xsna.n880
    public final void i3() {
        Object findViewHolderForAdapterPosition = this.F.c.findViewHolderForAdapterPosition(0);
        n880 n880Var = findViewHolderForAdapterPosition instanceof n880 ? (n880) findViewHolderForAdapterPosition : null;
        if (n880Var != null) {
            n880Var.i3();
        }
    }

    @Override // com.vk.newsfeed.common.views.gallery.HorizontalGalleryView.h
    public final void l(int i) {
        Object findViewHolderForAdapterPosition = this.F.c.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof FeedGoodsPhotoHolder) {
            FeedGoodsPhotoHolder feedGoodsPhotoHolder = (FeedGoodsPhotoHolder) findViewHolderForAdapterPosition;
            if (feedGoodsPhotoHolder.G5().getState() == FeedGoodsPhotoHolder.GoodsVisibilityState.VISIBLE) {
                feedGoodsPhotoHolder.z5();
            } else {
                feedGoodsPhotoHolder.V1();
            }
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder.a
    public final int m2() {
        return this.N & MinElf.PN_XNUM;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void n1() {
        Object findViewHolderForAdapterPosition = this.F.c.findViewHolderForAdapterPosition(this.N & MinElf.PN_XNUM);
        if (findViewHolderForAdapterPosition instanceof FeedGoodsPhotoHolder) {
            FeedGoodsPhotoHolder feedGoodsPhotoHolder = (FeedGoodsPhotoHolder) findViewHolderForAdapterPosition;
            if (feedGoodsPhotoHolder.G5().getState() == FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN) {
                ((zzq) this.E.getValue()).b = true;
            }
            feedGoodsPhotoHolder.n1();
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.L;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.K;
        if (cVar != null) {
            cVar.dispose();
        }
        this.K = null;
        this.F.setPrefetchMediaEnabled(false);
    }

    @Override // xsna.gv9
    public final void p0() {
        this.F.setPrefetchMediaEnabled(true);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.M;
    }

    @Override // xsna.n880
    public final void s4(String str) {
        StringBuilder sb = this.J;
        sb.setLength(0);
        if (!myc0.f(this.itemView.getContentDescription())) {
            this.itemView.setContentDescription(str);
            return;
        }
        sb.append(this.itemView.getContentDescription());
        sb.append(" ");
        sb.append(str);
        this.itemView.setContentDescription(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder.a
    public final void x1(Tag tag, String str) {
        zzq zzqVar = (zzq) this.E.getValue();
        zzqVar.c(tag.b, tag.d.b, zzqVar.b ? SchemeStat$FeedPinEntryPoint.TIMER : SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, Integer.valueOf(this.N & MinElf.PN_XNUM), str);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void V1() {
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void z5() {
    }

    @Override // xsna.n880
    public final void Y0(izs<? super o880, s3q0> izsVar) {
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void c3(FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState) {
    }

    @Override // xsna.n880
    public final void i2(izs<? super o880, s3q0> izsVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void u5(FeedGoodsPhotoHolder.a aVar) {
    }
}
