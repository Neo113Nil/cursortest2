package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class oke0 implements hle0 {
    public static final nke0 Companion = new nke0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(12))};
    public final String a;
    public final uie0 b;

    public /* synthetic */ oke0(int i, String str, uie0 uie0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, mke0.a.getDescriptor());
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
        if (!(obj instanceof oke0)) {
            return false;
        }
        oke0 oke0Var = (oke0) obj;
        return jl40.l(this.a, oke0Var.a) && jl40.l(this.b, oke0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Lesser(argName=" + this.a + ", value=" + this.b + ')';
    }

    public oke0(String str, uie0 uie0Var) {
        this.a = str;
        this.b = uie0Var;
    }
}
