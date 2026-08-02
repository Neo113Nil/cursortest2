package xsna;

/* compiled from: VkFullCardData.kt */
/* loaded from: classes6.dex */
public final class jwu0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public jwu0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwu0)) {
            return false;
        }
        jwu0 jwu0Var = (jwu0) obj;
        return epx.f(this.a, jwu0Var.a) && epx.f(this.b, jwu0Var.b) && epx.f(this.c, jwu0Var.c) && this.d == jwu0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkFullCardData(cvv=");
        sb.append(this.a);
        sb.append(", expirationDate=");
        sb.append(this.b);
        sb.append(", pan=");
        sb.append(this.c);
        sb.append(", addCard=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
