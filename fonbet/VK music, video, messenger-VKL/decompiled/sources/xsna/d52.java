package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.graphics.Path;

/* compiled from: AndroidCanvas.android.kt */
/* loaded from: classes11.dex */
public final class d52 implements yq9 {
    public Canvas a = e52.a;
    public Rect b;
    public Rect c;

    @Override // xsna.yq9
    public final void a() {
        this.a.restore();
    }

    @Override // xsna.yq9
    public final void c(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // xsna.yq9
    public final void d(float f, long j, fg90 fg90Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void e() {
        this.a.save();
    }

    @Override // xsna.yq9
    public final void f() {
        mr9.a(this.a, false);
    }

    @Override // xsna.yq9
    public final void g(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // xsna.yq9
    public final void h(float f, float f2, float f3, float f4, fg90 fg90Var) {
        this.a.drawOval(f, f2, f3, f4, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void i(float f, float f2, float f3, float f4, fg90 fg90Var) {
        this.a.drawRect(f, f2, f3, f4, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void j(Path path, int i) {
        Canvas canvas = this.a;
        if (!(path instanceof androidx.compose.ui.graphics.a)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((androidx.compose.ui.graphics.a) path).a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // xsna.yq9
    public final void k(Path path, fg90 fg90Var) {
        Canvas canvas = this.a;
        if (!(path instanceof androidx.compose.ui.graphics.a)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((androidx.compose.ui.graphics.a) path).a, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, fg90 fg90Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void m(float[] fArr) {
        if (fco0.e(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        alk.w(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // xsna.yq9
    public final void o(float f, float f2, float f3, float f4, float f5, float f6, fg90 fg90Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void p(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // xsna.yq9
    public final void q(agw agwVar, long j, long j2, long j3, long j4, fg90 fg90Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = ba2.a(agwVar);
        Rect rect = this.b;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        s3q0 s3q0Var = s3q0.a;
        Rect rect2 = this.c;
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(a, rect, rect2, wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void r(zhf0 zhf0Var, fg90 fg90Var) {
        this.a.saveLayer(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d, wa2.a(fg90Var), 31);
    }

    @Override // xsna.yq9
    public final void s() {
        mr9.a(this.a, true);
    }

    @Override // xsna.yq9
    public final void t(float f) {
        this.a.rotate(f);
    }

    @Override // xsna.yq9
    public final void u(long j, long j2, fg90 fg90Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), wa2.a(fg90Var));
    }

    @Override // xsna.yq9
    public final void v(agw agwVar, long j, fg90 fg90Var) {
        this.a.drawBitmap(ba2.a(agwVar), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), wa2.a(fg90Var));
    }
}
