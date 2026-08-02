package defpackage;

import android.content.Context;
import com.yandex.payment.divkit.BankNameForMethod;
import com.yandex.payment.divkit.StringMethod;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.FamilyInfo;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.FamilyInfoFrame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ftf {
    public static final String a(vcq0 vcq0Var) {
        BankNameForMethod bankNameForMethod;
        String value;
        BankNameForMethod bankNameForMethod2;
        PaymentMethod paymentMethod = vcq0Var.a;
        if (!(paymentMethod instanceof PaymentMethod.Card)) {
            if (!(paymentMethod instanceof PaymentMethod.SbpToken)) {
                return ((paymentMethod instanceof PaymentMethod.NewSbpToken) || (paymentMethod instanceof PaymentMethod.Sbp)) ? StringMethod.SBP.getValue() : paymentMethod instanceof PaymentMethod.YBMethod ? StringMethod.YB.getValue() : BankNameForMethod.UNKNOWN.getValue();
            }
            String memberId = ((PaymentMethod.SbpToken) paymentMethod).getMemberId();
            BankNameForMethod[] values = BankNameForMethod.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bankNameForMethod = null;
                    break;
                }
                bankNameForMethod = values[i];
                if (jl40.l(bankNameForMethod.getScheme(), memberId)) {
                    break;
                }
                i++;
            }
            return (bankNameForMethod == null || (value = bankNameForMethod.getValue()) == null) ? BankNameForMethod.UNKNOWN.getValue() : value;
        }
        switch (kwq.a[((PaymentMethod.Card) paymentMethod).getBankName().ordinal()]) {
            case 1:
                bankNameForMethod2 = BankNameForMethod.ALPHA_BANK;
                break;
            case 2:
                bankNameForMethod2 = BankNameForMethod.SBERBANK;
                break;
            case 3:
                bankNameForMethod2 = BankNameForMethod.TINKOFF;
                break;
            case 4:
                bankNameForMethod2 = BankNameForMethod.VTB;
                break;
            case 5:
                bankNameForMethod2 = BankNameForMethod.GAZPROM;
                break;
            case 6:
                bankNameForMethod2 = BankNameForMethod.OPEN_BANK;
                break;
            case 7:
                bankNameForMethod2 = BankNameForMethod.PROMSVYAZ;
                break;
            case 8:
                bankNameForMethod2 = BankNameForMethod.ROSBANK;
                break;
            case 9:
                bankNameForMethod2 = BankNameForMethod.UNICREDIT_BANK;
                break;
            case 10:
                bankNameForMethod2 = BankNameForMethod.RAIFFEISEN_BANK;
                break;
            default:
                bankNameForMethod2 = BankNameForMethod.UNKNOWN;
                break;
        }
        return bankNameForMethod2.getValue();
    }

    public static final String b(FamilyInfo familyInfo, ouj0 ouj0Var, rwo rwoVar) {
        FamilyInfoFrame c = he91.c(familyInfo.getFrame());
        if (familyInfo.getIsUnlimited()) {
            return ((abe) ouj0Var).a.getString(tyh0.paymentsdk_prebuilt_family_pay_available_unlimit);
        }
        if (familyInfo.getAvailable() <= 0.0d) {
            return ((abe) ouj0Var).a.getString(tyh0.paymentsdk_prebuilt_family_pay_limit_reached);
        }
        String c2 = mta1.c(((abe) ouj0Var).a, familyInfo.getAvailable(), familyInfo.getCurrency(), rwoVar);
        int i = c == null ? -1 : etf.a[c.ordinal()];
        if (i == -1) {
            return ((abe) ouj0Var).g(tyh0.paymentsdk_prebuilt_family_pay_available_format, new Object[]{c2});
        }
        if (i == 1) {
            return ((abe) ouj0Var).g(tyh0.paymentsdk_prebuilt_family_pay_available_day_format, new Object[]{c2});
        }
        if (i == 2) {
            return ((abe) ouj0Var).g(tyh0.paymentsdk_prebuilt_family_pay_available_week_format, new Object[]{c2});
        }
        if (i == 3) {
            return ((abe) ouj0Var).g(tyh0.paymentsdk_prebuilt_family_pay_available_month_format, new Object[]{c2});
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dtf c(List list, abe abeVar, int i, boolean z, String str, String str2, kq4 kq4Var, boolean z2, String str3, rwo rwoVar, Map map, int i2) {
        String value;
        int i3;
        String str4;
        String g;
        boolean z3;
        FamilyInfo familyInfo;
        String b;
        String str5;
        String str6;
        String errorRespCode;
        String str7;
        String payload;
        String str8 = (i2 & 128) != 0 ? null : str3;
        Map map2 = (i2 & 512) != 0 ? null : map;
        Context context = abeVar.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new vcq0((PaymentMethod) it.next(), false, false, null, null));
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            vcq0 vcq0Var = (vcq0) it2.next();
            PaymentMethod paymentMethod = vcq0Var.a;
            if (paymentMethod instanceof PaymentMethod.Card) {
                value = StringMethod.CARD.getValue();
            } else if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE)) {
                value = StringMethod.CASH.getValue();
            } else if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
                value = StringMethod.GOOGLE.getValue();
            } else if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
                value = StringMethod.ADD_CARD.getValue();
            } else if (paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
                value = StringMethod.SBP.getValue();
            } else if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE)) {
                value = StringMethod.SBP.getValue();
            } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
                value = StringMethod.SBP_TOKEN.getValue();
            } else if (paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE)) {
                value = BankNameForMethod.TINKOFF.getValue();
            } else if (paymentMethod instanceof PaymentMethod.YBMethod) {
                value = StringMethod.YB.getValue();
            } else if (paymentMethod.equals(PaymentMethod.Split.INSTANCE)) {
                value = StringMethod.SPLIT.getValue();
            } else {
                if (!paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                    w511.b();
                    return null;
                }
                value = StringMethod.CHALLENGE_POLLING.getValue();
            }
            String str9 = value;
            String a = a(vcq0Var);
            PaymentMethod paymentMethod2 = vcq0Var.a;
            String str10 = vcq0Var.e;
            if (str10 == null) {
                String str11 = "";
                if (paymentMethod2 instanceof PaymentMethod.Card) {
                    PaymentMethod.Card card = (PaymentMethod.Card) paymentMethod2;
                    CardPaymentSystem system = card.getSystem() == CardPaymentSystem.MIR ? null : card.getSystem();
                    CardPaymentSystem system2 = card.getSystem();
                    if (z2) {
                        system2 = null;
                    }
                    if (system2 != null) {
                        system = system2;
                    }
                    if (system != null && (g = znb1.g(system)) != null) {
                        str11 = g;
                    }
                    str10 = abeVar.g(tyh0.paymentsdk_prebuilt_card_list_item_number_format, new Object[]{str11, gvu0.B0(4, card.getAccount())});
                } else if (paymentMethod2 instanceof PaymentMethod.SbpToken) {
                    if (!n891.l() ? (str10 = ((PaymentMethod.SbpToken) paymentMethod2).getMemberName()) == null : (str10 = ((PaymentMethod.SbpToken) paymentMethod2).getMemberNameRus()) == null) {
                        str4 = "";
                        z3 = paymentMethod2 instanceof PaymentMethod.Card;
                        if (z3) {
                            if (paymentMethod2 instanceof PaymentMethod.Sbp) {
                                b = context.getString(z2 ? tyh0.paymentsdk_non_new_sbp_subtitle : tyh0.paymentsdk_new_sbp_subtitle);
                            } else if (paymentMethod2 instanceof PaymentMethod.SbpToken) {
                                b = context.getString(z2 ? tyh0.paymentsdk_non_sbp_title : tyh0.paymentsdk_sbp_subtitle);
                            } else {
                                if ((paymentMethod2 instanceof PaymentMethod.YBMethod) && (familyInfo = ((PaymentMethod.YBMethod) paymentMethod2).getFamilyInfo()) != null) {
                                    b = b(familyInfo, abeVar, rwoVar);
                                }
                                str5 = null;
                            }
                            str5 = b;
                        } else {
                            FamilyInfo familyInfo2 = ((PaymentMethod.Card) paymentMethod2).getFamilyInfo();
                            if (familyInfo2 != null) {
                                b = b(familyInfo2, abeVar, rwoVar);
                                str5 = b;
                            }
                            str5 = null;
                        }
                        kq4 kq4Var2 = !a8a0.f(l7b1.a(vcq0Var)) ? kq4Var : null;
                        String o = g8e.o("local-image://", a(vcq0Var));
                        boolean z4 = paymentMethod2 instanceof PaymentMethod.SbpToken;
                        PaymentMethod.SbpToken sbpToken = !z4 ? (PaymentMethod.SbpToken) paymentMethod2 : null;
                        String memberId = sbpToken == null ? sbpToken.getMemberId() : null;
                        String str12 = (z3 ? !(paymentMethod2 instanceof PaymentMethod.YBMethod) || ((PaymentMethod.YBMethod) paymentMethod2).getFamilyInfo() == null : ((PaymentMethod.Card) paymentMethod2).getFamilyInfo() == null) ? null : "local-image://family_symbol";
                        boolean z5 = z3 ? !(!(paymentMethod2 instanceof PaymentMethod.YBMethod) || ((PaymentMethod.YBMethod) paymentMethod2).getFamilyInfo() == null) : ((PaymentMethod.Card) paymentMethod2).getFamilyInfo() != null;
                        PaymentMethod.Card card2 = !z3 ? (PaymentMethod.Card) paymentMethod2 : null;
                        List<String> restrictions = card2 == null ? card2.getRestrictions() : null;
                        if (!z3) {
                            errorRespCode = ((PaymentMethod.Card) paymentMethod2).getErrorRespCode();
                        } else if (z4) {
                            errorRespCode = ((PaymentMethod.SbpToken) paymentMethod2).getErrorRespCode();
                        } else if (paymentMethod2 instanceof PaymentMethod.YBMethod) {
                            errorRespCode = ((PaymentMethod.YBMethod) paymentMethod2).getErrorRespCode();
                        } else {
                            str6 = null;
                            if (z3) {
                                payload = ((PaymentMethod.Card) paymentMethod2).getPayload();
                            } else if (z4) {
                                payload = ((PaymentMethod.SbpToken) paymentMethod2).getPayload();
                            } else if (paymentMethod2 instanceof PaymentMethod.YBMethod) {
                                payload = ((PaymentMethod.YBMethod) paymentMethod2).getPayload();
                            } else {
                                if (!paymentMethod2.equals(PaymentMethod.Cash.INSTANCE) && !paymentMethod2.equals(PaymentMethod.GooglePay.INSTANCE) && !paymentMethod2.equals(PaymentMethod.NewCard.INSTANCE) && !paymentMethod2.equals(PaymentMethod.NewSbpToken.INSTANCE) && !paymentMethod2.equals(PaymentMethod.Sbp.INSTANCE) && !paymentMethod2.equals(PaymentMethod.Split.INSTANCE) && !paymentMethod2.equals(PaymentMethod.TinkoffCredit.INSTANCE) && !paymentMethod2.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                                    w511.b();
                                    return null;
                                }
                                str7 = null;
                                arrayList2.add(new ctf(str9, a, str4, str5, o, kq4Var2, memberId, z5, str12, restrictions, str6, str7));
                            }
                            str7 = payload;
                            arrayList2.add(new ctf(str9, a, str4, str5, o, kq4Var2, memberId, z5, str12, restrictions, str6, str7));
                        }
                        str6 = errorRespCode;
                        if (z3) {
                        }
                        str7 = payload;
                        arrayList2.add(new ctf(str9, a, str4, str5, o, kq4Var2, memberId, z5, str12, restrictions, str6, str7));
                    }
                } else if (paymentMethod2 instanceof PaymentMethod.YBMethod) {
                    if (z2) {
                        i3 = tyh0.paymentsdk_non_new_sbp_title;
                    } else {
                        PaymentMethod.YBMethod yBMethod = (PaymentMethod.YBMethod) paymentMethod2;
                        i3 = yBMethod.isProCard() ? tyh0.paymentsdk_prebuilt_yb_pro_title : yBMethod.isSplitCard() ? tyh0.paymentsdk_prebuilt_yb_split_title : tyh0.paymentsdk_prebuilt_yb_title;
                    }
                    str10 = context.getString(i3);
                } else if (paymentMethod2.equals(PaymentMethod.Cash.INSTANCE)) {
                    str10 = context.getString(tyh0.paymentsdk_prebuilt_cash_title);
                } else if (paymentMethod2.equals(PaymentMethod.GooglePay.INSTANCE)) {
                    str10 = context.getString(tyh0.paymentsdk_prebuilt_gpay_title);
                } else if (paymentMethod2.equals(PaymentMethod.NewCard.INSTANCE)) {
                    str10 = context.getString(tyh0.paymentsdk_new_card);
                } else if (paymentMethod2.equals(PaymentMethod.Sbp.INSTANCE)) {
                    str10 = context.getString(z2 ? tyh0.paymentsdk_non_new_sbp_title : tyh0.paymentsdk_new_sbp_title);
                } else if (paymentMethod2.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
                    str10 = context.getString(z2 ? tyh0.paymentsdk_non_new_sbp_title : tyh0.paymentsdk_prebuilt_sbp_title);
                } else if (paymentMethod2.equals(PaymentMethod.TinkoffCredit.INSTANCE)) {
                    str10 = "Tinkoff credit";
                } else if (paymentMethod2.equals(PaymentMethod.Split.INSTANCE)) {
                    str10 = "Split";
                } else {
                    if (!paymentMethod2.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    str10 = "ChallengePollingMethod";
                }
            }
            str4 = str10;
            z3 = paymentMethod2 instanceof PaymentMethod.Card;
            if (z3) {
            }
            if (!a8a0.f(l7b1.a(vcq0Var))) {
            }
            String o2 = g8e.o("local-image://", a(vcq0Var));
            boolean z42 = paymentMethod2 instanceof PaymentMethod.SbpToken;
            if (!z42) {
            }
            if (sbpToken == null) {
            }
            if (z3) {
            }
            if (z3) {
            }
            if (!z3) {
            }
            if (card2 == null) {
            }
            if (!z3) {
            }
            str6 = errorRespCode;
            if (z3) {
            }
            str7 = payload;
            arrayList2.add(new ctf(str9, a, str4, str5, o2, kq4Var2, memberId, z5, str12, restrictions, str6, str7));
        }
        return new dtf(i, str, str2, str8, null, arrayList2, map2, z);
    }
}
