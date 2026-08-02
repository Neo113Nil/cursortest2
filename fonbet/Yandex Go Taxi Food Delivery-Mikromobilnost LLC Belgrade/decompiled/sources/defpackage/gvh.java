package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;

/* loaded from: classes5.dex */
public final class gvh {
    public final zuh a;

    public gvh(zuh zuhVar) {
        this.a = zuhVar;
    }

    public final Address a(pv0 pv0Var, Address address) {
        Address address2 = pv0Var.a;
        boolean z = false;
        if (address != null) {
            il0 E1 = address.E1();
            E1.getClass();
            if (!(E1 == il0.b)) {
                z = true;
            }
        }
        if (this.a.a().b && z) {
            if (jl40.l(address2.d(), address != null ? address.d() : null)) {
                AddressDTO address3 = address2.getAddress();
                bgq0 d1 = address.d1();
                String J1 = address.J1();
                String H1 = address.H1();
                String str = H1 == null ? "" : H1;
                String n0 = address.n0();
                String str2 = n0 == null ? "" : n0;
                String e2 = address.e2();
                String str3 = e2 == null ? "" : e2;
                String e0 = address.e0();
                return new PlainAddress(address2, AddressDTO.g(address3, null, null, J1, null, null, null, null, null, null, null, null, str3, str, e0 == null ? "" : e0, str2, d1, 31522811));
            }
        }
        return address2;
    }
}
