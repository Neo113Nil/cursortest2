package com.yandex.passport.common.ui.view;

import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.passport.internal.widget.InputFieldView;

/* loaded from: classes15.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ b(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                FancyProgressBar.startAnimation$lambda$2$lambda$1((FancyProgressBar) view, valueAnimator);
                break;
            default:
                ((InputFieldView) view).lambda$animateEditTextPaddingRightChanging$0(valueAnimator);
                break;
        }
    }
}
