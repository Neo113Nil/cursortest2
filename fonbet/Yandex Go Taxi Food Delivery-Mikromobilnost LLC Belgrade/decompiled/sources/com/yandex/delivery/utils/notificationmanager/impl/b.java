package com.yandex.delivery.utils.notificationmanager.impl;

import defpackage.bi60;
import defpackage.bvf0;
import defpackage.f92;
import defpackage.ike;
import defpackage.rol0;
import defpackage.sb2;
import defpackage.st2;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class b implements bi60 {
    public final kotlinx.coroutines.channels.a a = sb2.a(Integer.MAX_VALUE, null, null, 6);
    public final f92 b;

    public b(st2 st2Var) {
        rol0 rol0Var = new rol0(new NotificationManagerImpl$requestFlow$1(this, null));
        ike a = bvf0.a(st2Var.a);
        xsr0.a.getClass();
        this.b = new f92(e.O(rol0Var, a, wsr0.c, 1), 3);
    }
}
