package com.yandex.go.taxi.order.change.common.notification;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import defpackage.mb9;
import defpackage.nb9;
import defpackage.ob9;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/taxi/order/change/common/notification/ChangeOrderItemNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "id", "", "title", "subtitle", "Lob9;", "icon", "Lcom/yandex/go/taxi/order/models/api/response/ChangeOrderNotificationActionResponse;", "action", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lob9;Lcom/yandex/go/taxi/order/models/api/response/ChangeOrderNotificationActionResponse;)V", "", "getTrailMode", "(Lcom/yandex/go/taxi/order/models/api/response/ChangeOrderNotificationActionResponse;)I", "Lzy11;", "setIcon", "(Lru/yandex/taxi/design/ListItemComponent;Lob9;)V", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChangeOrderItemNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final String id;

    public ChangeOrderItemNotification(Context context, String str, CharSequence charSequence, CharSequence charSequence2, ob9 ob9Var, ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse) {
        super(context, null, 0, 6, null);
        this.id = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(charSequence);
        listItemComponent.setSubtitle(charSequence2);
        listItemComponent.setTrailMode(getTrailMode(changeOrderNotificationActionResponse));
        setIcon(listItemComponent, ob9Var);
        setChild(listItemComponent);
    }

    private final int getTrailMode(ChangeOrderNotificationActionResponse action) {
        return action != ChangeOrderNotificationActionResponse.NONE ? 2 : 0;
    }

    private final void setIcon(ListItemComponent listItemComponent, ob9 ob9Var) {
        if (ob9Var instanceof nb9) {
            listItemComponent.setLeadImage(((nb9) ob9Var).a);
        } else if (ob9Var instanceof mb9) {
            listItemComponent.setLeadImage(((mb9) ob9Var).a);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.id;
    }
}
