package xsna;

/* compiled from: MsgSendConfig.kt */
/* loaded from: classes2.dex */
public final class ly30 implements qnv {
    public static final ly30 f = new ly30(null, null, null, 15);
    public final boolean b;
    public final Long c;
    public final Long d;
    public final Boolean e;

    public ly30() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly30)) {
            return false;
        }
        ly30 ly30Var = (ly30) obj;
        return this.b == ly30Var.b && epx.f(this.c, ly30Var.c) && epx.f(this.d, ly30Var.d) && epx.f(this.e, ly30Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendConfig(silent=");
        sb.append(this.b);
        sb.append(", deleteTtlMs=");
        sb.append(this.c);
        sb.append(", expireTtlMs=");
        sb.append(this.d);
        sb.append(", instantRecord=");
        return tn.a(sb, this.e, ')');
    }

    public ly30(Long l, Long l2, Boolean bool, int i) {
        boolean z = (i & 1) == 0;
        l = (i & 2) != 0 ? null : l;
        l2 = (i & 4) != 0 ? null : l2;
        bool = (i & 8) != 0 ? null : bool;
        this.b = z;
        this.c = l;
        this.d = l2;
        this.e = bool;
    }
}
