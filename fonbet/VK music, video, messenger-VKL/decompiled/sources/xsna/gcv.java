package xsna;

import xsna.dt1;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class gcv extends d730<hcv> {
    public final dt1.b a;

    public gcv(dt1.b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gcv gcvVar = obj instanceof gcv ? (gcv) obj : null;
        if (gcvVar == null) {
            return false;
        }
        return epx.f(this.a, gcvVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final hcv r() {
        hcv hcvVar = new hcv();
        hcvVar.p = this.a;
        return hcvVar;
    }

    @Override // xsna.d730
    public final void s(hcv hcvVar) {
        hcvVar.p = this.a;
    }
}
