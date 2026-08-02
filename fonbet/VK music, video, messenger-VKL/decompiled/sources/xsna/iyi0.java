package xsna;

/* compiled from: SetCollapsedChannelsRecommendationsVersionCmd.kt */
/* loaded from: classes2.dex */
public final class iyi0 extends le6<s3q0> {
    public final int b;

    public iyi0(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.O0().c(new z6u(19));
        uib a = w2wVar.I0().a();
        int N = a.N();
        int i = this.b;
        if (i != N) {
            a.E(i);
            w2wVar.O0().a(new zhb(i, N));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyi0) && this.b == ((iyi0) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("SetCollapsedChannelsRecommendationsVersionCmd(version="), this.b, ')');
    }
}
