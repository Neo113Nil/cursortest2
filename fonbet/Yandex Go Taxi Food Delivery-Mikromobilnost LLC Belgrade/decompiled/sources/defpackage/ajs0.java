package defpackage;

/* loaded from: classes5.dex */
public final class ajs0 {
    public final int a;
    public final float b;

    static {
        new ajs0(4.0f, 6, 4);
        new ajs0(0.0f, 8, 6);
        new ajs0(6.0f, 10, 4);
    }

    public ajs0(float f, int i, int i2) {
        f = (i2 & 2) != 0 ? 5.0f : f;
        this.a = i;
        this.b = f;
        if (f != 0.0f) {
            return;
        }
        w511.f(x4e.f("mass=", " must be != 0", f));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajs0)) {
            return false;
        }
        ajs0 ajs0Var = (ajs0) obj;
        return this.a == ajs0Var.a && Float.compare(this.b, ajs0Var.b) == 0 && Float.compare(0.2f, 0.2f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.2f) + g8e.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Size(sizeInDp=" + this.a + ", mass=" + this.b + ", massVariance=0.2)";
    }
}
