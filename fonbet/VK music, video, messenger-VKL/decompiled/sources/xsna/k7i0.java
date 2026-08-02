package xsna;

import java.util.List;

/* compiled from: SelectGroupVerificationContent.kt */
/* loaded from: classes18.dex */
public final class k7i0 {
    public final List<h8i0> a;
    public final String b;
    public final String c;

    public k7i0(List<h8i0> list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7i0)) {
            return false;
        }
        k7i0 k7i0Var = (k7i0) obj;
        return epx.f(this.a, k7i0Var.a) && epx.f(this.b, k7i0Var.b) && epx.f(this.c, k7i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectGroupVerificationContent(verificationTypes=");
        sb.append(this.a);
        sb.append(", infoLink=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }
}
