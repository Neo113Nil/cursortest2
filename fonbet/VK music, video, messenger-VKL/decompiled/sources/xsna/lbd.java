package xsna;

import android.animation.ValueAnimator;
import com.vk.clips.tool.view.component.video.ClipProgressIndicator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lbd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lbd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ClipProgressIndicator clipProgressIndicator = (ClipProgressIndicator) obj;
                int i2 = ClipProgressIndicator.B;
                clipProgressIndicator.getClass();
                clipProgressIndicator.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                clipProgressIndicator.invalidate();
                break;
            default:
                ((rn10) obj).c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
