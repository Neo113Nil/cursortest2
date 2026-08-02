package com.yandex.go.lib_integration.di;

import defpackage.ol40;
import defpackage.ufu;
import defpackage.v7p;
import defpackage.w7y0;
import defpackage.wa90;
import defpackage.wvy0;
import defpackage.xvf0;

/* loaded from: classes.dex */
public final class a implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;

    public a(w7y0 w7y0Var, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = w7y0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        wvy0 wvy0Var = (wvy0) this.a.get();
        return new ufu((wa90) this.b.get(), (ol40) this.c.get(), new LibViewDesignAppModule$Companion$provideColorConverter$1(wvy0Var, wvy0.class, "textColors", "getTextColors()Ljava/util/List;", 0), new LibViewDesignAppModule$Companion$provideColorConverter$2(wvy0Var, wvy0.class, "backgroundColors", "getBackgroundColors()Ljava/util/List;", 0), new LibViewDesignAppModule$Companion$provideColorConverter$3(wvy0Var, wvy0.class, "iconColors", "getIconColors()Ljava/util/List;", 0), new LibViewDesignAppModule$Companion$provideColorConverter$4(wvy0Var, wvy0.class, "controlColors", "getControlColors()Ljava/util/List;", 0));
    }
}
