package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class pia0 {
    public static final oia0 Companion = new oia0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(15))};
    public final String a;
    public final List b;

    public /* synthetic */ pia0(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, nia0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pia0)) {
            return false;
        }
        pia0 pia0Var = (pia0) obj;
        return jl40.l(this.a, pia0Var.a) && jl40.l(this.b, pia0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(screen=");
        sb.append(this.a);
        sb.append(", invoiceIds=");
        return unr0.t(sb, this.b, ')');
    }

    public pia0(List list) {
        this.a = "SUCCESS";
        this.b = list;
    }
}
