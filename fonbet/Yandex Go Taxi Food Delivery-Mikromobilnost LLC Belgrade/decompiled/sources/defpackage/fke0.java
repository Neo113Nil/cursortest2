package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class fke0 implements hle0 {
    public static final eke0 Companion = new eke0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(10))};
    public final String a;
    public final uie0 b;

    public /* synthetic */ fke0(int i, String str, uie0 uie0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dke0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = uie0Var;
    }

    public final String a() {
        return this.a;
    }

    public final uie0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fke0)) {
            return false;
        }
        fke0 fke0Var = (fke0) obj;
        return jl40.l(this.a, fke0Var.a) && jl40.l(this.b, fke0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GreaterOrEqual(argName=" + this.a + ", value=" + this.b + ')';
    }

    public fke0(String str, uie0 uie0Var) {
        this.a = str;
        this.b = uie0Var;
    }
}
