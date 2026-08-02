package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.places.impl.navigation.common.base.d;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.mobilityhub.router.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final /* synthetic */ class n75 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h55 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ n75(h55 h55Var, Object obj, boolean z, int i) {
        this.a = i;
        this.c = h55Var;
        this.w = obj;
        this.b = z;
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        ArrayList arrayList;
        int i = this.a;
        boolean z = this.b;
        Object obj = this.w;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                d dVar = (d) h55Var;
                sls slsVar = (sls) obj;
                r0 r0Var = dVar.V.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj2 : (List) value) {
                        if (!(((bcc0) obj2).a instanceof yl80)) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                if (slsVar != null) {
                    slsVar.invoke();
                } else {
                    dVar.T().a();
                }
                dVar.W().s(z);
                break;
            default:
                a aVar = (a) h55Var;
                d0l0 d0l0Var = (d0l0) obj;
                b bVar = aVar.F;
                ZoneAddress zoneAddress = d0l0Var.a;
                if (zoneAddress == null) {
                    zoneAddress = new ZoneAddress((Address) null, 3);
                }
                bVar.m(zoneAddress, null);
                bVar.p(d0l0Var.b);
                aVar.Q(Boolean.valueOf(z));
                break;
        }
    }
}
