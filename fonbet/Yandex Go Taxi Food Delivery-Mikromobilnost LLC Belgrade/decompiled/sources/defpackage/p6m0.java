package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.helpers.a;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalParams;
import com.ybsdk.rconfig.configs.SavingsAccountGoal;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class p6m0 extends uc5 {
    public final SavingsAccountGoalParams B;
    public final tfl0 C;
    public final mdm0 D;
    public final w2m0 E;
    public final AppAnalyticsReporter F;
    public final w530 G;

    public p6m0(SavingsAccountGoalParams savingsAccountGoalParams, tfl0 tfl0Var, mdm0 mdm0Var, w2m0 w2m0Var, AppAnalyticsReporter appAnalyticsReporter, w530 w530Var, u6m0 u6m0Var) {
        super(new j6m0(0, savingsAccountGoalParams), u6m0Var);
        s6m0 c0;
        r0 r0Var;
        Object value;
        this.B = savingsAccountGoalParams;
        this.C = tfl0Var;
        this.D = mdm0Var;
        this.E = w2m0Var;
        this.F = appAnalyticsReporter;
        this.G = w530Var;
        appAnalyticsReporter.f0.a.a("savings.account.add_goal.open", null);
        Date date = savingsAccountGoalParams.getDate();
        if (date != null && (c0 = c0(date)) != null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, i6m0.a((i6m0) value, null, null, c0, null, null, null, false, false, 2031)));
        }
        c.a(e.t(a.f(this.B.getAgreementId(), ((a) this.E).g)), ds31.a(this), new cfj0(19, this));
    }

    public final s6m0 b0(MoneyEntity moneyEntity) {
        if (moneyEntity == null || moneyEntity.getAmount().intValue() > ((SavingsAccountGoal) ((ndm0) this.D).a.d(n4m0.b).getData()).getAmountMax() || moneyEntity.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            return new s6m0(unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_error_amount));
        }
        return null;
    }

    public final s6m0 c0(Date date) {
        Text.Resource h;
        if (date == null) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_error_date);
        } else if (date.before(Calendar.getInstance().getTime())) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_error_date_before_now);
        } else {
            long yearFromNowMax = ((SavingsAccountGoal) ((ndm0) this.D).a.d(n4m0.b).getData()).getYearFromNowMax();
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, (int) yearFromNowMax);
            h = date.after(calendar.getTime()) ? unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_error_date) : null;
        }
        if (h != null) {
            return new s6m0(h);
        }
        return null;
    }

    public final void d0() {
        rt1 rt1Var = this.F.f0;
        String str = ((i6m0) X()).g;
        if (str == null) {
            str = "";
        }
        rt1Var.a.a("savings.account.add_goal.amount_changed", g8e.w(1, "new_value", str));
    }

    public final void e0() {
        rt1 rt1Var = this.F.f0;
        String str = ((i6m0) X()).d;
        if (str == null) {
            str = "";
        }
        rt1Var.a.a("savings.account.add_goal.date_changed", g8e.w(1, MetaDataField.DATE_FIELD, str));
    }

    public final void f0(String str) {
        MoneyEntity moneyEntity;
        r0 r0Var;
        Object value;
        String iso;
        if (str.equals(((i6m0) X()).g)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Integer l = bvu0.l(10, sb.toString());
        s6m0 s6m0Var = null;
        if (l != null) {
            int intValue = l.intValue();
            BigDecimal valueOf = BigDecimal.valueOf(intValue);
            MoneyEntity amount = this.B.getAmount();
            if (amount == null || (iso = amount.getCurrency()) == null) {
                iso = NumberFormatUtils$Currencies.RUB.getIso();
            }
            moneyEntity = new MoneyEntity(valueOf, iso, w530.a(this.G, Integer.valueOf(intValue), null, false, null, false, 62));
        } else {
            moneyEntity = null;
        }
        if (moneyEntity != null && moneyEntity.getAmount().compareTo(BigDecimal.ZERO) != 0) {
            s6m0Var = b0(moneyEntity);
        }
        s6m0 s6m0Var2 = s6m0Var;
        if (s6m0Var2 != null) {
            Z(l6m0.a);
            this.F.f0.a.a("savings.account.add_goal.wrong_amount", g8e.w(1, "value", str));
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, i6m0.a((i6m0) value, null, null, null, moneyEntity, str, s6m0Var2, false, false, 1823)));
    }
}
