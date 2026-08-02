package xsna;

import java.util.Collection;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class m5w {
    public static final bpn0 c = new bpn0(new l9(13));
    public final d5w a;
    public final Collection<b5w> b;

    public m5w(d5w d5wVar, Collection<b5w> collection) {
        this.a = d5wVar;
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5w)) {
            return false;
        }
        m5w m5wVar = (m5w) obj;
        return epx.f(this.a, m5wVar.a) && epx.f(this.b, m5wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemHistoryUpdate(history=");
        sb.append(this.a);
        sb.append(", deletions=");
        return l4.h(sb, this.b, ')');
    }
}
