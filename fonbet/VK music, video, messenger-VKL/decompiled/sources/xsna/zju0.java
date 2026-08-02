package xsna;

/* compiled from: VkCheckboxDefaults.kt */
/* loaded from: classes17.dex */
public final class zju0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public zju0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zju0)) {
            return false;
        }
        zju0 zju0Var = (zju0) obj;
        return l5g.d(this.a, zju0Var.a) && l5g.d(this.b, zju0Var.b) && l5g.d(this.c, zju0Var.c) && l5g.d(this.d, zju0Var.d) && l5g.d(this.e, zju0Var.e);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.e) + bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkCheckboxColors(checkedColor=");
        dn.h(this.a, ", uncheckedColor=", sb);
        dn.h(this.b, ", checkmarkColor=", sb);
        dn.h(this.c, ", disabledColor=", sb);
        dn.h(this.d, ", disabledIndeterminateColor=", sb);
        return pm0.d(')', this.e, sb);
    }
}
