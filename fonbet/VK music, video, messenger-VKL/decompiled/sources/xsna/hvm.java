package xsna;

/* compiled from: DialogsPromoLinkReadCmd.kt */
/* loaded from: classes2.dex */
public final class hvm extends le6<s3q0> {
    public final String b;

    public hvm(String str) {
        this.b = str;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        bz2.c(new gvm(this.b), "DialogsPromoLinkGetApiCmd");
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvm) && epx.f(this.b, ((hvm) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ho8.a(new StringBuilder("DialogsPromoLinkReadCmd(id="), this.b, ')');
    }
}
