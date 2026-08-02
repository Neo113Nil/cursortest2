package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class mt50 {
    public static final lt50 Companion = new lt50();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ic50(15))};
    public final int a;
    public final int b;
    public final List c;

    public /* synthetic */ mt50(int i, int i2, int i3, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, kt50.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt50)) {
            return false;
        }
        mt50 mt50Var = (mt50) obj;
        return this.a == mt50Var.a && this.b == mt50Var.b && jl40.l(this.c, mt50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExperimentModel(testId=");
        sb.append(this.a);
        sb.append(", bucketId=");
        sb.append(this.b);
        sb.append(", flags=");
        return unr0.t(sb, this.c, ')');
    }
}
