package com.yandex.go.vault.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.f1h0;
import defpackage.uwg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/vault/ui/VaultErrorNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "notificationId", "", "title", "text", "context", "Landroid/content/Context;", "notEnoughKeys", "", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLandroid/util/AttributeSet;I)V", "getNotificationId", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultErrorNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private final String notificationId;

    public VaultErrorNotification(String str, String str2, String str3, Context context, boolean z, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.notificationId = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        if (str2 != null && str2.length() != 0) {
            listItemComponent.setTitle(str2);
        }
        if (str3 != null && str3.length() != 0) {
            listItemComponent.setSubtitle(str3);
        }
        listItemComponent.setLeadImage(z ? uwg0.ic_not_enough_keys : f1h0.ic_cross_ban);
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }

    public /* synthetic */ VaultErrorNotification(String str, String str2, String str3, Context context, boolean z, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, context, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : attributeSet, (i2 & 64) != 0 ? 0 : i);
    }
}
