package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class n4n {
    public static final m4n Companion = new m4n();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(11))};
    public final String a;
    public final Map b;

    public /* synthetic */ n4n(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, l4n.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4n)) {
            return false;
        }
        n4n n4nVar = (n4n) obj;
        return jl40.l(this.a, n4nVar.a) && jl40.l(this.b, n4nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DwhEventRequest(event=");
        sb.append(this.a);
        sb.append(", parameters=");
        return smw0.n(sb, this.b, ')');
    }

    public n4n(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
