package com.yandex.passport.internal.ui.sloth.screen;

import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.v;
import defpackage.ds31;
import defpackage.tje;
import defpackage.yr31;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class i extends yr31 {
    public final c1 b;
    public final n0 c;
    public final n0 w;

    public i(c1 c1Var) {
        this.b = c1Var;
        v vVar = c1Var.c;
        this.c = vVar.d;
        this.w = vVar.e;
        tje.N(ds31.a(this), null, null, new SlothScreenViewModel$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.close();
    }
}
