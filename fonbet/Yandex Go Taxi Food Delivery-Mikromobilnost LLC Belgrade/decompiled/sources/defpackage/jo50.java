package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class jo50 implements ry50 {
    public static final io50 Companion = new io50();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(11))};
    public final String a;
    public final List b;

    public /* synthetic */ jo50(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ho50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo50)) {
            return false;
        }
        jo50 jo50Var = (jo50) obj;
        return jl40.l(this.a, jo50Var.a) && jl40.l(this.b, jo50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkAnyOfPredicateModel(type=");
        sb.append(this.a);
        sb.append(", predicateIndexes=");
        return unr0.t(sb, this.b, ')');
    }
}
