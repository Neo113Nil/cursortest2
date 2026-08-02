package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.y0;
import com.yandex.passport.common.bitflag.EnumFlagHolder;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.ChallengeMethod;
import com.yandex.xplat.payment.sdk.FamilyInfo;
import com.yandex.xplat.payment.sdk.IconURLs;
import com.yandex.xplat.payment.sdk.PartnerInfo;
import com.yandex.xplat.payment.sdk.PaymentDetails;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentMethodType;
import com.yandex.xplat.payment.sdk.PaymentSettings;
import com.yandex.xplat.payment.sdk.YBCardType;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class bd90 implements tls {
    public final /* synthetic */ int a;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (((defpackage.fl8) r1).h == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        g render$lambda$19$lambda$18;
        wj00 wj00Var;
        ArrayList arrayList;
        FamilyInfo familyInfo;
        wj00 wj00Var2;
        PartnerInfo partnerInfo;
        wj00 wj00Var3;
        IconURLs iconURLs;
        wj00 wj00Var4;
        String str;
        BankName bankName;
        PaymentMethodType paymentMethodType;
        int i = this.a;
        int i2 = 2;
        boolean z = false;
        Object[] objArr = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fd90 fd90Var = (fd90) obj;
                ed90 ed90Var = jd90.Companion;
                if (fd90Var != null) {
                    return fd90Var.b;
                }
                return null;
            case 1:
                ff90 ff90Var = (ff90) obj;
                StringBuilder sb = new StringBuilder("position ");
                sb.append(ff90Var.a);
                sb.append(": '");
                return b64.p(sb, (String) ff90Var.b.invoke(), '\'');
            case 2:
                YBCardType yBCardType = null;
                wj00 b = ((y3x) obj).b();
                boolean n = b.n("is_yb_card");
                boolean n2 = b.n("is_yb_card_owner");
                List e = b.e("yb_card_labels");
                if (e != null) {
                    Iterator it = ((ArrayList) e).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = ((y3x) it.next()).c().b;
                            YBCardType yBCardType2 = YBCardType.YB_PLUS_CARD;
                            if (!jl40.l(str2, yBCardType2.getValue())) {
                                yBCardType2 = YBCardType.YB_PRO_CARD;
                                if (!jl40.l(str2, yBCardType2.getValue())) {
                                    yBCardType2 = YBCardType.YB_CREDIT_LIMIT_CARD;
                                    if (!jl40.l(str2, yBCardType2.getValue())) {
                                        yBCardType2 = null;
                                    }
                                }
                            }
                            if (yBCardType2 != null) {
                                yBCardType = yBCardType2;
                            }
                        }
                    }
                }
                return new PartnerInfo(n, n2, yBCardType);
            case 3:
                render$lambda$19$lambda$18 = PartnersFragment.render$lambda$19$lambda$18((g) obj);
                return render$lambda$19$lambda$18;
            case 4:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 5:
                return Boolean.valueOf(((dzd) obj).r <= 0);
            case 6:
                ((Filter.a) ((y0) obj)).b(PassportAccountType.SOCIAL);
                return zy11Var;
            case 7:
                ((Filter.a) ((y0) obj)).b(PassportAccountType.LITE);
                return zy11Var;
            case 8:
                PassportAccountType passportAccountType = PassportAccountType.PHONISH;
                EnumFlagHolder enumFlagHolder = ((Filter.a) ((y0) obj)).x;
                enumFlagHolder.reset();
                enumFlagHolder.set(passportAccountType);
                return zy11Var;
            case 9:
                PassportAccountType passportAccountType2 = PassportAccountType.PHONISH;
                EnumFlagHolder enumFlagHolder2 = ((Filter.a) ((y0) obj)).x;
                enumFlagHolder2.reset();
                enumFlagHolder2.set(passportAccountType2);
                return zy11Var;
            case 10:
                return new os90(((iv5) obj).d);
            case 11:
                wj00 b2 = ((y3x) obj).b();
                String p = b2.p("method");
                ChallengeMethod challengeMethod = ChallengeMethod.randomAmount;
                if (!p.equals(challengeMethod.getValue())) {
                    challengeMethod = ChallengeMethod.smsChallenge;
                    if (!p.equals(challengeMethod.getValue())) {
                        throw new YSError("Unsupported challenge method", null);
                    }
                }
                return new wx90(challengeMethod, b2.p(ACSPConstants.STATUS), b2.p("verification_id"), b2.p("authorize_currency"), b2.h("authorize_amount_format"), b2.h("masked_phone_for_sms"), b2.h("deny_resend_until"));
            case 12:
                h5g h5gVar = new h5g();
                h5gVar.a = i5m.b(h011.a);
                h5gVar.b = i5m.b(x351.a);
                return h5gVar;
            case 13:
                wj00 b3 = ((y3x) obj).b();
                String p2 = b3.p("id");
                List<y3x> arrayList2 = new ArrayList();
                List e2 = b3.e("aliases");
                if (e2 != null) {
                    arrayList2 = e2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (y3x y3xVar : arrayList2) {
                    if (y3xVar.a == JSONItemKind.string) {
                        arrayList3.add(y3xVar.c().b);
                    }
                }
                String p3 = b3.p("account");
                String p4 = b3.p("system");
                boolean n3 = b3.n("verify_cvv");
                String h = b3.h("card_bank");
                String h2 = b3.h("member_id");
                String h3 = b3.h("member_name");
                String h4 = b3.h("payment_method");
                y3x d = b3.d("payer_info");
                if (d == null || (wj00Var = d.a()) == null) {
                    wj00Var = null;
                }
                String h5 = b3.h("member_name_rus");
                List e3 = b3.e("restrictions");
                if (e3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = ((ArrayList) e3).iterator();
                    while (it2.hasNext()) {
                        y3x y3xVar2 = (y3x) it2.next();
                        if (y3xVar2.a == JSONItemKind.string) {
                            arrayList4.add(y3xVar2.c().b);
                        }
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                if (wj00Var != null) {
                    FamilyInfo.Companion.getClass();
                    tyj0 d2 = mbb1.d(wj00Var, new l0o(24));
                    familyInfo = (FamilyInfo) (d2.b() ? null : d2.a());
                } else {
                    familyInfo = null;
                }
                y3x d3 = b3.d("partner_info");
                if (d3 == null || (wj00Var2 = d3.a()) == null) {
                    wj00Var2 = null;
                }
                if (wj00Var2 != null) {
                    PartnerInfo.Companion.getClass();
                    tyj0 d4 = mbb1.d(wj00Var2, new bd90(2));
                    partnerInfo = (PartnerInfo) (d4.b() ? null : d4.a());
                } else {
                    partnerInfo = null;
                }
                y3x d5 = b3.d("icon_url");
                if (d5 == null || (wj00Var3 = d5.a()) == null) {
                    wj00Var3 = null;
                }
                if (wj00Var3 != null) {
                    IconURLs.Companion.getClass();
                    tyj0 d6 = mbb1.d(wj00Var3, new jiu(14));
                    iconURLs = (IconURLs) (d6.b() ? null : d6.a());
                } else {
                    iconURLs = null;
                }
                String h6 = b3.h("error_resp_code");
                y3x d7 = b3.d("payload");
                if (d7 == null || (wj00Var4 = d7.a()) == null) {
                    wj00Var4 = null;
                }
                if (wj00Var4 != null) {
                    try {
                        str = (String) it00.b.a.a.invoke(wj00Var4);
                    } catch (RuntimeException unused) {
                    }
                    if (h != null) {
                        bankName = BankName.UnknownBank;
                    } else {
                        bankName = BankName.AlfaBank;
                        if (!h.equals(bankName.getValue())) {
                            bankName = BankName.SberBank;
                            if (!h.equals(bankName.getValue())) {
                                bankName = BankName.Tinkoff;
                                if (!h.equals(bankName.getValue())) {
                                    bankName = BankName.Vtb;
                                    if (!h.equals(bankName.getValue())) {
                                        bankName = BankName.GazpromBank;
                                        if (!h.equals(bankName.getValue())) {
                                            bankName = BankName.BankOfMoscow;
                                            if (!h.equals(bankName.getValue())) {
                                                bankName = BankName.OpenBank;
                                                if (!h.equals(bankName.getValue())) {
                                                    bankName = BankName.PromsvyazBank;
                                                    if (!h.equals(bankName.getValue())) {
                                                        bankName = BankName.RosBank;
                                                        if (!h.equals(bankName.getValue())) {
                                                            bankName = BankName.Qiwi;
                                                            if (!h.equals(bankName.getValue())) {
                                                                bankName = BankName.CitiBank;
                                                                if (!h.equals(bankName.getValue())) {
                                                                    bankName = BankName.UnicreditBank;
                                                                    if (!h.equals(bankName.getValue())) {
                                                                        bankName = BankName.RaiffeisenBank;
                                                                        if (!h.equals(bankName.getValue())) {
                                                                            bankName = BankName.UnknownBank;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    BankName bankName2 = bankName;
                    if (h4 != null) {
                        paymentMethodType = PaymentMethodType.Card;
                    } else {
                        paymentMethodType = PaymentMethodType.SbpToken;
                        if (!h4.equals(paymentMethodType.getValue())) {
                            paymentMethodType = PaymentMethodType.Card;
                            paymentMethodType.getClass();
                        }
                    }
                    return new PaymentMethod(p2, arrayList3, p3, p4, n3, bankName2, h2, h3, h5, paymentMethodType, familyInfo, partnerInfo, iconURLs, arrayList, h6, str);
                }
                str = null;
                if (h != null) {
                }
                BankName bankName22 = bankName;
                if (h4 != null) {
                }
                return new PaymentMethod(p2, arrayList3, p3, p4, n3, bankName22, h2, h3, h5, paymentMethodType, familyInfo, partnerInfo, iconURLs, arrayList, h6, str);
            case 14:
                return new pbv((String) obj, new ccv(txg0.ybsdk_ic_yb_placeholder), rev.o, new ccv(txg0.ybsdk_ic_yb_placeholder), h2b1.G, 32);
            case 15:
                return new pbv((String) obj, new ccv(sxg0.ybsdk_ic_generic_card), rev.l, new ccv(sxg0.ybsdk_ic_generic_card), new ufv(4.0f), 32);
            case 16:
                return new pbv((String) obj, new ccv(txg0.ybsdk_background_payment_item_image_fill), rev.n, new ccv(txg0.ybsdk_background_payment_item_image_fill), (vfv) null, 48);
            case 17:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 18:
                f.d((mnq0) obj);
                return zy11Var;
            case 19:
                nea0 nea0Var = (nea0) obj;
                u0k u0kVar = nea0Var.a;
                if (!(u0kVar instanceof fl8)) {
                    if (u0kVar instanceof snr0) {
                        z = ((snr0) u0kVar).e;
                    } else {
                        if (!(u0kVar instanceof na0)) {
                            z = jl40.l(nea0Var.b, xw91.C);
                        }
                        z = true;
                    }
                    return Boolean.valueOf(!z);
                }
                break;
            case 20:
                return ((nea0) obj).a.toString();
            case 21:
                u0k u0kVar2 = ((nea0) obj).a;
                if (!(u0kVar2 instanceof nj0) && !(u0kVar2 instanceof h8b0) && !(u0kVar2 instanceof u19) && !(u0kVar2 instanceof snr0) && !(u0kVar2 instanceof t19) && !(u0kVar2 instanceof wxc)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 22:
                ((nba0) obj).l();
                return zy11Var;
            case 23:
                ((nba0) obj).l();
                return zy11Var;
            case 24:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = new g92(i2, zy11Var);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new j01(objArr == true ? 1 : 0);
                fpb1.e(yfdVar, null);
                ead.a.getClass();
                agdVar.g = ead.b;
                return zy11Var;
            case 25:
                return (AvailableMethods) obj;
            case 26:
                return (PaymentSettings) obj;
            case 27:
                List list = (List) obj;
                return new PaymentDetails((AvailableMethods) list.get(0), (PaymentSettings) list.get(1));
            case 28:
                fvv fvvVar = (fvv) obj;
                return new PaymentSettings(fvvVar.l, fvvVar.m, fvvVar.i, fvvVar.j, fvvVar.k, fvvVar.n, fvvVar.o, fvvVar.p, fvvVar.r, fvvVar.f);
            default:
                zsa zsaVar = ((ce30) obj).a;
                zsaVar.r(new qu(9));
                ((be30) zsaVar.F).invoke();
                return zy11Var;
        }
    }

    public /* synthetic */ bd90(int i) {
        this.a = i;
    }
}
