package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kb70;
import xsna.tlo0;

/* compiled from: NotificationListTitleMapper.kt */
/* loaded from: classes4.dex */
public final class ec70 {
    public static List a(int i, List list) {
        Object obj;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof kb70.d) {
                break;
            }
        }
        if (!(obj instanceof kb70.d)) {
            obj = null;
        }
        kb70.d dVar = (kb70.d) obj;
        if (dVar != null) {
            if (dVar.b <= i) {
                dVar = null;
            }
            if (dVar != null) {
                Iterator it2 = list2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Object next = it2.next();
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((kb70) next) instanceof kb70.d) {
                        break;
                    }
                    i2++;
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    Integer g = i7o0.g(list2, new h6u(i, 1));
                    ArrayList arrayList = new ArrayList(list2);
                    kb70.e eVar = new kb70.e(tq.h(tlo0.Companion, R.string.notification_list_new_title));
                    kb70.e eVar2 = new kb70.e(new tlo0.f(R.string.notification_list_seen_title));
                    if (g != null) {
                        arrayList.addAll(g.intValue(), e43.l(new kb70.a(gq.d(g, "divider_seen_")), eVar2));
                    }
                    arrayList.add(intValue, eVar);
                    return arrayList;
                }
            }
        }
        return list;
    }
}
