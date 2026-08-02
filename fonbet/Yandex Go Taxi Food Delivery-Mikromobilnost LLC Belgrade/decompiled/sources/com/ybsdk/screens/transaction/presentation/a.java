package com.ybsdk.screens.transaction.presentation;

import com.ybsdk.common.domain.b;
import defpackage.nbp0;
import defpackage.r6a0;
import defpackage.tje;

/* loaded from: classes2.dex */
public final class a {
    public final b a;
    public final r6a0 b;
    public final nbp0 c;

    public a(b bVar, r6a0 r6a0Var, nbp0 nbp0Var) {
        this.a = bVar;
        this.b = r6a0Var;
        this.c = nbp0Var;
    }

    public final void a() {
        tje.N(this.c.b, null, null, new BalanceUpdater$updateBalance$1(this, null), 3);
    }
}
