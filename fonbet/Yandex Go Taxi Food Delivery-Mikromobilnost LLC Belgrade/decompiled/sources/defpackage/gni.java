package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.delivery.AddressDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.delivery.RouteDeliveryInfo;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class gni {
    public final dqe0 a;
    public final cpf b;
    public final y5i c;
    public final ozt0 d;

    public gni(dqe0 dqe0Var, cpf cpfVar, y5i y5iVar, ozt0 ozt0Var) {
        this.a = dqe0Var;
        this.b = cpfVar;
        this.c = y5iVar;
        this.d = ozt0Var;
    }

    public final AddressDeliveryInfo a(vuh vuhVar) {
        bgq0 f = e991.f(vuhVar.a);
        if (f.b.length() == 0) {
            ozt0 ozt0Var = this.d;
            pex0 m = ((k) ozt0Var.a).m();
            f = ozt0Var.b.q(m != null ? m.b : null);
        }
        bgq0 bgq0Var = f;
        String str = vuhVar.d;
        String str2 = !evu0.J(str) ? str : null;
        String str3 = vuhVar.b;
        String str4 = !evu0.J(str3) ? str3 : null;
        String str5 = vuhVar.e;
        if (evu0.J(str5)) {
            str5 = null;
        }
        cpf cpfVar = this.b;
        String str6 = cpfVar.a() ? str5 : null;
        String str7 = vuhVar.c;
        if (evu0.J(str7)) {
            str7 = null;
        }
        String str8 = cpfVar.a() ? str7 : null;
        String str9 = vuhVar.f;
        if (evu0.J(str9)) {
            str9 = null;
        }
        return new AddressDeliveryInfo(bgq0Var, str4, str8, str2, str6, cpfVar.a() ? str9 : null);
    }

    public final void b() {
        cni l = this.c.l();
        Preorder preorder = this.a.a;
        AddressDeliveryInfo a = a(l.a);
        List list = l.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((vuh) it.next()));
        }
        preorder.H = new RouteDeliveryInfo(a, arrayList);
        List b = this.a.b();
        ArrayList arrayList2 = new ArrayList(tcc.n(b, 10));
        int i = 0;
        for (Object obj : b) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Address address = (Address) obj;
            vuh vuhVar = (vuh) l.b.get(i);
            AddressDTO address2 = address.getAddress();
            bgq0 f = e991.f(vuhVar.a);
            arrayList2.add(new PlainAddress(address, AddressDTO.g(address2, null, null, vuhVar.b, null, null, null, null, null, null, null, null, vuhVar.e, vuhVar.c, vuhVar.f, vuhVar.d, f, 31522811)));
            i = i2;
        }
        this.a.a.p(arrayList2);
    }
}
