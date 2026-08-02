package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;

/* compiled from: SearchViewLoaderDelegate.kt */
/* loaded from: classes17.dex */
public final class e0i0 {
    public final ProgressBar a;
    public final View b;
    public AnimatorSet c;
    public AnimatorSet d;

    public e0i0(ImageView imageView, ProgressBar progressBar) {
        this.a = progressBar;
        this.b = imageView;
    }

    public final void a(boolean z) {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            if (z) {
                return;
            }
            animatorSet.cancel();
            this.c = null;
            b(false);
            return;
        }
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.d = null;
            b(z);
        } else if (this.b.getVisibility() != 0) {
            b(z);
        }
    }

    public final void b(boolean z) {
        View view = this.b;
        ProgressBar progressBar = this.a;
        if (!z) {
            view.setVisibility(0);
            progressBar.setVisibility(8);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int i = 2;
        List l = e43.l(ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 1.0f, 0.75f), ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 1.0f, 0.75f));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            ((ObjectAnimator) it.next()).setDuration(300L);
        }
        animatorSet.playTogether(l);
        animatorSet.addListener(new c0i0(new e550(this, 24)));
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(300L);
        duration.addListener(new d0i0(new mlf0(this, i)));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration, animatorSet);
        animatorSet2.setInterpolator(new ilq());
        animatorSet2.addListener(new c0i0(new ln20(this, 27)));
        d(false);
        progressBar.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        progressBar.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        animatorSet2.start();
        this.c = animatorSet2;
    }

    public final void c(boolean z) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            if (z) {
                return;
            }
            animatorSet.cancel();
            this.d = null;
            d(false);
            return;
        }
        AnimatorSet animatorSet2 = this.c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.c = null;
            d(z);
        } else if (this.a.getVisibility() != 0) {
            d(z);
        }
    }

    public final void d(boolean z) {
        View view = this.b;
        ProgressBar progressBar = this.a;
        if (!z) {
            progressBar.setVisibility(0);
            view.setVisibility(8);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        List l = e43.l(ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 0.75f, 1.0f), ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 0.75f, 1.0f));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            ((ObjectAnimator) it.next()).setDuration(300L);
        }
        animatorSet.playTogether(l);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L);
        duration.addListener(new c0i0(new rka0(this, 15)));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration, animatorSet);
        animatorSet2.setInterpolator(new ilq());
        animatorSet2.setStartDelay(100L);
        animatorSet2.addListener(new c0i0(new mqe0(this, 4)));
        b(false);
        progressBar.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        progressBar.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        progressBar.setVisibility(0);
        animatorSet2.start();
        this.d = animatorSet2;
    }
}
