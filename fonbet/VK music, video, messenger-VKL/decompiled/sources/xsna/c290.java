package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.RotatingView;

/* compiled from: OverlayAnimator.kt */
/* loaded from: classes4.dex */
public final class c290 {
    public final hfk a;
    public boolean b;
    public ObjectAnimator c;
    public ValueAnimator d;
    public AnimatorSet e;
    public boolean f;
    public AnimatorSet g;
    public boolean h;
    public AnimatorSet i;
    public boolean j;
    public AnimatorSet k;
    public boolean l;

    /* compiled from: OverlayAnimator.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
        }
    }

    public c290(hfk hfkVar) {
        this.a = hfkVar;
        hfkVar.setOverlayAnimator(this);
    }

    public static ObjectAnimator a(hfk hfkVar, boolean z, boolean z2) {
        ObjectAnimator b = b(hfkVar, hfkVar.getDarkOverlayPaint$android_release(), z2 ? 0.7f : 1.0f);
        if (z) {
            return b;
        }
        return null;
    }

    public static ObjectAnimator b(hfk hfkVar, Paint paint, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(paint, h7e0.a, f);
        ofFloat.addUpdateListener(new pmo(hfkVar, 1));
        return ofFloat;
    }

    public static ObjectAnimator c(hfk hfkVar, boolean z, boolean z2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hfkVar.getRotatingView(), (Property<RotatingView, Float>) View.ALPHA, z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(z ? 200L : 400L);
        long duration = ofFloat.getDuration();
        if (z2) {
            duration /= 2;
        }
        ofFloat.setDuration(duration);
        ofFloat.setStartDelay((z2 && z) ? ofFloat.getDuration() / 2 : 0L);
        return ofFloat;
    }

    public static void d(Animator animator, boolean z, gzs gzsVar) {
        animator.setDuration(z ? 200L : 400L);
        animator.addListener(new a(gzsVar));
        animator.start();
    }

    public static ObjectAnimator e(hfk hfkVar, boolean z) {
        return b(hfkVar, hfkVar.getTinyLinePaint$android_release(), z ? 0.4f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
