package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.notifications.NotificationItem;
import com.vk.notifications.common.NotificationCSatRate;

/* compiled from: NotificationClickHandler.kt */
/* loaded from: classes4.dex */
public interface c970 {
    static /* synthetic */ void d(c970 c970Var, Context context, NotificationEntity notificationEntity, View view, int i) {
        if ((i & 8) != 0) {
            view = null;
        }
        c970Var.b(context, notificationEntity, null, view);
    }

    void b(Context context, NotificationEntity notificationEntity, NotificationItem notificationItem, View view);

    void c(Context context, View view, NotificationAction notificationAction, NotificationItem notificationItem, bj70 bj70Var);

    default void a() {
    }

    default void e() {
    }

    default void f(NotificationCSatRate notificationCSatRate) {
    }
}
