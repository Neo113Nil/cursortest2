package com.yandex.go.yb.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.hit;
import defpackage.jy60;
import defpackage.rqo;
import defpackage.tje;

/* loaded from: classes8.dex */
public final class j implements jy60 {
    public final Lifecycle a;
    public final h3y b;
    public final hit c;
    public final rqo d;

    public j(Lifecycle lifecycle, h3y h3yVar, hit hitVar, rqo rqoVar) {
        this.a = lifecycle;
        this.b = h3yVar;
        this.c = hitVar;
        this.d = rqoVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SdkActivatorLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.c.a, null, null, new SdkActivatorLifecycleListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
