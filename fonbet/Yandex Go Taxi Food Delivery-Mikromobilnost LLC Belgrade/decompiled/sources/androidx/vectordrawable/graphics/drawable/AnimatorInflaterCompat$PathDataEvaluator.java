package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import defpackage.n891;
import defpackage.ny61;
import defpackage.wr90;

/* loaded from: classes10.dex */
class AnimatorInflaterCompat$PathDataEvaluator implements TypeEvaluator<wr90[]> {
    private wr90[] mNodeArray;

    @Override // android.animation.TypeEvaluator
    public wr90[] evaluate(float f, wr90[] wr90VarArr, wr90[] wr90VarArr2) {
        if (!n891.f(wr90VarArr, wr90VarArr2)) {
            ny61.g("Can't interpolate between two incompatible pathData");
            return null;
        }
        if (!n891.f(this.mNodeArray, wr90VarArr)) {
            this.mNodeArray = n891.j(wr90VarArr);
        }
        int i = 0;
        while (true) {
            int length = wr90VarArr.length;
            wr90[] wr90VarArr3 = this.mNodeArray;
            if (i >= length) {
                return wr90VarArr3;
            }
            wr90 wr90Var = wr90VarArr3[i];
            wr90 wr90Var2 = wr90VarArr[i];
            wr90 wr90Var3 = wr90VarArr2[i];
            wr90Var.getClass();
            wr90Var.a = wr90Var2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = wr90Var2.b;
                if (i2 < fArr.length) {
                    wr90Var.b[i2] = (wr90Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
            i++;
        }
    }
}
