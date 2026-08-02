package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class gje0 implements kje0 {
    public static final fje0 Companion = new fje0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(5))};
    public final Set a;

    public /* synthetic */ gje0(int i, Set set) {
        if (1 == (i & 1)) {
            this.a = set;
        } else {
            qje.Z(i, 1, eje0.a.getDescriptor());
            throw null;
        }
    }

    public final Set a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gje0) && jl40.l(this.a, ((gje0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.s(new StringBuilder("Ints(value="), this.a, ')');
    }

    public gje0(Set set) {
        this.a = set;
    }
}
