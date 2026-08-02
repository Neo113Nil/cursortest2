package xsna;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.jf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ff0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jf0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ ff0(boolean z, jf0 jf0Var, long j) {
        this.b = z;
        this.c = jf0Var;
        this.d = j;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        boolean z = this.b;
        jf0 jf0Var = this.c;
        if (z) {
            num.getClass();
            if (jf0Var.N == jf0.a.DEFAULT) {
                if (((Boolean) jf0Var.D.m.getValue()).booleanValue()) {
                    ValueAnimator valueAnimator = jf0Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                    }
                    ValueAnimator valueAnimator2 = jf0Var.P;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                }
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(jf0Var.O), num);
                ofObject.setDuration(300L);
                ofObject.setInterpolator(new LinearInterpolator());
                ofObject.setStartDelay(1500 - (SystemClock.elapsedRealtime() - this.d));
                ofObject.addUpdateListener(new if0(jf0Var, 0));
                ofObject.addListener(new lf0(jf0Var));
                ofObject.start();
                jf0Var.P = ofObject;
            }
        } else {
            TextView textView = jf0Var.G;
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
            jf0Var.H.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_contrast));
            jf0Var.I.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_contrast));
            jf0Var.L.setBackgroundColor(num.intValue());
        }
        return s3q0.a;
    }
}
