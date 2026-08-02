package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class plc0 {
    public static final olc0 Companion = new olc0();
    public static final i3y[] f;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new l1b0(28)), a.b(lazyThreadSafetyMode, new l1b0(29)), a.b(lazyThreadSafetyMode, new mlc0(0)), a.b(lazyThreadSafetyMode, new mlc0(1)), a.b(lazyThreadSafetyMode, new mlc0(2))};
    }

    public /* synthetic */ plc0(int i, List list, List list2, List list3, List list4, List list5) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, nlc0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plc0)) {
            return false;
        }
        plc0 plc0Var = (plc0) obj;
        return jl40.l(this.a, plc0Var.a) && jl40.l(this.b, plc0Var.b) && jl40.l(this.c, plc0Var.c) && jl40.l(this.d, plc0Var.d) && jl40.l(this.e, plc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueDefinitionsDto(widgets=");
        sb.append(this.a);
        sb.append(", conditionalPlaques=");
        sb.append(this.b);
        sb.append(", prefetchPlaques=");
        sb.append(this.c);
        sb.append(", defaultPlaques=");
        sb.append(this.d);
        sb.append(", fallbackPlaques=");
        return unr0.t(sb, this.e, ')');
    }

    public plc0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }
}
