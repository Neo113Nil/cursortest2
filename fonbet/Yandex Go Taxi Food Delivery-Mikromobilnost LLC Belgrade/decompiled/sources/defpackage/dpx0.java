package defpackage;

import android.content.Context;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.a;
import ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui.TariffUnavailableNotificationComponent;

/* loaded from: classes6.dex */
public final class dpx0 extends a.AbstractC0120a {
    public final Context a;
    public final ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a b;

    public dpx0(Context context, ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a.AbstractC0120a
    public final NotificationItemComponent a() {
        return new TariffUnavailableNotificationComponent(this.a, this.b);
    }
}
