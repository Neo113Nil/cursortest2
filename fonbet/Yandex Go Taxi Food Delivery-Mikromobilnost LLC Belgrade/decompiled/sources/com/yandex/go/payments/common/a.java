package com.yandex.go.payments.common;

import android.graphics.drawable.Drawable;
import com.yandex.go.payments.common.a;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCashIconExperiment;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import com.yandex.go.yb.data.u;
import defpackage.a000;
import defpackage.avj0;
import defpackage.avu0;
import defpackage.bg0;
import defpackage.bjm0;
import defpackage.bk0;
import defpackage.cfm0;
import defpackage.ck0;
import defpackage.cvu0;
import defpackage.d111;
import defpackage.df0;
import defpackage.el8;
import defpackage.ep51;
import defpackage.evu0;
import defpackage.fl8;
import defpackage.h211;
import defpackage.h8b0;
import defpackage.i0a0;
import defpackage.i3y;
import defpackage.iq51;
import defpackage.ivt;
import defpackage.j0a0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jo51;
import defpackage.jve;
import defpackage.jx81;
import defpackage.k0a0;
import defpackage.kd0;
import defpackage.lea0;
import defpackage.m0a0;
import defpackage.mcp;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.n0a0;
import defpackage.na0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.oe91;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.p0a0;
import defpackage.p1c;
import defpackage.q0a0;
import defpackage.qgx;
import defpackage.r0a0;
import defpackage.rqo;
import defpackage.s0a0;
import defpackage.sls;
import defpackage.snr0;
import defpackage.t0a0;
import defpackage.t19;
import defpackage.t1b0;
import defpackage.u0a0;
import defpackage.u19;
import defpackage.um50;
import defpackage.utg0;
import defpackage.v7x;
import defpackage.vbn;
import defpackage.vi0;
import defpackage.w0a0;
import defpackage.w511;
import defpackage.wxc;
import defpackage.x0a0;
import defpackage.yhi;
import defpackage.yy51;
import defpackage.zuj0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements u0a0 {
    public final u a;
    public final zuj0 b;
    public final t1b0 c;
    public final i3y d;
    public final i3y e;

    public a(u uVar, zuj0 zuj0Var, rqo rqoVar) {
        this.a = uVar;
        this.b = zuj0Var;
        PaymentMethodsCashIconExperiment.Companion.getClass();
        this.c = ((jbh) rqoVar).e(PaymentMethodsCashIconExperiment.e);
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: v0a0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        c = ((avj0) aVar.b).c(utg0.bank_icon_width);
                        break;
                    default:
                        c = ((avj0) aVar.b).c(utg0.bank_icon_height);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: v0a0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) aVar.b).c(utg0.bank_icon_width);
                        break;
                    default:
                        c = ((avj0) aVar.b).c(utg0.bank_icon_height);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
    }

    public static q0a0 h() {
        return new q0a0(null, jx81.s(new k0a0(IconType.CASH)));
    }

    public static Object i(String str, Map map) {
        Object obj;
        if (str != null) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (cvu0.t((String) ((Map.Entry) obj).getKey(), str, true)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u19 u19Var, BigDecimal bigDecimal, String str, ContinuationImpl continuationImpl) {
        PaymentIconInfoFactoryImpl$createCashPaymentIconInfo$1 paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1;
        int i;
        PaymentMethodsCashIconExperiment paymentMethodsCashIconExperiment;
        Object obj;
        String str2;
        if (continuationImpl instanceof PaymentIconInfoFactoryImpl$createCashPaymentIconInfo$1) {
            paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1 = (PaymentIconInfoFactoryImpl$createCashPaymentIconInfo$1) continuationImpl;
            int i2 = paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.label;
                if (i != 0) {
                    b.b(obj2);
                    paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.L$0 = u19Var;
                    paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.L$1 = bigDecimal;
                    paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.L$2 = str;
                    paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.label = 1;
                    obj2 = this.c.b(paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.L$2;
                    bigDecimal = (BigDecimal) paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.L$1;
                    u19Var = (u19) paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.L$0;
                    b.b(obj2);
                }
                paymentMethodsCashIconExperiment = (PaymentMethodsCashIconExperiment) obj2;
                if (paymentMethodsCashIconExperiment.b) {
                    return h();
                }
                if (str == null) {
                    str = u19Var.a;
                }
                PaymentMethodsCashIconExperiment.CurrencyDescription currencyDescription = (PaymentMethodsCashIconExperiment.CurrencyDescription) i(str, paymentMethodsCashIconExperiment.c);
                if (currencyDescription == null) {
                    return h();
                }
                String str3 = currencyDescription.b;
                if (bigDecimal == null) {
                    return g(str3, null);
                }
                Set<Map.Entry> entrySet = currencyDescription.a.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : entrySet) {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    BigDecimal h = avu0.h(str4);
                    Pair pair = h == null ? null : new Pair(h, str5);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                List x0 = kotlin.collections.a.x0(arrayList, new x0a0());
                Iterator it = x0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((BigDecimal) ((Pair) obj).getFirst()).compareTo(bigDecimal) >= 0) {
                        break;
                    }
                }
                Pair pair2 = (Pair) obj;
                if (pair2 == null || (str2 = (String) pair2.f()) == null) {
                    Pair pair3 = (Pair) kotlin.collections.a.b0(x0);
                    str2 = pair3 != null ? (String) pair3.f() : null;
                }
                if (str2 == null || evu0.J(str2)) {
                    str2 = str3;
                }
                return g(str2, jl40.l(str2, str3) ? null : str3);
            }
        }
        paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1 = new PaymentIconInfoFactoryImpl$createCashPaymentIconInfo$1(this, continuationImpl);
        Object obj22 = paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentIconInfoFactoryImpl$createCashPaymentIconInfo$1.label;
        if (i != 0) {
        }
        paymentMethodsCashIconExperiment = (PaymentMethodsCashIconExperiment) obj22;
        if (paymentMethodsCashIconExperiment.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t0a0 c(vi0 vi0Var) {
        m0a0 k0a0Var;
        m0a0 m0a0Var;
        Drawable drawable;
        if (!(vi0Var instanceof na0) && !(vi0Var instanceof bk0) && !(vi0Var instanceof ck0)) {
            if (vi0Var instanceof mf0) {
                m0a0Var = new k0a0(IconType.MBANK_ACCOUNT);
            } else if (vi0Var instanceof mj0) {
                k0a0Var = new k0a0(IconType.SBP_TOKEN);
            } else if (vi0Var instanceof mk0) {
                k0a0Var = new k0a0(IconType.YAPE_TOKEN);
            } else if (vi0Var instanceof bg0) {
                k0a0Var = new k0a0(IconType.NEQUI_TOKEN);
            } else if (vi0Var instanceof kd0) {
                k0a0Var = new k0a0(IconType.FASTSHIFT_ACCOUNT);
            } else if (vi0Var instanceof df0) {
                k0a0Var = new k0a0(IconType.JAZZCASH_WALLET);
            } else if (vi0Var instanceof ogz0) {
                k0a0Var = new k0a0(IconType.TIPS);
            } else if (vi0Var instanceof nj0) {
                int i = w0a0.b[((nj0) vi0Var).a.ordinal()];
                if (i == 1 || i == 2) {
                    m0a0Var = new k0a0(IconType.SHARED_FAMILY);
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    m0a0Var = new k0a0(IconType.ADD_CARD_V2);
                }
            } else {
                if (vi0Var instanceof nk0) {
                    iq51 Y = this.a.c().B.Y(((nk0) vi0Var).a);
                    if (Y != null && (drawable = Y.c) != null) {
                        k0a0Var = new j0a0(drawable);
                    }
                } else if (!(vi0Var instanceof of0)) {
                    w511.b();
                    return null;
                }
                m0a0Var = null;
            }
            Function s = jx81.s(m0a0Var);
            if (!(vi0Var instanceof mf0)) {
                return new r0a0(((mf0) vi0Var).a(), s, 0, 0, 28);
            }
            if (vi0Var instanceof mk0) {
                return new r0a0(((mk0) vi0Var).a(), s, 0, 0, 28);
            }
            if (vi0Var instanceof bg0) {
                return new r0a0(((bg0) vi0Var).a(), s, 0, 0, 28);
            }
            if (vi0Var instanceof kd0) {
                return new r0a0(((kd0) vi0Var).a(), s, 0, 0, 28);
            }
            if (vi0Var instanceof df0) {
                return new r0a0(((df0) vi0Var).a(), s, 0, 0, 28);
            }
            if (vi0Var instanceof mj0) {
                int c = ((avj0) this.b).c(utg0.sbp_token_icon_width);
                return new r0a0(((mj0) vi0Var).d, s, c, c, 16);
            }
            if ((vi0Var instanceof nk0) || (vi0Var instanceof na0) || (vi0Var instanceof ogz0) || (vi0Var instanceof of0) || (vi0Var instanceof bk0) || (vi0Var instanceof ck0) || (vi0Var instanceof nj0)) {
                return new q0a0(null, s);
            }
            w511.b();
            return null;
        }
        k0a0Var = new k0a0(IconType.ADD_CARD_V2);
        m0a0Var = k0a0Var;
        Function s2 = jx81.s(m0a0Var);
        if (!(vi0Var instanceof mf0)) {
        }
    }

    public final t0a0 d(lea0 lea0Var) {
        k0a0 k0a0Var;
        k0a0 k0a0Var2;
        String str;
        PaymentMethodsCashIconExperiment.CurrencyDescription currencyDescription;
        if (lea0Var instanceof fl8) {
            fl8 fl8Var = (fl8) lea0Var;
            if (fl8Var.k != null) {
                k0a0Var = oe91.b();
            } else {
                k0a0Var2 = new k0a0(oe91.c(fl8Var.e));
                k0a0Var = k0a0Var2;
            }
        } else if (lea0Var instanceof t19) {
            k0a0Var = new k0a0(IconType.CASH_LIKE);
        } else {
            if (lea0Var instanceof u19) {
                k0a0Var2 = new k0a0(IconType.CASH);
            } else if (lea0Var instanceof jve) {
                k0a0Var = new k0a0(IconType.CORP);
            } else if (lea0Var instanceof yhi) {
                int i = i0a0.a[((yhi) lea0Var).f().c().ordinal()];
                if (i == 1) {
                    k0a0Var = new k0a0(IconType.CARGO_CORP);
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    k0a0Var = new k0a0(IconType.GENERIC_CARD);
                }
            } else if (lea0Var instanceof ivt) {
                k0a0Var2 = new k0a0(IconType.GOOGLE_PAY);
            } else if (lea0Var instanceof a000) {
                k0a0Var = new k0a0(IconType.MBANK_ACCOUNT);
            } else if (lea0Var instanceof h8b0) {
                k0a0Var2 = new k0a0(IconType.PERSONAL_WALLET_NEW);
            } else if (lea0Var instanceof bjm0) {
                k0a0Var2 = new k0a0(IconType.SBP_TOKEN);
            } else if (lea0Var instanceof ep51) {
                k0a0Var2 = new k0a0(IconType.YAPE_TOKEN);
            } else if (lea0Var instanceof um50) {
                k0a0Var2 = new k0a0(IconType.NEQUI_TOKEN);
            } else if (lea0Var instanceof cfm0) {
                k0a0Var2 = new k0a0(IconType.SBP_BIND_TOKEN);
            } else if (lea0Var instanceof qgx) {
                k0a0Var2 = new k0a0(IconType.KASPI);
            } else if (lea0Var instanceof p1c) {
                k0a0Var2 = new k0a0(IconType.CASH_LIKE);
            } else if (lea0Var instanceof vbn) {
                k0a0Var2 = new k0a0(IconType.CASH_LIKE);
            } else if (lea0Var instanceof mcp) {
                k0a0Var2 = new k0a0(IconType.FASTSHIFT_ACCOUNT);
            } else if (lea0Var instanceof v7x) {
                k0a0Var2 = new k0a0(IconType.JAZZCASH_WALLET);
            } else if (lea0Var instanceof snr0) {
                int i2 = w0a0.b[((snr0) lea0Var).h().ordinal()];
                if (i2 == 1) {
                    k0a0Var = new k0a0(IconType.SHARED_FAMILY);
                } else if (i2 == 2) {
                    k0a0Var = new k0a0(IconType.SHARED_FAMILY);
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    k0a0Var = new k0a0(IconType.SHARED_BUSINESS);
                }
            } else if (lea0Var instanceof d111) {
                k0a0Var2 = jl40.l(((d111) lea0Var).h(), "TROIKA CARD") ? new k0a0(IconType.TROYKA_CARD) : new k0a0(IconType.TRANSPORT_CARD);
            } else if (lea0Var instanceof jo51) {
                k0a0Var2 = new k0a0(IconType.YANGO_WALLET);
            } else if (lea0Var instanceof yy51) {
                k0a0Var2 = new k0a0(IconType.GENERIC_CARD);
            } else if (lea0Var instanceof h211) {
                k0a0Var2 = new k0a0(IconType.GENERIC_CARD);
            } else {
                if (!(lea0Var instanceof wxc)) {
                    w511.b();
                    return null;
                }
                k0a0Var = null;
            }
            k0a0Var = k0a0Var2;
        }
        Function s = jx81.s(k0a0Var);
        if (lea0Var instanceof fl8) {
            fl8 fl8Var2 = (fl8) lea0Var;
            el8 el8Var = fl8Var2.k;
            if (el8Var == null) {
                return new n0a0(fl8Var2.i, s);
            }
            String a = el8Var.a();
            return a != null ? new r0a0(a, s, 0, 0, 28) : new q0a0(null, s);
        }
        if (lea0Var instanceof yy51) {
            return new n0a0(((yy51) lea0Var).f(), s);
        }
        if (lea0Var instanceof bjm0) {
            return new p0a0(((bjm0) lea0Var).f(), s);
        }
        if (lea0Var instanceof ep51) {
            return new r0a0(((ep51) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof um50) {
            return new r0a0(((um50) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof cfm0) {
            return new r0a0(((cfm0) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof qgx) {
            return new r0a0(((qgx) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof p1c) {
            return new r0a0(((p1c) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof vbn) {
            return new r0a0(((vbn) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof v7x) {
            return new r0a0(((v7x) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof mcp) {
            return new r0a0(((mcp) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof t19) {
            return new r0a0(((t19) lea0Var).f(), s, 0, 0, 28);
        }
        if (lea0Var instanceof u19) {
            u19 u19Var = (u19) lea0Var;
            PaymentMethodsCashIconExperiment paymentMethodsCashIconExperiment = (PaymentMethodsCashIconExperiment) this.c.c();
            if (paymentMethodsCashIconExperiment.b && (str = u19Var.a) != null && (currencyDescription = (PaymentMethodsCashIconExperiment.CurrencyDescription) i(str, paymentMethodsCashIconExperiment.c)) != null) {
                return g(currencyDescription.b, null);
            }
            return h();
        }
        if ((lea0Var instanceof wxc) || (lea0Var instanceof jve) || (lea0Var instanceof yhi) || (lea0Var instanceof ivt) || (lea0Var instanceof a000) || (lea0Var instanceof h8b0) || (lea0Var instanceof snr0) || (lea0Var instanceof d111) || (lea0Var instanceof jo51)) {
            return new q0a0(null, s);
        }
        if (lea0Var instanceof h211) {
            return new r0a0(((h211) lea0Var).f(), s, 0, 0, 28);
        }
        w511.b();
        return null;
    }

    public final t0a0 e(PaymentIconInfoType paymentIconInfoType, String str, Function function) {
        int i = w0a0.a[paymentIconInfoType.ordinal()];
        if (i == 1) {
            return new n0a0(str, function);
        }
        if (i == 2) {
            return new p0a0(str, function);
        }
        if (i == 3) {
            return new r0a0(str, function, 0, 0, 28);
        }
        if (i == 4) {
            return new s0a0(str, function);
        }
        w511.b();
        return null;
    }

    public final q0a0 f(Function function) {
        return new q0a0(null, function);
    }

    public final t0a0 g(String str, String str2) {
        return (str == null || evu0.J(str)) ? h() : new r0a0(str, jx81.s(new k0a0(IconType.CASH)), ((Number) this.d.getValue()).intValue(), ((Number) this.e.getValue()).intValue(), str2);
    }
}
