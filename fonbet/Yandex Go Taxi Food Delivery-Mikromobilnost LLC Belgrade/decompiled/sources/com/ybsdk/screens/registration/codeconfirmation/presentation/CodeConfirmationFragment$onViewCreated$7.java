package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.sls;
import defpackage.uc5;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CodeConfirmationFragment$onViewCreated$7 extends FunctionReferenceImpl implements sls {
    public CodeConfirmationFragment$onViewCreated$7(uc5 uc5Var) {
        super(0, uc5Var, c.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = (c) this.receiver;
        CodeConfirmationParams params = cVar.C.getParams();
        if (params instanceof CodeConfirmationParams.ChangePhone) {
            cVar.h0();
        } else if (!(params instanceof CodeConfirmationParams.Authorization) && !(params instanceof CodeConfirmationParams.Registration)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
