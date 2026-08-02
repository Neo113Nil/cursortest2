package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BoostDepositEvents$BoostDepositPaymentResultStatus;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneConfirmationCodeResendResult;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneResultResult;
import com.ybsdk.core.analytics.generated.delegates.MkkEvents$MkkDepositPaymentResultStatus;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfCreditLinkCreatedType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfDepositLinkCreatedType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfDocumentByIdLinkCreatedResultType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfFileDownloadResultType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfReportCreatedResultType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfReportLinkGenerationResultType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfReportPollingResultType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfSplitContractDraftCreatedType;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfSplitContractDraftLinkCreatedType;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneConfirmationCodeResendResult;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationResultResult;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupRecurrentCreatedType;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupRecurrentUpdatedState;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularParams;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes3.dex */
public final class f42 implements c9c, z9f {
    public final /* synthetic */ int a;
    public final AppAnalyticsReporter b;

    public /* synthetic */ f42(AppAnalyticsReporter appAnalyticsReporter, int i) {
        this.a = i;
        this.b = appAnalyticsReporter;
    }

    private final void C(saf safVar) {
    }

    private final void D() {
    }

    public static List x(qx3 qx3Var) {
        String str;
        asi0 asi0Var = (asi0) qx3Var.e.a();
        if (asi0Var == null) {
            return EmptyList.a;
        }
        List<h5a0> list = asi0Var.d.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (h5a0 h5a0Var : list) {
            if (h5a0Var instanceof c5a0) {
                str = "CARD";
            } else if (h5a0Var instanceof e5a0) {
                str = "ME2ME";
            } else if (h5a0Var instanceof f5a0) {
                str = "SAVINGS_ACCOUNT";
            } else {
                if (!(h5a0Var instanceof g5a0)) {
                    w511.b();
                    return null;
                }
                str = "YANDEX_ACCOUNT";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public void A(boolean z) {
        PdfEvents$LoadPdfDocumentByIdLinkCreatedResultType pdfEvents$LoadPdfDocumentByIdLinkCreatedResultType = z ? PdfEvents$LoadPdfDocumentByIdLinkCreatedResultType.OK : PdfEvents$LoadPdfDocumentByIdLinkCreatedResultType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfDocumentByIdLinkCreatedResultType.getOriginalValue());
        em3Var.a.a("load.pdf.document_by_id.link.created.result", linkedHashMap);
    }

    public void B(boolean z, mw3 mw3Var, String str) {
        TopupEvents$TopupRecurrentUpdatedState topupEvents$TopupRecurrentUpdatedState;
        BigDecimal amount;
        BigDecimal amount2;
        String paymentMethodId;
        TopupEvents$TopupRecurrentCreatedType topupEvents$TopupRecurrentCreatedType;
        BigDecimal amount3;
        BigDecimal amount4;
        String paymentMethodId2;
        Money money = mw3Var.g;
        Money money2 = mw3Var.f;
        PaymentMethodInfoDto paymentMethodInfoDto = mw3Var.j;
        String str2 = mw3Var.a;
        String str3 = "";
        String str4 = null;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        if (!z) {
            z94 z94Var = appAnalyticsReporter.o0;
            if (str2 == null) {
                return;
            }
            Boolean bool = mw3Var.d;
            if (jl40.l(bool, Boolean.TRUE)) {
                topupEvents$TopupRecurrentUpdatedState = TopupEvents$TopupRecurrentUpdatedState.ON;
            } else if (jl40.l(bool, Boolean.FALSE)) {
                topupEvents$TopupRecurrentUpdatedState = TopupEvents$TopupRecurrentUpdatedState.OFF;
            } else {
                if (bool != null) {
                    w511.b();
                    return;
                }
                topupEvents$TopupRecurrentUpdatedState = null;
            }
            if (paymentMethodInfoDto != null && (paymentMethodId = paymentMethodInfoDto.getPaymentMethodId()) != null) {
                str3 = paymentMethodId;
            }
            String plainString = (money2 == null || (amount2 = money2.getAmount()) == null) ? null : amount2.toPlainString();
            if (money != null && (amount = money.getAmount()) != null) {
                str4 = amount.toPlainString();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(6);
            if (str != null) {
                linkedHashMap.put("error", str);
            }
            linkedHashMap.put("autoTopUpId", str2);
            if (topupEvents$TopupRecurrentUpdatedState != null) {
                linkedHashMap.put(ClidProvider.STATE, topupEvents$TopupRecurrentUpdatedState.getOriginalValue());
            }
            linkedHashMap.put("paymentMethodId", str3);
            if (plainString != null) {
                linkedHashMap.put("money", plainString);
            }
            if (str4 != null) {
                linkedHashMap.put("threshold", str4);
            }
            z94Var.a.a("topup.recurrent.updated", linkedHashMap);
            return;
        }
        z94 z94Var2 = appAnalyticsReporter.o0;
        y1b1 y1b1Var = mw3Var.e;
        if (jl40.l(y1b1Var, bu3.a)) {
            topupEvents$TopupRecurrentCreatedType = TopupEvents$TopupRecurrentCreatedType.LIMIT_EXACT;
        } else if (jl40.l(y1b1Var, cu3.a)) {
            topupEvents$TopupRecurrentCreatedType = TopupEvents$TopupRecurrentCreatedType.LIMIT_FILL;
        } else {
            if (!jl40.l(y1b1Var, du3.a)) {
                if (y1b1Var == null) {
                    return;
                }
                w511.b();
                return;
            }
            topupEvents$TopupRecurrentCreatedType = TopupEvents$TopupRecurrentCreatedType.REGULAR_PERIOD;
        }
        String str5 = mw3Var.h;
        if (str5 == null) {
            return;
        }
        if (paymentMethodInfoDto != null && (paymentMethodId2 = paymentMethodInfoDto.getPaymentMethodId()) != null) {
            str3 = paymentMethodId2;
        }
        String plainString2 = (money2 == null || (amount4 = money2.getAmount()) == null) ? null : amount4.toPlainString();
        if (money != null && (amount3 = money.getAmount()) != null) {
            str4 = amount3.toPlainString();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(7);
        if (str != null) {
            linkedHashMap2.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap2.put("autoTopUpId", str2);
        }
        linkedHashMap2.put("type", topupEvents$TopupRecurrentCreatedType.getOriginalValue());
        linkedHashMap2.put("agreementId", str5);
        linkedHashMap2.put("paymentMethodId", str3);
        if (plainString2 != null) {
            linkedHashMap2.put("money", plainString2);
        }
        if (str4 != null) {
            linkedHashMap2.put("threshold", str4);
        }
        z94Var2.a.a("topup.recurrent.created", linkedHashMap2);
    }

    public void E(boolean z) {
        PdfEvents$LoadPdfReportPollingResultType pdfEvents$LoadPdfReportPollingResultType = z ? PdfEvents$LoadPdfReportPollingResultType.OK : PdfEvents$LoadPdfReportPollingResultType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfReportPollingResultType.getOriginalValue());
        em3Var.a.a("load.pdf.report.polling_result", linkedHashMap);
    }

    public void F(RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton, AutoTopupRegularParams autoTopupRegularParams, qx3 qx3Var) {
        List h;
        List h2;
        csi0 csi0Var;
        fa4 fa4Var;
        ea4 ea4Var;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        rgq0 rgq0Var = qx3Var.c;
        l0p l0pVar = this.b.c0;
        String agreementId = autoTopupRegularParams.getAgreementId();
        List x = x(qx3Var);
        h5a0 h5a0Var = qx3Var.f;
        g5a0 g5a0Var = h5a0Var instanceof g5a0 ? (g5a0) h5a0Var : null;
        String str = g5a0Var != null ? g5a0Var.h : null;
        e5a0 e5a0Var = h5a0Var instanceof e5a0 ? (e5a0) h5a0Var : null;
        String str2 = e5a0Var != null ? e5a0Var.f : null;
        csi0 b = qx3Var.b();
        RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup.CHANGE;
        FrequencyType frequencyType = rgq0Var.a;
        v170 v170Var = rgq0Var.b;
        t170 t170Var = rgq0Var.c;
        dk11 dk11Var = rgq0Var.d;
        int[] iArr = ax3.a;
        int i = iArr[frequencyType.ordinal()];
        if (i == 1) {
            MoneyEntity moneyEntity3 = v170Var.b;
            h = scc.h(moneyEntity3 != null ? moneyEntity3.getAmount() : null);
        } else if (i == 2) {
            MoneyEntity moneyEntity4 = t170Var.b;
            h = scc.h(moneyEntity4 != null ? moneyEntity4.getAmount() : null);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            z630 z630Var = dk11Var.a;
            BigDecimal amount = (z630Var == null || (moneyEntity2 = z630Var.b) == null) ? null : moneyEntity2.getAmount();
            z630 z630Var2 = dk11Var.b;
            h = j73.A(new BigDecimal[]{amount, (z630Var2 == null || (moneyEntity = z630Var2.b) == null) ? null : moneyEntity.getAmount()});
        }
        int i2 = iArr[rgq0Var.a.ordinal()];
        if (i2 == 1) {
            DayOfWeek dayOfWeek = v170Var.a;
            h2 = scc.h(dayOfWeek != null ? dayOfWeek.name() : null);
        } else if (i2 == 2) {
            h2 = scc.h(t170Var.a);
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            z630 z630Var3 = dk11Var.a;
            Integer num = z630Var3 != null ? z630Var3.a : null;
            z630 z630Var4 = dk11Var.b;
            h2 = j73.A(new Integer[]{num, z630Var4 != null ? z630Var4.a : null});
        }
        List list = h2;
        BigDecimal c = rgq0Var.c();
        Double valueOf = c != null ? Double.valueOf(c.doubleValue()) : null;
        asi0 asi0Var = (asi0) qx3Var.e.a();
        l0pVar.h(agreementId, x, str, str2, regularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup, h, list, valueOf, (asi0Var == null || (csi0Var = asi0Var.a) == null || (fa4Var = csi0Var.c) == null || (ea4Var = fa4Var.b) == null) ? null : ea4Var.a, regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton);
    }

    public void G(RegularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton regularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton, AutoTopupRegularParams autoTopupRegularParams) {
        l0p l0pVar = this.b.c0;
        LinkedHashMap w = g8e.w(2, "agreement_id", autoTopupRegularParams.getAgreementId());
        w.put("button", regularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton.getOriginalValue());
        l0pVar.a.a("regular_autotopup.deactivate.button.click", w);
    }

    public void H(String str, boolean z) {
        PdfEvents$LoadPdfFileDownloadResultType pdfEvents$LoadPdfFileDownloadResultType = z ? PdfEvents$LoadPdfFileDownloadResultType.OK : PdfEvents$LoadPdfFileDownloadResultType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("type", pdfEvents$LoadPdfFileDownloadResultType.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        em3Var.a.a("load.pdf.file.download.result", linkedHashMap);
    }

    public void I(RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton regularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton, AutoTopupRegularParams autoTopupRegularParams, qx3 qx3Var) {
        l0p l0pVar = this.b.c0;
        String agreementId = autoTopupRegularParams.getAgreementId();
        csi0 b = qx3Var.b();
        RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup regularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup.CHANGE;
        LinkedHashMap w = g8e.w(3, "agreement_id", agreementId);
        w.put("button", regularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton.getOriginalValue());
        if (regularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSaveChangesButtonClickStateAutotopup.getOriginalValue());
        }
        l0pVar.a.a("regular_autotopup.save_changes.button.click", w);
    }

    public void J(RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType regularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType, AutoTopupRegularParams autoTopupRegularParams, qx3 qx3Var) {
        l0p l0pVar = this.b.c0;
        String agreementId = autoTopupRegularParams.getAgreementId();
        csi0 b = qx3Var.b();
        RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup.CHANGE;
        LinkedHashMap w = g8e.w(3, "agreement_id", agreementId);
        if (regularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsWhenOpenStateAutotopup.getOriginalValue());
        }
        w.put("bottomsheet_type", regularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType.getOriginalValue());
        l0pVar.a.a("regular_autotopup.settings.when.open", w);
    }

    public void K(h5a0 h5a0Var, AutoTopupRegularParams autoTopupRegularParams, qx3 qx3Var) {
        l0p l0pVar = this.b.c0;
        String agreementId = autoTopupRegularParams.getAgreementId();
        g5a0 g5a0Var = h5a0Var instanceof g5a0 ? (g5a0) h5a0Var : null;
        String str = g5a0Var != null ? g5a0Var.h : null;
        e5a0 e5a0Var = h5a0Var instanceof e5a0 ? (e5a0) h5a0Var : null;
        String str2 = e5a0Var != null ? e5a0Var.f : null;
        List x = x(qx3Var);
        csi0 b = qx3Var.b();
        RegularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.ENABLED ? RegularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup.CHANGE : RegularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup.NEW;
        LinkedHashMap w = g8e.w(5, "agreement_id", agreementId);
        if (str != null) {
            w.put("source_agreement_id", str);
        }
        w.put("payment_method_types", x);
        if (str2 != null) {
            byte[] bArr = y5e.W;
            byte[] bArr2 = new byte[7];
            for (int i = 0; i < 7; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            w.put(new String(bArr2, uza.a), str2);
        }
        if (regularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsSourceSetStateAutotopup.getOriginalValue());
        }
        l0pVar.a.a("regular_autotopup.settings.source.set", w);
    }

    public void L(boolean z) {
        PdfEvents$LoadPdfSplitContractDraftCreatedType pdfEvents$LoadPdfSplitContractDraftCreatedType = z ? PdfEvents$LoadPdfSplitContractDraftCreatedType.OK : PdfEvents$LoadPdfSplitContractDraftCreatedType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfSplitContractDraftCreatedType.getOriginalValue());
        em3Var.a.a("load.pdf.split_contract_draft.created", linkedHashMap);
    }

    public void M(boolean z) {
        PdfEvents$LoadPdfSplitContractDraftLinkCreatedType pdfEvents$LoadPdfSplitContractDraftLinkCreatedType = z ? PdfEvents$LoadPdfSplitContractDraftLinkCreatedType.OK : PdfEvents$LoadPdfSplitContractDraftLinkCreatedType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfSplitContractDraftLinkCreatedType.getOriginalValue());
        em3Var.a.a("load.pdf.split_contract_draft.link.created", linkedHashMap);
    }

