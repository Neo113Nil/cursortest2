package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.a2a;
import defpackage.bvf0;
import defpackage.dw;
import defpackage.ike;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes12.dex */
public final class a implements dw {
    public final a2a a;
    public final ike b;

    public a(tt2 tt2Var, a2a a2aVar) {
        this.a = a2aVar;
        tt2Var.getClass();
        this.b = bvf0.a(uyj.a);
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.b, null, null, new ChargersActionHandler$handle$1(this, (o) krVar, null), 3);
    }
}
