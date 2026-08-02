package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.libvideo.models.videotracker.FullscreenTransition;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.libvideo.ui.video2.controls.VideoControlsUiEvent;
import com.vk.media.player.VideoMode;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.a;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.controls.view.state.Mode;
import one.video.controls20.SimpleControlsView;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.FrameSize;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import one.video.transform.TransformController;
import ru.ok.proto.PublisherConfiguration;
import xsna.d5b0;
import xsna.fpe0;
import xsna.fys;
import xsna.ir20;
import xsna.t5t0;
import xsna.wox;
import xsna.xn50;
import xsna.ye0;
import xsna.yks0;

/* compiled from: MiniPlayerView2Wrapper.kt */
/* loaded from: classes7.dex */
public final class gr20 implements ir20, owa0 {
    public final Context b;
    public final ViewGroup c;
    public final hr20 d;
    public final i8z e;
    public final i8z f;
    public final ir20.a g;
    public final com.vk.video.ui.discovery.minimizable.j h;
    public v49 i;
    public final c4k0 j = new c4k0(new cvs(this, 19), new w910(this, 1));
    public final AppCompatActivity k;
    public final View l;
    public final c m;
    public final b n;
    public final a o;
    public nit0 p;
    public VideoMinimizableState q;
    public io.reactivex.rxjava3.disposables.c r;
    public yg5 s;
    public xnt0 t;
    public final sqt0 u;
    public final sqt0 v;

    /* compiled from: MiniPlayerView2Wrapper.kt */
    public final class a implements rds0 {

