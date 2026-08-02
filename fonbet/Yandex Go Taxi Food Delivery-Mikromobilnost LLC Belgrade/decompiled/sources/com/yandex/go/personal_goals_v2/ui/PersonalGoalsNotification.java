package com.yandex.go.personal_goals_v2.ui;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.f1h0;
import defpackage.kyh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u000f*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J%\u0010\u0013\u001a\u00020\u000f*\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/personal_goals_v2/ui/PersonalGoalsNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "", "id", "title", "subtitle", "Landroid/graphics/Bitmap;", "image", "", "isError", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLandroid/content/Context;)V", "Lzy11;", "setupTitle", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;Z)V", "setupSubtitle", "setupImage", "(Lru/yandex/taxi/design/ListItemComponent;Landroid/graphics/Bitmap;Z)V", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersonalGoalsNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final String id;

    public PersonalGoalsNotification(String str, String str2, String str3, Bitmap bitmap, boolean z, Context context) {
        super(context, null, 0);
        this.id = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        setupTitle(listItemComponent, str2, z);
        setupSubtitle(listItemComponent, str3, z);
        setupImage(listItemComponent, bitmap, z);
        setChild(listItemComponent);
    }

    private final void setupImage(ListItemComponent listItemComponent, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            listItemComponent.setLeadImage(bitmap);
        } else {
            listItemComponent.setLeadImage(z ? f1h0.ic_cross_ban : f1h0.ic_success_change);
        }
    }

    private final void setupSubtitle(ListItemComponent listItemComponent, String str, boolean z) {
        if (str != null && str.length() != 0) {
            listItemComponent.setSubtitle(str);
        } else if (z) {
            listItemComponent.setSubtitle(kyh0.strongbox_data_load_failed_notification_subtitle);
        }
    }

    private final void setupTitle(ListItemComponent listItemComponent, String str, boolean z) {
        if (str == null || str.length() == 0) {
            listItemComponent.setTitle(z ? kyh0.superapp_crosschallenge_notifiction_error_title : kyh0.superapp_crosschallenge_notifiction_done_title);
        } else {
            listItemComponent.setTitle(str);
        }
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.id;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }
}
