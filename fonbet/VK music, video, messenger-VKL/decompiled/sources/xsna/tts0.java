package xsna;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.CircularProgressView;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.player.VideoMiniPlayerAction;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.views.VideoViewContainer;
import com.vk.video.ui.discovery.minimizable.s;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: VideoMiniPlayerViewHolder.kt */
/* loaded from: classes7.dex */
public final class tts0 {
    public final b a;
    public final jus0 b;
    public final kus0 c;
    public final lus0 d;
    public final mus0 e;
    public final nus0 f;
    public final com.vk.video.kidsprofile.restricteduseractions.a g;
    public g5b0 k;
    public boolean l;
    public MiniPlayerControllersWrapper m;
    public final a n;
    public s.d h = new s.d("", "", VideoPlayerStatus.Playing.b, VideoMiniPlayerAction.Play, false, null);
    public s.c i = new s.c(VideoPlayerProgress.Empty.b);
    public VideoMinimizableState j = VideoMinimizableState.Hidden.b;
    public final Object o = msy.a(LazyThreadSafetyMode.NONE, new ltb0(13));

    /* compiled from: VideoMiniPlayerViewHolder.kt */
    public static final class a {
        public final ArgbEvaluator a = new ArgbEvaluator();
        public final int b;
        public final int c;

        public a(Context context) {
            e3m.a aVar = e3m.a;
            this.b = context.getColor(R.color.vk_gray_1000);
            this.c = dhr0.t.c(R.attr.vk_ui_background_content);
        }
    }

