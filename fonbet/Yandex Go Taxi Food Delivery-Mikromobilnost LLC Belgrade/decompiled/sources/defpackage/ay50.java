package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ay50 {
    public static final zx50 Companion = new zx50();
    public static final i3y[] f;
    public final o060 a;
    public final List b;
    public final o060 c;
    public final o060 d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new ew50(5)), null, null, a.b(lazyThreadSafetyMode, new ew50(6))};
    }

    public /* synthetic */ ay50(int i, o060 o060Var, List list, o060 o060Var2, o060 o060Var3, List list2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, yx50.a.getDescriptor());
            throw null;
        }
        this.a = o060Var;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = o060Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = o060Var3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay50)) {
            return false;
        }
        ay50 ay50Var = (ay50) obj;
        return jl40.l(this.a, ay50Var.a) && jl40.l(this.b, ay50Var.b) && jl40.l(this.c, ay50Var.c) && jl40.l(this.d, ay50Var.d) && jl40.l(this.e, ay50Var.e);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        o060 o060Var = this.c;
        int hashCode = (c + (o060Var == null ? 0 : o060Var.hashCode())) * 31;
        o060 o060Var2 = this.d;
        int hashCode2 = (hashCode + (o060Var2 == null ? 0 : o060Var2.hashCode())) * 31;
        List list = this.e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPlaqueDefinitionsModel(defaultPlaque=");
        sb.append(this.a);
        sb.append(", widgets=");
        sb.append(this.b);
        sb.append(", prefetchPlaque=");
        sb.append(this.c);
        sb.append(", fallbackPlaque=");
        sb.append(this.d);
        sb.append(", conditionalPlaques=");
        return unr0.t(sb, this.e, ')');
    }
}
