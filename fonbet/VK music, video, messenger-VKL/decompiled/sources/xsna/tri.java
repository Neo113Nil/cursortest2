package xsna;

/* compiled from: Composers.kt */
/* loaded from: classes8.dex */
public final class tri extends rri {
    public final boolean d;

    public tri(lhx lhxVar, boolean z) {
        super(lhxVar);
        this.d = z;
    }

    @Override // xsna.rri
    public final void k(String str) {
        if (this.d) {
            super.k(str);
        } else {
            i(str);
        }
    }
}
