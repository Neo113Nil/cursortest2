package com.yandex.go.transfer_requirement.mvp;

import defpackage.op01;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TransferRequirementModalView$setupListeners$1$5 extends FunctionReferenceImpl implements tls {
    public final void i(String str) {
        op01 op01Var = (op01) this.receiver;
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onTrainCarriageUpdated$1(op01Var, str, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
