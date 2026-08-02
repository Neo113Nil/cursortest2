package defpackage;

import com.yandex.go.address.models.Address;
import defpackage.zfu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class agu0 {
    public static ArrayList a(int i, List list, aah aahVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        aahVar.getClass();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m91((Address) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new bgu0(((m91) it2.next()).a));
        }
        if (z) {
            arrayList.add(new zfu0.b());
        }
        arrayList.addAll(arrayList3);
        if (list.size() < i) {
            arrayList.add(new zfu0.a());
        }
        return arrayList;
    }
}
