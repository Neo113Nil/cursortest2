package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.a;
import ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui.TariffUnavailableNotificationComponent;

/* loaded from: classes6.dex */
public final class epx0 extends a {
    public final tj60 a;
    public final dpx0 b;
    public final ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a c;
    public final co40 d;
    public final String e = TariffUnavailableNotificationComponent.NOTIFICATION_ID;

    public epx0(tj60 tj60Var, dpx0 dpx0Var, ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a aVar, co40 co40Var) {
        this.a = tj60Var;
        this.b = dpx0Var;
        this.c = aVar;
        this.d = co40Var;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final a.AbstractC0120a b() {
        return this.b;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final String c() {
        return this.e;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final tj60 d() {
        return this.a;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final Object f(NotificationItemComponent notificationItemComponent, pk60 pk60Var, Continuation continuation) {
        hpx0 hpx0Var = (hpx0) pk60Var;
        String str = hpx0Var.a;
        String str2 = hpx0Var.b;
        co40 co40Var = this.d;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("title", str);
        if (str2 != null) {
            hashMap.put("subtitle", str2);
        }
        co40Var.a.a("TariffUnavailableNotification.Shown", hashMap, 1, new HashMap());
        r0 r0Var = this.c.B;
        r0Var.getClass();
        r0Var.m(null, hpx0Var);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final boolean h(NotificationItemComponent notificationItemComponent, pk60 pk60Var) {
        return !jl40.l((hpx0) pk60Var, hpx0.e) && (notificationItemComponent instanceof TariffUnavailableNotificationComponent);
    }
}
