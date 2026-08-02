package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.tool.view.ViewDrawCacherLayout;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.libvideo.ui.VideoChevronMode;
import com.vk.libvideo.ui.video2.PlayerState;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.libvideo.ui.video2.controls.VideoControlsUiEvent;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.log.L;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import one.video.controls.views.VideoShortActions;
import one.video.controls20.SimpleControlsView;
import one.video.controls20.a;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.avt0;
import xsna.b5b0;
import xsna.bu;
import xsna.p2j0;
import xsna.q1b0;
import xsna.txs;

/* compiled from: VideoView2.kt */
/* loaded from: classes3.dex */
public final class sqt0 extends FrameLayout {
    public static final List<SimpleControlsView.ButtonType> q0 = e43.l(SimpleControlsView.ButtonType.TECH_BUG_REPORT, SimpleControlsView.ButtonType.FEEDBACK, SimpleControlsView.ButtonType.CAST, SimpleControlsView.ButtonType.SETTINGS, SimpleControlsView.ButtonType.SCALE, SimpleControlsView.ButtonType.FULLSCREEN);
    public final PreviewImageView A;
    public final ViewDrawCacherLayout B;
    public final SimpleControlsView C;
    public final NoStyleSubtitleView D;
    public final DonutBadge E;
    public final VideoShortActions F;
    public final VideoToolbarView G;
    public boolean H;
    public final Object I;
    public final etn J;
    public final gqq0 K;
    public final Object L;
    public final Object M;
    public final bpn0 N;
    public final VideoBottomPanelView O;
    public final LinearLayout P;
    public final VideoEndView Q;
    public final ActionLinkView R;
    public final AppCompatImageView S;
    public final FrameLayout T;
    public final nw10 U;
    public final b V;
    public final jqs0 W;
    public final TransformController a0;
    public ebs0 b;
    public final uqt0 b0;
    public gzs<s3q0> c;
    public final a5b0 c0;
    public rds0 d;
    public final mkl d0;
    public no2 e;
    public final e3e0 e0;
    public je0 f;
    public final e3k f0;
    public OneVideoPlayer g;
    public final qc0 g0;
    public final Object h;
    public final j3k h0;
    public final Object i;
    public String i0;
    public final bpn0 j;
    public ScreenState j0;
    public final Object k;
    public final eo9 k0;
    public final Object l;
    public final Object l0;
    public final Object m;
    public final Object m0;
    public final Object n;
    public final j n0;
    public final Object o;
    public final VideoSkippablePartView o0;
    public final Object p;
    public io.reactivex.rxjava3.disposables.c p0;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final k v;
    public final f w;
    public final VideoAdLayout x;
    public final VideoOverlayView y;
    public final VideoTextureView z;

