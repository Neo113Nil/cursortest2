package defpackage;

import com.yandex.go.payments.common.a;
import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YangoPaySimpleIntegrationDto;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.y1;
import com.yandex.go.payments.domain.v;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public interface a2a0 {
    static Object a(a2a0 a2a0Var, lv90 lv90Var, lv90 lv90Var2, String str, ContinuationImpl continuationImpl, int i) {
        String str2;
        String b;
        String h;
        String str3;
        DeliveryPaymentMethod.Display display;
        String str4;
        String m;
        SharedAccountType n;
        String str5;
        String str6;
        by90 by90Var;
        Object obj;
        Object obj2;
        m1a0 m1a0Var;
        int i2 = 1;
        int i3 = 0;
        boolean z = (i & 4) == 0;
        String str7 = (i & 8) != 0 ? null : str;
        d2a0 d2a0Var = (d2a0) a2a0Var;
        o0a0 o0a0Var = o0a0.c;
        if (str7 != null) {
            cxq0 cxq0Var = d2a0Var.b;
            cxq0Var.getClass();
            PaymentMethod$Type paymentMethod$Type = lv90Var.a;
            if (paymentMethod$Type == null || (str6 = lv90Var.b) == null || (by90Var = (by90) ((a30) cxq0Var.b).a.get(str7)) == null) {
                str2 = null;
                obj2 = null;
            } else {
                Iterator it = by90Var.b().b("no_feature").a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    lea0 lea0Var = (lea0) obj;
                    str2 = null;
                    if (jl40.l(lea0Var.getId(), str6) && lea0Var.c() == paymentMethod$Type) {
                        break;
                    }
                }
                lea0 lea0Var2 = (lea0) obj;
                if (lea0Var2 == null) {
                    obj2 = str2;
                } else {
                    u0a0 u0a0Var = (u0a0) cxq0Var.x;
                    if (lea0Var2 instanceof fl8) {
                        fl8 fl8Var = (fl8) lea0Var2;
                        uma0 uma0Var = (uma0) ((tma0) cxq0Var.c);
                        m1a0Var = new m1a0(uma0Var.c(fl8Var), "", ((a) u0a0Var).e(PaymentIconInfoType.CARD_BANK_NAME, fl8Var.i, jx81.s(oe91.d(fl8Var.e))), o0a0Var, uma0Var.b(fl8Var), false, null);
                    } else if (lea0Var2 instanceof p1c) {
                        p1c p1cVar = (p1c) lea0Var2;
                        obj2 = cxq0Var.r(p1cVar.h(), p1cVar.g(), p1cVar.f(), IconType.CASH_LIKE);
                    } else if (lea0Var2 instanceof vbn) {
                        vbn vbnVar = (vbn) lea0Var2;
                        obj2 = cxq0Var.r(vbnVar.h(), vbnVar.g(), vbnVar.f(), IconType.CASH_LIKE);
                    } else if (lea0Var2 instanceof mcp) {
                        mcp mcpVar = (mcp) lea0Var2;
                        obj2 = cxq0Var.r(mcpVar.h(), "", mcpVar.f(), IconType.FASTSHIFT_ACCOUNT);
                    } else if (lea0Var2 instanceof v7x) {
                        v7x v7xVar = (v7x) lea0Var2;
                        obj2 = cxq0Var.r(v7xVar.h(), v7xVar.g(), v7xVar.f(), IconType.JAZZCASH_WALLET);
                    } else if (lea0Var2 instanceof qgx) {
                        qgx qgxVar = (qgx) lea0Var2;
                        obj2 = cxq0Var.r(qgxVar.h(), qgxVar.g(), qgxVar.f(), IconType.CASH_LIKE);
                    } else if (lea0Var2 instanceof um50) {
                        um50 um50Var = (um50) lea0Var2;
                        obj2 = cxq0Var.r(um50Var.h(), um50Var.g(), um50Var.f(), IconType.CASH_LIKE);
                    } else if (lea0Var2 instanceof cfm0) {
                        cfm0 cfm0Var = (cfm0) lea0Var2;
                        obj2 = cxq0Var.r(cfm0Var.h(), cfm0Var.g(), cfm0Var.f(), IconType.CASH_LIKE);
                    } else if (lea0Var2 instanceof ep51) {
                        ep51 ep51Var = (ep51) lea0Var2;
                        obj2 = cxq0Var.r(ep51Var.h(), ep51Var.g(), ep51Var.f(), IconType.CASH_LIKE);
                    } else if (lea0Var2 instanceof yy51) {
                        yy51 yy51Var = (yy51) lea0Var2;
                        m1a0Var = new m1a0(((eq51) cxq0Var.w).a(yy51Var).g(), "", ((a) u0a0Var).e(PaymentIconInfoType.CARD_BANK_NAME, yy51Var.f(), new uyz(IconType.GENERIC_CARD, i3)), o0a0Var, null, false, null);
                    } else {
                        obj2 = m1a0.h;
                    }
                    obj2 = m1a0Var;
                }
            }
            if (obj2 != null) {
                return obj2;
            }
        } else {
            str2 = null;
        }
        v vVar = d2a0Var.a;
        PaymentMethod$Type paymentMethod$Type2 = lv90Var.a;
        String str8 = lv90Var.b;
        String str9 = lv90Var2 != null ? lv90Var2.b : str2;
        if (paymentMethod$Type2 == null) {
            return m1a0.h;
        }
        switch (c2a0.a[paymentMethod$Type2.ordinal()]) {
            case 1:
                return vVar.b(str9, continuationImpl, z);
            case 2:
                return vVar.a(str8, str9, continuationImpl);
            case 3:
                String str10 = str2;
                String str11 = str9;
                CorpAccount j = vVar.b.j(str8);
                if (j == null) {
                    g8e.C("Unknown personal corp account on summary", jst.e);
                    b = str10;
                } else {
                    b = j.getB();
                }
                if (b == null || b.length() == 0) {
                    b = ((avj0) vVar.a).h(kyh0.summary_payment_corp);
                }
                String str12 = b;
                xxc c = vVar.i.c(str11);
                return new m1a0(str12, vVar.e(c), ((a) vVar.g).f(new uyz(IconType.CORP, i2)), vVar.j.j(c), null, str11 != null, null);
            case 4:
                String str13 = str2;
                DeliveryPaymentMethod h2 = vVar.b.h(str8);
                if (h2 == null || (display = h2.b) == null || (h = display.getC()) == null) {
                    h = ((avj0) vVar.a).h(kyh0.summary_payment_cargocorp);
                }
                String str14 = h;
                if (h2 != null) {
                    DeliveryPaymentMethod.Display display2 = h2.b;
                    if (display2.getD() != null) {
                        DeliveryPaymentMethod.DisableReason d = display2.getD();
                        String b2 = d != null ? d.getB() : str13;
                        if (b2 != null) {
                            str3 = b2;
                            return new m1a0(str14, str3, ((a) vVar.g).f(new uyz(IconType.CARGO_CORP, i2)), o0a0Var, null, false, null);
                        }
                    }
                }
                str3 = "";
                return new m1a0(str14, str3, ((a) vVar.g).f(new uyz(IconType.CARGO_CORP, i2)), o0a0Var, null, false, null);
            case 5:
                String str15 = str9;
                xxc c2 = vVar.i.c(str15);
                return new m1a0(((avj0) vVar.a).h(kyh0.google_pay), vVar.e(c2), ((a) vVar.g).f(new uyz(IconType.GOOGLE_PAY, i2)), vVar.j.j(c2), null, str15 != null, null);
            case 6:
                String str16 = str2;
                String str17 = str9;
                PersonalAccount r = vVar.b.r(str8);
                if (r == null) {
                    g8e.C("Unknown personal wallet account on summary", jst.e);
                    str4 = str16;
                } else {
                    str4 = r.b;
                }
                if (str4 == null || evu0.J(str4)) {
                    str4 = ((avj0) vVar.a).h(kyh0.paymentmethod_personal_wallet);
                }
                String str18 = str4;
                xxc c3 = vVar.i.c(str17);
                return new m1a0(str18, vVar.e(c3), ((a) vVar.g).f(new uyz(IconType.PERSONAL_WALLET, i2)), vVar.j.j(c3), null, str17 != null, null);
            case 7:
                String str19 = str2;
                String str20 = str9;
                SharedAccount o = vVar.b.o(str8);
                if (o == null) {
                    g8e.C("Unknown shared account on summary", jst.e);
                    n = SharedAccountType.UNKNOWN;
                    m = str19;
                } else {
                    m = o.m();
                    n = o.n();
                }
                if (m == null || m.length() == 0) {
                    m = ((avj0) vVar.a).h(kyh0.shared_payment);
                }
                String str21 = m;
                xxc c4 = vVar.i.c(str20);
                return new m1a0(str21, vVar.e(c4), ((a) vVar.g).f(new uyz(n == SharedAccountType.BUSINESS ? IconType.SHARED_BUSINESS : IconType.SHARED_FAMILY, i2)), vVar.j.j(c4), null, str20 != null, null);
            case 8:
                return vVar.d(str8, str9, continuationImpl, z);
            case 9:
                String str22 = str9;
                u0a0 u0a0Var2 = vVar.g;
                y1 x = vVar.b.x(str8);
                if (str8 == null || !(x instanceof YangoPaySimpleIntegrationDto)) {
                    return new m1a0(((avj0) vVar.a).h(kyh0.yango_wallet_card_title_fallback), "", ((a) u0a0Var2).f(new uyz(IconType.YANGO_WALLET, i2)), o0a0Var, null, str22 != null, null);
                }
                YangoPaySimpleIntegrationDto yangoPaySimpleIntegrationDto = (YangoPaySimpleIntegrationDto) x;
                return new m1a0(yangoPaySimpleIntegrationDto.getB(), "", ((a) u0a0Var2).e(PaymentIconInfoType.ICON_TAG, yangoPaySimpleIntegrationDto.getC(), new uyz(IconType.CASH_LIKE, i2)), o0a0Var, null, str22 != null, null);
            case 10:
                String str23 = str9;
                MBankAccount n2 = vVar.b.n(str8);
                if (n2 == null) {
                    g8e.B(jst.e, PaymentMethod$Type.MBANK_ACCOUNT.getCode(), null, String.format("mBankAccount with %s was requested but not found", Arrays.copyOf(new Object[]{str8}, 1)), 2);
                    return m1a0.h;
                }
                String str24 = n2.b;
                xxc c5 = vVar.i.c(str23);
                return new m1a0(str24, vVar.e(c5), ((a) vVar.g).e(PaymentIconInfoType.CARD_BANK_NAME, n2.d, new uyz(IconType.MBANK_ACCOUNT, i2)), vVar.j.j(c5), null, str23 != null, null);
            case 11:
                String str25 = str9;
                SbpToken v = vVar.b.v(str8);
                if (v == null) {
                    g8e.B(jst.e, PaymentMethod$Type.SBP_TOKEN.getCode(), null, String.format("sbpToken with %s was requested but not found", Arrays.copyOf(new Object[]{str8}, 1)), 2);
                    return m1a0.h;
                }
                xxc c6 = vVar.i.c(str25);
                String d2 = v.getD();
                String e = v.getE();
                if (e == null) {
                    e = vVar.e(c6);
                }
                return new m1a0(d2, e, ((a) vVar.g).e(PaymentIconInfoType.SBP_TOKEN_BANK_NAME, v.getC(), new uyz(IconType.SBP_TOKEN, i2)), o0a0Var, null, false, null);
            case 12:
                String str26 = str9;
                YapeToken y = vVar.b.y(str8);
                if (y == null) {
                    g8e.B(jst.e, PaymentMethod$Type.YAPE_TOKEN.getCode(), null, String.format("yapeToken with %s was requested but not found", Arrays.copyOf(new Object[]{str8}, 1)), 2);
                    return m1a0.h;
                }
                String b3 = y.getB();
                xxc c7 = vVar.i.c(str26);
                return new m1a0(b3, vVar.e(c7), ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, y.getD(), new uyz(IconType.YAPE_TOKEN, i2)), vVar.j.j(c7), null, str26 != null, null);
            case 13:
                NequiToken p = vVar.b.p(str8);
                if (p == null) {
                    g8e.B(jst.e, PaymentMethod$Type.NEQUI_TOKEN.getCode(), null, String.format("nequiToken with %s was requested but not found", Arrays.copyOf(new Object[]{str8}, 1)), 2);
                    return m1a0.h;
                }
                String b4 = p.getB();
                xxc c8 = vVar.i.c(str9);
                return new m1a0(b4, vVar.e(c8), ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, p.getD(), new uyz(IconType.NEQUI_TOKEN, i2)), vVar.j.j(c8), null, str9 != null, null);
            case 14:
                SbpBindToken u = vVar.b.u(str8);
                if (u != null) {
                    return new m1a0(u.getB(), "", ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, u.getD(), new uyz(IconType.SBP_BIND_TOKEN, i2)), o0a0Var, null, false, null);
                }
                g8e.B(jst.e, PaymentMethod$Type.SBP_BIND_TOKEN.getCode(), null, String.format("sbpBindToken with %s was requested but not found", Arrays.copyOf(new Object[]{str8}, 1)), 2);
                return m1a0.h;
            case 15:
                Kaspi m2 = vVar.b.m(str8);
                if (m2 == null) {
                    g8e.B(jst.e, PaymentMethod$Type.KASPI.getCode(), null, oyr.p("kaspi with ", str8, " was requested but not found"), 2);
                    return m1a0.h;
                }
                String b5 = m2.getB();
                return new m1a0(b5 == null ? "" : b5, "", ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, m2.getD(), new uyz(IconType.KASPI, i2)), o0a0Var, null, false, null);
            case 16:
                return vVar.c(((avj0) vVar.a).h(kyh0.click_wallet_payment_method_name), IconType.CASH_LIKE);
            case 17:
                return vVar.c(((avj0) vVar.a).h(kyh0.easypaisa_wallet_payment_method_name), IconType.CASH_LIKE);
            case 18:
                zuj0 zuj0Var = vVar.a;
                JazzcashWallet l = vVar.b.l(str8);
                if (l == null) {
                    String h3 = ((avj0) zuj0Var).h(kyh0.jazzcash_wallet_payment_method_name);
                    g8e.B(jst.e, PaymentMethod$Type.JAZZCASH_WALLET.getCode(), null, oyr.p("jazzcashWallet with ", str8, " was requested but not found"), 2);
                    return vVar.c(h3, IconType.JAZZCASH_WALLET);
                }
                xxc c9 = vVar.i.c(str9);
                String b6 = l.getB();
                if (b6.length() == 0) {
                    b6 = ((avj0) zuj0Var).h(kyh0.jazzcash_wallet_payment_method_name);
                }
                String str27 = b6;
                String c10 = l.getC();
                if (c10 == null) {
                    c10 = vVar.e(c9);
                }
                return new m1a0(str27, c10, ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, l.getD(), new uyz(IconType.JAZZCASH_WALLET, i2)), vVar.j.j(c9), null, str9 != null, null);
            case 19:
                zuj0 zuj0Var2 = vVar.a;
                FastshiftAccount k = vVar.b.k(str8);
                if (k == null) {
                    String h4 = ((avj0) zuj0Var2).h(kyh0.fastshift_account_payment_method_name);
                    g8e.B(jst.e, PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode(), str2, oyr.p("fastshiftAccount with ", str8, " was requested but not found"), 2);
                    return vVar.c(h4, IconType.FASTSHIFT_ACCOUNT);
                }
                xxc c11 = vVar.i.c(str9);
                String b7 = k.getB();
                if (b7.length() == 0) {
                    b7 = ((avj0) zuj0Var2).h(kyh0.fastshift_account_payment_method_name);
                }
                return new m1a0(b7, "", ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, k.getD(), new uyz(IconType.FASTSHIFT_ACCOUNT, i2)), vVar.j.j(c11), null, str9 != null, null);
            case 20:
                CashLikeAccount i4 = vVar.b.i(str8);
                if (i4 == null || (str5 = i4.getC()) == null) {
                    str5 = "";
                }
                String b8 = i4 != null ? i4.getB() : str2;
                return new m1a0(b8 == null ? "" : b8, "", ((a) vVar.g).e(PaymentIconInfoType.ICON_TAG, str5, new uyz(IconType.CASH_LIKE, i2)), o0a0Var, null, str9 != null, null);
            case 21:
                return m1a0.h;
            case 22:
                return m1a0.h;
            case 23:
                return m1a0.h;
            default:
                w511.b();
                return str2;
        }
    }
}
