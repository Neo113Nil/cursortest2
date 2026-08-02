package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.model.FeedItem.n;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.a;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.transform.TransformController;
import xsna.f5h0;
import xsna.nlh0;
import xsna.toz;
import xsna.ye0;

/* compiled from: ClipFeedItemView.kt */
/* loaded from: classes17.dex */
public final class twc<Item extends FeedItem.n> extends ConstraintLayout implements mnt0, nlh0.a, hnt0 {
    public String A;
    public boolean B;
    public cnt0 C;
    public Item D;
    public yg5 E;
    public int F;
    public final awc G;
    public final bpn0 H;
    public VideoFile I;
    public y950 J;
    public y950 K;
    public z8e L;
    public final PorterDuffColorFilter M;
    public final kxc t;
    public final gxp0 u;
    public final h3d v;
    public final pih0 w;
    public final ClipsScreenPerformanceReporter x;
    public final zof y;
    public io.reactivex.rxjava3.disposables.c z;

    /* compiled from: ClipFeedItemView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RepeatMode.values().length];
            try {
                iArr[RepeatMode.BY_VIDEO_PARAMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RepeatMode.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RepeatMode.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipFeedItemView.kt */
    public static final class b implements a.InterfaceC1207a {
        public final /* synthetic */ y0r a;

        public b(y0r y0rVar) {
            this.a = y0rVar;
        }

        @Override // com.vk.libvideo.autoplay.a.InterfaceC1207a
        public final int a() {
            return this.a.a;
        }

        public final boolean equals(Object obj) {
            return epx.f(this.a, obj);
        }

        @Override // com.vk.libvideo.autoplay.a.InterfaceC1207a
        public final int getSessionId() {
            return this.a.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public twc() {
        throw null;
    }

    public twc(Context context, kxc kxcVar, gxp0 gxp0Var, h3d h3dVar, pih0 pih0Var, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, zof zofVar) {
        super(context, null, 0);
        this.t = kxcVar;
        this.u = gxp0Var;
        this.v = h3dVar;
        this.w = pih0Var;
        this.x = clipsScreenPerformanceReporter;
        this.y = zofVar;
        this.F = -1;
        this.H = new bpn0(new na(this, 19));
        this.M = new PorterDuffColorFilter(Color.argb(153, 0, 0, 0), PorterDuff.Mode.SRC_ATOP);
        setId(R.id.clip_feed_item_view);
        setLayoutParams(new ConstraintLayout.b(-1, -1));
        LayoutInflater.from(getContext()).inflate(R.layout.item_fullscreen_feed_clip_redesign, (ViewGroup) this, true);
        this.G = new awc(this);
        ClipFeedScreenType.Companion.getClass();
        if (ClipFeedScreenType.a.a(context, false) != ClipFeedScreenType.SQUARE || iah0.f().densityDpi < 320) {
            return;
        }
        ((ConstraintLayout.b) getVideo().getLayoutParams()).G = "9:16";
        ((ConstraintLayout.b) getCover().getLayoutParams()).G = "9:16";
    }

    public static String Q4(VideoFile videoFile) {
        String str;
        ImageSize f = w65.f(videoFile.e1());
        if (f != null && (str = f.d.d) != null) {
            return str;
        }
        ImageSize f2 = w65.f(videoFile.getImage());
        if (f2 != null) {
            return f2.d.d;
        }
        ImageSize Cb = videoFile.e1().Cb(videoFile.getWidth(), true, true);
        String str2 = Cb != null ? Cb.d.d : null;
        return str2 == null ? "" : str2;
    }

    public static boolean U4(View view, VideoFile videoFile) {
        return (((float) view.getHeight()) / ((float) view.getWidth())) - (((float) videoFile.getHeight()) / ((float) videoFile.getWidth())) <= 0.2f;
    }

    private final fot getDetector() {
        return (fot) this.H.getValue();
    }

    private final void setItem(Item item) {
        kih0 j;
        this.D = item;
        this.E = (item == null || (j = item.j()) == null) ? null : d370.R(j);
    }

    @Override // xsna.nlh0.a
    public final void A1(SdkVideoFile sdkVideoFile, List<? extends olh0> list) {
        yg5 autoPlay;
        boolean M5;
        VideoFile A = k15.A(sdkVideoFile);
        if (epx.f(this.I, A) || (autoPlay = getAutoPlay()) == null) {
            return;
        }
        VideoFileOld copy = A.copy();
        this.I = copy;
        copy.t0 = A.U();
        if (list.isEmpty()) {
            int i = a.$EnumSwitchMapping$0[getVideoConfig().b.ordinal()];
            if (i == 1) {
                M5 = autoPlay.A().M5();
            } else if (i == 2) {
                M5 = true;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                M5 = false;
            }
            if (autoPlay.a() && M5) {
                autoPlay.K0(true);
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (isLaidOut()) {
                getCover().setActualScaleType(U4(this, A) ? f5h0.f.a : f5h0.i.a);
            } else {
                addOnLayoutChangeListener(new uwc(this, A));
            }
            y950 y950Var = this.J;
            if (y950Var != null) {
                y950Var.a(autoPlay);
            }
            if (!epx.f(A.r1(), getCover().getTag())) {
                io.reactivex.rxjava3.disposables.c cVar = this.z;
                if (cVar != null) {
                    cVar.dispose();
                }
                this.A = null;
                getCover().getBackend().cancel();
                getCover().setTag(A.r1());
                if (this.F == 0) {
                    getCover().load(Q4(A));
                } else {
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new km9(this, A));
                    asu0 asu0Var = asu0.a;
                    this.z = io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).o("").subscribe(new pf1(new fm0(this, 19), 8));
                }
            }
            if (getVideo().isLaidOut()) {
                VideoTextureView video = getVideo();
                TransformController.ScaleType T4 = T4(A);
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                video.i(T4, false);
                getVideo().getMatrixProvider().l(A.getWidth(), A.getHeight());
            } else {
                getVideo().getMatrixProvider().l(A.getWidth(), A.getHeight());
                if (isLaidOut()) {
                    getVideo().i(T4(A), false);
                } else {
                    addOnLayoutChangeListener(new vwc(this, A));
                }
            }
            setKeepScreenOn(autoPlay.isPlaying());
        }
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        getVideo().getMatrixProvider().l(i, i2);
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i, i2);
    }

