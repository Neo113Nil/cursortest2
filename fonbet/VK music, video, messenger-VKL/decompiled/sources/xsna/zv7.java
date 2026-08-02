package xsna;

/* compiled from: BookingRecordsScreenPatch.kt */
/* loaded from: classes18.dex */
public final class zv7 implements xv7 {
    public final int b;
    public final Exception c;

    public zv7(int i, Exception exc) {
        this.b = i;
        this.c = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv7)) {
            return false;
        }
        zv7 zv7Var = (zv7) obj;
        return this.b == zv7Var.b && epx.f(this.c, zv7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "Failed(page=" + this.b + ", error=" + this.c + ')';
    }
}
