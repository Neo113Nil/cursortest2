package defpackage;

import com.ybsdk.feature.boostdeposit.internal.network.BoostDepositApi;
import com.ybsdk.feature.credit.deposit.internal.network.CreditDepositApi;
import com.ybsdk.feature.credit.limitdeposit.internal.network.CreditLimitDepositApi;
import com.ybsdk.feature.mkkdeposit.internal.network.MkkDepositApi;

/* loaded from: classes5.dex */
public final class oaf implements v7p {
    public final /* synthetic */ int a;
    public final oxf b;

    public /* synthetic */ oaf(oxf oxfVar, int i) {
        this.a = i;
        this.b = oxfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        oxf oxfVar = this.b;
        switch (i) {
            case 0:
                return (BoostDepositApi) ((t0k0) oxfVar.get()).b(BoostDepositApi.class);
            case 1:
                return (CreditDepositApi) ((t0k0) oxfVar.get()).b(CreditDepositApi.class);
            case 2:
                return (CreditLimitDepositApi) ((t0k0) oxfVar.get()).b(CreditLimitDepositApi.class);
            default:
                return (MkkDepositApi) ((t0k0) oxfVar.get()).b(MkkDepositApi.class);
        }
    }
}