    /* compiled from: VideoView2.kt */
    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(jxr0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class b {
        public boolean a;

        public b() {
        }
    }

    /* compiled from: VideoView2.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public c() {
            this(false, false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonsOrderConfig(isHorizontal=");
            sb.append(this.a);
            sb.append(", isFullscreen=");
            sb.append(this.b);
            sb.append(", isModalOpen=");
            sb.append(this.c);
            sb.append(", isVkLive=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public c(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }
    }

    /* compiled from: VideoView2.kt */
    public final class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(ghs0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class e implements Runnable, SimpleControlsView.c {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(sdt0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class f extends txs {
        public boolean b;

        public f() {
        }

        @Override // xsna.txs
        public final boolean a() {
            return this.b;
        }

        @Override // xsna.txs
        public final void b() {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(sms0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class g implements tox {
        public g() {
        }

        @Override // xsna.tox
        public final void onClick() {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(t0t0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(fdt0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class i {
        public VideoFile a;
        public final l9p0 b;

        public i(sqt0 sqt0Var) {
            this.b = new l9p0(sqt0Var.getContext().getString(R.string.video_quality_new_additional), sqt0Var.getContext().getString(R.string.video_quality_new_go_to), new vq6(27, this, sqt0Var));
        }
    }

    /* compiled from: VideoView2.kt */
    public final class j {
        public drt0 a;
        public final ListBuilder b;

        public j() {
            ListBuilder e = e43.e();
            if (fxc0.B().J().l0()) {
                e.add(new p2j0.b(sqt0.this.getSettingsDialogDelegate().b));
            } else {
                e.add(p2j0.h.a);
            }
            e.add(p2j0.e.a);
            e.add(p2j0.a.a);
            e.add(p2j0.d.a);
            e.add(new p2j0.g(sqt0.this.getContext().getString(R.string.video_settings_fullscreen_lock), sqt0.this.getContext().getString(R.string.video_settings_fullscreen_lock_subtitle), Integer.valueOf(R.drawable.vk_icon_lock_outline_28), sqt0.this.new o()));
            if (!fxc0.B().J().l0()) {
                e.add(p2j0.f.a);
            }
            this.b = e.g();
        }

        public final AbstractList a() {
            drt0 drt0Var = this.a;
            ListBuilder listBuilder = this.b;
            if (drt0Var == null || !sqt0.p(drt0Var.b)) {
                return listBuilder;
            }
            boolean z = drt0Var.c;
            sqt0 sqt0Var = sqt0.this;
            return j5g.v0(new p2j0.g(sqt0Var.getContext().getString(R.string.video_auto_play), sqt0Var.getContext().getString(z ? R.string.video_auto_play_value_enabled : R.string.video_auto_play_value_disabled), Integer.valueOf(R.drawable.vk_icon_video_circle_outline_28), new gcj(sqt0Var, z, this)), listBuilder);
        }
    }

    /* compiled from: VideoView2.kt */
    public final class k implements SimpleControlsView.f {
        public k() {
        }

        @Override // one.video.controls20.SimpleControlsView.f
        public final void a(one.video.controls20.a aVar) {
            final sqt0 sqt0Var = sqt0.this;
            VideoSkippablePartView videoSkippablePartView = sqt0Var.o0;
            boolean z = aVar instanceof a.j;
            if (z) {
                final boolean z2 = ((a.j) aVar).a;
                sqt0Var.H = z2;
                FrameLayout frameLayout = sqt0Var.T;
                frameLayout.animate().cancel();
                frameLayout.animate().setStartDelay(z2 ? 0L : 3000L).setDuration(z2 ? 0L : 200L).alpha(z2 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).withEndAction(new Runnable() { // from class: xsna.pqt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameLayout frameLayout2 = sqt0.this.T;
                        boolean z3 = z2;
                        frameLayout2.setAlpha(z3 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        frameLayout2.setVisibility(z3 ? 0 : 8);
                    }
                });
                if (fxc0.B().J().z0() && x19.J(sqt0Var.j0)) {
                    sqt0Var.R.post(new ov(sqt0Var, 18));
                }
                uqt0 uqt0Var = sqt0Var.b0;
                if (uqt0Var.g != z2) {
                    uqt0Var.g = z2;
                    uqt0Var.a();
                }
                int i = VideoSkippablePartView.C;
                videoSkippablePartView.p(z2, false, false);
                rds0 controlsUiEventsListener = sqt0Var.getControlsUiEventsListener();
                if (controlsUiEventsListener != null) {
                    controlsUiEventsListener.a(new VideoControlsUiEvent.b(z2));
                }
            } else if (aVar instanceof a.g) {
                VideoSkippablePartView.m(sqt0Var.o0, null, true, false, false, 13);
            } else if (aVar instanceof a.h) {
                VideoSkippablePartView.m(sqt0Var.o0, null, false, false, false, 13);
            } else if (aVar instanceof a.b) {
                videoSkippablePartView.setAutoSkip$core_release(false);
            }
            rds0 controlsUiEventsListener2 = sqt0Var.getControlsUiEventsListener();
            if (controlsUiEventsListener2 != null) {
                controlsUiEventsListener2.a(aVar instanceof a.e ? new VideoControlsUiEvent.f(((a.e) aVar).a) : aVar instanceof a.c ? new VideoControlsUiEvent.c() : aVar instanceof a.i ? new VideoControlsUiEvent.g(((a.i) aVar).a) : aVar instanceof a.d ? new VideoControlsUiEvent.d(((a.d) aVar).a) : aVar instanceof a.b ? new VideoControlsUiEvent.Seek(VideoControlsUiEvent.Seek.Source.DoubleTap) : aVar instanceof a.h ? new VideoControlsUiEvent.Seek(VideoControlsUiEvent.Seek.Source.Slider) : aVar instanceof a.C2179a ? VideoControlsUiEvent.a.C1252a.a : z ? new VideoControlsUiEvent.b(((a.j) aVar).a) : VideoControlsUiEvent.h.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class l {
        public VideoFile a;
        public String b;
        public final defpackage.e0 c;

        public l(sqt0 sqt0Var) {
            this.c = new defpackage.e0(29, this, sqt0Var);
        }
    }

    /* compiled from: VideoView2.kt */
    public final class n implements ebs0 {
        public n() {
        }

        @Override // xsna.ebs0
        public final void bk(dbs0 dbs0Var) {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(dbs0Var);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public final class o implements gzs<s3q0> {
        public o() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            n1j0 settingsDialog;
            sqt0 sqt0Var = sqt0.this;
            srm srmVar = sqt0Var.C.F;
            srmVar.getClass();
            n1j0 n1j0Var = srmVar.a;
            if (n1j0Var != null) {
                n1j0Var.dismiss();
            }
            srmVar.a = null;
            VideoFullscreenBottomBarView fullscreenBottomControlsView = sqt0Var.getFullscreenBottomControlsView();
            if (fullscreenBottomControlsView != null && (settingsDialog = fullscreenBottomControlsView.getSettingsDialog()) != null) {
                settingsDialog.dismiss();
            }
            ebs0 videoClickActionCallback = sqt0Var.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(zms0.a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VideoView2.kt */
    public final class p implements VideoShortActions.a {
        public p() {
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void l() {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(new qws0(15, null, false));
            }
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void n() {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(hsw.a);
            }
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void o(boolean z) {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(new d4s0(z));
            }
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void p() {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(pws0.a);
            }
        }
    }

    /* compiled from: VideoView2.kt */
    public static final /* synthetic */ class q {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            try {
                iArr[TransformController.ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransformController.ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScreenState.values().length];
            try {
                iArr2[ScreenState.FULLSCREEN_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScreenState.FULLSCREEN_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScreenState.INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    public sqt0(Context context) {
        super(context, null, 0);
        nw10 nw10Var;
        LayoutInflater.from(context).inflate(R.layout.video_view_2, (ViewGroup) this, true);
        this.c = new ko60(12);
        rns0 rns0Var = new rns0(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, rns0Var);
        this.i = msy.a(lazyThreadSafetyMode, new tsk0(this, 27));
        this.j = new bpn0(new j1t0(3));
        this.k = msy.a(lazyThreadSafetyMode, new x1c0(15));
        this.l = msy.a(lazyThreadSafetyMode, new ia90(17));
        this.m = msy.a(lazyThreadSafetyMode, new xk70(13));
        this.n = msy.a(lazyThreadSafetyMode, new rjg0(8));
        this.o = msy.a(lazyThreadSafetyMode, new zqf0(10));
        this.p = msy.a(lazyThreadSafetyMode, new e6k0(7));
        this.q = msy.a(lazyThreadSafetyMode, new q0s0(2));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new pkd0(11));
        this.r = a2;
        this.s = msy.a(lazyThreadSafetyMode, new ltb0(15));
        this.t = msy.a(lazyThreadSafetyMode, new eul0(5));
        this.u = msy.a(lazyThreadSafetyMode, new dck0(context, 19));
        k kVar = new k();
        this.v = kVar;
        f fVar = new f();
        this.w = fVar;
        p pVar = new p();
        n nVar = new n();
        fbs0 fbs0Var = new fbs0(nVar);
        SimpleControlsView.c eVar = new e();
        this.x = (VideoAdLayout) findViewById(R.id.ad_controls_view);
        this.y = (VideoOverlayView) findViewById(R.id.overlay_view);
        VideoTextureView videoTextureView = (VideoTextureView) findViewById(R.id.display_view);
        this.z = videoTextureView;
        PreviewImageView previewImageView = (PreviewImageView) findViewById(R.id.cover_view);
        this.A = previewImageView;
        ViewDrawCacherLayout viewDrawCacherLayout = (ViewDrawCacherLayout) findViewById(R.id.display_view_container);
        this.B = viewDrawCacherLayout;
        SimpleControlsView simpleControlsView = (SimpleControlsView) findViewById(R.id.controls_view);
        this.C = simpleControlsView;
        this.D = (NoStyleSubtitleView) findViewById(R.id.subtitles_view);
        DonutBadge donutBadge = (DonutBadge) findViewById(R.id.donut_chip_view);
        this.E = donutBadge;
        VideoShortActions videoShortActions = new VideoShortActions(context, null, 0, 14, 0);
        videoShortActions.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, cn70.b(6), 0, 0);
        videoShortActions.setLayoutParams(layoutParams);
        videoShortActions.setVisibility(8);
        videoShortActions.setListener(pVar);
        this.F = videoShortActions;
        VideoToolbarView videoToolbarView = new VideoToolbarView(context, null);
        videoToolbarView.setId(View.generateViewId());
        videoToolbarView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        videoToolbarView.setVisibility(8);
        videoToolbarView.setToolbarSettings(new VideoToolbarView.a(VideoChevronMode.Minimize, 5));
        videoToolbarView.setVideoActionsCallback(nVar);
        videoToolbarView.h(true);
        this.G = videoToolbarView;
        TextView textView = (TextView) simpleControlsView.findViewById(R.id.current_interval_title_view);
        this.I = msy.a(lazyThreadSafetyMode, new clt0(this, 2));
        etn b2 = gsi0.b();
        this.J = b2;
        this.K = new gqq0(this, 3);
        this.L = msy.a(lazyThreadSafetyMode, new e1m0(11));
        this.M = msy.a(lazyThreadSafetyMode, new j4(28, this, context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(videoShortActions);
        frameLayout.addView(videoToolbarView);
        VideoTopBarView topControlsView = getTopControlsView();
        if (topControlsView != null) {
            frameLayout.addView(topControlsView);
        }
        this.N = new bpn0(new s(this, context));
        VideoBottomPanelView videoBottomPanelView = new VideoBottomPanelView(context, null, 6, 0);
        videoBottomPanelView.setId(View.generateViewId());
        videoBottomPanelView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        videoBottomPanelView.setButtonsOnClickListener(fbs0Var);
        videoBottomPanelView.setHideDividerWithBottomBar(true);
        videoBottomPanelView.setBottomBarVisibility(false);
        videoBottomPanelView.C = false;
        bwt0.p0(videoBottomPanelView.w, false);
        this.O = videoBottomPanelView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(videoBottomPanelView);
        if (getFullscreenBottomControlsView() != null) {
            linearLayout.addView(getFullscreenBottomControlsView());
        }
        this.P = linearLayout;
        VideoEndView videoEndView = new VideoEndView(context, null);
        videoEndView.setId(View.generateViewId());
        videoEndView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        videoEndView.setGravity(17);
        videoEndView.setButtonsOnClickListener(fbs0Var);
        this.Q = videoEndView;
        ActionLinkView actionLinkView = new ActionLinkView(fxc0.B().J().z0() ? context : new ContextThemeWrapper(context, R.style.VideoActionLink), null, 6);
        actionLinkView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 80);
        layoutParams2.setMargins(cn70.b(8), 0, 0, cn70.b(8));
        actionLinkView.setLayoutParams(layoutParams2);
        actionLinkView.setVisibility(8);
        jjc.f(new a(), actionLinkView);
        this.R = actionLinkView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(cn70.b(48), cn70.b(48)));
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.ic_sound_off_shadow_48);
        appCompatImageView.setBackgroundResource(R.drawable.bg_light_ripple_oval);
        jjc.f(new h(), appCompatImageView);
        this.S = appCompatImageView;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(View.generateViewId());
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (!fxc0.B().J().z0()) {
            frameLayout2.addView(actionLinkView);
        }
        frameLayout2.addView(appCompatImageView);
        this.T = frameLayout2;
        Context context2 = e43.a;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((context2 == null ? null : context2).getApplicationContext()) != 0 || fxc0.B().J().V0()) {
            nw10Var = null;
        } else {
            nw10Var = new nw10(context);
            nw10Var.setVisibility(8);
            try {
                wvv.b(wvv.a, new aw5(1, context, nw10Var), 0L, 0L, 14);
            } catch (IllegalArgumentException unused) {
            }
            addView(nw10Var);
        }
        this.U = nw10Var;
        b bVar = new b();
        this.V = bVar;
        this.W = new jqs0(simpleControlsView, bVar);
        TransformController transformController = videoTextureView.getTransformController();
        transformController.b.add(new m());
        this.a0 = transformController;
        this.b0 = new uqt0(simpleControlsView);
        h6m0 h6m0Var = new h6m0(this, 19);
        q1b0.a aVar = new q1b0.a(simpleControlsView, h6m0Var, new qqt0(this, 0));
        final a5b0 a5b0Var = new a5b0(getContext(), fxc0.B().J().S0() ? viewDrawCacherLayout : videoTextureView, new b5b0(h6m0Var), new vex(aVar, 19), new d410(aVar, 17), new da50(aVar, 10));
        simpleControlsView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.rqt0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                a5b0.this.b(motionEvent);
                return false;
            }
        });
        this.c0 = a5b0Var;
        this.d0 = new mkl(simpleControlsView, new rzl0(this, 21));
        this.e0 = new e3e0(this);
        this.f0 = new e3k(this);
        this.g0 = new qc0(this);
        this.h0 = new j3k(previewImageView);
        this.i0 = "";
        this.k0 = new eo9(new myd0(this, 24));
        this.l0 = msy.a(lazyThreadSafetyMode, new qkd0(this, 29));
        this.m0 = msy.a(lazyThreadSafetyMode, new hbj0(this, 26));
        j jVar = new j();
        this.n0 = jVar;
        VideoSkippablePartView videoSkippablePartView = new VideoSkippablePartView(context, null);
        videoSkippablePartView.setId(View.generateViewId());
        videoSkippablePartView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        videoSkippablePartView.setVisibility(8);
        this.o0 = videoSkippablePartView;
        setClipChildren(false);
        setClipToPadding(false);
        previewImageView.setContentScaleType(VideoResizer.VideoFitType.FIT);
        if (nw10Var != null) {
            simpleControlsView.setCastButtonVisible(true);
            simpleControlsView.setCastButtonClickListener(new pwh0(nw10Var, 29));
        }
        simpleControlsView.setFullscreenController(fVar);
        simpleControlsView.setIntervalsClickListener(new g());
        simpleControlsView.setDismissSettingDialogOnChildDialogDismissed(true);
        simpleControlsView.setImageLoader((zjw) a2.getValue());
        simpleControlsView.setUiEventsListener(kVar);
        simpleControlsView.setHeaderView(frameLayout);
        simpleControlsView.setFooterView(linearLayout);
        simpleControlsView.setReverseControlsOverlayView(frameLayout2);
        simpleControlsView.setEndView(videoEndView);
        simpleControlsView.setTransformController(transformController);
        simpleControlsView.setSettingsOptions(jVar.a());
        simpleControlsView.setErrorHandler(eVar);
        simpleControlsView.setButtonsVisibilityList(k(new c(false, false, false, false)));
        if (((Boolean) this.o.getValue()).booleanValue()) {
            simpleControlsView.setTechBugReportHandler(getTechBugReportDelegate().c);
        }
        if (fxc0.B().J().V0()) {
            qu5.c().getClass();
            new k75(21, this, context);
        }
        jjc.f(new d(), donutBadge);
        addView(videoSkippablePartView);
        if (b2.d()) {
            his0.t(textView, R.drawable.vk_icon_chevron_16, 0);
            textView.setCompoundDrawablePadding(iah0.a(2));
            textView.setCompoundDrawableTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_contrast, textView.getContext())));
        }
        if (fxc0.B().J().z0()) {
            addView(actionLinkView);
        }
    }

    public static s3q0 a(sqt0 sqt0Var, com.vk.fullscreenvideo.a aVar) {
        if (aVar.equals(a.d.C1074d.a)) {
            rds0 rds0Var = sqt0Var.d;
            TransformController transformController = sqt0Var.a0;
            if (rds0Var != null) {
                rds0Var.a(VideoControlsUiEvent.a.b.a);
            }
            int i2 = q.$EnumSwitchMapping$0[transformController.e.ordinal()];
            if (i2 == 1) {
                transformController.f(TransformController.ScaleType.CROP, true);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                transformController.f(TransformController.ScaleType.FIT, true);
            }
        } else if (aVar.equals(a.d.h.a)) {
            nw10 nw10Var = sqt0Var.U;
            if (nw10Var != null) {
                nw10Var.performClick();
            }
        } else if (aVar.equals(a.d.i.a)) {
            OneVideoPlayer player = sqt0Var.C.getPlayer();
            if (player != null) {
                n1j0 n1j0Var = new n1j0(sqt0Var.getContext(), player, true, new tqt0(sqt0Var), sqt0Var.n0.a());
                n1j0Var.setOnDismissListener(new t86(sqt0Var, 1));
                VideoFullscreenBottomBarView fullscreenBottomControlsView = sqt0Var.getFullscreenBottomControlsView();
                if (fullscreenBottomControlsView != null) {
                    fullscreenBottomControlsView.setSettingsDialog(n1j0Var);
                }
                n1j0Var.show();
            }
        } else if (aVar.equals(a.f.a)) {
            ebs0 ebs0Var = sqt0Var.b;
            if (ebs0Var != null) {
                ebs0Var.bk(ijj0.a);
            }
        } else if (aVar.equals(a.g.a)) {
            ebs0 ebs0Var2 = sqt0Var.b;
            if (ebs0Var2 != null) {
                ebs0Var2.bk(jjj0.a);
            }
        } else if (aVar instanceof a.d.b.C1072a) {
            ebs0 ebs0Var3 = sqt0Var.b;
            if (ebs0Var3 != null) {
                ebs0Var3.bk(r0t0.a);
            }
        } else if (aVar.equals(a.d.c.a)) {
            ebs0 ebs0Var4 = sqt0Var.b;
            if (ebs0Var4 != null) {
                ebs0Var4.bk(mhs0.a);
            }
        } else if (aVar instanceof a.d.b.C1073b) {
            ebs0 ebs0Var5 = sqt0Var.b;
            if (ebs0Var5 != null) {
                ebs0Var5.bk(dss0.a);
            }
        } else if (aVar.equals(a.d.f.a)) {
            ebs0 ebs0Var6 = sqt0Var.b;
            if (ebs0Var6 != null) {
                ebs0Var6.bk(ngt0.a);
            }
        } else if (aVar instanceof a.d.b.c) {
            ebs0 ebs0Var7 = sqt0Var.b;
            if (ebs0Var7 != null) {
                ebs0Var7.bk(kgt0.a);
            }
        } else if (aVar.equals(a.d.j.a)) {
            ebs0 ebs0Var8 = sqt0Var.b;
            if (ebs0Var8 != null) {
                ebs0Var8.bk(kst0.a);
            }
        } else if (aVar.equals(a.d.e.a)) {
            ebs0 ebs0Var9 = sqt0Var.b;
            if (ebs0Var9 != null) {
                ebs0Var9.bk(new qws0(13, null, false));
            }
        } else if (aVar.equals(a.d.g.a)) {
            ebs0 ebs0Var10 = sqt0Var.b;
            if (ebs0Var10 != null) {
                ebs0Var10.bk(ass0.a);
            }
        } else if (aVar.equals(a.C1070a.a)) {
            ebs0 ebs0Var11 = sqt0Var.b;
            if (ebs0Var11 != null) {
                ebs0Var11.bk(t6t0.a);
            }
        } else if (aVar.equals(a.h.a)) {
            ebs0 ebs0Var12 = sqt0Var.b;
            if (ebs0Var12 != null) {
                ebs0Var12.bk(uit0.a);
            }
        } else if (aVar.equals(a.c.a)) {
            ebs0 ebs0Var13 = sqt0Var.b;
            if (ebs0Var13 != null) {
                ebs0Var13.bk(pws0.a);
            }
        } else if (aVar.equals(a.i.a)) {
            ebs0 ebs0Var14 = sqt0Var.b;
            if (ebs0Var14 != null) {
                ebs0Var14.bk(u0t0.a);
            }
        } else if (aVar instanceof a.b) {
            ebs0 ebs0Var15 = sqt0Var.b;
            if (ebs0Var15 != null) {
                ebs0Var15.bk(new c4s0(((a.b) aVar).a));
            }
        } else if (aVar.equals(a.e.a)) {
            ebs0 ebs0Var16 = sqt0Var.b;
            if (ebs0Var16 != null) {
                ebs0Var16.bk(hsw.a);
            }
        } else {
            if (!aVar.equals(a.d.C1071a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            sqt0Var.getTechBugReportDelegate().c.invoke();
        }
        return s3q0.a;
    }

    public static void b(sqt0 sqt0Var) {
        sqt0Var.R.e(sqt0Var.getActionLinkOffsetCalculator().a());
    }

    public static void c(sqt0 sqt0Var) {
        sqt0Var.R.e(sqt0Var.getActionLinkOffsetCalculator().a());
    }

    public static s3q0 d(sqt0 sqt0Var, Context context) {
        sqt0Var.getCastEntryPoint().getClass();
        return s3q0.a;
    }

    public static void e(sqt0 sqt0Var) {
        VideoFullscreenBottomBarView fullscreenBottomControlsView = sqt0Var.getFullscreenBottomControlsView();
        if (fullscreenBottomControlsView != null) {
            fullscreenBottomControlsView.setSettingsDialog(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final c20 getActionLinkOffsetCalculator() {
        return (c20) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final mzr0 getAdControllerMapper() {
        return (mzr0) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xz9 getCastEntryPoint() {
        return (xz9) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final DonutVideoComponent getDonutVideoComponent() {
        return (DonutVideoComponent) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoFullscreenBottomBarView getFullscreenBottomControlsView() {
        return (VideoFullscreenBottomBarView) this.N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final i getSettingsDialogDelegate() {
        return (i) this.l0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final l getTechBugReportDelegate() {
        return (l) this.m0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VideoTopBarView getTopControlsView() {
        return (VideoTopBarView) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ozr0 getVideoAdLayoutToggleConfig() {
        return (ozr0) this.s.getValue();
    }

    public static ArrayList l(c cVar) {
        List<SimpleControlsView.ButtonType> list = q0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SimpleControlsView.ButtonType buttonType = (SimpleControlsView.ButtonType) obj;
            if (cVar.a || buttonType != SimpleControlsView.ButtonType.SCALE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean n(mit0 mit0Var) {
        drt0 drt0Var = mit0Var.c;
        j4t0 j4t0Var = mit0Var.b;
        ScreenState screenState = drt0Var.b;
        return (x19.J(screenState) && j4t0Var.e == null && j4t0Var.d == null) || (screenState == ScreenState.PIP && j4t0Var.a.m != null);
    }

    public static boolean p(ScreenState screenState) {
        int i2 = screenState == null ? -1 : q.$EnumSwitchMapping$1[screenState.ordinal()];
        if (i2 == 1) {
            return com.vk.toggle.d.w().b;
        }
        if (i2 == 2) {
            return com.vk.toggle.d.v().b;
        }
        if (i2 != 3) {
            return false;
        }
        return com.vk.toggle.d.u().b;
    }

    public final je0 getAdController() {
        return this.f;
    }

    public final gzs<s3q0> getAdControlsClickListener() {
        return this.c;
    }

    public final VideoAdLayout getAdControlsView() {
        return this.x;
    }

    public final no2 getAnimationDialogCallbackProvider() {
        return this.e;
    }

    public final rds0 getControlsUiEventsListener() {
        return this.d;
    }

    public final View getControlsVideoView() {
        return this.C;
    }

    public final PreviewImageView getCoverView() {
        return this.A;
    }

    public final VideoTextureView getDisplayView() {
        return this.z;
    }

    public final VideoOverlayView getOverlayView() {
        return this.y;
    }

    public final OneVideoPlayer getPlayer() {
        return this.g;
    }

    public final ebs0 getVideoClickActionCallback() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0644  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(mit0 mit0Var) {
        boolean z;
        VideoFile videoFile;
        j4t0 j4t0Var;
        ScreenState screenState;
        g3k g3kVar;
        wya0 wya0Var;
        etn etnVar;
        VideoFile videoFile2;
        boolean z2;
        boolean z3;
        VideoBottomPanelView videoBottomPanelView;
        ?? r14;
        VideoFeatures videoFeatures;
        jya0 jya0Var;
        e3e0 e3e0Var;
        boolean z4;
        int i2;
        etn etnVar2;
        boolean z5 = mit0Var.g;
        drt0 drt0Var = mit0Var.c;
        j4t0 j4t0Var2 = mit0Var.b;
        String str = this.i0;
        VideoFile videoFile3 = mit0Var.a;
        boolean f2 = epx.f(str, videoFile3.r1());
        if (!f2) {
            this.i0 = videoFile3.r1();
        }
        j jVar = this.n0;
        drt0 drt0Var2 = jVar.a;
        jVar.a = drt0Var;
        ScreenState screenState2 = drt0Var.b;
        boolean z6 = drt0Var.c;
        ScreenState screenState3 = drt0Var.b;
        if ((drt0Var2 != null ? drt0Var2.b : null) != screenState2 || drt0Var2 == null || drt0Var2.c != z6) {
            sqt0.this.C.setSettingsOptions(jVar.a());
        }
        VideoOverlayView.c cVar = j4t0Var2.d;
        com.vk.libvideo.api.ad.a aVar = j4t0Var2.e;
        fgn fgnVar = j4t0Var2.b;
        g3k g3kVar2 = j4t0Var2.c;
        wya0 wya0Var2 = j4t0Var2.a;
        int i3 = cVar != null ? 0 : 8;
        VideoOverlayView videoOverlayView = this.y;
        videoOverlayView.setVisibility(i3);
        VideoOverlayView.c cVar2 = j4t0Var2.d;
        if (cVar2 != null) {
            z = f2;
            videoFile = videoFile3;
            videoOverlayView.Z4(new i1t0(true, bo.h()), cVar2);
        } else {
            z = f2;
            videoFile = videoFile3;
        }
        TransformController.ScaleType scaleType = fgnVar.b;
        TransformController transformController = this.a0;
        if (scaleType != transformController.e) {
            transformController.f(scaleType, false);
        }
        boolean S0 = fxc0.B().J().S0();
        VideoTextureView videoTextureView = this.z;
        if (S0) {
            videoTextureView.setVisibility((fgnVar.c && g3kVar2.b) ? 8 : 0);
        }
        PlayerState playerState = wya0Var2.a;
        boolean z7 = !z || (this.j0 != screenState3) || (playerState == PlayerState.ERROR) || (playerState == PlayerState.ENDED);
        this.j0 = screenState3;
        if (z7 && videoTextureView.g()) {
            videoTextureView.h();
        }
        transformController.c = x19.H(screenState3);
        ControlsState.ResizeStatus resizeStatus = (x19.H(screenState3) || fgnVar.a) ? scaleType == TransformController.ScaleType.FIT ? ControlsState.ResizeStatus.FIT : scaleType == TransformController.ScaleType.CROP ? ControlsState.ResizeStatus.CROP : ControlsState.ResizeStatus.UNAVAILABLE : ControlsState.ResizeStatus.UNAVAILABLE;
        VideoFullscreenBottomBarView fullscreenBottomControlsView = getFullscreenBottomControlsView();
        if (fullscreenBottomControlsView != null) {
            fullscreenBottomControlsView.c(null);
            com.vk.fullscreenvideo.design.view.bottom.a aVar2 = fullscreenBottomControlsView.e;
            if (aVar2 != null) {
                aVar2.j(resizeStatus);
            }
        }
        eo9 eo9Var = drt0Var.f ? this.k0 : null;
        SimpleControlsView simpleControlsView = this.C;
        simpleControlsView.setFeedbackController(eo9Var);
        boolean H = x19.H(screenState3);
        jqs0 jqs0Var = this.W;
        View view = jqs0Var.a;
        if (jqs0Var.d != H) {
            jqs0Var.d = H;
            if (view.isAttachedToWindow()) {
                qcy<Object>[] qcyVarArr = bwt0.a;
                view.requestApplyInsets();
            }
        }
        this.c0.b.b = new b5b0.a(x19.H(screenState3), aVar != null, videoTextureView.g());
        boolean n2 = n(mit0Var);
        uqt0 uqt0Var = this.b0;
        if (uqt0Var.f != n2) {
            uqt0Var.f = n2;
            uqt0Var.a();
        }
        t6p0 t6p0Var = wya0Var2.k;
        if (!epx.f(uqt0Var.e, t6p0Var)) {
            uqt0Var.e = t6p0Var;
            uqt0Var.b.c = t6p0Var.b;
            uqt0Var.c.c = t6p0Var.a;
            uqt0Var.a();
        }
        boolean T1 = videoFile.T1();
        boolean I = x19.I(screenState3);
        Boolean valueOf = Boolean.valueOf(T1);
        etn etnVar3 = this.J;
        boolean j2 = etnVar3.j(I, valueOf);
        int i4 = (!x19.H(screenState3) || j2) ? 8 : 0;
        VideoToolbarView videoToolbarView = this.G;
        videoToolbarView.setVisibility(i4);
        this.G.d(null, mit0Var.a, drt0Var.d, x19.I(screenState3), drt0Var.e);
        boolean p2 = p(screenState3);
        boolean z8 = !p2;
        videoToolbarView.i(x19.I(screenState3));
        videoToolbarView.h(z8);
        int i5 = (o() || x19.H(screenState3)) ? 8 : 0;
        VideoShortActions videoShortActions = this.F;
        videoShortActions.setVisibility(i5);
        videoShortActions.setAutoplayVisibility(z8);
        if (!p2) {
            videoShortActions.setAutoplayEnabled(z6);
        }
        VideoTopBarView topControlsView = getTopControlsView();
        if (topControlsView != null) {
            if (!x19.H(screenState3)) {
                j2 = o() && !T1;
            }
            topControlsView.setVisibility(j2 ? 0 : 8);
            boolean I2 = x19.I(screenState3);
            boolean H2 = x19.H(screenState3);
            boolean z9 = drt0Var.d;
            boolean U = videoFile.U();
            screenState = screenState3;
            boolean z10 = drt0Var.c;
            DonutVideoUiModel a2 = getDonutVideoComponent().wb().a(nkt0.a(videoFile), DonutVideoCardSource.PLAYER);
            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SMART_CAST;
            videoFeatures2.getClass();
            j4t0Var = j4t0Var2;
            wya0Var = wya0Var2;
            etnVar = etnVar3;
            g3kVar = g3kVar2;
            videoFile2 = videoFile;
            topControlsView.a(new q8p0(I2, H2, videoFile2, a2, z9, U, z10, com.vk.toggle.b.A.a(videoFeatures2) && wya0Var2.i, wya0Var2.h ? ControlsState.CastStatus.CONNECTED : ControlsState.CastStatus.DISCONNECTED));
            this.V.a = z5;
            topControlsView.setSmallScreenMode(z5);
        } else {
            j4t0Var = j4t0Var2;
            screenState = screenState3;
            g3kVar = g3kVar2;
            wya0Var = wya0Var2;
            etnVar = etnVar3;
            videoFile2 = videoFile;
        }
        this.P.setVisibility(x19.H(drt0Var.b) ? 0 : 8);
        boolean z11 = drt0Var.e;
        VideoBottomPanelView videoBottomPanelView2 = this.O;
        videoBottomPanelView2.setShowPlaylist(z11);
        videoBottomPanelView2.setBottomBarVisibility(x19.M(screenState));
        videoBottomPanelView2.P4(videoFile2, x19.H(screenState));
        if (x19.M(screenState)) {
            DownloadInfo downloadInfo = wya0Var.f;
            VideoBottomBarView videoBottomBarView = videoBottomPanelView2.v;
            videoBottomBarView.getClass();
            if (fxc0.B().s().isEnabled()) {
                videoBottomBarView.i.c(gpt0.F(downloadInfo), downloadInfo != null ? downloadInfo.a : null);
            }
        }
        VideoFullscreenBottomBarView fullscreenBottomControlsView2 = getFullscreenBottomControlsView();
        if (fullscreenBottomControlsView2 != null) {
            DownloadInfo downloadInfo2 = wya0Var.f;
            if (fxc0.B().s().isEnabled()) {
                fullscreenBottomControlsView2.c(null);
                com.vk.fullscreenvideo.design.view.bottom.a aVar3 = fullscreenBottomControlsView2.e;
                if (aVar3 != null) {
                    aVar3.m(downloadInfo2);
                }
            }
        }
        boolean m2 = m(mit0Var);
        VideoFullscreenBottomBarView fullscreenBottomControlsView3 = getFullscreenBottomControlsView();
        if (fullscreenBottomControlsView3 != null) {
            VideoFile videoFile4 = videoFile2;
            z2 = z5;
            z3 = m2;
            videoBottomPanelView = videoBottomPanelView2;
            videoFile2 = videoFile4;
            fullscreenBottomControlsView3.a(new vxs(x19.I(screenState), x19.H(screenState), mit0Var.d, videoFile4, drt0Var.e, videoFile4.J8()));
        } else {
            z2 = z5;
            z3 = m2;
            videoBottomPanelView = videoBottomPanelView2;
        }
        videoBottomPanelView.setVisibility(!z3 ? 0 : 8);
        VideoFullscreenBottomBarView fullscreenBottomControlsView4 = getFullscreenBottomControlsView();
        if (fullscreenBottomControlsView4 != null) {
            fullscreenBottomControlsView4.setVisibility(z3 && !z2 ? 0 : 8);
        }
        e3k e3kVar = this.f0;
        e3kVar.getClass();
        g3k g3kVar3 = g3kVar;
        boolean z12 = g3kVar3.a;
        if (e3kVar.d != z12) {
            e3kVar.d = z12;
            bwt0.p0((View) e3kVar.c.getValue(), z12);
        }
        j3k j3kVar = this.h0;
        PreviewImageView previewImageView = j3kVar.a;
        previewImageView.setVisibility(g3kVar3.b ? 0 : 8);
        Size size = wya0Var.b;
        int width = size.getWidth();
        int height = size.getHeight();
        previewImageView.c = width;
        previewImageView.d = height;
        String str2 = g3kVar3.c;
        int i6 = 12;
        int i7 = 4;
        if (str2 == null || str2.equals(j3kVar.c)) {
            r14 = 0;
        } else {
            previewImageView.post(new m50(j3kVar, 2));
            io.reactivex.rxjava3.disposables.c subscribe = mcr0.i(jeq0.g(str2), 0, 0, 0, new s0v0(), null).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pf1(new fm0(j3kVar, 24), i6), new ji3(new sg3(L.a, 4), 22));
            pgn pgnVar = j3kVar.b;
            r14 = 0;
            qcy<Object> qcyVar = j3k.e[0];
            pgnVar.b(subscribe);
            j3kVar.c = str2;
        }
        i10 i10Var = simpleControlsView.v;
        OneVideoPlayer oneVideoPlayer = i10Var.i;
        if (oneVideoPlayer != null && oneVideoPlayer.getError() != null) {
            i10Var.e = qm80.a(oneVideoPlayer);
            i10Var.c(bu.c.a.a);
        }
        this.x.setVisibility((aVar == null || !x19.J(screenState)) ? r14 : true ? r14 : 8);
        boolean z13 = aVar instanceof a.b;
        qc0 qc0Var = this.g0;
        if (qc0Var.d != z13) {
            qc0Var.d = z13;
            bwt0.p0((View) qc0Var.c.getValue(), z13);
        }
        je0 je0Var = this.f;
        if (je0Var != null && aVar != null) {
            kva0 kva0Var = new kva0(wya0Var.a == PlayerState.AD_PLAYING ? true : r14, this.c);
            boolean H3 = x19.H(drt0Var.b);
            no2 no2Var = this.e;
            io2 Ia = no2Var != null ? no2Var.Ia() : null;
            boolean J = x19.J(screenState);
            mzr0 adControllerMapper = getAdControllerMapper();
            adControllerMapper.getClass();
            ofy0 ofy0Var = new ofy0(je0Var, adControllerMapper);
            com.vk.libvideo.design.view.ad.data.a c2 = getAdControllerMapper().c(aVar);
            getAdControllerMapper().getClass();
            lo2 lo2Var = Ia != null ? new lo2(Ia) : null;
            VideoPipStateHolder.a.getClass();
            this.x.a(ofy0Var, c2, new eg0(false, false, H3, lo2Var, J, VideoPipStateHolder.d()), kva0Var, getVideoAdLayoutToggleConfig(), this.r);
        }
        ScreenState screenState4 = screenState;
        simpleControlsView.setControlsStyle(new yqj(((screenState4 == ScreenState.INLINE ? true : r14) && ((Boolean) this.m.getValue()).booleanValue()) ? true : r14, ((Boolean) this.n.getValue()).booleanValue(), ((Boolean) this.p.getValue()).booleanValue(), (!((Boolean) this.q.getValue()).booleanValue() || videoFile2.getDuration() <= 180) ? r14 : true));
        simpleControlsView.setVisibility(!n(mit0Var) ? 4 : r14);
        simpleControlsView.setDragSeekBarEnable(wya0Var.n);
        if (!z) {
            simpleControlsView.setTimelineImages(wya0Var.d);
            simpleControlsView.setIntervals(wya0Var.e);
        }
        boolean z14 = wya0Var.g;
        boolean H4 = x19.H(screenState4);
        boolean z15 = drt0Var.g;
        boolean J2 = x19.J(drt0Var.b);
        ActionLink m1 = videoFile2.m1();
        boolean f3 = epx.f(m1 != null ? m1.c : null, "product");
        boolean z0 = fxc0.B().J().z0();
        ActionLinkView actionLinkView = this.R;
        if (z0 && J2 && f3) {
            actionLinkView.setVisibility(r14);
            actionLinkView.d();
            actionLinkView.post(new g0(this, 20));
        } else {
            actionLinkView.setVisibility((z14 && !z15 && J2) ? r14 : 8);
        }
        actionLinkView.a(new a20(videoFile2, H4));
        boolean z16 = wya0Var.j;
        boolean z17 = wya0Var.h;
        this.S.setVisibility(z16 ? r14 : 8);
        this.D.setVisibility((!wya0Var.c || !n(mit0Var)) ? r14 : true ? r14 : 8);
        VideoEndView.a c3 = new djs0(videoFile2).c();
        VideoEndView videoEndView = this.Q;
        videoEndView.c(c3, true);
        boolean H5 = x19.H(screenState4);
        f fVar = this.w;
        if (fVar.b != H5) {
            fVar.b = H5;
            Iterator it = fVar.a.iterator();
            while (it.hasNext()) {
                ((txs.a) it.next()).a();
            }
        }
        boolean m3 = m(mit0Var);
        if (this.U != null) {
            simpleControlsView.setCastButtonStatus(z17);
            simpleControlsView.setCastButtonVisible(!m3);
            VideoFullscreenBottomBarView fullscreenBottomControlsView5 = getFullscreenBottomControlsView();
            if (fullscreenBottomControlsView5 != null) {
                ControlsState.CastStatus castStatus = z17 ? ControlsState.CastStatus.CONNECTED : ControlsState.CastStatus.DISCONNECTED;
                fullscreenBottomControlsView5.c(null);
                com.vk.fullscreenvideo.design.view.bottom.a aVar4 = fullscreenBottomControlsView5.e;
                if (aVar4 != null) {
                    aVar4.a(castStatus);
                }
                videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    videoShortActions.setAutoplayInactive(wya0Var.i);
                }
                jya0 jya0Var2 = wya0Var.l;
                jya0Var = wya0Var.l;
                PlayerState playerState2 = wya0Var.a;
                mkl mklVar = this.d0;
                SimpleControlsView simpleControlsView2 = (SimpleControlsView) mklVar.b;
                if (jya0Var != null) {
                    boolean contains = ((Set) mklVar.e).contains(playerState2);
                    simpleControlsView2.setOnSkipBackClickListener((contains && jya0Var.a) ? (dac0) mklVar.c : null);
                    simpleControlsView2.setOnSkipForwardClickListener((contains && jya0Var.b) ? (hri0) mklVar.d : null);
                }
                boolean z18 = jya0Var2 == null ? jya0Var2.a : r14;
                videoEndView.x = z18;
                videoEndView.g.setVisibility(z18 ? 4 : r14);
                boolean z19 = jya0Var2 == null ? jya0Var2.b : r14;
                videoEndView.w = z19;
                videoEndView.h.setVisibility(z19 ? 4 : r14);
                if (((Boolean) this.k.getValue()).booleanValue()) {
                    getSettingsDialogDelegate().a = videoFile2;
                }
                if (((Boolean) this.o.getValue()).booleanValue()) {
                    getTechBugReportDelegate().a = videoFile2;
                    getTechBugReportDelegate().b = mit0Var.f;
                }
                e3e0Var = this.e0;
                vk9 vk9Var = e3e0Var.e;
                ?? r4 = e3e0Var.c;
                if (wya0Var.a == PlayerState.BUFFERING) {
                    if (screenState4 == ScreenState.PIP ? true : r14) {
                        z4 = true;
                        if (z4 != e3e0Var.d) {
                            e3e0Var.d = z4;
                            if (!z4) {
                                ((ProgressBar) r4.getValue()).removeCallbacks(vk9Var);
                                i2 = 8;
                                ((ProgressBar) r4.getValue()).setVisibility(8);
                                PlayerState playerState3 = wya0Var.a;
                                setKeepScreenOn((!(playerState3 != PlayerState.PLAYING ? true : r14) || (playerState3 != PlayerState.AD_PLAYING ? true : r14)) ? true : r14);
                                j(mit0Var);
                                j4t0 j4t0Var3 = j4t0Var;
                                this.o0.i(new VideoSkippablePartView.a(mit0Var, null, mit0Var.a, j4t0Var3.f.a, new tzq0(this, i7), 10));
                                if (getDonutVideoComponent().J().a()) {
                                    czn cznVar = j4t0Var3.g;
                                    DonutBadge donutBadge = this.E;
                                    if (cznVar != null) {
                                        DonutPriceTemplate donutPriceTemplate = cznVar.b;
                                        donutBadge.setText(donutPriceTemplate != null ? y1o.b(donutPriceTemplate, getContext()) : cznVar.a);
                                        donutBadge.setContentDescription(cznVar.c);
                                        donutBadge.setVisibility(r14);
                                        q();
                                    } else {
                                        donutBadge.setVisibility(i2);
                                    }
                                }
                                etnVar2 = etnVar;
                                if (etnVar2.e(Boolean.valueOf(videoFile2.T1()))) {
                                    simpleControlsView.setIntervalsConfig(new SimpleControlsView.e(x19.M(screenState4) ? etnVar2.k(Boolean.valueOf(videoFile2.T1())) : x19.I(screenState4) ? true : o(), r14, new SimpleControlsView.e.a(1, Integer.valueOf(iah0.a(x19.I(screenState4) ? i2 : r14)), Integer.valueOf(iah0.a(x19.I(screenState4) ? 12 : 4)))));
                                }
                                if (!(screenState4 != ScreenState.PIP ? r14 : true)) {
                                    i2 = r14;
                                }
                                simpleControlsView.setVisibility(i2);
                                if (((Boolean) this.l.getValue()).booleanValue() || !gz80.a(31)) {
                                    return;
                                }
                                ViewDrawCacherLayout viewDrawCacherLayout = this.B;
                                avt0 avt0Var = new avt0(viewDrawCacherLayout);
                                viewDrawCacherLayout.setViewDrawCacher(avt0Var);
                                avt0.a aVar5 = avt0Var.a;
                                simpleControlsView.setViewCachers(aVar5);
                                videoEndView.setBlurSnapshots(aVar5);
                                return;
                            }
                            ((ProgressBar) r4.getValue()).postDelayed(vk9Var, 300L);
                        }
                        i2 = 8;
                        PlayerState playerState32 = wya0Var.a;
                        setKeepScreenOn((!(playerState32 != PlayerState.PLAYING ? true : r14) || (playerState32 != PlayerState.AD_PLAYING ? true : r14)) ? true : r14);
                        j(mit0Var);
                        j4t0 j4t0Var32 = j4t0Var;
                        this.o0.i(new VideoSkippablePartView.a(mit0Var, null, mit0Var.a, j4t0Var32.f.a, new tzq0(this, i7), 10));
                        if (getDonutVideoComponent().J().a()) {
                        }
                        etnVar2 = etnVar;
                        if (etnVar2.e(Boolean.valueOf(videoFile2.T1()))) {
                        }
                        if (!(screenState4 != ScreenState.PIP ? r14 : true)) {
                        }
                        simpleControlsView.setVisibility(i2);
                        if (((Boolean) this.l.getValue()).booleanValue()) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                z4 = r14;
                if (z4 != e3e0Var.d) {
                }
                i2 = 8;
                PlayerState playerState322 = wya0Var.a;
                setKeepScreenOn((!(playerState322 != PlayerState.PLAYING ? true : r14) || (playerState322 != PlayerState.AD_PLAYING ? true : r14)) ? true : r14);
                j(mit0Var);
                j4t0 j4t0Var322 = j4t0Var;
                this.o0.i(new VideoSkippablePartView.a(mit0Var, null, mit0Var.a, j4t0Var322.f.a, new tzq0(this, i7), 10));
                if (getDonutVideoComponent().J().a()) {
                }
                etnVar2 = etnVar;
                if (etnVar2.e(Boolean.valueOf(videoFile2.T1()))) {
                }
                if (!(screenState4 != ScreenState.PIP ? r14 : true)) {
                }
                simpleControlsView.setVisibility(i2);
                if (((Boolean) this.l.getValue()).booleanValue()) {
                }
            }
        }
        videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
        }
        jya0 jya0Var22 = wya0Var.l;
        jya0Var = wya0Var.l;
        PlayerState playerState22 = wya0Var.a;
        mkl mklVar2 = this.d0;
        SimpleControlsView simpleControlsView22 = (SimpleControlsView) mklVar2.b;
        if (jya0Var != null) {
        }
        if (jya0Var22 == null) {
        }
        videoEndView.x = z18;
        videoEndView.g.setVisibility(z18 ? 4 : r14);
        if (jya0Var22 == null) {
        }
        videoEndView.w = z19;
        videoEndView.h.setVisibility(z19 ? 4 : r14);
        if (((Boolean) this.k.getValue()).booleanValue()) {
        }
        if (((Boolean) this.o.getValue()).booleanValue()) {
        }
        e3e0Var = this.e0;
        vk9 vk9Var2 = e3e0Var.e;
        ?? r42 = e3e0Var.c;
        if (wya0Var.a == PlayerState.BUFFERING) {
        }
        z4 = r14;
        if (z4 != e3e0Var.d) {
        }
        i2 = 8;
        PlayerState playerState3222 = wya0Var.a;
        setKeepScreenOn((!(playerState3222 != PlayerState.PLAYING ? true : r14) || (playerState3222 != PlayerState.AD_PLAYING ? true : r14)) ? true : r14);
        j(mit0Var);
        j4t0 j4t0Var3222 = j4t0Var;
        this.o0.i(new VideoSkippablePartView.a(mit0Var, null, mit0Var.a, j4t0Var3222.f.a, new tzq0(this, i7), 10));
        if (getDonutVideoComponent().J().a()) {
        }
        etnVar2 = etnVar;
        if (etnVar2.e(Boolean.valueOf(videoFile2.T1()))) {
        }
        if (!(screenState4 != ScreenState.PIP ? r14 : true)) {
        }
        simpleControlsView.setVisibility(i2);
        if (((Boolean) this.l.getValue()).booleanValue()) {
        }
    }

    public final void j(mit0 mit0Var) {
        VideoFile videoFile;
        boolean z = false;
        boolean I = mit0Var != null ? x19.I(mit0Var.c.b) : false;
        boolean H = mit0Var != null ? x19.H(mit0Var.c.b) : false;
        boolean z2 = mit0Var != null ? mit0Var.g : false;
        if (mit0Var != null && (videoFile = mit0Var.a) != null) {
            z = videoFile.T1();
        }
        k(new c(I, H, z2, z));
    }

    public final List<SimpleControlsView.ButtonType> k(c cVar) {
        if (this.o0.getAreControlsHiddenBySkippable$core_release().getValue().booleanValue()) {
            return Collections.singletonList(SimpleControlsView.ButtonType.FULLSCREEN);
        }
        boolean z = cVar.d;
        boolean z2 = cVar.b;
        boolean z3 = cVar.a;
        Boolean valueOf = Boolean.valueOf(z);
        etn etnVar = this.J;
        Boolean valueOf2 = Boolean.valueOf(etnVar.f(z3, valueOf));
        if (!z2) {
            valueOf2 = null;
        }
        boolean booleanValue = valueOf2 != null ? valueOf2.booleanValue() : false;
        if (z || !(o() || booleanValue)) {
            return l(cVar);
        }
        return !z3 ? Collections.singletonList(SimpleControlsView.ButtonType.FULLSCREEN) : (etnVar.h(Boolean.valueOf(z)) && cVar.c) ? Collections.singletonList(SimpleControlsView.ButtonType.FULLSCREEN) : etnVar.h(Boolean.valueOf(z)) ? e43.l(SimpleControlsView.ButtonType.SCALE, SimpleControlsView.ButtonType.FULLSCREEN) : z3 ? e43.l(SimpleControlsView.ButtonType.TECH_BUG_REPORT, SimpleControlsView.ButtonType.FULLSCREEN) : (z2 || !o()) ? l(cVar) : Collections.singletonList(SimpleControlsView.ButtonType.SCALE);
    }

    public final boolean m(mit0 mit0Var) {
        Boolean valueOf = Boolean.valueOf(this.J.f(x19.I(mit0Var.c.b), Boolean.valueOf(mit0Var.a.T1())));
        if (!x19.H(mit0Var.c.b)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean o() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.D.b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fes0 debugView;
        if (!((Boolean) this.j.getValue()).booleanValue() || this.b0.g || (debugView = this.z.getDebugView()) == null || !debugView.a(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z && f4m.h(this.E)) {
            q();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fes0 debugView = this.z.getDebugView();
        if (debugView != null) {
            return debugView.b().dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void q() {
        VideoResizer.VideoFitType videoFitType;
        int[] iArr = new int[2];
        int i2 = akp0.$EnumSwitchMapping$0[this.z.getTransformController().e.ordinal()];
        if (i2 == 1) {
            videoFitType = VideoResizer.VideoFitType.FIT;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            videoFitType = VideoResizer.VideoFitType.CROP;
        }
        VideoResizer.VideoFitType videoFitType2 = videoFitType;
        ViewDrawCacherLayout viewDrawCacherLayout = this.B;
        int width = viewDrawCacherLayout.getWidth();
        int height = viewDrawCacherLayout.getHeight();
        PreviewImageView previewImageView = this.A;
        VideoResizer.a.c(iArr, videoFitType2, width, height, previewImageView.getContentWidth(), previewImageView.getContentHeight());
        float width2 = (viewDrawCacherLayout.getWidth() - iArr[0]) / 2.0f;
        float height2 = (viewDrawCacherLayout.getHeight() - iArr[1]) / 2.0f;
        DonutBadge donutBadge = this.E;
        donutBadge.setTranslationX(width2);
        donutBadge.setTranslationY(-height2);
    }

    public final void setAdController(je0 je0Var) {
        this.f = je0Var;
    }

    public final void setAdControlsClickListener(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }

    public final void setAnimationDialogCallbackProvider(no2 no2Var) {
        this.e = no2Var;
    }

    public final void setControlsUiEventsListener(rds0 rds0Var) {
        this.d = rds0Var;
    }

    public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.g, oneVideoPlayer)) {
            return;
        }
        this.C.setPlayer(oneVideoPlayer);
        this.D.setPlayer(oneVideoPlayer);
        this.g = oneVideoPlayer;
    }

    public final void setVideoClickActionCallback(ebs0 ebs0Var) {
        this.b = ebs0Var;
    }

    /* compiled from: VideoView2.kt */
    public final class m implements TransformController.a {
        public m() {
        }

        @Override // one.video.transform.TransformController.a
        public final void b(TransformController.ScaleType scaleType) {
            ebs0 videoClickActionCallback = sqt0.this.getVideoClickActionCallback();
            if (videoClickActionCallback != null) {
                videoClickActionCallback.bk(new eet0(scaleType));
            }
        }

        @Override // one.video.transform.TransformController.a
        public final void a(float f, float f2, float f3, float f4) {
        }
    }
}
