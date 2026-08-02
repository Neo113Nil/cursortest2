package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class av1 implements ex1 {
    public final pex0 a;
    public final Address b;
    public final f4e c;

    public av1(pex0 pex0Var, Address address, f4e f4eVar) {
        this.a = pex0Var;
        this.b = address;
        this.c = f4eVar;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av1)) {
            return false;
        }
        av1 av1Var = (av1) obj;
        return jl40.l(this.a, av1Var.a) && jl40.l(this.b, av1Var.b) && jl40.l(this.c, av1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AltPinBOption(tariff=" + this.a + ", alternativeAddress=" + this.b + ", confirmationScreen=" + this.c + Extension.C_BRAKE;
    }
}
