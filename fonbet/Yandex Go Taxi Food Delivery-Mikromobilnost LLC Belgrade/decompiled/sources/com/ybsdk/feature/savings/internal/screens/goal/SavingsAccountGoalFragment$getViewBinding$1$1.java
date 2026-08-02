package com.ybsdk.feature.savings.internal.screens.goal;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.internal.helpers.a;
import defpackage.g8e;
import defpackage.i6m0;
import defpackage.jl40;
import defpackage.l6m0;
import defpackage.m6m0;
import defpackage.p6m0;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.s6m0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.x4c;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountGoalFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public SavingsAccountGoalFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, p6m0.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        s6m0 s6m0Var;
        s6m0 s6m0Var2;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        p6m0 p6m0Var = (p6m0) this.receiver;
        AppAnalyticsReporter appAnalyticsReporter = p6m0Var.F;
        SavingsAccountGoalParams savingsAccountGoalParams = p6m0Var.B;
        Date date = ((i6m0) p6m0Var.X()).c;
        MoneyEntity moneyEntity = ((i6m0) p6m0Var.X()).f;
        s6m0 c0 = p6m0Var.c0(date);
        if (c0 != null) {
            p6m0Var.Z(m6m0.a);
            rt1 rt1Var = appAnalyticsReporter.f0;
            String str = ((i6m0) p6m0Var.X()).d;
            if (str == null) {
                str = "";
            }
            rt1Var.a.a("savings.account.add_goal.wrong_date", g8e.w(1, MetaDataField.DATE_FIELD, str));
            s6m0Var = c0;
        } else {
            s6m0Var = null;
        }
        s6m0 b0 = p6m0Var.b0(moneyEntity);
        if (b0 != null) {
            p6m0Var.Z(l6m0.a);
            rt1 rt1Var2 = appAnalyticsReporter.f0;
            String str2 = ((i6m0) p6m0Var.X()).g;
            rt1Var2.a.a("savings.account.add_goal.wrong_amount", g8e.w(1, "value", str2 != null ? str2 : ""));
            s6m0Var2 = b0;
        } else {
            s6m0Var2 = null;
        }
        if (s6m0Var == null && s6m0Var2 == null) {
            BigDecimal amount = moneyEntity != null ? moneyEntity.getAmount() : null;
            MoneyEntity amount2 = savingsAccountGoalParams.getAmount();
            if (jl40.l(amount, amount2 != null ? amount2.getAmount() : null) && jl40.l(date, savingsAccountGoalParams.getDate())) {
                p6m0Var.C.e();
            }
            if (moneyEntity == null || date == null) {
                x4c.g("Savings Goal creation validations passed, but some data are invalid", null, "amount: " + ((i6m0) p6m0Var.X()).f + "; date: " + ((i6m0) p6m0Var.X()).c, null, 10);
            } else {
                pz40 Y = p6m0Var.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, i6m0.a((i6m0) value2, null, null, null, null, null, null, true, false, 1791)));
                ((a) p6m0Var.E).a(savingsAccountGoalParams.getAgreementId(), p6m0Var.b.i("IDEMPOTENCY_KEY_FOR_GOAL"), moneyEntity, date);
            }
        } else {
            pz40 Y2 = p6m0Var.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, i6m0.a((i6m0) value, null, null, s6m0Var, null, null, s6m0Var2, false, false, 1903)));
        }
        return zy11.a;
    }
}
