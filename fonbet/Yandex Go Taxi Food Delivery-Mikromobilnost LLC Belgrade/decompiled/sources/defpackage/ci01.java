package defpackage;

import android.net.Uri;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import com.ybsdk.feature.transfer.version2.api.entities.TransferHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Locale;
import java.util.UUID;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class ci01 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02cb A[LOOP:0: B:18:0x02c9->B:19:0x02cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TransferMainScreenArguments a(Uri uri) {
        boolean i;
        TransferScenario transferScenario;
        TransferScenario transferScenario2;
        TransferPrerequisites template;
        TransferMainScreenArguments transferMainScreenArguments;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        TransferPrerequisites.CrossBorder.PriorityMoneyType priorityMoneyType;
        TransferPrerequisites.CrossBorder.PriorityMoneyType priorityMoneyType2;
        TransferPrerequisites internetPayment;
        String str;
        int i2;
        int i3;
        String o;
        TransferSkeletonType transferSkeletonType;
        int i4;
        String str2;
        String o2 = bzk0.o(uri, SdkUri$QueryParam.SOURCE_AGREEMENT_ID);
        String o3 = bzk0.o(uri, SdkUri$QueryParam.TARGET_AGREEMENT_ID);
        i = bzk0.i(uri, SdkUri$QueryParam.SELECT_MAIN_ACCOUNT_ON_ENTER, false);
        String o4 = bzk0.o(uri, SdkUri$QueryParam.DIRECTION);
        TransferDirection transferDirection = jl40.l(o4, SdkUri$QueryParam.TOPUP.getParamValue()) ? TransferDirection.TOPUP : jl40.l(o4, SdkUri$QueryParam.TRANSFER.getParamValue()) ? TransferDirection.TRANSFER : TransferDirection.TRANSFER;
        String o5 = bzk0.o(uri, SdkUri$QueryParam.SCENARIO);
        SdkUri$QueryParam sdkUri$QueryParam = SdkUri$QueryParam.PHONE;
        TransferPrerequisites transferPrerequisites = null;
        if (jl40.l(o5, sdkUri$QueryParam.getParamValue())) {
            transferScenario2 = TransferScenario.PHONE;
        } else if (jl40.l(o5, SdkUri$QueryParam.SELF.getParamValue())) {
            transferScenario2 = TransferScenario.SELF;
        } else if (jl40.l(o5, SdkUri$QueryParam.REQUISITES.getParamValue())) {
            transferScenario2 = TransferScenario.REQUISITES;
        } else if (jl40.l(o5, SdkUri$QueryParam.MOBILE_PAYMENT.getParamValue())) {
            transferScenario2 = TransferScenario.MOBILE_PAYMENT;
        } else if (jl40.l(o5, SdkUri$QueryParam.INTERNET_PAYMENT.getParamValue())) {
            transferScenario2 = TransferScenario.INTERNET_PAYMENT;
        } else if (jl40.l(o5, SdkUri$QueryParam.C2G.getParamValue())) {
            transferScenario2 = TransferScenario.C2G;
        } else if (jl40.l(o5, SdkUri$QueryParam.TIPS.getParamValue())) {
            transferScenario2 = TransferScenario.TIPS;
        } else if (jl40.l(o5, SdkUri$QueryParam.FUND.getParamValue())) {
            transferScenario2 = TransferScenario.FUND;
        } else if (jl40.l(o5, SdkUri$QueryParam.INVOICE_HCS.getParamValue())) {
            transferScenario2 = TransferScenario.INVOICE_HCS;
        } else if (jl40.l(o5, SdkUri$QueryParam.CROSS_BORDER.getParamValue())) {
            transferScenario2 = TransferScenario.CROSS_BORDER;
        } else if (jl40.l(o5, SdkUri$QueryParam.MKK_CASHOUT.getParamValue())) {
            transferScenario2 = TransferScenario.MKK_CASHOUT;
        } else {
            if (!jl40.l(o5, SdkUri$QueryParam.SAVERS_TOPUP.getParamValue())) {
                transferScenario = null;
                String o6 = bzk0.o(uri, SdkUri$QueryParam.TYPE);
                String o7 = bzk0.o(uri, SdkUri$QueryParam.TEMPLATE_ID);
                template = (o6 != null || o7 == null) ? null : new TransferPrerequisites.Template(o7, o6, bzk0.o(uri, SdkUri$QueryParam.TEMPLATE_TYPE));
                if (template == null) {
                    if (!jl40.l(o6, sdkUri$QueryParam.getParamValue())) {
                        if (jl40.l(o6, SdkUri$QueryParam.SELF_TRANSFER.getParamValue())) {
                            int i5 = bi01.b[transferDirection.ordinal()];
                            if (i5 == 1) {
                                str = o3;
                            } else {
                                if (i5 != 2) {
                                    w511.b();
                                    return null;
                                }
                                str = o2;
                            }
                            if (str != null) {
                                template = new TransferPrerequisites.Self(str);
                            }
                            template = null;
                        } else if (jl40.l(o6, SdkUri$QueryParam.MOBILE_PAYMENT.getParamValue())) {
                            String o8 = bzk0.o(uri, sdkUri$QueryParam);
                            String o9 = bzk0.o(uri, SdkUri$QueryParam.PROVIDER_ID);
                            if (o8 != null && o9 != null) {
                                internetPayment = new TransferPrerequisites.MobilePayment(o8, o9);
                                template = internetPayment;
                            }
                            template = null;
                        } else {
                            if (jl40.l(o6, SdkUri$QueryParam.INTERNET_PAYMENT.getParamValue())) {
                                String o10 = bzk0.o(uri, SdkUri$QueryParam.PROVIDER_ID);
                                String o11 = bzk0.o(uri, SdkUri$QueryParam.ACCOUNT);
                                if (o10 != null && o11 != null) {
                                    internetPayment = new TransferPrerequisites.InternetPayment(o10, o11);
                                    template = internetPayment;
                                }
                            } else if (jl40.l(o6, SdkUri$QueryParam.C2G.getParamValue())) {
                                String o12 = bzk0.o(uri, SdkUri$QueryParam.INVOICE_ID);
                                if (o12 != null) {
                                    template = new TransferPrerequisites.C2g(o12);
                                }
                            } else if (jl40.l(o6, SdkUri$QueryParam.LEGAL.getParamValue())) {
                                template = new TransferPrerequisites.Requisites(bzk0.o(uri, SdkUri$QueryParam.QR_STRING));
                            } else if (jl40.l(o6, SdkUri$QueryParam.HCS.getParamValue())) {
                                template = new TransferPrerequisites.Hcs(bzk0.o(uri, SdkUri$QueryParam.QR_STRING));
                            } else if (jl40.l(o6, SdkUri$QueryParam.INVOICE_HCS.getParamValue())) {
                                String o13 = bzk0.o(uri, SdkUri$QueryParam.INVOICE_ID);
                                if (o13 != null) {
                                    template = new TransferPrerequisites.InvoiceHcs(o13);
                                }
                            } else if (jl40.l(o6, SdkUri$QueryParam.CROSS_BORDER.getParamValue())) {
                                String o14 = bzk0.o(uri, sdkUri$QueryParam);
                                String o15 = bzk0.o(uri, SdkUri$QueryParam.BANK_ID);
                                String o16 = bzk0.o(uri, SdkUri$QueryParam.DEBIT_AMOUNT);
                                String o17 = bzk0.o(uri, SdkUri$QueryParam.DEBIT_CURRENCY);
                                String o18 = bzk0.o(uri, SdkUri$QueryParam.CREDIT_AMOUNT);
                                String o19 = bzk0.o(uri, SdkUri$QueryParam.CREDIT_CURRENCY);
                                String o20 = bzk0.o(uri, SdkUri$QueryParam.PRIORITY_MONEY_TYPE);
                                transferMainScreenArguments = null;
                                String o21 = bzk0.o(uri, SdkUri$QueryParam.CURRENCY_RATE);
                                String o22 = bzk0.o(uri, SdkUri$QueryParam.RECEIVER_FULL_NAME);
                                if (o16 != null) {
                                    Locale locale = tm60.a;
                                    bigDecimal = tm60.g(o16);
                                } else {
                                    bigDecimal = null;
                                }
                                if (o18 != null) {
                                    Locale locale2 = tm60.a;
                                    bigDecimal2 = tm60.g(o18);
                                } else {
                                    bigDecimal2 = null;
                                }
                                if (jl40.l(o20, Card.CARD_TYPE_DEBIT)) {
                                    priorityMoneyType2 = TransferPrerequisites.CrossBorder.PriorityMoneyType.DEBIT;
                                } else if (jl40.l(o20, Card.CARD_TYPE_CREDIT)) {
                                    priorityMoneyType2 = TransferPrerequisites.CrossBorder.PriorityMoneyType.CREDIT;
                                } else {
                                    priorityMoneyType = null;
                                    template = (o14 != null || o15 == null || bigDecimal == null || o17 == null || bigDecimal2 == null || o19 == null || priorityMoneyType == null) ? null : new TransferPrerequisites.CrossBorder(o14, o15, bigDecimal, o17, bigDecimal2, o19, priorityMoneyType, o21, o22, null, null, HProv.ALG_TYPE_BLOCK, null);
                                    transferPrerequisites = template;
                                }
                                priorityMoneyType = priorityMoneyType2;
                                if (o14 != null) {
                                }
                                transferPrerequisites = template;
                            } else {
                                transferMainScreenArguments = null;
                            }
                            template = null;
                        }
                        String o23 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                        String o24 = bzk0.o(uri, SdkUri$QueryParam.COUNTRY_CODE);
                        String o25 = bzk0.o(uri, SdkUri$QueryParam.CROSS_BORDER_SCENARIO);
                        byte[] bArr = tje.Q2;
                        byte[] bArr2 = new byte[14];
                        i3 = 0;
                        for (i2 = 14; i3 < i2; i2 = 14) {
                            bArr2[i3] = (byte) (bArr[i3] ^ tje.b[i3 % 8]);
                            i3++;
                        }
                        CrossBorderScenario crossBorderScenario = jl40.l(o25, new String(bArr2, uza.a)) ? CrossBorderScenario.PARTNER_WITH_NAME : jl40.l(o25, "phone_name") ? (o24 == null || evu0.J(o24)) ? CrossBorderScenario.PARTNER : CrossBorderScenario.PHONE_WITH_NAME : CrossBorderScenario.PARTNER;
                        String o26 = bzk0.o(uri, sdkUri$QueryParam);
                        o = bzk0.o(uri, SdkUri$QueryParam.SKELETON_TYPE);
                        if (o != null) {
                            TransferSkeletonType.Companion.getClass();
                            transferSkeletonType = bt01.a(o);
                        } else {
                            transferSkeletonType = transferMainScreenArguments;
                        }
                        i4 = bi01.b[transferDirection.ordinal()];
                        if (i4 == 1) {
                            str2 = o2;
                        } else {
                            if (i4 != 2) {
                                w511.b();
                                return transferMainScreenArguments;
                            }
                            str2 = o3;
                        }
                        return new TransferMainScreenArguments(transferDirection, str2, transferPrerequisites, transferScenario, false, i, o23, o24, crossBorderScenario, o26, transferSkeletonType);
                    }
                    String o27 = bzk0.o(uri, sdkUri$QueryParam);
                    String o28 = bzk0.o(uri, SdkUri$QueryParam.BNK_ID);
                    if (o27 != null && o28 != null) {
                        internetPayment = new TransferPrerequisites.Phone(o27, o28);
                        template = internetPayment;
                    }
                    template = null;
                }
                transferMainScreenArguments = null;
                transferPrerequisites = template;
                String o232 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
                String o242 = bzk0.o(uri, SdkUri$QueryParam.COUNTRY_CODE);
                String o252 = bzk0.o(uri, SdkUri$QueryParam.CROSS_BORDER_SCENARIO);
                byte[] bArr3 = tje.Q2;
                byte[] bArr22 = new byte[14];
                i3 = 0;
                while (i3 < i2) {
                }
                CrossBorderScenario crossBorderScenario2 = jl40.l(o252, new String(bArr22, uza.a)) ? CrossBorderScenario.PARTNER_WITH_NAME : jl40.l(o252, "phone_name") ? (o242 == null || evu0.J(o242)) ? CrossBorderScenario.PARTNER : CrossBorderScenario.PHONE_WITH_NAME : CrossBorderScenario.PARTNER;
                String o262 = bzk0.o(uri, sdkUri$QueryParam);
                o = bzk0.o(uri, SdkUri$QueryParam.SKELETON_TYPE);
                if (o != null) {
                }
                i4 = bi01.b[transferDirection.ordinal()];
                if (i4 == 1) {
                }
                return new TransferMainScreenArguments(transferDirection, str2, transferPrerequisites, transferScenario, false, i, o232, o242, crossBorderScenario2, o262, transferSkeletonType);
            }
            transferScenario2 = TransferScenario.SAVERS_TOPUP;
        }
        transferScenario = transferScenario2;
        String o62 = bzk0.o(uri, SdkUri$QueryParam.TYPE);
        String o72 = bzk0.o(uri, SdkUri$QueryParam.TEMPLATE_ID);
        if (o62 != null) {
        }
        if (template == null) {
        }
        transferMainScreenArguments = null;
        transferPrerequisites = template;
        String o2322 = bzk0.o(uri, SdkUri$QueryParam.TITLE);
        String o2422 = bzk0.o(uri, SdkUri$QueryParam.COUNTRY_CODE);
        String o2522 = bzk0.o(uri, SdkUri$QueryParam.CROSS_BORDER_SCENARIO);
        byte[] bArr32 = tje.Q2;
        byte[] bArr222 = new byte[14];
        i3 = 0;
        while (i3 < i2) {
        }
        CrossBorderScenario crossBorderScenario22 = jl40.l(o2522, new String(bArr222, uza.a)) ? CrossBorderScenario.PARTNER_WITH_NAME : jl40.l(o2522, "phone_name") ? (o2422 == null || evu0.J(o2422)) ? CrossBorderScenario.PARTNER : CrossBorderScenario.PHONE_WITH_NAME : CrossBorderScenario.PARTNER;
        String o2622 = bzk0.o(uri, sdkUri$QueryParam);
        o = bzk0.o(uri, SdkUri$QueryParam.SKELETON_TYPE);
        if (o != null) {
        }
        i4 = bi01.b[transferDirection.ordinal()];
        if (i4 == 1) {
        }
        return new TransferMainScreenArguments(transferDirection, str2, transferPrerequisites, transferScenario, false, i, o2322, o2422, crossBorderScenario22, o2622, transferSkeletonType);
    }

    public static DeeplinkAction.Transfer b(Uri uri) {
        return new DeeplinkAction.Transfer(a(uri));
    }

    public static DeeplinkAction.SavingTransfer c(Uri uri) {
        return new DeeplinkAction.SavingTransfer(a(uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DeeplinkAction.TransferState d(Uri uri) {
        String o;
        String o2;
        String o3;
        String o4;
        TransferMainResultScreenParams me2MeTopupParams;
        String o5 = bzk0.o(uri, SdkUri$QueryParam.SCENARIO);
        TransferMainResultScreenParams.Scenario scenario = jl40.l(o5, SdkUri$QueryParam.ME2ME.getParamValue()) ? TransferMainResultScreenParams.Scenario.ME2ME : jl40.l(o5, SdkUri$QueryParam.SELF.getParamValue()) ? TransferMainResultScreenParams.Scenario.SELF : jl40.l(o5, SdkUri$QueryParam.MKK_CASHOUT.getParamValue()) ? TransferMainResultScreenParams.Scenario.MKK_CASHOUT : null;
        if (scenario != null) {
            String o6 = bzk0.o(uri, SdkUri$QueryParam.DIRECTION);
            TransferDirection transferDirection = jl40.l(o6, SdkUri$QueryParam.TOPUP.getParamValue()) ? TransferDirection.TOPUP : jl40.l(o6, SdkUri$QueryParam.TRANSFER.getParamValue()) ? TransferDirection.TRANSFER : TransferDirection.TRANSFER;
            TransferDirection transferDirection2 = transferDirection == TransferDirection.TOPUP ? transferDirection : null;
            if (transferDirection2 != null) {
                String o7 = bzk0.o(uri, SdkUri$QueryParam.STATE_HEADER_TITLE);
                String o8 = bzk0.o(uri, SdkUri$QueryParam.STATE_IMAGE_LIGHT);
                if (o8 != null && (o = bzk0.o(uri, SdkUri$QueryParam.STATE_IMAGE_DARK)) != null && (o2 = bzk0.o(uri, SdkUri$QueryParam.STATE_TITLE)) != null && (o3 = bzk0.o(uri, SdkUri$QueryParam.STATE_DESCRIPTION)) != null && (o4 = bzk0.o(uri, SdkUri$QueryParam.AMOUNT)) != null) {
                    Locale locale = tm60.a;
                    BigDecimal g = tm60.g(o4);
                    if (g != null) {
                        String o9 = bzk0.o(uri, SdkUri$QueryParam.CURRENCY);
                        if (o9 == null) {
                            o9 = NumberFormatUtils$Currencies.RUB.getIso();
                        }
                        String o10 = bzk0.o(uri, SdkUri$QueryParam.CHECK_ID);
                        if (o10 == null) {
                            o10 = "";
                        }
                        String str = o10;
                        String o11 = bzk0.o(uri, SdkUri$QueryParam.TRANSFER_ID);
                        String o12 = bzk0.o(uri, SdkUri$QueryParam.TIMEOUT_HEADER_TITLE);
                        String o13 = bzk0.o(uri, SdkUri$QueryParam.TIMEOUT_IMAGE_LIGHT);
                        String o14 = bzk0.o(uri, SdkUri$QueryParam.TIMEOUT_IMAGE_DARK);
                        String o15 = bzk0.o(uri, SdkUri$QueryParam.TIMEOUT_TITLE);
                        String o16 = bzk0.o(uri, SdkUri$QueryParam.TIMEOUT_DESCRIPTION);
                        MoneyEntity moneyEntity = new MoneyEntity(g, o9, o4);
                        TransferResultPageEntity transferResultPageEntity = new TransferResultPageEntity(o7 != null ? new TransferHeaderEntity(o7, null, null) : null, "", new ThemedImageUrlEntity(o8, o), o2, o3, null, null, null, null, null, null, null);
                        TransferResultPageEntity transferResultPageEntity2 = (o12 == null || o15 == null || o16 == null) ? null : new TransferResultPageEntity(new TransferHeaderEntity(o12, null, null), "", new ThemedImageUrlEntity(o13, o14), o15, o16, null, null, null, null, null, null, null);
                        String o17 = bzk0.o(uri, SdkUri$QueryParam.REFERRER);
                        int i = bi01.a[scenario.ordinal()];
                        if (i == 1) {
                            String o18 = bzk0.o(uri, SdkUri$QueryParam.TARGET_AGREEMENT_ID);
                            String o19 = bzk0.o(uri, SdkUri$QueryParam.BNK_ID);
                            if (o18 != null && o19 != null) {
                                me2MeTopupParams = new TransferMainResultScreenParams.Me2MeTopupParams(null, o17, transferDirection2, null, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str, o11, o18, o19, UUID.randomUUID().toString(), null);
                                if (me2MeTopupParams == null) {
                                }
                            }
                        } else if (i == 2) {
                            String o20 = bzk0.o(uri, SdkUri$QueryParam.SOURCE_AGREEMENT_ID);
                            String o21 = bzk0.o(uri, SdkUri$QueryParam.TARGET_ID);
                            if (o21 != null && o20 != null) {
                                me2MeTopupParams = new TransferMainResultScreenParams.SelfTopupParams(null, o17, o20, transferDirection2, null, transferResultPageEntity, transferResultPageEntity2, o21, moneyEntity, str, o11, UUID.randomUUID().toString(), null);
                                if (me2MeTopupParams == null) {
                                }
                            }
                        } else {
                            if (i != 3) {
                                w511.b();
                                return null;
                            }
                            String o22 = bzk0.o(uri, SdkUri$QueryParam.PLAN_ID);
                            if (o22 != null) {
                                me2MeTopupParams = new TransferMainResultScreenParams.MkkCashoutParams(null, o17, transferDirection2, TransferScenario.MKK_CASHOUT, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str, o11, UUID.randomUUID().toString(), o22);
                                if (me2MeTopupParams == null) {
                                    return new DeeplinkAction.TransferState(me2MeTopupParams);
                                }
                                return null;
                            }
                            x4c.g("planId is required for MKK_CASHOUT transfer_state", null, null, Collections.singletonList(orp0.e), 6);
                        }
                    }
                }
            }
        }
        me2MeTopupParams = null;
        if (me2MeTopupParams == null) {
        }
    }
}
