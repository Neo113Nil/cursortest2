package xsna;

/* compiled from: HasNewLocalContactsSetCmd.kt */
/* loaded from: classes2.dex */
public final class quu extends le6<s3q0> {
    public final boolean b = true;

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().w().j(this.b);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quu) && this.b == ((quu) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return defpackage.q0.a(new StringBuilder("HasNewLocalContactsSetCmd(value="), this.b, ')');
    }
}