        /* compiled from: MiniPlayerView2Wrapper.kt */
        /* renamed from: xsna.gr20$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2954a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[VideoControlsUiEvent.Seek.Source.values().length];
                try {
                    iArr[VideoControlsUiEvent.Seek.Source.Slider.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoControlsUiEvent.Seek.Source.DoubleTap.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[AdaptiveTrackSelectionInterval.values().length];
                try {
                    iArr2[AdaptiveTrackSelectionInterval.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[AdaptiveTrackSelectionInterval.LOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[AdaptiveTrackSelectionInterval.HIGH.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public a() {
        }

        @Override // xsna.rds0
        public final void a(VideoControlsUiEvent videoControlsUiEvent) {
            wox woxVar;
            VideoSeekEventSource videoSeekEventSource;
            fpe0 fpe0Var;
            QualitySettingsType qualitySettingsType;
            d3b0 v0;
            int i;
            cms0 cms0Var;
            cms0 cms0Var2;
            FrameSize b;
            gr20 gr20Var = gr20.this;
            i8z i8zVar = gr20Var.f;
            hr20 hr20Var = gr20Var.d;
            com.vk.video.ui.discovery.minimizable.j jVar = gr20Var.h;
            if (videoControlsUiEvent instanceof VideoControlsUiEvent.f) {
                hr20Var.b.a(Float.valueOf(((VideoControlsUiEvent.f) videoControlsUiEvent).a));
                return;
            }
            if (videoControlsUiEvent instanceof VideoControlsUiEvent.c) {
                nit0 nit0Var = gr20Var.p;
                if (nit0Var == null || nit0Var.c == null) {
                    return;
                }
                ((VideoControlsUiEvent.c) videoControlsUiEvent).getClass();
                return;
            }
            if (videoControlsUiEvent instanceof VideoControlsUiEvent.g) {
                one.video.player.tracks.c cVar = ((VideoControlsUiEvent.g) videoControlsUiEvent).a;
                if (cVar != null && (cms0Var2 = (cms0) cVar.c) != null && (b = cms0Var2.b()) != null) {
                    jVar.p(new fpe0.d(b));
                }
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    FrameSize b2 = (cVar == null || (cms0Var = (cms0) cVar.c) == null) ? null : cms0Var.b();
                    yg5 yg5Var = gr20Var.s;
                    d3b0 v02 = yg5Var != null ? yg5Var.v0() : null;
                    if (b2 == null || v02 == null) {
                        return;
                    }
                    switch (d5b0.a.$EnumSwitchMapping$0[e3r0.a(b2.getWidth(), b2.getHeight()).ordinal()]) {
                        case 1:
                            i = 144;
                            break;
                        case 2:
                            i = PsExtractor.VIDEO_STREAM_MASK;
                            break;
                        case 3:
                            i = 360;
                            break;
                        case 4:
                            i = 480;
                            break;
                        case 5:
                            i = PublisherConfiguration.DEFAULT_MAX_RES;
                            break;
                        case 6:
                            i = 1080;
                            break;
                        case 7:
                            i = 1440;
                            break;
                        case 8:
                            i = 2160;
                            break;
                        case 9:
                            i = 4320;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    i8zVar.bk(new cat0(v02, i));
                    return;
                }
                return;
            }
            if (videoControlsUiEvent instanceof VideoControlsUiEvent.d) {
                AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = ((VideoControlsUiEvent.d) videoControlsUiEvent).a;
                int[] iArr = C2954a.$EnumSwitchMapping$1;
                int i2 = iArr[adaptiveTrackSelectionInterval.ordinal()];
                if (i2 == 1) {
                    fpe0Var = fpe0.a.a;
                } else if (i2 == 2) {
                    fpe0Var = fpe0.b.a;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fpe0Var = fpe0.c.a;
                }
                jVar.p(fpe0Var);
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
                videoFeatures2.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures2)) {
                    int i3 = iArr[adaptiveTrackSelectionInterval.ordinal()];
                    if (i3 == 1) {
                        qualitySettingsType = QualitySettingsType.AUTO;
                    } else if (i3 == 2) {
                        qualitySettingsType = QualitySettingsType.ECONOM;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qualitySettingsType = QualitySettingsType.HIGH;
                    }
                    fxc0.B().h0(qualitySettingsType);
                    yg5 yg5Var2 = gr20Var.s;
                    if (yg5Var2 == null || (v0 = yg5Var2.v0()) == null) {
                        return;
                    }
                    i8zVar.bk(new fat0(v0, qualitySettingsType));
                    return;
                }
                return;
            }
            if (videoControlsUiEvent instanceof VideoControlsUiEvent.Seek) {
                yg5 yg5Var3 = gr20Var.s;
                if (yg5Var3 == null) {
                    return;
                }
                zet0 zet0Var = hr20Var.c;
                VideoFile A = yg5Var3.A();
                yet0 yet0Var = new yet0(Long.valueOf(A.o0()), A.I0(), A.r());
                int i4 = C2954a.$EnumSwitchMapping$0[((VideoControlsUiEvent.Seek) videoControlsUiEvent).a.ordinal()];
                if (i4 == 1) {
                    nit0 nit0Var2 = gr20Var.p;
                    if (nit0Var2 != null) {
                        z0u0 z0u0Var = nit0Var2.c;
                    }
                    videoSeekEventSource = VideoSeekEventSource.Slider;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoSeekEventSource = VideoSeekEventSource.DoubleTap;
                }
                VideoSeekEventSource videoSeekEventSource2 = videoSeekEventSource;
                VideoMinimizableState videoMinimizableState = gr20Var.q;
                zet0Var.a(yet0Var, videoSeekEventSource2, videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? VideoSeekEventScreenMode.FullscreenLandscape : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? VideoSeekEventScreenMode.FullscreenPortrait : VideoSeekEventScreenMode.Discovery, TimeUnit.MILLISECONDS.toSeconds(yg5Var3.getPosition()));
                return;
            }
            if (videoControlsUiEvent instanceof VideoControlsUiEvent.a) {
                VideoControlsUiEvent.a aVar = (VideoControlsUiEvent.a) videoControlsUiEvent;
                if (aVar.equals(VideoControlsUiEvent.a.C1252a.a)) {
                    jVar.h();
                    return;
                } else if (aVar.equals(VideoControlsUiEvent.a.b.a)) {
                    jVar.s(gr20Var.u.getDisplayView().getTransformController().e == TransformController.ScaleType.CROP);
                    return;
                } else {
                    if (!aVar.equals(VideoControlsUiEvent.a.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.t();
                    return;
                }
            }
            if (!(videoControlsUiEvent instanceof VideoControlsUiEvent.e)) {
                if (videoControlsUiEvent instanceof VideoControlsUiEvent.b) {
                    xn50.a.c(jVar.a, new c.k(((VideoControlsUiEvent.b) videoControlsUiEvent).a));
                    return;
                }
                return;
            }
            nit0 nit0Var3 = gr20Var.p;
            if (nit0Var3 == null || (woxVar = nit0Var3.e) == null) {
                return;
            }
            wox.a aVar2 = new wox.a();
            woxVar.a = aVar2;
            io.reactivex.rxjava3.subjects.d<it80<wox.a>> dVar = woxVar.b;
            it80.b.getClass();
            dVar.onNext(new it80<>(aVar2));
        }
    }

    public gr20(Context context, ViewGroup viewGroup, hr20 hr20Var, i8z i8zVar, i8z i8zVar2, ir20.a aVar, com.vk.video.ui.discovery.minimizable.j jVar) {
        this.b = context;
        this.c = viewGroup;
        this.d = hr20Var;
        this.e = i8zVar;
        this.f = i8zVar2;
        this.g = aVar;
        this.h = jVar;
        bpn0 bpn0Var = enj.a;
        this.k = (AppCompatActivity) e3m.h(context);
        View findViewById = viewGroup.findViewById(R.id.touchable_seek_zone);
        this.l = findViewById;
        this.m = new c();
        this.n = new b();
        this.o = new a();
        this.q = VideoMinimizableState.Hidden.b;
        sqt0 sqt0Var = new sqt0(context);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            oqt0 oqt0Var = new oqt0(0);
            SimpleControlsView simpleControlsView = sqt0Var.C;
            simpleControlsView.D = oqt0Var;
            findViewById.setOnTouchListener(new wpj0(simpleControlsView, 0));
        }
        this.u = sqt0Var;
        this.v = sqt0Var;
    }

    public static boolean g(VideoFile videoFile, boolean z) {
        boolean z2;
        if (videoFile != null && fxc0.B().s().k(videoFile)) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                z2 = true;
                return (z || z2) ? false : true;
            }
        }
        z2 = false;
        if (z) {
        }
    }

    @Override // xsna.ir20
    public final yks0.a Gc() {
        return this.n;
    }

    @Override // xsna.ir20
    public final boolean H4() {
        return this.s != null;
    }

    @Override // xsna.ir20
    public final void L2(lat0 lat0Var) {
        m4b0 m4b0Var;
        nit0 nit0Var = this.p;
        if (nit0Var == null || (m4b0Var = nit0Var.b) == null) {
            return;
        }
        jya0 jya0Var = new jya0(lat0Var.a, lat0Var.b);
        if (epx.f(m4b0Var.l, jya0Var)) {
            return;
        }
        m4b0Var.l = jya0Var;
        m4b0Var.b();
    }

    @Override // xsna.ir20
    public final void Q(VideoMinimizableState videoMinimizableState) {
        if (epx.f(this.q, videoMinimizableState)) {
            return;
        }
        this.q = videoMinimizableState;
        nit0 nit0Var = this.p;
        if (nit0Var != null) {
            ScreenState c2 = c();
            z0u0 z0u0Var = nit0Var.c;
            if (nit0Var.h != c2) {
                nit0Var.h = c2;
                if (z0u0Var.b != c2) {
                    z0u0Var.b = c2;
                    z0u0Var.b();
                }
                if (z0u0Var.b == ScreenState.INLINE) {
                    m4b0 m4b0Var = nit0Var.b;
                    TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
                    if (m4b0Var.k != scaleType) {
                        m4b0Var.k = scaleType;
                        m4b0Var.b();
                    }
                }
            }
        }
        if (o8() && (videoMinimizableState instanceof VideoMinimizableState.Animating) && com.vk.libvideo.api.minimizable.a.c((VideoMinimizableState.Animating) videoMinimizableState, new Class[]{VideoMinimizableState.Expanded.class}, new Class[]{VideoMinimizableState.FullscreenHorizontal.class, VideoMinimizableState.FullscreenVertical.class})) {
            this.u.C.v.f(Mode.HIDE, true);
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
            return;
        }
        this.k.getResources().getConfiguration();
    }

    @Override // xsna.ir20
    public final void Sf(boolean z) {
        z0u0 z0u0Var;
        nit0 nit0Var = this.p;
        if (nit0Var == null || (z0u0Var = nit0Var.c) == null || z0u0Var.g == z) {
            return;
        }
        z0u0Var.g = z;
        z0u0Var.b();
    }

    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return this.t;
    }

    @Override // xsna.ir20
    public final void Z0(PlayerRemoteController.Properties properties) {
        z0u0 z0u0Var;
        nit0 nit0Var = this.p;
        if (nit0Var == null || (z0u0Var = nit0Var.c) == null) {
            return;
        }
        boolean z = properties.b;
        if (z0u0Var.d != z) {
            z0u0Var.d = z;
            z0u0Var.b();
        }
        boolean z2 = properties.c;
        yg5 yg5Var = this.s;
        boolean g = g(yg5Var != null ? yg5Var.A() : null, z2);
        if (z0u0Var.e != g) {
            z0u0Var.e = g;
            z0u0Var.b();
        }
    }

    @Override // xsna.i2b0
    public final boolean a() {
        return false;
    }

    @Override // xsna.ir20
    public final void a2(VideoAnnounceState videoAnnounceState) {
        m4b0 m4b0Var;
        boolean z;
        nit0 nit0Var = this.p;
        if (nit0Var == null || (m4b0Var = nit0Var.b) == null || m4b0Var.m == (!(videoAnnounceState instanceof VideoAnnounceState.Shown))) {
            return;
        }
        m4b0Var.m = z;
        m4b0Var.b();
    }

    @Override // xsna.i2b0
    public final Boolean b() {
        return Boolean.valueOf(this.u.getDisplayView().g());
    }

    @Override // xsna.ir20
    public final void b7() {
        OneVideoPlayer a2;
        yg5 yg5Var = this.s;
        if (yg5Var != null) {
            yg5Var.T(this.m);
            yg5Var.T(((MiniPlayerControllersWrapper) this.g.a.c).v);
            d3b0 v0 = yg5Var.v0();
            if (v0 != null && (a2 = v0.a()) != null) {
                a2.setPlaybackSpeed(1.0f);
            }
            yg5Var.k0();
            super.jg(yg5Var);
        }
        yg5 yg5Var2 = this.s;
        if (yg5Var2 != null) {
            yg5Var2.C(true);
        }
        this.s = null;
        rts0.b.b(null);
    }

    public final ScreenState c() {
        VideoMinimizableState videoMinimizableState = this.q;
        if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
            return ScreenState.INLINE;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) {
            return ((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b ? ScreenState.INLINE : ScreenState.FULLSCREEN_VERTICAL;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) {
            return ScreenState.FULLSCREEN_HORIZONTAL;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
            return ScreenState.MINI;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Pip) {
            return ScreenState.PIP;
        }
        if ((videoMinimizableState instanceof VideoMinimizableState.Animating) && com.vk.libvideo.api.minimizable.a.b((VideoMinimizableState.Animating) videoMinimizableState, VideoMinimizableState.Expanded.Compact.class, VideoMinimizableState.Expanded.MatchRatio.class)) {
            return ScreenState.INLINE;
        }
        return null;
    }

    @Override // xsna.ir20
    public final int c2() {
        yg5 yg5Var = this.s;
        if (yg5Var != null) {
            return (int) (((yg5Var.isPlaying() || yg5Var.getPosition() > 0) ? yg5Var.getPosition() : com.vk.libvideo.autoplay.j.b(yg5Var.A())) / 1000);
        }
        return 0;
    }

    @Override // xsna.ir20
    public final void d() {
        this.i = new v49(this.b, (owa0) this);
        sqt0 sqt0Var = this.u;
        this.t = new xnt0(this.c, e43.l(sqt0Var.getDisplayView().getMatrixProvider(), new com.vk.libvideo.api.ui.b(sqt0Var.getCoverView()), new com.vk.libvideo.api.ui.c(sqt0Var.getOverlayView()), new com.vk.libvideo.api.ui.a(sqt0Var.getAdControlsView())), EmptyList.b, new wnt0(sqt0Var), true, true, true);
        sqt0Var.setControlsUiEventsListener(this.o);
    }

    @Override // xsna.ir20
    public final void dg(yks0 yks0Var) {
        yg5 yg5Var = this.s;
        if (yg5Var == null || yks0Var == null) {
            return;
        }
        yks0Var.d(yg5Var);
    }

    public final void e(boolean z) {
        nit0 nit0Var;
        z0u0 z0u0Var;
        z0u0 z0u0Var2;
        yg5 yg5Var = this.s;
        if (yg5Var == null || (nit0Var = this.p) == null || (z0u0Var = nit0Var.c) == null) {
            return;
        }
        com.vk.libvideo.autoplay.a a2 = z0u0Var.a();
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.d(z);
        yg5Var.a0(a2);
        yg5Var.l0();
        nit0 nit0Var2 = this.p;
        if (nit0Var2 == null || (z0u0Var2 = nit0Var2.c) == null || z0u0Var2.f == z) {
            return;
        }
        z0u0Var2.f = z;
        z0u0Var2.b();
    }

    @Override // xsna.ir20
    public final void e7(ir20.d dVar) {
        rlt0 m0;
        nit0 nit0Var;
        z0u0 z0u0Var;
        boolean z = dVar instanceof ir20.d.b;
        sqt0 sqt0Var = this.u;
        if (z) {
            yg5 yg5Var = this.s;
            if (yg5Var == null || (nit0Var = this.p) == null || (z0u0Var = nit0Var.c) == null) {
                return;
            }
            com.vk.libvideo.autoplay.a a2 = z0u0Var.a();
            if (yg5Var.a()) {
                return;
            }
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d()) {
                return;
            }
            yg5Var.z0(sqt0Var.getDisplayView(), a2, null);
            yg5Var.l0();
            yg5Var.play();
            return;
        }
        if (dVar instanceof ir20.d.f) {
            yg5 yg5Var2 = this.s;
            if (yg5Var2 != null && (m0 = yg5Var2.m0()) != null) {
                m0.m(FullscreenTransition.TAP);
            }
            yg5 yg5Var3 = this.s;
            if (yg5Var3 != null) {
                yg5Var3.x0(ForceLogReason.FULLSCREEN);
                return;
            }
            return;
        }
        if (dVar instanceof ir20.d.c) {
            return;
        }
        if (dVar instanceof ir20.d.C3076d) {
            sqt0Var.C.v.f(Mode.HIDE, ((ir20.d.C3076d) dVar).a);
        } else if (dVar instanceof ir20.d.h) {
            sqt0Var.C.Y4();
        }
    }

    public final void f(ir20.b bVar, izs<? super String, s3q0> izsVar) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        MiniPlayerControllersWrapper.VideoInfo videoInfo = bVar.a;
        yg5 e = a2.e(videoInfo.b, null);
        boolean z = videoInfo.f;
        VideoFile videoFile = videoInfo.b;
        long j = videoInfo.h;
        if (!z && e.M()) {
            e.D();
        }
        int duration = e.A().getDuration();
        if (0 <= j && j <= duration) {
            long j2 = 1000 * j;
            yg5 yg5Var = this.s;
            if (yg5Var != null) {
                yg5Var.seek(j2);
            }
            bpn0 bpn0Var2 = t5t0.e;
            t5t0.a.a().b(TimeUnit.SECONDS.toMillis(j), e.A().r1());
            this.h.v();
        }
        if (fxc0.B().J().k0() && videoInfo.i) {
            e.S(false);
        }
        boolean z2 = bVar.b;
        boolean z3 = bVar.c;
        PlayerRemoteController.Properties properties = videoInfo.g;
        boolean z4 = properties.b;
        boolean g = g(videoFile, properties.c);
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        boolean a3 = com.vk.libvideo.autoplay.e.a();
        hr20 hr20Var = this.d;
        hr20Var.a.getClass();
        ScreenState c2 = c();
        TransformController.ScaleType scaleType = this.n.b;
        this.j.getClass();
        SubtitlesConfigurationMode subtitlesConfigurationMode = SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE;
        ir20.a aVar = this.g;
        wzp0 wzp0Var = new wzp0(z2, z3, z4, g, a3, c2, scaleType, subtitlesConfigurationMode, !epx.f(((MiniPlayerControllersWrapper) aVar.e.c).o, fys.d.a));
        yg5 yg5Var2 = this.s;
        if (yg5Var2 != null) {
            yg5Var2.C(true);
        }
        this.s = e;
        rts0.b.b(e);
        yg5.o0(e, videoInfo.d, null, videoFile.r(), false, 2);
        e.f0(this.m);
        e.f0(((MiniPlayerControllersWrapper) aVar.a.c).v);
        ((MiniPlayerControllersWrapper) aVar.a.c).v.c(new a.c.b(e));
        sqt0 sqt0Var = this.u;
        nit0 nit0Var = new nit0(sqt0Var.getDisplayView(), e, wzp0Var, hr20Var.d.J(), new odm(this, 25));
        io.reactivex.rxjava3.disposables.c cVar = sqt0Var.p0;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.z0 z0Var = nit0Var.b.s;
        s1j0 s1j0Var = new s1j0(new egt0(sqt0Var, 1), 9);
        io.reactivex.rxjava3.core.q<mit0> qVar = nit0Var.g;
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(z0Var, qVar.U(s1j0Var), new sqk0(new bb9(7), 7));
        m.getClass();
        sqt0Var.p0 = new io.reactivex.rxjava3.internal.operators.observable.y(m, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new q440(new q3s0(sqt0Var, 4), 27));
        this.r = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, new rt10(new brf(nit0Var, e, this, bVar, 2), 2), io.reactivex.rxjava3.internal.functions.a.c), new h57(16, this, e));
        this.p = nit0Var;
        izsVar.invoke(e.d0());
    }

    @Override // xsna.ir20
    public final View getPlayerView() {
        return this.v;
    }

    @Override // xsna.owa0
    public final yg5 j() {
        return this.s;
    }

    @Override // xsna.ir20
    public final void j8(ir20.b bVar, yks0 yks0Var, dxh dxhVar) {
        i8z i8zVar = this.f;
        sqt0 sqt0Var = this.u;
        sqt0Var.setVideoClickActionCallback(i8zVar);
        sqt0Var.setAdControlsClickListener(new fr20(this, 0));
        sqt0Var.setAnimationDialogCallbackProvider(this.e);
        this.j.getClass();
        f(bVar, dxhVar);
    }

    @Override // xsna.ir20
    public final void ji(ir20.b bVar, vfk vfkVar) {
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
        }
        yg5 yg5Var = this.s;
        if (yg5Var != null) {
            yg5Var.T(this.m);
            yg5Var.T(((MiniPlayerControllersWrapper) this.g.a.c).v);
            super.jg(yg5Var);
        }
        f(bVar, vfkVar);
    }

    @Override // xsna.ir20
    public final void nm(boolean z) {
        nit0 nit0Var;
        l230 l230Var;
        etn b2 = gsi0.b();
        if (!b2.b || !b2.f || (nit0Var = this.p) == null || (l230Var = nit0Var.f) == null) {
            return;
        }
        l230Var.a = z;
        l230Var.b.onNext(Boolean.valueOf(z));
    }

    @Override // xsna.ir20
    public final boolean o8() {
        yg5 yg5Var = this.s;
        return yg5Var != null && yg5Var.isPlaying();
    }

    @Override // xsna.ir20
    public final void of(ArrayList arrayList) {
        aek aekVar;
        nit0 nit0Var = this.p;
        if (nit0Var == null || (aekVar = nit0Var.d) == null) {
            return;
        }
        aekVar.a = arrayList;
        ((io.reactivex.rxjava3.subjects.d) aekVar.b).onNext(arrayList);
    }

    @Override // xsna.ir20
    public final void onPause() {
        yg5 yg5Var;
        fbr0 fbr0Var;
        v49 v49Var = this.i;
        if (v49Var != null && (fbr0Var = (fbr0) ((c0a) v49Var.c).c) != null) {
            fbr0Var.c();
        }
        if (this.k.isInPictureInPictureMode() || (yg5Var = this.s) == null) {
            return;
        }
        yg5Var.pause();
    }

    @Override // xsna.ir20
    public final void onResume() {
        yg5 yg5Var;
        fbr0 fbr0Var;
        v49 v49Var = this.i;
        if (v49Var != null && (fbr0Var = (fbr0) ((c0a) v49Var.c).c) != null) {
            fbr0Var.d();
        }
        VideoMinimizableState videoMinimizableState = this.q;
        if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
            yg5 yg5Var2 = this.s;
            if (yg5Var2 != null) {
                yg5Var2.L(VideoMode.EMPTY);
                return;
            }
            return;
        }
        if (com.vk.libvideo.api.minimizable.a.g(videoMinimizableState)) {
            yg5 yg5Var3 = this.s;
            if (yg5Var3 != null) {
                yg5Var3.L(VideoMode.FULLSCREEN);
                return;
            }
            return;
        }
        if (!(this.q instanceof VideoMinimizableState.Collapsed) || (yg5Var = this.s) == null) {
            return;
        }
        yg5Var.L(VideoMode.MINIMIZED);
    }

    @Override // xsna.ir20
    public final void t() {
        sqf0 sqf0Var = new sqf0(13);
        sqt0 sqt0Var = this.u;
        sqt0Var.c = sqf0Var;
        sqt0Var.e = null;
        sqt0Var.b = null;
        sqt0Var.d = null;
        pgn pgnVar = sqt0Var.h0.b;
        qcy<Object> qcyVar = j3k.e[0];
        pgnVar.b(null);
        this.p = null;
        this.j.getClass();
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
        }
        this.t = null;
    }

    @Override // xsna.ir20
    public final void t5(ir20.c cVar) {
        m4b0 m4b0Var;
        if (cVar instanceof ir20.c.C3075c) {
            yg5 yg5Var = this.s;
            if (yg5Var != null) {
                yg5Var.pause();
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.d) {
            yg5 yg5Var2 = this.s;
            if (yg5Var2 != null) {
                yg5Var2.c();
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.e) {
            ((ir20.c.e) cVar).getClass();
            yg5 yg5Var3 = this.s;
            if (yg5Var3 != null) {
                yg5Var3.C(true);
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.j) {
            long j = ((ir20.c.j) cVar).a;
            yg5 yg5Var4 = this.s;
            if (yg5Var4 != null) {
                yg5Var4.seek(j);
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.f) {
            yg5 yg5Var5 = this.s;
            if (yg5Var5 != null) {
                yg5Var5.f();
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.g) {
            yg5 yg5Var6 = this.s;
            if (yg5Var6 != null) {
                yg5Var6.S(false);
                return;
            }
            return;
        }
        if (cVar instanceof ir20.c.h) {
            yg5 yg5Var7 = this.s;
            if (yg5Var7 != null) {
                yg5Var7.I();
            }
            yg5 yg5Var8 = this.s;
            if (yg5Var8 != null) {
                yg5Var8.play();
                return;
            }
            return;
        }
        boolean z = cVar instanceof ir20.c.b;
        com.vk.video.ui.discovery.minimizable.j jVar = this.h;
        if (z) {
            boolean z2 = ((ir20.c.b) cVar).a;
            e(z2);
            jVar.l(z2, DiscoveryAction.EventSource.BUTTON);
            return;
        }
        if (cVar instanceof ir20.c.a) {
            boolean z3 = ((ir20.c.a) cVar).a;
            e(z3);
            jVar.l(z3, DiscoveryAction.EventSource.SETTINGS_MENU);
            return;
        }
        if (!(cVar instanceof ir20.c.i)) {
            throw new NoWhenBranchMatchedException();
        }
        TransformController.ScaleType scaleType = ((ir20.c.i) cVar).a;
        b bVar = this.n;
        gr20 gr20Var = gr20.this;
        yg5 yg5Var9 = gr20Var.s;
        if (yg5Var9 == null || yg5Var9.P0()) {
            return;
        }
        bVar.b = scaleType;
        nit0 nit0Var = gr20Var.p;
        if (nit0Var == null || (m4b0Var = nit0Var.b) == null || m4b0Var.k == scaleType) {
            return;
        }
        m4b0Var.k = scaleType;
        m4b0Var.b();
    }

    /* compiled from: MiniPlayerView2Wrapper.kt */
    public final class b implements yks0.a {
        public TransformController.ScaleType b = TransformController.ScaleType.FIT;

