package xsna;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.widget.TextView;
import com.vk.music.design.view.text.MarqueeTextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ TextView c;

    public /* synthetic */ fg10(TextView textView, int i) {
        this.b = i;
        this.c = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        TextView textView = this.c;
        switch (i) {
            case 0:
                int i2 = MarqueeTextView.o;
                ((MarqueeTextView) textView).invalidate();
                break;
            default:
                textView.setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
        }
    }
}
