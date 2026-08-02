package com.yandex.go.navigation.compose.notification;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import defpackage.co91;
import defpackage.mrg0;
import defpackage.pkv;
import defpackage.tje;
import defpackage.wls;
import kotlin.Metadata;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/navigation/compose/notification/InAppComposeNotification;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Landroidx/compose/ui/platform/ComposeView;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "content", "Lpkv;", "info", "<init>", "(Landroid/content/Context;Lwls;Lpkv;)V", "", "canBeDismissedBySwipe", "()Z", "Lpkv;", "getInfo$compose", "()Lpkv;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppComposeNotification extends NotificationItemComponent<ComposeView> {
    public static final int $stable = 8;
    private final pkv info;

    public InAppComposeNotification(Context context, wls wlsVar, pkv pkvVar) {
        super(context, null, 0, 6, null);
        this.info = pkvVar;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        co91.c(composeView, wlsVar);
        composeView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(mrg0.notification_component_corner_radius, composeView.getContext())));
        composeView.setClipToOutline(true);
        setChild(composeView);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: canBeDismissedBySwipe */
    public boolean getIsDismissible() {
        return this.info.b;
    }

    /* renamed from: getInfo$compose, reason: from getter */
    public final pkv getInfo() {
        return this.info;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getUid() {
        return this.info.a;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        this.info.getClass();
        return 1;
    }
}
