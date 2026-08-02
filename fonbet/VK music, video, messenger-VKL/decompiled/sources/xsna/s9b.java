package xsna;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s9b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                TextView textView = ((w9b) obj).r;
                if (textView == null) {
                    textView = null;
                }
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                SizeSeekBarView sizeSeekBarView = (SizeSeekBarView) obj;
                int i2 = SizeSeekBarView.p;
                sizeSeekBarView.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sizeSeekBarView.invalidate();
                valueAnimator.addListener(new SizeSeekBarView.b(sizeSeekBarView));
                break;
            default:
                com.vk.story.viewer.impl.presentation.stories.c cVar = (com.vk.story.viewer.impl.presentation.stories.c) obj;
                cVar.getClass();
                cVar.p.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
