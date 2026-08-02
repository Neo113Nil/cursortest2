package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.cvw;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class e0 extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;
    public final kotlinx.coroutines.flow.b w;

    public e0(wkh wkhVar) {
        this.b = wkhVar;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(wkhVar);
        this.w = cvw.F(wkhVar);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }

    public final void W(d0 d0Var) {
        this.b.a(d0Var);
    }
}
