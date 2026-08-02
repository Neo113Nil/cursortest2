package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.delivery.mapper.model.SelectDestinationPolicy;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.dto.b;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.chargers.e;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.logistics.common.a;
import ru.yandex.taxi.masstransit.d;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final /* synthetic */ class gpa implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ gpa(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.sy60
    public final void a() {
        Boolean bool;
        apf apfVar;
        switch (this.a) {
            case 0:
                ((e) this.b).d0((s2a) this.c, (rca) this.w);
                break;
            case 1:
                dhg dhgVar = (dhg) this.b;
                q5i q5iVar = (q5i) this.c;
                r5i r5iVar = (r5i) this.w;
                ifa0 ifa0Var = dhgVar.i;
                Object obj = null;
                if (ifa0Var != null) {
                    boolean b = r5iVar.N.b(ifa0Var);
                    if (b) {
                        r5iVar.N.a(ifa0Var);
                    }
                    bool = Boolean.valueOf(b);
                } else {
                    bool = null;
                }
                boolean l = jl40.l(bool, Boolean.FALSE);
                q5iVar.getClass();
                String str = dhgVar.a;
                boolean z = dhgVar.b;
                Expansion expansion = dhgVar.c;
                String str2 = dhgVar.d;
                Map map = dhgVar.e;
                wgg wggVar = dhgVar.f;
                if (wggVar == null) {
                    apfVar = null;
                } else {
                    ice0 ice0Var = wggVar.a.a;
                    String str3 = "";
                    apfVar = new apf(new zzs(ice0Var.a, ice0Var.b, 0, null, null, 28), str3, str3, obj, 16);
                }
                tli0 tli0Var = new tli0(str, z, expansion, str2, map, apfVar, l, snv0.a);
                Preorder preorder = r5iVar.U.a;
                khg khgVar = r5iVar.P;
                Address e = khgVar.a.e();
                if (e == null) {
                    zgc0 zgc0Var = PlainAddress.Companion;
                    b bVar = AddressDTO.Companion;
                    zzs b2 = ((gh00) khgVar.b.a).e.b();
                    bVar.getClass();
                    AddressDTO a = b.a(b2);
                    zgc0Var.getClass();
                    e = new PlainAddress(a);
                }
                preorder.o(new ZoneAddress(e, r5iVar.P.a.c()));
                if ((apfVar != null || q5iVar.a.U.a() != null || dhgVar.h == SelectDestinationPolicy.SKIP) && dhgVar.h != SelectDestinationPolicy.REQUIRED) {
                    ((a) r5iVar.R).c(tli0Var, ((d4i) r5iVar.S.get()).a(dhgVar));
                    break;
                } else {
                    q5iVar.c(PointType.DESTINATION, new jo0(q5iVar.a, dhgVar, q5iVar, tli0Var, 9));
                    break;
                }
                break;
            case 2:
                ((ru.yandex.taxi.delivery.router.primary.a) this.b).T((hyf) this.c, (String) this.w);
                break;
            case 3:
                mhr mhrVar = (mhr) this.b;
                khr khrVar = (khr) this.c;
                sls slsVar = (sls) this.w;
                mhrVar.b.remove(khrVar);
                slsVar.invoke();
                break;
            case 4:
                yq30 yq30Var = (yq30) this.b;
                d dVar = (d) this.c;
                e310 e310Var = (e310) this.w;
                if (!(yq30Var instanceof wq30)) {
                    if (yq30Var instanceof xq30) {
                        d.Z(dVar, e310Var, ((xq30) yq30Var).a, null, 6);
                        break;
                    }
                } else {
                    dVar.c0(e310Var);
                    break;
                }
                break;
            default:
                com.yandex.go.scooters.offers.v2.newbie_guide.b bVar2 = (com.yandex.go.scooters.offers.v2.newbie_guide.b) this.b;
                String str4 = (String) this.c;
                sls slsVar2 = (sls) this.w;
                qwo0 qwo0Var = bVar2.H.a;
                sme0 sme0Var = qwo0Var.d;
                kgx[] kgxVarArr = qwo0.B;
                qwo0Var.d.setValue(qwo0Var, kgxVarArr[2], v4r0.i((Set) sme0Var.getValue(qwo0Var, kgxVarArr[2]), str4));
                slsVar2.invoke();
                break;
        }
    }
}
