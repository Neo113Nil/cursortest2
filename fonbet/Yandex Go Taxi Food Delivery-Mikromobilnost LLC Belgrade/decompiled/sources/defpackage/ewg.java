package defpackage;

/* loaded from: classes2.dex */
public final class ewg implements fwg {
    public final n4u0 a;

    public ewg(n4u0 n4u0Var) {
        this.a = n4u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewg) && jl40.l(this.a, ((ewg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowLogsState(logsFlow=" + this.a + ')';
    }
}
