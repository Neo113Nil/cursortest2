package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class i8d0 {
    public static final h8d0 Companion = new h8d0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(14))};
    public final String a;
    public final Set b;

    public /* synthetic */ i8d0(int i, String str, Set set) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, g8d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8d0)) {
            return false;
        }
        i8d0 i8d0Var = (i8d0) obj;
        return jl40.l(this.a, i8d0Var.a) && jl40.l(this.b, i8d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetAndFeatures(target=");
        sb.append(this.a);
        sb.append(", features=");
        return qv10.s(sb, this.b, ')');
    }

    public i8d0(String str, Set set) {
        this.a = str;
        this.b = set;
    }
}
