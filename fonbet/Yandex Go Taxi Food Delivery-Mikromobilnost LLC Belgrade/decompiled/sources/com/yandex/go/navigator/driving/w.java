package com.yandex.go.navigator.driving;

import defpackage.bvf0;
import defpackage.bxl;
import defpackage.dpv;
import defpackage.hbp0;
import defpackage.tt2;
import defpackage.yov;
import defpackage.zov;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class w {
    public final r a;
    public final p0 b;
    public final yov c;
    public final zov d;
    public final dpv e;
    public final com.yandex.go.navigator.incidents.report.a f;
    public final tt2 g;
    public final r0 h;
    public final kotlinx.coroutines.flow.m0 i;
    public final hbp0 j;

    /* JADX WARN: Multi-variable type inference failed */
    public w(com.yandex.go.navigator.notifications.cartech.b bVar, r rVar, p0 p0Var, yov yovVar, zov zovVar, dpv dpvVar, com.yandex.go.navigator.incidents.report.a aVar, tt2 tt2Var) {
        this.a = rVar;
        this.b = p0Var;
        this.c = yovVar;
        this.d = zovVar;
        this.e = dpvVar;
        this.f = aVar;
        this.g = tt2Var;
        r0 c = bvf0.c(null);
        this.h = c;
        this.i = new kotlinx.coroutines.flow.m0(c, bVar.h, new DrivingNotificationsRepository$drivingNotificationFlow$1(3, null));
        this.j = new hbp0(new bxl(16, this), null, 0 == true ? 1 : 0, 6);
    }
}
