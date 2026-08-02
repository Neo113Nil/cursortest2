package com.yandex.alicekit.core.artist;

import android.animation.TypeEvaluator;
import defpackage.vr90;
import defpackage.yr90;

/* loaded from: classes11.dex */
public class PathDataEvaluator implements TypeEvaluator<vr90[]> {
    private vr90[] mNodeArray;

    public PathDataEvaluator(vr90[] vr90VarArr) {
        this.mNodeArray = vr90VarArr;
    }

    @Override // android.animation.TypeEvaluator
    public vr90[] evaluate(float f, vr90[] vr90VarArr, vr90[] vr90VarArr2) {
        vr90[] vr90VarArr3;
        vr90[] vr90VarArr4 = this.mNodeArray;
        if (vr90VarArr4 == null || !yr90.a(vr90VarArr4, vr90VarArr)) {
            if (vr90VarArr == null) {
                vr90VarArr3 = null;
            } else {
                vr90VarArr3 = new vr90[vr90VarArr.length];
                for (int i = 0; i < vr90VarArr.length; i++) {
                    vr90 vr90Var = vr90VarArr[i];
                    vr90 vr90Var2 = new vr90();
                    vr90Var2.a = vr90Var.a;
                    float[] fArr = vr90Var.b;
                    vr90Var2.b = yr90.b(fArr, fArr.length);
                    vr90VarArr3[i] = vr90Var2;
                }
            }
            this.mNodeArray = vr90VarArr3;
        }
        int i2 = 0;
        while (true) {
            int length = vr90VarArr.length;
            vr90[] vr90VarArr5 = this.mNodeArray;
            if (i2 >= length) {
                return vr90VarArr5;
            }
            vr90 vr90Var3 = vr90VarArr5[i2];
            vr90 vr90Var4 = vr90VarArr[i2];
            vr90 vr90Var5 = vr90VarArr2[i2];
            vr90Var3.getClass();
            int i3 = 0;
            while (true) {
                float[] fArr2 = vr90Var4.b;
                if (i3 < fArr2.length) {
                    vr90Var3.b[i3] = (vr90Var5.b[i3] * f) + ((1.0f - f) * fArr2[i3]);
                    i3++;
                }
            }
            i2++;
        }
    }

    public PathDataEvaluator() {
    }
}
