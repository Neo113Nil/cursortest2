package xsna;

import android.graphics.Matrix;

/* compiled from: GeometryState.kt */
/* loaded from: classes4.dex */
public final class tnt implements flp0 {
    public final float a;
    public final float b;
    public boolean c;
    public final float d;
    public float e;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float f = 5.0f;
    public float g = 1.0f;
    public float n = 1.0f;
    public final Matrix o = new Matrix();

    static {
        new fs20();
    }

    public tnt(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.d = f / f2;
        this.e = f / f2;
    }

    public final void a(float f, float f2, float f3) {
        this.o.postScale(f, f, f2, f3);
        this.g *= f;
    }

    @Override // xsna.flp0
    public final Matrix b() {
        Matrix matrix = new Matrix();
        matrix.set(this.o);
        return matrix;
    }

    public final void c(float f, float f2) {
        this.o.postTranslate(f, f2);
        this.j += f;
        this.k += f2;
    }

    public final void d(tnt tntVar) {
        this.n = tntVar.n;
        this.g = tntVar.g;
        this.h = tntVar.h;
        this.i = tntVar.i;
        this.o.set(tntVar.o);
        this.j = tntVar.j;
        this.k = tntVar.k;
        this.e = tntVar.e;
        this.f = tntVar.f;
        this.m = tntVar.m;
        this.l = tntVar.l;
        this.c = tntVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tnt.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tnt tntVar = (tnt) obj;
        if (this.a == tntVar.a && this.b == tntVar.b && this.d == tntVar.d && this.f == tntVar.f && this.g == tntVar.g && this.h == tntVar.h) {
            float f = 360;
            return this.i % f == tntVar.i % f && this.j == tntVar.j && this.k == tntVar.k && this.l == tntVar.l && this.m == tntVar.m && epx.f(this.o, tntVar.o) && this.n == tntVar.n && this.c == tntVar.c;
        }
        return false;
    }

    @Override // xsna.flp0
    public final float getHeight() {
        return this.b;
    }

    @Override // xsna.flp0
    public final float getWidth() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.n, (this.o.hashCode() + ((((io.reactivex.rxjava3.subjects.b.a(this.k, io.reactivex.rxjava3.subjects.b.a(this.j, (Float.hashCode(this.i % 360) + io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31)) * 31, 31), 31) + this.l) * 31) + this.m) * 31)) * 31, 31);
    }
}
