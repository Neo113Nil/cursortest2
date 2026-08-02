package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: TextScale.java */
/* loaded from: classes.dex */
public final class vko0 extends vlp0 {

    /* compiled from: TextScale.java */
    /* loaded from: classes13.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView b;

        public a(TextView textView) {
            this.b = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.b;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // xsna.vlp0
    public final void captureEndValues(@NonNull gnp0 gnp0Var) {
        View view = gnp0Var.b;
        if (view instanceof TextView) {
            gnp0Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // xsna.vlp0
    public final void captureStartValues(@NonNull gnp0 gnp0Var) {
        View view = gnp0Var.b;
        if (view instanceof TextView) {
            gnp0Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // xsna.vlp0
    public final Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable gnp0 gnp0Var, @Nullable gnp0 gnp0Var2) {
        if (gnp0Var == null || gnp0Var2 == null || !(gnp0Var.b instanceof TextView)) {
            return null;
        }
        View view = gnp0Var2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = gnp0Var.a;
        HashMap hashMap2 = gnp0Var2.a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
