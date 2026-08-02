package xsna;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* compiled from: MatrixAnimationHelper.kt */
/* loaded from: classes4.dex */
public final class in10 {
    public final com.vk.newsfeed.common.recycler.holders.zhukov.a a;
    public ValueAnimator f;
    public final float[] b = new float[9];
    public final float[] c = new float[9];
    public final float[] d = new float[9];
    public final Matrix e = new Matrix();
    public final fn10 g = new TypeEvaluator() { // from class: xsna.fn10
        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int i = 0;
            while (true) {
                in10 in10Var = in10.this;
                if (i >= 9) {
                    return in10Var.d;
                }
                float f2 = fArr2[i];
                float f3 = fArr[i];
                in10Var.d[i] = ((f2 - f3) * f) + f3;
                i++;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.fn10] */
    public in10(com.vk.newsfeed.common.recycler.holders.zhukov.a aVar) {
        this.a = aVar;
    }

    public final boolean a() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null ? valueAnimator.isStarted() : false) {
            return true;
        }
        ValueAnimator valueAnimator2 = this.f;
        return valueAnimator2 != null ? valueAnimator2.isRunning() : false;
    }
}
