package xsna;

/* compiled from: AndroidDensity.android.kt */
/* loaded from: classes11.dex */
public final class ezl implements azl {
    public final float b;
    public final float c;
    public final q5s d;

    public ezl(float f, float f2, q5s q5sVar) {
        this.b = f;
        this.c = f2;
        this.d = q5sVar;
    }

    @Override // xsna.azl
    public final float O0(long j) {
        if (gno0.a(fno0.c(j), 4294967296L)) {
            return this.d.a(fno0.d(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezl)) {
            return false;
        }
        ezl ezlVar = (ezl) obj;
        return Float.compare(this.b, ezlVar.b) == 0 && Float.compare(this.c, ezlVar.c) == 0 && epx.f(this.d, ezlVar.d);
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b;
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    @Override // xsna.azl
    public final long i0(float f) {
        return l2l0.n(this.d.b(f), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.b + ", fontScale=" + this.c + ", converter=" + this.d + ')';
    }
}
