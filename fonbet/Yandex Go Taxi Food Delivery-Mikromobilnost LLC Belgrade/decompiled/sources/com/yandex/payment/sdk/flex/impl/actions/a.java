package com.yandex.payment.sdk.flex.impl.actions;

import defpackage.k5c;
import defpackage.kr;
import defpackage.mgr;
import defpackage.n6u;
import defpackage.nw4;
import defpackage.tje;
import defpackage.tph;
import defpackage.vfr;
import defpackage.zfr;

/* loaded from: classes2.dex */
public final class a extends nw4 {
    public final k5c c;

    public a(vfr vfrVar, k5c k5cVar) {
        super(vfrVar, null);
        this.c = k5cVar;
    }

    @Override // defpackage.nw4
    public final mgr a(kr krVar, n6u n6uVar) {
        return new zfr();
    }

    @Override // defpackage.nw4, defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.c, null, null, new DelayedActionHandler$handle$1((tph) krVar, n6uVar, null), 3);
    }
}
