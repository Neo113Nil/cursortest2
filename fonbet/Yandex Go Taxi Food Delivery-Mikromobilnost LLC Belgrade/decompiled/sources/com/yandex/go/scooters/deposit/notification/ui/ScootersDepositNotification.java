package com.yandex.go.scooters.deposit.notification.ui;

import android.content.Context;
import defpackage.ben0;
import defpackage.een0;
import defpackage.oyr;
import defpackage.r3h0;
import defpackage.sls;
import defpackage.tje;
import defpackage.u8w;
import defpackage.vfc0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.random.Random;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/go/scooters/deposit/notification/ui/ScootersDepositNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Leen0;", "scootersDepositNotificationPresenter", "<init>", "(Landroid/content/Context;Leen0;)V", "Lzy11;", "setDepositImage", "(Lru/yandex/taxi/design/ListItemComponent;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Leen0;", "listItemComponent", "Lru/yandex/taxi/design/ListItemComponent;", "", "currentNotificationId", "Ljava/lang/String;", "getCurrentNotificationId", "()Ljava/lang/String;", "getNotificationId", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "ben0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDepositNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private final String currentNotificationId;
    private final ListItemComponent listItemComponent;
    private final een0 scootersDepositNotificationPresenter;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.deposit.notification.ui.ScootersDepositNotification$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            een0 een0Var = (een0) this.receiver;
            u8w u8wVar = een0Var.x;
            u8wVar.getClass();
            u8wVar.a.a("ScootersDepositNotification.Tapped", new HashMap(), 1, new HashMap());
            een0Var.A.invoke();
            return zy11.a;
        }
    }

    public ScootersDepositNotification(Context context, een0 een0Var) {
        super(context, null, 0, 6, null);
        this.scootersDepositNotificationPresenter = een0Var;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        this.listItemComponent = listItemComponent;
        Random.a.getClass();
        this.currentNotificationId = oyr.i(Random.b.b(), "SCOOTERS_DEPOSIT_NOTIFICATION_ID");
        setDepositImage(listItemComponent);
        listItemComponent.setTrailMode(2);
        setChild(listItemComponent);
        c.z(new AnonymousClass2(0, een0Var, een0.class, "notificationClicked", "notificationClicked$impl()V", 0), this);
        setDetachListener(new vfc0(28, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ScootersDepositNotification scootersDepositNotification, boolean z) {
        scootersDepositNotification.scootersDepositNotificationPresenter.B.invoke();
    }

    private final void setDepositImage(ListItemComponent listItemComponent) {
        listItemComponent.setLeadImage(r3h0.ic_coins_circle);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setDepositImage(this.listItemComponent);
    }

    public final String getCurrentNotificationId() {
        return this.currentNotificationId;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.currentNotificationId;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        een0 een0Var = this.scootersDepositNotificationPresenter;
        ben0 ben0Var = new ben0(this);
        een0Var.Bg(ben0Var);
        u8w u8wVar = een0Var.x;
        u8wVar.getClass();
        u8wVar.a.a("ScootersDepositNotification.Shown", new HashMap(), 1, new HashMap());
        tje.N(een0Var.Jg(), null, null, new ScootersDepositNotificationPresenter$attachView$1(ben0Var, een0Var, null), 3);
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersDepositNotificationPresenter.Cg();
    }
}
