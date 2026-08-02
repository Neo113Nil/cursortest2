package xsna;

/* compiled from: VkData3DS.kt */
/* loaded from: classes6.dex */
public final class xou0 {
    public final String a;
    public final String b;
    public final String c;

    public xou0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xou0)) {
            return false;
        }
        xou0 xou0Var = (xou0) obj;
        return epx.f(this.a, xou0Var.a) && epx.f(this.b, xou0Var.b) && epx.f(this.c, xou0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkData3DS(md=");
        sb.append(this.a);
        sb.append(", paReq=");
        sb.append(this.b);
        sb.append(", termUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
