package xsna;

import xsna.tlo0;

/* compiled from: CreateMarketItemReviewPatch.kt */
/* loaded from: classes18.dex */
public final class t8k extends s8k {
    public final tlo0.f b;
    public final tlo0.f c;

    public t8k(tlo0.f fVar, tlo0.f fVar2) {
        this.b = fVar;
        this.c = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8k)) {
            return false;
        }
        t8k t8kVar = (t8k) obj;
        return epx.f(this.b, t8kVar.b) && epx.f(this.c, t8kVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b.a) * 31;
        tlo0.f fVar = this.c;
        return hashCode + (fVar == null ? 0 : Integer.hashCode(fVar.a));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(title=");
        sb.append(this.b);
        sb.append(", description=");
        return pr.b(sb, this.c, ')');
    }
}
