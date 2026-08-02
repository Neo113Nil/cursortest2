package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class pt50 {
    public static final ot50 Companion = new ot50();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final String c;
    public final String d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new ic50(16)), a.b(lazyThreadSafetyMode, new ic50(17)), null, null};
    }

    public /* synthetic */ pt50(int i, List list, List list2, String str, String str2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, nt50.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt50)) {
            return false;
        }
        pt50 pt50Var = (pt50) obj;
        return jl40.l(this.a, pt50Var.a) && jl40.l(this.b, pt50Var.b) && jl40.l(this.c, pt50Var.c) && jl40.l(this.d, pt50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExperimentsModel(experiments=");
        sb.append(this.a);
        sb.append(", triggeredExperiments=");
        sb.append(this.b);
        sb.append(", testIds=");
        sb.append(this.c);
        sb.append(", triggeredTestIds=");
        return b64.p(sb, this.d, ')');
    }
}
