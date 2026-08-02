package xsna;

/* compiled from: CalendarModel.kt */
/* loaded from: classes11.dex */
public final class rz8 implements Comparable<rz8> {
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public rz8(int i, int i2, int i3, long j) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(rz8 rz8Var) {
        return epx.h(this.e, rz8Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz8)) {
            return false;
        }
        rz8 rz8Var = (rz8) obj;
        return this.b == rz8Var.b && this.c == rz8Var.c && this.d == rz8Var.d && this.e == rz8Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.b);
        sb.append(", month=");
        sb.append(this.c);
        sb.append(", dayOfMonth=");
        sb.append(this.d);
        sb.append(", utcTimeMillis=");
        return vu5.a(')', this.e, sb);
    }
}
