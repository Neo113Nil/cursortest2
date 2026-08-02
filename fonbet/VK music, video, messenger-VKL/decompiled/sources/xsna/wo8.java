package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.vk.pushes.dto.BusinessNotifyNotificationInfo;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: BusinessNotifyNotificationHelper.kt */
/* loaded from: classes5.dex */
public final class wo8 {
    public static final Handler a = new Handler(Looper.getMainLooper());

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((PushBusinessNotify) t).b, ((PushBusinessNotify) t2).b);
        }
    }

    public static void a(Context context) {
        if (b(ca70.f(context)) <= 1) {
            sv1.B(null, 3);
            ca70.f(context).cancel(ca70.e(3));
        }
        a.postDelayed(new pu5(context, 1), 100L);
    }

    public static int b(NotificationManager notificationManager) {
        try {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications != null) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (epx.f(statusBarNotification.getNotification().getGroup(), "business_notify_group")) {
                        arrayList.add(statusBarNotification);
                    }
                }
                return arrayList.size();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static void c(Context context, long j, int i, boolean z) {
        Object obj;
        List list;
        Integer num;
        List list2;
        Object obj2;
        List<PushBusinessNotify> list3;
        try {
            obj = wmi0.a.h("push_business_notify_" + j).a();
        } catch (Throwable unused) {
            obj = null;
        }
        BusinessNotifyNotificationInfo businessNotifyNotificationInfo = (BusinessNotifyNotificationInfo) obj;
        BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer = businessNotifyNotificationInfo != null ? businessNotifyNotificationInfo.b : null;
        List D0 = (businessNotifyNotificationInfo == null || (list3 = businessNotifyNotificationInfo.d) == null) ? null : j5g.D0(new a(), list3);
        if (businessNotifyNotificationContainer == null || (list = D0) == null || list.isEmpty()) {
            return;
        }
        int size = D0.size() - 1;
        while (true) {
            if (-1 >= size) {
                num = null;
                break;
            }
            Integer num2 = ((PushBusinessNotify) D0.get(size)).b;
            if (num2 != null && num2.intValue() <= i) {
                num = Integer.valueOf(size);
                break;
            }
            size--;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (z) {
                list2 = D0.subList(intValue + 1, D0.size());
            } else {
                ArrayList arrayList = new ArrayList(D0);
                arrayList.remove(intValue);
                list2 = arrayList;
            }
            if (list2.isEmpty()) {
                wmi0.a.a(defpackage.k0.a(j, "push_business_notify_"), new BusinessNotifyNotificationInfo(null, null, null));
                ca70 ca70Var = ca70.a;
                ca70.a(context, "business_notify_notification_" + Long.valueOf(j), 1);
                if (gz80.a(24)) {
                    a(context);
                    return;
                }
                return;
            }
            PushBusinessNotify pushBusinessNotify = (PushBusinessNotify) j5g.i0(list2);
            String str = businessNotifyNotificationContainer.e;
            List list4 = list2;
            String str2 = pushBusinessNotify.d;
            String str3 = businessNotifyNotificationContainer.h;
            String str4 = pushBusinessNotify.c;
            Integer num3 = pushBusinessNotify.b;
            int intValue2 = num3 != null ? num3.intValue() : 0;
            BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer2 = businessNotifyNotificationInfo.b;
            String str5 = businessNotifyNotificationInfo.c;
            BusinessNotifyNotification.BusinessNotifyNotificationContainer businessNotifyNotificationContainer3 = new BusinessNotifyNotification.BusinessNotifyNotificationContainer(str, str2, str3, false, str4, j, intValue2, false, businessNotifyNotificationContainer2.s, businessNotifyNotificationContainer.t);
            businessNotifyNotificationContainer3.u = true;
            BusinessNotifyNotificationInfo businessNotifyNotificationInfo2 = new BusinessNotifyNotificationInfo(businessNotifyNotificationContainer3, str5, list4);
            wmi0.a.a("push_business_notify_" + j, businessNotifyNotificationInfo2);
            try {
                obj2 = mcr0.l(-1L, str5).a();
            } catch (Throwable unused2) {
                obj2 = null;
            }
            BusinessNotifyNotification businessNotifyNotification = new BusinessNotifyNotification(context, businessNotifyNotificationContainer3, (Bitmap) obj2, list4);
            ca70 ca70Var2 = ca70.a;
            businessNotifyNotification.g(ca70.f(context));
        }
    }
}
