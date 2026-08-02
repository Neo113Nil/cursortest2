package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class eb2 implements ka90 {
    public final Paint a;
    public int b;
    public Shader c;
    public wec d;
    public kb2 e;

    public eb2() {
        this(new Paint(7));
    }

    public final int a() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : fb2.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : fb2.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d() {
        this.a.setAntiAlias(true);
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        ho91.d(this.a, i);
    }

    public final void f(long j) {
        this.a.setColor(rzo.X(j));
    }

    public final void g(wec wecVar) {
        this.d = wecVar;
        this.a.setColorFilter(wecVar != null ? xta1.a(wecVar) : null);
    }

    public final void h(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void i(kb2 kb2Var) {
        this.a.setPathEffect(kb2Var != null ? kb2Var.a() : null);
        this.e = kb2Var;
    }

    public final void j(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void k(int i) {
        this.a.setStrokeCap(xhb1.d(i, 2) ? Paint.Cap.SQUARE : xhb1.d(i, 1) ? Paint.Cap.ROUND : xhb1.d(i, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void l(int i) {
        this.a.setStrokeJoin(zhb1.c(i, 0) ? Paint.Join.MITER : zhb1.c(i, 2) ? Paint.Join.BEVEL : zhb1.c(i, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void m(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void n(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public eb2(Paint paint) {
        this.a = paint;
        this.b = 3;
    }
}
