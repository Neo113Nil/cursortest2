package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.stories.dto.FullScreenDto;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoFundInputType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoFundMoneyDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupMoneyDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSettingsSuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupToolbarButton;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeSetting;
import com.ybsdk.feature.autotopup.internal.network.dto.C0142AutofundDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SavingsNoticeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.TextBadgeDto;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import defpackage.at3;
import defpackage.c22;
import defpackage.cn11;
import defpackage.d04;
import defpackage.e04;
import defpackage.e5a0;
import defpackage.f5a0;
import defpackage.h5a0;
import defpackage.i2b1;
import defpackage.iky0;
import defpackage.j5a0;
import defpackage.job1;
import defpackage.lrp0;
import defpackage.lz3;
import defpackage.mz3;
import defpackage.nsz0;
import defpackage.nz3;
import defpackage.oz3;
import defpackage.pz3;
import defpackage.qgf;
import defpackage.qxy0;
import defpackage.qz3;
import defpackage.rbv;
import defpackage.tcc;
import defpackage.uda0;
import defpackage.vou0;
import defpackage.w511;
import defpackage.w530;
import defpackage.wls;
import defpackage.x4c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AutoTopupSetupRepository$getAutoTopupData$3$1 extends AdaptedFunctionReference implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [h5a0] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AutoTopupSettingsSuccessData autoTopupSettingsSuccessData;
        nsz0 nsz0Var;
        vou0 vou0Var;
        pz3 pz3Var;
        lz3 lz3Var;
        pz3 pz3Var2;
        lz3 lz3Var2;
        ?? r15;
        ?? r13;
        c22 c22Var;
        BigDecimal bigDecimal;
        boolean z;
        String symbol;
        String currency;
        AutoTopupType autoTopupType;
        String str;
        Text text;
        Text.Constant constant;
        ArrayList arrayList;
        cn11 cn11Var;
        AutoTopupInputType autoTopupInputType;
        BigDecimal bigDecimal2;
        char c;
        String symbol2;
        String currency2;
        AutoTopupSettingsSuccessData autoTopupSettingsSuccessData2 = (AutoTopupSettingsSuccessData) obj;
        e04 e04Var = (e04) this.receiver;
        e04Var.getClass();
        String agreementId = autoTopupSettingsSuccessData2.getAgreementId();
        Text f = d.f(autoTopupSettingsSuccessData2.getTitle());
        Text.Constant e = d.e(autoTopupSettingsSuccessData2.getScreenSubtitle());
        rbv f2 = job1.f(new ThemedImageUrlEntity(autoTopupSettingsSuccessData2.getScreenIcon().getLight(), autoTopupSettingsSuccessData2.getScreenIcon().getDark()), new at3(7));
        Text f3 = d.f(autoTopupSettingsSuccessData2.getSaveButtonText());
        PaymentMethodsListDto paymentMethodList = autoTopupSettingsSuccessData2.getPaymentMethodList();
        w530 w530Var = e04Var.a;
        uda0 b = j5a0.b(paymentMethodList, w530Var, false);
        List list = b.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            h5a0 h5a0Var = (h5a0) obj3;
            if ((h5a0Var instanceof e5a0) || (h5a0Var instanceof f5a0)) {
                arrayList2.add(obj3);
            }
        }
        uda0 uda0Var = new uda0(arrayList2, b.b);
        oz3 c2 = i2b1.c(autoTopupSettingsSuccessData2.getBindingPaymentInstructions());
        List<String> boundPaymentMethodIds = autoTopupSettingsSuccessData2.getBoundPaymentMethodIds();
        AutoTopupToolbarButton toolbarButton = autoTopupSettingsSuccessData2.getToolbarButton();
        if (toolbarButton != null) {
            autoTopupSettingsSuccessData = autoTopupSettingsSuccessData2;
            nsz0Var = new nsz0(job1.f(qxy0.c(toolbarButton.getImage(), null), new at3(8)), toolbarButton.getAction());
        } else {
            autoTopupSettingsSuccessData = autoTopupSettingsSuccessData2;
            nsz0Var = null;
        }
        nz3 nz3Var = new nz3(boundPaymentMethodIds, c2, nsz0Var);
        FullScreenDto confirmationPaymentInstruction = autoTopupSettingsSuccessData.getConfirmationPaymentInstruction();
        if (confirmationPaymentInstruction != null) {
            String id = confirmationPaymentInstruction.getId();
            if (id == null) {
                id = "confirmation_payment_instruction_unknown_story_id";
            }
            vou0Var = com.ybsdk.core.stories.b.d(confirmationPaymentInstruction, id, 0);
        } else {
            vou0Var = null;
        }
        AutoTopupDataDto autotopupData = autoTopupSettingsSuccessData.getAutotopupData();
        boolean enabled = autotopupData.getEnabled();
        String title = autotopupData.getTitle();
        String description = autotopupData.getDescription();
        List<AutoTopupTypeSetting> typeSettings = autotopupData.getTypeSettings();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = typeSettings.iterator();
        while (it.hasNext()) {
            AutoTopupTypeSetting autoTopupTypeSetting = (AutoTopupTypeSetting) it.next();
            AutoTopupDataDto autoTopupDataDto = autotopupData;
            int i = d04.b[autoTopupTypeSetting.getAutotopupType().ordinal()];
            Iterator it2 = it;
            if (i == 1) {
                autoTopupType = AutoTopupType.BALANCE_THRESHOLD;
            } else if (i == 2) {
                autoTopupType = AutoTopupType.UP_TO_BALANCE;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                x4c.g("UNKNOWN autotopup TypeSetting", null, null, null, 14);
                autoTopupType = null;
            }
            if (autoTopupType == null) {
                str = agreementId;
                text = f;
                constant = e;
                cn11Var = null;
            } else {
                boolean selected = autoTopupTypeSetting.getSelected();
                String title2 = autoTopupTypeSetting.getTitle();
                List<AutoTopupMoneyDto> moneyFields = autoTopupTypeSetting.getMoneyFields();
                if (moneyFields != null) {
                    List<AutoTopupMoneyDto> list2 = moneyFields;
                    str = agreementId;
                    text = f;
                    constant = e;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        AutoTopupMoneyDto autoTopupMoneyDto = (AutoTopupMoneyDto) it3.next();
                        int i2 = d04.c[autoTopupMoneyDto.getFieldType().ordinal()];
                        Iterator it4 = it3;
                        if (i2 == 1) {
                            autoTopupInputType = AutoTopupInputType.AMOUNT;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            autoTopupInputType = AutoTopupInputType.THRESHOLD;
                        }
                        AutoTopupInputType autoTopupInputType2 = autoTopupInputType;
                        String title3 = autoTopupMoneyDto.getTitle();
                        String hint = autoTopupMoneyDto.getHint();
                        Money amount = autoTopupMoneyDto.getAmount();
                        if (amount == null || (bigDecimal2 = amount.getAmount()) == null) {
                            bigDecimal2 = BigDecimal.ZERO;
                        }
                        BigDecimal bigDecimal3 = bigDecimal2;
                        Money amount2 = autoTopupMoneyDto.getAmount();
                        if (amount2 == null || (currency2 = amount2.getCurrency()) == null || (symbol2 = w530Var.b(currency2)) == null) {
                            Money amount3 = autoTopupMoneyDto.getAmount();
                            c = '\n';
                            x4c.g("cannot get currency symbol for the auto topup input", null, amount3 != null ? amount3.getCurrency() : null, null, 10);
                            symbol2 = NumberFormatUtils$Currencies.RUB.getSymbol();
                        } else {
                            c = '\n';
                        }
                        arrayList.add(new c22(autoTopupInputType2, title3, hint, bigDecimal3, symbol2));
                        it3 = it4;
                    }
                } else {
                    str = agreementId;
                    text = f;
                    constant = e;
                    arrayList = null;
                }
                cn11Var = new cn11(selected, autoTopupType, title2, arrayList);
            }
            if (cn11Var != null) {
                arrayList3.add(cn11Var);
            }
            it = it2;
            autotopupData = autoTopupDataDto;
            agreementId = str;
            f = text;
            e = constant;
        }
        String str2 = agreementId;
        Text text2 = f;
        Text.Constant constant2 = e;
        TextBadgeDto titleEndBadge = autotopupData.getTitleEndBadge();
        mz3 mz3Var = new mz3(enabled, title, description, arrayList3, titleEndBadge != null ? new iky0(qxy0.c(titleEndBadge.getIcon(), null), titleEndBadge.getAction()) : null);
        C0142AutofundDataDto autofundData = autoTopupSettingsSuccessData.getAutofundData();
        if (autofundData != null) {
            boolean enabled2 = autofundData.getEnabled();
            String title4 = autofundData.getTitle();
            String description2 = autofundData.getDescription();
            AutoFundMoneyDto amount4 = autofundData.getAmount();
            if (amount4 == null) {
                r13 = 0;
                c22Var = null;
            } else {
                if (d04.d[amount4.getFieldType().ordinal()] != 1) {
                    w511.b();
                    return null;
                }
                AutoFundInputType autoFundInputType = AutoFundInputType.AUTOFUND_MONEY;
                String title5 = amount4.getTitle();
                String hint2 = amount4.getHint();
                Money amount5 = amount4.getAmount();
                if (amount5 == null || (bigDecimal = amount5.getAmount()) == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal4 = bigDecimal;
                Money amount6 = amount4.getAmount();
                if (amount6 == null || (currency = amount6.getCurrency()) == null || (symbol = w530Var.b(currency)) == null) {
                    Money amount7 = amount4.getAmount();
                    z = false;
                    x4c.g("cannot get currency symbol for the auto topup input", null, amount7 != null ? amount7.getCurrency() : null, Collections.singletonList(lrp0.b), 2);
                    symbol = NumberFormatUtils$Currencies.RUB.getSymbol();
                } else {
                    z = false;
                }
                c22Var = new c22(autoFundInputType, title5, hint2, bigDecimal4, symbol);
                r13 = z;
            }
            String info = autofundData.getInfo();
            TextBadgeDto titleEndBadge2 = autofundData.getTitleEndBadge();
            lz3Var = new lz3(enabled2, title4, description2, c22Var, info, titleEndBadge2 != null ? new iky0(qxy0.c(titleEndBadge2.getIcon(), r13), titleEndBadge2.getAction()) : r13);
            pz3Var = r13;
        } else {
            pz3Var = null;
            lz3Var = null;
        }
        String autoTopupId = autoTopupSettingsSuccessData.getAutoTopupId();
        CurrentPaymentMethodDto paymentMethod = autoTopupSettingsSuccessData.getPaymentMethod();
        if (paymentMethod != null) {
            lz3 lz3Var3 = lz3Var;
            r15 = qgf.a(paymentMethod, w530Var, false);
            pz3Var2 = pz3Var;
            lz3Var2 = lz3Var3;
        } else {
            pz3Var2 = pz3Var;
            lz3Var2 = lz3Var;
            r15 = pz3Var2;
        }
        SavingsNoticeDto savingsNotice = autoTopupSettingsSuccessData.getSavingsNotice();
        if (savingsNotice != null) {
            pz3Var2 = e04Var.b(savingsNotice);
        }
        qz3 qz3Var = new qz3(str2, text2, constant2, f2, f3, uda0Var, pz3Var2, nz3Var, vou0Var, mz3Var, lz3Var2, autoTopupId, r15, e04.a(autoTopupSettingsSuccessData.getFullScreens(), FullScreenEntity$Type.AUTOTOPUP_SETTINGS));
        return qz3Var == CoroutineSingletons.COROUTINE_SUSPENDED ? qz3Var : new Result(qz3Var);
    }
}