    /* compiled from: VideoMiniPlayerViewHolder.kt */
    public static final class b {
        public final ViewGroup a;
        public final VideoViewContainer b;
        public final View c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final ImageButton g;
        public final ImageButton h;
        public final ProgressBar i;
        public final CircularProgressView j;
        public final CircularProgressView k;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
            this.b = (VideoViewContainer) constraintLayout.findViewById(R.id.videoViewContainer);
            this.c = constraintLayout.findViewById(R.id.miniPlayerView);
            this.d = (TextView) constraintLayout.findViewById(R.id.titleView);
            this.e = (TextView) constraintLayout.findViewById(R.id.subtitleView);
            this.f = (TextView) constraintLayout.findViewById(R.id.adTitleView);
            this.g = (ImageButton) constraintLayout.findViewById(R.id.playView);
            this.h = (ImageButton) constraintLayout.findViewById(R.id.closeView);
            this.i = (ProgressBar) constraintLayout.findViewById(R.id.miniPlayerProgressView);
            this.j = (CircularProgressView) constraintLayout.findViewById(R.id.loadingView);
            this.k = (CircularProgressView) constraintLayout.findViewById(R.id.circularProgressView);
        }
    }

    /* compiled from: VideoMiniPlayerViewHolder.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoMiniPlayerAction.values().length];
            try {
                iArr[VideoMiniPlayerAction.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoMiniPlayerAction.Next.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoMiniPlayerAction.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoMiniPlayerAction.Replay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tts0(b bVar, jus0 jus0Var, kus0 kus0Var, lus0 lus0Var, mus0 mus0Var, nus0 nus0Var, com.vk.video.kidsprofile.restricteduseractions.a aVar) {
        this.a = bVar;
        this.b = jus0Var;
        this.c = kus0Var;
        this.d = lus0Var;
        this.e = mus0Var;
        this.f = nus0Var;
        this.g = aVar;
        this.n = new a(bVar.a.getContext());
        bVar.g.setOnClickListener(new nn9(this, 10));
        bVar.h.setOnClickListener(new tg(this, 9));
        bVar.c.setOnClickListener(new ug(this, 10));
    }

    public final void a() {
        String str;
        String str2;
        b bVar = this.a;
        ImageButton imageButton = bVar.g;
        ViewGroup viewGroup = bVar.a;
        Resources resources = imageButton.getResources();
        int i = c.$EnumSwitchMapping$0[this.h.d.ordinal()];
        imageButton.setContentDescription(resources.getString(i != 1 ? i != 3 ? R.string.video_accessibility_play : R.string.vk_common_network_error : R.string.video_accessibility_pause));
        VideoViewContainer videoViewContainer = bVar.b;
        VideoMinimizableState videoMinimizableState = this.j;
        videoViewContainer.setImportantForAccessibility(((videoMinimizableState instanceof VideoMinimizableState.Collapsed) || epx.f(videoMinimizableState, VideoMinimizableState.Pip.b)) ? 4 : 0);
        View rootView = viewGroup.getRootView();
        String str3 = null;
        if (epx.f(this.j, VideoMinimizableState.Pip.b)) {
            s.d dVar = this.h;
            str = j5g.g0(e43.l(dVar.a, dVar.b), null, null, null, 0, null, 63);
        } else {
            str = null;
        }
        rootView.setContentDescription(str);
        if (this.j instanceof VideoMinimizableState.Collapsed) {
            String string = viewGroup.getResources().getString(R.string.video_accessibility_miniplayer);
            s.d dVar2 = this.h;
            str2 = j5g.g0(e43.l(string, dVar2.a, dVar2.b), null, null, null, 0, null, 63);
        } else {
            str2 = null;
        }
        viewGroup.setContentDescription(str2);
        View view = bVar.c;
        if (this.j instanceof VideoMinimizableState.Collapsed) {
            s.d dVar3 = this.h;
            str3 = j5g.g0(e43.l(dVar3.a, dVar3.b), null, null, null, 0, null, 63);
        }
        view.setContentDescription(str3);
    }

    public final ColorStateList b(int i) {
        return ColorStateList.valueOf(this.a.a.getResources().getColor(i, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(VideoMinimizableState videoMinimizableState) {
        float f;
        float f2;
        float f3;
        boolean z;
        int f4;
        VideoMinimizableState videoMinimizableState2;
        boolean z2 = videoMinimizableState instanceof VideoMinimizableState.Collapsed;
        if (z2) {
            f = 1.0f;
        } else {
            if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
                VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState;
                float f5 = animating.d;
                VideoMinimizableState videoMinimizableState3 = animating.c;
                VideoMinimizableState videoMinimizableState4 = animating.b;
                if (!com.vk.libvideo.api.minimizable.a.a(animating, VideoMinimizableState.PreparedToPip.class)) {
                    if (com.vk.libvideo.api.minimizable.a.d(videoMinimizableState4) && ((videoMinimizableState3 instanceof VideoMinimizableState.Collapsed) || (videoMinimizableState3 instanceof VideoMinimizableState.Hidden))) {
                        f2 = videoMinimizableState4 instanceof VideoMinimizableState.FullscreenHorizontal ? 0.0f : 0.8f;
                        f3 = f5 - f2;
                    } else if (com.vk.libvideo.api.minimizable.a.f(animating)) {
                        f2 = videoMinimizableState3 instanceof VideoMinimizableState.FullscreenHorizontal ? 0.0f : 0.8f;
                        f3 = 1.0f - f5;
                    }
                    f = f3 / (1.0f - f2);
                }
            }
            f = 0.0f;
        }
        float f6 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        g5b0 g5b0Var = this.k;
        if (g5b0Var != null) {
            g5b0Var.Q(videoMinimizableState);
        }
        boolean z3 = videoMinimizableState instanceof VideoMinimizableState.Hidden;
        boolean z4 = true;
        if (!z3 && !(videoMinimizableState instanceof VideoMinimizableState.PreparedToPip)) {
            if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
                VideoMinimizableState.Animating animating2 = (VideoMinimizableState.Animating) videoMinimizableState;
                boolean b2 = com.vk.libvideo.api.minimizable.a.b(animating2, VideoMinimizableState.Expanded.class, VideoMinimizableState.FullscreenVertical.class);
                float f7 = animating2.d;
                VideoMinimizableState videoMinimizableState5 = animating2.b;
                if (b2) {
                    f();
                } else if (com.vk.libvideo.api.minimizable.a.i(animating2, new k990(26), new ha40(26))) {
                    f();
                } else {
                    VideoMinimizableState videoMinimizableState6 = animating2.c;
                    if (((videoMinimizableState5 instanceof VideoMinimizableState.Collapsed) && com.vk.libvideo.api.minimizable.a.h(videoMinimizableState6)) || ((videoMinimizableState6 instanceof VideoMinimizableState.Collapsed) && com.vk.libvideo.api.minimizable.a.h(videoMinimizableState5))) {
                        e(false);
                    } else if (com.vk.libvideo.api.minimizable.a.a(animating2, VideoMinimizableState.FullscreenVertical.class)) {
                        if (!(videoMinimizableState5 instanceof VideoMinimizableState.FullscreenVertical)) {
                            f7 = 1.0f - f7;
                        }
                        if (f7 > 0.8f) {
                            e(false);
                        } else {
                            f();
                        }
                    } else if (com.vk.libvideo.api.minimizable.a.b(animating2, VideoMinimizableState.Expanded.MatchRatio.class, VideoMinimizableState.Collapsed.class)) {
                        e(true);
                    } else if (com.vk.libvideo.api.minimizable.a.a(animating2, VideoMinimizableState.Expanded.MatchRatio.class)) {
                        f();
                    } else if (!com.vk.libvideo.api.minimizable.a.a(animating2, VideoMinimizableState.FullscreenHorizontal.class)) {
                        e(false);
                    }
                }
            } else if ((videoMinimizableState instanceof VideoMinimizableState.Pip) || (videoMinimizableState instanceof VideoMinimizableState.Expanded.MatchRatio) || (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal)) {
                f();
            } else {
                boolean z5 = videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical;
                if (z5 && !((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b) {
                    f();
                } else {
                    if (!(videoMinimizableState instanceof VideoMinimizableState.Expanded.Compact) && !z5 && !z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e(false);
                }
            }
        }
        boolean z6 = videoMinimizableState instanceof VideoMinimizableState.Animating;
        if (z6) {
            VideoMinimizableState.Animating animating3 = (VideoMinimizableState.Animating) videoMinimizableState;
            if (com.vk.libvideo.api.minimizable.a.d(animating3.b) || com.vk.libvideo.api.minimizable.a.d(animating3.c)) {
                z = true;
                boolean d = com.vk.libvideo.api.minimizable.a.d(videoMinimizableState);
                b bVar = this.a;
                View view = bVar.c;
                ImageButton imageButton = bVar.g;
                ViewGroup viewGroup = bVar.a;
                Context context = view.getContext();
                if (!z) {
                    a aVar = this.n;
                    f4 = ((Integer) aVar.a.evaluate(f6, Integer.valueOf(aVar.b), Integer.valueOf(aVar.c))).intValue();
                } else if (d) {
                    lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                    Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                    dhr0.a.getClass();
                    int i = dhr0.u().c;
                    if (valueOf == null || valueOf.intValue() != i) {
                        context = new l7s(context, dhr0.u().c);
                    }
                    f4 = e3m.f(R.attr.vk_ui_background_content, context);
                } else {
                    f4 = e3m.f(R.attr.vk_ui_background_content, context);
                }
                viewGroup.setBackgroundColor(f4);
                float f8 = (((Boolean) this.o.getValue()).booleanValue() || !z6 || !com.vk.libvideo.api.minimizable.a.f((VideoMinimizableState.Animating) videoMinimizableState) || imageButton.getLeft() < viewGroup.getWidth()) ? f6 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                bVar.h.setAlpha(f8);
                bVar.d.setAlpha(f8);
                bVar.e.setAlpha(f8);
                imageButton.setAlpha(f8);
                bVar.i.setAlpha(f8);
                bVar.j.setAlpha(f8);
                bVar.c.setVisibility(!z2 ? 0 : 8);
                VideoViewContainer videoViewContainer = bVar.b;
                if (!z3 && (!z6 || !com.vk.libvideo.api.minimizable.a.b((VideoMinimizableState.Animating) videoMinimizableState, VideoMinimizableState.Collapsed.class, VideoMinimizableState.Hidden.class))) {
                    z4 = false;
                }
                bwt0.d0(videoViewContainer, z4);
                videoMinimizableState2 = this.j;
                this.j = videoMinimizableState;
                a();
                if (com.vk.libvideo.api.minimizable.a.d(videoMinimizableState2) || com.vk.libvideo.api.minimizable.a.d(videoMinimizableState)) {
                }
                d(this.i);
                return;
            }
        }
        z = false;
        boolean d2 = com.vk.libvideo.api.minimizable.a.d(videoMinimizableState);
        b bVar2 = this.a;
        View view2 = bVar2.c;
        ImageButton imageButton2 = bVar2.g;
        ViewGroup viewGroup2 = bVar2.a;
        Context context2 = view2.getContext();
        if (!z) {
        }
        viewGroup2.setBackgroundColor(f4);
        if (((Boolean) this.o.getValue()).booleanValue()) {
        }
        bVar2.h.setAlpha(f8);
        bVar2.d.setAlpha(f8);
        bVar2.e.setAlpha(f8);
        imageButton2.setAlpha(f8);
        bVar2.i.setAlpha(f8);
        bVar2.j.setAlpha(f8);
        bVar2.c.setVisibility(!z2 ? 0 : 8);
        VideoViewContainer videoViewContainer2 = bVar2.b;
        if (!z3) {
            z4 = false;
        }
        bwt0.d0(videoViewContainer2, z4);
        videoMinimizableState2 = this.j;
        this.j = videoMinimizableState;
        a();
        if (com.vk.libvideo.api.minimizable.a.d(videoMinimizableState2)) {
        }
    }

    public final void d(s.c cVar) {
        VideoPlayerProgress videoPlayerProgress = cVar.a;
        this.i = cVar;
        if (com.vk.libvideo.api.minimizable.a.d(this.j)) {
            return;
        }
        boolean z = this.h.e;
        b bVar = this.a;
        if (z) {
            bVar.i.setProgressTintList(b(R.color.vk_orange_tint));
        } else {
            bVar.i.setProgressTintList(b(R.color.vk_blue_200));
        }
        if (videoPlayerProgress instanceof VideoPlayerProgress.Empty) {
            bVar.i.setMax(0);
            bVar.i.setProgress(0);
            return;
        }
        if (videoPlayerProgress instanceof VideoPlayerProgress.Filled) {
            bVar.i.setMax(100);
            bVar.i.setProgress(100);
        } else if (videoPlayerProgress instanceof VideoPlayerProgress.Vod) {
            bVar.i.setMax((int) ((VideoPlayerProgress.Vod) videoPlayerProgress).c);
            bVar.i.setProgress((int) ((VideoPlayerProgress.Vod) videoPlayerProgress).b);
        } else {
            if (!(videoPlayerProgress instanceof VideoPlayerProgress.Ad)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.i.setMax((int) ((VideoPlayerProgress.Ad) videoPlayerProgress).c);
            bVar.i.setProgress((int) ((VideoPlayerProgress.Ad) videoPlayerProgress).b);
        }
    }

    public final void e(boolean z) {
        if (this.l || z) {
            this.l = false;
            b bVar = this.a;
            VideoViewContainer videoViewContainer = bVar.b;
            ViewGroup.LayoutParams layoutParams = videoViewContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
            ((ViewGroup.MarginLayoutParams) bVar2).height = -1;
            bVar2.G = "16:9";
            bVar2.P = z ? bVar.a.getMeasuredWidth() : 0;
            videoViewContainer.setLayoutParams(bVar2);
        }
    }

    public final void f() {
        if (this.l) {
            return;
        }
        this.l = true;
        VideoViewContainer videoViewContainer = this.a.b;
        ViewGroup.LayoutParams layoutParams = videoViewContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = -1;
        ((ViewGroup.MarginLayoutParams) bVar).height = -1;
        bVar.P = 0;
        videoViewContainer.setLayoutParams(bVar);
    }
}
