package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class kw50 implements mo50 {
    public static final jw50 Companion = new jw50();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(3)), null, null};
    public final String a;
    public final List b;
    public final su50 c;
    public final su50 d;

    public /* synthetic */ kw50(int i, String str, List list, su50 su50Var, su50 su50Var2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, iw50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = su50Var;
        this.d = su50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw50)) {
            return false;
        }
        kw50 kw50Var = (kw50) obj;
        return jl40.l(this.a, kw50Var.a) && jl40.l(this.b, kw50Var.b) && jl40.l(this.c, kw50Var.c) && jl40.l(this.d, kw50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "NetworkLinearGradientModel(type=" + this.a + ", colors=" + this.b + ", startPoint=" + this.c + ", endPoint=" + this.d + ')';
    }
}
