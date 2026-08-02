package defpackage;

/* loaded from: classes2.dex */
public final class bpc0 {
    public final String a;
    public final Integer b;
    public final String c;

    public bpc0(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpc0)) {
            return false;
        }
        bpc0 bpc0Var = (bpc0) obj;
        return this.a.equals(bpc0Var.a) && jl40.l(this.b, bpc0Var.b) && jl40.l(this.c, bpc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContainsPredicate(argName=");
        sb.append(this.a);
        sb.append(", intValue=");
        sb.append(this.b);
        sb.append(", stringValue=");
        return b64.p(sb, this.c, ')');
    }
}
