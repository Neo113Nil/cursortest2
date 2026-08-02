package xsna;

import android.service.notification.StatusBarNotification;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SimpleTimeZone;
import kotlin.Pair;
import xsna.jrp;

/* compiled from: NotificationStorageBase.kt */
/* loaded from: classes.dex */
public abstract class zh70 {
    public static String a(String str, Number number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb.append('-');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract String b();

    public abstract Map<String, Long> c();

    public final void d(String str, Number number) {
        Preference.C(b(), a(str, number));
    }

    public List e(StatusBarNotification[] statusBarNotificationArr) {
        ArrayList arrayList = new ArrayList(statusBarNotificationArr.length);
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            arrayList.add(new Pair(Integer.valueOf(statusBarNotification.getId()), statusBarNotification.getTag()));
        }
        Set S0 = j5g.S0(arrayList);
        Map<String, ?> all = Preference.f(b()).getAll();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            jrp a = jrp.a.a((String) it.next().getValue());
            Long l = c().get(a.a().get("type"));
            long c = a.c() + (l != null ? l.longValue() : 0L);
            SimpleTimeZone simpleTimeZone = pvo0.a;
            xuo0.a.getClass();
            if (c < xuo0.a()) {
                d(a.d(), Integer.valueOf(a.b()));
                a = null;
            }
            if (a != null) {
                arrayList2.add(a);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            jrp jrpVar = (jrp) next;
            if (!S0.contains(new Pair(Integer.valueOf(jrpVar.b()), jrpVar.d()))) {
                arrayList3.add(next);
            }
        }
        List D0 = j5g.D0(new wiu(1), arrayList3);
        ArrayList arrayList4 = new ArrayList(c5g.u(D0, 10));
        Iterator it3 = D0.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((jrp) it3.next()).a());
        }
        return arrayList4;
    }

    public void f(UserId userId, int i, String str, Map<String, String> map) {
        if (!map.containsKey("to_id")) {
            map = pn00.n(map, on00.f(new Pair("to_id", String.valueOf(userId.b))));
        }
        SimpleTimeZone simpleTimeZone = pvo0.a;
        xuo0.a.getClass();
        Preference.H(b(), a(str, Integer.valueOf(i)), new jrp(str, xuo0.a(), i, map).e());
    }
}
