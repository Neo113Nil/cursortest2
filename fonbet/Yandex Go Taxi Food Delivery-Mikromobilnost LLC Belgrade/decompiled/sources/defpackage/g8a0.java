package defpackage;

import android.net.Uri;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.data.model.response.y1;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes8.dex */
public final class g8a0 {
    public final fga0 a;
    public final h3y b;
    public final wiq0 c;
    public final zy51 d;

    public g8a0(fga0 fga0Var, h3y h3yVar, wiq0 wiq0Var, zy51 zy51Var) {
        this.a = fga0Var;
        this.b = h3yVar;
        this.c = wiq0Var;
        this.d = zy51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e8a0 a(Uri uri) {
        lv90 lv90Var;
        Object obj;
        Object obj2;
        String a = og21.a(uri, "payment_type");
        lv90 lv90Var2 = null;
        if (a != null) {
            Iterator<E> it = PaymentMethod$Type.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((PaymentMethod$Type) obj2).getCode(), a)) {
                    break;
                }
            }
            PaymentMethod$Type paymentMethod$Type = (PaymentMethod$Type) obj2;
            if (paymentMethod$Type != null) {
                kv90 kv90Var = lv90.Companion;
                String a2 = og21.a(uri, "payment_id");
                kv90Var.getClass();
                lv90Var = kv90.b(a2, paymentMethod$Type);
                if (lv90Var != null) {
                    String str = lv90Var.b;
                    PaymentMethod$Type paymentMethod$Type2 = lv90Var.a;
                    switch (paymentMethod$Type2 == null ? -1 : f8a0.a[paymentMethod$Type2.ordinal()]) {
                        case -1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            zy51 zy51Var = this.d;
                            fga0 fga0Var = this.a;
                            if (str != null && !evu0.J(str)) {
                                switch (paymentMethod$Type2 != null ? f8a0.a[paymentMethod$Type2.ordinal()] : -1) {
                                    case -1:
                                    case 1:
                                    case 2:
                                    case 9:
                                    case 21:
                                    case 22:
                                    case 23:
                                        break;
                                    case 0:
                                    default:
                                        w511.b();
                                        return null;
                                    case 3:
                                        SbpToken v = fga0Var.v(str);
                                        if (v != null) {
                                            lv90Var2 = sa91.a(v);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        SbpBindToken u = fga0Var.u(str);
                                        if (u != null) {
                                            lv90Var2 = sa91.a(u);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        Card g = fga0Var.g(str);
                                        if (g != null) {
                                            lv90Var2 = sa91.a(g);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        CorpAccount j = fga0Var.j(str);
                                        if (j != null) {
                                            lv90Var2 = sa91.a(j);
                                            break;
                                        }
                                        break;
                                    case 7:
                                        DeliveryPaymentMethod h = fga0Var.h(str);
                                        if (h != null) {
                                            lv90Var2 = sa91.a(h);
                                            break;
                                        }
                                        break;
                                    case 8:
                                        SharedAccount o = fga0Var.o(str);
                                        if (o != null) {
                                            lv90Var2 = sa91.a(o);
                                            break;
                                        }
                                        break;
                                    case 10:
                                        YbWallet a3 = zy51Var.a(str);
                                        if (a3 != null) {
                                            lv90Var2 = sa91.a(a3);
                                            break;
                                        }
                                        break;
                                    case 11:
                                        y1 x = fga0Var.x(str);
                                        if (x != null) {
                                            lv90Var2 = sa91.a(x);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        CashLikeAccount i = fga0Var.i(str);
                                        if (i != null) {
                                            lv90Var2 = sa91.a(i);
                                            break;
                                        }
                                        break;
                                    case 13:
                                        MBankAccount n = fga0Var.n(str);
                                        if (n != null) {
                                            lv90Var2 = sa91.a(n);
                                            break;
                                        }
                                        break;
                                    case 14:
                                        YapeToken y = fga0Var.y(str);
                                        if (y != null) {
                                            lv90Var2 = sa91.a(y);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        NequiToken p = fga0Var.p(str);
                                        if (p != null) {
                                            lv90Var2 = sa91.a(p);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        FastshiftAccount k = fga0Var.k(str);
                                        if (k != null) {
                                            lv90Var2 = sa91.a(k);
                                            break;
                                        }
                                        break;
                                    case 17:
                                        JazzcashWallet l = fga0Var.l(str);
                                        if (l != null) {
                                            lv90Var2 = sa91.a(l);
                                            break;
                                        }
                                        break;
                                    case 18:
                                        Kaspi m = fga0Var.m(str);
                                        if (m != null) {
                                            lv90Var2 = sa91.a(m);
                                            break;
                                        }
                                        break;
                                    case 19:
                                    case 20:
                                        if (paymentMethod$Type2 == null) {
                                            ny61.g("Required value was null.");
                                            return null;
                                        }
                                        if (jl40.l(fga0Var.q(paymentMethod$Type2), str)) {
                                            lv90Var2 = lv90Var;
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                switch (paymentMethod$Type2 != null ? f8a0.a[paymentMethod$Type2.ordinal()] : -1) {
                                    case -1:
                                    case 1:
                                    case 2:
                                    case 9:
                                    case 21:
                                    case 22:
                                    case 23:
                                        break;
                                    case 0:
                                    default:
                                        w511.b();
                                        return null;
                                    case 3:
                                        SbpToken sbpToken = (SbpToken) a.R(fga0Var.b.g().q.a);
                                        if (sbpToken != null) {
                                            lv90Var2 = sa91.a(sbpToken);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        SbpBindToken sbpBindToken = (SbpBindToken) a.R(fga0Var.b.g().e());
                                        if (sbpBindToken != null) {
                                            lv90Var2 = sa91.a(sbpBindToken);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        Card card = (Card) a.R(fga0Var.d());
                                        if (card != null) {
                                            lv90Var2 = sa91.a(card);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        CorpAccount corpAccount = (CorpAccount) a.R(fga0Var.b.g().c.a);
                                        if (corpAccount != null) {
                                            lv90Var2 = sa91.a(corpAccount);
                                            break;
                                        }
                                        break;
                                    case 7:
                                        DeliveryPaymentMethod deliveryPaymentMethod = (DeliveryPaymentMethod) a.R(fga0Var.b.g().d.a);
                                        if (deliveryPaymentMethod != null) {
                                            lv90Var2 = sa91.a(deliveryPaymentMethod);
                                            break;
                                        }
                                        break;
                                    case 8:
                                        Iterator it2 = fga0Var.b.g().f.b.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj = it2.next();
                                                if (((SharedAccount) obj).getE()) {
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        SharedAccount sharedAccount = (SharedAccount) obj;
                                        if (sharedAccount != null) {
                                            lv90Var2 = sa91.a(sharedAccount);
                                            break;
                                        }
                                        break;
                                    case 10:
                                        YbWallet ybWallet = (YbWallet) a.R(zy51Var.a.b.g().g.a);
                                        if (ybWallet != null) {
                                            lv90Var2 = sa91.a(ybWallet);
                                            break;
                                        }
                                        break;
                                    case 11:
                                        y1 y1Var = (y1) a.R(fga0Var.b.g().h.a);
                                        if (y1Var != null) {
                                            lv90Var2 = sa91.a(y1Var);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        CashLikeAccount cashLikeAccount = (CashLikeAccount) a.R(fga0Var.b.g().b.a);
                                        if (cashLikeAccount != null) {
                                            lv90Var2 = sa91.a(cashLikeAccount);
                                            break;
                                        }
                                        break;
                                    case 13:
                                        MBankAccount mBankAccount = fga0Var.b.g().r.a;
                                        if (mBankAccount != null) {
                                            lv90Var2 = sa91.a(mBankAccount);
                                            break;
                                        }
                                        break;
                                    case 14:
                                        YapeToken yapeToken = (YapeToken) a.R(fga0Var.b.g().d());
                                        if (yapeToken != null) {
                                            lv90Var2 = sa91.a(yapeToken);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        NequiToken nequiToken = (NequiToken) a.R(fga0Var.b.g().c());
                                        if (nequiToken != null) {
                                            lv90Var2 = sa91.a(nequiToken);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        FastshiftAccount fastshiftAccount = (FastshiftAccount) a.R(fga0Var.e());
                                        if (fastshiftAccount != null) {
                                            lv90Var2 = sa91.a(fastshiftAccount);
                                            break;
                                        }
                                        break;
                                    case 17:
                                        JazzcashWallet jazzcashWallet = (JazzcashWallet) a.R(fga0Var.f());
                                        if (jazzcashWallet != null) {
                                            lv90Var2 = sa91.a(jazzcashWallet);
                                            break;
                                        }
                                        break;
                                    case 18:
                                        Kaspi kaspi = (Kaspi) a.R(fga0Var.b.g().b());
                                        if (kaspi != null) {
                                            lv90Var2 = sa91.a(kaspi);
                                            break;
                                        }
                                        break;
                                    case 19:
                                    case 20:
                                        if (paymentMethod$Type2 == null) {
                                            ny61.g("Required value was null.");
                                            return null;
                                        }
                                        String q = fga0Var.q(paymentMethod$Type2);
                                        if (q != null) {
                                            lv90.Companion.getClass();
                                            lv90Var2 = kv90.b(q, paymentMethod$Type2);
                                            break;
                                        }
                                        break;
                                }
                            }
                            return lv90Var2 != null ? new b8a0(lv90Var2) : new d8a0(lv90Var);
                        case 0:
                        default:
                            w511.b();
                            return null;
                        case 1:
                        case 2:
                            return new b8a0(lv90Var);
                        case 9:
                            break;
                    }
                }
                return c8a0.a;
            }
        }
        lv90Var = null;
        if (lv90Var != null) {
        }
        return c8a0.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean b(lv90 lv90Var) {
        if (!lv90Var.equals(lv90.g)) {
            PaymentMethod$Type paymentMethod$Type = lv90Var.a;
            String str = lv90Var.b;
            int i = paymentMethod$Type == null ? -1 : f8a0.a[paymentMethod$Type.ordinal()];
            fga0 fga0Var = this.a;
            switch (i) {
                case -1:
                case 21:
                case 22:
                case 23:
                    jst.e.j(new IllegalStateException("Unknown payment method: " + paymentMethod$Type));
                    break;
                case 0:
                default:
                    w511.b();
                    break;
                case 1:
                case 2:
                    break;
                case 3:
                    if (fga0Var.v(str) == null) {
                    }
                    break;
                case 4:
                    if (fga0Var.u(str) == null) {
                    }
                    break;
                case 5:
                    if (fga0Var.g(str) == null) {
                    }
                    break;
                case 6:
                    if (fga0Var.j(str) == null) {
                    }
                    break;
                case 7:
                    if (fga0Var.h(str) == null) {
                    }
                    break;
                case 8:
                    SharedAccount o = fga0Var.o(str);
                    if (o == null || !o.getE()) {
                    }
                    break;
                case 9:
                    if (!((erd) this.b.get()).a(str)) {
                    }
                    break;
                case 10:
                    if (this.d.a(str) == null) {
                    }
                    break;
                case 11:
                    if (fga0Var.x(str) == null) {
                    }
                    break;
                case 12:
                    if (fga0Var.i(str) == null) {
                    }
                    break;
                case 13:
                    if (fga0Var.n(str) == null) {
                    }
                    break;
                case 14:
                    if (fga0Var.y(str) == null) {
                    }
                    break;
                case 15:
                    if (fga0Var.p(str) == null) {
                    }
                    break;
                case 16:
                    if (fga0Var.k(str) == null) {
                    }
                    break;
                case 17:
                    if (fga0Var.l(str) == null) {
                    }
                    break;
                case 18:
                    if (fga0Var.m(str) == null) {
                    }
                    break;
                case 19:
                case 20:
                    if (paymentMethod$Type == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else if (!jl40.l(fga0Var.q(paymentMethod$Type), str)) {
                    }
                    break;
            }
            return false;
        }
        return true;
    }

    public final boolean c(PaymentMethod$Type paymentMethod$Type) {
        fnx0 n = ((k) this.c).n();
        return n != null && b.j(n.c, paymentMethod$Type);
    }
}
