package com.yandex.go.navigator.incidents.report;

import com.yandex.go.navigator.driving.DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1;
import com.yandex.go.navigator.driving.r;
import defpackage.apv;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v3j0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class a {
    public final apv a;
    public final r b;
    public final tt2 c;
    public final AtomicInteger d = new AtomicInteger(0);

    public a(apv apvVar, r rVar, tt2 tt2Var) {
        this.a = apvVar;
        this.b = rVar;
        this.c = tt2Var;
    }

    public final Object a(v3j0 v3j0Var, DrivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1 drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new IncidentErrorIntercator$mapToNotification$2(v3j0Var, this, null), drivingNotificationsRepository$observeEvents$$inlined$mapNotNull$2$2$1);
    }
}
