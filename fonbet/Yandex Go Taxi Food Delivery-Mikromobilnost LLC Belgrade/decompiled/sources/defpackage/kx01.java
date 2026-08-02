package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kx01 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final MapBuilder d;

    public kx01(boolean z, boolean z2, boolean z3) {
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
        if (!(obj instanceof kx01)) {
            return false;
        }
        kx01 kx01Var = (kx01) obj;
        return this.a == kx01Var.a && this.b == kx01Var.b && this.c == kx01Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("TransportCardBalance(hasPendingTopUps=", ", hasDebt=", ", hasInsufficientFunds=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