    public final void P4(Item item, List<? extends olh0> list) {
        setItem(item);
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.c.b.d = new e3i0(item.k(), item.j(), false);
        }
        A1(item.k(), list);
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        y950 y950Var;
        if (!videoAutoPlay.J()) {
            d3m.e(this.G.d, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
        if (videoAutoPlay.x.h() || (y950Var = this.K) == null) {
            return;
        }
        y950Var.b(true);
    }

    public final TransformController.ScaleType T4(VideoFile videoFile) {
        return videoFile.X2() ? TransformController.ScaleType.FIT : U4(this, videoFile) ? TransformController.ScaleType.CROP : TransformController.ScaleType.FIT;
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        setKeepScreenOn(true);
        awc awcVar = this.G;
        if (awcVar.d.getVisibility() != 0) {
            d3m.e(awcVar.d, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.b(false);
        }
    }

    public final void V4(boolean z) {
        y950 y950Var;
        Item item = this.D;
        if (item == null) {
            return;
        }
        if (z) {
            yg5 autoPlay = getAutoPlay();
            if (autoPlay != null && autoPlay.d() && (y950Var = this.K) != null) {
                y950Var.b(true);
            }
        } else {
            yg5 autoPlay2 = getAutoPlay();
            if (autoPlay2 != null) {
                autoPlay2.O();
            }
            yg5 autoPlay3 = getAutoPlay();
            if (autoPlay3 != null) {
                autoPlay3.I();
            }
            yg5 autoPlay4 = getAutoPlay();
            if (autoPlay4 != null) {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                b.C1208b.a().a(autoPlay4);
            }
            y950 y950Var2 = this.K;
            if (y950Var2 != null) {
                y950Var2.b(false);
            }
        }
        y950 y950Var3 = this.K;
        if (y950Var3 != null) {
            i3i0 i3i0Var = y950Var3.c.b;
            if (z) {
                i3i0Var.d();
            } else {
                i3i0Var.a();
            }
        }
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        Item item;
        y950 y950Var;
        if (videoAutoPlay.x.h() || (item = this.D) == null || (y950Var = this.K) == null) {
            return;
        }
        y950Var.c.b.c.d(j, j2);
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.b(false);
        }
        f4m.j(getCover());
        if (yg5Var.j0(getVideo())) {
            this.x.g();
        }
    }

    public final int getAdapterPosition() {
        return this.F;
    }

    public final pih0 getAnalyticsCallback() {
        return this.w;
    }

    public final yg5 getAutoPlay() {
        return this.E;
    }

    public final h3d getCallback() {
        return this.v;
    }

    public final awc getCommonOverlayContainer() {
        return this.G;
    }

    public final VKImageView getCover() {
        return this.G.b;
    }

    public cnt0 getFocusController() {
        return this.C;
    }

    public final Item getItem() {
        return this.D;
    }

    public final gzs<ClipSeekBarController> getSeekbarControllerProvider() {
        return this.t;
    }

    public final z8e getTransitionViewsProvider() {
        return this.L;
    }

    public final gxp0 getUiVisibilityBehavior() {
        return this.u;
    }

    public final VideoTextureView getVideo() {
        return this.G.a;
    }

    @Override // xsna.dnt0
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.mnt0
    public com.vk.libvideo.autoplay.a getVideoConfig() {
        y0r J4;
        SdkVideoFile k;
        Item item = this.D;
        boolean z = false;
        if (item != null && (k = item.k()) != null && dgd.f(k)) {
            z = true;
        }
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        z0d0 z0d0Var = frd.b;
        RepeatMode repeatMode = z ? RepeatMode.OFF : RepeatMode.ALWAYS;
        Item item2 = this.D;
        chs0 chs0Var = null;
        b bVar = (item2 == null || (J4 = item2.J4()) == null) ? null : new b(J4);
        SubtitlesConfigurationMode subtitlesConfigurationMode = SubtitlesConfigurationMode.ALWAYS_DISABLED;
        toz.a aVar = new toz.a();
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType = AutoPlayAdPixelsTrackerType.CLIPS;
        PlayerType playerType = PlayerType.FULLSCREEN;
        ScreenType screenType = ScreenType.PORTRAIT;
        if (z0d0Var != null && frd.a()) {
            chs0Var = new chs0(z0d0Var);
        }
        return new com.vk.libvideo.autoplay.a(true, repeatMode, null, false, false, false, bVar, subtitlesConfigurationMode, aVar, autoPlayAdPixelsTrackerType, playerType, screenType, false, chs0Var, 133080);
    }

    @Override // xsna.dnt0
    public boolean getVideoFocused() {
        return this.B;
    }

    @Override // xsna.mnt0
    /* renamed from: getVideoView */
    public VideoTextureView mo407getVideoView() {
        return getVideo();
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        awc awcVar = this.G;
        VideoErrorView videoErrorView = awcVar.d;
        String string = getResources().getString(i);
        VideoErrorView videoErrorView2 = awcVar.d;
        VideoErrorView.a data = videoErrorView2.getData();
        View.OnClickListener onClickListener = data != null ? data.b : null;
        VideoErrorView.a data2 = videoErrorView2.getData();
        videoErrorView.a(new VideoErrorView.a(string, onClickListener, data2 != null ? data2.c : false, 32));
        d3m.c(awcVar.d, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.b(false);
        }
        setKeepScreenOn(false);
        getCover().getHierarchy().n(this.M);
        y950 y950Var2 = this.J;
        if (y950Var2 != null) {
            y950Var2.a(yg5Var);
        }
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d3b0 v0;
        super.onAttachedToWindow();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay == null) {
            return;
        }
        autoPlay.f0(this);
        if (autoPlay.isPlaying() && (v0 = autoPlay.v0()) != null) {
            v0.j(mo407getVideoView());
        }
        String str = this.A;
        if (str != null) {
            getCover().load(str);
            this.A = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        for (int i = 0; i < getChildCount(); i++) {
            d3m.b(getChildAt(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.T(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getVideoFocused()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!getVideoFocused()) {
            return true;
        }
        getDetector().a(motionEvent);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (BuildInfo.h() && view.getId() == -1) {
            throw new IllegalArgumentException("Trying to add view without id: ".concat(qjg.a(view)));
        }
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.b(false);
        }
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        y950 y950Var = this.K;
        if (y950Var != null) {
            y950Var.b(false);
        }
        setKeepScreenOn(false);
    }

    public final void setAdapterPosition(int i) {
        this.F = i;
    }

    @Override // xsna.mnt0
    public void setFocusController(cnt0 cnt0Var) {
        this.C = cnt0Var;
    }

    public final void setTransitionViewsProvider(z8e z8eVar) {
        this.L = z8eVar;
    }

    @Override // xsna.dnt0
    public void setVideoFocused(boolean z) {
        boolean videoFocused = getVideoFocused();
        this.B = z;
        if (z && !videoFocused) {
            V4(true);
        } else {
            if (z || !videoFocused) {
                return;
            }
            V4(false);
        }
    }

    @Override // xsna.hnt0
    public final void u() {
        y950 y950Var;
        yg5 autoPlay = getAutoPlay();
        if (autoPlay == null || (y950Var = this.J) == null) {
            return;
        }
        y950Var.a(autoPlay);
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

    @Override // xsna.mnt0
    public final void G2(View view) {
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.nlh0.a
    public final void L2(boolean z) {
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
    public final void j4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void q(List<? extends SubtitleRenderItem> list) {
    }

    @Override // xsna.mnt0
    public final void w0(View view) {
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
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
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
}
