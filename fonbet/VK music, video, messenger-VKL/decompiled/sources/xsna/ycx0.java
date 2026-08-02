package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.groupcalls.ControlsBoundsProvider;
import com.vk.voip.ui.watchmovie.player.VoipWatchMoviePlayerControlView;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;
import xsna.yk90;

/* compiled from: WatchTogetherPlayerHelper.kt */
/* loaded from: classes7.dex */
public final class ycx0 implements tmg0, jvw0, yk90.a {
    public static final int p = cn70.b(85);
    public static final int q = cn70.b(8);
    public static final int r = cn70.b(35);
    public final zzz b;
    public final ConstraintLayout c;
    public final j6x0 d;
    public final mcx0 e;
    public final vfz f;
    public final mfw0 g;
    public final jcx0 h;
    public final jan0 i = new jan0(this, 16);
    public final List<View> j;
    public final List<View> k;
    public int l;
    public int m;
    public io.reactivex.rxjava3.disposables.c n;
    public io.reactivex.rxjava3.disposables.c o;

    /* compiled from: WatchTogetherPlayerHelper.kt */
    public interface a {
        FrameLayout J2();

        VKImageView O1();

        VoipWatchMoviePlayerControlView getPlayerView();

        MovieThumbnail.Quality t5();

        View y1();
    }

