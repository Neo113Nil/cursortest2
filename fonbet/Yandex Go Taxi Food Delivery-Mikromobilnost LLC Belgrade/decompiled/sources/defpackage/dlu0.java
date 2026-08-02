package defpackage;

/* loaded from: classes11.dex */
public final class dlu0 extends vgb1 {
    public final String a;
    public final long b;

    public dlu0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlu0)) {
            return false;
        }
        dlu0 dlu0Var = (dlu0) obj;
        return jl40.l(this.a, dlu0Var.a) && this.b == dlu0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerStoredValue(name=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.o(sb, this.b, ')');
    }
}
