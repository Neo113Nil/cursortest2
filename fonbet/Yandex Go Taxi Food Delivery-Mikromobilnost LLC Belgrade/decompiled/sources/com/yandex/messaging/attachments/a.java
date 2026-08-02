package com.yandex.messaging.attachments;

import defpackage.d320;
import defpackage.h3y;
import defpackage.i5m;
import defpackage.nwf;
import defpackage.v7p;
import defpackage.w7g;
import defpackage.xvf0;

/* loaded from: classes15.dex */
public final class a implements v7p {
    public final xvf0 a;
    public final xvf0 b;

    public a(nwf nwfVar, xvf0 xvf0Var) {
        this.a = nwfVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        w7g w7gVar = (w7g) this.a.get();
        h3y a = i5m.a(this.b);
        e eVar = (e) d320.a.c(new AttachmentsController$DepsModule$provideController$1(0, w7gVar, w7g.class, "build", "build()Lcom/yandex/messaging/attachments/AttachmentsPluginDependencies;", 0));
        return eVar == null ? (e) a.get() : eVar;
    }
}
