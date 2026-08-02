package com.yandex.go.transfer_requirement.mvp;

import defpackage.op01;
import defpackage.sy60;
import defpackage.tje;
import java.util.Calendar;

/* loaded from: classes14.dex */
public final class e implements sy60 {
    public final /* synthetic */ op01 a;

    public e(op01 op01Var) {
        this.a = op01Var;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1(Calendar calendar) {
        op01 op01Var = this.a;
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onTrainTimeRowClicked$1$onDateSelected$1(op01Var, calendar, null), 3);
    }
}
