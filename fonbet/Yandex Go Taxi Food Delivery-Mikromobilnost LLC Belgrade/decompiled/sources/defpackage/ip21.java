package defpackage;

import com.yandex.go.address.models.Address;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ip21 {
    public final Address a;
    public final Address b;
    public final List c;
    public final Set d;

    public ip21(Address address, Address address2, List list, Set set) {
        this.a = address;
        this.b = address2;
        this.c = list;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip21)) {
            return false;
        }
        ip21 ip21Var = (ip21) obj;
        return jl40.l(this.a, ip21Var.a) && jl40.l(this.b, ip21Var.b) && this.c.equals(ip21Var.c) && jl40.l(this.d, ip21Var.d);
    }

    public final int hashCode() {
        Address address = this.a;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        Address address2 = this.b;
        int c = unr0.c((hashCode + (address2 == null ? 0 : address2.hashCode())) * 31, 31, this.c);
        Set set = this.d;
        return c + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "UserManagedData(srcAddress=" + this.a + ", dstAddress=" + this.b + ", filters=" + this.c + ", transportIds=" + this.d + Extension.C_BRAKE;
    }
}
