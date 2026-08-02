package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.google.android.material.shape.b;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public class jhr0 {
    public final bir0[] a = new bir0[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final bir0 g = new bir0();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    public jhr0() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new bir0();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static jhr0 c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? hhr0.a : new jhr0();
    }

    public final void a(b bVar, RectF rectF, Path path) {
        b(bVar, null, 1.0f, rectF, null, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void b(b bVar, float[] fArr, float f, RectF rectF, ihr0 ihr0Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        bir0[] bir0VarArr;
        Matrix[] matrixArr2;
        boolean z;
        boolean z2;
        BitSet bitSet;
        air0[] air0VarArr;
        BitSet bitSet2;
        air0[] air0VarArr2;
        char c;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            bir0VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            xre kxbVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? bVar.f : bVar.e : bVar.h : bVar.g : new kxb(fArr[i3]);
            zre zreVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? bVar.b : bVar.a : bVar.d : bVar.c;
            bir0 bir0Var = bir0VarArr[i3];
            zreVar.getClass();
            zreVar.a(bir0Var, f, kxbVar.a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 != 1) {
                c = 1;
                if (i3 == 2) {
                    i2 = i3;
                    pointF.set(rectF.left, rectF.bottom);
                } else if (i3 != 3) {
                    i2 = i3;
                    pointF.set(rectF.right, rectF.top);
                } else {
                    i2 = i3;
                    pointF.set(rectF.left, rectF.top);
                }
            } else {
                c = 1;
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            bir0 bir0Var2 = bir0VarArr[i2];
            fArr2[0] = bir0Var2.c;
            fArr2[c] = bir0Var2.d;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[c]);
            matrixArr[i2].preRotate(f2);
            i3 = i4;
        }
        int i5 = 1;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            bir0 bir0Var3 = bir0VarArr[i6];
            fArr2[z] = bir0Var3.a;
            fArr2[i5] = bir0Var3.b;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path.moveTo(fArr2[z], fArr2[i5]);
            } else {
                path.lineTo(fArr2[z], fArr2[i5]);
            }
            bir0VarArr[i6].c(matrixArr2[i6], path);
            if (ihr0Var != null) {
                bir0 bir0Var4 = bir0VarArr[i6];
                Matrix matrix = matrixArr2[i6];
                MaterialShapeDrawable materialShapeDrawable = ((a) ihr0Var).a;
                bitSet2 = materialShapeDrawable.containsIncompatibleShadowOp;
                bir0Var4.getClass();
                bitSet2.set(i6, z);
                air0VarArr2 = materialShapeDrawable.cornerShadowOperation;
                bir0Var4.b(bir0Var4.f);
                air0VarArr2[i6] = new whr0(new ArrayList(bir0Var4.h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            bir0 bir0Var5 = bir0VarArr[i6];
            fArr2[0] = bir0Var5.c;
            fArr2[i5] = bir0Var5.d;
            matrixArr2[i6].mapPoints(fArr2);
            bir0 bir0Var6 = bir0VarArr[i8];
            float f3 = bir0Var6.a;
            float[] fArr3 = this.i;
            fArr3[0] = f3;
            fArr3[i5] = bir0Var6.b;
            matrixArr2[i8].mapPoints(fArr3);
            bir0[] bir0VarArr2 = bir0VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[i5] - fArr3[i5])) - 0.001f, 0.0f);
            bir0 bir0Var7 = bir0VarArr2[i6];
            fArr2[0] = bir0Var7.c;
            fArr2[i5] = bir0Var7.d;
            matrixArr2[i6].mapPoints(fArr2);
            int i9 = i5;
            float abs = (i6 == i9 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[i9]);
            bir0 bir0Var8 = this.g;
            bir0Var8.e(0.0f, 0.0f, 270.0f, 0.0f);
            tkn tknVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? bVar.j : bVar.i : bVar.l : bVar.k;
            tknVar.b(max, abs, f, bir0Var8);
            Path path4 = this.j;
            path4.reset();
            bir0Var8.c(matrixArr[i6], path4);
            if (this.l && (tknVar.a() || d(path4, i6) || d(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = bir0Var8.a;
                i5 = 1;
                fArr2[1] = bir0Var8.b;
                matrixArr[i6].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                bir0Var8.c(matrixArr[i6], path2);
            } else {
                i5 = 1;
                bir0Var8.c(matrixArr[i6], path);
            }
            if (ihr0Var != null) {
                Matrix matrix2 = matrixArr[i6];
                MaterialShapeDrawable materialShapeDrawable2 = ((a) ihr0Var).a;
                bitSet = materialShapeDrawable2.containsIncompatibleShadowOp;
                z2 = false;
                bitSet.set(i6 + 4, false);
                air0VarArr = materialShapeDrawable2.edgeShadowOperation;
                bir0Var8.b(bir0Var8.f);
                air0VarArr[i6] = new whr0(new ArrayList(bir0Var8.h), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            i6 = i7;
            z = z2;
            bir0VarArr = bir0VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean d(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
