package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.source.altpins.Alternatives;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f4e {
    public final Alternatives.ConfirmationScreen a;
    public final Address b;
    public final Address c;
    public final Address d;
    public final fef e;
    public final List f;
    public final String g;
    public final int h;
    public final boolean i;
    public final String j;
    public final String k;

    public f4e(Alternatives.ConfirmationScreen confirmationScreen, Address address, Address address2, Address address3, fef fefVar, List list, String str, int i, boolean z, String str2, String str3) {
        this.a = confirmationScreen;
        this.b = address;
        this.c = address2;
        this.d = address3;
        this.e = fefVar;
        this.f = list;
        this.g = str;
        this.h = i;
        this.i = z;
        this.j = str2;
        this.k = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4e)) {
            return false;
        }
        f4e f4eVar = (f4e) obj;
        return jl40.l(this.a, f4eVar.a) && this.b.equals(f4eVar.b) && jl40.l(this.c, f4eVar.c) && jl40.l(this.d, f4eVar.d) && jl40.l(this.e, f4eVar.e) && this.f.equals(f4eVar.f) && this.g.equals(f4eVar.g) && this.h == f4eVar.h && this.i == f4eVar.i && this.j.equals(f4eVar.j) && this.k.equals(f4eVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + unr0.b(unr0.e(oyr.b(this.h, unr0.b(unr0.c((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmationScreenDto(confirmationScreen=");
        sb.append(this.a);
        sb.append(", alternativeAddress=");
        sb.append(this.b);
        sb.append(", destinationAddress=");
        sb.append(this.c);
        sb.append(", sourceAddress=");
        sb.append(this.d);
        sb.append(", currencyRules=");
        sb.append(this.e);
        sb.append(", walkRoute=");
        sb.append(this.f);
        sb.append(", walkTime=");
        b64.A(this.h, this.g, ", estimatedTime=", ", useDefaultEtaIcon=", sb);
        unr0.A(", altpinPrice=", this.j, ", originalPrice=", sb, this.i);
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
