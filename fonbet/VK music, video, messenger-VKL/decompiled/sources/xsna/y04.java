package xsna;

/* compiled from: AttachCancelDownloadCmd.kt */
/* loaded from: classes2.dex */
public final class y04 extends le6<s3q0> {
    public final int b;

    public y04(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.O0().c(new ns1(this, 3));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y04) && this.b == ((y04) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("AttachCancelDownloadCmd(attachLocalId="), this.b, ')');
    }
}
