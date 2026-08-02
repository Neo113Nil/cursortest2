package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: SuperAppQueueResponseMapper.kt */
/* loaded from: classes6.dex */
public final class wan0 {
    public static WidgetObjects a(List list, List list2, List list3) {
        new ykg();
        List list4 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(ykg.d((AppsAppMinDto) it.next()));
        }
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ykg.c((AppsAppDto) it2.next()));
        }
        ArrayList u0 = j5g.u0(arrayList2, arrayList);
        int e = on00.e(c5g.u(u0, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it3 = u0.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            linkedHashMap.put(Long.valueOf(((WebApiApplication) next).b), next);
        }
        List list6 = list3;
        ArrayList arrayList3 = new ArrayList(c5g.u(list6, 10));
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            arrayList3.add(ks20.l((UsersUserFullDto) it4.next()));
        }
        int e2 = on00.e(c5g.u(arrayList3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            linkedHashMap2.put(Long.valueOf(((WebUserShortInfo) next2).b.b), next2);
        }
        return new WidgetObjects(linkedHashMap, linkedHashMap2, jgp.b);
    }
}
