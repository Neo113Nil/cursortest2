package one.video.controls.view.faskseek;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: FastSeekViewAnimator.kt */
/* loaded from: classes8.dex */
public final class a {
    public final AppCompatTextView a;
    public final b b;
    public final AnimatorSet c;
    public final ObjectAnimator d;
    public final ObjectAnimator e;

    /* compiled from: FastSeekViewAnimator.kt */
    /* renamed from: one.video.controls.view.faskseek.a$a, reason: collision with other inner class name */
    public static final class C2176a {
        public static final AnimatorSet a(AppCompatImageView appCompatImageView, long j) {
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setStartDelay(j);
            ofFloat.setDuration(160L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat2.setStartDelay(160L);
            ofFloat2.setDuration(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2);
            return animatorSet;
        }
    }

    /* compiled from: FastSeekViewAnimator.kt */
    public interface b {
        void c();
    }

    public a(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, b bVar) {
        this.a = appCompatTextView;
        this.b = bVar;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(C2176a.a(appCompatImageView, 0L), C2176a.a(appCompatImageView2, 160L), C2176a.a(appCompatImageView3, 320L));
        this.c = animatorSet;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(160L);
        this.d = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setStartDelay(640L);
        ofFloat2.setDuration(160L);
        ofFloat2.addListener(new one.video.controls.view.faskseek.b(this));
        this.e = ofFloat2;
    }

    public final void a() {
        AnimatorSet animatorSet = this.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        ObjectAnimator objectAnimator = this.d;
        boolean isRunning = objectAnimator.isRunning();
        ObjectAnimator objectAnimator2 = this.e;
        AppCompatTextView appCompatTextView = this.a;
        if (!isRunning && appCompatTextView.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            objectAnimator.start();
            objectAnimator2.start();
        } else if (objectAnimator.isRunning() || appCompatTextView.getAlpha() == 1.0f) {
            objectAnimator2.start();
        }
    }
}
