package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.ProgressBarView;

/* loaded from: classes14.dex */
public final /* synthetic */ class gif0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProgressBarView b;

    public /* synthetic */ gif0(ProgressBarView progressBarView, int i) {
        this.a = i;
        this.b = progressBarView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ProgressBarView progressBarView = this.b;
        switch (i) {
            case 0:
                ProgressBarView.startAnimation$lambda$0$0(progressBarView, valueAnimator);
                break;
            case 1:
                ProgressBarView.updateAnimation$lambda$0$0(progressBarView, valueAnimator);
                break;
            default:
                ProgressBarView.loadingAnimator_delegate$lambda$0$0$0(progressBarView, valueAnimator);
                break;
        }
    }
}
