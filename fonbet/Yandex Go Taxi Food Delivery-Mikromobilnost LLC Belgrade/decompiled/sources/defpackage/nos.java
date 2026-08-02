package defpackage;

import android.animation.ValueAnimator;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeChartView;

/* loaded from: classes3.dex */
public final /* synthetic */ class nos implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FundIncomeChartView b;

    public /* synthetic */ nos(FundIncomeChartView fundIncomeChartView, int i) {
        this.a = i;
        this.b = fundIncomeChartView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        FundIncomeChartView fundIncomeChartView = this.b;
        switch (i) {
            case 0:
                FundIncomeChartView.startDrawAnimation$lambda$7$lambda$6(fundIncomeChartView, valueAnimator);
                break;
            default:
                FundIncomeChartView.animateGradientAlpha$lambda$10$lambda$9(fundIncomeChartView, valueAnimator);
                break;
        }
    }
}
