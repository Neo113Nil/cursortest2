package xsna;

import xsna.tlo0;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class rgv0 {
    public final tlo0.h a;
    public final tlo0.h b;

    public rgv0(tlo0.h hVar, tlo0.h hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgv0)) {
            return false;
        }
        rgv0 rgv0Var = (rgv0) obj;
        return this.a.equals(rgv0Var.a) && this.b.equals(rgv0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Meta(meta=");
        sb.append(this.a);
        sb.append(", submeta=");
        return jq.c(sb, this.b, ')');
    }
}
