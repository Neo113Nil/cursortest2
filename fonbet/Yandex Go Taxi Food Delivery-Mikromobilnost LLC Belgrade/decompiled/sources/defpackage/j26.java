package defpackage;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;

/* loaded from: classes6.dex */
public final class j26 {
    public final tu30 a;
    public final acz b;
    public final o c;

    public j26(tu30 tu30Var, acz aczVar, o oVar) {
        this.a = tu30Var;
        this.b = aczVar;
        this.c = oVar;
    }

    public final zzs a() {
        Address address;
        zzs B;
        ZoneAddress zoneAddress = this.a.a().a;
        if (zoneAddress != null && (address = zoneAddress.a) != null && (B = address.B()) != null) {
            return B;
        }
        Location a = this.b.a();
        if (a == null) {
            return null;
        }
        zzs.Companion.getClass();
        return uzs.b(a);
    }

    public final String b() {
        Zone zone;
        String str;
        ZoneAddress zoneAddress = this.a.a().a;
        if (zoneAddress != null && (zone = zoneAddress.b) != null && (str = zone.a) != null) {
            return str;
        }
        Zone g = this.c.g();
        return g != null ? g.a : "";
    }
}
