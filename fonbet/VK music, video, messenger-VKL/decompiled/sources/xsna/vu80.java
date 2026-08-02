package xsna;

/* compiled from: OrderInfo.kt */
/* loaded from: classes6.dex */
public final class vu80 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public vu80(int i, boolean z, String str, boolean z2, String str2) {
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu80)) {
            return false;
        }
        vu80 vu80Var = (vu80) obj;
        return epx.f(this.a, vu80Var.a) && epx.f(this.b, vu80Var.b) && this.c == vu80Var.c && this.d == vu80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderInfo(type=");
        sb.append(this.a);
        sb.append(", item=");
        sb.append(this.b);
        sb.append(", instantFlow=");
        sb.append(this.c);
        sb.append(", hideSuccessMessage=");
        return n23.b(sb, this.d, ", orderId=0)");
    }
}