        public b() {
        }

        @Override // xsna.yks0.a
        public final void He(List list, VideoFile videoFile) {
            nls0 nls0Var;
            nit0 nit0Var = gr20.this.p;
            if (nit0Var == null || (nls0Var = nit0Var.a) == null) {
                return;
            }
            nls0Var.a = videoFile;
            nls0Var.b.onNext(videoFile);
        }

        @Override // xsna.yks0.a
        public final void uf(boolean z) {
            m4b0 m4b0Var;
            yg5 yg5Var;
            gr20 gr20Var = gr20.this;
            if (z && (yg5Var = gr20Var.s) != null) {
                yg5Var.pause();
            }
            nit0 nit0Var = gr20Var.p;
            if (nit0Var == null || (m4b0Var = nit0Var.b) == null || m4b0Var.j == z) {
                return;
            }
            m4b0Var.j = z;
            m4b0Var.b();
        }

        @Override // xsna.yks0.a
        public final void vk(boolean z) {
            z0u0 z0u0Var;
            nit0 nit0Var = gr20.this.p;
            if (nit0Var == null || (z0u0Var = nit0Var.c) == null || z0u0Var.c == z) {
                return;
            }
            z0u0Var.c = z;
            z0u0Var.b();
        }

        @Override // xsna.yks0.a
        public final void dismiss() {
        }

        @Override // xsna.yks0.a
        public final void L9(VideoFile videoFile, boolean z) {
        }
    }

    /* compiled from: MiniPlayerView2Wrapper.kt */
    public final class c implements hnt0 {
        public c() {
        }

        @Override // xsna.hnt0
        public final void j() {
            gr20.this.h.e();
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            gr20.this.h.g();
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            gr20 gr20Var = gr20.this;
            ir20.a aVar = gr20Var.g;
            if (((Boolean) aVar.b.invoke()).booleanValue() && aVar.c.invoke().booleanValue()) {
                gr20Var.h.m();
            }
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
            gr20.this.h.f(z);
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
        public final void V3(yg5 yg5Var) {
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
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }

    @Override // xsna.ir20
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
