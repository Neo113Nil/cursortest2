package com.ybsdk.feature.savings.internal.screens.create;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.gdm0;
import defpackage.s4m0;
import defpackage.sls;
import defpackage.t4m0;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountCreationFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public SavingsAccountCreationFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onSecondaryErrorButtonClick", "onSecondaryErrorButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        s4m0 s4m0Var = ((t4m0) aVar.X()).a;
        Throwable b = s4m0Var != null ? s4m0Var.b() : null;
        FailDataException failDataException = b instanceof FailDataException ? (FailDataException) b : null;
        String supportUrl = failDataException != null ? failDataException.getSupportUrl() : null;
        if (!aVar.H.b(supportUrl)) {
            ((gdm0) aVar.G).a(supportUrl);
        }
        return zy11.a;
    }
}
