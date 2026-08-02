package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.bridges.ImageViewer;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.idg0;
import xsna.r0o0;
import xsna.r1r0;
import xsna.wqu;
import xsna.zzq;

/* compiled from: VkAppCallback.kt */
/* loaded from: classes6.dex */
public final class z8u0 extends com.vk.photoviewer.b<AttachmentWithMedia> implements w8i {
    public final r0o0 A;
    public a B;
    public b C;
    public boolean D;
    public boolean E;
    public g F;
    public PhotoViewer G;
    public AttachmentWithMedia H;
    public final LinkedHashSet I;
    public final y1q0 J;
    public final a9u0 K;
    public final ImageViewer.a d;
    public final Activity e;
    public final String f;
    public final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint g;
    public final boolean h;
    public final UserId i;
    public final idg0 j;
    public final gwn k;
    public final String l;
    public final boolean m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final j2r0 q;
    public final dqu r;
    public final ArrayList s;
    public final io.reactivex.rxjava3.disposables.b t;
    public final ww50<?> u;
    public final bpn0 v;
    public final z520 w;
    public d390 x;
    public m68 y;
    public final MarketPhotoviewerComponent z;

    /* compiled from: VkAppCallback.kt */
    public static final class a extends FrameLayout {
        public final View b;
        public b9u0 c;

        public a(View view, FrameLayout frameLayout) {
            super(view.getContext());
            this.b = frameLayout;
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(view, new FrameLayout.LayoutParams(-1, -1));
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDraw(Canvas canvas) {
            Float b;
            b9u0 b9u0Var = this.c;
            if (b9u0Var == null || (b = b9u0Var.b()) == null) {
                return;
            }
            this.b.setVisibility(((double) b.floatValue()) <= 1.1d ? 0 : 4);
            super.dispatchDraw(canvas);
        }
    }

    /* compiled from: VkAppCallback.kt */
    public static final class b extends FrameLayout {
        public final View b;
        public final View c;

        public b(View view, View view2) {
            super(view.getContext());
            this.b = view;
            this.c = view2;
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            addView(view2, new FrameLayout.LayoutParams(-1, -1));
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            this.b.invalidate();
            this.c.invalidate();
        }
    }

    /* compiled from: VkAppCallback.kt */
    public static final class c {
        public c() {
        }
    }

    /* compiled from: VkAppCallback.kt */
    public static final class d {
        public final /* synthetic */ m68 a;
        public final /* synthetic */ z8u0 b;

        public d(m68 m68Var, z8u0 z8u0Var) {
            this.a = m68Var;
            this.b = z8u0Var;
        }

        public final void a(PhotoAttachment photoAttachment) {
            this.a.b(photoAttachment, this.b.h);
        }
    }

    /* compiled from: VkAppCallback.kt */
    public static final class e implements r0o0.a {
        @Override // xsna.r0o0.a
        public final void a(Context context, String str, String str2, LaunchContext launchContext) {
            com.vk.common.links.b.h(context, str, str2, null, launchContext);
        }
    }

    /* compiled from: VkAppCallback.kt */
    public static final class f {
        public final /* synthetic */ PhotoViewer a;

        public f(PhotoViewer photoViewer) {
            this.a = photoViewer;
        }
    }

    /* compiled from: VkAppCallback.kt */
    public static final class g implements fcn {
        public final /* synthetic */ PhotoViewer b;

