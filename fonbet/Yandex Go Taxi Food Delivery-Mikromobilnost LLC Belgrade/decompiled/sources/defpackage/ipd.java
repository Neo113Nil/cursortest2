package defpackage;

import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ipd {
    public static final hpd Companion = new hpd();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new juc(27)), null};
    public final BigDecimal a;
    public final String b;

    public /* synthetic */ ipd(int i, BigDecimal bigDecimal, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gpd.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipd)) {
            return false;
        }
        ipd ipdVar = (ipd) obj;
        return jl40.l(this.a, ipdVar.a) && jl40.l(this.b, ipdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return b64.p(sb, this.b, ')');
    }
}
