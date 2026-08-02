package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class m40 {
    public static final l40 Companion = new l40();
    public static final KSerializer[] c = {new xsna.yk3(s40.a), new xsna.yk3(f40.a)};
    public final List a;
    public final List b;

    public /* synthetic */ m40(int i, List list, List list2) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, k40.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return epx.f(this.a, m40Var.a) && epx.f(this.b, m40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.a + ", bidding=" + this.b + ")";
    }
}
