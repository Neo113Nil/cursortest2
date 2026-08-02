package defpackage;

/* loaded from: classes10.dex */
public final class cif0 {
    public static final cif0 c = new cif0(0.0f, new r5c(0.0f, 0.0f));
    public final float a;
    public final r5c b;

    public cif0(float f, r5c r5cVar) {
        this.a = f;
        this.b = r5cVar;
        if (Float.isNaN(f)) {
            ny61.g("current must not be NaN");
            throw null;
        }
    }

    public final float a() {
        return this.a;
    }

    public final s5c b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cif0)) {
            return false;
        }
        cif0 cif0Var = (cif0) obj;
        return this.a == cif0Var.a && jl40.l(this.b, cif0Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
