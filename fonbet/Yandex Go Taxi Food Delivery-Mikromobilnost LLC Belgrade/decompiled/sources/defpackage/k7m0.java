package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameOpenType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultError;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultType;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.savings.internal.helpers.a;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameParams;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameValidationError;
import com.ybsdk.rconfig.configs.SavingsAccountLengthMax;
import java.util.LinkedHashMap;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class k7m0 extends uc5 {
    public final SavingsAccountNameParams B;
    public final tfl0 C;
    public final AppAnalyticsReporter D;
    public final mdm0 E;
    public final w2m0 F;

    public k7m0(SavingsAccountNameParams savingsAccountNameParams, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, mdm0 mdm0Var, w2m0 w2m0Var, o7m0 o7m0Var) {
        super(new j6m0(2, savingsAccountNameParams), o7m0Var);
        this.B = savingsAccountNameParams;
        this.C = tfl0Var;
        this.D = appAnalyticsReporter;
        this.E = mdm0Var;
        this.F = w2m0Var;
        rt1 rt1Var = appAnalyticsReporter.f0;
        String saverType = savingsAccountNameParams.getSaverType();
        SavingsEvents$SavingsAccountEditNameOpenType savingsEvents$SavingsAccountEditNameOpenType = null;
        if (saverType != null) {
            if (saverType.equalsIgnoreCase("SAVER")) {
                savingsEvents$SavingsAccountEditNameOpenType = SavingsEvents$SavingsAccountEditNameOpenType.SAVER;
            } else if (saverType.equalsIgnoreCase("DEPOSIT")) {
                savingsEvents$SavingsAccountEditNameOpenType = SavingsEvents$SavingsAccountEditNameOpenType.DEPOSIT;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountEditNameOpenType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountEditNameOpenType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.edit_name.open", linkedHashMap);
        c.a(e.t(a.f(savingsAccountNameParams.getAgreementId(), ((a) w2m0Var).i)), ds31.a(this), new cfj0(21, this));
    }

    public static SavingsEvents$SavingsAccountEditNameSaveResultType d0(String str) {
        if (str.equalsIgnoreCase("SAVER")) {
            return SavingsEvents$SavingsAccountEditNameSaveResultType.SAVER;
        }
        if (str.equalsIgnoreCase("DEPOSIT")) {
            return SavingsEvents$SavingsAccountEditNameSaveResultType.DEPOSIT;
        }
        return null;
    }

    public final boolean b0(String str) {
        Regex regex = gtu0.a;
        return str.codePointCount(0, str.length()) > ((SavingsAccountLengthMax) ((ndm0) this.E).a.d(n4m0.a).getData()).getLength();
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        AppAnalyticsReporter appAnalyticsReporter = this.D;
        rt1 rt1Var = appAnalyticsReporter.f0;
        rt1 rt1Var2 = appAnalyticsReporter.f0;
        rt1Var.a.a("savings.account.edit_name.save.initiated", new LinkedHashMap(1));
        String str = ((h7m0) X()).c;
        if (str == null) {
            str = "";
        }
        SavingsAccountNameParams savingsAccountNameParams = this.B;
        if (str.equals(savingsAccountNameParams.getCurrentName())) {
            SavingsEvents$SavingsAccountEditNameSaveResultResult savingsEvents$SavingsAccountEditNameSaveResultResult = SavingsEvents$SavingsAccountEditNameSaveResultResult.ERROR;
            SavingsEvents$SavingsAccountEditNameSaveResultError savingsEvents$SavingsAccountEditNameSaveResultError = SavingsEvents$SavingsAccountEditNameSaveResultError.SAME_NAME;
            String saverType = savingsAccountNameParams.getSaverType();
            rt1Var2.I(savingsEvents$SavingsAccountEditNameSaveResultResult, savingsEvents$SavingsAccountEditNameSaveResultError, str, saverType != null ? d0(saverType) : null);
            this.C.e();
            return;
        }
        if (b0(str)) {
            appAnalyticsReporter.f0.I(SavingsEvents$SavingsAccountEditNameSaveResultResult.ERROR, SavingsEvents$SavingsAccountEditNameSaveResultError.TOO_LONG, str, null);
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, h7m0.a((h7m0) value2, null, null, SavingsAccountNameValidationError.TOO_LONG, false, 47)));
            return;
        }
        if (!evu0.J(str)) {
            ((a) this.F).c(savingsAccountNameParams.getAgreementId(), this.b.i("IDEMPOTENCY_KEY_FOR_NAME"), str);
            return;
        }
        SavingsEvents$SavingsAccountEditNameSaveResultResult savingsEvents$SavingsAccountEditNameSaveResultResult2 = SavingsEvents$SavingsAccountEditNameSaveResultResult.ERROR;
        SavingsEvents$SavingsAccountEditNameSaveResultError savingsEvents$SavingsAccountEditNameSaveResultError2 = SavingsEvents$SavingsAccountEditNameSaveResultError.EMPTY;
        String saverType2 = savingsAccountNameParams.getSaverType();
        rt1Var2.I(savingsEvents$SavingsAccountEditNameSaveResultResult2, savingsEvents$SavingsAccountEditNameSaveResultError2, str, saverType2 != null ? d0(saverType2) : null);
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, h7m0.a((h7m0) value, null, null, SavingsAccountNameValidationError.EMPTY, false, 47)));
    }
}
