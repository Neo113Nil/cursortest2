package com.yandex.go.scooters.driver_license_notification;

import android.content.Context;
import com.yandex.go.scooters.promotions.api.domain.model.ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;
import com.yandex.go.scooters.promotions.api.domain.model.ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;
import defpackage.ehn0;
import defpackage.l8x;
import defpackage.lg21;
import defpackage.mg21;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wz1;
import defpackage.xin0;
import defpackage.xng0;
import defpackage.xno0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/yandex/go/scooters/driver_license_notification/ScootersDriverLicenseNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lyvf0;", "Llg21;", "uriRouter", "Ltse;", "coroutineScope", "Lpwy0;", "themeSwitcherProvider", "Ltj60;", "notificationStackHolder", "Lxno0;", "topBannerCommunication", "<init>", "(Landroid/content/Context;Lpav;Lyvf0;Ltse;Lpwy0;Ltj60;Lxno0;)V", "Lcom/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;", "style", "Lzy11;", "applyStyle", "(Lcom/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;)V", "showNotification", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "canBeDismissedBySwipe", "()Z", "", "provideDurationTime", "()J", "Lpav;", "Lyvf0;", "Ltse;", "Lpwy0;", "Ltj60;", "Lxno0;", "listItemComponent", "Lru/yandex/taxi/design/ListItemComponent;", "Ll8x;", "job", "Ll8x;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final tse coroutineScope;
    private final pav imageLoader;
    private l8x job;
    private final ListItemComponent listItemComponent;
    private final tj60 notificationStackHolder;
    private final pwy0 themeSwitcherProvider;
    private final xno0 topBannerCommunication;
    private final yvf0 uriRouter;

    public ScootersDriverLicenseNotification(Context context, pav pavVar, yvf0 yvf0Var, tse tseVar, pwy0 pwy0Var, tj60 tj60Var, xno0 xno0Var) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.uriRouter = yvf0Var;
        this.coroutineScope = tseVar;
        this.themeSwitcherProvider = pwy0Var;
        this.notificationStackHolder = tj60Var;
        this.topBannerCommunication = xno0Var;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        this.listItemComponent = listItemComponent;
        setChild(listItemComponent);
        c.z(new ehn0(2, this), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ScootersDriverLicenseNotification scootersDriverLicenseNotification) {
        ((mg21) ((lg21) scootersDriverLicenseNotification.uriRouter.get())).c(scootersDriverLicenseNotification.topBannerCommunication.d);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle style) {
        int i = xin0.a[style.ordinal()];
        if (i == 1) {
            this.listItemComponent.setTitleTextColor(qje.t(xng0.textMain, getContext()));
            this.listItemComponent.setSubtitleTextColor(qje.t(xng0.textMinor, getContext()));
            return;
        }
        if (i == 2) {
            int t = qje.t(xng0.everFront, getContext());
            this.listItemComponent.setTitleTextColor(t);
            this.listItemComponent.setSubtitleTextColor(t);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            int t2 = qje.t(xng0.textOnError, getContext());
            this.listItemComponent.setTitleTextColor(t2);
            this.listItemComponent.setSubtitleTextColor(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNotification$lambda$0$0(ScootersDriverLicenseNotification scootersDriverLicenseNotification) {
        scootersDriverLicenseNotification.notificationStackHolder.c(scootersDriverLicenseNotification.topBannerCommunication.a);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: canBeDismissedBySwipe */
    public boolean getIsDismissible() {
        Boolean bool = this.topBannerCommunication.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return this.topBannerCommunication.a;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority = this.topBannerCommunication.i;
        int i = scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority == null ? -1 : xin0.b[scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.ordinal()];
        if (i != 1) {
            return (i == 2 || i != 3) ? 2 : 1;
        }
        return 3;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.job = tje.N(this.coroutineScope, null, null, new ScootersDriverLicenseNotification$onAttachedToWindow$$inlined$collectIn$1(this.themeSwitcherProvider.a(), null, this), 3);
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.job;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.job = null;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime */
    public long getDuration() {
        if (this.topBannerCommunication.h == null) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        return TimeUnit.SECONDS.toMillis(r3.intValue());
    }

    public final void showNotification() {
        if (this.notificationStackHolder.a(this.topBannerCommunication.a) == null) {
            tj60 tj60Var = this.notificationStackHolder;
            setExpiresListener(new wz1(15, this));
            tj60Var.d(this);
        }
    }
}
