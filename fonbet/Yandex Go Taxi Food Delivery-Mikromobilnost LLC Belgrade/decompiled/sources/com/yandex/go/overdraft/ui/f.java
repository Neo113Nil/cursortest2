package com.yandex.go.overdraft.ui;

import defpackage.m20;
import defpackage.tje;

/* loaded from: classes8.dex */
public final class f implements m20 {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.m20
    public final void b() {
        g gVar = this.a;
        tje.N(gVar.z.c(), null, null, new OverdraftStateBarControllerImpl$start$1$onActiveOrderListChanged$1(gVar, null), 3);
    }
}
