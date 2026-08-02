package xsna;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import com.vk.libvideo.offline.ui.VideoAnimatedDownloadingDelegate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class osv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ osv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((qsv) this.c).a.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                xaa0 xaa0Var = (xaa0) this.c;
                xaa0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaa0Var.l = Math.min(Math.max(SystemClock.uptimeMillis() - xaa0Var.j, 0L) / xaa0Var.k, 1.0f);
                xaa0Var.invalidateSelf();
                break;
            default:
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = (VideoAnimatedDownloadingDelegate) this.c;
                videoAnimatedDownloadingDelegate.k.setProgress((int) ((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
                videoAnimatedDownloadingDelegate.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                videoAnimatedDownloadingDelegate.k.invalidate();
                break;
        }
    }
}
