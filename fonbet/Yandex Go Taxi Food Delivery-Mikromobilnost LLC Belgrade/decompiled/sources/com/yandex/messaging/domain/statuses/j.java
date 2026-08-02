package com.yandex.messaging.domain.statuses;

import defpackage.au21;
import defpackage.h3y;
import defpackage.kse;
import defpackage.tpr;
import defpackage.ut21;
import defpackage.yt21;

/* loaded from: classes15.dex */
public final class j {
    public final au21 a;
    public final yt21 b;
    public final kse c;
    public final ut21 d;
    public final h3y e;
    public final h3y f;

    public j(au21 au21Var, yt21 yt21Var, kse kseVar, ut21 ut21Var, h3y h3yVar, h3y h3yVar2) {
        this.a = au21Var;
        this.b = yt21Var;
        this.c = kseVar;
        this.d = ut21Var;
        this.e = h3yVar;
        this.f = h3yVar2;
    }

    public final tpr a(String str) {
        return kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.i(new UserStatusController$subscribeOnUserStatus$1(this, str, null)), this.c.e);
    }
}
