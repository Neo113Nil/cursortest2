package xsna;

import android.animation.ValueAnimator;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.libvideo.offline.ui.VideoAnimatedDownloadingDelegate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uaa0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uaa0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((waa0) this.c).e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = (VideoAnimatedDownloadingDelegate) this.c;
                videoAnimatedDownloadingDelegate.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                VkSpinner vkSpinner = videoAnimatedDownloadingDelegate.k;
                vkSpinner.setProgress((int) ((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
                vkSpinner.invalidate();
                break;
        }
    }
}
