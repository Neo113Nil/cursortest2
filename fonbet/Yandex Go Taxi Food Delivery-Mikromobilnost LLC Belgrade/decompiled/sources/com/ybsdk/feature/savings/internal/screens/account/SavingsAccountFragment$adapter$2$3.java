package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountInitiatedType;
import com.ybsdk.feature.savings.internal.entities.AccountType;
import defpackage.f8m0;
import defpackage.r7m0;
import defpackage.rt1;
import defpackage.tls;
import defpackage.uc5;
import defpackage.w511;
import defpackage.x6m0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$adapter$2$3 extends FunctionReferenceImpl implements tls {
    public SavingsAccountFragment$adapter$2$3(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onCloseAccountClick", "onCloseAccountClick(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a aVar = (a) this.receiver;
        rt1 rt1Var = aVar.E.f0;
        x6m0 x6m0Var = ((r7m0) aVar.X()).b;
        SavingsEvents$SavingsAccountCloseAccountInitiatedType savingsEvents$SavingsAccountCloseAccountInitiatedType = null;
        AccountType accountType = x6m0Var != null ? x6m0Var.d : null;
        int i = accountType == null ? -1 : f8m0.a[accountType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                savingsEvents$SavingsAccountCloseAccountInitiatedType = SavingsEvents$SavingsAccountCloseAccountInitiatedType.SAVER;
            } else if (i == 2) {
                savingsEvents$SavingsAccountCloseAccountInitiatedType = SavingsEvents$SavingsAccountCloseAccountInitiatedType.DEPOSIT;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                savingsEvents$SavingsAccountCloseAccountInitiatedType = SavingsEvents$SavingsAccountCloseAccountInitiatedType.FUND;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountInitiatedType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountInitiatedType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.initiated", linkedHashMap);
        aVar.x0(str);
        return zy11.a;
    }
}
