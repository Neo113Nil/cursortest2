package xsna;

/* compiled from: WebSocketExtensions.kt */
/* loaded from: classes8.dex */
public final class thx0 {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public thx0() {
        this(false, null, false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thx0)) {
            return false;
        }
        thx0 thx0Var = (thx0) obj;
        return this.a == thx0Var.a && epx.f(this.b, thx0Var.b) && this.c == thx0Var.c && epx.f(this.d, thx0Var.d) && this.e == thx0Var.e && this.f == thx0Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        Integer num = this.b;
        int hashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode + i3) * 31;
        Integer num2 = this.d;
        int hashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode2 + i5) * 31;
        boolean z4 = this.f;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public thx0(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }
}
