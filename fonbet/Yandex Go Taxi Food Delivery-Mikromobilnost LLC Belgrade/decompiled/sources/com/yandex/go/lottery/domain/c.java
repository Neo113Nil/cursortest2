package com.yandex.go.lottery.domain;

import com.yandex.go.lottery.experiment.LotteryMenuItemExperiment;
import defpackage.jbh;
import defpackage.jqr;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.wrz;
import defpackage.y50;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class c {
    public final y50 a;
    public final wrz b;
    public final qqo c;

    public c(y50 y50Var, wrz wrzVar, rqo rqoVar) {
        this.a = y50Var;
        this.b = wrzVar;
        LotteryMenuItemExperiment.Companion.getClass();
        this.c = ((jbh) rqoVar).c(LotteryMenuItemExperiment.i);
    }

    public final jqr a() {
        return new jqr(e.t(new b(this.c.a(), this)), new LotteryMenuItemUiStateInteractorImpl$uiStateFlow$2(this, null), 3);
    }
}
