package com.yandex.go.scooters.driver_license_notification.domain;

import android.content.Context;
import com.yandex.go.scooters.driver_license_notification.ScootersDriverLicenseNotification;
import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.tj60;
import defpackage.tse;
import defpackage.xno0;
import defpackage.y040;
import defpackage.yin0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.scooters.promotions.domain.a a;
    public final yin0 b;
    public final com.yandex.go.scooters.driver_license.data.a c;

    public c(com.yandex.go.scooters.promotions.domain.a aVar, yin0 yin0Var, com.yandex.go.scooters.driver_license.data.a aVar2) {
        this.a = aVar;
        this.b = yin0Var;
        this.c = aVar2;
    }

    public final m0 a(ScootersPromotionsScreen scootersPromotionsScreen) {
        return new m0(e.t(com.yandex.go.coroutines.b.d(new b(this.a.a(scootersPromotionsScreen)), new ScootersDriverLicenseNotificationInteractor$listenTopBannerCommunication$$inlined$start$1(null, null))), this.c.c, new ScootersDriverLicenseNotificationInteractor$listenNotification$1(3, null));
    }

    public final void b(xno0 xno0Var) {
        if (xno0Var != null) {
            y040 y040Var = this.b.a;
            new ScootersDriverLicenseNotification((Context) y040Var.a.get(), (pav) y040Var.b.get(), y040Var.c, (tse) y040Var.d.get(), (pwy0) y040Var.e.get(), (tj60) y040Var.f.get(), xno0Var).showNotification();
        }
    }
}
