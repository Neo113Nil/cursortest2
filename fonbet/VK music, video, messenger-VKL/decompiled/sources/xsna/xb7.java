package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: BitmapElement.kt */
/* loaded from: classes4.dex */
public final class xb7 implements skp0, uap, kc80, jio, x980 {
    public final String a;
    public final Bitmap b;
    public final Object c;
    public final Paint d;
    public final Matrix e;
    public final Matrix f;
    public final hif0 g;
    public final kif0 h;
    public kif0 i;

    public xb7(String str, Bitmap bitmap, kif0 kif0Var, Object obj) {
        this.a = str;
        this.b = bitmap;
        this.c = obj;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.d = paint;
        this.e = new Matrix();
        this.f = new Matrix();
        hif0 hif0Var = new hif0(0);
        edi.z(hif0Var, kif0Var);
        this.g = hif0Var;
        this.h = kif0Var;
        this.i = kif0Var;
        h();
    }

    @Override // xsna.jio
    public final void a(mlo mloVar) {
        mloVar.b(new x7(this, 12));
    }

    @Override // xsna.kc80
    public final boolean b(MotionEvent motionEvent) {
        h();
        return ine0.j(this.g.f, motionEvent.getX(), motionEvent.getY());
    }

    @Override // xsna.skp0
    public final Matrix c() {
        return this.e;
    }

    @Override // xsna.uap
    public final uap copy() {
        xb7 xb7Var = new xb7(this.a, this.b, kif0.a(this.h), this.c);
        xb7Var.e.set(this.e);
        xb7Var.f.set(this.f);
        return xb7Var;
    }

    @Override // xsna.x980
    public final void d(Matrix matrix) {
        this.e.postConcat(matrix);
        h();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xb7)) {
            return false;
        }
        xb7 xb7Var = (xb7) obj;
        if (!epx.f(this.a, xb7Var.a)) {
            return false;
        }
        h();
        kif0 kif0Var = this.i;
        xb7Var.h();
        if (!epx.f(kif0Var, xb7Var.i)) {
            return false;
        }
        h();
        xb7Var.h();
        return epx.f(this.g, xb7Var.g) && epx.f(this.e, xb7Var.e) && epx.f(this.f, xb7Var.f);
    }

    @Override // xsna.uap
    public final Object getMeta() {
        return this.c;
    }

    public final void h() {
        kif0 kif0Var = this.h;
        hif0 hif0Var = this.g;
        edi.z(hif0Var, kif0Var);
        float[] a = hif0Var.a();
        this.e.mapPoints(a);
        edi.A(hif0Var, a);
        this.i = edi.D(hif0Var);
    }

    @Override // xsna.uap
    public final int hashCode() {
        int hashCode = (this.h.hashCode() + urd0.a(super.hashCode() * 31, 31, this.a)) * 31;
        h();
        return this.f.hashCode() + ((this.e.hashCode() + ((this.g.hashCode() + hashCode) * 31)) * 31);
    }
}
