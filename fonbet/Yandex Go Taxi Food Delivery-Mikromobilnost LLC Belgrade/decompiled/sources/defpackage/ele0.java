package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ele0 implements hle0 {
    public static final dle0 Companion = new dle0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(15))};
    public final List a;

    public /* synthetic */ ele0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, cle0.a.getDescriptor());
            throw null;
        }
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ele0) && jl40.l(this.a, ((ele0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("AnyOf(predicates="), this.a, ')');
    }

    public ele0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
