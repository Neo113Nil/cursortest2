package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class c8f0 {
    public static final b8f0 Companion = new b8f0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(12))};
    public final String a;
    public final List b;

    public /* synthetic */ c8f0(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, a8f0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8f0)) {
            return false;
        }
        c8f0 c8f0Var = (c8f0) obj;
        return jl40.l(this.a, c8f0Var.a) && jl40.l(this.b, c8f0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Period(duration=");
        sb.append(this.a);
        sb.append(", prices=");
        return unr0.t(sb, this.b, ')');
    }
}