        public g(PhotoViewer photoViewer) {
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
            RectF rectF = PhotoViewer.U;
            this.b.g(true);
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
    public z8u0(ArrayList arrayList, PhotoViewer.b bVar, ImageViewer.a aVar, Activity activity, String str, String str2, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, boolean z, boolean z2, UserId userId, idg0 idg0Var, gwn gwnVar, String str3, boolean z3) {
        super(bVar);
        this.d = aVar;
        this.e = activity;
        this.f = str;
        this.g = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
        this.h = z2;
        this.i = userId;
        this.j = idg0Var;
        this.k = gwnVar;
        this.l = str3;
        this.m = z3;
        ajd0 ajd0Var = new ajd0(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, ajd0Var);
        this.n = a2;
        this.o = msy.a(lazyThreadSafetyMode, new la0(26));
        this.p = msy.a(lazyThreadSafetyMode, new vxl0(5));
        this.q = new j2r0();
        this.r = new dqu();
        this.s = new ArrayList();
        this.t = new io.reactivex.rxjava3.disposables.b();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        this.u = ey50Var != null ? ey50Var.Y() : null;
        gqe0 gqe0Var = new gqe0(this, 26);
        bpn0 bpn0Var = new bpn0(new c9m0(this, 15));
        this.v = new bpn0(new im80(12));
        this.w = new z520(aVar, activity, str, gqe0Var, (qfa0) a2.getValue(), userId);
        MarketPhotoviewerComponent marketPhotoviewerComponent = (MarketPhotoviewerComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketPhotoviewerComponent.class));
        this.z = marketPhotoviewerComponent;
        s0o0 O1 = marketPhotoviewerComponent.O1();
        Context context = (Context) bpn0Var.getValue();
        u4h df = ((CommunityComponent) ((k7m) m7m.f(this)).a(fpf0.a(CommunityComponent.class))).df();
        e9u0 e9u0Var = new e9u0(1, this, z8u0.class, "onPhotoTagsUpdated", "onPhotoTagsUpdated(Lcom/vk/dto/photo/Photo;)V", 0);
        aVar.u().getClass();
        this.A = O1.a(context, df, e9u0Var, str, !z3);
        this.I = new LinkedHashSet();
        y1q0 y1q0Var = new y1q0(0);
        this.J = y1q0Var;
        this.K = new a9u0(this);
        Q(arrayList);
        this.D = z;
        aVar.u().getClass();
        y1q0Var.b();
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
    public final View D(PhotoViewerLayout photoViewerLayout) {
        ImageViewer.ControlsOptions u = this.d.u();
        b bVar = null;
        if (!u.a && !u.f) {
            return null;
        }
        Context context = photoViewerLayout.getContext();
        e390 G5 = this.z.G5();
        f5z e2 = gqo.e(photoViewerLayout);
        if (e2 == null) {
            e2 = new yvt0(photoViewerLayout);
        }
        d390 a2 = G5.a(context, e2);
        this.x = a2;
        View g2 = a2.g();
        d390 d390Var = this.x;
        View a3 = d390Var != null ? d390Var.a() : null;
        if (g2 != null && a3 != null) {
            bVar = new b(g2, a3);
        }
        this.C = bVar;
        this.A.h(this.x);
        return this.C;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final View E(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
        return this.j.a((fnw) viewGroup, i, (btm) gzsVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final int F(int i) {
        ImageViewer.ControlsOptions u = this.w.b.u();
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
    public final void P(boolean z) {
        d390 d390Var;
        if (this.E && !z && (d390Var = this.x) != null) {
            d390Var.m();
        }
        if (this.E && z) {
            d390 d390Var2 = this.x;
            if (d390Var2 != null) {
                d390Var2.b();
            }
            this.E = false;
        }
        if (this.D && z) {
            X(true);
        }
        if (!this.D || z) {
            return;
        }
        X(false);
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void Q(List<? extends AttachmentWithMedia> list) {
        io.reactivex.rxjava3.core.b0 l;
        ArrayList arrayList = this.s;
        arrayList.addAll(list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) it.next();
            if (attachmentWithMedia.s() == null) {
                linkedHashSet.add(attachmentWithMedia.q());
            }
            if (attachmentWithMedia instanceof PhotoAttachment) {
                Photo photo = ((PhotoAttachment) attachmentWithMedia).l;
                if (photo.B == null) {
                    linkedHashSet.add(photo.f);
                }
            }
        }
        List O0 = j5g.O0(linkedHashSet);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : O0) {
            if (fkq0.d((UserId) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : O0) {
            if (fkq0.b((UserId) obj2)) {
                arrayList3.add(obj2);
            }
        }
        io.reactivex.rxjava3.core.b0 k = arrayList2.isEmpty() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : rsg0.W(yfb.x(r1r0.a.b((s1r0) this.o.getValue(), j5g.O0(arrayList2), Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)), 7).l(new i4f0(new dso0(this, 19), 13));
        if (arrayList3.isEmpty()) {
            l = io.reactivex.rxjava3.core.x.k(EmptyList.b);
        } else {
            wqu wquVar = (wqu) this.p.getValue();
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(fkq0.a((UserId) it2.next()));
            }
            l = rsg0.W(yfb.x(wqu.a.b(wquVar, arrayList4, e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.PHOTO_BASE), null, 4)), 7).l(new cxd0(new lzl0(this, 13), 15));
        }
        int i = 12;
        this.t.b(io.reactivex.rxjava3.core.x.B(k, l, new o8c0(new lk1(arrayList2, i), i)).subscribe(new wvq0(new u2k0(this, 26), 7)));
    }

    public final boolean R() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.s) {
            if (obj instanceof PhotoAttachment) {
                arrayList.add(obj);
            }
        }
        return (arrayList.isEmpty() || this.l == null) ? false : true;
    }

    public final boolean S() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.s) {
            if (obj instanceof PhotoAttachment) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Photo photo = ((PhotoAttachment) it.next()).l;
            if (photo.r) {
                return true;
            }
            List<Tag> list = photo.x;
            if (list != null && !list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final AttachmentWithMedia T(int i) {
        return (AttachmentWithMedia) j5g.b0(i, this.s);
    }

    public final void U(Photo photo, izs izsVar) {
        if (photo == null || photo.c == 0 || !fkq0.c(photo.e) || photo.d == -53 || photo.l) {
            return;
        }
        if (this.I.contains(Integer.valueOf(photo.c))) {
            return;
        }
        this.t.b(new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new cfa0(photo.e, photo.c, photo.v), null, null, 3), new dpo0(new k22(29, this, photo), 5), io.reactivex.rxjava3.internal.functions.a.c).G(new ef3(2, photo, this)).subscribe(new a8v(new g86(26, photo, izsVar), 28), new j7l0(new g1s0(3), 9)));
    }

    public final void V(AttachmentWithMedia attachmentWithMedia, boolean z) {
        if (attachmentWithMedia instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachmentWithMedia;
            if (photoAttachment.l.x.isEmpty()) {
                return;
            }
            d390 d390Var = this.x;
            int currentPosition = d390Var != null ? d390Var.getCurrentPosition() : 0;
            bpn0 bpn0Var = this.v;
            if (!z) {
                zzq zzqVar = (zzq) bpn0Var.getValue();
                zzqVar.getClass();
                zzqVar.a(SchemeStat$FeedPinEntryPoint.PHOTO_VIEWER, this.f, Integer.valueOf(currentPosition), null);
                return;
            }
            zzq.a aVar = ((zzq) bpn0Var.getValue()).c;
            if (aVar != null) {
                aVar.a = true;
            }
            for (Tag tag : photoAttachment.l.x) {
                zzq zzqVar2 = (zzq) bpn0Var.getValue();
                int i = tag.b;
                long j = tag.d.b;
                Integer valueOf = Integer.valueOf(currentPosition);
                zzqVar2.getClass();
                zzqVar2.c(i, j, SchemeStat$FeedPinEntryPoint.PHOTO_VIEWER, valueOf, this.f);
            }
        }
    }

    public final void W(boolean z) {
        m68 m68Var = this.y;
        if (m68Var != null) {
            ImageView imageView = m68Var.C;
            Context context = imageView.getContext();
            if (z) {
                e3m.a aVar = e3m.a;
                imageView.setBackgroundTintList(ColorStateList.valueOf(l8g.f(0.7f, context.getColor(R.color.vk_gray_800))));
                imageView.setImageResource(R.drawable.vk_icon_market_slash_12);
                imageView.getDrawable().setTint(context.getColor(R.color.vk_white));
                return;
            }
            e3m.a aVar2 = e3m.a;
            imageView.setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.vk_white)));
            imageView.setImageResource(R.drawable.vk_icon_market_12);
            imageView.getDrawable().setTint(context.getColor(R.color.vk_black));
        }
    }

