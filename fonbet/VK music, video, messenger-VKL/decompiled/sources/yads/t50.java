package yads;

import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class t50 {
    public static final s50 Companion = new s50();
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final boolean d;

    public /* synthetic */ t50(int i, boolean z, Boolean bool, Boolean bool2, boolean z2) {
        if (15 != (i & 15)) {
            xsna.sp.x(i, 15, r50.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return this.a == t50Var.a && epx.f(this.b, t50Var.b) && epx.f(this.c, t50Var.c) && this.d == t50Var.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.a + ", ageRestrictedUser=" + this.b + ", hasUserConsent=" + this.c + ", hasCmpValue=" + this.d + ")";
    }

    public t50(boolean z, Boolean bool, Boolean bool2, boolean z2) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = z2;
    }
}
