package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryUploadIndicatorView;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vk.story.viewer.impl.presentation.stories.view.ads.AspectRatioWrapperFrameLayout;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import one.video.player.RepeatMode;
import one.video.player.model.VideoContentType;
import xsna.k840;

/* compiled from: FieldsStoryViewDelegate.java */
/* loaded from: classes6.dex */
public final class q7r implements w8i {
    public static boolean A0;

    @Nullable
    public AspectRatioWrapperFrameLayout A;

    @Nullable
    public FrameLayout B;

    @Nullable
    public ImageView C;

    @Nullable
    public xut0 D;

    @Nullable
    public View E;

    @Nullable
    public View F;

    @Nullable
    public StoryBottomViewGroup G;

    @Nullable
    public StoryUploadIndicatorView H;

    @Nullable
    public View I;

    @Nullable
    public View J;

    @Nullable
    public gkm0 K;

    @Nullable
    public View L;

    @Nullable
    public View M;

    @Nullable
    public View N;

    @Nullable
    public ImageView O;

    @Nullable
    public StoryViewHeader P;

    @Nullable
    public xjc Q;

    @Nullable
    public fmm0 R;

    @Nullable
    public gmm0 S;

    @Nullable
    public jmm0 T;

    @Nullable
    public uy9 U;

    @Nullable
    public xmm0 V;

    @Nullable
    public tcm0 W;

    @Nullable
    public pn0 X;
    public final zb80 b0;

    @Nullable
    public iz8 d0;

    @Nullable
    public yxt e0;

    @NonNull
    public final mkm0 i0;

    @NonNull
    public final mkm0 j0;

    @NonNull
    public final mkm0 k0;

    @Nullable
    public zbx l0;

    @NonNull
    public final WeakReference<vrl0> m0;

    @Nullable
    public rlt0 n;
    public final boolean n0;
    public boolean o0;

    @NonNull
    public final com.vk.story.api.a p;

    @Nullable
    public gta p0;
    public long q;

    @Nullable
    public VKImageView q0;

    @Nullable
    public View r;

    @NonNull
    public jz50 r0;

    @Nullable
    public ProgressBar s;

    @NonNull
    public q50 s0;

    @Nullable
    public VideoFastSeekView t;

    @NonNull
    public mq50 t0;

    @NonNull
    public iq50 u0;

    @Nullable
    public xaj0 v;

    @NonNull
    public om3 v0;

    @Nullable
    public ViewGroup w;

    @NonNull
    public f0q0 w0;

    @Nullable
    public VKImageView x;

    @NonNull
    public atu x0;

    @Nullable
    public VKImageView y;

    @NonNull
    public a3s y0;

    @Nullable
    public MediaAdView z;

    @NonNull
    public p5z z0;

    @NonNull
    public final jwx b = new jwx(1, iah0.v() / 4);

    @NonNull
    public final a c = new a();

    @NonNull
    public final b d = new b();

    @NonNull
    public final v5m0 e = ((StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class)).u5();

    @NonNull
    public final w2l0 f = ((StickersComponent) j6i.b(m7m.f(this), StickersComponent.class)).bc();

    @NonNull
    public final Handler g = new Handler(Looper.getMainLooper());
    public int h = -1;
    public long i = -1;
    public long j = -1;
    public boolean k = false;

    @Nullable
    public PreloadSource l = null;

    @Nullable
    public AnimatorSet m = null;

    @Nullable
    public xjt0 o = null;
    public float u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean Y = false;
    public final MusicRestrictionPopupDisplayer Z = k840.a.d;
    public final ColorDrawable a0 = new ColorDrawable(-16777216);
    public boolean c0 = false;
    public long f0 = -1;
    public boolean g0 = false;

    @NonNull
    public final Handler h0 = new Handler(Looper.getMainLooper());

