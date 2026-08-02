package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kb11 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final MapBuilder d;

    public kb11(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("has_pending_top_ups", Boolean.valueOf(z));
        mapBuilder.put("has_debt", Boolean.valueOf(z2));
        mapBuilder.put("has_insufficient_funds", Boolean.valueOf(z3));
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb11)) {
            return false;
        }
        kb11 kb11Var = (kb11) obj;
        return this.a == kb11Var.a && this.b == kb11Var.b && this.c == kb11Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("TransportCardBalance(hasPendingTopUps=", ", hasDebt=", ", hasInsufficientFunds=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
