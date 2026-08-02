package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class l0j {
    public hif a = new hif(new ArrayList());

    public final void a(Address address) {
        fvd0 fvd0Var = null;
        if (address != null) {
            String pickMethod = address.getPickMethod();
            if (pickMethod != null) {
                fvd0Var = new fvd0(pickMethod, address.B(), address.q2(), address.getPickPosition(), address.getPickAction(), null, null);
            } else {
                jst.e.k(new IllegalArgumentException("Wrong destination address suggest provided"), "Wrong destination address suggest provided");
            }
        }
        hif hifVar = this.a;
        ArrayList arrayList = (ArrayList) hifVar.d;
        if (fvd0Var == null) {
            hifVar.g(-1, -1);
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size() - 1;
        int a = ((gvd0) arrayList.get(size)).a(fvd0Var);
        if (a == -1) {
            hifVar.g(-1, -1);
        } else {
            hifVar.g(size, a);
        }
    }
}