    /* compiled from: FieldsStoryViewDelegate.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q7r q7rVar = q7r.this;
            q7rVar.h0.removeCallbacksAndMessages(null);
            q7rVar.r.setVisibility(0);
            ProgressBar progressBar = q7rVar.w0.a.s;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* compiled from: FieldsStoryViewDelegate.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q7r q7rVar = q7r.this;
            q7rVar.h0.removeCallbacksAndMessages(null);
            q7rVar.r.setVisibility(8);
        }
    }

    /* compiled from: FieldsStoryViewDelegate.java */
    public class c implements gzs<j1d0> {
        public c() {
        }

        @Override // xsna.gzs
        public final j1d0 invoke() {
            return q7r.this.e.a();
        }
    }

    /* compiled from: FieldsStoryViewDelegate.java */
    public class d implements SimpleVideoView.l {
        public d() {
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.l
        public final void a(Uri uri, Uri uri2, Exception exc) {
            q7r q7rVar = q7r.this;
            mkm0 mkm0Var = q7rVar.i0;
            mkm0Var.getDependencies().s.j = true;
            vrl0 vrl0Var = q7rVar.m0.get();
            if (vrl0Var != null) {
                vrl0Var.j(mkm0Var.getCurrentStory(), uri2, exc, q7rVar.b());
            }
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.l
        public final void b() {
            q7r q7rVar = q7r.this;
            mkm0 mkm0Var = q7rVar.i0;
            vrl0 vrl0Var = q7rVar.m0.get();
            if (vrl0Var != null) {
                vrl0Var.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.LOADING_VIDEO_START, mkm0Var.getCurrentStory(), mkm0Var.f, null);
            }
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.l
        public final void c(long j, long j2) {
            q7r q7rVar = q7r.this;
            vrl0 vrl0Var = q7rVar.m0.get();
            if (vrl0Var != null) {
                vrl0Var.f(q7rVar.i0.getCurrentStory(), j, j2, q7rVar.b());
            }
        }
    }

    /* compiled from: FieldsStoryViewDelegate.java */
    public class e implements SimpleVideoView.n {
        public e() {
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.n
        public final void a(Integer num) {
            q7r q7rVar = q7r.this;
            mkm0 mkm0Var = q7rVar.i0;
            vrl0 vrl0Var = q7rVar.m0.get();
            if (vrl0Var != null) {
                vrl0Var.m(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.QUALITY_DOWNGRADE, mkm0Var.getCurrentStory(), mkm0Var.f, num);
            }
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.n
        public final void b(Integer num) {
            q7r q7rVar = q7r.this;
            mkm0 mkm0Var = q7rVar.i0;
            vrl0 vrl0Var = q7rVar.m0.get();
            if (vrl0Var != null) {
                vrl0Var.m(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.QUALITY_UPGRADE, mkm0Var.getCurrentStory(), mkm0Var.f, num);
            }
        }
    }

    /* compiled from: FieldsStoryViewDelegate.java */
    public class f implements SimpleVideoView.h {
        public final /* synthetic */ vrl0 a;

        public f(vrl0 vrl0Var) {
            this.a = vrl0Var;
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.h
        public final void onBufferingEnd() {
            q7r q7rVar = q7r.this;
            mkm0 mkm0Var = q7rVar.i0;
            if (mkm0Var.p) {
                return;
            }
            vrl0 vrl0Var = this.a;
            if (vrl0Var != null) {
                vrl0Var.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.END_BUFFER_VIDEO, mkm0Var.getCurrentStory(), mkm0Var.f, q7rVar.b());
            }
            mkm0Var.c1(false);
            mkm0Var.Q0();
        }

        @Override // com.vk.media.player.video.view.SimpleVideoView.h
        public final void onBufferingStart() {
            q7r q7rVar = q7r.this;
            mkm0 mkm0Var = q7rVar.i0;
            if (mkm0Var.p) {
                return;
            }
            vrl0 vrl0Var = this.a;
            if (vrl0Var != null) {
                vrl0Var.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_BUFFER_VIDEO, mkm0Var.getCurrentStory(), mkm0Var.f, q7rVar.b());
            }
            mkm0Var.d1();
            mkm0Var.a1();
        }
    }

    /* compiled from: FieldsStoryViewDelegate.java */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            a = iArr;
            try {
                iArr[VideoContentType.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[VideoContentType.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[VideoContentType.DASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        ImageScreenSize imageScreenSize = ImageScreenSize.VERY_SMALL;
        A0 = true;
    }

    public q7r(@NonNull com.vk.story.api.a aVar, @Nullable zb80 zb80Var, @NonNull mkm0 mkm0Var, @NonNull mkm0 mkm0Var2, @NonNull mkm0 mkm0Var3, @NonNull WeakReference weakReference, boolean z) {
        this.p = aVar;
        this.b0 = zb80Var;
        this.i0 = mkm0Var;
        this.j0 = mkm0Var2;
        this.k0 = mkm0Var3;
        this.m0 = weakReference;
        this.n0 = z;
    }

    @Nullable
    public final vrl0 a() {
        return this.m0.get();
    }

    @Nullable
    public final Long b() {
        xaj0 xaj0Var;
        mkm0 mkm0Var = this.i0;
        if (mkm0Var.getCurrentStory() == null || !mkm0Var.getCurrentStory().Tb() || (xaj0Var = this.v) == null) {
            return null;
        }
        return Long.valueOf(xaj0Var.getDuration());
    }

    public final void c(@Nullable lkm0 lkm0Var) {
        vrl0 vrl0Var = this.m0.get();
        mkm0 mkm0Var = this.i0;
        if (vrl0Var != null) {
            vrl0Var.q(true, mkm0Var.getCurrentStory(), mkm0Var.f, b());
        }
        q7r q7rVar = this.s0.a;
        q7rVar.i0.a(qxi.a().d().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new l50(new vs(q7rVar.i0.getCurrentStory(), 1), 0), new sf(new t50(com.vk.metrics.eventtracking.b.a, 0), 1)));
        if (mkm0Var.getStoriesContainer() instanceof MyTargetAdStoriesContainer) {
            LayoutInflater.from(mkm0Var.getContext()).inflate(((MyTargetAdStoriesContainer) mkm0Var.getStoriesContainer()).Vb() ? R.layout.layout_story_view_my_target_internal_ad : R.layout.layout_story_view_my_target_ad, mkm0Var);
        } else {
            if (this.n0) {
                VKImageView vKImageView = new VKImageView(mkm0Var.getContext());
                this.q0 = vKImageView;
                vKImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.k0.addView(this.q0);
                Context context = mkm0Var.getContext();
                asu0.a.getClass();
                new nbu0(context, asu0.i()).a(R.layout.layout_story_view_new_player_async, mkm0Var, new s53(16, this, lkm0Var));
                elm0 elm0Var = mkm0Var.c;
                int Kb = elm0Var == null ? mkm0Var.getStoriesContainer().Kb() : elm0Var.c(mkm0Var.getStoriesContainer());
                if (Kb < 0 || Kb >= mkm0Var.getStoriesContainer().g.size()) {
                    return;
                }
                String str = mkm0Var.getStoriesContainer().g.get(Kb).B0;
                if (str == null || str.isEmpty()) {
                    this.q0.setPlaceholderColor(-16777216);
                    return;
                }
                q50 q50Var = this.s0;
                StoryEntry storyEntry = mkm0Var.getStoriesContainer().g.get(Kb);
                VKImageView vKImageView2 = this.q0;
                q50Var.getClass();
                q50.k(storyEntry, vKImageView2);
                return;
            }
            LayoutInflater.from(mkm0Var.getContext()).inflate(R.layout.layout_story_view_new_player, mkm0Var);
        }
        d();
    }

    public final void d() {
        ViewGroup viewGroup;
        int indexOfChild;
        vrl0 vrl0Var = this.m0.get();
        ColorDrawable colorDrawable = this.a0;
        mkm0 mkm0Var = this.k0;
        mkm0Var.setBackground(colorDrawable);
        mkm0Var.setOnClickListener(new p7r(0));
        this.x = (VKImageView) mkm0Var.findViewById(R.id.iv_image_preview);
        this.y = (VKImageView) mkm0Var.findViewById(R.id.iv_image_preview_background);
        this.z = (MediaAdView) mkm0Var.findViewById(R.id.my_target_media_ad_view);
        this.A = (AspectRatioWrapperFrameLayout) mkm0Var.findViewById(R.id.my_target_aspect_ratio_wrapper);
        this.B = (FrameLayout) mkm0Var.findViewById(R.id.my_target_media_ad_view_container);
        this.C = (ImageView) mkm0Var.findViewById(R.id.iv_disclaimer);
        PlaylistPlayerVideoView playlistPlayerVideoView = (PlaylistPlayerVideoView) mkm0Var.findViewById(R.id.vv_video_preview);
        if (playlistPlayerVideoView != null) {
            playlistPlayerVideoView.setPreloadManager(new c());
            this.v = new xaj0(playlistPlayerVideoView, new p3h(this, 16));
            this.w = playlistPlayerVideoView;
            if ((playlistPlayerVideoView.getParent() instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) playlistPlayerVideoView.getParent()).indexOfChild(playlistPlayerVideoView)) != -1) {
                viewGroup.removeView(playlistPlayerVideoView);
                ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
                ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
                bVar.t = 0;
                bVar.v = 0;
                bVar.i = 0;
                bVar.l = 0;
                constraintLayout.addView(playlistPlayerVideoView, bVar);
                viewGroup.addView(constraintLayout, indexOfChild, new FrameLayout.LayoutParams(-1, -1));
                this.w = constraintLayout;
            }
        }
        StoryProgressView storyProgressView = (StoryProgressView) mkm0Var.findViewById(R.id.vrpv_progress);
        mkm0 mkm0Var2 = this.i0;
        mkm0Var2.setProgressView(storyProgressView);
        mkm0Var2.setProgressDelegate(new umm0(mkm0Var2, mkm0Var2.getProgressView()));
        this.P = (StoryViewHeader) mkm0Var.findViewById(R.id.story_view_header);
        this.G = (StoryBottomViewGroup) mkm0Var.findViewById(R.id.bottom_view_group);
        this.H = (StoryUploadIndicatorView) mkm0Var.findViewById(R.id.fl_upload_container);
        this.P.setContainer(mkm0Var2.getStoriesContainer());
        this.t = (VideoFastSeekView) mkm0Var.findViewById(R.id.story_fast_seek_view);
        ImageView imageView = (ImageView) mkm0Var.findViewById(R.id.iv_follow_unfollow);
        this.O = imageView;
        imageView.setOnClickListener(new bj6(this, 2));
        this.L = mkm0Var.findViewById(R.id.ll_deleted);
        this.M = mkm0Var.findViewById(R.id.ll_private);
        View findViewById = mkm0Var.findViewById(R.id.gesture_handler);
        this.N = findViewById;
        findViewById.setOnTouchListener(mkm0Var2.getGestureTouchListener());
        this.D = new xut0(mkm0Var.findViewById(R.id.back_gradient));
        ProgressBar progressBar = (ProgressBar) mkm0Var.findViewById(R.id.pb_loading);
        this.s = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        this.r = mkm0Var.findViewById(R.id.fl_error);
        mkm0Var.findViewById(R.id.tv_retry).setOnClickListener(new qa6(this, 5));
        this.I = mkm0Var.findViewById(R.id.fl_uploading_view);
        this.E = mkm0Var.findViewById(R.id.top_gradient);
        this.F = mkm0Var.findViewById(R.id.bottom_gradient);
        qlm0 dependencies = mkm0Var2.getDependencies();
        mkm0 mkm0Var3 = this.j0;
        this.V = new xmm0(mkm0Var3, mkm0Var2, dependencies);
        this.J = mkm0Var.findViewById(R.id.fl_upload_failure);
        this.K = (gkm0) mkm0Var.findViewById(R.id.pv_progress);
        View view = this.J;
        if (view != null) {
            view.findViewById(R.id.tv_upload_retry).setOnClickListener(new ra6(this, 3));
        }
        if (this.Y) {
            this.v0.e(true);
        }
        xaj0 xaj0Var = this.v;
        if (xaj0Var != null) {
            if (mkm0Var2.f) {
                mkm0Var.removeView(xaj0Var.a);
            } else {
                xaj0Var.f(RepeatMode.OFF);
                this.v.getClass();
                xaj0 xaj0Var2 = this.v;
                xaj0Var2.f = new d();
                xaj0Var2.g = new e();
                xaj0Var2.e = new d9(this, 15);
                xaj0Var2.b = new w69(this, 5);
                xaj0Var2.d = new vj0(this, 20);
                t34 t34Var = new t34(this, 16);
                xaj0Var2.getClass();
                L.e("VideoPlayer", "setOnErrorListener");
                xaj0Var2.h = t34Var;
                xaj0 xaj0Var3 = this.v;
                f fVar = new f(vrl0Var);
                xaj0Var3.getClass();
                L.e("VideoPlayer", "setOnBufferingEventsListener");
                xaj0Var3.i = fVar;
                xaj0 xaj0Var4 = this.v;
                b47 b47Var = new b47(this, 2);
                xaj0Var4.getClass();
                L.e("VideoPlayer", "setOnStateChangedListener");
                xaj0Var4.j = b47Var;
                xaj0 xaj0Var5 = this.v;
                bhh bhhVar = new bhh(this, 16);
                xaj0Var5.getClass();
                L.e("VideoPlayer", "setOnVolumeChangeListener");
                xaj0Var5.k = bhhVar;
            }
        }
        this.P.setOnCloseClickListener(new qqe(this, 18));
        this.P.setOnMenuClickListener(new r3h(this, 13));
        if (!(mkm0Var2.getStoriesContainer() instanceof MyTargetAdStoriesContainer)) {
            this.P.setOwnerLayerClickListener(new lrk(this, 12));
        }
        this.P.setSubtitleClickListener(new dhh(this, 12));
        StoryViewHeader storyViewHeader = this.P;
        storyViewHeader.getClass();
        storyViewHeader.a(null);
        View view2 = this.E;
        view2.setBackground(view2.getContext().getDrawable(R.drawable.bg_black_gradient_top));
        View view3 = this.F;
        view3.setBackground(view3.getContext().getDrawable(R.drawable.bg_black_gradient_bottom));
        this.E.setAlpha(1.0f);
        this.F.setAlpha(1.0f);
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        anm0 anm0Var = mkm0Var2.getDependencies().f;
        MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer = this.Z;
        this.R = new fmm0(mkm0Var3, musicRestrictionPopupDisplayer, anm0Var);
        this.S = new gmm0(mkm0Var3, musicRestrictionPopupDisplayer);
        this.T = new jmm0(mkm0Var, "story", "");
        this.U = new uy9(mkm0Var2.getDependencies().g, mkm0Var3);
        this.X = new pn0(mkm0Var2.getDependencies().g, mkm0Var3);
        this.p0 = new gta();
        p5z p5zVar = this.z0;
        bwt0.h(p5zVar.a.i0, new gzv(p5zVar, 4));
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d()) {
            VideoPipStateHolder.a();
        }
        this.l0 = new zbx(mkm0Var3, new d22(this, 16), this.f, this.w0);
        if (vrl0Var != null) {
            vrl0Var.q(false, mkm0Var2.getCurrentStory(), mkm0Var2.f, b());
        }
    }

    public final boolean e() {
        mkm0 mkm0Var = this.i0;
        return mkm0Var.getCurrentStory() != null && o25.a().a(mkm0Var.getCurrentStory().d);
    }
}
