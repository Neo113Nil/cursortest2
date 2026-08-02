package defpackage;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class lxc0 {
    public static final lxc0 d = new lxc0(1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        tw21.Q(0);
        tw21.Q(1);
    }

    public lxc0(float f, float f2) {
        d6z.l(f > 0.0f);
        d6z.l(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final lxc0 a(float f) {
        return new lxc0(f, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lxc0.class == obj.getClass()) {
            lxc0 lxc0Var = (lxc0) obj;
            if (this.a == lxc0Var.a && this.b == lxc0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = tw21.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public lxc0(float f) {
        this(f, 1.0f);
    }
}
