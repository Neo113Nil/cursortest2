package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class jje0 implements kje0 {
    public static final ije0 Companion = new ije0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(6))};
    public final Set a;

    public /* synthetic */ jje0(int i, Set set) {
        if (1 == (i & 1)) {
            this.a = set;
        } else {
            qje.Z(i, 1, hje0.a.getDescriptor());
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
        return (obj instanceof jje0) && jl40.l(this.a, ((jje0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.s(new StringBuilder("StringSet(value="), this.a, ')');
    }

    public jje0(Set set) {
        this.a = set;
    }
}
