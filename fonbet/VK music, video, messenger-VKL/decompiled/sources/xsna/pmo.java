package xsna;

import android.animation.ValueAnimator;
import com.vk.stories.design.view.avatar.StoryAvatarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class pmo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pmo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                tmo tmoVar = (tmo) this.c;
                tmoVar.getClass();
                tmoVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ((hfk) this.c).invalidate();
                break;
            case 2:
                ((m0f0) this.c).setCardBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                StoryAvatarView.e1((StoryAvatarView) this.c, valueAnimator);
                break;
        }
    }
}
