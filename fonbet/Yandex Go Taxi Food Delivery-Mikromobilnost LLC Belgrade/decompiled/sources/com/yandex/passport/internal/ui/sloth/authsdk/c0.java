package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.ds31;
import defpackage.tje;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class c0 extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;

    public c0(wkh wkhVar) {
        this.b = wkhVar;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(wkhVar);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }

    public final void W(b0 b0Var) {
        tje.N(ds31.a(this), null, null, new AuthSdkSlothComposeViewModel$onWish$1(this, b0Var, null), 3);
    }
}
