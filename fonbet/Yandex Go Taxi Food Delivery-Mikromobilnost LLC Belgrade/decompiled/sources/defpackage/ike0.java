package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ike0 implements hle0 {
    public static final hke0 Companion = new hke0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(11))};
    public final String a;
    public final kje0 b;

    public /* synthetic */ ike0(int i, String str, kje0 kje0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gke0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = kje0Var;
    }

    public final String a() {
        return this.a;
    }

    public final kje0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ike0)) {
            return false;
        }
        ike0 ike0Var = (ike0) obj;
        return jl40.l(this.a, ike0Var.a) && jl40.l(this.b, ike0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InSet(argName=" + this.a + ", value=" + this.b + ')';
    }

    public ike0(String str, kje0 kje0Var) {
        this.a = str;
        this.b = kje0Var;
    }
}
