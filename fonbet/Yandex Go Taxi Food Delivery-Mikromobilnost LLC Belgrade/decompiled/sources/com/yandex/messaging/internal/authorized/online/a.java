package com.yandex.messaging.internal.authorized.online;

import defpackage.g370;
import defpackage.h3y;
import defpackage.kse;
import defpackage.tpr;
import defpackage.vse;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a {
    public final h3y a;
    public final kse b;
    public final g370 c;

    public a(h3y h3yVar, kse kseVar, g370 g370Var, vse vseVar) {
        this.a = h3yVar;
        this.b = kseVar;
        this.c = g370Var;
        vseVar.c(false);
    }

    public final tpr a(String str) {
        return e.F(e.i(new OnlineStatusController$onlineStatusFlow$1(str, this, null)), this.b.e);
    }
}
