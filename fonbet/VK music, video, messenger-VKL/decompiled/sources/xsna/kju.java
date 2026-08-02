package xsna;

/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class kju {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public kju(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kju)) {
            return false;
        }
        kju kjuVar = (kju) obj;
        return epx.f(this.a, kjuVar.a) && epx.f(this.b, kjuVar.b) && this.c == kjuVar.c && this.d == kjuVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberCount(activity=");
        sb.append(this.a);
        sb.append(", formatted=");
        sb.append(this.b);
        sb.append(", members=");
        sb.append(this.c);
        sb.append(", withVkPay=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
