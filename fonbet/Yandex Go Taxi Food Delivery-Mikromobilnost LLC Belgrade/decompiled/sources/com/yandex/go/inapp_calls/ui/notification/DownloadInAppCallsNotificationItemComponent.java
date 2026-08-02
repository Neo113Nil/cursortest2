package com.yandex.go.inapp_calls.ui.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.f7m;
import defpackage.oth0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/inapp_calls/ui/notification/DownloadInAppCallsNotificationItemComponent;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "addSpinnerAnimation", "(Lru/yandex/taxi/design/ListItemComponent;)V", "", "title", "subtitle", "init", "(Ljava/lang/String;Ljava/lang/String;)V", "onAttachedToWindow", "()V", "item", "Lru/yandex/taxi/design/ListItemComponent;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "getNotificationPriority", "()I", "notificationPriority", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DownloadInAppCallsNotificationItemComponent extends NotificationTimedItemComponent<ListItemComponent> {
    private ListItemComponent item;

    public DownloadInAppCallsNotificationItemComponent(Context context) {
        super(context, null, 0, 6, null);
    }

    private final void addSpinnerAnimation(ListItemComponent listItemComponent) {
        listItemComponent.setLeadView(LayoutInflater.from(listItemComponent.getContext()).inflate(oth0.downloading_spinner_view, (ViewGroup) null));
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return "DOWNLOADING_NOTIFICATION_ID";
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    public final void init(String title, String subtitle) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setTitle(title);
        listItemComponent.setSubtitle(subtitle);
        addSpinnerAnimation(listItemComponent);
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListItemComponent listItemComponent = this.item;
        if (listItemComponent != null) {
            post(new f7m(listItemComponent, 0));
        }
    }

    public DownloadInAppCallsNotificationItemComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
    }

    public DownloadInAppCallsNotificationItemComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
