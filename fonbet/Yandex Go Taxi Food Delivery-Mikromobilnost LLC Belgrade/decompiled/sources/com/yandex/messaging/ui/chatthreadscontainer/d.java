package com.yandex.messaging.ui.chatthreadscontainer;

import defpackage.bj10;
import defpackage.bvf0;
import defpackage.c8u;
import defpackage.cab;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.g92;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.o430;
import defpackage.o7u;
import defpackage.qff;
import defpackage.sc5;
import defpackage.u5t;
import defpackage.wsr0;
import defpackage.x9b;
import defpackage.xsr0;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class d extends sc5 {
    public final r0 w;
    public final r0 x;
    public final gci0 y;

    public d(x9b x9bVar, u5t u5tVar, com.yandex.messaging.domain.chatlist.c cVar, com.yandex.messaging.domain.threads.c cVar2, com.yandex.messaging.domain.folders.c cVar3, bj10 bj10Var) {
        boolean z = bj10Var.c;
        r0 c = bvf0.c(x9bVar.b);
        this.w = c;
        r0 c2 = bvf0.c(Boolean.TRUE);
        this.x = c2;
        ha2 l = e.l(c, c2, new m0(u5t.d(u5tVar), z ? cVar.a(new o7u(null)) : new g92(2, Boolean.FALSE), new ChatThreadsContainerViewModel$createChatsTabFlow$1(3, null)), new m0(u5t.d(u5tVar), z ? cVar2.a(new c8u(null)) : new g92(2, Boolean.FALSE), new ChatThreadsContainerViewModel$createThreadsTabFlow$1(3, null)), new qff(e.d(cVar3.a.a), 0), new ChatThreadsContainerViewModel$uiState$1(null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        this.y = e.R(l, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), new cab(0));
    }
}
