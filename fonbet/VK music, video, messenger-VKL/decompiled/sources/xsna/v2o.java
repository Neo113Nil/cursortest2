package xsna;

/* compiled from: DonutSubscription.kt */
/* loaded from: classes18.dex */
public final class v2o {
    public final c1o a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public v2o(c1o c1oVar, String str, String str2, String str3, int i, boolean z) {
        this.a = c1oVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2o)) {
            return false;
        }
        v2o v2oVar = (v2o) obj;
        return epx.f(this.a, v2oVar.a) && epx.f(this.b, v2oVar.b) && epx.f(this.c, v2oVar.c) && epx.f(this.d, v2oVar.d) && this.e == v2oVar.e && this.f == v2oVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.f) + shy.a(this.e, (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutSubscription(profile=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", paymentLink=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", nextPaymentDate=");
        sb.append(this.e);
        sb.append(", isSecondary=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
