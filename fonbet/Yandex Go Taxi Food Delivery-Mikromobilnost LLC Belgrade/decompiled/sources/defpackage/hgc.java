package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class hgc {
    public static final ggc Companion = new ggc();
    public final String a;
    public final Integer b;
    public final double c;

    public /* synthetic */ hgc(int i, String str, Integer num, double d) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, fgc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = d;
    }

    public final String a() {
        return this.a;
    }

    public final double b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgc)) {
            return false;
        }
        hgc hgcVar = (hgc) obj;
        return jl40.l(this.a, hgcVar.a) && jl40.l(this.b, hgcVar.b) && Double.compare(this.c, hgcVar.c) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Double.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorDto(color=");
        sb.append(this.a);
        sb.append(", opacity=");
        sb.append(this.b);
        sb.append(", position=");
        return unr0.q(sb, this.c, ')');
    }

    public hgc(String str, Integer num, double d) {
        this.a = str;
        this.b = num;
        this.c = d;
    }
}
