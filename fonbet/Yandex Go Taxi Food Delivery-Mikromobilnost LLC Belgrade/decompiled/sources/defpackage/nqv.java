package defpackage;

import kotlinx.datetime.UtcOffset;

/* loaded from: classes9.dex */
public final class nqv implements aw21, fpe {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public nqv(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.aw21
    public final void A(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.aw21
    public final Integer D() {
        return this.c;
    }

    @Override // defpackage.aw21
    public final Boolean F() {
        return this.a;
    }

    @Override // defpackage.aw21
    public final void a(Integer num) {
        this.c = num;
    }

    public final UtcOffset b() {
        int i = jl40.l(this.a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.b;
        Integer valueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = this.c;
        Integer valueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = this.d;
        return fw21.a(valueOf, valueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i) : null);
    }

    @Override // defpackage.fpe
    public final Object copy() {
        return new nqv(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.aw21
    public final Integer e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nqv)) {
            return false;
        }
        nqv nqvVar = (nqv) obj;
        return jl40.l(this.a, nqvVar.a) && jl40.l(this.b, nqvVar.b) && jl40.l(this.c, nqvVar.c) && jl40.l(this.d, nqvVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.b;
        int hashCode2 = hashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.c;
        int hashCode3 = hashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.aw21
    public final void i(Integer num) {
        this.d = num;
    }

    @Override // defpackage.aw21
    public final Integer q() {
        return this.d;
    }

    @Override // defpackage.aw21
    public final void r(Integer num) {
        this.b = num;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.a;
        sb.append(bool != null ? bool.booleanValue() ? "-" : "+" : " ");
        Object obj = this.b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    public nqv() {
        this(null, null, null, null);
    }
}
