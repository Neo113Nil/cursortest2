package xsna;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class pml {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public pml(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final wh50 a(boolean z, boolean z2, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1575395620);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1575395620, i, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1191)");
        }
        wh50 f = bo.f(0, z ? z2 ? this.c : this.d : z2 ? this.e : this.f, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pml.class != obj.getClass()) {
            return false;
        }
        pml pmlVar = (pml) obj;
        return l5g.d(this.a, pmlVar.a) && l5g.d(this.b, pmlVar.b) && l5g.d(this.c, pmlVar.c) && l5g.d(this.d, pmlVar.d) && l5g.d(this.e, pmlVar.e) && l5g.d(this.f, pmlVar.f) && l5g.d(this.g, pmlVar.g) && l5g.d(this.h, pmlVar.h) && l5g.d(this.i, pmlVar.i) && l5g.d(this.j, pmlVar.j);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.j) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
