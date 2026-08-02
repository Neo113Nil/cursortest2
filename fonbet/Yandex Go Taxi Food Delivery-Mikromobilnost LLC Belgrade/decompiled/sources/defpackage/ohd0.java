package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ohd0 {
    public final Long a;
    public final String b;
    public final List c;

    public ohd0(Long l, String str, List list) {
        this.a = l;
        this.b = str;
        this.c = list;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final Long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohd0)) {
            return false;
        }
        ohd0 ohd0Var = (ohd0) obj;
        return jl40.l(this.a, ohd0Var.a) && jl40.l(this.b, ohd0Var.b) && jl40.l(this.c, ohd0Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPaymentUser(userId=");
        sb.append(this.a);
        sb.append(", authToken=");
        sb.append(this.b);
        sb.append(", partitions=");
        return unr0.t(sb, this.c, ')');
    }
}
