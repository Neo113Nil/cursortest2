package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a531 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final x431 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final w53 o;

    public a531(a531 a531Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        w53 w53Var = new w53();
        this.o = w53Var;
        this.g = new x431(a531Var.g, w53Var);
        this.a = new Path(a531Var.a);
        this.b = new Path(a531Var.b);
        this.h = a531Var.h;
        this.i = a531Var.i;
        this.j = a531Var.j;
        this.k = a531Var.k;
        this.l = a531Var.l;
        this.m = a531Var.m;
        String str = a531Var.m;
        if (str != null) {
            w53Var.put(str, this);
        }
        this.n = a531Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(x431 x431Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        Matrix matrix2 = x431Var.a;
        ArrayList arrayList = x431Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = x431Var.a;
        matrix3.preConcat(x431Var.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            y431 y431Var = (y431) arrayList.get(i4);
            if (y431Var instanceof x431) {
                a((x431) y431Var, matrix3, canvas, i, i2);
            } else if (y431Var instanceof z431) {
                z431 z431Var = (z431) y431Var;
                float f2 = i / this.j;
                float f3 = i2 / this.k;
                float min = Math.min(f2, f3);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i4;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    wr90[] wr90VarArr = z431Var.a;
                    if (wr90VarArr != null) {
                        n891.m(wr90VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (z431Var instanceof v431) {
                        path2.setFillType(z431Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        w431 w431Var = (w431) z431Var;
                        float f5 = w431Var.i;
                        if (f5 != 0.0f || w431Var.j != 1.0f) {
                            float f6 = w431Var.k;
                            float f7 = (f5 + f6) % 1.0f;
                            float f8 = (w431Var.j + f6) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z);
                            float length = this.f.getLength();
                            float f9 = f7 * length;
                            float f10 = f8 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f;
                            if (f9 > f10) {
                                pathMeasure.getSegment(f9, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f10, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f9, f10, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        o3 o3Var = w431Var.f;
                        if (((Shader) o3Var.w) != null || o3Var.b != 0) {
                            if (this.e == null) {
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) o3Var.w;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(w431Var.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(VectorDrawableCompat.applyAlpha(o3Var.b, w431Var.h));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(w431Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        o3 o3Var2 = w431Var.d;
                        if (((Shader) o3Var2.w) != null || o3Var2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = w431Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = w431Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(w431Var.n);
                            Shader shader2 = (Shader) o3Var2.w;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(w431Var.g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(VectorDrawableCompat.applyAlpha(o3Var2.b, w431Var.g));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(w431Var.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i4 = i3 + 1;
                c = 0;
            }
            i3 = i4;
            i4 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public a531() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new w53();
        this.g = new x431();
        this.a = new Path();
        this.b = new Path();
    }
}
