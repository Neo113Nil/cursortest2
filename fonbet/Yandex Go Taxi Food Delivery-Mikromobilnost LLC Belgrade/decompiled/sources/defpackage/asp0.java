package defpackage;

import com.yandex.plus.home.api.location.GeoPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.plus.api.dto.AvailableFields;
import ru.yandex.taxi.plus.sdk.existing_screens.c;

/* loaded from: classes9.dex */
public final class asp0 {
    public final sls a;
    public final n4u0 b;
    public final int c;
    public final c d;

    public asp0(sls slsVar, n4u0 n4u0Var, int i, c cVar) {
        this.a = slsVar;
        this.b = n4u0Var;
        this.c = i;
        this.d = cVar;
    }

    public final zrp0 a(List list) {
        t1t t1tVar;
        jzs jzsVar;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AvailableFields) it.next()).getFieldName());
        }
        EmptyList emptyList = EmptyList.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(emptyList, 10));
        Iterator<E> it2 = emptyList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new klw0((String) it2.next()));
        }
        n4u0 n4u0Var = this.b;
        if (n4u0Var == null || (jzsVar = (jzs) n4u0Var.getValue()) == null) {
            t1tVar = null;
        } else {
            GeoPoint geoPoint = jzsVar.a;
            t1tVar = new t1t(geoPoint != null ? Float.valueOf(geoPoint.getAccuracy()) : null, jzsVar.c, geoPoint != null ? new zzs(geoPoint.getLat(), geoPoint.getLon(), 0, null, null, 28) : null);
        }
        return new zrp0(arrayList, arrayList2, t1tVar, this.c, this.d.a());
    }
}
