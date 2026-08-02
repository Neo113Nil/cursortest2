package defpackage;

/* loaded from: classes2.dex */
public final class dmd0 implements hmd0 {
    public final cmd0 a;

    public dmd0(cmd0 cmd0Var) {
        this.a = cmd0Var;
    }

    @Override // defpackage.hmd0
    public final cmd0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmd0) && this.a.equals(((dmd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Frozen(balance=" + this.a + ')';
    }
}
