package defpackage;

/* loaded from: classes.dex */
public final class oyk0 {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final Integer e;
    public final Float f;

    public oyk0(float f, float f2, int i, float f3, Integer num, Float f4) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
        this.e = num;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyk0)) {
            return false;
        }
        oyk0 oyk0Var = (oyk0) obj;
        return Float.compare(this.a, oyk0Var.a) == 0 && Float.compare(this.b, oyk0Var.b) == 0 && this.c == oyk0Var.c && Float.compare(this.d, oyk0Var.d) == 0 && jl40.l(this.e, oyk0Var.e) && jl40.l(this.f, oyk0Var.f);
    }

    public final int hashCode() {
        int c = g8e.c(this.d, oyr.b(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        Integer num = this.e;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Params(width=" + this.a + ", height=" + this.b + ", color=" + this.c + ", radius=" + this.d + ", strokeColor=" + this.e + ", strokeWidth=" + this.f + ')';
    }
}
