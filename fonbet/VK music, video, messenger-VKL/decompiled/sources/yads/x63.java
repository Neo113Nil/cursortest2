package yads;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class x63 implements gf {
    public final int a;
    public final ArgbEvaluator b;
    public ValueAnimator c;

    public /* synthetic */ x63(int i) {
        this(i, new ArgbEvaluator());
    }

    @Override // yads.gf
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator ofObject = ValueAnimator.ofObject(this.b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.a));
        this.c = ofObject;
        w63 w63Var = new w63(textView);
        if (ofObject != null) {
            ofObject.addUpdateListener(w63Var);
        }
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.setDuration(500);
        }
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // yads.gf
    public final void cancel() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public x63(int i, ArgbEvaluator argbEvaluator) {
        this.a = i;
        this.b = argbEvaluator;
    }
}
