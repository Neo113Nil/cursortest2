package xsna;

import java.util.Set;

/* compiled from: ImItemHistoryGetByIdCmdArgs.kt */
/* loaded from: classes2.dex */
public final class g5w {
    public final Set<b5w> a;
    public final d5w b;

    public g5w(Set<b5w> set, d5w d5wVar) {
        this.a = set;
        this.b = d5wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5w)) {
            return false;
        }
        g5w g5wVar = (g5w) obj;
        return epx.f(this.a, g5wVar.a) && epx.f(this.b, g5wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImItemHistoryGetByIdCmdArgs(updatedIds=" + this.a + ", currentHistory=" + this.b + ')';
    }
}
