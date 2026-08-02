package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.common.links.LaunchContext;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vk.imageloader.stat.Metrics;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photos.common.ui.tags.TagsSuggestionsOverlayView;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedImageLoading;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedZoomPhoto;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.e0r;
import xsna.h2r;
import xsna.n0o0;
import xsna.qi6;
import xsna.tlo0;
import xsna.zuu0;

/* compiled from: SinglePhotoHolder.kt */
/* loaded from: classes4.dex */
public final class cvj0 extends ufw<PhotoAttachment> implements View.OnClickListener, h2r.a, t0n, a1n, View.OnAttachStateChangeListener, FeedGoodsPhotoHolder, g530, w8i, n880 {
    public static final /* synthetic */ int n0 = 0;
    public final boolean E;
    public final h170 F;
    public final wvn G;
    public final bx80 H;
    public FeedGoodsPhotoHolder.a I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final c O;
    public final BlurredImageWrapper P;
    public final FixedSizeVKEnhancedImageView Q;
    public final VkBlurContentView R;
    public final ProductsPhotoOverlayView S;
    public final View T;
    public final ViewGroup U;
    public final VkOverlayCircleButton V;
    public final TagsSuggestionsOverlayView W;
    public final a0r X;
    public final Object Y;
    public final Object Z;
    public ImageViewer.c<AttachmentWithMedia> a0;
    public final bpn0 b0;
    public final bpn0 c0;
    public final Object d0;
    public final Object e0;
    public e6o f0;
    public final StringBuilder g0;
    public final int h0;
    public final long i0;
    public boolean j0;
    public q530 k0;
    public boolean l0;
    public final VkOverlayCircleButton.b m0;

    /* compiled from: SinglePhotoHolder.kt */
    public static final class a {
        public static zuu0 a(ViewGroup viewGroup) {
            zuu0 zuu0Var = new zuu0(viewGroup.getContext());
            zuu0Var.setId(R.id.vk_feed_photo_view);
            zuu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return zuu0Var;
        }
    }

    /* compiled from: SinglePhotoHolder.kt */
    public final class b implements zuu0.a {
        public b() {
        }

        @Override // xsna.zuu0.a
        public final void a() {
            cvj0 cvj0Var = cvj0.this;
            a0r a0rVar = cvj0Var.X;
            cvj0Var.itemView.getContext();
            a0rVar.b();
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.zuu0.a
        public final void b() {
            cvj0 cvj0Var = cvj0.this;
            if (cvj0Var.V.i) {
                return;
            }
            if (!bwt0.K(cvj0Var.S)) {
                cvj0Var.z5();
                return;
            }
            cvj0Var.i7(FeedGoodsPhotoHolder.GoodsVisibilityState.CLEARED);
            FeedGoodsPhotoHolder.a aVar = cvj0Var.I;
            if (aVar != null) {
                aVar.a4(cvj0Var.v);
            } else {
                zzq zzqVar = (zzq) cvj0Var.J.getValue();
                String str = cvj0Var.v;
                zzqVar.getClass();
                zzqVar.a(SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, str, null, null);
            }
            cvj0Var.V1();
        }

        @Override // xsna.zuu0.a
        public final boolean c() {
            float height;
            int height2;
            a0r a0rVar = cvj0.this.X;
            avj0 avj0Var = a0rVar.d;
            if (avj0Var == null) {
                return false;
            }
            RectF rectF = (RectF) avj0Var.invoke();
            ProductsPhotoOverlayView productsPhotoOverlayView = a0rVar.b;
            if (rectF.width() > rectF.height()) {
                height = rectF.width();
                height2 = productsPhotoOverlayView.getWidth();
            } else {
                height = rectF.height();
                height2 = productsPhotoOverlayView.getHeight();
            }
            return ((double) (height / ((float) height2))) <= 1.1d;
        }
    }

    /* compiled from: SinglePhotoHolder.kt */
    public final class c implements vix {
        public c() {
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return cvj0.this.U;
        }

        @Override // xsna.vix
        public final zgx b() {
            return null;
        }
    }

