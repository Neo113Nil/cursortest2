package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class i2t {
    public final Boolean a;
    public final kw11 b;
    public final boolean c;

    public /* synthetic */ i2t(int i) {
        this((i & 1) != 0 ? null : Boolean.TRUE, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2t)) {
            return false;
        }
        i2t i2tVar = (i2t) obj;
        return jl40.l(this.a, i2tVar.a) && jl40.l(this.b, i2tVar.b) && this.c == i2tVar.c;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        kw11 kw11Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (kw11Var != null ? kw11Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoSuggestSlice(isTaxiServiceAvailable=");
        sb.append(this.a);
        sb.append(", taxiUnavailabilityReason=");
        sb.append(this.b);
        sb.append(", shouldActivateShortcutsForUnavailableZone=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public i2t() {
        this(7);
    }

    public i2t(Boolean bool, kw11 kw11Var, boolean z) {
        this.a = bool;
        this.b = kw11Var;
        this.c = z;
    }
}
