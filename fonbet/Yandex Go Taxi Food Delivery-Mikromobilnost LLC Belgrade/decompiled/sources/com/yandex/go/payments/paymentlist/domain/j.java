package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.domain.y;
import com.yandex.go.yb.data.u;
import defpackage.a000;
import defpackage.avj0;
import defpackage.bg0;
import defpackage.bjm0;
import defpackage.bk0;
import defpackage.cfm0;
import defpackage.ck0;
import defpackage.d111;
import defpackage.df0;
import defpackage.ep51;
import defpackage.eq51;
import defpackage.evu0;
import defpackage.f731;
import defpackage.fl8;
import defpackage.g8e;
import defpackage.h211;
import defpackage.h8b0;
import defpackage.iq51;
import defpackage.ivt;
import defpackage.jo51;
import defpackage.jve;
import defpackage.kd0;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.mcp;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.na0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.p1c;
import defpackage.q5z;
import defpackage.qeb1;
import defpackage.qgx;
import defpackage.se8;
import defpackage.snr0;
import defpackage.t19;
import defpackage.tma0;
import defpackage.tmr0;
import defpackage.u0k;
import defpackage.u19;
import defpackage.um50;
import defpackage.uma0;
import defpackage.v7x;
import defpackage.vbn;
import defpackage.vy91;
import defpackage.w511;
import defpackage.wxc;
import defpackage.xea0;
import defpackage.yhi;
import defpackage.yy51;
import defpackage.znj;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.yangopay.wallet.YangoPayInfoProvider$Place;

/* loaded from: classes8.dex */
public final class j {
    public final u a;
    public final zuj0 b;
    public final eq51 c;
    public final znj d;
    public final tma0 e;
    public final y f;

    public j(u uVar, zuj0 zuj0Var, eq51 eq51Var, znj znjVar, tma0 tma0Var, y yVar) {
        this.a = uVar;
        this.b = zuj0Var;
        this.c = eq51Var;
        this.d = znjVar;
        this.e = tma0Var;
        this.f = yVar;
    }