    /* compiled from: SinglePhotoHolder.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedGoodsPhotoHolder.GoodsVisibilityState.values().length];
            try {
                iArr[FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedGoodsPhotoHolder.GoodsVisibilityState.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedGoodsPhotoHolder.GoodsVisibilityState.CLEARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cvj0(zuu0 zuu0Var, boolean z, h170 h170Var, wvn wvnVar) {
        super(zuu0Var);
        boolean z2;
        this.E = z;
        this.F = h170Var;
        this.G = wvnVar;
        this.H = new bx80(this, 6);
        int i = 4;
        k5f0 k5f0Var = new k5f0(i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.J = msy.a(lazyThreadSafetyMode, k5f0Var);
        this.K = msy.a(lazyThreadSafetyMode, new t970(7));
        this.L = msy.a(lazyThreadSafetyMode, new wzb0(this, 10));
        this.M = msy.a(lazyThreadSafetyMode, new dei0(this, i));
        this.N = msy.a(lazyThreadSafetyMode, new yu60(this, 24));
        this.O = new c();
        BlurredImageWrapper blurredImageWrapper = (BlurredImageWrapper) zuu0Var.findViewById(R.id.pds_photo_attach);
        this.P = blurredImageWrapper;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = (FixedSizeVKEnhancedImageView) zuu0Var.findViewById(R.id.pds_photo_image);
        this.Q = fixedSizeVKEnhancedImageView;
        this.R = (VkBlurContentView) zuu0Var.findViewById(R.id.image_blur_wrapper);
        ProductsPhotoOverlayView productsPhotoOverlayView = (ProductsPhotoOverlayView) zuu0Var.findViewById(R.id.pds_photo_tags_overlay);
        this.S = productsPhotoOverlayView;
        this.T = zuu0Var.findViewById(R.id.pds_photo_indicator);
        this.U = (ViewGroup) zuu0Var.findViewById(R.id.pds_photo_wrapper);
        this.V = (VkOverlayCircleButton) zuu0Var.findViewById(R.id.pds_photo_market_circle_button);
        this.W = (TagsSuggestionsOverlayView) zuu0Var.findViewById(R.id.suggestions);
        this.X = new a0r(productsPhotoOverlayView);
        this.Y = msy.a(lazyThreadSafetyMode, new b990(this, 16));
        this.Z = msy.a(lazyThreadSafetyMode, new tu80(this, 24));
        this.b0 = new bpn0(new dj60(this, 24));
        this.c0 = new bpn0(new bi80(this, 21));
        this.d0 = msy.a(lazyThreadSafetyMode, new hbj0(this, 3));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new xqf0(3));
        this.e0 = a2;
        this.g0 = new StringBuilder();
        this.h0 = cn70.b(6);
        this.i0 = ViewConfiguration.getDoubleTapTimeout() + 250;
        this.m0 = zuu0Var.getShowTextAnimator();
        View.OnClickListener onClickListener = this.f0;
        if (onClickListener == null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            onClickListener = new uvt0(250L, this);
        }
        fixedSizeVKEnhancedImageView.setOnClickListener(onClickListener);
        blurredImageWrapper.setOnClickListener(onClickListener);
        boolean booleanValue = ((Boolean) a2.getValue()).booleanValue();
        Float valueOf = Float.valueOf(0.05f);
        Float valueOf2 = Float.valueOf(0.04f);
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView2 = zuu0Var.b;
        fixedSizeVKEnhancedImageView2.setCollectLoadingMetrics(booleanValue);
        boolean z3 = true;
        if (epx.d(fixedSizeVKEnhancedImageView2.W, 0.05f)) {
            z2 = false;
        } else {
            fixedSizeVKEnhancedImageView2.W = valueOf;
            z2 = true;
        }
        if (epx.d(fixedSizeVKEnhancedImageView2.a0, 0.04f)) {
            z3 = z2;
        } else {
            fixedSizeVKEnhancedImageView2.a0 = valueOf2;
        }
        if (z3) {
            fixedSizeVKEnhancedImageView2.requestLayout();
        }
        fixedSizeVKEnhancedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        zuu0Var.setGoodsListener(new b());
        dek0.b(fixedSizeVKEnhancedImageView, new d(), null, 12);
        zuu0Var.addOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final void j7(cvj0 cvj0Var, PhotoAttachment photoAttachment) {
        a0r a0rVar = cvj0Var.X;
        cvj0Var.getContext();
        a0rVar.b();
        d3m.c(cvj0Var.S, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        cvj0Var.k7(true, false);
        cvj0Var.i7(FeedGoodsPhotoHolder.GoodsVisibilityState.VISIBLE);
        for (Tag tag : photoAttachment.l.x) {
            FeedGoodsPhotoHolder.a aVar = cvj0Var.I;
            if (aVar != null) {
                aVar.x1(tag, cvj0Var.v);
            } else {
                zzq zzqVar = (zzq) cvj0Var.J.getValue();
                zzqVar.c(tag.b, tag.d.b, zzqVar.b ? SchemeStat$FeedPinEntryPoint.TIMER : SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, null, cvj0Var.v);
            }
        }
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.itemView;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
        final n0n n0nVar = new n0n();
        this.Q.setOnHoverListener(new View.OnHoverListener(n0nVar, this) { // from class: xsna.bvj0
            public final /* synthetic */ cvj0 a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                cvj0 cvj0Var = this.a;
                boolean b2 = n0n.b(cvj0Var.itemView, motionEvent);
                if (b2) {
                    awt0.q(cvj0Var.itemView);
                }
                return b2;
            }
        });
    }

    @Override // xsna.h2r.a
    public final void E4(PhotoAttachment photoAttachment) {
        ViewParent parent = this.itemView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        d7(true, PostInteract.Type.zoom_photo, new gyn(this, 4));
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final FeedGoodsPhotoHolder.b G5() {
        return this.H;
    }

    @Override // xsna.g530
    public final void H2() {
        Iterator it = this.X.g.iterator();
        while (it.hasNext()) {
            ((dtd0) it.next()).c();
        }
    }

    @Override // xsna.qi6
    public final void I6() {
        wvn wvnVar;
        super.I6();
        if (q6() != null && (wvnVar = this.G) != null) {
            wvnVar.remove();
        }
        VkOverlayCircleButton.b bVar = this.m0;
        AnimatorSet animatorSet = bVar.c;
        if (animatorSet != null) {
            animatorSet.end();
        }
        bVar.c = null;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o e6oVar = new e6o(s6oVar, Long.valueOf(this.i0), this, s6oVar.e);
        this.f0 = e6oVar;
        this.Q.setOnClickListener(e6oVar);
        this.P.setOnClickListener(e6oVar);
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.Q;
    }

    @Override // xsna.n880
    public final View R3() {
        return this.R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0139, code lost:
    
        if (r0.a == true) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T6(Attachment attachment) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        NewsEntry newsEntry;
        gjx gjxVar;
        gvj0 b7;
        u1c0 J0;
        PhotoAttachment photoAttachment;
        Photo photo;
        boolean z5;
        boolean z6;
        NewsEntry newsEntry2;
        gjx gjxVar2;
        u1c0 J02;
        PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment;
        Photo photo2 = photoAttachment2.l;
        u1c0 J03 = J0();
        ol60 ol60Var = J03 != null ? J03.h : null;
        ivj0 ivj0Var = ol60Var instanceof ivj0 ? (ivj0) ol60Var : null;
        ?? r10 = this.N;
        ?? r13 = this.d0;
        bpn0 bpn0Var = this.c0;
        int i = this.h0;
        c cVar = this.O;
        BlurredImageWrapper blurredImageWrapper = this.P;
        TagsSuggestionsOverlayView tagsSuggestionsOverlayView = this.W;
        boolean z7 = this.E;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.Q;
        h170 h170Var = this.F;
        View view = this.T;
        VkOverlayCircleButton vkOverlayCircleButton = this.V;
        if (ivj0Var != null) {
            int i2 = ivj0Var.t;
            Y6(photoAttachment2);
            s1c0 s1c0Var = this.x;
            if (s1c0Var == null || s1c0Var.j) {
                f4m.y(i, this.itemView);
            } else {
                f4m.y(0, this.itemView);
            }
            fixedSizeVKEnhancedImageView.setWrapContent(photoAttachment2.b);
            if (z7) {
                ((h2r) bpn0Var.getValue()).e = false;
                fixedSizeVKEnhancedImageView.setOnLoadCallback(new fvj0(this));
            }
            int i3 = ivj0Var.u;
            Float f2 = ivj0Var.w;
            fixedSizeVKEnhancedImageView.e1(i2, i3);
            fixedSizeVKEnhancedImageView.setIgnoreTrafficSaverPredicate(new z24(0, new ftj0(0, this, cvj0.class, "isAdvertisement", "isAdvertisement()Z", 1), mcy.class, "get", "get()Ljava/lang/Object;", 0, 6));
            fixedSizeVKEnhancedImageView.setLocalImage((fxj0) null);
            fixedSizeVKEnhancedImageView.setRemoteImage((List<? extends fxj0>) ivj0Var.v);
            String b2 = com.vk.toggle.d.s().b(ivj0Var.j.l.P, h170Var.h() && h170Var.i());
            if (b2 != null) {
                fixedSizeVKEnhancedImageView.setThumbHash(b2);
            }
            f4m.q(ivj0Var.m, view);
            f4m.r(ivj0Var.l, view);
            f4m.q(ivj0Var.n, vkOverlayCircleButton);
            f4m.w(0, vkOverlayCircleButton);
            if (tagsSuggestionsOverlayView != null) {
                tagsSuggestionsOverlayView.setTags(photo2.b);
            }
            this.l0 = false;
            this.itemView.setContentDescription(null);
            fixedSizeVKEnhancedImageView.setOnHoverListener(null);
            fixedSizeVKEnhancedImageView.setViewRatio(f2);
            blurredImageWrapper.setViewRatio(f2);
            ((chk) r13.getValue()).c(photo2.K == null ? photo2.Gb() : null, i2, i3, f2);
            if (b7() == null && (J02 = J0()) != null) {
                J02.g = new gvj0(0);
            }
            if (ivj0Var.o) {
                gvj0 b72 = b7();
                if (b72 != null) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z5;
                this.j0 = z6;
                h7(0L, z5);
                newsEntry2 = ivj0Var.h;
                if ((newsEntry2 instanceof MyTargetNativeAdEntry) || (gjxVar2 = ((MyTargetNativeAdEntry) newsEntry2).B) == null) {
                    return;
                }
                ((yix) r10.getValue()).b(gjxVar2).q(cVar);
                return;
            }
            z5 = true;
            z6 = false;
            this.j0 = z6;
            h7(0L, z5);
            newsEntry2 = ivj0Var.h;
            if (newsEntry2 instanceof MyTargetNativeAdEntry) {
                return;
            } else {
                return;
            }
        }
        Y6(photoAttachment2);
        s1c0 s1c0Var2 = this.x;
        if (s1c0Var2 == null || s1c0Var2.j) {
            f4m.y(i, this.itemView);
        } else {
            f4m.y(0, this.itemView);
        }
        int a2 = qi6.a.a(this.itemView.getContext());
        ArrayList arrayList = photo2.y.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = it;
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                arrayList2.add(next);
            }
            it = it2;
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = photo2.y.b;
        }
        ArrayList arrayList3 = arrayList2;
        fixedSizeVKEnhancedImageView.setWrapContent(photoAttachment2.b);
        if (z7) {
            ((h2r) bpn0Var.getValue()).e = false;
            fixedSizeVKEnhancedImageView.setOnLoadCallback(new dvj0(this));
        }
        ImageSize y = nr2.y(a2, arrayList3);
        if (y != null) {
            Image image = y.d;
            fixedSizeVKEnhancedImageView.e1(image.b, image.c);
        } else {
            fixedSizeVKEnhancedImageView.e1(135, 100);
        }
        fixedSizeVKEnhancedImageView.setIgnoreTrafficSaverPredicate(new jsl(0, new evj0(this, cvj0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 4));
        fixedSizeVKEnhancedImageView.setLocalImage((fxj0) null);
        fixedSizeVKEnhancedImageView.setRemoteImage((List<? extends fxj0>) arrayList3);
        String b3 = com.vk.toggle.d.s().b((ivj0Var == null || (photoAttachment = ivj0Var.j) == null || (photo = photoAttachment.l) == null) ? null : photo.P, h170Var.h() && h170Var.i());
        if (b3 != null) {
            fixedSizeVKEnhancedImageView.setThumbHash(b3);
        }
        if (ivj0Var != null) {
            f4m.q(ivj0Var.m, view);
            f4m.r(ivj0Var.l, view);
            f4m.q(ivj0Var.n, vkOverlayCircleButton);
            z = false;
            f4m.w(0, vkOverlayCircleButton);
        } else {
            z = false;
            f4m.q(cn70.b(8), view);
            f4m.r(0, view);
            f4m.q(0, vkOverlayCircleButton);
            f4m.w(0, vkOverlayCircleButton);
        }
        if (tagsSuggestionsOverlayView != null) {
            tagsSuggestionsOverlayView.setTags(photo2.b);
        }
        this.l0 = z;
        this.itemView.setContentDescription(null);
        fixedSizeVKEnhancedImageView.setOnHoverListener(null);
        NewsEntry q6 = q6();
        if (q6 != null) {
            Float s = di60.s(q6);
            fixedSizeVKEnhancedImageView.setViewRatio(s);
            blurredImageWrapper.setViewRatio(s);
        }
        ImageCropData Gb = photo2.K == null ? photo2.Gb() : null;
        chk chkVar = (chk) r13.getValue();
        int i4 = y != null ? y.d.b : 135;
        int i5 = y != null ? y.d.c : 100;
        NewsEntry q62 = q6();
        chkVar.c(Gb, i5, i4, q62 != null ? di60.s(q62) : null);
        if (b7() != null || (J0 = J0()) == null) {
            z2 = false;
        } else {
            z2 = false;
            J0.g = new gvj0(0);
        }
        if (ivj0Var != null) {
            z3 = true;
            if (ivj0Var.o && ((b7 = b7()) == null || !b7.a)) {
                z4 = true;
                this.j0 = z4;
                h7(0L, z3);
                newsEntry = ivj0Var == null ? ivj0Var.h : null;
                if ((newsEntry instanceof MyTargetNativeAdEntry) || (gjxVar = ((MyTargetNativeAdEntry) newsEntry).B) == null) {
                }
                ((yix) r10.getValue()).b(gjxVar).q(cVar);
                return;
            }
        } else {
            z3 = true;
        }
        z4 = z2;
        this.j0 = z4;
        h7(0L, z3);
        if (ivj0Var == null) {
        }
        if (newsEntry instanceof MyTargetNativeAdEntry) {
        }
    }

    @Override // xsna.a1n
    public final void U5() {
        this.l0 = true;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void V1() {
        d3m.e(this.S, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        k7(false, false);
        this.X.a();
    }

    @Override // xsna.h2r.a
    public final void W(float f2, float f3, float f4, float f5, float f6) {
        ImageViewer.c<AttachmentWithMedia> cVar = this.a0;
        ImageViewer.e eVar = cVar instanceof ImageViewer.e ? (ImageViewer.e) cVar : null;
        if (eVar != null) {
            eVar.n(f2, f3, f4, f5, f6);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    public final void Y6(PhotoAttachment photoAttachment) {
        PhotoAttachment photoAttachment2;
        Photo photo;
        FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState;
        FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState2;
        Photo photo2;
        List<Tag> list;
        VkOverlayCircleButton.b bVar = this.m0;
        AnimatorSet animatorSet = bVar.c;
        if (animatorSet != null) {
            animatorSet.end();
        }
        bVar.c = null;
        this.X.a();
        ProductsPhotoOverlayView productsPhotoOverlayView = this.S;
        productsPhotoOverlayView.setVisibility(8);
        VkOverlayCircleButton.a(this.V, new gko(R.drawable.vk_icon_market_12), null, null, null, 30);
        VkBlurContentView vkBlurContentView = this.R;
        VkOverlayCircleButton vkOverlayCircleButton = this.V;
        vkOverlayCircleButton.setupBlurContent(vkBlurContentView);
        PhotoAttachment photoAttachment3 = (PhotoAttachment) this.C;
        boolean z = true;
        if ((photoAttachment3 == null || (photo2 = photoAttachment3.l) == null || (list = photo2.x) == null || !(!list.isEmpty())) && ((photoAttachment2 = (PhotoAttachment) this.C) == null || (photo = photoAttachment2.l) == null || !photo.r)) {
            z = false;
        }
        bwt0.p0(vkOverlayCircleButton, z);
        k7(bwt0.K(productsPhotoOverlayView), false);
        if (photoAttachment.l.r) {
            hg1.b(this.itemView, ((com.vk.newsfeed.common.recycler.holders.attachments.market.a) this.K.getValue()).a(photoAttachment.l).subscribe(new ca10(new bbw(photoAttachment, 29), 21)));
        }
        gvj0 b7 = b7();
        if (b7 == null || (goodsVisibilityState = b7.c) == null) {
            goodsVisibilityState = FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN;
        }
        if (goodsVisibilityState == FeedGoodsPhotoHolder.GoodsVisibilityState.VISIBLE) {
            z5();
            return;
        }
        gvj0 b72 = b7();
        if (b72 == null || (goodsVisibilityState2 = b72.c) == null) {
            goodsVisibilityState2 = FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN;
        }
        if (goodsVisibilityState2 == FeedGoodsPhotoHolder.GoodsVisibilityState.CLEARED) {
            V1();
        }
    }

    public final gvj0 b7() {
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.g : null;
        if (obj instanceof gvj0) {
            return (gvj0) obj;
        }
        return null;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void c3(FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState) {
        i7(goodsVisibilityState);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Rect c7() {
        ?? r0 = this.d0;
        if (!((chk) r0.getValue()).b()) {
            return null;
        }
        RectF rectF = new RectF(bwt0.C(this.Q));
        ((chk) r0.getValue()).a(rectF).mapRect(rectF);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r3.f(3) == true) goto L25;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d7(boolean z, PostInteract.Type type, yzs<? super Integer, ? super List<? extends AttachmentWithMedia>, ? super Activity, ? extends ImageViewer.c<AttachmentWithMedia>> yzsVar) {
        gjx gjxVar;
        if (z && bwt0.b()) {
            return;
        }
        NewsEntry q6 = q6();
        if (q6 instanceof ShitAttachment) {
            Context context = this.itemView.getContext();
            u1c0 J0 = J0();
            hd60.a().r0(context, (ShitAttachment) q6, J0 != null ? J0.k : -1, AdClickContext.IMAGE);
            return;
        }
        if (q6 instanceof MyTargetNativeAdEntry) {
            Context context2 = this.itemView.getContext();
            h170 h170Var = this.F;
            boolean z2 = (!((Boolean) h170Var.J.getValue()).booleanValue() || (gjxVar = ((MyTargetNativeAdEntry) q6).B) == null || (r3 = gjxVar.b()) == null) ? false : true;
            if (!((Boolean) h170Var.J.getValue()).booleanValue() || z2) {
                hi60 i6 = i6();
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) q6;
                NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, "DEFAULT", 3, null);
                u1c0 J02 = J0();
                i6.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context2, myTargetNativeAdEntry, aVar, J02 != null ? J02.k : -1));
                return;
            }
        }
        if (this.a0 != null) {
            return;
        }
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.zb(type);
        }
        ArrayList<AttachmentWithMedia> arrayList = new ArrayList<>(10);
        int X6 = X6(arrayList);
        Activity h = e3m.h(this.itemView.getContext());
        if (h != null) {
            ((e) this.b0.getValue()).a = X6;
            this.a0 = yzsVar.invoke(Integer.valueOf(X6), arrayList, h);
        }
    }

    public final boolean e7() {
        u1c0 J0 = J0();
        s1c0 s1c0Var = J0 != null ? J0.n : null;
        if (s1c0Var != null && s1c0Var.l) {
            return s1c0Var.u;
        }
        s1c0 s1c0Var2 = this.x;
        return s1c0Var2 != null && s1c0Var2.u;
    }

    public final void f7(Tag tag, PhotoAttachment photoAttachment) {
        UserId userId;
        s1c0 s1c0Var = this.x;
        String a2 = tag.f.a((photoAttachment == null || (userId = photoAttachment.g) == null) ? null : Long.valueOf(userId.b), photoAttachment != null ? Integer.valueOf(photoAttachment.k) : null, CommonMarketStat$TypeMarketContextContent.Type.POST, (s1c0Var == null || s1c0Var.H) ? null : "POSTS_CONTEXT_MECHANISM");
        s1c0 s1c0Var2 = this.x;
        String h = (s1c0Var2 == null || s1c0Var2.H) ? tag.c.h() : "POSTS_CONTEXT_MECHANISM";
        maz e2 = xwk.d().e();
        Context context = this.itemView.getContext();
        String str = this.v;
        n0o0.a aVar = tag.f.e;
        maz.c(e2, context, a2, new LaunchContext(false, false, false, null, null, null, null, str, a2, h, null, false, false, false, null, null, null, aVar != null ? aVar.e : null, null, false, false, null, null, null, 66583679), null, null, 24);
    }

    public final void h7(long j, boolean z) {
        if (this.j0 && e7()) {
            float f2 = z ? 1.0f : 1.1f;
            ViewPropertyAnimator animate = this.Q.animate();
            if (j != 0) {
                animate.setStartDelay(500L);
            }
            animate.scaleX(f2);
            animate.scaleY(f2);
            animate.setDuration(j);
            animate.start();
        }
    }

    @Override // xsna.n880
    public final void i3() {
        if (this.j0 && e7()) {
            h7(5000L, false);
            u1c0 J0 = J0();
            if (J0 != null) {
                gvj0 b7 = b7();
                J0.g = b7 != null ? gvj0.a(b7, null, 6) : null;
            }
        }
    }

    public final void i7(FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState) {
        u1c0 J0 = J0();
        if (J0 != null) {
            gvj0 b7 = b7();
            J0.g = b7 != null ? gvj0.a(b7, goodsVisibilityState, 3) : null;
        }
    }

    public final void k7(boolean z, boolean z2) {
        AnimatorSet animatorSet;
        VkOverlayCircleButton vkOverlayCircleButton = this.V;
        vkOverlayCircleButton.setLoading(z2);
        vkOverlayCircleButton.setImportantForAccessibility(bwt0.K(vkOverlayCircleButton) ? 1 : 2);
        if (z2) {
            VkOverlayCircleButton.a(this.V, null, null, VkOverlayCircleButton.ColorPalette.Standard, null, 23);
            return;
        }
        VkOverlayCircleButton.a(this.V, new gko(z ? R.drawable.vk_icon_market_slash_12 : R.drawable.vk_icon_market_12), tq.h(tlo0.Companion, z ? R.string.photo_hide_goods_accessibility_text : R.string.photo_show_goods_accessibility_text), z ? VkOverlayCircleButton.ColorPalette.Standard : VkOverlayCircleButton.ColorPalette.Reversed, null, 18);
        VkOverlayCircleButton.b bVar = this.m0;
        if (!z) {
            gvj0 b7 = b7();
            if (b7 != null ? b7.b : false) {
                return;
            }
            boolean z3 = VkOverlayCircleButton.this.d.getText() != null;
            AnimatorSet animatorSet2 = bVar.c;
            if ((animatorSet2 != null && animatorSet2.isRunning()) && z3 && (animatorSet = bVar.c) != null) {
                animatorSet.setCurrentPlayTime(bVar.a + bVar.b);
                return;
            }
            return;
        }
        gvj0 b72 = b7();
        if (b72 != null ? b72.b : false) {
            return;
        }
        tlo0.f fVar = new tlo0.f(R.string.product_photo_pin_button_text);
        rka0 rka0Var = new rka0(this, 18);
        long j = bVar.a;
        VkOverlayCircleButton vkOverlayCircleButton2 = VkOverlayCircleButton.this;
        AnimatorSet animatorSet3 = bVar.c;
        if (animatorSet3 != null && animatorSet3.isRunning()) {
            return;
        }
        bVar.a(fVar);
        VkText vkText = vkOverlayCircleButton2.d;
        int measureText = ((int) vkText.getPaint().measureText(vkText.getText().toString())) + vkText.getPaddingEnd() + vkText.getPaddingStart();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measureText);
        ofInt.addUpdateListener(new az5(vkOverlayCircleButton2, 1));
        ofInt.setDuration(j);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(measureText, 0);
        ofInt2.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.m(vkOverlayCircleButton2, 3));
        ofInt2.setDuration(j);
        ofInt2.setStartDelay(bVar.b);
        AnimatorSet animatorSet4 = new AnimatorSet();
        bVar.c = animatorSet4;
        animatorSet4.playSequentially(ofInt, ofInt2);
        animatorSet4.start();
        animatorSet4.addListener(new iav0(vkOverlayCircleButton2, bVar, rka0Var));
    }

    @Override // xsna.h2r.a
    public final void m() {
        ImageViewer.c<AttachmentWithMedia> cVar = this.a0;
        ImageViewer.e eVar = cVar instanceof ImageViewer.e ? (ImageViewer.e) cVar : null;
        if (eVar != null) {
            eVar.m();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void n1() {
        FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState;
        gvj0 b7 = b7();
        if (b7 == null || (goodsVisibilityState = b7.c) == null) {
            goodsVisibilityState = FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN;
        }
        int i = f.$EnumSwitchMapping$0[goodsVisibilityState.ordinal()];
        if (i == 1) {
            ((zzq) this.J.getValue()).b = true;
            z5();
        } else if (i == 2) {
            z5();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            V1();
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.l0;
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            W6(view);
        }
        d7(false, PostInteract.Type.open_photo, new i3j(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        gjx gjxVar;
        q530 q530Var;
        NewsEntry t6;
        NewsEntry q6;
        h170 h170Var = this.F;
        com.vk.toggle.data.a a2 = h170Var.a();
        if ((a2 != null ? a2.c : null) != null && (t6 = t6()) != null && ((t6 instanceof PromoPost) || (t6 instanceof ShitAttachment) || (t6 instanceof MyTargetNativeAdEntry))) {
            com.vk.toggle.data.a a3 = h170Var.a();
            zmk zmkVar = (a3 != null ? a3.c : null) != null ? new zmk() : null;
            if (zmkVar != null && (q6 = q6()) != null) {
                hg1.b(this.itemView, zmkVar.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fv70(new ab(20, this, q6), 13), new l8w(new p8(com.vk.metrics.eventtracking.b.a, 8), 22)));
                this.Q.setPostprocessor(zmkVar);
            }
        }
        if (this.k0 == null) {
            f5z e2 = gqo.e(view);
            if (e2 != null) {
                q530Var = ((ModerationComponent) this.Z.getValue()).pa().b(view.getContext(), e2, false);
                q530Var.d(this);
            } else {
                q530Var = null;
            }
            this.k0 = q530Var;
            avj0 avj0Var = new avj0(this, 0);
            hk70 hk70Var = new hk70(this, 20);
            exi0 exi0Var = new exi0(this, 2);
            a0r a0rVar = this.X;
            a0rVar.c = q530Var;
            a0rVar.d = avj0Var;
            a0rVar.e = hk70Var;
            a0rVar.f = exi0Var;
        }
        NewsEntry t62 = t6();
        MyTargetNativeAdEntry myTargetNativeAdEntry = t62 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) t62 : null;
        if (myTargetNativeAdEntry == null || (gjxVar = myTargetNativeAdEntry.B) == null) {
            return;
        }
        ((yix) this.N.getValue()).b(gjxVar).q(this.O);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        gjx gjxVar;
        boolean booleanValue = ((Boolean) this.e0.getValue()).booleanValue();
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.Q;
        if (booleanValue) {
            s1c0 s1c0Var = this.x;
            if (s1c0Var == null || !s1c0Var.l) {
                MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode mode = MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode.SINGLE;
                Metrics metrics = fixedSizeVKEnhancedImageView.getBackend().l.c;
                Metrics metrics2 = fixedSizeVKEnhancedImageView.getBackend().l.d;
                J0();
                NewsEntry q6 = q6();
                if (q6 != null) {
                    e0r.a(Collections.singletonList(new e0r.a(metrics, 0)), Collections.singletonList(new e0r.a(metrics2, 0)), q6, mode);
                }
            } else {
                MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode mode2 = MobileOfficialAppsFeedStat$TypeFeedImageLoading.Mode.CAROUSEL;
                FeedGoodsPhotoHolder.a aVar = this.I;
                int m2 = aVar != null ? aVar.m2() : -1;
                Metrics metrics3 = fixedSizeVKEnhancedImageView.getBackend().l.c;
                Metrics metrics4 = fixedSizeVKEnhancedImageView.getBackend().l.d;
                J0();
                NewsEntry q62 = q6();
                if (q62 != null) {
                    e0r.a(Collections.singletonList(new e0r.a(metrics3, m2)), Collections.singletonList(new e0r.a(metrics4, m2)), q62, mode2);
                }
            }
        }
        fixedSizeVKEnhancedImageView.setPostprocessor(null);
        h7(0L, true);
        NewsEntry t6 = t6();
        MyTargetNativeAdEntry myTargetNativeAdEntry = t6 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) t6 : null;
        if (myTargetNativeAdEntry == null || (gjxVar = myTargetNativeAdEntry.B) == null) {
            return;
        }
        ((yix) this.N.getValue()).b(gjxVar).f(this.O);
    }

    @Override // xsna.n880
    public final void s4(String str) {
        StringBuilder sb = this.g0;
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

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void u5(FeedGoodsPhotoHolder.a aVar) {
        this.I = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void z5() {
        PhotoAttachment photoAttachment = (PhotoAttachment) this.C;
        if (photoAttachment != null) {
            Photo photo = photoAttachment.l;
            if (!photo.r || !photo.x.isEmpty()) {
                j7(this, photoAttachment);
                return;
            }
            k7(false, true);
            hg1.b(this.itemView, ((com.vk.newsfeed.common.recycler.holders.attachments.market.a) this.K.getValue()).a(photo).subscribe(new nex(new h9i0(1, photoAttachment, this), 21)));
        }
    }

    /* compiled from: SinglePhotoHolder.kt */
    public final class e implements ImageViewer.a {
        public int a = -1;
        public final float[] b;

        public e() {
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = 0.0f;
            }
            this.b = fArr;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
            cvj0.this.i6().sa(NewsfeedExternalAction.e.b.a);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
            NewsEntry.TrackData Cb;
            Photo photo;
            UserId userId;
            Photo photo2;
            cvj0 cvj0Var = cvj0.this;
            PhotoAttachment photoAttachment = (PhotoAttachment) cvj0Var.C;
            Integer valueOf = (photoAttachment == null || (photo2 = photoAttachment.l) == null) ? null : Integer.valueOf(photo2.c);
            PhotoAttachment photoAttachment2 = (PhotoAttachment) cvj0Var.C;
            Long valueOf2 = (photoAttachment2 == null || (photo = photoAttachment2.l) == null || (userId = photo.e) == null) ? null : Long.valueOf(userId.b);
            NewsEntry q6 = cvj0Var.q6();
            MobileOfficialAppsFeedStat$TypeFeedZoomPhoto mobileOfficialAppsFeedStat$TypeFeedZoomPhoto = new MobileOfficialAppsFeedStat$TypeFeedZoomPhoto(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, null, null, null, (q6 == null || (Cb = q6.Cb()) == null) ? null : Cb.b, null, 46, null), MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint.PHOTO_VIEWER, valueOf, valueOf2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            UiTrackingScreen b = UiTracker.j.b();
            new iid0(c, SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, mobileOfficialAppsFeedStat$TypeFeedZoomPhoto, 1)).q();
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            View c;
            cvj0 cvj0Var = cvj0.this;
            anw anwVar = cvj0Var.D;
            if (anwVar != null && (c = anwVar.c(i)) != null) {
                return c;
            }
            if (this.a == i) {
                return cvj0Var.Q;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            Rect d;
            cvj0 cvj0Var = cvj0.this;
            anw anwVar = cvj0Var.D;
            if (anwVar != null && (d = anwVar.d(i)) != null) {
                return d;
            }
            if (this.a == i) {
                return cvj0Var.c7();
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            anw anwVar = cvj0.this.D;
            if (anwVar != null) {
                anwVar.e(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            anw anwVar = cvj0.this.D;
            if (anwVar != null) {
                return anwVar.f();
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            cvj0 cvj0Var = cvj0.this;
            anw anwVar = cvj0Var.D;
            Rect g = anwVar != null ? anwVar.g() : null;
            if (g != null) {
                return g;
            }
            int i = cvj0.n0;
            if (((chk) cvj0Var.d0.getValue()).b()) {
                Object parent = cvj0Var.Q.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    return bwt0.F(view);
                }
            } else {
                Object parent2 = cvj0Var.itemView.getParent();
                View view2 = parent2 instanceof View ? (View) parent2 : null;
                if (view2 != null) {
                    return bwt0.F(view2);
                }
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            NewsEntry.TrackData Cb;
            NewsEntry q6 = cvj0.this.q6();
            if (q6 == null || (Cb = q6.Cb()) == null) {
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
            anw anwVar = cvj0.this.D;
            if (anwVar != null) {
                return anwVar.a(i);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
            cvj0 cvj0Var = cvj0.this;
            anw anwVar = cvj0Var.D;
            if (anwVar != null) {
                anwVar.h(cvj0Var.a0);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            cvj0 cvj0Var = cvj0.this;
            cvj0Var.i6().sa(NewsfeedExternalAction.e.a.a);
            cvj0Var.a0 = null;
            this.a = -1;
            FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = cvj0Var.Q;
            qcy<Object>[] qcyVarArr = VKEnhancedImageView.N;
            fixedSizeVKEnhancedImageView.X0(false);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            cvj0 cvj0Var = cvj0.this;
            anw anwVar = cvj0Var.D;
            float[] b = anwVar != null ? anwVar.b() : null;
            if (b != null) {
                return b;
            }
            if (cvj0Var.P.c()) {
                return null;
            }
            return this.b;
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
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }

    @Override // xsna.g530
    public final void g3() {
    }

    /* compiled from: SinglePhotoHolder.kt */
    public final class d implements b780 {
        public d() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            TagsSuggestionsOverlayView tagsSuggestionsOverlayView = cvj0.this.W;
            if (tagsSuggestionsOverlayView != null) {
                tagsSuggestionsOverlayView.b(str, th);
            }
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            TagsSuggestionsOverlayView tagsSuggestionsOverlayView = cvj0.this.W;
            if (tagsSuggestionsOverlayView != null) {
                if (i <= 0 || i2 <= 0) {
                    b(str, null);
                } else {
                    tagsSuggestionsOverlayView.t(i, i2, str);
                }
            }
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }
    }

    @Override // xsna.n880
    public final void Y0(izs<? super o880, s3q0> izsVar) {
    }

    @Override // xsna.n880
    public final void i2(izs<? super o880, s3q0> izsVar) {
    }
}
