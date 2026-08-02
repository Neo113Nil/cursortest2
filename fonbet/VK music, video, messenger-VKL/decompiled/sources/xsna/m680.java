package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.ImageViewer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedZoomPhoto;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.h2r;
import xsna.p5t;

/* compiled from: OnGridAttachClickListenerImpl.kt */
/* loaded from: classes4.dex */
public final class m680 implements l680, h2r.a {
    public final ViewGroup b;
    public final FunctionReferenceImpl c;
    public final izs<Integer, float[]> d;
    public final ng30 e;
    public final izs<NewsfeedExternalAction, s3q0> f;
    public ImageViewer.c<AttachmentWithMedia> g;
    public final bpn0 h = new bpn0(new ko00(this, 13));
    public NewsEntry i;
    public PostInteract j;
    public String k;
    public s1c0 l;

    /* JADX WARN: Multi-variable type inference failed */
    public m680(ViewGroup viewGroup, izs izsVar, p5t.d dVar, ng30 ng30Var, izs izsVar2) {
        this.b = viewGroup;
        this.c = (FunctionReferenceImpl) izsVar;
        this.d = dVar;
        this.e = ng30Var;
        this.f = izsVar2;
    }

    @Override // xsna.h2r.a
    public final void E4(PhotoAttachment photoAttachment) {
        ViewGroup viewGroup = this.b;
        viewGroup.requestDisallowInterceptTouchEvent(true);
        c(viewGroup.getContext(), photoAttachment, PostInteract.Type.zoom_photo, new doi(this, 2));
    }

    @Override // xsna.h2r.a
    public final void W(float f, float f2, float f3, float f4, float f5) {
        ImageViewer.c<AttachmentWithMedia> cVar = this.g;
        ImageViewer.e eVar = cVar instanceof ImageViewer.e ? (ImageViewer.e) cVar : null;
        if (eVar == null) {
            return;
        }
        eVar.n(f, f2, f3, f4, f5);
    }

    @Override // xsna.l680
    public final void a(de6<?> de6Var, Attachment attachment, v64<? extends Attachment> v64Var, View view) {
        NewsEntry newsEntry;
        Attachment a2;
        Context context = view.getContext();
        if (v64Var != null && (a2 = v64Var.a()) != null) {
            attachment = a2;
        }
        b().f = de6Var instanceof y9a0 ? (y9a0) de6Var : null;
        if (attachment instanceof AlbumAttachment) {
            tfa0.a.getClass();
            hd60.a().z0(context, tfa0.b((AlbumAttachment) attachment), this.k);
            return;
        }
        boolean z = attachment instanceof PhotoAttachment;
        ng30 ng30Var = this.e;
        if (z || (attachment instanceof DocumentAttachment)) {
            NewsEntry newsEntry2 = this.i;
            if (newsEntry2 != null && ng30Var != null) {
                ng30Var.a(newsEntry2);
            }
            c(context, attachment, PostInteract.Type.open_photo, new sz7(this, 2));
            return;
        }
        if (attachment instanceof MarketAlbumAttachment) {
            GoodAlbum goodAlbum = ((MarketAlbumAttachment) attachment).f;
            if (goodAlbum == null) {
                return;
            }
            hd60.a().G0(context, goodAlbum);
            return;
        }
        if (attachment instanceof VideoAttachment) {
            NewsEntry newsEntry3 = this.i;
            if (newsEntry3 == null || ng30Var == null) {
                return;
            }
            ng30Var.a(newsEntry3);
            return;
        }
        if (!(attachment instanceof AudioAttachment) || (newsEntry = this.i) == null || ng30Var == null) {
            return;
        }
        ng30Var.a(newsEntry);
    }

    public final a b() {
        return (a) this.h.getValue();
    }

