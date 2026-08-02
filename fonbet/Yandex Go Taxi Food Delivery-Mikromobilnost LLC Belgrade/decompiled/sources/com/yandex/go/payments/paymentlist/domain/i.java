package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.cba0;
import defpackage.cda0;
import defpackage.d90;
import defpackage.drd;
import defpackage.e4a0;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.fqk0;
import defpackage.g9a0;
import defpackage.gda0;
import defpackage.h3y;
import defpackage.h8b0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.iba0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.kv90;
import defpackage.l9;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.lw90;
import defpackage.mdh;
import defpackage.mrd;
import defpackage.n20;
import defpackage.nrd;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qa0;
import defpackage.qyw;
import defpackage.rif0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.syw;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wxc;
import defpackage.xe91;
import defpackage.xku0;
import defpackage.xxc;
import defpackage.yc9;
import defpackage.ycq0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class i implements cba0 {
    public final fga0 a;
    public final ru.yandex.taxi.startup.launch.h b;
    public final jtq0 c;
    public final com.yandex.go.payments.googlepay.domain.e d;
    public final n20 e;
    public final com.yandex.go.superapp.order.multi.old.provider.g f;
    public final drd g;
    public final g9a0 h;
    public final h3y i;
    public final cda0 j;
    public final com.yandex.go.payments.mbank.domain.a k;
    public final com.yandex.go.payments.sbp.domain.e l;
    public final com.yandex.go.payments.yape.domain.unbinding.a m;
    public final com.yandex.go.payments.nequi.domain.unbinding.a n;
    public final com.yandex.go.payments.yb.domain.a o;
    public final k0 p;
    public final syw q;
    public final tt2 r;
    public final hit s;
    public final lw90 t;
    public final xku0 u;
    public final d90 v;
    public final qyw w;
    public final gda0 x;
    public final ycq0 y;

    public i(fga0 fga0Var, ru.yandex.taxi.startup.launch.h hVar, jtq0 jtq0Var, com.yandex.go.payments.googlepay.domain.e eVar, n20 n20Var, com.yandex.go.superapp.order.multi.old.provider.g gVar, drd drdVar, g9a0 g9a0Var, h3y h3yVar, cda0 cda0Var, com.yandex.go.payments.mbank.domain.a aVar, com.yandex.go.payments.sbp.domain.e eVar2, com.yandex.go.payments.yape.domain.unbinding.a aVar2, com.yandex.go.payments.nequi.domain.unbinding.a aVar3, com.yandex.go.payments.yb.domain.a aVar4, k0 k0Var, syw sywVar, tt2 tt2Var, hit hitVar, lw90 lw90Var, xku0 xku0Var, d90 d90Var, qyw qywVar, gda0 gda0Var, ycq0 ycq0Var) {
        this.a = fga0Var;
        this.b = hVar;
        this.c = jtq0Var;
        this.d = eVar;
        this.e = n20Var;
        this.f = gVar;
        this.g = drdVar;
        this.h = g9a0Var;
        this.i = h3yVar;
        this.j = cda0Var;
        this.k = aVar;
        this.l = eVar2;
        this.m = aVar2;
        this.n = aVar3;
        this.o = aVar4;
        this.p = k0Var;
        this.q = sywVar;
        this.r = tt2Var;
        this.s = hitVar;
        this.t = lw90Var;
        this.u = xku0Var;
        this.v = d90Var;
        this.w = qywVar;
        this.x = gda0Var;
        this.y = ycq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, TaxiOrder taxiOrder, rif0 rif0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1 paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1) {
            paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1 = (PaymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.internal.g l = iVar.d.l();
                    paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.L$0 = taxiOrder;
                    paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.L$1 = rif0Var;
                    paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(l, paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rif0Var = (rif0) paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.L$1;
                    taxiOrder = (TaxiOrder) paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                kv90 kv90Var = lv90.Companion;
                PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.GOOGLE_PAY;
                kv90Var.getClass();
                iVar.c(kv90.b((String) obj, paymentMethod$Type), taxiOrder, rif0Var, paymentMethod$Type);
                return zy11.a;
            }
        }
        paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1 = new PaymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1(iVar, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$changePaymentMethodToGooglePayInOrder$1.label;
        if (i != 0) {
        }
        kv90 kv90Var2 = lv90.Companion;
        PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.GOOGLE_PAY;
        kv90Var2.getClass();
        iVar.c(kv90.b((String) obj2, paymentMethod$Type2), taxiOrder, rif0Var, paymentMethod$Type2);
        return zy11.a;
    }

    public static boolean g(lv90 lv90Var, lv90 lv90Var2) {
        lv90.Companion.getClass();
        if (jl40.l(lv90Var, lv90.g)) {
            return false;
        }
        e4a0 a = lv90Var.a();
        PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.GOOGLE_PAY;
        return !(a == paymentMethod$Type && lv90Var2.a() == paymentMethod$Type) && jl40.l(lv90Var2.b, lv90Var.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lea0 lea0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$allowDelete$1 paymentMethodsInteractorImpl$allowDelete$1;
        int i;
        boolean z;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$allowDelete$1) {
            paymentMethodsInteractorImpl$allowDelete$1 = (PaymentMethodsInteractorImpl$allowDelete$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$allowDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$allowDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$allowDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$allowDelete$1.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean a = this.w.a(lea0Var);
                    paymentMethodsInteractorImpl$allowDelete$1.L$0 = lea0Var;
                    paymentMethodsInteractorImpl$allowDelete$1.Z$0 = a;
                    paymentMethodsInteractorImpl$allowDelete$1.label = 1;
                    Object k = ((com.yandex.go.taxi.order.provider.a) this.e).k(paymentMethodsInteractorImpl$allowDelete$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k;
                    z = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = paymentMethodsInteractorImpl$allowDelete$1.Z$0;
                    lea0Var = (lea0) paymentMethodsInteractorImpl$allowDelete$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                if (z) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(lea0Var.getId(), ((o2y0) it.next()).b().q().b)) {
                            }
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        paymentMethodsInteractorImpl$allowDelete$1 = new PaymentMethodsInteractorImpl$allowDelete$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$allowDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$allowDelete$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        List list3 = (List) obj2;
        if (z) {
        }
        z22 = false;
        return Boolean.valueOf(z22);
    }

    public final void c(lv90 lv90Var, TaxiOrder taxiOrder, rif0 rif0Var, PaymentMethod$Type paymentMethod$Type) {
        String str = taxiOrder.a;
        String Hg = this.b.Hg();
        if (Hg != null && !evu0.J(Hg)) {
            ((fqk0) this.i.get()).a(new yc9(Hg, str, this.c.b(null), paymentMethod$Type, lv90Var.b, this.a.t(), new l9(this, paymentMethod$Type, lv90Var, rif0Var, 24), new qa0(18, rif0Var)));
        } else {
            jst.e.s(new IllegalStateException("Launch id is required to change payment method"));
            rif0Var.o();
        }
    }

    public final String d() {
        PaymentMethods.LocationInfo locationInfo = this.a.b.g().o;
        if (locationInfo != null) {
            return locationInfo.b;
        }
        return null;
    }

    public final lea0 e() {
        lv90 a = this.p.b.a();
        return this.x.b(this.a.b.g(), a);
    }

    public final boolean f() {
        int i;
        List d = this.a.d();
        if ((d instanceof Collection) && d.isEmpty()) {
            i = 0;
        } else {
            Iterator it = d.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!this.q.a((Card) it.next()) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        return i > 0;
    }

    public final void h(PaymentMethod$Type paymentMethod$Type, String str, boolean z) {
        if (str == null || !z) {
            return;
        }
        g9a0.f(this.h, xe91.i(str), paymentMethod$Type.getCode(), null, null, 28);
    }

    public final void i(xxc xxcVar, String str, boolean z) {
        boolean a = xxcVar.a();
        wxc wxcVar = xxcVar.a;
        PaymentMethod$Type paymentMethod$Type = wxcVar.b;
        if (a) {
            return;
        }
        drd drdVar = this.g;
        if (drdVar.b.b() || !xxcVar.b()) {
            drdVar.h();
        } else {
            drdVar.f(wxcVar.a, paymentMethod$Type);
        }
        h(paymentMethod$Type, str, z);
    }

    public final void j(h8b0 h8b0Var, String str) {
        drd drdVar = this.g;
        if (drdVar.b.b() || !h8b0Var.f()) {
            drdVar.h();
        } else {
            drdVar.f(h8b0Var.a, PaymentMethod$Type.PERSONAL_WALLET);
        }
        h8b0Var.getClass();
        h(PaymentMethod$Type.PERSONAL_WALLET, str, true);
    }

    public final void k(lv90 lv90Var, iba0 iba0Var) {
        iba0Var.onStart();
        lv90 a = this.u.a.a();
        if (g(a, lv90Var)) {
            iba0Var.o();
            return;
        }
        e4a0 a2 = lv90Var.a();
        String str = lv90Var.b;
        Boolean bool = a.d;
        lv90.Companion.getClass();
        this.y.a(kv90.a(a2, str, bool));
        iba0Var.og(false);
    }

    public final void l(lv90 lv90Var, TaxiOrder taxiOrder, rif0 rif0Var) {
        rif0Var.onStart();
        if (g(taxiOrder.q(), lv90Var)) {
            rif0Var.o();
            return;
        }
        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
        if (paymentMethod$Type == null) {
            rif0Var.o();
            return;
        }
        if (paymentMethod$Type != PaymentMethod$Type.GOOGLE_PAY) {
            c(lv90Var, taxiOrder, rif0Var, paymentMethod$Type);
            return;
        }
        hbp0 hbp0Var = this.s.a;
        this.r.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new PaymentMethodsInteractorImpl$setSelectedOptionForOrder$1(this, taxiOrder, rif0Var, null), 2);
    }

    public final void m(boolean z) {
        lea0 e = e();
        drd drdVar = this.g;
        xxc g = drdVar.g();
        if (g == null) {
            return;
        }
        wxc wxcVar = g.a;
        if (g.a()) {
            return;
        }
        List list = wxcVar.d.c;
        PaymentMethod$Type c = e != null ? e.c() : null;
        boolean z2 = c != null && kotlin.collections.a.G(list, c);
        boolean z3 = !z || drdVar.d.c(PaymentMethod$Type.PERSONAL_WALLET);
        nrd nrdVar = drdVar.b;
        if (nrdVar.a(((mrd) nrdVar.b.getValue()).a) != CompositePaymentState.ENABLED_CHECKED && z2 && z3) {
            drdVar.f(wxcVar.a, wxcVar.b);
        } else {
            drdVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, PaymentMethod$Type paymentMethod$Type, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$unbindLpmWallet$1 paymentMethodsInteractorImpl$unbindLpmWallet$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$unbindLpmWallet$1) {
            paymentMethodsInteractorImpl$unbindLpmWallet$1 = (PaymentMethodsInteractorImpl$unbindLpmWallet$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$unbindLpmWallet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$unbindLpmWallet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$unbindLpmWallet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$unbindLpmWallet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsInteractorImpl$unbindLpmWallet$1.L$0 = null;
                    paymentMethodsInteractorImpl$unbindLpmWallet$1.L$1 = null;
                    paymentMethodsInteractorImpl$unbindLpmWallet$1.label = 1;
                    Object a = this.o.a(str, paymentMethod$Type, paymentMethodsInteractorImpl$unbindLpmWallet$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        paymentMethodsInteractorImpl$unbindLpmWallet$1 = new PaymentMethodsInteractorImpl$unbindLpmWallet$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$unbindLpmWallet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$unbindLpmWallet$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$unbindMBankAccount$1 paymentMethodsInteractorImpl$unbindMBankAccount$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$unbindMBankAccount$1) {
            paymentMethodsInteractorImpl$unbindMBankAccount$1 = (PaymentMethodsInteractorImpl$unbindMBankAccount$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$unbindMBankAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$unbindMBankAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$unbindMBankAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$unbindMBankAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsInteractorImpl$unbindMBankAccount$1.L$0 = null;
                    paymentMethodsInteractorImpl$unbindMBankAccount$1.label = 1;
                    Object a = this.k.a(str, paymentMethodsInteractorImpl$unbindMBankAccount$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        paymentMethodsInteractorImpl$unbindMBankAccount$1 = new PaymentMethodsInteractorImpl$unbindMBankAccount$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$unbindMBankAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$unbindMBankAccount$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$unbindNequiToken$1 paymentMethodsInteractorImpl$unbindNequiToken$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$unbindNequiToken$1) {
            paymentMethodsInteractorImpl$unbindNequiToken$1 = (PaymentMethodsInteractorImpl$unbindNequiToken$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$unbindNequiToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$unbindNequiToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$unbindNequiToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$unbindNequiToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsInteractorImpl$unbindNequiToken$1.L$0 = null;
                    paymentMethodsInteractorImpl$unbindNequiToken$1.label = 1;
                    Object a = this.n.a(str, paymentMethodsInteractorImpl$unbindNequiToken$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        paymentMethodsInteractorImpl$unbindNequiToken$1 = new PaymentMethodsInteractorImpl$unbindNequiToken$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$unbindNequiToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$unbindNequiToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$unbindSbpToken$1 paymentMethodsInteractorImpl$unbindSbpToken$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$unbindSbpToken$1) {
            paymentMethodsInteractorImpl$unbindSbpToken$1 = (PaymentMethodsInteractorImpl$unbindSbpToken$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$unbindSbpToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$unbindSbpToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$unbindSbpToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$unbindSbpToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsInteractorImpl$unbindSbpToken$1.L$0 = null;
                    paymentMethodsInteractorImpl$unbindSbpToken$1.label = 1;
                    Object b = this.l.b(str, paymentMethodsInteractorImpl$unbindSbpToken$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        paymentMethodsInteractorImpl$unbindSbpToken$1 = new PaymentMethodsInteractorImpl$unbindSbpToken$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$unbindSbpToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$unbindSbpToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$unbindYapeToken$1 paymentMethodsInteractorImpl$unbindYapeToken$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$unbindYapeToken$1) {
            paymentMethodsInteractorImpl$unbindYapeToken$1 = (PaymentMethodsInteractorImpl$unbindYapeToken$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$unbindYapeToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$unbindYapeToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$unbindYapeToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$unbindYapeToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsInteractorImpl$unbindYapeToken$1.L$0 = null;
                    paymentMethodsInteractorImpl$unbindYapeToken$1.label = 1;
                    Object a = this.m.a(str, paymentMethodsInteractorImpl$unbindYapeToken$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        paymentMethodsInteractorImpl$unbindYapeToken$1 = new PaymentMethodsInteractorImpl$unbindYapeToken$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$unbindYapeToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$unbindYapeToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ContinuationImpl continuationImpl) {
        PaymentMethodsInteractorImpl$updateAndGetPaymentMethods$1 paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsInteractorImpl$updateAndGetPaymentMethods$1) {
            paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1 = (PaymentMethodsInteractorImpl$updateAndGetPaymentMethods$1) continuationImpl;
            int i2 = paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.label = 1;
                    if (((com.yandex.go.payments.paymentlist.data.c) this.j).q(paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return this.a.b.g();
            }
        }
        paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1 = new PaymentMethodsInteractorImpl$updateAndGetPaymentMethods$1(this, continuationImpl);
        Object obj2 = paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsInteractorImpl$updateAndGetPaymentMethods$1.label;
        if (i != 0) {
        }
        return this.a.b.g();
    }
}
