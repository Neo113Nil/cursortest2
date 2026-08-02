package xsna;

import xsna.tlo0;

/* compiled from: VoipGroupHeaderItem.kt */
/* loaded from: classes7.dex */
public final class now0 implements hfz {
    public final tlo0.f b;
    public final tlo0.f c;

    public now0(tlo0.f fVar, tlo0.f fVar2) {
        this.b = fVar;
        this.c = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof now0)) {
            return false;
        }
        now0 now0Var = (now0) obj;
        return this.b.equals(now0Var.b) && this.c.equals(now0Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + (Integer.hashCode(this.b.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipGroupHeaderItem(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return pr.b(sb, this.c, ')');
    }
}
