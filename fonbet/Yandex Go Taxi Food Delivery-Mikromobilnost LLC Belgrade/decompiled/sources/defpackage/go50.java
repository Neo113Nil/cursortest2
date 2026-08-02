package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class go50 implements ry50 {
    public static final fo50 Companion = new fo50();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(10))};
    public final String a;
    public final List b;

    public /* synthetic */ go50(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, eo50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go50)) {
            return false;
        }
        go50 go50Var = (go50) obj;
        return jl40.l(this.a, go50Var.a) && jl40.l(this.b, go50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkAllOfPredicateModel(type=");
        sb.append(this.a);
        sb.append(", predicateIndexes=");
        return unr0.t(sb, this.b, ')');
    }
}
