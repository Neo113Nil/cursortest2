package xsna;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import xsna.y8g;

/* compiled from: StrokePathBrush.kt */
/* loaded from: classes4.dex */
public final class lrm0 implements cq90, w980 {
    public final y8g a;
    public float b;
    public final float c;
    public final Paint.Style d;
    public final Paint.Join e;
    public final Paint.Cap f;
    public final Paint g;

    public /* synthetic */ lrm0(y8g.c cVar, float f) {
        this(cVar, f, 1.0f, Paint.Style.STROKE, Paint.Join.ROUND, Paint.Cap.ROUND);
    }

    @Override // xsna.cq90
    public final void a(mlo mloVar, Path path) {
        mloVar.b(new mh4(29, path, this));
    }

    @Override // xsna.al8
    public final boolean b() {
        return false;
    }

    @Override // xsna.cq90
    public final cq90 copy() {
        return new lrm0(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.w980
    public final void d(Matrix matrix) {
        float min = Math.min(nn10.d(matrix), nn10.e(matrix)) * this.b;
        this.b = min;
        this.g.setStrokeWidth(min);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrm0)) {
            return false;
        }
        lrm0 lrm0Var = (lrm0) obj;
        return epx.f(this.a, lrm0Var.a) && Float.compare(this.b, lrm0Var.b) == 0 && Float.compare(this.c, lrm0Var.c) == 0 && this.d == lrm0Var.d && this.e == lrm0Var.e && this.f == lrm0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StrokePathBrush(color=" + this.a + ", strokeWidth=" + this.b + ", alpha=" + this.c + ", style=" + this.d + ", join=" + this.e + ", cap=" + this.f + ")";
    }

    public lrm0(y8g y8gVar, float f, float f2, Paint.Style style, Paint.Join join, Paint.Cap cap) {
        this.a = y8gVar;
        this.b = f;
        this.c = f2;
        this.d = style;
        this.e = join;
        this.f = cap;
        Paint paint = new Paint();
        paint.getStrokeWidth();
        paint.getStrokeWidth();
        if (y8gVar instanceof y8g.c) {
            paint.setColor(((y8g.c) y8gVar).a);
        } else if (!(y8gVar instanceof y8g.b)) {
            paint.setColor(0);
            paint.setShader(null);
        } else {
            throw null;
        }
        paint.setAntiAlias(true);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeWidth(this.b);
        paint.setStyle(style);
        paint.setAlpha(an10.b(255 * f2));
        this.g = paint;
    }
}
