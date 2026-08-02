package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;
import com.airbnb.lottie.utils.a;

/* loaded from: classes10.dex */
public final class bnm implements e35 {
    public final l35 a;
    public final l35 b;
    public final lfc c;
    public final kor d;
    public final kor e;
    public final kor f;
    public final kor g;
    public Matrix h;

    public bnm(l35 l35Var, l35 l35Var2, oo2 oo2Var) {
        this.b = l35Var;
        this.a = l35Var2;
        i35 I = ((ae2) oo2Var.a).I();
        this.c = (lfc) I;
        I.a(this);
        l35Var2.c(I);
        kor I2 = ((be2) oo2Var.b).I();
        this.d = I2;
        I2.a(this);
        l35Var2.c(I2);
        kor I3 = ((be2) oo2Var.c).I();
        this.e = I3;
        I3.a(this);
        l35Var2.c(I3);
        kor I4 = ((be2) oo2Var.w).I();
        this.f = I4;
        I4.a(this);
        l35Var2.c(I4);
        kor I5 = ((be2) oo2Var.x).I();
        this.g = I5;
        I5.a(this);
        l35Var2.c(I5);
    }

    public final a a(Matrix matrix, int i) {
        float m = this.e.m() * 0.017453292f;
        float floatValue = ((Float) this.f.f()).floatValue();
        double d = m;
        float sin = ((float) Math.sin(d)) * floatValue;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.g.f()).floatValue();
        int intValue = ((Integer) this.c.f()).intValue();
        int argb = Color.argb(Math.round((((Float) this.d.f()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        a aVar = new a();
        aVar.a = floatValue2 * 0.33f;
        aVar.b = sin;
        aVar.c = cos;
        aVar.d = argb;
        aVar.e = null;
        aVar.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        aVar.c(this.h);
        return aVar;
    }

    public final void b(puz puzVar) {
        this.c.k(puzVar);
    }

    public final void c(puz puzVar) {
        this.e.k(puzVar);
    }

    @Override // defpackage.e35
    public final void d() {
        this.b.d();
    }

    public final void e(puz puzVar) {
        this.f.k(puzVar);
    }

    public final void f(puz puzVar) {
        kor korVar = this.d;
        if (puzVar == null) {
            korVar.k(null);
        } else {
            korVar.k(new anm(0, puzVar));
        }
    }

    public final void g(puz puzVar) {
        this.g.k(puzVar);
    }
}
