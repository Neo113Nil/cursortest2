package xsna;

import android.animation.TypeEvaluator;
import xsna.rq90;

/* compiled from: PropertyValuesHolderParser.kt */
/* loaded from: classes6.dex */
public final class t7e0 implements TypeEvaluator<rq90.a[]> {
    public rq90.a[] a = null;

    @Override // android.animation.TypeEvaluator
    public final rq90.a[] evaluate(float f, rq90.a[] aVarArr, rq90.a[] aVarArr2) {
        rq90.a[] aVarArr3 = aVarArr;
        rq90.a[] aVarArr4 = aVarArr2;
        if (!rq90.a(aVarArr3, aVarArr4)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!rq90.a(this.a, aVarArr3)) {
            this.a = aVarArr3 != null ? rq90.e(aVarArr3) : null;
        }
        rq90.a[] aVarArr5 = this.a;
        if (aVarArr5 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (aVarArr3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int length = aVarArr3.length;
        for (int i = 0; i < length; i++) {
            if (aVarArr4 != null) {
                rq90.a aVar = aVarArr5[i];
                rq90.a aVar2 = aVarArr3[i];
                rq90.a aVar3 = aVarArr4[i];
                aVar.getClass();
                aVar.a = aVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVar2.b;
                    if (i2 < fArr.length) {
                        aVar.b[i2] = (aVar3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
        }
        return aVarArr5;
    }
}
