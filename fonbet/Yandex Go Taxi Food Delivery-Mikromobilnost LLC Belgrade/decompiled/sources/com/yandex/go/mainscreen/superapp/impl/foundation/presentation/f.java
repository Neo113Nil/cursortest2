package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt00;

/* loaded from: classes.dex */
public final class f implements lz60 {
    public final tt00 a;
    public final tse b;

    public f(tt00 tt00Var, tse tseVar) {
        this.a = tt00Var;
        this.b = tseVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.b, null, null, new SuperAppMainScreenStateListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SuperAppMainScreenStateListener";
    }
}
