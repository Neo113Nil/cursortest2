package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import xsna.gwn;
import xsna.h120;
import xsna.idg0;

/* compiled from: VkMeCallback.kt */
/* loaded from: classes6.dex */
public final class q3v0 extends com.vk.photoviewer.b<AttachWithImage> {
    public final ImageViewer.a d;
    public final kbj0 e;
    public ArrayList f;
    public final Long g;
    public final boolean h;
    public final UserId i;
    public final idg0 j;
    public final gwn k;
    public final ww50<?> l;
    public final y1q0 m;
    public final int n;
    public final z520 o;
    public h120 p;
    public b q;
    public final io.reactivex.rxjava3.disposables.b r;
    public int s;

    /* compiled from: VkMeCallback.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageViewer.SwipeDirection.values().length];
            try {
                iArr[ImageViewer.SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageViewer.SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VkMeCallback.kt */
    public static final class b implements fcn {
        public final /* synthetic */ PhotoViewer b;

        public b(PhotoViewer photoViewer) {
            this.b = photoViewer;
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            ViewPropertyAnimator e;
            PhotoViewer photoViewer = this.b;
            PhotoViewerLayout photoViewerLayout = photoViewer.w;
            if (photoViewerLayout.isAttachedToWindow() && photoViewer.l == null) {
                e = d3m.e(photoViewerLayout, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                photoViewer.l = e.withStartAction(new wc2(photoViewer, 13)).withEndAction(new nx3(photoViewer, 12));
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q3v0(PhotoViewer.b bVar, Activity activity, ImageViewer.a aVar, kbj0 kbj0Var, ArrayList arrayList, Long l, boolean z, UserId userId, idg0 idg0Var, gwn gwnVar) {
        super(bVar);
        this.d = aVar;
        this.e = kbj0Var;
        this.f = arrayList;
        this.g = l;
        this.h = z;
        this.i = userId;
        this.j = idg0Var;
        this.k = gwnVar;
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        this.l = ey50Var != null ? ey50Var.Y() : null;
        y1q0 y1q0Var = new y1q0(0);
        y1q0Var.b();
        this.m = y1q0Var;
        this.n = cn70.b(32);
        this.o = new z520(aVar, activity, null, null, null, userId);
        this.r = new io.reactivex.rxjava3.disposables.b();
        this.s = -1;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final View B(fnw fnwVar, int i) {
        gwn gwnVar = this.k;
        if (gwnVar != null) {
            return gwnVar.a(fnwVar, i);
        }
        return null;
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.b
    public final void C(int i) {
        gwn.a aVar;
        gwn gwnVar = this.k;
        if (gwnVar == null || (aVar = gwnVar.e) == null) {
            return;
        }
        float f = -(i + (aVar.getRootWindowInsets() != null ? bqx0.h(null, r1).a.i(2).d : 0));
        aVar.h.setTranslationY(f);
        aVar.i.setTranslationY(f);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final View E(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
        return this.j.a((fnw) viewGroup, i, (btm) gzsVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final int F(int i) {
        if (u(i)) {
            return 0;
        }
        ImageViewer.ControlsOptions u = this.o.b.u();
        boolean z = u.b;
        if (z) {
            return R.menu.photo_viewer_overflow;
        }
        if (z || !u.f) {
            return 0;
        }
        return R.menu.photo_viewer_attach_only;
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.b
    public final void M(ImageViewer.SwipeDirection swipeDirection, boolean z) {
        AttachWithImage attachWithImage;
        int i = a.$EnumSwitchMapping$0[swipeDirection.ordinal()];
        if (i == 1) {
            attachWithImage = (AttachWithImage) this.f.get(0);
        } else if (i != 2) {
            attachWithImage = (AttachWithImage) j5g.b0(this.s, this.f);
            if (attachWithImage == null) {
                return;
            }
        } else {
            attachWithImage = (AttachWithImage) xy9.b(1, this.f);
        }
        AttachForMediaViewer attachForMediaViewer = attachWithImage instanceof AttachForMediaViewer ? (AttachForMediaViewer) attachWithImage : null;
        if (attachForMediaViewer == null) {
            return;
        }
        this.d.v(attachForMediaViewer, swipeDirection, z);
    }

    public final AttachmentWithMedia Q(int i) {
        AttachWithImage attachWithImage = (AttachWithImage) j5g.b0(i, this.f);
        Attachment b2 = attachWithImage != null ? wdw.b(attachWithImage, null, false, 6) : null;
        if (b2 instanceof AttachmentWithMedia) {
            return (AttachmentWithMedia) b2;
        }
        return null;
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.a
    public final void j(PhotoViewer photoViewer) {
        super.j(photoViewer);
        b bVar = new b(photoViewer);
        this.q = bVar;
        ww50<?> ww50Var = this.l;
        if (ww50Var != null) {
            ww50Var.S(bVar);
        }
        z520 z520Var = this.o;
        z520Var.getClass();
        z520Var.h = new io.reactivex.rxjava3.disposables.b();
        z520Var.m = photoViewer;
        ComponentCallbacks2 componentCallbacks2 = z520Var.c;
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.Li(z520Var);
        }
        idg0 idg0Var = this.j;
        idg0Var.getClass();
        ce60.b.getClass();
        p870 f = p870.f();
        idg0.a aVar = idg0Var.c;
        f.b(130, aVar);
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, aVar);
    }

    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void n(int i, PhotoViewer.q qVar) {
        this.s = i;
        String str = null;
        if (u(i)) {
            h120 h120Var = this.p;
            if (h120Var == null) {
                h120Var = null;
            }
            h120Var.b(false);
        } else {
            h120 h120Var2 = this.p;
            if (h120Var2 == null) {
                h120Var2 = null;
            }
            h120Var2.b(this.d.u().a && this.h);
        }
        AttachWithImage attachWithImage = (AttachWithImage) j5g.b0(i, this.f);
        if (attachWithImage == null) {
            attachWithImage = null;
        } else if (attachWithImage instanceof AttachImage) {
            UiTrackingScreen uiTrackingScreen = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_BROWSER);
            AttachImage attachImage = (AttachImage) attachWithImage;
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PHOTO, Long.valueOf(attachImage.e), Long.valueOf(attachImage.d.b), null, null, null, 32, null);
            this.m.c(uiTrackingScreen, true);
        }
        UserId q = attachWithImage instanceof AttachImage ? ((AttachImage) attachWithImage).p : attachWithImage != null ? attachWithImage.q() : null;
        if (q == null || !(fkq0.d(q) || fkq0.b(q))) {
            h120 h120Var3 = this.p;
            d3m.e((h120Var3 != null ? h120Var3 : null).b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        h120 h120Var4 = this.p;
        if (h120Var4 == null) {
            h120Var4 = null;
        }
        h120.a aVar = h120Var4.k;
        if (!epx.f(aVar != null ? aVar.a : null, q)) {
            h120 h120Var5 = this.p;
            if (h120Var5 == null) {
                h120Var5 = null;
            }
            d3m.e(h120Var5.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        h120 h120Var6 = this.p;
        h120 h120Var7 = h120Var6 == null ? null : h120Var6;
        h120.a aVar2 = new h120.a(q, "", "");
        if (h120Var6 == null) {
            h120Var6 = null;
        }
        ssx0 ssx0Var = attachWithImage instanceof ssx0 ? (ssx0) attachWithImage : null;
        Long valueOf = ssx0Var != null ? Long.valueOf(ssx0Var.D()) : null;
        h120Var6.getClass();
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            dn30 dn30Var = h120Var6.j;
            StringBuilder sb = dn30Var.d;
            ?? r5 = dn30Var.b;
            ?? r6 = dn30Var.a;
            sb.setLength(0);
            Calendar calendar = (Calendar) r6.getValue();
            xuo0.a.getClass();
            calendar.setTimeInMillis(xuo0.a());
            ((Calendar) r5.getValue()).setTimeInMillis(longValue);
            Date date = dn30Var.c;
            date.setTime(longValue);
            sb.append(c09.c((Calendar) r6.getValue(), (Calendar) r5.getValue()) ? ((SimpleDateFormat) dn30Var.f.getValue()).format(date) : c09.f((Calendar) r6.getValue(), (Calendar) r5.getValue()) ? ((SimpleDateFormat) dn30Var.g.getValue()).format(date) : c09.d((Calendar) r6.getValue(), (Calendar) r5.getValue()) ? ((SimpleDateFormat) dn30Var.h.getValue()).format(date) : ((SimpleDateFormat) dn30Var.i.getValue()).format(date));
            str = sb.toString();
        }
        h120Var7.a(aVar2, str);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void o(PhotoViewer.g gVar, int i, Menu menu) {
        AttachmentWithMedia Q = Q(i);
        if (Q == null) {
            return;
        }
        this.o.n(Q, menu);
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.a
    public final void onDismiss() {
        io.reactivex.rxjava3.disposables.c cVar;
        super.onDismiss();
        this.m.a();
        this.r.e();
        ww50<?> ww50Var = this.l;
        if (ww50Var != null) {
            b bVar = this.q;
            if (bVar == null) {
                bVar = null;
            }
            ww50Var.H(bVar);
        }
        z520 z520Var = this.o;
        io.reactivex.rxjava3.disposables.b bVar2 = z520Var.h;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.dispose();
        ComponentCallbacks2 componentCallbacks2 = z520Var.c;
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.yk(z520Var);
        }
        z520Var.m = null;
        idg0 idg0Var = this.j;
        idg0Var.getClass();
        ce60.b.getClass();
        p870 f = p870.f();
        idg0.a aVar = idg0Var.c;
        f.g(aVar);
        aVar.b.clear();
        gwn gwnVar = this.k;
        if (gwnVar == null || (cVar = gwnVar.f) == null) {
            return;
        }
        cVar.dispose();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final View s(ViewGroup viewGroup) {
        boolean z = false;
        h120 h120Var = new h120(viewGroup, this, this.g != null);
        this.p = h120Var;
        if (this.d.u().a && this.h) {
            z = true;
        }
        h120Var.b(z);
        if (this.f.isEmpty()) {
            h120 h120Var2 = this.p;
            if (h120Var2 == null) {
                h120Var2 = null;
            }
            View view = h120Var2.b;
            d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            f4m.j(view);
        }
        h120 h120Var3 = this.p;
        return (h120Var3 != null ? h120Var3 : null).i;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean t(int i) {
        gwn gwnVar = this.k;
        if (gwnVar != null) {
            return gwnVar.b(i);
        }
        return false;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean u(int i) {
        Photo photo;
        AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) j5g.b0(i, this.j.b);
        PhotoAttachment photoAttachment = attachmentWithMedia instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia : null;
        return (photoAttachment == null || (photo = photoAttachment.l) == null || !photo.Ib()) ? false : true;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean w(PhotoViewer.g gVar, int i, MenuItem menuItem, View view) {
        if (this.c.w(gVar, i, menuItem, view)) {
            return true;
        }
        AttachmentWithMedia Q = Q(i);
        if (Q == null) {
            return false;
        }
        return this.o.m(Q, menuItem, view, this.h);
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.b
    public final int z() {
        h120 h120Var = this.p;
        if (h120Var == null) {
            h120Var = null;
        }
        return h120Var.b.getMeasuredHeight();
    }
}
