package com.ybsdk.feature.savings.internal.screens.close;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountCloseType;
import com.ybsdk.feature.savings.internal.helpers.a;
import defpackage.b4m0;
import defpackage.rt1;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountCloseFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public SavingsAccountCloseFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, b4m0.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b4m0 b4m0Var = (b4m0) this.receiver;
        rt1 rt1Var = b4m0Var.D.f0;
        SavingsAccountCloseParams savingsAccountCloseParams = b4m0Var.B;
        String type = savingsAccountCloseParams.getType();
        SavingsEvents$SavingsAccountCloseAccountCloseType savingsEvents$SavingsAccountCloseAccountCloseType = null;
        if (type != null) {
            if (type.equalsIgnoreCase("SAVER")) {
                savingsEvents$SavingsAccountCloseAccountCloseType = SavingsEvents$SavingsAccountCloseAccountCloseType.SAVER;
            } else if (type.equalsIgnoreCase("DEPOSIT")) {
                savingsEvents$SavingsAccountCloseAccountCloseType = SavingsEvents$SavingsAccountCloseAccountCloseType.DEPOSIT;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountCloseType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountCloseType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.close", linkedHashMap);
        ((a) b4m0Var.E).e(savingsAccountCloseParams.getAgreementId(), b4m0Var.b.i("IDEMPOTENCY_KEY_FOR_CLOSING"));
        return zy11.a;
    }
}
