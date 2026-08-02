package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import com.yandex.go.payments.paymentlist.ui.YangoPayListItemOption$SwitchMode;
import com.yandex.go.yb.data.u;
import defpackage.a000;
import defpackage.avj0;
import defpackage.bfa0;
import defpackage.bjm0;
import defpackage.bw90;
import defpackage.c6a0;
import defpackage.cdc;
import defpackage.cf70;
import defpackage.ct51;
import defpackage.cxq0;
import defpackage.dt51;
import defpackage.egh;
import defpackage.ep51;
import defpackage.eq51;
import defpackage.et51;
import defpackage.fl8;
import defpackage.ft51;
import defpackage.g6a0;
import defpackage.go51;
import defpackage.gt51;
import defpackage.iq51;
import defpackage.j4a0;
import defpackage.jl40;
import defpackage.jo51;
import defpackage.jve;
import defpackage.kyh0;
import defpackage.l9a0;
import defpackage.mj0;
import defpackage.mqg0;
import defpackage.na0;
import defpackage.nea0;
import defpackage.ngz0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.om10;
import defpackage.pmn;
import defpackage.qje;
import defpackage.rhq0;
import defpackage.s65;
import defpackage.s9a0;
import defpackage.snr0;
import defpackage.t0a0;
import defpackage.t19;
import defpackage.t5a0;
import defpackage.tv51;
import defpackage.u0a0;
import defpackage.u0k;
import defpackage.um50;
import defpackage.uv51;
import defpackage.v7x;
import defpackage.vy91;
import defpackage.whi;
import defpackage.xng0;
import defpackage.xw91;
import defpackage.yhi;
import defpackage.yy51;
import defpackage.zea0;
import defpackage.znj;
import defpackage.zs51;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.yangopay.wallet.YangoPayInfoProvider$Place;

/* loaded from: classes13.dex */
public final class d extends s65 {
    public final zuj0 c;
    public final l9a0 d;
    public final cxq0 e;
    public final om10 f;
    public final u0a0 g;
    public final j h;
    public final znj i;
    public final eq51 j;
    public final u k;
    public final int l;
    public final int m;

    public d(s9a0 s9a0Var, pmn pmnVar, zuj0 zuj0Var, l9a0 l9a0Var, cxq0 cxq0Var, om10 om10Var, u0a0 u0a0Var, j jVar, znj znjVar, eq51 eq51Var, u uVar) {
        super(s9a0Var, pmnVar);
        this.c = zuj0Var;
        this.d = l9a0Var;
        this.e = cxq0Var;
        this.f = om10Var;
        this.g = u0a0Var;
        this.h = jVar;
        this.i = znjVar;
        this.j = eq51Var;
        this.k = uVar;
        avj0 avj0Var = (avj0) zuj0Var;
        this.l = qje.t(xng0.error, avj0Var.a);
        this.m = avj0Var.a(mqg0.component_gray_300);
    }

    public static /* synthetic */ Object h(d dVar, nea0 nea0Var, u0k u0kVar, DividerType dividerType, cf70 cf70Var, PaymentOptionState paymentOptionState, c6a0 c6a0Var, Continuation continuation, int i) {
        if ((i & 16) != 0) {
            paymentOptionState = PaymentOptionState.NONE;
        }
        return dVar.g(u0kVar, dividerType, cf70Var, paymentOptionState, null, c6a0Var, (ContinuationImpl) continuation);
    }

