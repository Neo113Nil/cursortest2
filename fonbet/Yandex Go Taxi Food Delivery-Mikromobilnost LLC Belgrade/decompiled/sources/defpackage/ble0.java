package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class ble0 implements hle0 {
    public static final ale0 Companion = new ale0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(28))};
    public final List a;

    public /* synthetic */ ble0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, zke0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ble0) && jl40.l(this.a, ((ble0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("AllOf(predicates="), this.a, ')');
    }

    public ble0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
