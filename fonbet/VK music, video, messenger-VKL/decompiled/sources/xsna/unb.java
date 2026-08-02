package xsna;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;
import com.vk.photo.editor.views.DashedSeekBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class unb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ unb(FrameLayout frameLayout, int i) {
        this.b = i;
        this.c = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        FrameLayout frameLayout = this.c;
        switch (i) {
            case 0:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                LinkedMessageView linkedMessageView = ((ynb) frameLayout).n;
                if (linkedMessageView != null) {
                    ynb.s(linkedMessageView, animatedFraction);
                    break;
                }
                break;
            default:
                DashedSeekBar dashedSeekBar = (DashedSeekBar) frameLayout;
                int i2 = DashedSeekBar.M;
                dashedSeekBar.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dashedSeekBar.invalidate();
                break;
        }
    }
}
