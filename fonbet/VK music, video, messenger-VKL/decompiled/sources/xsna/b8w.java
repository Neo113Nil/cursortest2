package xsna;

import xsna.d8w;

/* compiled from: ImItemsCheckAvailabilityCmd.kt */
/* loaded from: classes2.dex */
public final class b8w extends le6<Boolean> {
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        x7w x7wVar = x7w.g;
        d8w.b bVar = (d8w.b) fo50.v(new d8w(new wy1(x7wVar, x7wVar), 1, false), w2wVar, null, 6);
        return Boolean.valueOf((bVar.f || bVar.g) ? false : true);
    }

    public final boolean equals(Object obj) {
        return obj instanceof b8w;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ImItemsCheckAvailabilityCmd";
    }
}
