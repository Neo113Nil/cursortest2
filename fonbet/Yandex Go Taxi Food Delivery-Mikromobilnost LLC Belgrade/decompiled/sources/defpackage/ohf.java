package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class ohf {
    public final c a;

    public ohf(c cVar) {
        this.a = cVar;
    }

    public final ArrayList a() {
        String str;
        String type;
        List a = this.a.c().a();
        int size = a.size();
        List<Address> list = a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Address address : list) {
            String R = address.R();
            String J1 = address.J1();
            zzs B = address.B();
            int i2 = i + 1;
            if (i == 0) {
                str = RoutePointType.POINT_A.getType();
            } else if (i == size - 1) {
                type = RoutePointType.POINT_B.getType();
                i = 0;
                arrayList.add(new chf(R, J1, B, type, address.getPickAction(), address.getPickMethod(), address.q2()));
            } else {
                str = RoutePointType.POINT_MID.getType() + i;
            }
            type = str;
            i = i2;
            arrayList.add(new chf(R, J1, B, type, address.getPickAction(), address.getPickMethod(), address.q2()));
        }
        return arrayList;
    }
}
