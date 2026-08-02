package xsna;

import org.chromium.base.TimeUtils;

/* compiled from: CalendarModel.kt */
/* loaded from: classes11.dex */
public final class zz8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    public zz8(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = ((i3 * TimeUtils.MILLISECONDS_PER_DAY) + j) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz8)) {
            return false;
        }
        zz8 zz8Var = (zz8) obj;
        return this.a == zz8Var.a && this.b == zz8Var.b && this.c == zz8Var.c && this.d == zz8Var.d && this.e == zz8Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", numberOfDays=");
        sb.append(this.c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.d);
        sb.append(", startUtcTimeMillis=");
        return vu5.a(')', this.e, sb);
    }
}
