package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.Path$Direction;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class jb2 implements rq90 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public /* synthetic */ jb2(int i) {
        this(new Path());
    }

    public final void d(rq90 rq90Var) {
        if (!(rq90Var instanceof jb2)) {
            w511.x("Unable to obtain android.graphics.Path");
            return;
        }
        this.a.addPath(((jb2) rq90Var).a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public final void e(zii0 zii0Var, Path$Direction path$Direction) {
        float f = zii0Var.a;
        float f2 = zii0Var.d;
        float f3 = zii0Var.c;
        float f4 = zii0Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            nb2.c("Invalid rectangle, make sure no value is NaN");
        }
        if (this.b == null) {
            this.b = new RectF();
        }
        this.b.set(f, f4, f3, f2);
        this.a.addRect(this.b, nb2.b(path$Direction));
    }

    public final void f(sxk0 sxk0Var, Path$Direction path$Direction) {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        float f = sxk0Var.a;
        long j = sxk0Var.h;
        long j2 = sxk0Var.g;
        long j3 = sxk0Var.f;
        long j4 = sxk0Var.e;
        rectF.set(f, sxk0Var.b, sxk0Var.c, sxk0Var.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        this.a.addRoundRect(this.b, this.c, nb2.b(path$Direction));
    }

    public final void g() {
        this.a.close();
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final zii0 i() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        this.a.computeBounds(rectF, true);
        return new zii0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final int j() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final Path k() {
        return this.a;
    }

    public final void l(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void m(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean n(rq90 rq90Var, rq90 rq90Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(rq90Var instanceof jb2)) {
            w511.x("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((jb2) rq90Var).a;
        if (rq90Var2 instanceof jb2) {
            return this.a.op(path, ((jb2) rq90Var2).a, op);
        }
        w511.x("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void o() {
        this.a.reset();
    }

    public final void p() {
        this.a.rewind();
    }

    public final void q(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void r(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        this.d.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        this.a.transform(this.d);
    }

    public jb2(Path path) {
        this.a = path;
    }

    public jb2() {
        this(0);
    }
}
