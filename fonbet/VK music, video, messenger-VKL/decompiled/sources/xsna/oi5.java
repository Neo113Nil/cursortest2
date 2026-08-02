package xsna;

/* compiled from: AutoPlayTrackingData.kt */
/* loaded from: classes17.dex */
public final class oi5 {
    public final String a;
    public final String b;
    public final String c;

    public oi5() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi5)) {
            return false;
        }
        oi5 oi5Var = (oi5) obj;
        return epx.f(this.a, oi5Var.a) && epx.f(this.b, oi5Var.b) && epx.f(this.c, oi5Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoPlayTrackingData(ref=");
        sb.append(this.a);
        sb.append(", context=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return i5s.a(sb, this.c, ", isAutoPlay=null)");
    }

    public oi5(String str, String str2, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
