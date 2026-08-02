package xsna;

/* compiled from: ResetContactsCmd.kt */
/* loaded from: classes2.dex */
public final class e9g0 extends le6<s3q0> {
    public final boolean b;

    public e9g0() {
        this(3);
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.J0(this, new yhc());
        w2wVar.getConfig().l().V0(this.b);
        w2wVar.J0(this, new jbj(null));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9g0)) {
            return false;
        }
        e9g0 e9g0Var = (e9g0) obj;
        e9g0Var.getClass();
        return this.b == e9g0Var.b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ResetContactsCmd(changerTag=null, submitToBackend="), this.b, ')');
    }

    public e9g0(int i) {
        this.b = (i & 2) != 0;
    }
}
