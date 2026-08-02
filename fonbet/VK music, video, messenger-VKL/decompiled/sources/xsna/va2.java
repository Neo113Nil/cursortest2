package xsna;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import xsna.wa2;

/* compiled from: AndroidPaint.android.kt */
/* loaded from: classes11.dex */
public final class va2 implements fg90 {
    public final Paint a;
    public int b;
    public Shader c;
    public d6g d;
    public db2 e;

    public va2(Paint paint) {
        this.a = paint;
        this.b = 3;
    }

    @Override // xsna.fg90
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // xsna.fg90
    public final void b(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // xsna.fg90
    public final long c() {
        return f870.c(this.a.getColor());
    }

    @Override // xsna.fg90
    public final void d(long j) {
        this.a.setColor(f870.H(j));
    }

    @Override // xsna.fg90
    public final Shader e() {
        return this.c;
    }

    @Override // xsna.fg90
    public final void f(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final int g() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : wa2.a.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int h() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : wa2.a.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void i(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            paint.setBlendMode(z42.a(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(z42.b(i)));
        }
    }

    public final void j(d6g d6gVar) {
        this.d = d6gVar;
        this.a.setColorFilter(d6gVar != null ? d6gVar.a : null);
    }

    public final void k(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void l(db2 db2Var) {
        this.a.setPathEffect(db2Var != null ? db2Var.a : null);
        this.e = db2Var;
    }

    public final void m(int i) {
        this.a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void n(int i) {
        this.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void o(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void p(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void q(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public va2() {
        this(new Paint(7));
    }
}
