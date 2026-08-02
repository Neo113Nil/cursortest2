package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.ou01;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class BudgetChargesSearchStatusFragment$getViewBinding$1$1$2 extends FunctionReferenceImpl implements sls {
    public BudgetChargesSearchStatusFragment$getViewBinding$1$1$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onSupportClick", "onSupportClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String supportUrl;
        a aVar = (a) this.receiver;
        Object X = aVar.X();
        s8j0 s8j0Var = X instanceof s8j0 ? (s8j0) X : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException != null && (supportUrl = failDataException.getSupportUrl()) != null) {
            ((ou01) aVar.D).a(supportUrl);
        }
        return zy11.a;
    }
}
