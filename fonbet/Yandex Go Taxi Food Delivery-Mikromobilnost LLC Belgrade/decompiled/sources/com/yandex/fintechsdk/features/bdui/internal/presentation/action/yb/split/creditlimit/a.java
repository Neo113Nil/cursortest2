package com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.creditlimit;

import defpackage.fp51;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.ns31;
import defpackage.q2r0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final ns31 a;
    public final fp51 b;

    public a(ns31 ns31Var, fp51 fp51Var) {
        this.a = ns31Var;
        this.b = fp51Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        tse tseVar;
        fp51 fp51Var;
        if (!(ig5Var instanceof q2r0) || (tseVar = (tse) this.a.a()) == null || (fp51Var = this.b) == null) {
            return;
        }
        tje.N(tseVar, null, null, new SetCreditLimitPurchaseSettingsActionHandler$handle$1(ig5Var, fp51Var, jh5Var, null), 3);
    }
}
