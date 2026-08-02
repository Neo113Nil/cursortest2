package defpackage;

/* loaded from: classes10.dex */
public final class jvu0 extends ram {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public jvu0(int i, int i2, int i3, float f, float f2) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvu0)) {
            return false;
        }
        jvu0 jvu0Var = (jvu0) obj;
        return this.a == jvu0Var.a && this.b == jvu0Var.b && this.c == jvu0Var.c && this.d == jvu0Var.d;
    }

    public final int hashCode() {
        return oyr.b(this.d, oyr.b(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
