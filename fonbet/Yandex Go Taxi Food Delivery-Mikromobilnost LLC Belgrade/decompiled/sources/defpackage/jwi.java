package defpackage;

/* loaded from: classes.dex */
public final class jwi implements fwi {
    public final float a;
    public final float b;
    public final dzr c;

    public jwi(float f, float f2, dzr dzrVar) {
        this.a = f;
        this.b = f2;
        this.c = dzrVar;
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return uh6.K(this.c.a(f), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwi)) {
            return false;
        }
        jwi jwiVar = (jwi) obj;
        return Float.compare(this.a, jwiVar.a) == 0 && Float.compare(this.b, jwiVar.b) == 0 && this.c.equals(jwiVar.c);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        if (tty0.a(sty0.b(j), 4294967296L)) {
            return this.c.b(sty0.c(j));
        }
        ny61.r("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.b;
    }
}
