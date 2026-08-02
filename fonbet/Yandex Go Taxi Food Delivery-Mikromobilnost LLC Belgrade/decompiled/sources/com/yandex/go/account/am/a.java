package com.yandex.go.account.am;

import defpackage.lz60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final tse a;
    public final tt2 b;
    public final com.yandex.go.account.am.domain.a c;

    public a(tse tseVar, tt2 tt2Var, com.yandex.go.account.am.domain.a aVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = aVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new SyncPassportListener$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SyncPassportListener";
    }
}
