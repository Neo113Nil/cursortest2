package defpackage;

/* loaded from: classes2.dex */
public final class fmd0 implements hmd0 {
    public final cmd0 a;

    public fmd0(cmd0 cmd0Var) {
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
        return (obj instanceof fmd0) && this.a.equals(((fmd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoPlus(balance=" + this.a + ')';
    }
}
