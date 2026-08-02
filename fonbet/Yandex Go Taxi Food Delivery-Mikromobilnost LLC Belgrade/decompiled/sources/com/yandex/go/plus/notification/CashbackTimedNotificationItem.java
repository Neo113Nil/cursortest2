package com.yandex.go.plus.notification;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/plus/notification/CashbackTimedNotificationItem;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "context", "Landroid/content/Context;", "title", "", "notificationId", "leadImage", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getNotificationId", "()Ljava/lang/String;", "listItemComponent", "getListItemComponent", "()Lru/yandex/taxi/design/ListItemComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CashbackTimedNotificationItem extends NotificationTimedItemComponent<ListItemComponent> {
    private final Bitmap leadImage;
    private final ListItemComponent listItemComponent;
    private final String notificationId;
    private final String title;

    public CashbackTimedNotificationItem(Context context, String str, String str2, Bitmap bitmap) {
        super(context, null, 0, 6, null);
        this.title = str;
        this.notificationId = str2;
        this.leadImage = bitmap;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str);
        if (bitmap != null) {
            listItemComponent.getLeadImageView().setImageBitmap(bitmap);
        }
        setChild(listItemComponent);
        this.listItemComponent = listItemComponent;
    }

    public final ListItemComponent getListItemComponent() {
        return this.listItemComponent;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }
}