    public void N(boolean z) {
        PdfEvents$LoadPdfCreditLinkCreatedType pdfEvents$LoadPdfCreditLinkCreatedType = z ? PdfEvents$LoadPdfCreditLinkCreatedType.OK : PdfEvents$LoadPdfCreditLinkCreatedType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfCreditLinkCreatedType.getOriginalValue());
        em3Var.a.a("load.pdf.credit.link.created", linkedHashMap);
    }

    public void O(String str, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus) {
        l0p l0pVar = this.b.y;
        l0pVar.a.a("external_member.update_autopayment_settings.error", x4e.t(2, ACSPConstants.STATUS, partnerPaymentsFeature$BindingStatus.name().toLowerCase(Locale.ROOT), "error", str));
    }

    @Override // defpackage.z9f
    public void a() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.pay.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.pay.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void b() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.screen_open", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.screen_open", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void c() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.back.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.back.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void d() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.payment_result.close.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.payment_result.close.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void e() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.suggest.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.suggest.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void f(saf safVar) {
        switch (this.a) {
            case 4:
                break;
            default:
                rt1 rt1Var = this.b.K;
                String str = safVar.b;
                if (str == null) {
                    str = safVar.c;
                }
                rt1Var.a.a("mkk_deposit.change_card.click", g8e.w(1, "card_id", str));
                break;
        }
    }

    @Override // defpackage.z9f
    public void g(String str) {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                em3 em3Var = appAnalyticsReporter.h;
                em3Var.a.a("boost_deposit.local_action.click", g8e.w(1, "action", str));
                break;
            default:
                rt1 rt1Var = appAnalyticsReporter.K;
                rt1Var.a.a("mkk_deposit.local_action.click", g8e.w(1, "action", str));
                break;
        }
    }

    @Override // defpackage.c9c
    public void h() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 3:
                appAnalyticsReporter.n.a.a("change_phone.confirmation_code.enter", null);
                break;
            default:
                appAnalyticsReporter.b0.a.a("registration.phone.confirmation_code.enter", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void i() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.payment_result.timeout.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.payment_result.timeout.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void j() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.tooltip.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.tooltip.click", null);
                break;
        }
    }

    @Override // defpackage.c9c
    public void k() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 3:
                appAnalyticsReporter.n.a.a("change_phone.confirmation_code.support.open", null);
                break;
            default:
                appAnalyticsReporter.b0.a.a("registration.phone.confirmation_code.support.open", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void l() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.change_sum.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.change_sum.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void m(s2e0 s2e0Var) {
        BoostDepositEvents$BoostDepositPaymentResultStatus boostDepositEvents$BoostDepositPaymentResultStatus;
        MkkEvents$MkkDepositPaymentResultStatus mkkEvents$MkkDepositPaymentResultStatus;
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        r2e0 r2e0Var = r2e0.a;
        o2e0 o2e0Var = o2e0.a;
        switch (i) {
            case 4:
                if (!(s2e0Var instanceof q2e0)) {
                    if (!(s2e0Var instanceof n2e0)) {
                        if (!s2e0Var.equals(o2e0Var) && !(s2e0Var instanceof p2e0)) {
                            if (!s2e0Var.equals(r2e0Var)) {
                                w511.b();
                                break;
                            } else {
                                boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.TIMEOUT;
                            }
                        } else {
                            boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.PROCESSING;
                        }
                    } else {
                        boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.ERROR;
                    }
                } else {
                    int i2 = aaf.a[((xaf) ((q2e0) s2e0Var).a).c.ordinal()];
                    if (i2 == 1) {
                        boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.PROCESSING;
                    } else if (i2 == 2) {
                        boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.REQUIRED_3DS;
                    } else if (i2 == 3) {
                        boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.OK;
                    } else if (i2 != 4) {
                        w511.b();
                        break;
                    } else {
                        boostDepositEvents$BoostDepositPaymentResultStatus = BoostDepositEvents$BoostDepositPaymentResultStatus.ERROR;
                    }
                }
                em3 em3Var = appAnalyticsReporter.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(ACSPConstants.STATUS, boostDepositEvents$BoostDepositPaymentResultStatus.getOriginalValue());
                em3Var.a.a("boost_deposit.payment_result", linkedHashMap);
                break;
            default:
                if (!(s2e0Var instanceof q2e0)) {
                    if (!(s2e0Var instanceof n2e0)) {
                        if (!s2e0Var.equals(o2e0Var) && !(s2e0Var instanceof p2e0)) {
                            if (!s2e0Var.equals(r2e0Var)) {
                                w511.b();
                                break;
                            } else {
                                mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.TIMEOUT;
                            }
                        } else {
                            mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.PROCESSING;
                        }
                    } else {
                        mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.ERROR;
                    }
                } else {
                    int i3 = faf.a[((xaf) ((q2e0) s2e0Var).a).c.ordinal()];
                    if (i3 == 1) {
                        mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.PROCESSING;
                    } else if (i3 == 2) {
                        mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.REQUIRED_3DS;
                    } else if (i3 == 3) {
                        mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.OK;
                    } else if (i3 != 4) {
                        w511.b();
                        break;
                    } else {
                        mkkEvents$MkkDepositPaymentResultStatus = MkkEvents$MkkDepositPaymentResultStatus.ERROR;
                    }
                }
                rt1 rt1Var = appAnalyticsReporter.K;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                linkedHashMap2.put(ACSPConstants.STATUS, mkkEvents$MkkDepositPaymentResultStatus.getOriginalValue());
                rt1Var.a.a("mkk_deposit.payment_result", linkedHashMap2);
                break;
        }
    }

    @Override // defpackage.z9f
    public void n() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.payment_result.error.try_again.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.payment_result.error.try_again.click", null);
                break;
        }
    }

    @Override // defpackage.c9c
    public void o(CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult codeConfirmationAnalyticsInteractor$ConfirmationCodeResult) {
        ChangePhoneEvents$ChangePhoneResultResult changePhoneEvents$ChangePhoneResultResult;
        RegistrationEvents$RegistrationResultResult registrationEvents$RegistrationResultResult;
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 3:
                rt1 rt1Var = appAnalyticsReporter.n;
                int i2 = d9c.a[codeConfirmationAnalyticsInteractor$ConfirmationCodeResult.ordinal()];
                if (i2 == 1) {
                    changePhoneEvents$ChangePhoneResultResult = ChangePhoneEvents$ChangePhoneResultResult.OK;
                } else if (i2 != 2 && i2 != 3) {
                    w511.b();
                    break;
                } else {
                    changePhoneEvents$ChangePhoneResultResult = ChangePhoneEvents$ChangePhoneResultResult.ERROR;
                }
                rt1Var.l(changePhoneEvents$ChangePhoneResultResult, null);
                break;
            default:
                z94 z94Var = appAnalyticsReporter.b0;
                int i3 = d9c.a[codeConfirmationAnalyticsInteractor$ConfirmationCodeResult.ordinal()];
                if (i3 == 1) {
                    registrationEvents$RegistrationResultResult = RegistrationEvents$RegistrationResultResult.OK;
                } else if (i3 == 2) {
                    registrationEvents$RegistrationResultResult = RegistrationEvents$RegistrationResultResult.CANCEL;
                } else if (i3 != 3) {
                    w511.b();
                    break;
                } else {
                    registrationEvents$RegistrationResultResult = RegistrationEvents$RegistrationResultResult.ERROR;
                }
                z94.u(z94Var, registrationEvents$RegistrationResultResult, null, null);
                break;
        }
    }

    @Override // defpackage.c9c
    public void p(boolean z) {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 3:
                rt1 rt1Var = appAnalyticsReporter.n;
                ChangePhoneEvents$ChangePhoneConfirmationCodeResendResult changePhoneEvents$ChangePhoneConfirmationCodeResendResult = z ? ChangePhoneEvents$ChangePhoneConfirmationCodeResendResult.OK : ChangePhoneEvents$ChangePhoneConfirmationCodeResendResult.ERROR;
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, changePhoneEvents$ChangePhoneConfirmationCodeResendResult.getOriginalValue());
                rt1Var.a.a("change_phone.confirmation_code.resend", linkedHashMap);
                break;
            default:
                z94 z94Var = appAnalyticsReporter.b0;
                RegistrationEvents$RegistrationPhoneConfirmationCodeResendResult registrationEvents$RegistrationPhoneConfirmationCodeResendResult = z ? RegistrationEvents$RegistrationPhoneConfirmationCodeResendResult.OK : RegistrationEvents$RegistrationPhoneConfirmationCodeResendResult.ERROR;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, registrationEvents$RegistrationPhoneConfirmationCodeResendResult.getOriginalValue());
                z94Var.a.a("registration.phone.confirmation_code.resend", linkedHashMap2);
                break;
        }
    }

    @Override // defpackage.z9f
    public void q() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.payment_result.3ds.close.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.payment_result.3ds.close.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void r() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.question.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.question.click", null);
                break;
        }
    }

    @Override // defpackage.c9c
    public void s(int i, Throwable th) {
        int i2 = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i2) {
            case 3:
                appAnalyticsReporter.n.k(ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult.ERROR, th.getMessage(), i);
                break;
            default:
                appAnalyticsReporter.b0.t(RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult.ERROR, th.getMessage(), i);
                break;
        }
    }

    @Override // defpackage.z9f
    public void t() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.payment_result.error.support.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.payment_result.error.support.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void u() {
        switch (this.a) {
            case 4:
                break;
            default:
                this.b.K.a.a("mkk_deposit.card_list.click", null);
                break;
        }
    }

    @Override // defpackage.z9f
    public void v() {
        int i = this.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b;
        switch (i) {
            case 4:
                appAnalyticsReporter.h.a.a("boost_deposit.payment_result.ok.click", null);
                break;
            default:
                appAnalyticsReporter.K.a.a("mkk_deposit.payment_result.ok.click", null);
                break;
        }
    }

    public void w(boolean z) {
        PdfEvents$LoadPdfReportCreatedResultType pdfEvents$LoadPdfReportCreatedResultType = z ? PdfEvents$LoadPdfReportCreatedResultType.OK : PdfEvents$LoadPdfReportCreatedResultType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfReportCreatedResultType.getOriginalValue());
        em3Var.a.a("load.pdf.report.created.result", linkedHashMap);
    }

    public void y(boolean z) {
        PdfEvents$LoadPdfDepositLinkCreatedType pdfEvents$LoadPdfDepositLinkCreatedType = z ? PdfEvents$LoadPdfDepositLinkCreatedType.OK : PdfEvents$LoadPdfDepositLinkCreatedType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfDepositLinkCreatedType.getOriginalValue());
        em3Var.a.a("load.pdf.deposit.link.created", linkedHashMap);
    }

    public void z(boolean z) {
        PdfEvents$LoadPdfReportLinkGenerationResultType pdfEvents$LoadPdfReportLinkGenerationResultType = z ? PdfEvents$LoadPdfReportLinkGenerationResultType.OK : PdfEvents$LoadPdfReportLinkGenerationResultType.ERROR;
        em3 em3Var = this.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfReportLinkGenerationResultType.getOriginalValue());
        em3Var.a.a("load.pdf.report.link_generation_result", linkedHashMap);
    }
}
