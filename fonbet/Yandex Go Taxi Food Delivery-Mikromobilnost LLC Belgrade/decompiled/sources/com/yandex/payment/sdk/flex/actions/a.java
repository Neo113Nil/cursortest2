package com.yandex.payment.sdk.flex.actions;

import defpackage.fgr;
import defpackage.lz40;
import defpackage.mgr;
import defpackage.tje;
import defpackage.tse;
import defpackage.vfr;
import defpackage.yfr;

/* loaded from: classes2.dex */
public final class a implements vfr {
    public final lz40 a;
    public final lz40 b;
    public final tse c;

    public a(lz40 lz40Var, lz40 lz40Var2, tse tseVar) {
        this.a = lz40Var;
        this.b = lz40Var2;
        this.c = tseVar;
    }

    @Override // defpackage.vfr
    public final void a(mgr mgrVar, yfr yfrVar) {
        fgr fgrVar = (fgr) mgrVar;
        SendExternalEventActionHandler$handle$1 sendExternalEventActionHandler$handle$1 = new SendExternalEventActionHandler$handle$1(this, fgrVar, null);
        tse tseVar = this.c;
        tje.N(tseVar, null, null, sendExternalEventActionHandler$handle$1, 3);
        tje.N(tseVar, null, null, new SendExternalEventActionHandler$handle$2(this, fgrVar, null), 3);
    }

    @Override // defpackage.vfr
    public final String b() {
        return "SendExternalEventAction";
    }
}
