package com.yandex.go.loyalty.impl.common.lcp;

import defpackage.lz60;
import defpackage.mdh;
import defpackage.n20;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zvz;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final tse a;
    public final tt2 b;
    public final n20 c;
    public final zvz d;

    public a(tse tseVar, tt2 tt2Var, n20 n20Var, zvz zvzVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = n20Var;
        this.d = zvzVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new UpdateLoyaltyOnOrderFinishedLcpListener$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UpdateLoyaltyOnOrderCompleteLcpListener";
    }
}