    /* compiled from: View.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ View b;

        public b(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
            this.b = voipWatchMoviePlayerControlView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.b;
            view.setTranslationX(-w65.h(view));
        }
    }

    /* compiled from: View.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ View b;

        public c(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
            this.b = voipWatchMoviePlayerControlView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.b;
            view.setTranslationX(w65.h(view));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ycx0(zzz zzzVar, ControlsBoundsProvider controlsBoundsProvider, j6x0 j6x0Var, mcx0 mcx0Var, a aVar, mfw0 mfw0Var, jcx0 jcx0Var) {
        this.b = zzzVar;
        this.c = (ConstraintLayout) controlsBoundsProvider;
        this.d = j6x0Var;
        this.e = mcx0Var;
        this.f = (vfz) aVar;
        this.g = mfw0Var;
        this.h = jcx0Var;
        this.j = Collections.singletonList(aVar.getPlayerView());
        this.k = Collections.singletonList(aVar.O1());
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.n = emptyDisposable;
        this.o = emptyDisposable;
        mcx0Var.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.jvw0
    public final void a(boolean z) {
        VoipWatchMoviePlayerControlView playerView = this.f.getPlayerView();
        boolean z2 = this.h.a().invoke().booleanValue() && z;
        if (playerView.I != null) {
            playerView.setVisibility(z2 ? 0 : 8);
        }
        b();
    }

    @Override // xsna.jvw0
    public final void b() {
        v0(this.b.c());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.yk90.a
    public final void c() {
        ?? r0 = this.f;
        r0.O1().clear();
        r0.y1().setVisibility(8);
        b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.yk90.a
    public final void d() {
        this.f.y1().setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.vfz, xsna.ycx0$a] */
    public final void e(int i, int i2, boolean z) {
        int i3;
        int i4;
        float f = (i - i2) / 2.0f;
        int i5 = this.l;
        int i6 = this.m;
        float f2 = ((i5 <= i6 || !z) && (i6 <= i5 || z)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f;
        TextureViewRenderer textureViewRenderer = this.e.j;
        if (textureViewRenderer != null) {
            textureViewRenderer.setTranslationY(f2);
        }
        ?? r0 = this.f;
        r0.O1().setTranslationY(f2);
        r0.y1().setTranslationY(f);
        VKImageView O1 = r0.O1();
        if (O1.c0()) {
            int width = O1.getWidth();
            if (z) {
                O1.setScaleX(1.0f);
                O1.setScaleY(1.0f);
            } else {
                if (width <= 0 || (i3 = this.l) <= 0 || (i4 = this.m) <= 0) {
                    return;
                }
                float f3 = width;
                float f4 = f3 / (i4 / (i3 / f3));
                O1.setScaleX(f4);
                O1.setScaleY(f4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [xsna.vfz, xsna.ycx0$a] */
    public final void f() {
        this.d.a.add(this);
        this.b.d(this);
        mfw0 mfw0Var = this.g;
        this.n = io.reactivex.rxjava3.kotlin.c.f(3, mfw0Var.c(), null, null, new ehm0(this, 19));
        this.o = io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.y(mfw0Var.b().a0(asu0.a.d()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, null, new wcx0(this, 0));
        ?? r0 = this.f;
        MovieThumbnail.Quality t5 = r0.t5();
        if (t5 != null) {
            this.l = t5.getWidth();
            this.m = t5.getHeight();
            if (!r0.O1().c0()) {
                r0.O1().load(t5.getLink());
            }
        }
        jjc.g(r0.getPlayerView(), this.i);
        VoipWatchMoviePlayerControlView playerView = r0.getPlayerView();
        boolean booleanValue = this.h.a().invoke().booleanValue();
        if (playerView.I != null) {
            playerView.setVisibility(booleanValue ? 0 : 8);
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.jvw0
    public final boolean f3() {
        VoipWatchMoviePlayerControlView playerView = this.f.getPlayerView();
        boolean z = playerView.F.getVisibility() == 0;
        if (z) {
            playerView.H.run();
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.vfz, xsna.ycx0$a] */
    public final void g() {
        this.o.dispose();
        this.n.dispose();
        this.d.a.remove(this);
        this.b.b(this);
        ?? r0 = this.f;
        r0.getPlayerView().setOnClickListener(null);
        VoipWatchMoviePlayerControlView playerView = r0.getPlayerView();
        playerView.I = null;
        playerView.setVisibility(8);
        r0.O1().clear();
        this.l = 0;
        this.m = 0;
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.k;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.j;
    }

    public final void h(float f, VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
        boolean z = this.g.getState().b;
        int i = q;
        if (!z) {
            ViewGroup.LayoutParams layoutParams = voipWatchMoviePlayerControlView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            voipWatchMoviePlayerControlView.setLayoutParams(marginLayoutParams);
            return;
        }
        int i2 = p;
        if (f == 90.0f) {
            i(i2, voipWatchMoviePlayerControlView);
            return;
        }
        if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams2 = voipWatchMoviePlayerControlView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(i);
            voipWatchMoviePlayerControlView.setLayoutParams(marginLayoutParams2);
            i(i2, voipWatchMoviePlayerControlView);
            return;
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ViewGroup.LayoutParams layoutParams3 = voipWatchMoviePlayerControlView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginStart(i);
            marginLayoutParams3.setMarginEnd(i);
            voipWatchMoviePlayerControlView.setLayoutParams(marginLayoutParams3);
        }
    }

    public final void i(int i, final VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView) {
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) voipWatchMoviePlayerControlView.getLayoutParams();
        float c2 = this.b.c();
        ValueAnimator ofInt = ValueAnimator.ofInt(c2 == 90.0f ? layoutParams.leftMargin : c2 == 270.0f ? layoutParams.rightMargin : 0, i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.xcx0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zzz zzzVar = ycx0.this.b;
                float c3 = zzzVar.c();
                FrameLayout.LayoutParams layoutParams2 = layoutParams;
                if (c3 == 90.0f) {
                    layoutParams2.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                if (zzzVar.c() == 270.0f) {
                    layoutParams2.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                voipWatchMoviePlayerControlView.requestLayout();
            }
        });
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public final void j(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = voipWatchMoviePlayerControlView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.g.getState().b) {
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i2;
        } else {
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i2;
            int i3 = q;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i3;
        }
        voipWatchMoviePlayerControlView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, com.vk.voip.ui.groupcalls.ControlsBoundsProvider] */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        ?? r0 = this.c;
        int topOffset = r0.getTopOffset();
        int bottomOffset = r0.getBottomOffset();
        ?? r2 = this.f;
        int height = (r2.J2().getHeight() - topOffset) - bottomOffset;
        if (f == 90.0f) {
            int i = (bottomOffset - topOffset) / 2;
            VoipWatchMoviePlayerControlView playerView = r2.getPlayerView();
            ViewGroup.LayoutParams layoutParams = playerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = height;
            layoutParams2.gravity = 19;
            playerView.setLayoutParams(layoutParams2);
            j(r2.getPlayerView(), i + topOffset, r + bottomOffset);
            VoipWatchMoviePlayerControlView playerView2 = r2.getPlayerView();
            qj80.a(playerView2, new b(playerView2));
            e(topOffset, bottomOffset, false);
            return;
        }
        if (f == 270.0f) {
            int i2 = (bottomOffset - topOffset) / 2;
            VoipWatchMoviePlayerControlView playerView3 = r2.getPlayerView();
            ViewGroup.LayoutParams layoutParams3 = playerView3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.width = height;
            layoutParams4.gravity = 21;
            playerView3.setLayoutParams(layoutParams4);
            j(r2.getPlayerView(), i2 + topOffset, bottomOffset);
            VoipWatchMoviePlayerControlView playerView4 = r2.getPlayerView();
            qj80.a(playerView4, new c(playerView4));
            e(topOffset, bottomOffset, false);
            return;
        }
        j6x0 j6x0Var = this.d;
        if (f == 180.0f) {
            VoipWatchMoviePlayerControlView playerView5 = r2.getPlayerView();
            ViewGroup.LayoutParams layoutParams5 = playerView5.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.width = -1;
            layoutParams6.gravity = 48;
            playerView5.setLayoutParams(layoutParams6);
            j(r2.getPlayerView(), topOffset, bottomOffset);
            r2.getPlayerView().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            e((j6x0Var.b ? r2.getPlayerView().getHeight() : 0) + topOffset, bottomOffset, true);
            return;
        }
        h(this.b.c(), r2.getPlayerView());
        VoipWatchMoviePlayerControlView playerView6 = r2.getPlayerView();
        ViewGroup.LayoutParams layoutParams7 = playerView6.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
        layoutParams8.width = -1;
        layoutParams8.gravity = 80;
        playerView6.setLayoutParams(layoutParams8);
        j(r2.getPlayerView(), topOffset, bottomOffset);
        r2.getPlayerView().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e(topOffset, (j6x0Var.b ? r2.getPlayerView().getHeight() : 0) + bottomOffset, true);
    }
}
