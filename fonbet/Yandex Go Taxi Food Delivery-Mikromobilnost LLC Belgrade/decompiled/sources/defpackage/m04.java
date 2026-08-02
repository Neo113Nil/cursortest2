package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsValidationErrorVersion;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsCopyField;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsCopyType;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenFreezeResultProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenFreezeResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenUnfreezeResultProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenUnfreezeResultResult;
import com.ybsdk.core.analytics.generated.delegates.CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus;
import com.ybsdk.core.analytics.generated.delegates.GovServicesEvents$PaymentGovPaymentInfoLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.GovServicesEvents$PaymentGovSearchLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2MoneyType;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class m04 implements z9f {
    public final AppAnalyticsReporter a;

    public /* synthetic */ m04(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    @Override // defpackage.z9f
    public void a() {
        this.a.r.a.a("credit_limit_deposit.pay.click", null);
    }

    @Override // defpackage.z9f
    public void b() {
        this.a.r.a.a("credit_limit_deposit.screen_open", null);
    }

    @Override // defpackage.z9f
    public void c() {
        this.a.r.a.a("credit_limit_deposit.back.click", null);
    }

    @Override // defpackage.z9f
    public void d() {
        this.a.r.a.a("credit_limit_deposit.payment_result.close.click", null);
    }

    @Override // defpackage.z9f
    public void e() {
        this.a.r.a.a("credit_limit_deposit.suggest.click", null);
    }

    @Override // defpackage.z9f
    public void f(saf safVar) {
        qq7 qq7Var = this.a.r;
        String str = safVar.b;
        if (str == null) {
            str = safVar.c;
        }
        qq7Var.a.a("credit_limit_deposit.change_card.click", g8e.w(1, "card_id", str));
    }

    @Override // defpackage.z9f
    public void g(String str) {
        qq7 qq7Var = this.a.r;
        qq7Var.a.a("credit_limit_deposit.local_action.click", g8e.w(1, "action", str));
    }

    public void h(MobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType mobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType) {
        qq7 qq7Var = this.a.L;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", mobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType.getOriginalValue());
        qq7Var.a.a("payment.mobile_services.allow_contacts.initiated", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void i() {
        this.a.r.a.a("credit_limit_deposit.payment_result.timeout.click", null);
    }

    @Override // defpackage.z9f
    public void j() {
        this.a.r.a.a("credit_limit_deposit.tooltip.click", null);
    }

    public void k(hgs0 hgs0Var, CardMainScreenEvents$CardMainScreenCardDetailsCopyField cardMainScreenEvents$CardMainScreenCardDetailsCopyField) {
        CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId;
        CardMainScreenEvents$CardMainScreenCardDetailsCopyType cardMainScreenEvents$CardMainScreenCardDetailsCopyType;
        if (hgs0Var == null) {
            return;
        }
        qq7 qq7Var = this.a.l;
        int i = ggs0.b[hgs0Var.g.ordinal()];
        if (i == 1) {
            cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId = CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId.WALLET;
        } else if (i == 2) {
            cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId = CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId.PRO;
        } else if (i == 3) {
            cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId = CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId.CREDLIM;
        } else if (i == 4) {
            cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId = CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId.UNKNOWN;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId = CardMainScreenEvents$CardMainScreenCardDetailsCopyProductId.SPLIT;
        }
        int i2 = ggs0.a[hgs0Var.h.ordinal()];
        if (i2 == 1) {
            cardMainScreenEvents$CardMainScreenCardDetailsCopyType = CardMainScreenEvents$CardMainScreenCardDetailsCopyType.CARD_DIGITAL;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            cardMainScreenEvents$CardMainScreenCardDetailsCopyType = CardMainScreenEvents$CardMainScreenCardDetailsCopyType.CARD_PLASTIC;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("field", cardMainScreenEvents$CardMainScreenCardDetailsCopyField.getOriginalValue());
        linkedHashMap.put("product_id", cardMainScreenEvents$CardMainScreenCardDetailsCopyProductId.getOriginalValue());
        linkedHashMap.put("type", cardMainScreenEvents$CardMainScreenCardDetailsCopyType.getOriginalValue());
        qq7Var.a.a("card.main_screen.card_details.copy", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void l() {
        this.a.r.a.a("credit_limit_deposit.change_sum.click", null);
    }

    @Override // defpackage.z9f
    public void m(s2e0 s2e0Var) {
        CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus;
        if (s2e0Var instanceof q2e0) {
            int i = daf.a[((xaf) ((q2e0) s2e0Var).a).c.ordinal()];
            if (i == 1) {
                creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.PROCESSING;
            } else if (i == 2) {
                creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.REQUIRED_3DS;
            } else if (i == 3) {
                creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.OK;
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.ERROR;
            }
        } else if (s2e0Var instanceof n2e0) {
            creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.ERROR;
        } else if (s2e0Var.equals(o2e0.a) || (s2e0Var instanceof p2e0)) {
            creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.PROCESSING;
        } else {
            if (!s2e0Var.equals(r2e0.a)) {
                w511.b();
                return;
            }
            creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus = CreditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.TIMEOUT;
        }
        qq7 qq7Var = this.a.r;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ACSPConstants.STATUS, creditLimitDepositEvents$CreditLimitDepositPaymentResultStatus.getOriginalValue());
        qq7Var.a.a("credit_limit_deposit.payment_result", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void n() {
        this.a.r.a.a("credit_limit_deposit.payment_result.error.try_again.click", null);
    }

    public void o(YbCardStatusEntity ybCardStatusEntity, hgs0 hgs0Var, boolean z, String str) {
        CardMainScreenEvents$CardMainScreenUnfreezeResultProductId cardMainScreenEvents$CardMainScreenUnfreezeResultProductId;
        CardMainScreenEvents$CardMainScreenFreezeResultProductId cardMainScreenEvents$CardMainScreenFreezeResultProductId;
        YbCardStatusEntity ybCardStatusEntity2 = YbCardStatusEntity.FROZEN;
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        if (ybCardStatusEntity == ybCardStatusEntity2) {
            if (hgs0Var == null) {
                return;
            }
            CardMainScreenEvents$CardMainScreenFreezeResultResult cardMainScreenEvents$CardMainScreenFreezeResultResult = z ? CardMainScreenEvents$CardMainScreenFreezeResultResult.OK : CardMainScreenEvents$CardMainScreenFreezeResultResult.ERROR;
            qq7 qq7Var = appAnalyticsReporter.l;
            int i = ggs0.b[hgs0Var.g.ordinal()];
            if (i == 1) {
                cardMainScreenEvents$CardMainScreenFreezeResultProductId = CardMainScreenEvents$CardMainScreenFreezeResultProductId.WALLET;
            } else if (i == 2) {
                cardMainScreenEvents$CardMainScreenFreezeResultProductId = CardMainScreenEvents$CardMainScreenFreezeResultProductId.PRO;
            } else if (i == 3) {
                cardMainScreenEvents$CardMainScreenFreezeResultProductId = CardMainScreenEvents$CardMainScreenFreezeResultProductId.CREDLIM;
            } else if (i == 4) {
                cardMainScreenEvents$CardMainScreenFreezeResultProductId = CardMainScreenEvents$CardMainScreenFreezeResultProductId.UNKNOWN;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                cardMainScreenEvents$CardMainScreenFreezeResultProductId = CardMainScreenEvents$CardMainScreenFreezeResultProductId.SPLIT;
            }
            qq7Var.c(cardMainScreenEvents$CardMainScreenFreezeResultProductId, cardMainScreenEvents$CardMainScreenFreezeResultResult, str);
            return;
        }
        if (hgs0Var == null) {
            return;
        }
        CardMainScreenEvents$CardMainScreenUnfreezeResultResult cardMainScreenEvents$CardMainScreenUnfreezeResultResult = z ? CardMainScreenEvents$CardMainScreenUnfreezeResultResult.OK : CardMainScreenEvents$CardMainScreenUnfreezeResultResult.ERROR;
        qq7 qq7Var2 = appAnalyticsReporter.l;
        int i2 = ggs0.b[hgs0Var.g.ordinal()];
        if (i2 == 1) {
            cardMainScreenEvents$CardMainScreenUnfreezeResultProductId = CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.WALLET;
        } else if (i2 == 2) {
            cardMainScreenEvents$CardMainScreenUnfreezeResultProductId = CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.PRO;
        } else if (i2 == 3) {
            cardMainScreenEvents$CardMainScreenUnfreezeResultProductId = CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.CREDLIM;
        } else if (i2 == 4) {
            cardMainScreenEvents$CardMainScreenUnfreezeResultProductId = CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.UNKNOWN;
        } else {
            if (i2 != 5) {
                w511.b();
                return;
            }
            cardMainScreenEvents$CardMainScreenUnfreezeResultProductId = CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.SPLIT;
        }
        qq7Var2.e(cardMainScreenEvents$CardMainScreenUnfreezeResultProductId, cardMainScreenEvents$CardMainScreenUnfreezeResultResult, str);
    }

    public void p(String str, boolean z) {
        rt1 rt1Var = this.a.B;
        GovServicesEvents$PaymentGovPaymentInfoLoadedResult govServicesEvents$PaymentGovPaymentInfoLoadedResult = z ? GovServicesEvents$PaymentGovPaymentInfoLoadedResult.OK : GovServicesEvents$PaymentGovPaymentInfoLoadedResult.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, govServicesEvents$PaymentGovPaymentInfoLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        rt1Var.a.a("payment.gov.payment_info.loaded", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void q() {
        this.a.r.a.a("credit_limit_deposit.payment_result.3ds.close.click", null);
    }

    @Override // defpackage.z9f
    public void r() {
        this.a.r.a.a("credit_limit_deposit.question.click", null);
    }

    public void s(String str, boolean z) {
        rt1 rt1Var = this.a.B;
        GovServicesEvents$PaymentGovSearchLoadedResult govServicesEvents$PaymentGovSearchLoadedResult = z ? GovServicesEvents$PaymentGovSearchLoadedResult.OK : GovServicesEvents$PaymentGovSearchLoadedResult.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, govServicesEvents$PaymentGovSearchLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        rt1Var.a.a("payment.gov.search.loaded", linkedHashMap);
    }

    @Override // defpackage.z9f
    public void t() {
        this.a.r.a.a("credit_limit_deposit.payment_result.error.support.click", null);
    }

    @Override // defpackage.z9f
    public void u() {
        this.a.r.a.a("credit_limit_deposit.card_list.click", null);
    }

    @Override // defpackage.z9f
    public void v() {
        this.a.r.a.a("credit_limit_deposit.payment_result.ok.click", null);
    }

    public void w(fu20 fu20Var) {
        MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver;
        boolean z = fu20Var instanceof cu20;
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        if (!z) {
            if (fu20Var instanceof du20) {
                qq7 qq7Var = appAnalyticsReporter.L;
                qq7Var.a.a("payment.mobile_services.providers_click", g8e.w(1, "provider", ((du20) fu20Var).a.getName()));
                return;
            } else {
                if (!fu20Var.equals(eu20.a)) {
                    w511.b();
                    return;
                }
                qq7 qq7Var2 = appAnalyticsReporter.L;
                MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver2 = MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver.ALLOW_CONTACTS;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("receiver", mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver2.getOriginalValue());
                qq7Var2.a.a("payment.mobile_services.receivers_click", linkedHashMap);
                return;
            }
        }
        qq7 qq7Var3 = appAnalyticsReporter.L;
        int i = bt20.a[((cu20) fu20Var).b.ordinal()];
        if (i == 1) {
            mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver = MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver.CLIPBOARD;
        } else if (i == 2) {
            mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver = MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver.MYSELF;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver = MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver.CONTACT_LIST;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put("receiver", mobileServicesEvents$PaymentMobileServicesReceiversClickReceiver.getOriginalValue());
        qq7Var3.a.a("payment.mobile_services.receivers_click", linkedHashMap2);
    }

    public void x(String str, u04 u04Var) {
        SettingStatus settingStatus;
        SettingStatus settingStatus2;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        r24 r24Var = u04Var.e;
        z94 z94Var = this.a.e;
        AutotopupEvents$AutoTopupSettingsSaveLoadedResult autotopupEvents$AutoTopupSettingsSaveLoadedResult = AutotopupEvents$AutoTopupSettingsSaveLoadedResult.ERROR;
        s24 s24Var = u04Var.d;
        String str2 = null;
        String formattedAmount = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getFormattedAmount();
        String formattedAmount2 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : moneyEntity2.getFormattedAmount();
        String formattedAmount3 = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount();
        thq0 thq0Var = u04Var.h;
        Map b = h52.b(thq0Var != null ? thq0Var.a : null);
        String d = (r24Var == null || (settingStatus2 = r24Var.a) == null) ? null : rsa1.d(settingStatus2);
        if (s24Var != null && (settingStatus = s24Var.a) != null) {
            str2 = rsa1.d(settingStatus);
        }
        z94.f(z94Var, autotopupEvents$AutoTopupSettingsSaveLoadedResult, str, null, null, b, null, null, formattedAmount3, formattedAmount, formattedAmount2, d, str2, AutotopupEvents$AutoTopupSettingsSaveLoadedVersion.V2, 108);
    }

    public void y(String str, u04 u04Var, String str2) {
        SettingStatus settingStatus;
        SettingStatus settingStatus2;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        r24 r24Var = u04Var.e;
        z94 z94Var = this.a.e;
        AutotopupEvents$AutoTopupSettingsSaveResultResult autotopupEvents$AutoTopupSettingsSaveResultResult = AutotopupEvents$AutoTopupSettingsSaveResultResult.ERROR;
        s24 s24Var = u04Var.d;
        String str3 = null;
        String formattedAmount = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getFormattedAmount();
        String formattedAmount2 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : moneyEntity2.getFormattedAmount();
        String formattedAmount3 = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount();
        thq0 thq0Var = u04Var.h;
        Map b = h52.b(thq0Var != null ? thq0Var.a : null);
        String d = (r24Var == null || (settingStatus2 = r24Var.a) == null) ? null : rsa1.d(settingStatus2);
        if (s24Var != null && (settingStatus = s24Var.a) != null) {
            str3 = rsa1.d(settingStatus);
        }
        z94.g(z94Var, autotopupEvents$AutoTopupSettingsSaveResultResult, str, null, null, b, null, null, formattedAmount3, formattedAmount, formattedAmount2, d, str3, str2, AutotopupEvents$AutoTopupSettingsSaveResultVersion.V2, 108);
    }

    public void z(uy21 uy21Var) {
        String str;
        String str2;
        n0t0 n0t0Var = uy21Var.a;
        z94 z94Var = this.a.e;
        List list = uy21Var.b;
        String str3 = null;
        if ((list.contains(AutoTopupSettingsV2MoneyType.AUTOFUND_LIMIT) ? list : null) != null) {
            str = String.valueOf(n0t0Var != null ? n0t0Var.a : null);
        } else {
            str = null;
        }
        if ((list.contains(AutoTopupSettingsV2MoneyType.AUTOTOPUP_AMOUNT) ? list : null) != null) {
            str2 = String.valueOf(n0t0Var != null ? n0t0Var.a : null);
        } else {
            str2 = null;
        }
        if (!list.contains(AutoTopupSettingsV2MoneyType.AUTOTOPUP_THRESHOLD)) {
            list = null;
        }
        if (list != null) {
            str3 = String.valueOf(n0t0Var != null ? n0t0Var.a : null);
        }
        z94.k(z94Var, str, str2, str3, null, AutotopupEvents$AutoTopupSettingsValidationErrorVersion.V2, 8);
    }
}
