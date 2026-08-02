package xsna;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import xsna.y8g;

/* compiled from: RectPointBrush.kt */
/* loaded from: classes4.dex */
public final class gif0 implements lmb0, w980 {
    public kif0 a;
    public float b;
    public float c;
    public final y8g d;
    public final float e;
    public final float f;
    public final boolean g;
    public final Paint h;
    public final Path i;
    public final Path j;
    public final Matrix k;
    public final RectF l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gif0(kif0 kif0Var, y8g.c cVar, float f) {
        this(kif0Var, r4, r4, cVar, f, -60.0f, true);
        float f2 = kif0Var.a / 2.0f;
    }

    @Override // xsna.al8
    public final boolean b() {
        return false;
    }

    @Override // xsna.lmb0
    public final void c(mlo mloVar, List<glb0> list) {
        mloVar.b(new g22(29, this, list));
    }

    @Override // xsna.lmb0
    public final gif0 copy() {
        return new gif0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // xsna.w980
    public final void d(Matrix matrix) {
        float min = Math.min(nn10.d(matrix), nn10.e(matrix));
        kif0 kif0Var = this.a;
        this.a = new kif0(kif0Var.a * min, kif0Var.b * min);
        this.b *= min;
        this.c *= min;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gif0)) {
            return false;
        }
        gif0 gif0Var = (gif0) obj;
        return epx.f(this.a, gif0Var.a) && Float.compare(this.b, gif0Var.b) == 0 && Float.compare(this.c, gif0Var.c) == 0 && epx.f(this.d, gif0Var.d) && Float.compare(this.e, gif0Var.e) == 0 && Float.compare(this.f, gif0Var.f) == 0 && this.g == gif0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, (this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        kif0 kif0Var = this.a;
        float f = this.b;
        float f2 = this.c;
        StringBuilder sb = new StringBuilder("RectPointBrush(size=");
        sb.append(kif0Var);
        sb.append(", radiusX=");
        sb.append(f);
        sb.append(", radiusY=");
        sb.append(f2);
        sb.append(", color=");
        sb.append(this.d);
        sb.append(", alpha=");
        gq.h(sb, this.e, ", rotation=", this.f, ", fill=");
        return n23.b(sb, this.g, ")");
    }

    public gif0(kif0 kif0Var, float f, float f2, y8g y8gVar, float f3, float f4, boolean z) {
        this.a = kif0Var;
        this.b = f;
        this.c = f2;
        this.d = y8gVar;
        this.e = f3;
        this.f = f4;
        this.g = z;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        ig90.a(paint, y8gVar);
        paint.setStyle(z ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setAlpha(an10.b(255 * f3));
        this.h = paint;
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = new RectF();
    }
}
