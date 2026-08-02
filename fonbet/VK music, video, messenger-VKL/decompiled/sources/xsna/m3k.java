package xsna;

import xsna.tlo0;

/* compiled from: CoverViewState.kt */
/* loaded from: classes7.dex */
public final class m3k {
    public final u2k a;
    public final tlo0.h b;
    public final tlo0 c;

    public m3k(u2k u2kVar, tlo0.h hVar, tlo0 tlo0Var) {
        this.a = u2kVar;
        this.b = hVar;
        this.c = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3k)) {
            return false;
        }
        m3k m3kVar = (m3k) obj;
        return epx.f(this.a, m3kVar.a) && this.b.equals(m3kVar.b) && this.c.equals(m3kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u11.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoverViewState(coverImage=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", durationTalkback=");
        return bt.a(sb, this.c, ')');
    }
}
