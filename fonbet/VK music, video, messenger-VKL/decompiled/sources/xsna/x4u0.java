package xsna;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VisibilityHelper.kt */
/* loaded from: classes8.dex */
public final class x4u0 {
    public final AppCompatImageView a;
    public boolean b;
    public boolean c;
    public final a d = new a();
    public final ObjectAnimator e;
    public final ObjectAnimator f;

    /* compiled from: VisibilityHelper.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x4u0 x4u0Var = x4u0.this;
            x4u0Var.a.removeCallbacks(x4u0Var.d);
            ObjectAnimator objectAnimator = x4u0Var.e;
            if (objectAnimator.isRunning()) {
                objectAnimator.end();
            }
            x4u0Var.f.start();
        }
    }

    public x4u0(AppCompatImageView appCompatImageView) {
        this.a = appCompatImageView;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new e());
        ofFloat.addListener(new d());
        this.e = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setDuration(200L);
        ofFloat2.addListener(new c());
        ofFloat2.addListener(new b());
        this.f = ofFloat2;
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            x4u0.this.a.setVisibility(8);
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
        public final void onAnimationStart(Animator animator) {
            x4u0.this.b = false;
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
    public static final class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            x4u0.this.b = true;
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
    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            x4u0.this.a.setVisibility(0);
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
}
