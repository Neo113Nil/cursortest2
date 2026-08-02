package defpackage;

/* loaded from: classes3.dex */
public final class dk41 {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public dk41(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk41)) {
            return false;
        }
        dk41 dk41Var = (dk41) obj;
        return this.a == dk41Var.a && jl40.l(this.b, dk41Var.b) && this.c == dk41Var.c && jl40.l(this.d, dk41Var.d) && this.e == dk41Var.e && this.f == dk41Var.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int e = unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + unr0.e((e + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.e);
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
        return unr0.u(sb, this.f, ')');
    }

    public dk41() {
        this(false, null, false, null, false, false);
    }
}
