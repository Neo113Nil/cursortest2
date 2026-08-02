package com.yandex.go.taxi.order.chat.call_feedback.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.m4h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/taxi/order/chat/call_feedback/ui/CallFeedbackTimedNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "notificationId", "", "title", "subtitle", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getNotificationId", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallFeedbackTimedNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private final String notificationId;

    public CallFeedbackTimedNotification(String str, String str2, String str3, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.notificationId = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str2);
        listItemComponent.setSubtitle(str3);
        listItemComponent.setLeadImage(m4h0.ic_call_feedback_check);
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }

    public /* synthetic */ CallFeedbackTimedNotification(String str, String str2, String str3, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, context, (i2 & 16) != 0 ? null : attributeSet, (i2 & 32) != 0 ? 0 : i);
    }
}
