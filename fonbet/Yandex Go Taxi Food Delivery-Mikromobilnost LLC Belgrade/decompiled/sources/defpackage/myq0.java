package defpackage;

@gsq0
/* loaded from: classes.dex */
public final class myq0 {
    public static final lyq0 Companion = new lyq0();
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public /* synthetic */ myq0(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, kyq0.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myq0)) {
            return false;
        }
        myq0 myq0Var = (myq0) obj;
        return jl40.l(this.a, myq0Var.a) && jl40.l(this.b, myq0Var.b) && jl40.l(this.c, myq0Var.c) && jl40.l(this.d, myq0Var.d) && jl40.l(this.e, myq0Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionConfigs(sessionsEnabled=");
        sb.append(this.a);
        sb.append(", sessionSamplingRate=");
        sb.append(this.b);
        sb.append(", sessionTimeoutSeconds=");
        sb.append(this.c);
        sb.append(", cacheDurationSeconds=");
        sb.append(this.d);
        sb.append(", cacheUpdatedTimeSeconds=");
        return qv10.q(sb, this.e, ')');
    }

    public myq0(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
