package com.yandex.go.taxi.order.notifications.multiclass;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.ag60;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/notifications/multiclass/OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "notificationId", "Lkotlin/Function0;", "Lzy11;", "dismissListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lsls;)V", "Lag60;", "notification", "update", "(Lag60;)V", "", "removedManually", "onDetachNotification", "(Z)V", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "Lsls;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    private sls dismissListener;
    private final String notificationId;

    public OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent(Context context, String str, sls slsVar) {
        super(context, null, 0, 6, null);
        this.notificationId = str;
        this.dismissListener = slsVar;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        sls slsVar;
        super.onDetachNotification(removedManually);
        if (removedManually && (slsVar = this.dismissListener) != null) {
            slsVar.invoke();
        }
    }

    public final void update(ag60 notification) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(notification.a);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setChild(listItemComponent);
    }

    public /* synthetic */ OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent(Context context, String str, sls slsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : slsVar);
    }
}
