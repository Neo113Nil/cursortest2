package com.yandex.go.payments.paymentlist.navigation;

import com.yandex.go.payments.payment.AddButtonFlow;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.a000;
import defpackage.a60;
import defpackage.at51;
import defpackage.aw51;
import defpackage.az51;
import defpackage.bav0;
import defpackage.bg0;
import defpackage.bjm0;
import defpackage.bk0;
import defpackage.bt51;
import defpackage.c21;
import defpackage.cf0;
import defpackage.ck0;
import defpackage.cv51;
import defpackage.cz51;
import defpackage.df0;
import defpackage.dv51;
import defpackage.eb0;
import defpackage.ep51;
import defpackage.evu0;
import defpackage.f731;
import defpackage.fl8;
import defpackage.fv51;
import defpackage.ghs;
import defpackage.gj8;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.iq51;
import defpackage.j000;
import defpackage.jba0;
import defpackage.jd0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jy51;
import defpackage.kd0;
import defpackage.lea0;
import defpackage.lk0;
import defpackage.m950;
import defpackage.mcp;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.mm10;
import defpackage.mz91;
import defpackage.na0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.op70;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tba0;
import defpackage.tje;
import defpackage.tnr0;
import defpackage.um50;
import defpackage.v4a0;
import defpackage.v770;
import defpackage.v7x;
import defpackage.vba0;
import defpackage.vbn;
import defpackage.vi0;
import defpackage.w511;
import defpackage.xby;
import defpackage.xe91;
import defpackage.y50;
import defpackage.zs51;
import defpackage.zv51;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;

/* loaded from: classes8.dex */
public final class e implements tba0 {
    public final vba0 a;
    public final /* synthetic */ f b;

    public e(f fVar, vba0 vba0Var) {
        this.b = fVar;
        this.a = vba0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, at51 at51Var, zv51 zv51Var, ContinuationImpl continuationImpl) {
        PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1 paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1;
        int i;
        az51 az51Var;
        f fVar = eVar.b;
        if (continuationImpl instanceof PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1) {
            paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1 = (PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1) continuationImpl;
            int i2 = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cz51 cz51Var = fVar.m0.a;
                    if (cz51Var == null) {
                        az51Var = null;
                        if (az51Var != null && at51Var.c().equals(az51Var.b())) {
                            zv51Var = new zv51(az51Var.b(), az51Var.a(), mz91.d(az51Var.c()));
                        }
                        ((dv51) ((cv51) ((jy51) fVar.K.get()).b.get())).b(new fv51(new aw51(zv51Var, xe91.g(eVar.a.a)), true), new bav0(null, 2));
                        return zy11.a;
                    }
                    paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.L$0 = at51Var;
                    paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.L$1 = zv51Var;
                    paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.label = 1;
                    obj = cz51Var.b(paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zv51Var = (zv51) paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.L$1;
                    at51Var = (at51) paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                az51Var = (az51) obj;
                if (az51Var != null) {
                    zv51Var = new zv51(az51Var.b(), az51Var.a(), mz91.d(az51Var.c()));
                }
                ((dv51) ((cv51) ((jy51) fVar.K.get()).b.get())).b(new fv51(new aw51(zv51Var, xe91.g(eVar.a.a)), true), new bav0(null, 2));
                return zy11.a;
            }
        }
        paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1 = new PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1(eVar, continuationImpl);
        Object obj2 = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsListRouter$PaymentMethodsListNavigatorInner$openYbWalletTopUpScreen$1.label;
        if (i != 0) {
        }
        az51Var = (az51) obj2;
        if (az51Var != null) {
        }
        ((dv51) ((cv51) ((jy51) fVar.K.get()).b.get())).b(new fv51(new aw51(zv51Var, xe91.g(eVar.a.a)), true), new bav0(null, 2));
        return zy11.a;
    }

    public final void b(bt51 bt51Var) {
        f fVar = this.b;
        if (!gtq0.u(fVar)) {
            xby.t(jst.e, "PAYMENTS_LIST:ON_NOT_LAUNCHED_ROUTER_CALL", new IllegalStateException(), null, 10);
            return;
        }
        if (bt51Var instanceof at51) {
            tje.N(fVar.o(), null, null, new PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onYbWalletActionClicked$1(this, bt51Var, null), 3);
        } else if (!(bt51Var instanceof zs51)) {
            w511.b();
        } else {
            ((jy51) fVar.K.get()).a(xe91.g(this.a.a), ((zs51) bt51Var).c, null);
        }
    }

