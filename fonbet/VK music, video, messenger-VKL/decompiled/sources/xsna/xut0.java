package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: ViewDisplayer.java */
/* loaded from: classes17.dex */
public final class xut0 {
    public final WeakReference<View> a;
    public ObjectAnimator b;
    public ObjectAnimator c;
    public float d = 1.0f;

    /* compiled from: ViewDisplayer.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            xut0.this.b = null;
        }
    }

    public xut0(View view) {
        this.a = new WeakReference<>(view);
    }

    public final void a(boolean z) {
        View view;
        if (this.c == null && (view = this.a.get()) != null) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.b = null;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
            this.c = duration;
            duration.addListener(new yut0(this, view, z));
            this.c.start();
        }
    }

    public final void b() {
        View view;
        if (this.b == null && (view = this.a.get()) != null) {
            ObjectAnimator objectAnimator = this.c;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.c = null;
            }
            if (view.getVisibility() == 8 || view.getVisibility() == 4) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            view.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, this.d).setDuration(150L);
            this.b = duration;
            duration.addListener(new a());
            this.b.start();
        }
    }
}
