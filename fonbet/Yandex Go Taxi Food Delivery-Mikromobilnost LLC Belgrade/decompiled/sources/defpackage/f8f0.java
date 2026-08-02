package defpackage;

import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class f8f0 {
    public static final e8f0 Companion = new e8f0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(13)), null};
    public final BigDecimal a;
    public final String b;

    public /* synthetic */ f8f0(int i, BigDecimal bigDecimal, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, d8f0.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8f0)) {
            return false;
        }
        f8f0 f8f0Var = (f8f0) obj;
        return jl40.l(this.a, f8f0Var.a) && jl40.l(this.b, f8f0Var.b);
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
