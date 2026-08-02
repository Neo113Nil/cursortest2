package xsna;

import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.tags.Tag;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.qdv;

/* compiled from: HorizontalGalleryHolder.kt */
/* loaded from: classes4.dex */
public final class sdv extends rp6<vdv, NewsEntry> implements qdv.e, qdv.g, qdv.f, UsableRecyclerView.o, ent0, i7o, FeedGoodsPhotoHolder, FeedGoodsPhotoHolder.a, View.OnAttachStateChangeListener, t0n, a1n, o0n, n880, gv9 {
    public static final /* synthetic */ int Q = 0;
    public final qdv<u1c0, qi6<?>> E;
    public final Object F;
    public a160 G;
    public ArrayList H;
    public final fp7 I;
    public final StringBuilder J;
    public io.reactivex.rxjava3.disposables.c K;
    public boolean L;
    public final u060 M;
    public final pdv N;
    public int O;
    public final SparseIntArray P;

    /* compiled from: HorizontalGalleryHolder.kt */
    public final class a implements ai5 {
        public final RecyclerView b;

        public a(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // xsna.ai5
        public final y9t0 Eh(int i) {
            u1c0 u1c0Var = (u1c0) sdv.this.N.c.c(i);
            if (u1c0Var == null) {
                return null;
            }
            return new y9t0(u1c0Var.a(), new ni5(u1c0Var.l, null, u1c0Var.e(), 10));
        }

        @Override // xsna.dkf0
        public final int getAdapterOffset() {
            return 0;
        }

        @Override // xsna.dkf0
        public final int getItemCount() {
            return sdv.this.N.getItemCount();
        }

        @Override // xsna.dkf0
        public final RecyclerView getRecyclerView() {
            return this.b;
        }

        @Override // xsna.ai5
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return VideoAutoPlayDelayType.FEED;
        }
    }

    /* compiled from: HorizontalGalleryHolder.kt */
    public final class b implements anw {
        public final float[] a = new float[8];

        public b() {
        }

        @Override // xsna.anw
        public final String a(int i) {
            sdv sdvVar = sdv.this;
            Object c = sdvVar.N.c.c(sdvVar.P.get(i));
            r74 r74Var = c instanceof r74 ? (r74) c : null;
            Attachment attachment = r74Var != null ? r74Var.q : null;
            DocumentAttachment documentAttachment = attachment instanceof DocumentAttachment ? (DocumentAttachment) attachment : null;
            if (documentAttachment != null) {
                return documentAttachment.f;
            }
            return null;
        }

        @Override // xsna.anw
        public final float[] b() {
            return this.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        
            if (r1 != true) goto L13;
         */
        @Override // xsna.anw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final View c(int i) {
            boolean z;
            View childAt;
            boolean z2;
            sdv sdvVar = sdv.this;
            int i2 = sdvVar.P.get(i);
            u1c0 u1c0Var = (u1c0) sdvVar.N.c.c(i2);
            if (u1c0Var != null) {
                if (u1c0Var instanceof r74) {
                    Attachment attachment = ((r74) u1c0Var).q;
                    if (attachment instanceof PhotoAttachment) {
                        z2 = ((PhotoAttachment) attachment).l.Hb();
                        z = true;
                    }
                }
                z2 = false;
                z = true;
            }
            z = false;
            if (z) {
                return null;
            }
            View findViewByPosition = sdvVar.E.d.findViewByPosition(i2);
            return (!(findViewByPosition instanceof ViewGroup) || (childAt = ((ViewGroup) findViewByPosition).getChildAt(0)) == null) ? findViewByPosition : childAt;
        }

        @Override // xsna.anw
        public final Rect d(int i) {
            sdv sdvVar = sdv.this;
            Object findViewHolderForAdapterPosition = sdvVar.E.c.findViewHolderForAdapterPosition(sdvVar.P.get(i));
            if (findViewHolderForAdapterPosition instanceof vmw) {
                return ((vmw) findViewHolderForAdapterPosition).F2();
            }
            return null;
        }

        @Override // xsna.anw
        public final void e(int i) {
            sdv sdvVar = sdv.this;
            qdv<u1c0, qi6<?>> qdvVar = sdvVar.E;
            int i2 = sdvVar.P.get(i);
            pdv pdvVar = sdvVar.N;
            if (pdvVar.getItemCount() <= 0 || qdvVar.getSnapPosition() % pdvVar.getItemCount() == i2) {
                return;
            }
            qdvVar.setCurrentItem(i2);
        }

