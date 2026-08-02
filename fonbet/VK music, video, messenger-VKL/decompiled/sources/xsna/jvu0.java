package xsna;

/* compiled from: VkFlushEventData.kt */
/* loaded from: classes5.dex */
public final class jvu0 {
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final int f;

    public jvu0(int i, String str, String str2, long j, String str3, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvu0)) {
            return false;
        }
        jvu0 jvu0Var = (jvu0) obj;
        return this.a == jvu0Var.a && epx.f(this.b, jvu0Var.b) && epx.f(this.c, jvu0Var.c) && this.d == jvu0Var.d && epx.f(this.e, jvu0Var.e) && this.f == jvu0Var.f;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.f) + urd0.a(bh10.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkFlushEventData(id=");
        sb.append(this.a);
        sb.append(", eventTypeId=");
        sb.append(this.b);
        sb.append(", schemaVersion=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.d);
        sb.append(", data=");
        sb.append(this.e);
        sb.append(", size=");
        return vu5.b(sb, this.f, ')');
    }
}
