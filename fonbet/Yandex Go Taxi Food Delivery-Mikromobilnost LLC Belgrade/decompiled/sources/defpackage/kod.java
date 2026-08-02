package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class kod {
    public static final cod Companion = new cod();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new juc(21))};
    public final String a;
    public final List b;

    public /* synthetic */ kod(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bod.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kod)) {
            return false;
        }
        kod kodVar = (kod) obj;
        return jl40.l(this.a, kodVar.a) && jl40.l(this.b, kodVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalInfo(text=");
        sb.append(this.a);
        sb.append(", items=");
        return unr0.t(sb, this.b, ')');
    }
}
