package xsna;

/* compiled from: SequenceEntity.kt */
/* loaded from: classes5.dex */
public final class xki0 {
    public static final xki0 c = new xki0("null_sequence", -1);
    public final String a;
    public final int b;

    public xki0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xki0)) {
            return false;
        }
        xki0 xki0Var = (xki0) obj;
        return epx.f(this.a, xki0Var.a) && this.b == xki0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SequenceEntity(id=");
        sb.append(this.a);
        sb.append(", nextValue=");
        return vu5.b(sb, this.b, ')');
    }
}
