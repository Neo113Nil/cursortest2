package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import androidx.lifecycle.g0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import defpackage.bdt;
import defpackage.c4v0;
import defpackage.drx0;
import defpackage.ftb;
import defpackage.fwa0;
import defpackage.jnd0;
import defpackage.jpd0;
import defpackage.mj31;
import defpackage.pmm0;
import defpackage.s570;
import defpackage.tls;
import defpackage.tnd0;
import defpackage.y8f;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj31 b;

    public /* synthetic */ b(mj31 mj31Var, int i) {
        this.a = i;
        this.b = mj31Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        mj31 mj31Var = this.b;
        y8f y8fVar = (y8f) obj;
        switch (i) {
            case 0:
                PlusTarifficatorMobileArguments plusTarifficatorMobileArguments = (PlusTarifficatorMobileArguments) mj31Var.w;
                pmm0 pmm0Var = (pmm0) mj31Var.b;
                jnd0 b = pmm0Var.b();
                bdt bdtVar = (bdt) pmm0Var.g0.getValue();
                s570 s570Var = (s570) pmm0Var.i0.getValue();
                ftb e = pmm0Var.e();
                tnd0 tnd0Var = pmm0Var.x;
                return new drx0(plusTarifficatorMobileArguments, b, bdtVar, s570Var, e, new ViewModelModule$getScenarioViewModelFactory$1$1(0, tnd0Var, tnd0.class, "isPresaleEnabled", "isPresaleEnabled()Z", 0), new ViewModelModule$getScenarioViewModelFactory$1$2(0, tnd0Var, tnd0.class, "isSilentInAppPaymentEnabled", "isSilentInAppPaymentEnabled()Z", 0), g0.a(y8fVar), (fwa0) pmm0Var.L0.getValue());
            default:
                pmm0 pmm0Var2 = (pmm0) mj31Var.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.b(pmm0Var2.b(), pmm0Var2.g(), (c4v0) pmm0Var2.x0.getValue(), (com.yandex.plus.pay.ui.core.api.domain.a) pmm0Var2.y0.getValue(), (jpd0) pmm0Var2.U.getValue(), pmm0Var2.f(), new ViewModelModule$getSuccessViewModelFactory$1$1(0, pmm0Var2.x, tnd0.class, "isWebSuccessScreenEnabled", "isWebSuccessScreenEnabled()Z", 0), pmm0Var2.g, pmm0Var2.s);
        }
    }
}
