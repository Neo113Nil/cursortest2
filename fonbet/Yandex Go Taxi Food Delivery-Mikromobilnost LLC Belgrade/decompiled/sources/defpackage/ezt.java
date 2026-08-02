package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ezt extends fzt {
    public static final dzt Companion = new dzt();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(7)), null, null};
    public final List b;
    public final xud0 c;
    public final xud0 d;

    public /* synthetic */ ezt(int i, List list, xud0 xud0Var, xud0 xud0Var2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, czt.a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = xud0Var;
        this.d = xud0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezt)) {
            return false;
        }
        ezt eztVar = (ezt) obj;
        return jl40.l(this.b, eztVar.b) && jl40.l(this.c, eztVar.c) && jl40.l(this.d, eztVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RadialGradientResponse(colors=" + this.b + ", radius=" + this.c + ", center=" + this.d + ')';
    }
}
