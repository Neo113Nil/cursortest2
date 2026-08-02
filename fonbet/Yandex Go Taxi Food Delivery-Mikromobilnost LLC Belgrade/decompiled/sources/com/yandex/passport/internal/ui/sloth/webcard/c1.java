package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.d7;
import defpackage.ds31;
import defpackage.fse;
import defpackage.lse;
import defpackage.mse;
import defpackage.tje;

/* loaded from: classes2.dex */
public final class c1 extends d7 implements mse {
    public final /* synthetic */ d1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var) {
        super(lse.a);
        this.a = d1Var;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        d1 d1Var = this.a;
        tje.N(ds31.a(d1Var), null, null, new WebCardSlothViewModel$handler$1$1(d1Var, th, null), 3);
    }
}
