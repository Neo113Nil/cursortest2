package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;

/* compiled from: Intrinsic.kt */
/* loaded from: classes11.dex */
final class cpx extends d730<dpx> {
    public final IntrinsicSize a;
    public final boolean b = true;
    public final izs<z5x, s3q0> c;

    public cpx(IntrinsicSize intrinsicSize, izs izsVar) {
        this.a = intrinsicSize;
        this.c = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        cpx cpxVar = obj instanceof cpx ? (cpx) obj : null;
        return cpxVar != null && this.a == cpxVar.a && this.b == cpxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // xsna.d730
    public final dpx r() {
        dpx dpxVar = new dpx();
        dpxVar.p = this.a;
        dpxVar.q = this.b;
        return dpxVar;
    }

    @Override // xsna.d730
    public final void s(dpx dpxVar) {
        dpx dpxVar2 = dpxVar;
        dpxVar2.p = this.a;
        dpxVar2.q = this.b;
    }
}
