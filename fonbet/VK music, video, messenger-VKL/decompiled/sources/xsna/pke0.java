package xsna;

/* compiled from: PushToken.kt */
/* loaded from: classes5.dex */
public final class pke0 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;

    public pke0(long j, String str, String str2, long j2, Long l, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = l;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pke0)) {
            return false;
        }
        pke0 pke0Var = (pke0) obj;
        return this.a == pke0Var.a && epx.f(this.b, pke0Var.b) && epx.f(this.c, pke0Var.c) && this.d == pke0Var.d && epx.f(this.e, pke0Var.e) && this.f == pke0Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = bh10.a(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushToken(packageId=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", projectId=");
        sb.append(this.c);
        sb.append(", createdAt=");
        sb.append(this.d);
        sb.append(", invalidatedAt=");
        sb.append(this.e);
        sb.append(", testToken=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
