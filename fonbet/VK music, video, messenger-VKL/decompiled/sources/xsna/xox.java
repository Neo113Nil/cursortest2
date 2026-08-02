package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;

/* compiled from: Intrinsic.kt */
/* loaded from: classes11.dex */
final class xox extends d730<yox> {
    public final IntrinsicSize a;
    public final boolean b = true;
    public final izs<z5x, s3q0> c;

    public xox(IntrinsicSize intrinsicSize, izs izsVar) {
        this.a = intrinsicSize;
        this.c = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xox xoxVar = obj instanceof xox ? (xox) obj : null;
        return xoxVar != null && this.a == xoxVar.a && this.b == xoxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final yox r() {
        yox yoxVar = new yox();
        yoxVar.p = this.a;
        yoxVar.q = this.b;
        return yoxVar;
    }

    @Override // xsna.d730
    public final void s(yox yoxVar) {
        yox yoxVar2 = yoxVar;
        yoxVar2.p = this.a;
        yoxVar2.q = this.b;
    }
}
