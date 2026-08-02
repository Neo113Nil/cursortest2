package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class lv50 implements ry50 {
    public static final kv50 Companion = new kv50();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(29))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ lv50(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, jv50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv50)) {
            return false;
        }
        lv50 lv50Var = (lv50) obj;
        return jl40.l(this.a, lv50Var.a) && jl40.l(this.b, lv50Var.b) && jl40.l(this.c, lv50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkInSetPredicateModel(type=");
        sb.append(this.a);
        sb.append(", argName=");
        sb.append(this.b);
        sb.append(", argsSet=");
        return unr0.t(sb, this.c, ')');
    }
}
