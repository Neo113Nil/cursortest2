package com.yandex.go.messenger_native;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;

/* loaded from: classes8.dex */
public final class a implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final tt2 c;
    public final h3y d;
    public final h3y e;

    public a(tse tseVar, Lifecycle lifecycle, tt2 tt2Var, h3y h3yVar, h3y h3yVar2) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = tt2Var;
        this.d = h3yVar;
        this.e = h3yVar2;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "NativeMessengerAuthorizationListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new NativeMessengerAuthorizationListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
