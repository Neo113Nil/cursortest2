package xsna;

/* compiled from: VkEsiaSignature.kt */
/* loaded from: classes6.dex */
public final class aru0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public aru0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aru0)) {
            return false;
        }
        aru0 aru0Var = (aru0) obj;
        return epx.f(this.a, aru0Var.a) && epx.f(this.b, aru0Var.b) && epx.f(this.c, aru0Var.c) && epx.f(this.d, aru0Var.d) && epx.f(this.e, aru0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkEsiaSignature(timestamp=");
        sb.append(this.a);
        sb.append(", scope=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", secret=");
        sb.append(this.d);
        sb.append(", permissions=");
        return ho8.a(sb, this.e, ')');
    }
}