    public final void c(Context context, Attachment attachment, PostInteract.Type type, yzs<? super Integer, ? super List<? extends AttachmentWithMedia>, ? super Activity, ? extends ImageViewer.c<AttachmentWithMedia>> yzsVar) {
        if (this.g != null) {
            return;
        }
        Parcelable parcelable = this.i;
        fsx0 fsx0Var = parcelable instanceof fsx0 ? (fsx0) parcelable : null;
        List<EntryAttachment> N7 = fsx0Var != null ? fsx0Var.N7() : null;
        if (N7 != null) {
            ArrayList arrayList = new ArrayList();
            int size = N7.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Attachment attachment2 = N7.get(i2).b;
                if (attachment == attachment2) {
                    i = arrayList.size();
                }
                if ((attachment2 instanceof PhotoAttachment) && !(attachment2 instanceof AlbumAttachment)) {
                    arrayList.add(attachment2);
                } else if ((attachment2 instanceof DocumentAttachment) && ((DocumentAttachment) attachment2).Ib()) {
                    arrayList.add(attachment2);
                }
            }
            PostInteract postInteract = this.j;
            if (postInteract != null) {
                postInteract.zb(type);
            }
            Integer valueOf = fsx0Var instanceof Photos ? Integer.valueOf(((Photos) fsx0Var).r) : null;
            b().e = i;
            Activity h = e3m.h(context);
            if (h != null) {
                b().d = valueOf;
                a b = b();
                int size2 = N7.size();
                fp7 fp7Var = b.a;
                fp7Var.a = size2;
                fp7Var.b = false;
                fp7Var.c = true;
                this.g = yzsVar.invoke(Integer.valueOf(i), arrayList, h);
            }
        }
    }

    @Override // xsna.h2r.a
    public final void m() {
        ImageViewer.c<AttachmentWithMedia> cVar = this.g;
        ImageViewer.e eVar = cVar instanceof ImageViewer.e ? (ImageViewer.e) cVar : null;
        if (eVar == null) {
            return;
        }
        eVar.m();
    }

    /* compiled from: OnGridAttachClickListenerImpl.kt */
    public final class a implements ImageViewer.a {
        public io.reactivex.rxjava3.disposables.c c;
        public Integer d;
        public y9a0 f;
        public final fp7 a = new fp7();
        public final ArrayList<Pair<Integer, View>> b = new ArrayList<>(10);
        public int e = -1;

        public a() {
        }

        public static void k(View view) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        k(childAt);
                    }
                }
                return;
            }
            VKEnhancedImageView vKEnhancedImageView = view instanceof VKEnhancedImageView ? (VKEnhancedImageView) view : null;
            if (vKEnhancedImageView != null) {
                qcy<Object>[] qcyVarArr = VKEnhancedImageView.N;
                vKEnhancedImageView.X0(false);
                return;
            }
            FrescoImageView frescoImageView = view instanceof FrescoImageView ? (FrescoImageView) view : null;
            if (frescoImageView != null) {
                int i2 = FrescoImageView.R;
                frescoImageView.j(false);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
            m680.this.f.invoke(NewsfeedExternalAction.e.b.a);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
            NewsEntry.TrackData Cb;
            EntryAttachment entryAttachment;
            m680 m680Var = m680.this;
            Parcelable parcelable = m680Var.i;
            fsx0 fsx0Var = parcelable instanceof fsx0 ? (fsx0) parcelable : null;
            if (fsx0Var == null) {
                return;
            }
            List<EntryAttachment> N7 = fsx0Var.N7();
            Attachment attachment = (N7 == null || (entryAttachment = (EntryAttachment) j5g.b0(i, N7)) == null) ? null : entryAttachment.b;
            PhotoAttachment photoAttachment = attachment instanceof PhotoAttachment ? (PhotoAttachment) attachment : null;
            if (photoAttachment == null) {
                return;
            }
            Photo photo = photoAttachment.l;
            Integer valueOf = Integer.valueOf(photo.c);
            UserId userId = photo.e;
            Long valueOf2 = userId != null ? Long.valueOf(userId.b) : null;
            NewsEntry newsEntry = m680Var.i;
            MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto = new MobileOfficialAppsFeedStat$TypeFeedZoomPhoto(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, null, null, null, (newsEntry == null || (Cb = newsEntry.Cb()) == null) ? null : Cb.b, null, 46, null), MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint.PHOTO_VIEWER, valueOf, valueOf2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            UiTrackingScreen b = UiTracker.j.b();
            new iid0(c, SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, mobileOfficialAppsFeedStat$TypeFeedZoomPhoto, 1)).q();
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            int intValue;
            ArrayList<Pair<Integer, View>> arrayList = this.b;
            arrayList.clear();
            m680 m680Var = m680.this;
            ViewGroup viewGroup = m680Var.b;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null && ((intValue = ((Number) m680Var.c.invoke(Integer.valueOf(i2))).intValue()) == 0 || intValue == 4 || intValue == 5 || intValue == 10 || intValue == 11)) {
                    arrayList.add(new Pair<>(Integer.valueOf(intValue), childAt));
                }
            }
            Pair pair = (Pair) j5g.b0(i, arrayList);
            if (pair == null) {
                return null;
            }
            int intValue2 = ((Number) pair.d()).intValue();
            View view = (View) pair.g();
            if (intValue2 == 10 || intValue2 == 11) {
                return null;
            }
            return view;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            y9a0 y9a0Var;
            if (i != this.e || (y9a0Var = this.f) == null) {
                return null;
            }
            ?? r0 = y9a0Var.o;
            if (!((chk) r0.getValue()).b()) {
                return null;
            }
            RectF rectF = new RectF(bwt0.C(y9a0Var.m));
            ((chk) r0.getValue()).a(rectF).mapRect(rectF);
            Rect rect = new Rect();
            rectF.roundOut(rect);
            return rect;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return this.d;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            ViewGroup viewGroup = m680.this.b;
            y9a0 y9a0Var = this.f;
            if (y9a0Var == null || !((chk) y9a0Var.o.getValue()).b()) {
                return bwt0.F(viewGroup);
            }
            Object parent = y9a0Var.m.getParent();
            if (parent != null) {
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    return bwt0.F(view);
                }
            }
            return bwt0.F(viewGroup);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            NewsEntry.TrackData Cb;
            NewsEntry newsEntry = m680.this.i;
            if (newsEntry == null || (Cb = newsEntry.Cb()) == null) {
                return null;
            }
            return Cb.b;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        @SuppressLint({"CheckResult"})
        public final void o() {
            List<EntryAttachment> N7;
            io.reactivex.rxjava3.internal.operators.observable.j1 a;
            m680 m680Var = m680.this;
            Parcelable parcelable = m680Var.i;
            fsx0 fsx0Var = parcelable instanceof fsx0 ? (fsx0) parcelable : null;
            if (fsx0Var == null || (N7 = fsx0Var.N7()) == null || (a = this.a.a(fsx0Var)) == null) {
                return;
            }
            this.c = a.subscribe(new sh6(new vh9(N7, this, m680Var, 11), 29), new m330(new dn20(m680Var, 11), 7));
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            m680 m680Var = m680.this;
            m680Var.f.invoke(NewsfeedExternalAction.e.a.a);
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            m680Var.g = null;
            this.b.clear();
            this.e = -1;
            this.f = null;
            k(m680Var.b);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            float[] invoke;
            izs<Integer, float[]> izsVar = m680.this.d;
            if (izsVar == null || (invoke = izsVar.invoke(Integer.valueOf(i))) == null) {
                return null;
            }
            return invoke;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
