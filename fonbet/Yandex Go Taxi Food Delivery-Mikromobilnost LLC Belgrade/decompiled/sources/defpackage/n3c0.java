package defpackage;

import com.yandex.go.address.models.PlaceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n3c0 {
    public final PlaceType a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public n3c0(PlaceType placeType, boolean z, boolean z2, String str) {
        this.a = placeType;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3c0)) {
            return false;
        }
        n3c0 n3c0Var = (n3c0) obj;
        return this.a == n3c0Var.a && this.b == n3c0Var.b && this.c == n3c0Var.c && jl40.l(this.d, n3c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceTypeState(selectedPlaceType=");
        sb.append(this.a);
        sb.append(", isHomeEnabled=");
        sb.append(this.b);
        sb.append(", isWorkEnabled=");
        return n.m(", newAddressTitle=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
