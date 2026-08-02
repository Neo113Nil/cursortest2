package com.yandex.go.vault.di;

import defpackage.h3y;
import defpackage.q331;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ tse a;
    public final /* synthetic */ h3y b;
    public final /* synthetic */ q331 c;

    public /* synthetic */ a(tse tseVar, h3y h3yVar, q331 q331Var) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = q331Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tje.N(this.a, null, null, new VaultModule$Companion$provideSdkConfig$errorControllerFactory$1$1(this.b, this.c, null), 3);
        return zy11.a;
    }
}
