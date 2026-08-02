package defpackage;

import com.yandex.go.zone.model.Zone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gd61 {
    public final Zone a;
    public final Zone b;

    public gd61(Zone zone, Zone zone2) {
        this.a = zone;
        this.b = zone2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd61)) {
            return false;
        }
        gd61 gd61Var = (gd61) obj;
        return jl40.l(this.a, gd61Var.a) && jl40.l(this.b, gd61Var.b);
    }

    public final int hashCode() {
        Zone zone = this.a;
        int hashCode = (zone == null ? 0 : zone.hashCode()) * 31;
        Zone zone2 = this.b;
        return hashCode + (zone2 != null ? zone2.hashCode() : 0);
    }

    public final String toString() {
        return "ZoneChange(oldZone=" + this.a + ", newZone=" + this.b + Extension.C_BRAKE;
    }
}