    public final void X(boolean z) {
        if (z) {
            V(this.H, true);
            d390 d390Var = this.x;
            if (d390Var != null) {
                d390Var.j();
                return;
            }
            return;
        }
        V(this.H, false);
        d390 d390Var2 = this.x;
        if (d390Var2 != null) {
            d390Var2.e();
        }
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.a
    public final void e(int i) {
        this.H = T(i);
        d390 d390Var = this.x;
        if (d390Var != null) {
            d390Var.h(i);
        }
        this.d.e(i);
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.b
    public final boolean h() {
        return this.d.h();
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.b
    public final void i(int i) {
        d390 d390Var = this.x;
        if (d390Var != null) {
            d390Var.c();
        }
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.a
    public final void j(PhotoViewer photoViewer) {
        super.j(photoViewer);
        this.d.u().getClass();
        this.G = photoViewer;
        this.A.g(new f(photoViewer));
        this.F = new g(photoViewer);
        this.e.getApplication().registerActivityLifecycleCallbacks(this.K);
        ww50<?> ww50Var = this.u;
        if (ww50Var != null) {
            g gVar = this.F;
            if (gVar == null) {
                gVar = null;
            }
            ww50Var.S(gVar);
        }
        m68 m68Var = this.y;
        if (m68Var != null) {
            yok0 yok0Var = m68Var.L;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            m68Var.L = myc0.h(m68Var.K, null, null, new n68(m68Var, null), 3);
        }
        z520 z520Var = this.w;
        z520Var.getClass();
        z520Var.h = new io.reactivex.rxjava3.disposables.b();
        z520Var.m = photoViewer;
        ComponentCallbacks2 componentCallbacks2 = z520Var.c;
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.Li(z520Var);
        }
        ViewParent viewParent = this.B;
        while (viewParent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) viewParent;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            viewParent = viewGroup.getParent();
        }
        X(this.D);
        W(this.D);
        idg0 idg0Var = this.j;
        idg0Var.getClass();
        ce60.b.getClass();
        p870 f2 = p870.f();
        idg0.a aVar = idg0Var.c;
        f2.b(130, aVar);
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, aVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void n(final int i, final PhotoViewer.q qVar) {
        AttachmentWithMedia T = T(i);
        this.H = T;
        if (T != null && (T instanceof PhotoAttachment)) {
            UiTrackingScreen uiTrackingScreen = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_BROWSER);
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PHOTO, Long.valueOf(r0.f), Long.valueOf(((PhotoAttachment) T).g.b), null, this.f, null, 32, null);
            this.J.c(uiTrackingScreen, true);
        }
        b9u0 b9u0Var = new b9u0(qVar);
        d390 d390Var = this.x;
        if (d390Var != null) {
            d390Var.h(i);
        }
        d390 d390Var2 = this.x;
        if (d390Var2 != null) {
            d390Var2.d(b9u0Var);
        }
        c9u0 c9u0Var = new c9u0(i, this);
        m68 m68Var = this.y;
        if (m68Var != null) {
            m68Var.k = c9u0Var;
        }
        if (m68Var != null) {
            m68Var.b(this.H, this.h);
        }
        AttachmentWithMedia attachmentWithMedia = this.H;
        PhotoAttachment photoAttachment = attachmentWithMedia instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia : null;
        this.A.d(photoAttachment != null ? photoAttachment.l : null, i, new vql0(this, i, 1));
        d390 d390Var3 = this.x;
        if (d390Var3 != null) {
            d390Var3.i(new wlw(i, this));
        }
        d390 d390Var4 = this.x;
        if (d390Var4 != null) {
            d390Var4.l(new tbq(i, this));
        }
        a aVar = this.B;
        if (aVar != null) {
            aVar.c = b9u0Var;
        }
        if (this.d.u().e) {
            AttachmentWithMedia attachmentWithMedia2 = this.H;
            PhotoAttachment photoAttachment2 = attachmentWithMedia2 instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia2 : null;
            U(photoAttachment2 != null ? photoAttachment2.l : null, new izs() { // from class: xsna.y8u0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Photo photo = (Photo) obj;
                    z8u0 z8u0Var = z8u0.this;
                    AttachmentWithMedia attachmentWithMedia3 = z8u0Var.H;
                    if (attachmentWithMedia3 instanceof PhotoAttachment) {
                        if (attachmentWithMedia3 != null ? Integer.valueOf(((PhotoAttachment) attachmentWithMedia3).f).equals(Integer.valueOf(photo.c)) : false) {
                            z8u0Var.n(i, qVar);
                        }
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void o(PhotoViewer.g gVar, int i, Menu menu) {
        this.w.n(T(i), menu);
    }

    @Override // com.vk.photoviewer.b, com.vk.photoviewer.PhotoViewer.a
    public final void onDismiss() {
        io.reactivex.rxjava3.disposables.c cVar;
        ViewPropertyAnimator animate;
        super.onDismiss();
        this.J.a();
        this.G = null;
        this.t.dispose();
        this.e.getApplication().unregisterActivityLifecycleCallbacks(this.K);
        ww50<?> ww50Var = this.u;
        if (ww50Var != null) {
            g gVar = this.F;
            if (gVar == null) {
                gVar = null;
            }
            ww50Var.H(gVar);
        }
        m68 m68Var = this.y;
        if (m68Var != null) {
            m68Var.n.dispose();
            yok0 yok0Var = m68Var.L;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            iyx.d(m68Var.K.b);
            kfj0 kfj0Var = m68Var.J;
            VkContentBadge vkContentBadge = kfj0Var.b;
            if (vkContentBadge != null && (animate = vkContentBadge.animate()) != null) {
                animate.cancel();
            }
            kfj0Var.c = false;
            iyx.d(kfj0Var.e.b);
            ce60.b.getClass();
            p870.f().g(m68Var.F);
        }
        z520 z520Var = this.w;
        io.reactivex.rxjava3.disposables.b bVar = z520Var.h;
        if (bVar == null) {
            bVar = null;
        }
        bVar.dispose();
        ComponentCallbacks2 componentCallbacks2 = z520Var.c;
        aeg0 aeg0Var = componentCallbacks2 instanceof aeg0 ? (aeg0) componentCallbacks2 : null;
        if (aeg0Var != null) {
            aeg0Var.yk(z520Var);
        }
        z520Var.m = null;
        this.A.onDismiss();
        idg0 idg0Var = this.j;
        idg0Var.getClass();
        ce60.b.getClass();
        p870 f2 = p870.f();
        idg0.a aVar = idg0Var.c;
        f2.g(aVar);
        aVar.b.clear();
        gwn gwnVar = this.k;
        if (gwnVar == null || (cVar = gwnVar.f) == null) {
            return;
        }
        cVar.dispose();
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.photoviewer.PhotoViewer.b
    public final View s(ViewGroup viewGroup) {
        ImageViewer.ControlsOptions u = this.d.u();
        if (!u.a) {
            return null;
        }
        m68 m68Var = new m68(bwt0.u(viewGroup.getContext()), u.c, this.f, ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob(), (qfa0) this.n.getValue(), ((NewsfeedRouterComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedRouterComponent.class))).l0(), !this.m, this.l, this.i);
        this.y = m68Var;
        boolean R = R();
        m68Var.A = R;
        if (R) {
            m68Var.z = S();
        }
        m68Var.j = new c();
        m68Var.l = new avj0(this, 25);
        d dVar = new d(m68Var, this);
        r0o0 r0o0Var = this.A;
        r0o0Var.c(dVar);
        r0o0Var.b(new e());
        a aVar = new a(m68Var.i, m68Var.B);
        this.B = aVar;
        return aVar;
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
        AttachmentWithMedia T = T(i);
        PhotoAttachment photoAttachment = T instanceof PhotoAttachment ? (PhotoAttachment) T : null;
        return (photoAttachment == null || (photo = photoAttachment.l) == null || !photo.Ib()) ? false : true;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean w(PhotoViewer.g gVar, int i, MenuItem menuItem, View view) {
        if (this.c.w(gVar, i, menuItem, view)) {
            return true;
        }
        return this.w.m(T(i), menuItem, view, this.h);
    }
}