    @Override // defpackage.s65
    public final Object a(nea0 nea0Var, rhq0 rhq0Var, boolean z, bfa0 bfa0Var, Continuation continuation) {
        xw91 xw91Var = xw91.C;
        u0k u0kVar = nea0Var.a;
        bw90 bw90Var = nea0Var.b;
        DividerType dividerType = z ? DividerType.ICON_MARGIN : DividerType.NONE;
        j4a0 u = this.e.u(u0kVar, false);
        boolean z2 = u0kVar instanceof na0;
        zuj0 zuj0Var = this.c;
        om10 om10Var = this.f;
        if (z2) {
            u0k u0kVar2 = (na0) u0kVar;
            cf70 cf70Var = new cf70(jl40.l(bw90Var, xw91Var) ? null : ((avj0) zuj0Var).h(kyh0.max_cards_reached_add_card_disabled_reason), l(nea0Var));
            PaymentOptionState paymentOptionState = PaymentOptionState.CLICKABLE;
            om10Var.getClass();
            Object g = g(u0kVar2, dividerType, cf70Var, paymentOptionState, u, om10.a(nea0Var), (ContinuationImpl) continuation);
            return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : (g6a0) g;
        }
        if (u0kVar instanceof snr0) {
            snr0 snr0Var = (snr0) u0kVar;
            cf70 cf70Var2 = new cf70(snr0Var.d, l(nea0Var));
            om10Var.getClass();
            Object h = h(this, nea0Var, snr0Var, dividerType, cf70Var2, null, om10.a(nea0Var), continuation, 48);
            return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : (g6a0) h;
        }
        if (u0kVar instanceof jo51) {
            go51 j = j((jo51) u0kVar, (ContinuationImpl) continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return j;
        }
        if (u0kVar instanceof yy51) {
            Object k = k(nea0Var, (yy51) u0kVar, dividerType, (ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : (g6a0) k;
        }
        if (u0kVar instanceof nk0) {
            Object f = f(nea0Var, (nk0) u0kVar, dividerType, (ContinuationImpl) continuation);
            return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : (g6a0) f;
        }
        if (u0kVar instanceof jve) {
            jve jveVar = (jve) u0kVar;
            cf70 cf70Var3 = new cf70(jveVar.d, l(nea0Var));
            om10Var.getClass();
            Object h2 = h(this, nea0Var, jveVar, dividerType, cf70Var3, null, om10.a(nea0Var), continuation, 48);
            return h2 == CoroutineSingletons.COROUTINE_SUSPENDED ? h2 : (g6a0) h2;
        }
        if (u0kVar instanceof bjm0) {
            bjm0 bjm0Var = (bjm0) u0kVar;
            cf70 cf70Var4 = new cf70((bjm0Var.c || !jl40.l(bw90Var, xw91Var)) ? bjm0Var.g : ((avj0) zuj0Var).h(kyh0.payment_antifraud_verify), l(nea0Var));
            DividerType dividerType2 = dividerType;
            PaymentOptionState paymentOptionState2 = PaymentOptionState.CLICKABLE;
            om10Var.getClass();
            Object h3 = h(this, nea0Var, bjm0Var, dividerType2, cf70Var4, paymentOptionState2, om10.a(nea0Var), continuation, 32);
            return h3 == CoroutineSingletons.COROUTINE_SUSPENDED ? h3 : (g6a0) h3;
        }
        DividerType dividerType3 = dividerType;
        if (u0kVar instanceof mj0) {
            mj0 mj0Var = (mj0) u0kVar;
            cf70 cf70Var5 = new cf70(mj0Var.c, l(nea0Var));
            PaymentOptionState paymentOptionState3 = PaymentOptionState.CLICKABLE;
            om10Var.getClass();
            Object g2 = g(mj0Var, dividerType3, cf70Var5, paymentOptionState3, u, om10.a(nea0Var), (ContinuationImpl) continuation);
            return g2 == CoroutineSingletons.COROUTINE_SUSPENDED ? g2 : (g6a0) g2;
        }
        if (u0kVar instanceof t19) {
            t19 t19Var = (t19) u0kVar;
            cf70 cf70Var6 = new cf70(t19Var.e, l(nea0Var));
            om10Var.getClass();
            Object h4 = h(this, nea0Var, t19Var, dividerType3, cf70Var6, null, om10.a(nea0Var), continuation, 48);
            return h4 == CoroutineSingletons.COROUTINE_SUSPENDED ? h4 : (g6a0) h4;
        }
        if (u0kVar instanceof yhi) {
            yhi yhiVar = (yhi) u0kVar;
            whi whiVar = yhiVar.c.d;
            cf70 cf70Var7 = new cf70(whiVar != null ? whiVar.b : null, l(nea0Var));
            om10Var.getClass();
            Object h5 = h(this, nea0Var, yhiVar, dividerType3, cf70Var7, null, om10.a(nea0Var), continuation, 48);
            return h5 == CoroutineSingletons.COROUTINE_SUSPENDED ? h5 : (g6a0) h5;
        }
        if (u0kVar instanceof ogz0) {
            Object i = i(nea0Var, (ogz0) u0kVar, (ContinuationImpl) continuation);
            return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : (g6a0) i;
        }
        if (u0kVar instanceof of0) {
            of0 of0Var = (of0) u0kVar;
            cf70 cf70Var8 = new cf70(of0Var.b, l(nea0Var));
            om10Var.getClass();
            Object h6 = h(this, nea0Var, of0Var, dividerType3, cf70Var8, null, om10.a(nea0Var), continuation, 48);
            return h6 == CoroutineSingletons.COROUTINE_SUSPENDED ? h6 : (g6a0) h6;
        }
        u0k u0kVar3 = nea0Var.a;
        if (u0kVar3 instanceof a000) {
            a000 a000Var = (a000) u0kVar3;
            r9 = m(nea0Var, a000Var.c, a000Var.e);
        } else if (u0kVar3 instanceof ep51) {
            ep51 ep51Var = (ep51) u0kVar3;
            r9 = m(nea0Var, ep51Var.c, ep51Var.e);
        } else if (u0kVar3 instanceof um50) {
            um50 um50Var = (um50) u0kVar3;
            r9 = m(nea0Var, um50Var.c, um50Var.e);
        } else if (u0kVar3 instanceof v7x) {
            v7x v7xVar = (v7x) u0kVar3;
            r9 = m(nea0Var, v7xVar.c, v7xVar.e);
        }
        cf70 cf70Var9 = new cf70(r9, l(nea0Var));
        om10Var.getClass();
        Object h7 = h(this, nea0Var, u0kVar, dividerType3, cf70Var9, null, om10.a(nea0Var), continuation, 48);
        return h7 == CoroutineSingletons.COROUTINE_SUSPENDED ? h7 : (g6a0) h7;
    }

    @Override // defpackage.s65
    public final Object b(Continuation continuation) {
        return ((com.yandex.go.payments.paymentlist.ui.b) this.d).f((ContinuationImpl) continuation);
    }

    @Override // defpackage.s65
    public final bfa0 c(nea0 nea0Var) {
        return zea0.a;
    }

    @Override // defpackage.s65
    public final boolean e(nea0 nea0Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [ft51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(nea0 nea0Var, nk0 nk0Var, DividerType dividerType, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsMapper$convertToCreateYandexOption$1 menuPaymentOptionsMapper$convertToCreateYandexOption$1;
        int i;
        cf70 cf70Var;
        PaymentOptionState paymentOptionState;
        nk0 nk0Var2;
        DividerType dividerType2;
        dt51 dt51Var;
        if (continuationImpl instanceof MenuPaymentOptionsMapper$convertToCreateYandexOption$1) {
            menuPaymentOptionsMapper$convertToCreateYandexOption$1 = (MenuPaymentOptionsMapper$convertToCreateYandexOption$1) continuationImpl;
            int i2 = menuPaymentOptionsMapper$convertToCreateYandexOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsMapper$convertToCreateYandexOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsMapper$convertToCreateYandexOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsMapper$convertToCreateYandexOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = this.k;
                    iq51 Y = uVar.c().B.Y(nk0Var.a);
                    if (Y == null) {
                        return null;
                    }
                    cf70 cf70Var2 = new cf70(Y.b, l(nea0Var));
                    PaymentOptionState paymentOptionState2 = PaymentOptionState.CLICKABLE;
                    tv51 tv51Var = Y.d;
                    dt51 dt51Var2 = new dt51(new zs51(tv51Var.a, tv51Var.b, tv51Var));
                    j jVar = this.h;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$0 = nea0Var;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$1 = nk0Var;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$2 = dividerType;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$3 = null;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$4 = cf70Var2;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$5 = paymentOptionState2;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$6 = dt51Var2;
                    menuPaymentOptionsMapper$convertToCreateYandexOption$1.label = 1;
                    Object b = jVar.b(nk0Var, menuPaymentOptionsMapper$convertToCreateYandexOption$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cf70Var = cf70Var2;
                    paymentOptionState = paymentOptionState2;
                    nk0Var2 = nk0Var;
                    dividerType2 = dividerType;
                    dt51Var = dt51Var2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r10 = (ft51) menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$6;
                    PaymentOptionState paymentOptionState3 = (PaymentOptionState) menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$5;
                    cf70 cf70Var3 = (cf70) menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$4;
                    DividerType dividerType3 = (DividerType) menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$2;
                    nk0 nk0Var3 = (nk0) menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$1;
                    nea0 nea0Var2 = (nea0) menuPaymentOptionsMapper$convertToCreateYandexOption$1.L$0;
                    kotlin.b.b(obj);
                    dt51Var = r10;
                    cf70Var = cf70Var3;
                    nea0Var = nea0Var2;
                    dividerType2 = dividerType3;
                    nk0Var2 = nk0Var3;
                    paymentOptionState = paymentOptionState3;
                }
                t0a0 c = ((com.yandex.go.payments.common.a) this.g).c(nk0Var2);
                this.f.getClass();
                return new gt51(nk0Var2, paymentOptionState, dividerType2, (CharSequence) obj, cf70Var, c, dt51Var, om10.a(nea0Var));
            }
        }
        menuPaymentOptionsMapper$convertToCreateYandexOption$1 = new MenuPaymentOptionsMapper$convertToCreateYandexOption$1(this, continuationImpl);
        Object obj2 = menuPaymentOptionsMapper$convertToCreateYandexOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsMapper$convertToCreateYandexOption$1.label;
        if (i != 0) {
        }
        t0a0 c2 = ((com.yandex.go.payments.common.a) this.g).c(nk0Var2);
        this.f.getClass();
        return new gt51(nk0Var2, paymentOptionState, dividerType2, (CharSequence) obj2, cf70Var, c2, dt51Var, om10.a(nea0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(u0k u0kVar, DividerType dividerType, cf70 cf70Var, PaymentOptionState paymentOptionState, j4a0 j4a0Var, c6a0 c6a0Var, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsMapper$convertToDefaultOption$1 menuPaymentOptionsMapper$convertToDefaultOption$1;
        int i;
        u0k u0kVar2;
        j4a0 j4a0Var2;
        c6a0 c6a0Var2;
        PaymentOptionState paymentOptionState2;
        int i2;
        int i3;
        DividerType dividerType2;
        cf70 cf70Var2;
        if (continuationImpl instanceof MenuPaymentOptionsMapper$convertToDefaultOption$1) {
            menuPaymentOptionsMapper$convertToDefaultOption$1 = (MenuPaymentOptionsMapper$convertToDefaultOption$1) continuationImpl;
            int i4 = menuPaymentOptionsMapper$convertToDefaultOption$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsMapper$convertToDefaultOption$1.label = i4 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsMapper$convertToDefaultOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsMapper$convertToDefaultOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$0 = null;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$1 = u0kVar;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$2 = null;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$3 = null;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$4 = null;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$5 = j4a0Var;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$6 = c6a0Var;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$7 = paymentOptionState;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$8 = dividerType;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.L$9 = cf70Var;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.I$0 = 1;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.I$1 = 1;
                    menuPaymentOptionsMapper$convertToDefaultOption$1.label = 1;
                    Object b = this.h.b(u0kVar, menuPaymentOptionsMapper$convertToDefaultOption$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    u0kVar2 = u0kVar;
                    j4a0Var2 = j4a0Var;
                    obj = b;
                    c6a0Var2 = c6a0Var;
                    paymentOptionState2 = paymentOptionState;
                    i2 = 1;
                    i3 = 1;
                    dividerType2 = dividerType;
                    cf70Var2 = cf70Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = menuPaymentOptionsMapper$convertToDefaultOption$1.I$1;
                    i3 = menuPaymentOptionsMapper$convertToDefaultOption$1.I$0;
                    cf70 cf70Var3 = (cf70) menuPaymentOptionsMapper$convertToDefaultOption$1.L$9;
                    DividerType dividerType3 = (DividerType) menuPaymentOptionsMapper$convertToDefaultOption$1.L$8;
                    PaymentOptionState paymentOptionState3 = (PaymentOptionState) menuPaymentOptionsMapper$convertToDefaultOption$1.L$7;
                    c6a0 c6a0Var3 = (c6a0) menuPaymentOptionsMapper$convertToDefaultOption$1.L$6;
                    j4a0 j4a0Var3 = (j4a0) menuPaymentOptionsMapper$convertToDefaultOption$1.L$5;
                    u0kVar2 = (u0k) menuPaymentOptionsMapper$convertToDefaultOption$1.L$1;
                    kotlin.b.b(obj);
                    cf70Var2 = cf70Var3;
                    dividerType2 = dividerType3;
                    paymentOptionState2 = paymentOptionState3;
                    c6a0Var2 = c6a0Var3;
                    j4a0Var2 = j4a0Var3;
                }
                CharSequence charSequence = (CharSequence) obj;
                t0a0 a = u0a0.a(this.g, u0kVar2);
                boolean z = i3 == 0;
                boolean z2 = i2 == 0;
                t5a0 t5a0Var = t5a0.a;
                return new egh(paymentOptionState2, dividerType2, z, cf70Var2, z2, charSequence, a, j4a0Var2, c6a0Var2, false, t5a0Var, t5a0Var, t5a0Var, t5a0Var);
            }
        }
        menuPaymentOptionsMapper$convertToDefaultOption$1 = new MenuPaymentOptionsMapper$convertToDefaultOption$1(this, continuationImpl);
        Object obj2 = menuPaymentOptionsMapper$convertToDefaultOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsMapper$convertToDefaultOption$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        t0a0 a2 = u0a0.a(this.g, u0kVar2);
        if (i3 == 0) {
        }
        if (i2 == 0) {
        }
        t5a0 t5a0Var2 = t5a0.a;
        return new egh(paymentOptionState2, dividerType2, z, cf70Var2, z2, charSequence2, a2, j4a0Var2, c6a0Var2, false, t5a0Var2, t5a0Var2, t5a0Var2, t5a0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(nea0 nea0Var, ogz0 ogz0Var, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsMapper$convertToTipsOption$1 menuPaymentOptionsMapper$convertToTipsOption$1;
        int i;
        ogz0 ogz0Var2;
        cf70 cf70Var;
        int i2;
        PaymentOptionState paymentOptionState;
        if (continuationImpl instanceof MenuPaymentOptionsMapper$convertToTipsOption$1) {
            menuPaymentOptionsMapper$convertToTipsOption$1 = (MenuPaymentOptionsMapper$convertToTipsOption$1) continuationImpl;
            int i3 = menuPaymentOptionsMapper$convertToTipsOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsMapper$convertToTipsOption$1.label = i3 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsMapper$convertToTipsOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsMapper$convertToTipsOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentOptionState paymentOptionState2 = PaymentOptionState.CLICKABLE;
                    cf70 cf70Var2 = new cf70(null, l(nea0Var));
                    int i4 = ogz0Var.a;
                    menuPaymentOptionsMapper$convertToTipsOption$1.L$0 = nea0Var;
                    menuPaymentOptionsMapper$convertToTipsOption$1.L$1 = ogz0Var;
                    menuPaymentOptionsMapper$convertToTipsOption$1.L$2 = paymentOptionState2;
                    menuPaymentOptionsMapper$convertToTipsOption$1.L$3 = cf70Var2;
                    menuPaymentOptionsMapper$convertToTipsOption$1.I$0 = i4;
                    menuPaymentOptionsMapper$convertToTipsOption$1.label = 1;
                    Object b = this.h.b(ogz0Var, menuPaymentOptionsMapper$convertToTipsOption$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ogz0Var2 = ogz0Var;
                    cf70Var = cf70Var2;
                    i2 = i4;
                    paymentOptionState = paymentOptionState2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = menuPaymentOptionsMapper$convertToTipsOption$1.I$0;
                    cf70 cf70Var3 = (cf70) menuPaymentOptionsMapper$convertToTipsOption$1.L$3;
                    PaymentOptionState paymentOptionState3 = (PaymentOptionState) menuPaymentOptionsMapper$convertToTipsOption$1.L$2;
                    ogz0 ogz0Var3 = (ogz0) menuPaymentOptionsMapper$convertToTipsOption$1.L$1;
                    nea0 nea0Var2 = (nea0) menuPaymentOptionsMapper$convertToTipsOption$1.L$0;
                    kotlin.b.b(obj);
                    paymentOptionState = paymentOptionState3;
                    ogz0Var2 = ogz0Var3;
                    i2 = i5;
                    cf70Var = cf70Var3;
                    nea0Var = nea0Var2;
                }
                t0a0 c = ((com.yandex.go.payments.common.a) this.g).c(ogz0Var2);
                this.f.getClass();
                return new ngz0(ogz0Var2, paymentOptionState, true, (CharSequence) obj, cf70Var, true, i2, true, c, om10.a(nea0Var));
            }
        }
        menuPaymentOptionsMapper$convertToTipsOption$1 = new MenuPaymentOptionsMapper$convertToTipsOption$1(this, continuationImpl);
        Object obj2 = menuPaymentOptionsMapper$convertToTipsOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsMapper$convertToTipsOption$1.label;
        if (i != 0) {
        }
        t0a0 c2 = ((com.yandex.go.payments.common.a) this.g).c(ogz0Var2);
        this.f.getClass();
        return new ngz0(ogz0Var2, paymentOptionState, true, (CharSequence) obj2, cf70Var, true, i2, true, c2, om10.a(nea0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final go51 j(jo51 jo51Var, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsMapper$convertToYangoPayOption$1 menuPaymentOptionsMapper$convertToYangoPayOption$1;
        int i;
        if (continuationImpl instanceof MenuPaymentOptionsMapper$convertToYangoPayOption$1) {
            menuPaymentOptionsMapper$convertToYangoPayOption$1 = (MenuPaymentOptionsMapper$convertToYangoPayOption$1) continuationImpl;
            int i2 = menuPaymentOptionsMapper$convertToYangoPayOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsMapper$convertToYangoPayOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsMapper$convertToYangoPayOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsMapper$convertToYangoPayOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (vy91.f(jo51Var) == null) {
                        return null;
                    }
                    YangoPayInfoProvider$Place yangoPayInfoProvider$Place = YangoPayInfoProvider$Place.PAYMENT_METHODS;
                    this.i.getClass();
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = menuPaymentOptionsMapper$convertToYangoPayOption$1.Z$0;
                PaymentOptionState paymentOptionState = (PaymentOptionState) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$9;
                t0a0 t0a0Var = (t0a0) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$8;
                cf70 cf70Var = (cf70) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$7;
                YangoPayListItemOption$SwitchMode yangoPayListItemOption$SwitchMode = (YangoPayListItemOption$SwitchMode) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$5;
                if (menuPaymentOptionsMapper$convertToYangoPayOption$1.L$4 != null) {
                    ny61.u();
                    return null;
                }
                DividerType dividerType = (DividerType) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$2;
                jo51 jo51Var2 = (jo51) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$1;
                nea0 nea0Var = (nea0) menuPaymentOptionsMapper$convertToYangoPayOption$1.L$0;
                kotlin.b.b(obj);
                this.f.getClass();
                return new go51(jo51Var2, paymentOptionState, dividerType, true, z, t0a0Var, (CharSequence) obj, cf70Var, yangoPayListItemOption$SwitchMode, true, om10.a(nea0Var));
            }
        }
        menuPaymentOptionsMapper$convertToYangoPayOption$1 = new MenuPaymentOptionsMapper$convertToYangoPayOption$1(this, continuationImpl);
        Object obj2 = menuPaymentOptionsMapper$convertToYangoPayOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsMapper$convertToYangoPayOption$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(nea0 nea0Var, yy51 yy51Var, DividerType dividerType, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsMapper$convertToYbCardOption$1 menuPaymentOptionsMapper$convertToYbCardOption$1;
        int i;
        cf70 cf70Var;
        PaymentOptionState paymentOptionState;
        yy51 yy51Var2;
        DividerType dividerType2;
        ft51 ft51Var;
        if (continuationImpl instanceof MenuPaymentOptionsMapper$convertToYbCardOption$1) {
            menuPaymentOptionsMapper$convertToYbCardOption$1 = (MenuPaymentOptionsMapper$convertToYbCardOption$1) continuationImpl;
            int i2 = menuPaymentOptionsMapper$convertToYbCardOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsMapper$convertToYbCardOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsMapper$convertToYbCardOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsMapper$convertToYbCardOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uv51 a = this.j.a(yy51Var);
                    cf70Var = new cf70(a.c, l(nea0Var));
                    paymentOptionState = PaymentOptionState.NONE;
                    tv51 tv51Var = a.f;
                    tv51 tv51Var2 = a.g;
                    ft51 et51Var = (tv51Var == null || tv51Var2 == null) ? ct51.a : new et51(s65.d(a, tv51Var), s65.d(a, tv51Var2));
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$0 = nea0Var;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$1 = yy51Var;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$2 = dividerType;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$3 = null;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$4 = null;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$5 = cf70Var;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$6 = paymentOptionState;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.L$7 = et51Var;
                    menuPaymentOptionsMapper$convertToYbCardOption$1.label = 1;
                    Object b = this.h.b(yy51Var, menuPaymentOptionsMapper$convertToYbCardOption$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    yy51Var2 = yy51Var;
                    dividerType2 = dividerType;
                    ft51Var = et51Var;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ft51 ft51Var2 = (ft51) menuPaymentOptionsMapper$convertToYbCardOption$1.L$7;
                    PaymentOptionState paymentOptionState2 = (PaymentOptionState) menuPaymentOptionsMapper$convertToYbCardOption$1.L$6;
                    cf70 cf70Var2 = (cf70) menuPaymentOptionsMapper$convertToYbCardOption$1.L$5;
                    DividerType dividerType3 = (DividerType) menuPaymentOptionsMapper$convertToYbCardOption$1.L$2;
                    yy51 yy51Var3 = (yy51) menuPaymentOptionsMapper$convertToYbCardOption$1.L$1;
                    nea0 nea0Var2 = (nea0) menuPaymentOptionsMapper$convertToYbCardOption$1.L$0;
                    kotlin.b.b(obj);
                    ft51Var = ft51Var2;
                    cf70Var = cf70Var2;
                    nea0Var = nea0Var2;
                    dividerType2 = dividerType3;
                    yy51Var2 = yy51Var3;
                    paymentOptionState = paymentOptionState2;
                }
                t0a0 d = ((com.yandex.go.payments.common.a) this.g).d(yy51Var2);
                this.f.getClass();
                return new gt51(yy51Var2, paymentOptionState, dividerType2, (CharSequence) obj, cf70Var, d, ft51Var, om10.a(nea0Var));
            }
        }
        menuPaymentOptionsMapper$convertToYbCardOption$1 = new MenuPaymentOptionsMapper$convertToYbCardOption$1(this, continuationImpl);
        Object obj2 = menuPaymentOptionsMapper$convertToYbCardOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsMapper$convertToYbCardOption$1.label;
        if (i != 0) {
        }
        t0a0 d2 = ((com.yandex.go.payments.common.a) this.g).d(yy51Var2);
        this.f.getClass();
        return new gt51(yy51Var2, paymentOptionState, dividerType2, (CharSequence) obj2, cf70Var, d2, ft51Var, om10.a(nea0Var));
    }

    public final cdc l(nea0 nea0Var) {
        u0k u0kVar = nea0Var.a;
        boolean l = jl40.l(nea0Var.b, xw91.C);
        boolean z = u0kVar instanceof fl8;
        int i = this.l;
        if ((!z || ((fl8) u0kVar).c || !l) && ((!z || !((fl8) u0kVar).h) && ((!(u0kVar instanceof bjm0) || ((bjm0) u0kVar).c || !l) && ((!(u0kVar instanceof a000) || ((a000) u0kVar).c || !l) && ((!(u0kVar instanceof ep51) || ((ep51) u0kVar).c || !l) && ((!(u0kVar instanceof um50) || ((um50) u0kVar).c || !l) && ((!(u0kVar instanceof v7x) || ((v7x) u0kVar).c || !l) && !(u0kVar instanceof yhi)))))))) {
            i = this.m;
        }
        return new cdc(i);
    }

    public final String m(nea0 nea0Var, boolean z, String str) {
        if (z || !jl40.l(nea0Var.b, xw91.C)) {
            return str;
        }
        return ((avj0) this.c).h(kyh0.payment_antifraud_verify);
    }
}
