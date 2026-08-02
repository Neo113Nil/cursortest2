package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class dz50 implements mo50 {
    public static final cz50 Companion = new cz50();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(11)), null};
    public final String a;
    public final List b;
    public final su50 c;

    public /* synthetic */ dz50(int i, String str, List list, su50 su50Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, bz50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = su50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz50)) {
            return false;
        }
        dz50 dz50Var = (dz50) obj;
        return jl40.l(this.a, dz50Var.a) && jl40.l(this.b, dz50Var.b) && jl40.l(this.c, dz50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NetworkRadialGradientModel(type=" + this.a + ", colors=" + this.b + ", centralPoint=" + this.c + ')';
    }
}
