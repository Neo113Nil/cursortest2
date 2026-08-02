package defpackage;

import com.yandex.go.payments.data.model.response.Card;
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
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.y1;
import com.yandex.go.tips.data.model.TipsValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class fga0 implements rgz0 {
    public final String A;
    public final String B;
    public final n0 C;
    public final r0 D;
    public final cne0 a;
    public final kjz b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public fga0(b03 b03Var, wnt wntVar, dne0 dne0Var) {
        this.a = dne0Var.b();
        String applicationId = b03Var.getApplicationId();
        this.b = new kjz(b03Var, wntVar, dne0Var);
        this.c = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_CREDIT_CARD_ID");
        this.d = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_CORP_ACCOUNT_ID");
        this.e = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_CARGO_CORP_METHOD_ID");
        this.f = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_SHARED_ACCOUNT_ID");
        this.g = "ru.yandex.taxi.paymentmethods.utils.PreferenceUtils.FIELD_SELECTED_Y_WALLET_ID";
        this.h = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_SBP_TOKEN_ID");
        this.i = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_MBANK_ACCOUNT_ID");
        this.j = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_YAPE_TOKEN_ID");
        this.k = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_NEQUI_TOKEN_ID");
        this.l = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_SBP_BIND_TOKEN_ID");
        this.m = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_KASPI_ID");
        this.n = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_CLICK_WALLET_ID");
        this.o = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_EASYPAISA_WALLET_ID");
        this.p = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_JAZZCASH_WALLET_ID");
        this.q = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_FASTSHIFT_ACCOUNT_ID");
        this.r = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_YANGO_WALLET");
        this.s = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SELECTED_CASH_LIKE");
        this.t = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_PREFERRED_TIPS");
        this.u = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_PAYMENT_METHOD");
        this.v = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_HAS_LIMITS_INT");
        this.w = b64.j(applicationId, ".utils.PreferenceUtils.CREATE_SHARED_PAYMENT_OPENED_ONCE");
        this.x = b64.j(applicationId, ".utils.PreferenceUtils.READ_SHARED_PAYMENT_INVITATION_IDS");
        this.y = b64.j(applicationId, ".utils.PreferenceUtils.SHARED_PAYMENT_PROTECTION_SHOWN_ONCE");
        this.z = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SCOOTERS_PAYMENT_MIGRATED");
        this.A = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SCOOTERS_PAYMENT_OPTION_TYPE");
        this.B = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_SCOOTERS_PAYMENT_OPTION_ID");
        this.C = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        this.D = bvf0.c(Boolean.FALSE);
    }

    public final void A() {
        B(e4a0.S3, null);
    }

    public final void B(e4a0 e4a0Var, String str) {
        String str2 = this.u;
        int id = e4a0Var.getId();
        cne0 cne0Var = this.a;
        cne0Var.p(id, str2);
        cne0Var.w(this.v);
        C(e4a0Var, str);
        this.C.g(e4a0Var);
    }

    public final void C(e4a0 e4a0Var, String str) {
        PaymentMethod$Type a = e4a0Var.a();
        if (a == null) {
            return;
        }
        int i = ega0.a[a.ordinal()];
        cne0 cne0Var = this.a;
        switch (i) {
            case 1:
                cne0Var.r(this.c, str);
                break;
            case 2:
                cne0Var.r(this.d, str);
                break;
            case 3:
                cne0Var.r(this.e, str);
                break;
            case 4:
                cne0Var.r(this.f, str);
                break;
            case 5:
                cne0Var.r(this.g, str);
                break;
            case 6:
                cne0Var.r(this.i, str);
                break;
            case 7:
                cne0Var.r(this.j, str);
                break;
            case 8:
                cne0Var.r(this.k, str);
                break;
            case 9:
                cne0Var.r(this.l, str);
                break;
            case 10:
                cne0Var.r(this.m, str);
                break;
            case 11:
                cne0Var.r(this.n, str);
                break;
            case 12:
                cne0Var.r(this.o, str);
                break;
            case 13:
                cne0Var.r(this.p, str);
                break;
            case 14:
                cne0Var.r(this.q, str);
                break;
            case 15:
                cne0Var.r(this.h, str);
                break;
            case 16:
                cne0Var.r(this.r, str);
                break;
            case 17:
                cne0Var.r(this.s, str);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                w511.b();
                break;
        }
    }

    public final void D(int i) {
        unr0.C(new Object[]{Integer.valueOf(i)}, 1, "Set tips to %d%%", jst.e);
        this.a.p(i, this.t);
    }

    public final lv90 a() {
        return b(c());
    }

    public final lv90 b(e4a0 e4a0Var) {
        String q = q(e4a0Var);
        kv90 kv90Var = lv90.Companion;
        int i = this.a.i(this.v, -1);
        Boolean bool = i != 0 ? i != 1 ? null : Boolean.TRUE : Boolean.FALSE;
        kv90Var.getClass();
        return kv90.a(e4a0Var, q, bool);
    }

    public final e4a0 c() {
        Object obj;
        int i = this.a.i(this.u, -1);
        Iterator<E> it = PaymentMethod$Type.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PaymentMethod$Type) obj).getId() == i) {
                break;
            }
        }
        PaymentMethod$Type paymentMethod$Type = (PaymentMethod$Type) obj;
        if (paymentMethod$Type != null) {
            return paymentMethod$Type;
        }
        w3a0 w3a0Var = -1 == i ? e4a0.S3 : null;
        return w3a0Var == null ? e4a0.R3 : w3a0Var;
    }

    public final List d() {
        return this.b.g().a.a;
    }

    public final ArrayList e() {
        List list = this.b.g().t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FastshiftAccount) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((FastshiftAccount) next).getE() == null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        List list = this.b.g().t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof JazzcashWallet) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((JazzcashWallet) next).getE() == null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final Card g(String str) {
        Object obj;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((Card) obj).k(), str)) {
                break;
            }
        }
        return (Card) obj;
    }

    public final DeliveryPaymentMethod h(String str) {
        Object obj;
        Iterator it = this.b.g().d.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((DeliveryPaymentMethod) obj).a, str)) {
                break;
            }
        }
        return (DeliveryPaymentMethod) obj;
    }

    public final CashLikeAccount i(String str) {
        Object obj;
        Iterator it = this.b.g().b.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((CashLikeAccount) obj).c(), str)) {
                break;
            }
        }
        return (CashLikeAccount) obj;
    }

    public final CorpAccount j(String str) {
        Object obj;
        Iterator it = this.b.g().c.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((CorpAccount) obj).h(), str)) {
                break;
            }
        }
        return (CorpAccount) obj;
    }

    public final FastshiftAccount k(String str) {
        Object obj;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((FastshiftAccount) obj).getA(), str)) {
                break;
            }
        }
        return (FastshiftAccount) obj;
    }

    public final JazzcashWallet l(String str) {
        Object obj;
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((JazzcashWallet) obj).getA(), str)) {
                break;
            }
        }
        return (JazzcashWallet) obj;
    }

    public final Kaspi m(String str) {
        Object obj;
        Iterator it = this.b.g().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((Kaspi) obj).getA(), str)) {
                break;
            }
        }
        return (Kaspi) obj;
    }

    public final MBankAccount n(String str) {
        MBankAccount mBankAccount = this.b.g().r.a;
        if (mBankAccount == null || !jl40.l(mBankAccount.a, str)) {
            return null;
        }
        return mBankAccount;
    }

    public final SharedAccount o(String str) {
        Object obj;
        Iterator it = this.b.g().f.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((SharedAccount) obj).i(), str)) {
                break;
            }
        }
        return (SharedAccount) obj;
    }

    public final NequiToken p(String str) {
        Object obj;
        Iterator it = this.b.g().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((NequiToken) obj).getA(), str)) {
                break;
            }
        }
        return (NequiToken) obj;
    }

    public final String q(e4a0 e4a0Var) {
        PaymentMethod$Type a = e4a0Var.a();
        if (a != null) {
            int i = ega0.a[a.ordinal()];
            cne0 cne0Var = this.a;
            switch (i) {
                case 1:
                    return cne0Var.l(this.c, null);
                case 2:
                    return cne0Var.l(this.d, null);
                case 3:
                    return cne0Var.l(this.e, null);
                case 4:
                    return cne0Var.l(this.f, null);
                case 5:
                    return cne0Var.l(this.g, null);
                case 6:
                    return cne0Var.l(this.i, null);
                case 7:
                    return cne0Var.l(this.j, null);
                case 8:
                    return cne0Var.l(this.k, null);
                case 9:
                    return cne0Var.l(this.l, null);
                case 10:
                    return cne0Var.l(this.m, null);
                case 11:
                    return cne0Var.l(this.n, null);
                case 12:
                    return cne0Var.l(this.o, null);
                case 13:
                    return cne0Var.l(this.p, null);
                case 14:
                    return cne0Var.l(this.q, null);
                case 15:
                    return cne0Var.l(this.h, null);
                case 16:
                    return cne0Var.l(this.r, null);
                case 17:
                    return cne0Var.l(this.s, null);
                default:
                    w511.b();
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    return null;
            }
        }
        return null;
    }

    public final PersonalAccount r(String str) {
        Object obj;
        Iterator it = this.b.g().e.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((PersonalAccount) obj).a, str)) {
                break;
            }
        }
        return (PersonalAccount) obj;
    }

    public final int s() {
        TipsValue tipsValue = TipsValue.UNSET;
        int value = tipsValue.getValue();
        cne0 cne0Var = this.a;
        String str = this.t;
        if (cne0Var.i(str, value) == tipsValue.getValue()) {
            jst.e.getClass();
            if (d().isEmpty()) {
                TipsValue tipsValue2 = TipsValue.DEFAULT;
                String.format("No bound card. Set tips to default (%d%%)", Arrays.copyOf(new Object[]{Integer.valueOf(tipsValue2.getValue())}, 1));
                D(tipsValue2.getValue());
            } else {
                D(TipsValue.ZERO_PERCENT.getValue());
            }
        }
        return cne0Var.i(str, tipsValue.getValue());
    }

    public final String t() {
        int s = s();
        return (s == TipsValue.UNSET.getValue() || s == TipsValue.UNAVAILABLE.getValue()) ? "" : String.valueOf(s);
    }

    public final SbpBindToken u(String str) {
        Object obj;
        Iterator it = this.b.g().e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((SbpBindToken) obj).getA(), str)) {
                break;
            }
        }
        return (SbpBindToken) obj;
    }

    public final SbpToken v(String str) {
        Object obj;
        Iterator it = this.b.g().q.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((SbpToken) obj).e(), str)) {
                break;
            }
        }
        return (SbpToken) obj;
    }

    public final SharedAccount w() {
        return o(q(PaymentMethod$Type.SHARED));
    }

    public final y1 x(String str) {
        Object obj;
        Iterator it = this.b.g().h.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((y1) obj).c(), str)) {
                break;
            }
        }
        return (y1) obj;
    }

    public final YapeToken y(String str) {
        Object obj;
        Iterator it = this.b.g().d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((YapeToken) obj).getA(), str)) {
                break;
            }
        }
        return (YapeToken) obj;
    }

    public final gci0 z() {
        return e.d((pz40) ((i3y) this.b.c).getValue());
    }
}
