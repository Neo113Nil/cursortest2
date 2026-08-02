package com.yandex.smartcamera.arscene.ar_core.helpers;

import android.opengl.Matrix;
import defpackage.m33;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class b {
    public float a;
    public ObjectRotationHelper$AxisType b = ObjectRotationHelper$AxisType.TYPE_1;
    public m33 c;
    public final float[] d;

    public b(m33 m33Var) {
        float[] fArr = new float[16];
        this.d = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.c = m33Var;
        d();
    }

    public final void a(float f) {
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            Matrix.rotateM(this.d, 0, f, 0.0f, 1.0f, 0.0f);
            return;
        }
        if (i == 2) {
            Matrix.rotateM(this.d, 0, f, 0.0f, 0.0f, -1.0f);
        } else if (i == 3) {
            Matrix.rotateM(this.d, 0, f, 1.0f, 0.0f, 0.0f);
        } else {
            w511.b();
        }
    }

    public final void b() {
        ObjectRotationHelper$AxisType objectRotationHelper$AxisType;
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            objectRotationHelper$AxisType = ObjectRotationHelper$AxisType.TYPE_2;
        } else if (i == 2) {
            objectRotationHelper$AxisType = ObjectRotationHelper$AxisType.TYPE_3;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            objectRotationHelper$AxisType = ObjectRotationHelper$AxisType.TYPE_1;
        }
        this.b = objectRotationHelper$AxisType;
        d();
    }

    public final void c() {
        this.a = 0.0f;
        this.b = ObjectRotationHelper$AxisType.TYPE_1;
        d();
    }

    public final void d() {
        float f;
        Matrix.setIdentityM(this.d, 0);
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            f = (this.c.a / 2.0f) / 100.0f;
        } else if (i == 2) {
            f = (this.c.c / 2.0f) / 100.0f;
            Matrix.rotateM(this.d, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        } else if (i != 3) {
            w511.b();
            return;
        } else {
            f = (this.c.b / 2.0f) / 100.0f;
            Matrix.rotateM(this.d, 0, 90.0f, 0.0f, 0.0f, 1.0f);
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, f, 0.0f);
        float[] fArr2 = this.d;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr2, 0);
        a(this.a);
    }
}
