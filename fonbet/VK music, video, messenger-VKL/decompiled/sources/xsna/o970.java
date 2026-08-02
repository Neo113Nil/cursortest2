package xsna;

import android.service.notification.StatusBarNotification;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.jrp;

/* compiled from: NotificationContentStorage.kt */
/* loaded from: classes5.dex */
public final class o970 extends zh70 implements w8i {
    public static final o970 b = new o970();
    public static final bpn0 c = new bpn0(new cy20(4));
    public static final String d = "NotificationContentStorage";

    @Override // xsna.zh70
    public final String b() {
        return d;
    }

    @Override // xsna.zh70
    public final Map<String, Long> c() {
        return jgp.b;
    }

    @Override // xsna.zh70
    public final List e(StatusBarNotification[] statusBarNotificationArr) {
        o970 o970Var;
        ArrayList arrayList = new ArrayList(statusBarNotificationArr.length);
        int length = statusBarNotificationArr.length;
        int i = 0;
        while (true) {
            o970Var = b;
            if (i >= length) {
                break;
            }
            StatusBarNotification statusBarNotification = statusBarNotificationArr[i];
            Integer valueOf = Integer.valueOf(statusBarNotification.getId());
            String tag = statusBarNotification.getTag();
            o970Var.getClass();
            arrayList.add(zh70.a(tag, valueOf));
            i++;
        }
        Map<String, ?> all = Preference.f(d).getAll();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            jrp a = jrp.a.a((String) it.next().getValue());
            String str = a.b;
            int i2 = a.a;
            Integer valueOf2 = Integer.valueOf(i2);
            o970Var.getClass();
            if (!arrayList.contains(zh70.a(str, valueOf2))) {
                o970Var.d(str, Integer.valueOf(i2));
                a = null;
            }
            if (a != null) {
                arrayList2.add(a);
            }
        }
        List D0 = j5g.D0(new ari(1), arrayList2);
        ArrayList arrayList3 = new ArrayList(c5g.u(D0, 10));
        Iterator it2 = D0.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((jrp) it2.next()).c);
        }
        return arrayList3;
    }

    @Override // xsna.zh70
    public final void f(UserId userId, int i, String str, Map<String, String> map) {
        if (((v57) c.getValue()).h()) {
            super.f(userId, i, str, map);
        }
    }
}
