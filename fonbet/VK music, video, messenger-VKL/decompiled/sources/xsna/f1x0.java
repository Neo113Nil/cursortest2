package xsna;

/* compiled from: VoipShareCallCalendarInfo.kt */
/* loaded from: classes7.dex */
public final class f1x0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final Long g;
    public final String h;

    public f1x0(String str, String str2, String str3, boolean z, long j, long j2, Long l, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = l;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1x0)) {
            return false;
        }
        f1x0 f1x0Var = (f1x0) obj;
        return epx.f(this.a, f1x0Var.a) && epx.f(this.b, f1x0Var.b) && epx.f(this.c, f1x0Var.c) && this.d == f1x0Var.d && this.e == f1x0Var.e && this.f == f1x0Var.f && epx.f(this.g, f1x0Var.g) && epx.f(this.h, f1x0Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int a2 = bh10.a(bh10.a(qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Long l = this.g;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.h;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipShareCallCalendarInfo(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", recurrenceRule=");
        sb.append(this.c);
        sb.append(", isAllDay=");
        sb.append(this.d);
        sb.append(", startTimeInMills=");
        sb.append(this.e);
        sb.append(", endTimeInMills=");
        sb.append(this.f);
        sb.append(", eventId=");
        sb.append(this.g);
        sb.append(", link=");
        return ho8.a(sb, this.h, ')');
    }
}
