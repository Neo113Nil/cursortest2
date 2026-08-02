package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.rconfig.configs.SupportEntryPointsImpl;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.dfr;
import defpackage.gjw0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CodeConfirmationFragment$onViewCreated$8 extends FunctionReferenceImpl implements sls {
    public CodeConfirmationFragment$onViewCreated$8(uc5 uc5Var) {
        super(0, uc5Var, c.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = (c) this.receiver;
        CodeConfirmationParams params = cVar.C.getParams();
        if (params instanceof CodeConfirmationParams.ChangePhone) {
            com.ybsdk.rconfig.b bVar = cVar.B;
            bVar.getClass();
            dfr b = gjw0.b(bVar.f);
            SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
            SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
            String changePhoneConfirmationNoAttemptsLeft = supportEntryPointsImpl.getChangePhoneConfirmationNoAttemptsLeft();
            if (changePhoneConfirmationNoAttemptsLeft.length() == 0) {
                changePhoneConfirmationNoAttemptsLeft = supportEntryPointsImpl2.getChangePhoneConfirmationNoAttemptsLeft();
            }
            cVar.f0(changePhoneConfirmationNoAttemptsLeft);
        } else if (!(params instanceof CodeConfirmationParams.Authorization) && !(params instanceof CodeConfirmationParams.Registration)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
