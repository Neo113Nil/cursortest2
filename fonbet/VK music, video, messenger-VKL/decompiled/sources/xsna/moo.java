package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.duration.DurationView;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class moo implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ DurationView c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public moo(View view, DurationView durationView, boolean z, boolean z2) {
        this.b = view;
        this.c = durationView;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = z2 || z;
        int i = DurationView.r;
        final DurationView durationView = this.c;
        if (!durationView.q && durationView.l != z3) {
            FrameLayout frameLayout = durationView.d;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            durationView.l = z3;
            ValueAnimator valueAnimator = durationView.m;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                durationView.m = null;
            }
            ImageView imageView = durationView.i;
            if (imageView != null) {
                imageView.setSelected(durationView.l);
            }
            FrameLayout frameLayout2 = durationView.d;
            final int width = (frameLayout2 == null || (durationView.l && frameLayout2.getWidth() == i)) ? 0 : frameLayout2.getWidth();
            if (!durationView.l) {
                i = 0;
            }
            final int i2 = i - width;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.loo
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    DurationView.a(width, i2, durationView, valueAnimator2);
                }
            });
            ofFloat.addListener(new ohk(durationView, 1));
            ofFloat.setDuration(qq2.d(durationView.getContext()) ? 0 : 300);
            ofFloat.start();
            durationView.m = ofFloat;
        }
        boolean stateShowPlay = durationView.getStateShowPlay();
        boolean stateShowProgress = durationView.getStateShowProgress();
        if (durationView.getStateShowProgress() != z2) {
            durationView.setStateShowProgress(z2);
            ImageView imageView2 = durationView.h;
            if (imageView2 != null) {
                imageView2.animate().alpha(durationView.getStateShowProgress() ? 1.0f : 0.0f).setStartDelay(stateShowPlay ? 300 : 50).setDuration(300L).start();
            }
        }
        if (durationView.getStateShowPlay() != z) {
            durationView.setStateShowPlay(z);
            ImageView imageView3 = durationView.i;
            if (imageView3 != null) {
                imageView3.animate().alpha(durationView.getStateShowPlay() ? 1.0f : 0.0f).setStartDelay(stateShowProgress ? 300 : 50).setDuration(300L).start();
            }
        }
    }
}
