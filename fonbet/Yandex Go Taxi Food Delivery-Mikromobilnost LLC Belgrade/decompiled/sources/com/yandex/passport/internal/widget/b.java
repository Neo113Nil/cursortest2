package com.yandex.passport.internal.widget;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ErrorView b;

    public /* synthetic */ b(ErrorView errorView, int i) {
        this.a = i;
        this.b = errorView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ErrorView errorView = this.b;
        switch (i) {
            case 0:
                ErrorView.hide$lambda$2(errorView, valueAnimator);
                break;
            default:
                ErrorView.show$lambda$1(errorView, valueAnimator);
                break;
        }
    }
}
