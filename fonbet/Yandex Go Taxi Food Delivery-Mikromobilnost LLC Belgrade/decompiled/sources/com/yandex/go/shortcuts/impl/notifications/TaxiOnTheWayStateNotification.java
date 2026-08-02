package com.yandex.go.shortcuts.impl.notifications;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.dzg0;
import defpackage.kxx0;
import defpackage.y3h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bk\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001c\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001c\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/yandex/go/shortcuts/impl/notifications/TaxiOnTheWayStateNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "title", "formattedCarInfo", "Lru/yandex/taxi/object/DriveState;", "orderState", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "onClickListener", "onDetachListener", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/object/DriveState;Ljava/lang/Runnable;Ljava/lang/Runnable;Landroid/util/AttributeSet;I)V", "", "removedManually", "Lzy11;", "onDetachNotification", "(Z)V", "onNotificationClick", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ljava/lang/String;", "Lru/yandex/taxi/object/DriveState;", "Ljava/lang/Runnable;", "view", "Lru/yandex/taxi/design/ListItemComponent;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "kxx0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxiOnTheWayStateNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private static final kxx0 Companion = new kxx0();

    @Deprecated
    public static final String NOTIFICATION_ID = "TaxiOnTheWayStateNotification";
    private final String formattedCarInfo;
    private final Runnable onClickListener;
    private final Runnable onDetachListener;
    private final String orderId;
    private final DriveState orderState;
    private final String title;
    private final ListItemComponent view;

    public TaxiOnTheWayStateNotification(Context context, String str, String str2, String str3, DriveState driveState, Runnable runnable, Runnable runnable2, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.orderId = str;
        this.title = str2;
        this.formattedCarInfo = str3;
        this.orderState = driveState;
        this.onClickListener = runnable;
        this.onDetachListener = runnable2;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str2);
        listItemComponent.setSubtitle(str3);
        listItemComponent.setTrailImage(dzg0.chevron_next);
        listItemComponent.setLeadImage(y3h0.ic_car_yellow);
        this.view = listItemComponent;
        setChild(listItemComponent);
        setFocusable(true);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.view.setTrailImage(dzg0.chevron_next);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return NOTIFICATION_ID + this.orderId + this.orderState;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        Runnable runnable;
        super.onDetachNotification(removedManually);
        if (!removedManually || (runnable = this.onDetachListener) == null) {
            return;
        }
        runnable.run();
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onNotificationClick() {
        Runnable runnable = this.onClickListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public TaxiOnTheWayStateNotification(Context context, String str, String str2, String str3, DriveState driveState, Runnable runnable) {
        this(context, str, str2, str3, driveState, runnable, null, null, 0, 448, null);
    }

    public TaxiOnTheWayStateNotification(Context context, String str, String str2, String str3, DriveState driveState, Runnable runnable, Runnable runnable2) {
        this(context, str, str2, str3, driveState, runnable, runnable2, null, 0, 384, null);
    }

    public TaxiOnTheWayStateNotification(Context context, String str, String str2, String str3, DriveState driveState, Runnable runnable, Runnable runnable2, AttributeSet attributeSet) {
        this(context, str, str2, str3, driveState, runnable, runnable2, attributeSet, 0, 256, null);
    }

    public TaxiOnTheWayStateNotification(Context context, String str, String str2, String str3, DriveState driveState) {
        this(context, str, str2, str3, driveState, null, null, null, 0, 480, null);
    }

    public /* synthetic */ TaxiOnTheWayStateNotification(Context context, String str, String str2, String str3, DriveState driveState, Runnable runnable, Runnable runnable2, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, driveState, (i2 & 32) != 0 ? null : runnable, (i2 & 64) != 0 ? null : runnable2, (i2 & 128) != 0 ? null : attributeSet, (i2 & 256) != 0 ? 0 : i);
    }
}
