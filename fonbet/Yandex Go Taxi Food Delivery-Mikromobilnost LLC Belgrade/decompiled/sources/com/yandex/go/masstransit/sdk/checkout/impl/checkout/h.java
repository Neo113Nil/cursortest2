package com.yandex.go.masstransit.sdk.checkout.impl.checkout;

import defpackage.b2k;
import defpackage.fnb;
import defpackage.ha2;
import defpackage.mth;
import defpackage.teb;
import defpackage.tpr;
import defpackage.vng;
import defpackage.yk;
import defpackage.yt11;

/* loaded from: classes12.dex */
public final class h implements yt11 {
    public final i a;
    public final ha2 b;
    public final b2k c;
    public final b2k d;

    public h(fnb fnbVar, i iVar) {
        this.a = iVar;
        ha2 l = kotlinx.coroutines.flow.e.l(fnbVar.c, fnbVar.e, fnbVar.g, fnbVar.i, fnbVar.k, new CheckoutUiStateInteractor$uiStateFlow$1(this, null));
        this.b = l;
        mth mthVar = new mth(new e(l), 6);
        teb tebVar = new teb(18);
        yk ykVar = vng.c;
        this.c = vng.l(mthVar, tebVar, ykVar);
        this.d = vng.l(new g(new c(l)), new teb(19), ykVar);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }
}
