package com.yandex.go.taxi.tariffs.analytics;

import defpackage.tje;
import defpackage.tse;

/* loaded from: classes14.dex */
public final class c {
    public final tse a;
    public final com.yandex.go.navigation.screen.c b;
    public kotlinx.coroutines.c c = kotlinx.coroutines.a.a();
    public boolean d;

    public c(tse tseVar, com.yandex.go.navigation.screen.c cVar) {
        this.a = tseVar;
        this.b = cVar;
    }

    public final void a(boolean z) {
        this.d = z;
        if (this.c.isActive()) {
            return;
        }
        this.c = tje.N(this.a, null, null, new TariffPreSelectedAnalyticsRepositoryImpl$activateOutsideSummaryListener$1(this, null), 3);
    }
}
