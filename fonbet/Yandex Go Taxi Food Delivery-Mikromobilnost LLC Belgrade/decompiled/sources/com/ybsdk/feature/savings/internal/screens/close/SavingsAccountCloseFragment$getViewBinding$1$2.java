package com.ybsdk.feature.savings.internal.screens.close;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountLeaveType;
import defpackage.b4m0;
import defpackage.rt1;
import defpackage.sls;
import defpackage.uc5;
import defpackage.y3m0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountCloseFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public SavingsAccountCloseFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, b4m0.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b4m0 b4m0Var = (b4m0) this.receiver;
        rt1 rt1Var = b4m0Var.D.f0;
        String type = b4m0Var.B.getType();
        SavingsEvents$SavingsAccountCloseAccountLeaveType savingsEvents$SavingsAccountCloseAccountLeaveType = null;
        if (type != null) {
            if (type.equalsIgnoreCase("SAVER")) {
                savingsEvents$SavingsAccountCloseAccountLeaveType = SavingsEvents$SavingsAccountCloseAccountLeaveType.SAVER;
            } else if (type.equalsIgnoreCase("DEPOSIT")) {
                savingsEvents$SavingsAccountCloseAccountLeaveType = SavingsEvents$SavingsAccountCloseAccountLeaveType.DEPOSIT;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountLeaveType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountLeaveType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.leave", linkedHashMap);
        if (!((y3m0) b4m0Var.X()).c) {
            b4m0Var.C.e();
        }
        return zy11.a;
    }
}
