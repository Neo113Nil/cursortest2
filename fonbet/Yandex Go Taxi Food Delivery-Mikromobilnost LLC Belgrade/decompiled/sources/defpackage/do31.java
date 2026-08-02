package defpackage;

/* loaded from: classes10.dex */
public final class do31 {
    public static final do31 d = new do31(0, 0, 1.0f);
    public final int a;
    public final int b;
    public final float c;

    static {
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(3);
    }

    public do31(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof do31) {
            do31 do31Var = (do31) obj;
            if (this.a == do31Var.a && this.b == do31Var.b && this.c == do31Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }
}
