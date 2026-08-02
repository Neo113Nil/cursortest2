package defpackage;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class gc61 {
    public final String a;
    public final double b;
    public final double c;

    public gc61(String str, double d, double d2) {
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final double a() {
        return this.c;
    }

    public final double b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !gc61.class.equals(obj.getClass())) {
            return false;
        }
        return Objects.equals(this.a, ((gc61) obj).a);
    }

    public final int hashCode() {
        return xtb1.d(this.a);
    }

    public final String toString() {
        return "ZeroKilometerResponse{mcc='" + this.a + "', lon=" + this.b + ", lat=" + this.c + "}";
    }
}
