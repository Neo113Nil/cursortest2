package xsna;

import android.graphics.BlurMaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import xsna.y8g;

/* compiled from: GlowPathBrush.kt */
/* loaded from: classes4.dex */
public final class t2u implements cq90, w980 {
    public final y8g a;
    public final y8g b;
    public float c;
    public float d;
    public float e;
    public final float f;
    public final Paint.Style g;
    public final Paint.Join h;
    public final Paint.Cap i;
    public final Paint j;
    public final Paint k;

    public /* synthetic */ t2u(y8g y8gVar, y8g.c cVar, float f, float f2, float f3) {
        this(y8gVar, cVar, f, f2, f3, 1.0f, Paint.Style.STROKE, Paint.Join.ROUND, Paint.Cap.ROUND);
    }

    @Override // xsna.cq90
    public final void a(mlo mloVar, Path path) {
        mloVar.b(new bv1(14, this, path));
    }

    @Override // xsna.al8
    public final boolean b() {
        return false;
    }

    @Override // xsna.cq90
    public final cq90 copy() {
        return new t2u(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // xsna.w980
    public final void d(Matrix matrix) {
        this.c = Math.min(nn10.d(matrix), nn10.e(matrix)) * this.c;
        this.d = Math.min(nn10.d(matrix), nn10.e(matrix)) * this.d;
        this.e = Math.min(nn10.d(matrix), nn10.e(matrix)) * this.e;
        this.j.setStrokeWidth(this.c);
        float f = this.d;
        Paint paint = this.k;
        paint.setStrokeWidth(f);
        paint.setMaskFilter(new BlurMaskFilter(this.e, BlurMaskFilter.Blur.NORMAL));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2u)) {
            return false;
        }
        t2u t2uVar = (t2u) obj;
        return epx.f(this.a, t2uVar.a) && epx.f(this.b, t2uVar.b) && Float.compare(this.c, t2uVar.c) == 0 && Float.compare(this.d, t2uVar.d) == 0 && Float.compare(this.e, t2uVar.e) == 0 && Float.compare(this.f, t2uVar.f) == 0 && this.g == t2uVar.g && this.h == t2uVar.h && this.i == t2uVar.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        float f = this.c;
        float f2 = this.d;
        float f3 = this.e;
        StringBuilder sb = new StringBuilder("GlowPathBrush(color=");
        sb.append(this.a);
        sb.append(", glowColor=");
        sb.append(this.b);
        sb.append(", strokeWidth=");
        gq.h(sb, f, ", glowStrokeWidth=", f2, ", glowBlurRadius=");
        gq.h(sb, f3, ", alpha=", this.f, ", style=");
        sb.append(this.g);
        sb.append(", join=");
        sb.append(this.h);
        sb.append(", cap=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public t2u(y8g y8gVar, y8g y8gVar2, float f, float f2, float f3, float f4, Paint.Style style, Paint.Join join, Paint.Cap cap) {
        this.a = y8gVar;
        this.b = y8gVar2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = style;
        this.h = join;
        this.i = cap;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeWidth(this.c);
        paint.setStyle(style);
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
        float f5 = 255;
        paint.setAlpha(an10.b(f5 * f4));
        this.j = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setStrokeWidth(this.d);
        paint2.setStyle(style);
        if (y8gVar2 instanceof y8g.c) {
            paint2.setColor(((y8g.c) y8gVar2).a);
        } else if (!(y8gVar2 instanceof y8g.b)) {
            paint2.setColor(0);
            paint2.setShader(null);
        } else {
            throw null;
        }
        paint2.setMaskFilter(new BlurMaskFilter(this.e, BlurMaskFilter.Blur.NORMAL));
        paint2.setAlpha(an10.b(f5 * f4));
        this.k = paint2;
    }
}
