package defpackage;

import com.yandex.go.payments.data.model.response.Availability;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.CardProfile;
import com.yandex.go.payments.data.model.response.ComplementWallet;
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
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.payment.CardPayment$VerifyStrategy;
import com.yandex.go.payments.payment.DeliveryPayment$Type;
import java.util.List;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes8.dex */
public final class lz90 {
    public final zuj0 a;
    public final ry90 b;
    public final syw c;

    public lz90(zuj0 zuj0Var, ry90 ry90Var, syw sywVar) {
        this.a = zuj0Var;
        this.b = ry90Var;
        this.c = sywVar;
    }

    public final fl8 a(Card card, boolean z) {
        UserCardProfileName userCardProfileName;
        String a = card.getA();
        this.b.getClass();
        String b = ry90.b(card);
        String c = card.getC();
        String d = card.getD();
        String f = card.getF();
        String g = card.getG();
        boolean a2 = this.c.a(card);
        String i = card.getI();
        CardPayment$VerifyStrategy cardPayment$VerifyStrategy = card.getJ() == Card.VerifyStrategy.ANTIFRAUD ? CardPayment$VerifyStrategy.ANTIFRAUD : CardPayment$VerifyStrategy.UNKNOWN;
        Card.Family k = card.getK();
        tx90 tx90Var = null;
        el8 el8Var = k != null ? new el8(k.getA(), k.getB()) : null;
        String l = card.getL();
        Boolean m = card.getM();
        CardProfile n = card.getN();
        if (n != null && (userCardProfileName = n.a) != null) {
            tx90Var = new tx90(userCardProfileName);
        }
        return new fl8(a, b, z, c, d, f, g, a2, i, cardPayment$VerifyStrategy, el8Var, l, m, tx90Var);
    }

    public final jve b(CorpAccount corpAccount) {
        String a = corpAccount.getA();
        this.b.getClass();
        return new jve(a, ry90.b(corpAccount), corpAccount.getB(), corpAccount.getG(), corpAccount.getI(), corpAccount.getC(), corpAccount.getD(), corpAccount.getE(), corpAccount.getF(), corpAccount.getH());
    }

    public final yhi c(DeliveryPaymentMethod deliveryPaymentMethod) {
        DeliveryPayment$Type deliveryPayment$Type;
        String str = deliveryPaymentMethod.a;
        this.b.getClass();
        String b = ry90.b(deliveryPaymentMethod);
        DeliveryPaymentMethod.Display display = deliveryPaymentMethod.b;
        int i = kz90.a[display.getA().ordinal()];
        if (i == 1) {
            deliveryPayment$Type = DeliveryPayment$Type.CARGO_CORP;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            deliveryPayment$Type = DeliveryPayment$Type.UNSUPPORTED;
        }
        String b2 = display.getB();
        String c = display.getC();
        DeliveryPaymentMethod.DisableReason d = display.getD();
        return new yhi(str, b, new xhi(deliveryPayment$Type, b2, c, d != null ? new whi(d.getA(), d.getB()) : null), deliveryPaymentMethod.c.getA().getCode());
    }

    public final mcp d(FastshiftAccount fastshiftAccount, boolean z) {
        String a = fastshiftAccount.getA();
        this.b.getClass();
        String b = ry90.b(fastshiftAccount);
        String b2 = fastshiftAccount.getB();
        if (b2.length() == 0) {
            b2 = ((avj0) this.a).h(kyh0.fastshift_account_payment_method_name);
        }
        return new mcp(a, b, b2, fastshiftAccount.getC(), fastshiftAccount.getD(), z);
    }

    public final v7x e(JazzcashWallet jazzcashWallet, boolean z) {
        String a = jazzcashWallet.getA();
        this.b.getClass();
        String b = ry90.b(jazzcashWallet);
        String b2 = jazzcashWallet.getB();
        if (b2.length() == 0) {
            b2 = ((avj0) this.a).h(kyh0.jazzcash_wallet_payment_method_name);
        }
        return new v7x(a, b, b2, jazzcashWallet.getC(), jazzcashWallet.getD(), z);
    }

    public final qgx f(Kaspi kaspi) {
        String a = kaspi.getA();
        this.b.getClass();
        String b = ry90.b(kaspi);
        String b2 = kaspi.getB();
        if (b2 == null) {
            b2 = "";
        }
        if (b2.length() == 0) {
            b2 = ((avj0) this.a).h(kyh0.kaspi_payment_method_name);
        }
        return new qgx(a, b, b2, kaspi.getC(), kaspi.getD());
    }

