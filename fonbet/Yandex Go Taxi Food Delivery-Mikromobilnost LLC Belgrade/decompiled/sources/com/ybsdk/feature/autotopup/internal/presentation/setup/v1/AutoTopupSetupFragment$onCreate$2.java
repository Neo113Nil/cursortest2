package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupSetupFragment$onCreate$2 extends FunctionReferenceImpl implements tls {
    public AutoTopupSetupFragment$onCreate$2(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onMe2MeSelected", "onMe2MeSelected(Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((b) this.receiver).B0((TransferSelectedTargetEntity) obj);
        return zy11.a;
    }
}
