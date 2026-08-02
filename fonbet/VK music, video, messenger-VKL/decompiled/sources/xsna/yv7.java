package xsna;

/* compiled from: BookingRecordsScreenPatch.kt */
/* loaded from: classes18.dex */
public final class yv7 implements xv7 {
    public final int b;
    public final cv7 c;

    public yv7(int i, cv7 cv7Var) {
        this.b = i;
        this.c = cv7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv7)) {
            return false;
        }
        yv7 yv7Var = (yv7) obj;
        return this.b == yv7Var.b && epx.f(this.c, yv7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "Complete(page=" + this.b + ", data=" + this.c + ')';
    }
}
