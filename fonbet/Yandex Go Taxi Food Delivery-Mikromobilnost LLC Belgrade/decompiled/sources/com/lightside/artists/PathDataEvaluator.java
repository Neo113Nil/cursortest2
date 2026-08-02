package com.lightside.artists;

import android.animation.TypeEvaluator;
import defpackage.ur90;
import defpackage.xr90;

/* loaded from: classes11.dex */
public class PathDataEvaluator implements TypeEvaluator<ur90[]> {
    private ur90[] mNodeArray;

    public PathDataEvaluator(ur90[] ur90VarArr) {
        this.mNodeArray = ur90VarArr;
    }

    @Override // android.animation.TypeEvaluator
    public ur90[] evaluate(float f, ur90[] ur90VarArr, ur90[] ur90VarArr2) {
        ur90[] ur90VarArr3;
        ur90[] ur90VarArr4 = this.mNodeArray;
        if (ur90VarArr4 == null || !xr90.a(ur90VarArr4, ur90VarArr)) {
            if (ur90VarArr == null) {
                ur90VarArr3 = null;
            } else {
                ur90VarArr3 = new ur90[ur90VarArr.length];
                for (int i = 0; i < ur90VarArr.length; i++) {
                    ur90 ur90Var = ur90VarArr[i];
                    ur90 ur90Var2 = new ur90();
                    ur90Var2.a = ur90Var.a;
                    float[] fArr = ur90Var.b;
                    ur90Var2.b = xr90.b(fArr, fArr.length);
                    ur90VarArr3[i] = ur90Var2;
                }
            }
            this.mNodeArray = ur90VarArr3;
        }
        int i2 = 0;
        while (true) {
            int length = ur90VarArr.length;
            ur90[] ur90VarArr5 = this.mNodeArray;
            if (i2 >= length) {
                return ur90VarArr5;
            }
            ur90 ur90Var3 = ur90VarArr5[i2];
            ur90 ur90Var4 = ur90VarArr[i2];
            ur90 ur90Var5 = ur90VarArr2[i2];
            ur90Var3.getClass();
            int i3 = 0;
            while (true) {
                float[] fArr2 = ur90Var4.b;
                if (i3 < fArr2.length) {
                    ur90Var3.b[i3] = (ur90Var5.b[i3] * f) + ((1.0f - f) * fArr2[i3]);
                    i3++;
                }
            }
            i2++;
        }
    }

    public PathDataEvaluator() {
    }
}
