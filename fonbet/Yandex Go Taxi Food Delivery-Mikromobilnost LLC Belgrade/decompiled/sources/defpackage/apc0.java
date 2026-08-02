package defpackage;

import com.yandex.plus.core.graphql.type.COMPARISON_PREDICATE_TYPE;

/* loaded from: classes2.dex */
public final class apc0 {
    public final COMPARISON_PREDICATE_TYPE a;
    public final String b;
    public final Integer c;
    public final Double d;
    public final String e;

    public apc0(COMPARISON_PREDICATE_TYPE comparison_predicate_type, String str, Integer num, Double d, String str2) {
        this.a = comparison_predicate_type;
        this.b = str;
        this.c = num;
        this.d = d;
        this.e = str2;
    }

    public final String a() {
        return this.b;
    }

    public final Double b() {
        return this.d;
    }

    public final Integer c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final COMPARISON_PREDICATE_TYPE e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apc0)) {
            return false;
        }
        apc0 apc0Var = (apc0) obj;
        return this.a == apc0Var.a && this.b.equals(apc0Var.b) && jl40.l(this.c, apc0Var.c) && jl40.l(this.d, apc0Var.d) && jl40.l(this.e, apc0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.d;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComparisonPredicate(type=");
        sb.append(this.a);
        sb.append(", argName=");
        sb.append(this.b);
        sb.append(", intValue=");
        sb.append(this.c);
        sb.append(", doubleValue=");
        sb.append(this.d);
        sb.append(", stringValue=");
        return b64.p(sb, this.e, ')');
    }
}
