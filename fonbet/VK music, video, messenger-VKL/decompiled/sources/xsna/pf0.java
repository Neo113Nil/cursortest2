package xsna;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import com.vkontakte.android.R;
import xsna.rf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pf0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pf0(k6i0 k6i0Var, boolean z) {
        this.d = k6i0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                rf0 rf0Var = (rf0) this.d;
                Integer num = (Integer) obj;
                if (this.c) {
                    int m = krv0.m(R.attr.vk_ui_background_content, rf0Var.itemView.getContext());
                    int intValue = num.intValue();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (rf0Var.L != rf0.a.ACTIVE) {
                        ValueAnimator ofArgb = ValueAnimator.ofArgb(m, intValue);
                        ofArgb.setDuration(500L);
                        ofArgb.setInterpolator(new LinearInterpolator());
                        ofArgb.setStartDelay(1500 - (SystemClock.elapsedRealtime() - elapsedRealtime));
                        ofArgb.addUpdateListener(new qf0(rf0Var, 0));
                        ofArgb.addListener(new sf0(rf0Var, intValue));
                        ofArgb.start();
                        ValueAnimator valueAnimator = rf0Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimator2 = rf0Var.J;
                        if (valueAnimator2 != null) {
                            valueAnimator2.removeAllListeners();
                        }
                        ValueAnimator valueAnimator3 = rf0Var.J;
                        if (valueAnimator3 != null) {
                            valueAnimator3.removeAllUpdateListeners();
                        }
                        rf0Var.J = ofArgb;
                    }
                } else {
                    rf0Var.T6(num.intValue());
                }
                break;
            default:
                ((k6i0) this.d).h.invoke((Throwable) obj, Boolean.valueOf(this.c));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pf0(boolean z, rf0 rf0Var) {
        this.c = z;
        this.d = rf0Var;
    }
}
