package xsna;

/* compiled from: BookingServiceCategory.kt */
/* loaded from: classes18.dex */
public final class ow7 {
    public final int a;
    public final String b;
    public final int c;

    public ow7(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow7)) {
            return false;
        }
        ow7 ow7Var = (ow7) obj;
        return this.a == ow7Var.a && epx.f(this.b, ow7Var.b) && this.c == ow7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingServiceCategory(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", weight=");
        return vu5.b(sb, this.c, ')');
    }
}
