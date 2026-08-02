package xsna;

import android.service.notification.StatusBarNotification;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: NotificationStorage.kt */
/* loaded from: classes.dex */
public final class yh70 extends zh70 {
    public static final yh70 b = new yh70();
    public static final String c = "NotificationStorage";
    public static final boolean d;
    public static final HashMap e;

    static {
        HashMap hashMap;
        Long l;
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        Features.Type type = Features.Type.FEATURE_NOTIFICATION_RESTORE;
        d = bVar.a(type);
        b.d j = bVar.j(type.getKey(), false);
        String a = cqm0.a(j != null ? j.c.toString() : null);
        if (a != null) {
            JSONObject jSONObject = new JSONObject(a);
            hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    l = Long.valueOf(((Number) jSONObject.get(next)).longValue());
                } catch (Throwable unused) {
                    l = null;
                }
                if (next != null && l != null) {
                    hashMap.put(next, l);
                }
            }
        } else {
            Set<String> set = ule0.a;
            HashMap hashMap2 = new HashMap(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                hashMap2.put(it.next(), Long.valueOf(TimeUnit.DAYS.toMillis(7L)));
            }
            hashMap = hashMap2;
        }
        e = hashMap;
    }

    @Override // xsna.zh70
    public final String b() {
        return c;
    }

    @Override // xsna.zh70
    public final Map<String, Long> c() {
        return e;
    }

    @Override // xsna.zh70
    public final List e(StatusBarNotification[] statusBarNotificationArr) {
        return !d ? EmptyList.b : super.e(statusBarNotificationArr);
    }

    @Override // xsna.zh70
    public final void f(UserId userId, int i, String str, Map<String, String> map) {
        if (d) {
            if (e.containsKey(map.get("type"))) {
                super.f(userId, i, str, map);
            }
        }
    }
}
