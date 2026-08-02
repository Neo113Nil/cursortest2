package xsna;

import java.util.Collection;
import java.util.Set;
import xsna.uwf;

/* compiled from: ScreenBasedAlgorithmAdapter.java */
/* loaded from: classes13.dex */
public final class lah0<T extends uwf> extends nc implements kah0<T> {
    public final nc c;

    public lah0(nc ncVar) {
        super(0);
        this.c = ncVar;
    }

    @Override // xsna.ys1
    public final void I() {
        this.c.I();
    }

    @Override // xsna.ys1
    public final Set<? extends kwf<T>> K(float f) {
        return this.c.K(f);
    }

    @Override // xsna.ys1
    public final boolean R(T t) {
        return this.c.R(t);
    }

    @Override // xsna.ys1
    public final boolean a(Collection<T> collection) {
        return this.c.a(collection);
    }

    @Override // xsna.ys1
    public final int g() {
        return this.c.g();
    }

    @Override // xsna.ys1
    public final Collection<T> getItems() {
        return this.c.getItems();
    }
}
