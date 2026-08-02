package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes9.dex */
public final class bxx0 {
    public final r0 a = bvf0.c(Boolean.FALSE);
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();

    public final void a(tj60 tj60Var) {
        if (this.c.get(tj60Var) != null) {
            return;
        }
        axx0 axx0Var = new axx0(this);
        NotificationStackComponent notificationStackComponent = tj60Var.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.addListener(axx0Var);
        }
        NotificationStackComponent notificationStackComponent2 = tj60Var.a;
        NotificationItemComponent<?> topNotificationItem = notificationStackComponent2 != null ? notificationStackComponent2.getTopNotificationItem() : null;
        if (topNotificationItem != null) {
            String notificationId = topNotificationItem.getNotificationId();
            this.b.add(notificationId);
            qv10.B(!r1.isEmpty(), this.a, null);
        }
    }
}