    public final void c(vi0 vi0Var) {
        String str;
        v770 v770Var = v770.B;
        vba0 vba0Var = this.a;
        c21 c21Var = sy60.Q2;
        f fVar = this.b;
        int i = 3;
        if (vi0Var instanceof na0) {
            fVar.A((m950) fVar.g0.get(), ((jba0) fVar.f0.get()).g(), new eb0(i, fVar));
            return;
        }
        if (vi0Var instanceof mf0) {
            tje.N(fVar.o(), null, null, new PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$onAddMBankAccountClicked$1(fVar, this, null), 3);
            return;
        }
        if (vi0Var instanceof of0) {
            fVar.A((m950) fVar.L.get(), new j000(MultiTransportChooseStationCardAnalytics$OpenReasonV2.PaymentOptions), c21Var);
            return;
        }
        if (vi0Var instanceof mj0) {
            fVar.z((com.yandex.go.payments.sbp.navigation.c) fVar.o0.getValue(), c21Var);
            return;
        }
        if (vi0Var instanceof nj0) {
            ((y) ((tnr0) fVar.J.get())).e(((nj0) vi0Var).b, SharedPaymentsOpenReason.PAYMENT_SUMMARY, new op70(22, fVar));
            return;
        }
        if (vi0Var instanceof nk0) {
            jy51 jy51Var = (jy51) fVar.K.get();
            List list = ((nk0) vi0Var).a;
            YbScreenSource g = xe91.g(vba0Var.a);
            iq51 Y = jy51Var.a.c().B.Y(list);
            jy51Var.a(g, Y != null ? Y.d : null, null);
            return;
        }
        if (vi0Var instanceof mk0) {
            fVar.A((m950) fVar.W.get(), new lk0(vba0Var.a.getOpenReason(), fVar.E), c21Var);
            return;
        }
        int i2 = 1;
        if (vi0Var instanceof bg0) {
            fVar.A((m950) fVar.b0.get(), new cf0(vba0Var.a.getOpenReason(), fVar.E, 1), c21Var);
            return;
        }
        if (vi0Var instanceof kd0) {
            fVar.A((m950) fVar.Z.get(), new jd0(vba0Var.a.getOpenReason(), fVar.E), c21Var);
            return;
        }
        if (vi0Var instanceof df0) {
            fVar.A((m950) fVar.a0.get(), new cf0(vba0Var.a.getOpenReason(), fVar.E, 0), c21Var);
            return;
        }
        if (vi0Var instanceof ogz0) {
            fVar.z((m950) fVar.S.get(), new mm10(fVar, i2));
            return;
        }
        if (vi0Var instanceof bk0) {
            String a = ((bk0) vi0Var).a().a();
            str = a != null ? a : "";
            if (evu0.J(str)) {
                return;
            }
            ((a60) ((y50) this.b.d0.get())).c(str, v770Var);
            return;
        }
        if (!(vi0Var instanceof ck0)) {
            w511.b();
            return;
        }
        AddButtonFlow a2 = ((ck0) vi0Var).a();
        if (a2.c() == AddButtonFlow.AddButtonFlowType.TRANSPORT_EXTERNAL && jl40.l(a2.b(), "mosmetro")) {
            sls slsVar = fVar.m0.f;
            if (slsVar != null) {
                slsVar.invoke();
                return;
            }
            return;
        }
        String a3 = a2.a();
        str = a3 != null ? a3 : "";
        if (evu0.J(str)) {
            return;
        }
        ((a60) ((y50) this.b.d0.get())).c(str, v770Var);
    }

    public final void d(lea0 lea0Var) {
        f fVar = this.b;
        m950 m950Var = (m950) fVar.R.get();
        vba0 vba0Var = this.a;
        fVar.A(m950Var, new v4a0(lea0Var, vba0Var.a.getOpenReason(), vba0Var.b.d), new d(fVar, this));
    }

    public final void e(f731 f731Var) {
        gj8 b;
        f fVar = this.b;
        h3y h3yVar = fVar.f0;
        if (f731Var instanceof fl8) {
            b = ((jba0) h3yVar.get()).d((fl8) f731Var);
        } else if (f731Var instanceof bjm0) {
            b = ((jba0) h3yVar.get()).h(((bjm0) f731Var).getId());
        } else if (f731Var instanceof a000) {
            b = ((jba0) h3yVar.get()).f(((a000) f731Var).getId());
        } else if (f731Var instanceof ep51) {
            b = ((jba0) h3yVar.get()).a(((ep51) f731Var).getId());
        } else if (f731Var instanceof um50) {
            b = ((jba0) h3yVar.get()).c(((um50) f731Var).getId());
        } else if (f731Var instanceof vbn) {
            b = ((jba0) h3yVar.get()).e(((vbn) f731Var).getId());
        } else if (f731Var instanceof v7x) {
            b = ((jba0) h3yVar.get()).i(((v7x) f731Var).getId());
        } else {
            if (!(f731Var instanceof mcp)) {
                w511.b();
                return;
            }
            b = ((jba0) h3yVar.get()).b(((mcp) f731Var).getId());
        }
        fVar.A((m950) fVar.g0.get(), b, new eb0(3, fVar));
    }

    public final void f(ghs ghsVar) {
        f fVar = this.b;
        fVar.A((m950) fVar.O.get(), ghsVar, new a(fVar, ghsVar));
    }
}
