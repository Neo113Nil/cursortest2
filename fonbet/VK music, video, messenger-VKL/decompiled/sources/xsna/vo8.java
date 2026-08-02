package xsna;

import com.vk.pushes.dto.BusinessNotifyNotificationInfo;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* compiled from: BusinessNotifyNotificationCache.kt */
/* loaded from: classes5.dex */
public final class vo8 {
    public static void a(BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer, String str) {
        Object obj;
        Collection collection;
        int i = businessNotifyNotificationContainer.q;
        long j = businessNotifyNotificationContainer.p;
        try {
            obj = b(j).a();
        } catch (Throwable unused) {
            obj = null;
        }
        BusinessNotifyNotificationInfo businessNotifyNotificationInfo = (BusinessNotifyNotificationInfo) obj;
        if (businessNotifyNotificationInfo == null || (collection = businessNotifyNotificationInfo.d) == null) {
            collection = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(collection);
        Integer valueOf = Integer.valueOf(i);
        String str2 = businessNotifyNotificationContainer.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = businessNotifyNotificationContainer.g;
        if (str3 == null) {
            str3 = "";
        }
        PushBusinessNotify pushBusinessNotify = new PushBusinessNotify(valueOf, str2, str3, false, 8, null);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                arrayList.add(pushBusinessNotify);
                break;
            }
            int i3 = i2 + 1;
            Integer num = ((PushBusinessNotify) it.next()).b;
            if (num != null && i == num.intValue()) {
                arrayList.set(i2, pushBusinessNotify);
                break;
            }
            i2 = i3;
        }
        BusinessNotifyNotificationInfo businessNotifyNotificationInfo2 = new BusinessNotifyNotificationInfo(businessNotifyNotificationContainer, str, arrayList);
        wmi0.a.a("push_business_notify_" + j, businessNotifyNotificationInfo2);
    }

    public static io.reactivex.rxjava3.core.q b(long j) {
        return wmi0.a.h("push_business_notify_" + j);
    }
}
