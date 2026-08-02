package xsna;

/* compiled from: ReorderBlockIdInfo.kt */
/* loaded from: classes16.dex */
public final class ozf0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public ozf0(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozf0)) {
            return false;
        }
        ozf0 ozf0Var = (ozf0) obj;
        return epx.f(this.a, ozf0Var.a) && epx.f(this.b, ozf0Var.b) && epx.f(this.c, ozf0Var.c) && epx.f(this.d, ozf0Var.d) && this.e == ozf0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReorderBlockIdInfo(fromUniqueBlockId=");
        sb.append(this.a);
        sb.append(", toUniqueBlockId=");
        sb.append(this.b);
        sb.append(", fromReorderingUniqueBlockId=");
        sb.append(this.c);
        sb.append(", toReorderingUniqueBlockId=");
        sb.append(this.d);
        sb.append(", directionMove=");
        return vu5.b(sb, this.e, ')');
    }
}
