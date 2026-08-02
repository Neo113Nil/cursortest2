package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class bzt extends fzt {
    public static final azt Companion = new azt();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(6)), null};
    public final List b;
    public final double c;

    public /* synthetic */ bzt(int i, List list, double d2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, zyt.a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzt)) {
            return false;
        }
        bzt bztVar = (bzt) obj;
        return jl40.l(this.b, bztVar.b) && Double.compare(this.c, bztVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinearGradientResponse(colors=");
        sb.append(this.b);
        sb.append(", angle=");
        return unr0.q(sb, this.c, ')');
    }
}
