package defpackage;

import com.yandex.go.address.models.Address;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dem extends t0k {
    public final Address a;
    public final List b;
    public final String c;
    public final String d;

    public dem(Address address, List list, String str, String str2) {
        this.a = address;
        this.b = list;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dem)) {
            return false;
        }
        dem demVar = (dem) obj;
        return jl40.l(this.a, demVar.a) && jl40.l(this.b, demVar.b) && this.c.equals(demVar.c) && jl40.l(this.d, demVar.d);
    }

    public final int hashCode() {
        Address address = this.a;
        return this.d.hashCode() + unr0.b(unr0.c((address == null ? 0 : address.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveOffer(startingPoint=");
        sb.append(this.a);
        sb.append(", destinations=");
        sb.append(this.b);
        sb.append(", carNumber=");
        return g8e.r(sb, this.c, ", offerId=", this.d, Extension.C_BRAKE);
    }
}