    public final CharSequence a(u0k u0kVar) {
        zuj0 zuj0Var = this.b;
        if (u0kVar instanceof fl8) {
            return ((uma0) this.e).b((fl8) u0kVar);
        }
        if (u0kVar instanceof jve) {
            return ((jve) u0kVar).g();
        }
        if (u0kVar instanceof snr0) {
            snr0 snr0Var = (snr0) u0kVar;
            String b = snr0Var.g().b();
            Integer S = q5z.S(snr0Var.g().a());
            return S != null ? qeb1.e(S.intValue(), b) : b;
        }
        if (u0kVar instanceof bjm0) {
            return ((bjm0) u0kVar).h();
        }
        if (u0kVar instanceof yhi) {
            return ((yhi) u0kVar).f().b();
        }
        if (u0kVar instanceof t19) {
            return ((t19) u0kVar).g();
        }
        if (u0kVar instanceof yy51) {
            return this.c.a((yy51) u0kVar).g();
        }
        if (u0kVar instanceof a000) {
            return ((a000) u0kVar).g();
        }
        if (u0kVar instanceof ep51) {
            return ((ep51) u0kVar).h();
        }
        if (u0kVar instanceof um50) {
            return ((um50) u0kVar).h();
        }
        if (u0kVar instanceof cfm0) {
            return ((cfm0) u0kVar).h();
        }
        if (u0kVar instanceof qgx) {
            return ((qgx) u0kVar).h();
        }
        if (u0kVar instanceof p1c) {
            return ((p1c) u0kVar).h();
        }
        if (u0kVar instanceof vbn) {
            return ((vbn) u0kVar).h();
        }
        if (u0kVar instanceof mcp) {
            return ((mcp) u0kVar).h();
        }
        if (u0kVar instanceof v7x) {
            return ((v7x) u0kVar).h();
        }
        if (u0kVar instanceof d111) {
            return ((d111) u0kVar).l();
        }
        if (u0kVar instanceof h8b0) {
            h8b0 h8b0Var = (h8b0) u0kVar;
            String str = h8b0Var.h.a;
            return str == null ? h8b0Var.c : str;
        }
        if (u0kVar instanceof u19) {
            return ((avj0) zuj0Var).h(kyh0.paymentmethod_cash_nominative);
        }
        if (u0kVar instanceof ivt) {
            return ((avj0) zuj0Var).h(kyh0.google_pay);
        }
        if (u0kVar instanceof nj0) {
            tmr0 tmr0Var = ((nj0) u0kVar).b;
            String str2 = tmr0Var.c;
            return (str2 == null || evu0.J(str2)) ? tmr0Var.b : str2;
        }
        if (u0kVar instanceof ogz0) {
            return ((avj0) zuj0Var).h(kyh0.tips_set_preferred_title);
        }
        if (u0kVar instanceof na0) {
            return ((avj0) zuj0Var).h(kyh0.credit_cards_add);
        }
        if (u0kVar instanceof mj0) {
            return ((mj0) u0kVar).b;
        }
        if (u0kVar instanceof mk0) {
            return ((mk0) u0kVar).d();
        }
        if (u0kVar instanceof bg0) {
            return ((bg0) u0kVar).d();
        }
        if (u0kVar instanceof kd0) {
            return ((kd0) u0kVar).d();
        }
        if (u0kVar instanceof df0) {
            return ((df0) u0kVar).d();
        }
        if (u0kVar instanceof mf0) {
            return ((mf0) u0kVar).d();
        }
        if (u0kVar instanceof of0) {
            return ((of0) u0kVar).b();
        }
        if (u0kVar instanceof bk0) {
            return ((bk0) u0kVar).b();
        }
        if (u0kVar instanceof ck0) {
            return ((ck0) u0kVar).c();
        }
        if (u0kVar instanceof h211) {
            return ((h211) u0kVar).h();
        }
        if (u0kVar instanceof nk0) {
            iq51 Y = this.a.c().B.Y(((nk0) u0kVar).a);
            String str3 = Y != null ? Y.a : null;
            if (str3 != null) {
                return str3;
            }
        } else {
            if (u0kVar instanceof wxc) {
                return ((avj0) zuj0Var).h(kyh0.loyalty_program_headline);
            }
            if (!(u0kVar instanceof jo51)) {
                w511.b();
                return null;
            }
            if (vy91.f((jo51) u0kVar) != null) {
                znj znjVar = this.d;
                YangoPayInfoProvider$Place yangoPayInfoProvider$Place = YangoPayInfoProvider$Place.PAYMENT_METHODS;
                znjVar.getClass();
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u0k u0kVar, ContinuationImpl continuationImpl) {
        PaymentMethodsListPaymentsTitleFactory$getPaymentTitle$1 paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsListPaymentsTitleFactory$getPaymentTitle$1) {
            paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1 = (PaymentMethodsListPaymentsTitleFactory$getPaymentTitle$1) continuationImpl;
            int i2 = paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.L$0 = u0kVar;
                    paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.label = 1;
                    obj = c(u0kVar, paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u0kVar = (u0k) paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? a(u0kVar) : charSequence;
            }
        }
        paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1 = new PaymentMethodsListPaymentsTitleFactory$getPaymentTitle$1(this, continuationImpl);
        Object obj3 = paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsListPaymentsTitleFactory$getPaymentTitle$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj3;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(u0k u0kVar, ContinuationImpl continuationImpl) {
        PaymentMethodsListPaymentsTitleFactory$getSavedName$1 paymentMethodsListPaymentsTitleFactory$getSavedName$1;
        int i;
        String str;
        if (continuationImpl instanceof PaymentMethodsListPaymentsTitleFactory$getSavedName$1) {
            paymentMethodsListPaymentsTitleFactory$getSavedName$1 = (PaymentMethodsListPaymentsTitleFactory$getSavedName$1) continuationImpl;
            int i2 = paymentMethodsListPaymentsTitleFactory$getSavedName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsListPaymentsTitleFactory$getSavedName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsListPaymentsTitleFactory$getSavedName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsListPaymentsTitleFactory$getSavedName$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if ((u0kVar instanceof lea0) && ((u0kVar instanceof fl8) || (u0kVar instanceof bjm0))) {
                        PaymentMethod$Type c = ((lea0) u0kVar).c();
                        String id = ((f731) u0kVar).getId();
                        paymentMethodsListPaymentsTitleFactory$getSavedName$1.L$0 = u0kVar;
                        paymentMethodsListPaymentsTitleFactory$getSavedName$1.label = 1;
                        if (c == null || id == null || evu0.J(id)) {
                            obj = "";
                        } else {
                            obj = this.f.a(new xea0(id, c), paymentMethodsListPaymentsTitleFactory$getSavedName$1);
                        }
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u0kVar = (u0k) paymentMethodsListPaymentsTitleFactory$getSavedName$1.L$0;
                kotlin.b.b(obj);
                str = (String) obj;
                if (!evu0.J(str)) {
                    if (!(((lea0) u0kVar) instanceof fl8)) {
                        return str;
                    }
                    ((uma0) this.e).b.getClass();
                    return g8e.p(str, " ", se8.a(((fl8) u0kVar).d));
                }
                return null;
            }
        }
        paymentMethodsListPaymentsTitleFactory$getSavedName$1 = new PaymentMethodsListPaymentsTitleFactory$getSavedName$1(this, continuationImpl);
        Object obj2 = paymentMethodsListPaymentsTitleFactory$getSavedName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsListPaymentsTitleFactory$getSavedName$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (!evu0.J(str)) {
        }
        return null;
    }
}
