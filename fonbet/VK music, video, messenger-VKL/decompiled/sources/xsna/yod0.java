package xsna;

import xsna.tlo0;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class yod0 extends vcr {
    public final tlo0.f e;

    public yod0(tlo0.f fVar) {
        super(10, null, null);
        this.e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yod0) && this.e.equals(((yod0) obj).e);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e.a);
    }

    public final String toString() {
        return pr.b(new StringBuilder("ProductHeaderFilterItem(title="), this.e, ')');
    }
}
