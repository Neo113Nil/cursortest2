package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: VkVideoPromoController.kt */
/* loaded from: classes3.dex */
public final class d0w0 implements hnt0 {
    public final View b;
    public final FrameLayout c;
    public final com.vk.libvideo.design.view.swipe.layout.a d;
    public final h0w0 e;
    public final sos0 f;
    public ValueAnimator g;
    public boolean h;
    public int i;
    public int j;

    /* compiled from: VkVideoPromoController.kt */
    public static final class a extends BaseInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f < 0.5f) {
                return 4.0f * f * f * f;
            }
            float f2 = (f * (-2.0f)) + 2.0f;
            return 1.0f - (((f2 * f2) * f2) / 2.0f);
        }
    }

    public d0w0(View view, FrameLayout frameLayout, com.vk.libvideo.design.view.swipe.layout.a aVar, h0w0 h0w0Var, sos0 sos0Var) {
        this.b = view;
        this.c = frameLayout;
        this.d = aVar;
        this.e = h0w0Var;
        this.f = sos0Var;
        VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            aVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.b0w0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    d0w0 d0w0Var = d0w0.this;
                    int i9 = d0w0Var.j;
                    FrameLayout frameLayout2 = d0w0Var.c;
                    com.vk.libvideo.design.view.swipe.layout.a aVar2 = d0w0Var.d;
                    if (i9 == 0) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    int measuredHeight = ((aVar2.getMeasuredHeight() - aVar2.getPaddingBottom()) * d0w0Var.i) / d0w0Var.j;
                    qcy<Object>[] qcyVarArr = bwt0.a;
                    int dimension = (((int) frameLayout2.getResources().getDimension(R.dimen.video_bottom_promo_container_padding)) * 2) + measuredHeight;
                    int measuredWidth = aVar2.getMeasuredWidth();
                    if (dimension > measuredWidth) {
                        dimension = measuredWidth;
                    }
                    layoutParams.width = dimension;
                    frameLayout2.setLayoutParams(layoutParams);
                }
            });
        }
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        this.i = i;
        this.j = i2;
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.d;
        boolean r = iah0.r(aVar.getContext());
        h0w0 h0w0Var = this.e;
        if (r) {
            h0w0Var.a();
        }
        if (iah0.r(aVar.getContext()) && h0w0Var.c(false)) {
            f();
        } else if (iah0.r(aVar.getContext()) && h0w0Var.g(false)) {
            e();
        }
    }

    public final void b() {
        VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures)) {
            d(true);
        } else {
            VideoFeatures videoFeatures2 = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
            videoFeatures2.getClass();
            if (bVar.a(videoFeatures2)) {
                c(true);
            }
        }
        this.e.e();
    }

    public final void c(boolean z) {
        if (this.h) {
            this.h = false;
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float translationY = this.c.getTranslationY();
            qcy<Object>[] qcyVarArr = bwt0.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, (int) r1.getResources().getDimension(R.dimen.video_bottom_promo_container_width));
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new a());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.c0w0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    d0w0 d0w0Var = d0w0.this;
                    com.vk.libvideo.design.view.swipe.layout.a aVar = d0w0Var.d;
                    FrameLayout frameLayout = d0w0Var.c;
                    qcy<Object>[] qcyVarArr2 = bwt0.a;
                    awt0.x(aVar, 0, 0, 0, ((int) frameLayout.getResources().getDimension(R.dimen.video_bottom_promo_container_width)) - ((int) floatValue), 7);
                    frameLayout.setTranslationY(floatValue);
                }
            });
            ofFloat.addListener(new b());
            if (z) {
                ofFloat.start();
            } else {
                ofFloat.end();
            }
            this.g = ofFloat;
            if (z) {
                return;
            }
            this.f.b(this.e.d().f);
        }
    }

    public final void d(boolean z) {
        if (this.h) {
            this.h = false;
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.getTranslationX(), bwt0.y(R.dimen.video_right_promo_container_width, r1));
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new a());
            ofFloat.addUpdateListener(new sda0(this, 4));
            ofFloat.addListener(new c());
            if (z) {
                ofFloat.start();
            } else {
                ofFloat.end();
            }
            this.g = ofFloat;
        }
    }

    public final void e() {
        if (this.h) {
            return;
        }
        this.h = true;
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new a());
        ofFloat.addUpdateListener(new os6(this, 3));
        ofFloat.addListener(new d());
        ofFloat.start();
        this.g = ofFloat;
        this.f.show(this.e.d().f);
    }

    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.getTranslationX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new a());
        ofFloat.addUpdateListener(new frb(this, 3));
        ofFloat.addListener(new e());
        ofFloat.start();
        this.g = ofFloat;
        this.f.show(this.e.d().f);
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        boolean M = yg5Var.M();
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.d;
        boolean r = iah0.r(aVar.getContext());
        h0w0 h0w0Var = this.e;
        if (r && h0w0Var.c(M)) {
            f();
            return;
        }
        boolean M2 = yg5Var.M();
        if (iah0.r(aVar.getContext()) && h0w0Var.g(M2)) {
            e();
        }
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

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d0w0.this.c.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d0w0.this.b.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            d0w0.this.c.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            d0w0.this.b.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
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

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
    }
}
