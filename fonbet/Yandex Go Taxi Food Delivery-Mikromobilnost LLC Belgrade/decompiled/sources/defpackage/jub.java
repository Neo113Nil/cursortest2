package defpackage;

/* loaded from: classes11.dex */
public final class jub {
    public final float a;
    public final int b;
    public final Integer c;
    public final Float d;

    public jub(float f, int i, Integer num, Float f2) {
        this.a = f;
        this.b = i;
        this.c = num;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jub)) {
            return false;
        }
        jub jubVar = (jub) obj;
        return Float.compare(this.a, jubVar.a) == 0 && this.b == jubVar.b && jl40.l(this.c, jubVar.c) && jl40.l(this.d, jubVar.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Float.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Params(radius=" + this.a + ", color=" + this.b + ", strokeColor=" + this.c + ", strokeWidth=" + this.d + ')';
    }
}
