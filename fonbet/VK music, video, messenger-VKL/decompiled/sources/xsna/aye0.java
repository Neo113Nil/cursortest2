package xsna;

import xsna.tlo0;

/* compiled from: RatingFilterItem.kt */
/* loaded from: classes18.dex */
public final class aye0 implements hfz {
    public final tlo0.f b;
    public final boolean c;

    public aye0(tlo0.f fVar, boolean z) {
        this.b = fVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aye0)) {
            return false;
        }
        aye0 aye0Var = (aye0) obj;
        return this.b.equals(aye0Var.b) && this.c == aye0Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingFilterItem(filterName=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
