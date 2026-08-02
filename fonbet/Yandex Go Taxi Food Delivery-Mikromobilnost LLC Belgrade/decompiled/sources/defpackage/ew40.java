package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ew40 {
    public final pt40 a;
    public final PlainAddress b;
    public final PlainAddress c;
    public final Point d;

    public ew40(pt40 pt40Var, PlainAddress plainAddress, PlainAddress plainAddress2, Point point) {
        this.a = pt40Var;
        this.b = plainAddress;
        this.c = plainAddress2;
        this.d = point;
    }

    public final Address a() {
        return this.c;
    }

    public final Address b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ew40) {
            ew40 ew40Var = (ew40) obj;
            if (this.a == ew40Var.a && this.b.equals(ew40Var.b) && this.c.equals(ew40Var.c) && this.d.equals(ew40Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MultimodalTaxiRoute(mtRoute=" + this.a + ", taxiSource=" + this.b + ", taxiDestination=" + this.c + ", taxiStopPoint=" + this.d + Extension.C_BRAKE;
    }
}
