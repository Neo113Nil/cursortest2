package xsna;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketItemsShowTimeConfig;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.transform.TransformController;
import xsna.dfd;
import xsna.fh5;
import xsna.smc;
import xsna.toz;
import xsna.tps0;
import xsna.ye0;

/* compiled from: ClipVideoHolder.kt */
/* loaded from: classes4.dex */
public final class cfd extends BaseVideoAutoPlayHolder<efd, VideoAttachment> implements w8i {
    public static final /* synthetic */ int U0 = 0;
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    public final boolean H0;
    public final e8e I0;
    public final View J0;
    public final View K0;
    public final ClipEndOverlayView L0;
    public final TextView M0;
    public final xuu0 N0;
    public final VkContentBadge O0;
    public VkTooltip P0;
    public boolean Q0;
    public boolean R0;
    public final f1 S0;
    public final io.reactivex.rxjava3.disposables.b T0;
    public final tps0 s0;
    public final ktc0 t0;
    public final boolean u0;
    public final h170 v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final Object z0;

    /* compiled from: ClipVideoHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsMarketItemsShowTimeConfig.VisibilityMode.values().length];
            try {
                iArr[ClipsMarketItemsShowTimeConfig.VisibilityMode.VISIBLE_AFTER_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsMarketItemsShowTimeConfig.VisibilityMode.VISIBLE_AFTER_PERCENT_PLAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsMarketItemsShowTimeConfig.VisibilityMode.VISIBLE_AFTER_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cfd(ViewGroup viewGroup, s0t0 s0t0Var, tps0 tps0Var, zmk zmkVar, h170 h170Var, int i) {
        super(r3, viewGroup, r5, new sps0(null, null, ((Boolean) h170Var.v.getValue()).booleanValue(), 31), s0t0Var);
        View view;
        tps0 bVar = (i & 4) != 0 ? new tps0.b(Float.valueOf(0.6666667f), true) : tps0Var;
        zmkVar = (i & 8) != 0 ? null : zmkVar;
        boolean z = (i & 32) == 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(((Boolean) h170Var.v.getValue()).booleanValue() ? R.layout.clip_video_holder_v2 : R.layout.clip_video_holder, viewGroup, false);
        if (bVar instanceof tps0.a) {
            view = inflate;
        } else {
            if (!(bVar instanceof tps0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            FrameLayout frameLayout = new FrameLayout(inflate.getContext());
            frameLayout.setId(View.generateViewId());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.addView(inflate);
            view = frameLayout;
        }
        this.s0 = bVar;
        this.t0 = zmkVar;
        this.u0 = z;
        this.v0 = h170Var;
        viewGroup.getContext();
        s5 s5Var = new s5(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, s5Var);
        this.w0 = a2;
        this.x0 = msy.a(lazyThreadSafetyMode, new hd(this, 16));
        this.y0 = msy.a(lazyThreadSafetyMode, new se0(10));
        this.z0 = msy.a(lazyThreadSafetyMode, new l1(this, 24));
        this.A0 = msy.a(lazyThreadSafetyMode, new g5(this, 15));
        this.B0 = msy.a(lazyThreadSafetyMode, new i70(this, 20));
        this.C0 = msy.a(lazyThreadSafetyMode, new j70(this, 21));
        this.D0 = msy.a(lazyThreadSafetyMode, new defpackage.r(this, 28));
        this.E0 = msy.a(lazyThreadSafetyMode, new yh(this, 23));
        this.F0 = msy.a(lazyThreadSafetyMode, new ic(this, 23));
        this.G0 = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 21));
        this.H0 = com.vk.toggle.d.K0.b() != null;
        this.I0 = e8e.a;
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.itemView.findViewById(R.id.video_wrap);
        View findViewById = ratioFrameLayout.findViewById(R.id.clip_top_gradient);
        this.J0 = findViewById;
        View findViewById2 = ratioFrameLayout.findViewById(R.id.clip_bottom_gradient);
        this.K0 = findViewById2;
        ClipEndOverlayView clipEndOverlayView = (ClipEndOverlayView) ratioFrameLayout.findViewById(R.id.clip_end_overlay);
        clipEndOverlayView.setIsLoadNewAdAfterRewatchEnabled(((zof) a2.getValue()).c0());
        this.L0 = clipEndOverlayView;
        this.M0 = (TextView) ratioFrameLayout.findViewById(R.id.clip_bottom_text);
        xuu0 xuu0Var = (xuu0) ratioFrameLayout.findViewById(R.id.feed_carousel_product_layout);
        this.N0 = xuu0Var;
        VkBlurContentView vkBlurContentView = (VkBlurContentView) ratioFrameLayout.findViewById(R.id.video_blur_wrapper);
        this.O0 = (VkContentBadge) ratioFrameLayout.findViewById(R.id.feed_clip_trending_hashtag);
        this.S0 = new f1(this, 15);
        this.T0 = new io.reactivex.rxjava3.disposables.b();
        xuu0Var.setupBlurContent(vkBlurContentView);
        findViewById.setMinimumHeight(iah0.a(120));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, P7());
        gradientDrawable.setAlpha(128);
        findViewById.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, P7());
        gradientDrawable2.setAlpha(128);
        findViewById2.setBackground(gradientDrawable2);
        clipEndOverlayView.m.add(new ng1(this, 17));
        clipEndOverlayView.n.add(new yc(this, 19));
        clipEndOverlayView.setButtonsClickListener(new afd(this));
        xuu0Var.N(new j1(this, 22));
        xuu0Var.setOnClickListener(new bfd(this));
    }

    public static int[] P7() {
        return new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 14), n8g.l(-16777216, 74), n8g.l(-16777216, 155), n8g.l(-16777216, 255)};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final void C7(View view) {
        if (r7().k0()) {
            Rect F = bwt0.F(view);
            if (((Boolean) this.v0.v.getValue()).booleanValue()) {
                float f = 8;
                F.left = iah0.a(f) + F.left;
                F.right = iah0.a(f) + F.right;
            }
            float f2 = 8;
            F.top -= iah0.a(f2);
            F.bottom -= iah0.a(f2);
            VkTooltip.a aVar = new VkTooltip.a(this.itemView.getContext());
            aVar.b = this.itemView.getContext().getString(R.string.clips_tooltip_sound_disabled_control);
            aVar.f = VkTooltip.TooltipGravity.LEFT;
            aVar.e = VkTooltip.Appearance.InvariablyWhite;
            aVar.o = 2000L;
            aVar.n = new z8(this, 4);
            this.P0 = aVar.a(F);
        }
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.T(S7());
        }
        this.L0.c();
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final void J7(u1c0 u1c0Var, boolean z, String str) {
        VideoFile videoFile;
        String a1;
        this.Q0 = z;
        a6(u1c0Var);
        boolean z2 = false;
        if (epx.f(str, "feed_top") || epx.f(str, "feed_recent")) {
            g620.f().h().getClass();
            if (N7() != null) {
                ClipVideoFile N7 = N7();
                if (!(N7 != null ? epx.f(N7.P1, Boolean.TRUE) : false)) {
                    NewsEntry newsEntry = u1c0Var.a;
                    if (!di60.y(newsEntry)) {
                        VideoAttachment l = di60.l(newsEntry);
                        if (((l == null || (videoFile = l.k) == null) ? null : videoFile.p1()) == null) {
                            VideoAttachment l2 = di60.l(newsEntry);
                            VideoFile videoFile2 = l2 != null ? l2.k : null;
                            ClipVideoFile clipVideoFile = videoFile2 instanceof ClipVideoFile ? (ClipVideoFile) videoFile2 : null;
                            if (!(clipVideoFile != null ? epx.f(clipVideoFile.P1, Boolean.TRUE) : false)) {
                                z2 = true;
                            }
                        }
                    }
                }
            }
        }
        ClipEndOverlayView clipEndOverlayView = this.L0;
        if (!z2) {
            clipEndOverlayView.c = null;
            clipEndOverlayView.l = null;
            return;
        }
        ClipVideoFile N72 = N7();
        if (N72 == null || (a1 = N72.a1()) == null) {
            return;
        }
        xme xmeVar = (xme) this.A0.getValue();
        HashMap<String, Object> hashMap = ((zof) this.w0.getValue()).a0().a;
        ?? q6 = q6();
        clipEndOverlayView.c();
        clipEndOverlayView.c = new mvc(q6, xmeVar, a1, this.I0, hashMap, clipEndOverlayView);
        clipEndOverlayView.l = new lyk0(xmeVar, a1);
    }

    public final boolean K7() {
        yg5 yg5Var = this.h0;
        return yg5Var != null && yg5Var.p0();
    }

    public final efd M7() {
        efd efdVar;
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        fad fadVar = ol60Var instanceof fad ? (fad) ol60Var : null;
        if (fadVar != null && (efdVar = fadVar.h) != null) {
            return efdVar;
        }
        u1c0 J02 = J0();
        ol60 ol60Var2 = J02 != null ? J02.h : null;
        tbd tbdVar = ol60Var2 instanceof tbd ? (tbd) ol60Var2 : null;
        if (tbdVar != null) {
            return tbdVar.h;
        }
        u1c0 J03 = J0();
        ol60 ol60Var3 = J03 != null ? J03.h : null;
        if (ol60Var3 instanceof efd) {
            return (efd) ol60Var3;
        }
        return null;
    }

    public final ClipVideoFile N7() {
        VideoAttachment videoAttachment = (VideoAttachment) this.E;
        VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
        if (videoFile instanceof ClipVideoFile) {
            return (ClipVideoFile) videoFile;
        }
        return null;
    }

    public final boolean Q7() {
        Boolean bool;
        ClickableStickers clickableStickers;
        List<pmc> list;
        efd M7 = M7();
        if (M7 != null) {
            rmc rmcVar = M7.o;
            bool = Boolean.valueOf((rmcVar == null || (list = rmcVar.a) == null) ? false : !list.isEmpty());
        } else {
            ClipVideoFile N7 = N7();
            if (N7 == null || (clickableStickers = N7.C1) == null) {
                bool = null;
            } else {
                bool = (Boolean) clickableStickers.f.getValue();
                bool.booleanValue();
            }
        }
        return epx.f(bool, Boolean.TRUE);
    }

    public final boolean R7() {
        Boolean bool;
        ClickableStickers clickableStickers;
        List<pmc> list;
        efd M7 = M7();
        if (M7 != null) {
            rmc rmcVar = M7.o;
            bool = Boolean.valueOf((rmcVar == null || (list = rmcVar.b) == null) ? false : !list.isEmpty());
        } else {
            ClipVideoFile N7 = N7();
            if (N7 == null || (clickableStickers = N7.C1) == null) {
                bool = null;
            } else {
                bool = (Boolean) clickableStickers.g.getValue();
                bool.getClass();
            }
        }
        return epx.f(bool, Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a S7() {
        return (a) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void T7() {
        String W0 = W0();
        if (W0 == null) {
            return;
        }
        this.T0.d(((b0d) this.B0.getValue()).a(W0).a0(asu0.a.d()).subscribe(new defpackage.x(new nm1(3, this, W0), 12)));
    }

    public final String W0() {
        ClipVideoFile N7 = N7();
        if (N7 != null) {
            return N7.r1();
        }
        return null;
    }

    @Override // xsna.rp6
    public final ol60 Y6(ol60 ol60Var) {
        ol60 ol60Var2;
        if ((ol60Var instanceof z1c0) && (ol60Var2 = ((z1c0) ol60Var).h.h) != null) {
            ol60Var = ol60Var2;
        }
        if (ol60Var instanceof efd) {
            return (efd) ol60Var;
        }
        return null;
    }

    @Override // xsna.eq6, xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        this.J0.setVisibility(this.Q0 ? 0 : 8);
        if (N7() != null) {
            this.M0.setVisibility(8);
            this.K0.setVisibility(8);
        }
    }

    @Override // xsna.fi
    public final ktc0 d7() {
        return this.t0;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fh5.b
    public final void i5(fh5.a aVar, fh5.a aVar2) {
        if (aVar.e() == aVar2.e()) {
            return;
        }
        boolean e = aVar2.e();
        f1 f1Var = this.S0;
        TextView textView = this.M0;
        if (!e) {
            textView.postDelayed(new to2(f1Var, 3), 1500L);
        } else {
            textView.removeCallbacks(new v86(3, f1Var));
            textView.setSelected(false);
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final com.vk.libvideo.autoplay.a k7() {
        com.vk.libvideo.autoplay.a k7 = super.k7();
        ClipVideoFile N7 = N7();
        return com.vk.libvideo.autoplay.a.a(k7, (N7 == null || !egd.c(N7)) ? RepeatMode.OFF : RepeatMode.ALWAYS, null, SubtitlesConfigurationMode.ALWAYS_DISABLED, new toz.a(), null, null, 511997);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ClipVideoFile N7 = N7();
        if (N7 != null && (str = N7.W) != null) {
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
        }
        super.onClick(view);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        mid0 mid0Var = (mid0) this.E0.getValue();
        if (mid0Var != null) {
            mid0Var.b();
        }
        mid0 mid0Var2 = (mid0) this.F0.getValue();
        if (mid0Var2 != null) {
            mid0Var2.b();
        }
        if (this.E == 0 && this.C == 0) {
            return;
        }
        a S7 = S7();
        S7.getClass();
        S7.c = new WeakReference<>(this);
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.f0(S7());
        }
        T7();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        S7().c = null;
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.T(S7());
        }
        this.T0.dispose();
        mid0 mid0Var = (mid0) this.E0.getValue();
        if (mid0Var != null) {
            mid0Var.c();
        }
        mid0 mid0Var2 = (mid0) this.F0.getValue();
        if (mid0Var2 != null) {
            mid0Var2.c();
        }
        VkTooltip vkTooltip = this.P0;
        if (vkTooltip != null) {
            vkTooltip.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7 */
    public final void c7(VideoAttachment videoAttachment) {
        VideoFile A;
        float width = r7().getWidth() / r7().getHeight();
        Float E0 = this.s0.E0();
        if (E0 != null) {
            this.m0 = width > E0.floatValue() ? TransformController.ScaleType.FIT : TransformController.ScaleType.CROP;
        }
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.T(S7());
        }
        super.c7(videoAttachment);
        if (videoAttachment != null) {
            a S7 = S7();
            S7.getClass();
            S7.c = new WeakReference<>(this);
            yg5 yg5Var2 = this.h0;
            if (yg5Var2 != null) {
                yg5Var2.f0(S7());
            }
        }
        boolean z = this.u0;
        if (z && Q7()) {
            com.vk.toggle.b.A.o(ClipsFeatures.CLIPS_PRODUCT_ITEMS_SHOW_TIME);
        }
        mid0 mid0Var = (mid0) this.E0.getValue();
        View a2 = mid0Var != null ? mid0Var.a() : null;
        boolean z2 = z && (Q7() || R7());
        yg5 yg5Var3 = this.h0;
        this.N0.x3(a2, z2, (yg5Var3 == null || (A = yg5Var3.A()) == null || A.k0()) ? false : true);
        this.R0 = false;
        boolean z3 = z && Q7();
        mid0 mid0Var2 = (mid0) this.F0.getValue();
        View a3 = mid0Var2 != null ? mid0Var2.a() : null;
        ClipEndOverlayView clipEndOverlayView = this.L0;
        clipEndOverlayView.o = a3;
        clipEndOverlayView.p = z3;
        T7();
    }

    /* compiled from: ClipVideoHolder.kt */
    public final class a implements hnt0 {
        public final v8d b;
        public WeakReference<cfd> c;

        public a(v8d v8dVar) {
            this.b = v8dVar;
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
            WeakReference<cfd> weakReference;
            cfd cfdVar;
            String r1;
            if (!z || (weakReference = this.c) == null || (cfdVar = weakReference.get()) == null) {
                return;
            }
            int i = cfd.U0;
            ClipVideoFile N7 = cfdVar.N7();
            if (N7 == null || (r1 = N7.r1()) == null) {
                return;
            }
            this.b.a(SystemClock.elapsedRealtime(), r1);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            WeakReference<cfd> weakReference;
            cfd cfdVar;
            WeakReference<cfd> weakReference2;
            cfd cfdVar2;
            rmc a;
            if (!yg5Var.p() || (weakReference = this.c) == null || (cfdVar = weakReference.get()) == null || !cfdVar.u0) {
                return;
            }
            if ((!cfdVar.Q7() && !cfdVar.R7()) || (weakReference2 = this.c) == null || (cfdVar2 = weakReference2.get()) == null) {
                return;
            }
            ?? r0 = cfdVar2.D0;
            efd M7 = cfdVar2.M7();
            if (M7 == null || (a = M7.o) == null) {
                ClipVideoFile N7 = cfdVar2.N7();
                a = N7 != null ? dfd.a.a(N7) : null;
            }
            if (a != null) {
                tmc tmcVar = a.c;
                List<pmc> list = a.a;
                ListBuilder e = e43.e();
                if (cfdVar2.u0) {
                    e.addAll(a.b);
                    e.addAll(list);
                }
                ListBuilder g = e.g();
                mid0 mid0Var = (mid0) cfdVar2.E0.getValue();
                if (mid0Var != null) {
                    mid0Var.d(g, tmcVar, (izs) r0.getValue());
                }
                mid0 mid0Var2 = (mid0) cfdVar2.F0.getValue();
                if (mid0Var2 != null) {
                    mid0Var2.d(list, new tmc(tmcVar.a, tmcVar.b, smc.i.a, tmcVar.d, tmcVar.e, tmcVar.f, tmcVar.g), (izs) r0.getValue());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r11 > (((xsna.zof) r2.getValue()).n().c * 1000)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        
            r10.N0.a1(true, true);
            r10.R0 = true;
            r10.O0.setVisibility(8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        
            if (r11 > (r13 * ((xsna.zof) r2.getValue()).n().c)) goto L32;
         */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.hnt0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            tkp b;
            cfd cfdVar;
            WeakReference<cfd> weakReference;
            cfd cfdVar2;
            WeakReference<cfd> weakReference2 = this.c;
            if (weakReference2 != null && (cfdVar = weakReference2.get()) != null && cfdVar.u0 && ((cfdVar.Q7() || cfdVar.R7()) && (weakReference = this.c) != null && (cfdVar2 = weakReference.get()) != null)) {
                ?? r2 = cfdVar2.w0;
                if (!cfdVar2.R0) {
                    int i = b.$EnumSwitchMapping$0[((zof) r2.getValue()).n().b.ordinal()];
                    if (i == 1) {
                        cfdVar2.R0 = true;
                    } else if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            cfd cfdVar3 = cfd.this;
            if (!cfdVar3.H0 || (b = com.vk.toggle.d.K0.b()) == null || j2 - j > b.a * 1000) {
                return;
            }
            ClipEndOverlayView clipEndOverlayView = cfdVar3.L0;
            if (clipEndOverlayView.q) {
                return;
            }
            clipEndOverlayView.q = true;
            clipEndOverlayView.a();
            clipEndOverlayView.b();
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
