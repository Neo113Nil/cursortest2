package defpackage;

/* loaded from: classes11.dex */
public final class ky00 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky00)) {
            return false;
        }
        ky00 ky00Var = (ky00) obj;
        return Float.compare(this.a, ky00Var.a) == 0 && Float.compare(this.b, ky00Var.b) == 0 && Float.compare(this.c, ky00Var.c) == 0 && Float.compare(this.d, ky00Var.d) == 0 && Float.compare(this.e, ky00Var.e) == 0 && Float.compare(this.f, ky00Var.f) == 0 && Float.compare(this.g, ky00Var.g) == 0 && Float.compare(this.h, ky00Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + g8e.c(this.g, g8e.c(this.f, g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particle(cx=");
        sb.append(this.a);
        sb.append(", cy=");
        sb.append(this.b);
        sb.append(", radius=");
        sb.append(this.c);
        sb.append(", vx=");
        sb.append(this.d);
        sb.append(", vy=");
        sb.append(this.e);
        sb.append(", angularVel=");
        sb.append(this.f);
        sb.append(", lifetimeMs=");
        sb.append(this.g);
        sb.append(", ageMs=");
        return n.n(sb, this.h, ')');
    }
}
