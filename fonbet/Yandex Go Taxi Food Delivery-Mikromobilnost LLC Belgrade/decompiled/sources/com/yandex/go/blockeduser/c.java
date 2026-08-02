package com.yandex.go.blockeduser;

import androidx.lifecycle.Lifecycle;
import defpackage.aj0;
import defpackage.g46;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vw60;

/* loaded from: classes.dex */
public final class c implements vw60 {
    public final Lifecycle a;
    public final tse b;
    public final oep0 c;
    public final com.yandex.go.blockeduser.data.c d;
    public final aj0 e;
    public g46 f;

    public c(Lifecycle lifecycle, tse tseVar, oep0 oep0Var, com.yandex.go.blockeduser.data.c cVar, aj0 aj0Var) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = oep0Var;
        this.d = cVar;
        this.e = aj0Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        tje.N(this.b, null, null, new BlockedUserActivityListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "BlockedUserActivityListener";
    }
}
