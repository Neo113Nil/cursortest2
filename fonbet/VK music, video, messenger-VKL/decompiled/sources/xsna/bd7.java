package xsna;

import android.graphics.Bitmap;
import android.opengl.Matrix;

/* compiled from: BitmapTexture.kt */
/* loaded from: classes3.dex */
public final class bd7 {
    public final f100 a;
    public final int b;
    public final l0u c;
    public final int d;
    public final int e;

    public bd7(Bitmap bitmap, f100 f100Var) {
        this.a = f100Var;
        this.d = bitmap.getWidth();
        this.e = bitmap.getHeight();
        this.b = wwf0.c.u(bitmap);
        l0u l0uVar = new l0u(f100Var);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        l0uVar.d = fArr;
        this.c = l0uVar;
    }
}
