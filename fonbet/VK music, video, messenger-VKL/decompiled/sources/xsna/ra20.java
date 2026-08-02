package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: MessageNotificationHelper.kt */
/* loaded from: classes5.dex */
public final class ra20 {
    public static final ra20 a = new ra20();
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((PushMessage) t).b), Integer.valueOf(((PushMessage) t2).b));
        }
    }

    public static void a(Context context, Long l) {
        ca70 ca70Var = ca70.a;
        if (d(ca70.f(context), l) <= 1) {
            ca70.a(context, "group_msg_notification_" + l, 3);
        }
    }

    public static void b(Context context, Long l) {
        a(context, l);
        b.postDelayed(new ja3(context, l), 100L);
    }

    public static void c(Context context, long j, Long l) {
        wmi0.a.a(qa20.b.a.c(j, l), new MessageNotificationInfo(null, null, null, null, null));
        ca70 ca70Var = ca70.a;
        ca70.a(context, "msg_notification_" + Long.valueOf(j) + '_' + l, 1);
        b(context, l);
    }

    public static int d(NotificationManager notificationManager, Long l) {
        try {
            String str = "message_group_group_msg_notification_" + l;
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications != null) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (epx.f(statusBarNotification.getNotification().getGroup(), str)) {
                        arrayList.add(statusBarNotification);
                    }
                }
                return arrayList.size();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static Bitmap e(MessageNotificationInfo messageNotificationInfo) {
        Bitmap bitmap;
        Object obj;
        String str = messageNotificationInfo.f;
        MessageNotificationContainer messageNotificationContainer = messageNotificationInfo.b;
        if (str == null || str.length() == 0) {
            bitmap = null;
        } else {
            try {
                obj = mcr0.l(600L, str).a();
            } catch (Throwable unused) {
                obj = null;
            }
            bitmap = (Bitmap) obj;
        }
        if (bitmap == null) {
            if ((messageNotificationContainer != null ? messageNotificationContainer.y : null) != null) {
                return z4g.d().B(messageNotificationContainer.z, messageNotificationContainer.y.longValue());
            }
        }
        return bitmap;
    }

    public static void f(Context context, long j, int i, Long l, boolean z) {
        Object obj;
        List<PushMessage> list;
        Integer num;
        List list2;
        try {
            obj = qa20.b.a.f(j, l).a();
        } catch (Throwable unused) {
            obj = null;
        }
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj;
        if ((messageNotificationInfo != null ? messageNotificationInfo.b : null) == null || (list = messageNotificationInfo.e) == null || list.isEmpty()) {
            return;
        }
        List D0 = j5g.D0(new a(), messageNotificationInfo.e);
        int size = D0.size() - 1;
        while (true) {
            if (-1 >= size) {
                num = null;
                break;
            } else {
                if (((PushMessage) D0.get(size)).b <= i) {
                    num = Integer.valueOf(size);
                    break;
                }
                size--;
            }
        }
        if (num == null) {
            return;
        }
        if (z) {
            list2 = D0.subList(num.intValue() + 1, D0.size());
        } else {
            ArrayList arrayList = new ArrayList(D0);
            arrayList.remove(num.intValue());
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            c(context, j, l);
            return;
        }
        PushMessage pushMessage = (PushMessage) j5g.i0(list2);
        MessageNotificationContainer messageNotificationContainer = messageNotificationInfo.b;
        String str = messageNotificationContainer.e;
        String str2 = pushMessage.d;
        long j2 = pushMessage.f;
        String str3 = messageNotificationContainer.h;
        String format = String.format(i5s.a(new StringBuilder("https://"), a0a.d, "/im?sel=%d"), Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        String str4 = pushMessage.c;
        MessageNotificationContainer messageNotificationContainer2 = messageNotificationInfo.b;
        MessageNotificationContainer a2 = com.vk.pushes.notifications.im.a.a(str, str2, j2, str3, format, false, str4, messageNotificationContainer2.w, messageNotificationContainer2.x, messageNotificationContainer2.B, messageNotificationContainer2.y, j, messageNotificationContainer2.A, false, messageNotificationContainer2.p, messageNotificationContainer2.q, messageNotificationContainer2.s, messageNotificationContainer2.r);
        a2.u = true;
        MessageNotificationInfo zb = MessageNotificationInfo.zb(messageNotificationInfo, a2, list2, null, 22);
        wmi0.a.a(qa20.b.a.c(j, a2.j()), zb);
        g(context, j, zb);
    }

    public static void g(Context context, long j, MessageNotificationInfo messageNotificationInfo) {
        Object obj;
        Context context2;
        ri6 pa20Var;
        MessageNotificationContainer messageNotificationContainer = messageNotificationInfo.b;
        if (messageNotificationContainer == null) {
            return;
        }
        try {
            obj = mcr0.l(600L, messageNotificationInfo.c).a();
        } catch (Throwable unused) {
            obj = null;
        }
        Bitmap bitmap = (Bitmap) obj;
        if (com.vk.dto.common.b.a(j)) {
            context2 = context;
            pa20Var = new qtb(context2, messageNotificationContainer, e(messageNotificationInfo), bitmap, messageNotificationInfo.e, (sfg) null, (xsw) null, 224);
        } else {
            context2 = context;
            pa20Var = new pa20(context2, messageNotificationContainer, bitmap, messageNotificationInfo.e, (Intent) null, (gzs) null, (gzs) null, 232);
        }
        ca70 ca70Var = ca70.a;
        pa20Var.g(ca70.f(context2));
    }
}
