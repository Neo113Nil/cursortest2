package com.yandex.go.loyalty.impl.common.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.jvz;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.zvz;

/* loaded from: classes.dex */
public final class l implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final h3y c;
    public final h3y d;
    public final ru.yandex.taxi.am.m e;
    public final zvz f;
    public final jvz g;

    public l(tse tseVar, Lifecycle lifecycle, h3y h3yVar, h3y h3yVar2, ru.yandex.taxi.am.m mVar, zvz zvzVar, jvz jvzVar) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = mVar;
        this.f = zvzVar;
        this.g = jvzVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LoyaltyStateFCPListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new LoyaltyStateFCPListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