        @Override // xsna.anw
        public final Integer f() {
            return sdv.this.E.getTotalCount();
        }

        @Override // xsna.anw
        public final Rect g() {
            return bwt0.F(sdv.this.E.getRecyclerView());
        }

        @Override // xsna.anw
        public final void h(ImageViewer.c<AttachmentWithMedia> cVar) {
            sdv.this.N(cVar);
        }
    }

    /* compiled from: HorizontalGalleryHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public sdv() {
        throw null;
    }

    public sdv(qdv qdvVar, qdv qdvVar2, ViewGroup viewGroup, h170 h170Var, d5r d5rVar) {
        super(qdvVar2, viewGroup);
        this.E = qdvVar;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.android.defaultplayer.interactive.b(17));
        this.I = new fp7();
        this.J = new StringBuilder();
        a aVar = new a(qdvVar.getRecyclerView());
        tev tevVar = tev.a;
        this.M = new u060(aVar, new uah0(0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 12));
        pdv pdvVar = new pdv(h170Var);
        pdvVar.h = d5rVar;
        pdvVar.j = new b();
        this.N = pdvVar;
        this.O = 0;
        this.P = new SparseIntArray(10);
        qdvVar.setAdapter(pdvVar);
        qdvVar.setOnPageChangedListener(this);
        qdvVar.setPaginationDelegate(this);
        qdvVar.setOnScrollStateChangeListener(this);
        qdvVar.addOnAttachStateChangeListener(this);
        qdvVar.setAutoPlayProvider(aVar);
        s6o s6oVar = this.q;
        if (s6oVar != null) {
            pdvVar.m = s6oVar;
        }
    }

    @Override // xsna.qdv.f
    public final void A(int i) {
        FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState;
        FeedGoodsPhotoHolder.b G5;
        this.O = ((this.O & MinElf.PN_XNUM) << 16) | (65535 & i);
        qdv<u1c0, qi6<?>> qdvVar = this.E;
        Object findViewHolderForAdapterPosition = qdvVar.c.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof FeedGoodsPhotoHolder) {
            Object findViewHolderForAdapterPosition2 = qdvVar.c.findViewHolderForAdapterPosition(this.O >> 16);
            FeedGoodsPhotoHolder feedGoodsPhotoHolder = findViewHolderForAdapterPosition2 instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) findViewHolderForAdapterPosition2 : null;
            if (feedGoodsPhotoHolder == null || (G5 = feedGoodsPhotoHolder.G5()) == null || (goodsVisibilityState = G5.getState()) == null) {
                goodsVisibilityState = FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN;
            }
            if (goodsVisibilityState != FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN) {
                ((FeedGoodsPhotoHolder) findViewHolderForAdapterPosition).c3(goodsVisibilityState);
            }
        }
    }

    @Override // xsna.qdv.e
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
            ArrayList arrayList = this.H;
            postInteract.l = i;
            if (arrayList != null && i < arrayList.size()) {
                postInteract.k = fdi.M(((r74) arrayList.get(i)).q);
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
        this.N.clear();
    }

    @Override // xsna.qdv.g
    public final void N(ImageViewer.c<AttachmentWithMedia> cVar) {
        sdv sdvVar;
        a160 a160Var = this.G;
        if (a160Var == null) {
            return;
        }
        vdv vdvVar = (vdv) this.C;
        Object q6 = vdvVar != null ? vdvVar.h : q6();
        io.reactivex.rxjava3.disposables.c cVar2 = null;
        fsx0 fsx0Var = q6 instanceof fsx0 ? (fsx0) q6 : null;
        if (fsx0Var == null) {
            return;
        }
        ArrayList arrayList = this.H;
        ArrayList arrayList2 = ttp0.f(arrayList) ? arrayList : null;
        List<EntryAttachment> N7 = fsx0Var.N7();
        if (N7 == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 a2 = this.I.a(fsx0Var);
        if (a2 != null) {
            h7h h7hVar = new h7h(N7, this, arrayList2, a160Var, cVar);
            sdvVar = this;
            cVar2 = a2.subscribe(new ph3(h7hVar, 28), new x8(new c(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 25));
        } else {
            sdvVar = this;
        }
        sdvVar.K = cVar2;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.N.m = s6oVar;
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.E;
    }

    @Override // xsna.n880
    public final View R3() {
        return this.itemView;
    }

    @Override // xsna.rp6
    public final void R6(vdv vdvVar) {
        vdv vdvVar2 = vdvVar;
        ArrayList arrayList = this.H;
        if (arrayList == null) {
            return;
        }
        a160 a160Var = this.G;
        int i = a160Var != null ? a160Var.f : 0;
        Object obj = a160Var != null ? a160Var.g : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int size = arrayList.size();
        fp7 fp7Var = this.I;
        fp7Var.a = size;
        fp7Var.b = false;
        fp7Var.c = true;
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.l = i;
            if (i < arrayList.size()) {
                postInteract.k = fdi.M(((r74) arrayList.get(i)).q);
            }
        }
        pdv pdvVar = this.N;
        pdvVar.setItems(arrayList);
        b7(arrayList, true);
        qdv<u1c0, qi6<?>> qdvVar = this.E;
        qdvVar.setShouldHideLabel(false);
        qdvVar.setTotalCount(num);
        qdvVar.setCurrentItem(i);
        qdvVar.requestLayout();
        qdvVar.setRatio(vdvVar2.k);
        pdvVar.n = this;
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
        zzq zzqVar = (zzq) this.F.getValue();
        Integer valueOf = Integer.valueOf(this.O & MinElf.PN_XNUM);
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
            List<u1c0> list = a160Var.q;
            ArrayList arrayList = new ArrayList();
            for (u1c0 u1c0Var2 : list) {
                r74 r74Var = u1c0Var2 instanceof r74 ? (r74) u1c0Var2 : null;
                if (r74Var != null) {
                    arrayList.add(r74Var);
                }
            }
            this.H = arrayList;
        }
        super.a6(u1c0Var);
        ArrayList arrayList2 = this.H;
        if (arrayList2 == null) {
            return;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r74 r74Var2 = (r74) it.next();
            s1c0 s1c0Var = r74Var2.n;
            if (s1c0Var != null) {
                s1c0 s1c0Var2 = this.x;
                r74Var2.n = s1c0.a(s1c0Var, s1c0Var2 != null ? s1c0Var2.u : false, s1c0Var2 != null ? s1c0Var2.H : true);
            }
        }
    }

    public final void b7(List<? extends r74> list, boolean z) {
        SparseIntArray sparseIntArray = this.P;
        int size = z ? 0 : sparseIntArray.size();
        if (z) {
            sparseIntArray.clear();
        }
        int size2 = list.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Attachment attachment = list.get(i2).q;
            if (((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) || ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib())) {
                sparseIntArray.append(i, size + i2);
                i++;
            }
        }
    }

    @Override // xsna.n880
    public final void i3() {
        Object findViewHolderForAdapterPosition = this.E.c.findViewHolderForAdapterPosition(0);
        n880 n880Var = findViewHolderForAdapterPosition instanceof n880 ? (n880) findViewHolderForAdapterPosition : null;
        if (n880Var != null) {
            n880Var.i3();
        }
    }

    @Override // xsna.qdv.f
    public final void l(int i) {
        Object findViewHolderForAdapterPosition = this.E.c.findViewHolderForAdapterPosition(i);
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
        return this.O & MinElf.PN_XNUM;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void n1() {
        Object findViewHolderForAdapterPosition = this.E.c.findViewHolderForAdapterPosition(this.O & MinElf.PN_XNUM);
        if (findViewHolderForAdapterPosition instanceof FeedGoodsPhotoHolder) {
            FeedGoodsPhotoHolder feedGoodsPhotoHolder = (FeedGoodsPhotoHolder) findViewHolderForAdapterPosition;
            if (feedGoodsPhotoHolder.G5().getState() == FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN) {
                ((zzq) this.F.getValue()).b = true;
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
        this.E.setPrefetchMediaEnabled(false);
    }

    @Override // xsna.gv9
    public final void p0() {
        this.E.setPrefetchMediaEnabled(true);
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
        zzq zzqVar = (zzq) this.F.getValue();
        zzqVar.c(tag.b, tag.d.b, zzqVar.b ? SchemeStat$FeedPinEntryPoint.TIMER : SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, Integer.valueOf(this.O & MinElf.PN_XNUM), str);
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
