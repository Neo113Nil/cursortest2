package defpackage;

import com.yandex.go.loyalty.impl.common.experiments.LoyaltyProgramsStateExperiment;
import com.yandex.go.payments.api.composite.CompositePaymentState;
import com.yandex.go.payments.data.model.response.ComplementWallet;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class drd {
    public final fga0 a;
    public final nrd b;
    public final dqe0 c;
    public final g8a0 d;
    public final x1f0 e;
    public final lz90 f;
    public final jvz g;

    public drd(fga0 fga0Var, nrd nrdVar, dqe0 dqe0Var, g8a0 g8a0Var, x1f0 x1f0Var, lz90 lz90Var, jvz jvzVar) {
        this.a = fga0Var;
        this.b = nrdVar;
        this.c = dqe0Var;
        this.d = g8a0Var;
        this.e = x1f0Var;
        this.f = lz90Var;
        this.g = jvzVar;
    }

    public final boolean a() {
        xxc g = g();
        return g != null && (g.a() ^ true);
    }

    public final xxc b(tls tlsVar) {
        Object obj;
        wxc wxcVar;
        Iterator it = this.a.b.g().e.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                break;
            }
        }
        PersonalAccount personalAccount = (PersonalAccount) obj;
        if (personalAccount != null) {
            lz90 lz90Var = this.f;
            lz90Var.getClass();
            PersonalAccount.ComplementAttributes complementAttributes = personalAccount.i;
            if (complementAttributes == null) {
                wxcVar = null;
            } else {
                String str = personalAccount.a;
                PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.PERSONAL_WALLET;
                lz90Var.b.getClass();
                wxcVar = new wxc(str, paymentMethod$Type, ry90.b(personalAccount), new vxc(complementAttributes.a, complementAttributes.b, (List) complementAttributes.d.getValue()), "");
            }
            if (wxcVar != null) {
                String str2 = personalAccount.e;
                if (str2 == null) {
                    str2 = "";
                }
                return new xxc(wxcVar, str2, personalAccount.b);
            }
        }
        return null;
    }

    public final xxc c(String str) {
        Object obj;
        wxc o;
        if (str != null) {
            if (!((LoyaltyProgramsStateExperiment) this.g.a.b()).getB()) {
                return b(new brd(str, 0));
            }
            Iterator it = this.a.b.g().s.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((ComplementWallet) obj).getA(), str)) {
                    break;
                }
            }
            ComplementWallet complementWallet = (ComplementWallet) obj;
            if (complementWallet != null && (o = this.f.o(complementWallet)) != null) {
                Object value = this.e.b.a.getValue();
                evz evzVar = (evz) value;
                if (!jl40.l(evzVar != null ? evzVar.getId() : null, str)) {
                    value = null;
                }
                evz evzVar2 = (evz) value;
                String a = evzVar2 != null ? evzVar2.a() : null;
                if (a == null) {
                    a = "";
                }
                String header = evzVar2 != null ? evzVar2.getHeader() : null;
                return new xxc(o, a, header != null ? header : "");
            }
        }
        return null;
    }

    public final boolean d(e4a0 e4a0Var) {
        xxc g;
        List list;
        if (e4a0Var != null) {
            PaymentMethod$Type a = e4a0Var.a();
            if ((a == null || (g = g()) == null || (list = g.a.d.c) == null) ? false : list.contains(a)) {
                return true;
            }
        }
        return false;
    }

    public final void e(lv90 lv90Var) {
        e4a0 a = lv90Var.a();
        xxc g = g();
        nrd nrdVar = this.b;
        if (g == null || g.a() || !g.b()) {
            nrdVar.a.f(null);
            nrdVar.b.l(mrd.f);
        } else {
            if (!nrdVar.b()) {
                h();
            }
            if (d(a)) {
                return;
            }
            h();
        }
    }

    public final void f(String str, PaymentMethod$Type paymentMethod$Type) {
        lv90.Companion.getClass();
        lv90 b = kv90.b(str, paymentMethod$Type);
        nrd nrdVar = this.b;
        nrdVar.a.f(b);
        CompositePaymentState compositePaymentState = CompositePaymentState.ENABLED_CHECKED;
        r0 r0Var = nrdVar.b;
        mrd mrdVar = (mrd) r0Var.getValue();
        r0Var.l(new mrd(compositePaymentState, mrdVar.b, mrdVar.c, mrdVar.d, mrdVar.e));
    }

    public final xxc g() {
        Object obj;
        wxc o;
        if (!((LoyaltyProgramsStateExperiment) this.g.a.b()).getB()) {
            return b(new qu(15));
        }
        List list = this.a.b.g().s.a;
        evz evzVar = (evz) this.e.b.a.getValue();
        if (evzVar != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((ComplementWallet) obj).f(), evzVar.getId())) {
                    break;
                }
            }
            ComplementWallet complementWallet = (ComplementWallet) obj;
            if (complementWallet != null && (o = this.f.o(complementWallet)) != null) {
                return new xxc(o, evzVar.a(), evzVar.getHeader());
            }
        }
        return null;
    }

    public final void h() {
        nrd nrdVar = this.b;
        nrdVar.a.f(null);
        CompositePaymentState compositePaymentState = CompositePaymentState.ENABLED_UNCHECKED;
        r0 r0Var = nrdVar.b;
        mrd mrdVar = (mrd) r0Var.getValue();
        r0Var.l(new mrd(compositePaymentState, mrdVar.b, mrdVar.c, mrdVar.d, mrdVar.e));
    }
}
