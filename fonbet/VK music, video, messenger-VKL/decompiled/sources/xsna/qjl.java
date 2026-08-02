package xsna;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DefaultNotificationsRemoveStrategy.kt */
/* loaded from: classes7.dex */
public final class qjl implements yj70 {
    public final Context a;

    /* compiled from: DefaultNotificationsRemoveStrategy.kt */
    public final class a implements Comparator<Notification> {
        public final dd70 b;

        public a(Context context) {
            this.b = new dd70(context);
        }

        @SuppressLint({"NewApi"})
        public final int a(Notification notification) {
            boolean a = gz80.a(26);
            if (!a) {
                if (a) {
                    throw new NoWhenBranchMatchedException();
                }
                return notification.priority;
            }
            NotificationChannel notificationChannel = this.b.b.getNotificationChannel(notification.getChannelId());
            if (notificationChannel != null) {
                return notificationChannel.getImportance();
            }
            return -1000;
        }

        @Override // java.util.Comparator
        public final int compare(Notification notification, Notification notification2) {
            Notification notification3 = notification;
            Notification notification4 = notification2;
            int g = epx.g(a(notification3), a(notification4));
            return g != 0 ? g : epx.h(notification3.when, notification4.when);
        }
    }

    public qjl(Context context) {
        this.a = context;
    }

    @Override // xsna.yj70
    public final Collection a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i = ((Notification) obj).flags;
            if ((i & 2) == 0 && (i & 32) == 0) {
                arrayList2.add(obj);
            }
        }
        return j5g.H0(j5g.D0(new a(this.a), arrayList2), 3);
    }
}