    public final a000 g(MBankAccount mBankAccount) {
        String str = mBankAccount.a;
        this.b.getClass();
        return new a000(str, ry90.b(mBankAccount), mBankAccount.b, mBankAccount.c, mBankAccount.d, mBankAccount.e == Card.VerifyStrategy.UNKNOWN);
    }

    public final um50 h(NequiToken nequiToken, boolean z) {
        String a = nequiToken.getA();
        this.b.getClass();
        String b = ry90.b(nequiToken);
        String b2 = nequiToken.getB();
        if (b2.length() == 0) {
            b2 = ((avj0) this.a).h(kyh0.nequi_token_payment_method_name);
        }
        return new um50(a, b, b2, nequiToken.getC(), nequiToken.getD(), z);
    }

    public final h8b0 i(PersonalAccount personalAccount) {
        PersonalAccount.ComplementAttributes complementAttributes;
        f8b0 f8b0Var = null;
        if (evu0.J(personalAccount.a) || !personalAccount.h || (complementAttributes = personalAccount.i) == null) {
            return null;
        }
        String str = personalAccount.a;
        this.b.getClass();
        String b = ry90.b(personalAccount);
        String str2 = personalAccount.b;
        String str3 = personalAccount.c;
        String str4 = personalAccount.d;
        String str5 = personalAccount.e;
        ief iefVar = personalAccount.f;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        vxc vxcVar = new vxc(complementAttributes.a, complementAttributes.b, (List) complementAttributes.d.getValue());
        String str6 = personalAccount.k;
        Availability.Action action = personalAccount.j.c;
        if (action != null && action.b == Availability.Action.Type.BUY_PLUS) {
            String str7 = action.a;
            if (str7 == null) {
                str7 = "";
            }
            f8b0Var = new f8b0(str7);
        }
        return new h8b0(str, b, str2, str3, str4, str5, h, vxcVar, str6, f8b0Var);
    }

    public final cfm0 j(SbpBindToken sbpBindToken) {
        String a = sbpBindToken.getA();
        this.b.getClass();
        String b = ry90.b(sbpBindToken);
        String b2 = sbpBindToken.getB();
        if (b2.length() == 0) {
            b2 = ((avj0) this.a).h(kyh0.sbp_bind_token_payment_method_name);
        }
        return new cfm0(a, b, b2, sbpBindToken.getC(), sbpBindToken.getD());
    }

    public final bjm0 k(SbpToken sbpToken, boolean z) {
        String a = sbpToken.getA();
        this.b.getClass();
        return new bjm0(a, z, ry90.b(sbpToken), sbpToken.getB(), sbpToken.getC(), sbpToken.getD(), sbpToken.getE());
    }

    public final snr0 l(SharedAccount sharedAccount) {
        String h;
        if (sharedAccount.getE()) {
            h = sharedAccount.getC();
        } else if (evu0.J(sharedAccount.getD())) {
            h = ((avj0) this.a).h(kyh0.shared_payment_inactive_default_error);
        } else {
            h = sharedAccount.getD();
        }
        String str = h;
        String a = sharedAccount.getA();
        this.b.getClass();
        String b = ry90.b(sharedAccount);
        qmr0 qmr0Var = SharedAccountType.Companion;
        String b2 = sharedAccount.getB();
        qmr0Var.getClass();
        return new snr0(a, b, qmr0.a(b2), str, sharedAccount.getE(), sharedAccount.l(), sharedAccount.getG(), new rnr0(sharedAccount.m(), sharedAccount.d(), Boolean.valueOf(sharedAccount.h())));
    }

    public final ep51 m(YapeToken yapeToken, boolean z) {
        String a = yapeToken.getA();
        this.b.getClass();
        String b = ry90.b(yapeToken);
        String b2 = yapeToken.getB();
        if (b2.length() == 0) {
            b2 = ((avj0) this.a).h(kyh0.yape_token_payment_method_name);
        }
        return new ep51(a, b, b2, yapeToken.getC(), yapeToken.getD(), z);
    }

    public final yy51 n(YbWallet ybWallet) {
        String a = ybWallet.getA();
        this.b.getClass();
        return new yy51(a, ry90.b(ybWallet), ybWallet.getC(), ybWallet.getD(), tq51.a(ybWallet.getE()));
    }

    public final wxc o(ComplementWallet complementWallet) {
        PersonalAccount.ComplementAttributes c;
        PaymentMethod$Type b = complementWallet.getB();
        if (b == null || (c = complementWallet.getC()) == null) {
            return null;
        }
        String a = complementWallet.getA();
        this.b.getClass();
        return new wxc(a, b, ry90.b(complementWallet), new vxc(c.a, c.b, (List) c.d.getValue()), complementWallet.getE());
    }
}
