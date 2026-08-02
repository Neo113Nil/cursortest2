package xsna;

/* compiled from: VkBidProfileData.kt */
/* loaded from: classes18.dex */
public final class xeu0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public xeu0(String str, String str2, String str3, long j, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeu0)) {
            return false;
        }
        xeu0 xeu0Var = (xeu0) obj;
        return this.a == xeu0Var.a && epx.f(this.b, xeu0Var.b) && epx.f(this.c, xeu0Var.c) && epx.f(this.d, xeu0Var.d) && this.e == xeu0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkBidProfileData(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", orgTypeId=");
        sb.append(this.c);
        sb.append(", orgTypeName=");
        sb.append(this.d);
        sb.append(", verified=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
