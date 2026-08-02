package com.yandex.messaging.div;

import defpackage.b8g;
import defpackage.f320;
import defpackage.f8g;
import defpackage.h3y;
import defpackage.hkk;
import defpackage.i5m;
import defpackage.oti;
import defpackage.v7p;

/* loaded from: classes15.dex */
public final class b implements v7p {
    public final f8g a;
    public final oti b;

    public b(f8g f8gVar, oti otiVar) {
        this.a = f8gVar;
        this.b = otiVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        b8g b8gVar = (b8g) this.a.get();
        h3y a = i5m.a(this.b);
        DivPlugin c = f320.a.c(new DivController$DepsModule$provideController$1(0, b8gVar, b8g.class, "build", "build()Lcom/yandex/messaging/div/DivPluginDependencies;", 0));
        return c == null ? (hkk) a.get() : c;
    }
}
