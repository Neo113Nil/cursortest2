package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes11.dex */
class FloatingActionButtonImpl$4 implements TypeEvaluator<Float> {
    final FloatEvaluator floatEvaluator = new FloatEvaluator();
    final /* synthetic */ f this$0;

    public FloatingActionButtonImpl$4(f fVar) {
        this.this$0 = fVar;
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.floatEvaluator.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
