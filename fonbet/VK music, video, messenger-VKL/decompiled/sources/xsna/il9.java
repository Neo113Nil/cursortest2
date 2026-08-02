package xsna;

import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class il9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ kl9 b;
    public final /* synthetic */ LottieAnimationView c;

    public il9(kl9 kl9Var, LottieAnimationView lottieAnimationView) {
        this.b = kl9Var;
        this.c = lottieAnimationView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        TextView textView = this.b.d;
        if (textView != null) {
            textView.setTranslationY(this.c.getBottom());
        }
    }
}
