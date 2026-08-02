package com.yandex.go.payments.domain;

import android.content.Context;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.payment.PaymentInfo$PaymentInfoTitle;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import defpackage.ahv0;
import defpackage.avj0;
import defpackage.drd;
import defpackage.el8;
import defpackage.eq51;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.fl8;
import defpackage.g8e;
import defpackage.jst;
import defpackage.jx81;
import defpackage.k0a0;
import defpackage.kyh0;
import defpackage.lz90;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.o0a0;
import defpackage.oe91;
import defpackage.t0a0;
import defpackage.tje;
import defpackage.tma0;
import defpackage.u0a0;
import defpackage.u19;
import defpackage.uma0;
import defpackage.uv51;
import defpackage.uyz;
import defpackage.vit;
import defpackage.xku0;
import defpackage.xxc;
import defpackage.yy51;
import defpackage.zuj0;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class v {
    public final zuj0 a;
    public final fga0 b;
    public final xku0 c;
    public final Context d;
    public final eq51 e;
    public final ahv0 f;
    public final u0a0 g;
    public final tma0 h;
    public final drd i;
    public final vit j;
    public final p0 k;

    public v(zuj0 zuj0Var, fga0 fga0Var, xku0 xku0Var, Context context, eq51 eq51Var, ahv0 ahv0Var, u0a0 u0a0Var, tma0 tma0Var, drd drdVar, vit vitVar, p0 p0Var) {
        this.a = zuj0Var;
        this.b = fga0Var;
        this.c = xku0Var;
        this.d = context;
        this.e = eq51Var;
        this.f = ahv0Var;
        this.g = u0a0Var;
        this.h = tma0Var;
        this.i = drdVar;
        this.j = vitVar;
        this.k = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        PaymentInfoFactory$createCardPaymentInfo$1 paymentInfoFactory$createCardPaymentInfo$1;
        int i;
        String b;
        String str3;
        String str4;
        String str5;
        t0a0 e;
        t0a0 t0a0Var;
        String str6;
        String str7;
        String str8;
        t0a0 t0a0Var2;
        int i2;
        if (continuationImpl instanceof PaymentInfoFactory$createCardPaymentInfo$1) {
            paymentInfoFactory$createCardPaymentInfo$1 = (PaymentInfoFactory$createCardPaymentInfo$1) continuationImpl;
            int i3 = paymentInfoFactory$createCardPaymentInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                paymentInfoFactory$createCardPaymentInfo$1.label = i3 - Integer.MIN_VALUE;
                PaymentInfoFactory$createCardPaymentInfo$1 paymentInfoFactory$createCardPaymentInfo$12 = paymentInfoFactory$createCardPaymentInfo$1;
                Object obj = paymentInfoFactory$createCardPaymentInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentInfoFactory$createCardPaymentInfo$12.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fl8 a = str != null ? this.c.a(str) : null;
                    if (a == null) {
                        g8e.C("Unknown card on summary", jst.e);
                        str5 = null;
                        b = null;
                        str4 = null;
                        str3 = null;
                    } else {
                        boolean L = tje.L(this.d);
                        tma0 tma0Var = this.h;
                        String b2 = L ? ((uma0) tma0Var).b(a) : ((uma0) tma0Var).c(a);
                        b = ((uma0) tma0Var).b(a);
                        String str9 = a.e;
                        str3 = a.i;
                        str4 = b2;
                        str5 = str9;
                    }
                    u0a0 u0a0Var = this.g;
                    if (str4 == null || str4.length() == 0) {
                        return new m1a0(((avj0) this.a).h(kyh0.summary_payment_card), "", ((com.yandex.go.payments.common.a) u0a0Var).f(new uyz(IconType.GENERIC_CARD, i4)), o0a0.c, null, str2 != null, null);
                    }
                    k0a0 b3 = (a != null ? a.k : null) != null ? oe91.b() : str5 == null ? null : oe91.d(str5);
                    xxc c = this.i.c(str2);
                    el8 el8Var = a != null ? a.k : null;
                    if (el8Var != null) {
                        String a2 = el8Var.a();
                        e = a2 != null ? ((com.yandex.go.payments.common.a) u0a0Var).e(PaymentIconInfoType.ICON_TAG, a2, jx81.s(b3)) : ((com.yandex.go.payments.common.a) u0a0Var).f(jx81.s(b3));
                    } else {
                        e = ((com.yandex.go.payments.common.a) u0a0Var).e(PaymentIconInfoType.CARD_BANK_NAME, str3, jx81.s(b3));
                    }
                    t0a0Var = e;
                    String e2 = e(c);
                    t0a0 j = this.j.j(c);
                    int i5 = str2 != null ? 1 : 0;
                    PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.CARD;
                    paymentInfoFactory$createCardPaymentInfo$12.L$0 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$1 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$2 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$3 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$4 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$5 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$6 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$7 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$8 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$9 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$10 = null;
                    paymentInfoFactory$createCardPaymentInfo$12.L$11 = str4;
                    paymentInfoFactory$createCardPaymentInfo$12.L$12 = e2;
                    paymentInfoFactory$createCardPaymentInfo$12.L$13 = t0a0Var;
                    paymentInfoFactory$createCardPaymentInfo$12.L$14 = j;
                    paymentInfoFactory$createCardPaymentInfo$12.L$15 = b;
                    paymentInfoFactory$createCardPaymentInfo$12.I$0 = i5;
                    paymentInfoFactory$createCardPaymentInfo$12.label = 1;
                    obj = this.k.c(paymentMethod$Type, str, false, false, paymentInfoFactory$createCardPaymentInfo$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str6 = b;
                    str7 = str4;
                    str8 = e2;
                    t0a0Var2 = j;
                    i2 = i5;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = paymentInfoFactory$createCardPaymentInfo$12.I$0;
                    String str10 = (String) paymentInfoFactory$createCardPaymentInfo$12.L$15;
                    t0a0 t0a0Var3 = (t0a0) paymentInfoFactory$createCardPaymentInfo$12.L$14;
                    t0a0 t0a0Var4 = (t0a0) paymentInfoFactory$createCardPaymentInfo$12.L$13;
                    String str11 = (String) paymentInfoFactory$createCardPaymentInfo$12.L$12;
                    String str12 = (String) paymentInfoFactory$createCardPaymentInfo$12.L$11;
                    kotlin.b.b(obj);
                    str6 = str10;
                    t0a0Var2 = t0a0Var3;
                    t0a0Var = t0a0Var4;
                    str8 = str11;
                    str7 = str12;
                }
                return new m1a0(str7, str8, t0a0Var, t0a0Var2, str6, i2 == 0, (PaymentInfo$PaymentInfoTitle) obj);
            }
        }
        paymentInfoFactory$createCardPaymentInfo$1 = new PaymentInfoFactory$createCardPaymentInfo$1(this, continuationImpl);
        PaymentInfoFactory$createCardPaymentInfo$1 paymentInfoFactory$createCardPaymentInfo$122 = paymentInfoFactory$createCardPaymentInfo$1;
        Object obj2 = paymentInfoFactory$createCardPaymentInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentInfoFactory$createCardPaymentInfo$122.label;
        int i42 = 1;
        if (i != 0) {
        }
        return new m1a0(str7, str8, t0a0Var, t0a0Var2, str6, i2 == 0, (PaymentInfo$PaymentInfoTitle) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl, boolean z) {
        PaymentInfoFactory$createCashPaymentInfo$1 paymentInfoFactory$createCashPaymentInfo$1;
        int i;
        xxc c;
        u19 u19Var;
        xxc xxcVar;
        String str2 = str;
        if (continuationImpl instanceof PaymentInfoFactory$createCashPaymentInfo$1) {
            paymentInfoFactory$createCashPaymentInfo$1 = (PaymentInfoFactory$createCashPaymentInfo$1) continuationImpl;
            int i2 = paymentInfoFactory$createCashPaymentInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentInfoFactory$createCashPaymentInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentInfoFactory$createCashPaymentInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentInfoFactory$createCashPaymentInfo$1.label;
                t0a0 t0a0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c = this.i.c(str2);
                    xku0 xku0Var = this.c;
                    lz90 lz90Var = xku0Var.c;
                    PaymentMethods g = xku0Var.a.b.g();
                    lz90Var.getClass();
                    PaymentMethods.LocationInfo locationInfo = g.o;
                    u19Var = new u19(locationInfo != null ? locationInfo.b : null);
                    if (z) {
                        paymentInfoFactory$createCashPaymentInfo$1.L$0 = str2;
                        paymentInfoFactory$createCashPaymentInfo$1.L$1 = c;
                        paymentInfoFactory$createCashPaymentInfo$1.L$2 = u19Var;
                        paymentInfoFactory$createCashPaymentInfo$1.Z$0 = z;
                        paymentInfoFactory$createCashPaymentInfo$1.label = 1;
                        Object a = this.f.a(u19Var, paymentInfoFactory$createCashPaymentInfo$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        xxcVar = c;
                        obj = a;
                    }
                    return new m1a0(((avj0) this.a).h(kyh0.summary_payment_cash), e(c), t0a0Var == null ? ((com.yandex.go.payments.common.a) this.g).d(u19Var) : t0a0Var, this.j.j(c), null, str2 != null, null);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u19 u19Var2 = (u19) paymentInfoFactory$createCashPaymentInfo$1.L$2;
                xxcVar = (xxc) paymentInfoFactory$createCashPaymentInfo$1.L$1;
                String str3 = (String) paymentInfoFactory$createCashPaymentInfo$1.L$0;
                kotlin.b.b(obj);
                u19Var = u19Var2;
                str2 = str3;
                t0a0Var = (t0a0) obj;
                c = xxcVar;
                return new m1a0(((avj0) this.a).h(kyh0.summary_payment_cash), e(c), t0a0Var == null ? ((com.yandex.go.payments.common.a) this.g).d(u19Var) : t0a0Var, this.j.j(c), null, str2 != null, null);
            }
        }
        paymentInfoFactory$createCashPaymentInfo$1 = new PaymentInfoFactory$createCashPaymentInfo$1(this, continuationImpl);
        Object obj2 = paymentInfoFactory$createCashPaymentInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentInfoFactory$createCashPaymentInfo$1.label;
        t0a0 t0a0Var2 = null;
        if (i != 0) {
        }
        t0a0Var2 = (t0a0) obj2;
        c = xxcVar;
        return new m1a0(((avj0) this.a).h(kyh0.summary_payment_cash), e(c), t0a0Var2 == null ? ((com.yandex.go.payments.common.a) this.g).d(u19Var) : t0a0Var2, this.j.j(c), null, str2 != null, null);
    }

    public final m1a0 c(String str, IconType iconType) {
        return new m1a0(str, "", ((com.yandex.go.payments.common.a) this.g).f(new uyz(iconType, 1)), o0a0.c, null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        PaymentInfoFactory$createYbWalletPaymentInfo$1 paymentInfoFactory$createYbWalletPaymentInfo$1;
        int i;
        int i2;
        String str3;
        yy51 yy51Var;
        uv51 uv51Var;
        if (continuationImpl instanceof PaymentInfoFactory$createYbWalletPaymentInfo$1) {
            paymentInfoFactory$createYbWalletPaymentInfo$1 = (PaymentInfoFactory$createYbWalletPaymentInfo$1) continuationImpl;
            int i3 = paymentInfoFactory$createYbWalletPaymentInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                paymentInfoFactory$createYbWalletPaymentInfo$1.label = i3 - Integer.MIN_VALUE;
                PaymentInfoFactory$createYbWalletPaymentInfo$1 paymentInfoFactory$createYbWalletPaymentInfo$12 = paymentInfoFactory$createYbWalletPaymentInfo$1;
                Object obj = paymentInfoFactory$createYbWalletPaymentInfo$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentInfoFactory$createYbWalletPaymentInfo$12.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null || evu0.J(str)) {
                        return m1a0.h;
                    }
                    yy51 b = this.c.b(str);
                    if (b == null) {
                        g8e.B(jst.e, "FINTECH.WALLET_INFO", null, String.format("wallet with %s was requested but not found", Arrays.copyOf(new Object[]{str}, 1)), 2);
                        return m1a0.h;
                    }
                    uv51 a = this.e.a(b);
                    int i5 = str2 != null ? 1 : 0;
                    PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.L$0 = null;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.L$1 = str2;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.L$2 = b;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.L$3 = a;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.Z$0 = z;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.I$0 = i5;
                    paymentInfoFactory$createYbWalletPaymentInfo$12.label = 1;
                    boolean z2 = i5;
                    obj = this.k.c(paymentMethod$Type, str, z2, z, paymentInfoFactory$createYbWalletPaymentInfo$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    i2 = z2 ? 1 : 0;
                    str3 = str2;
                    yy51Var = b;
                    uv51Var = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = paymentInfoFactory$createYbWalletPaymentInfo$12.I$0;
                    uv51Var = (uv51) paymentInfoFactory$createYbWalletPaymentInfo$12.L$3;
                    yy51Var = (yy51) paymentInfoFactory$createYbWalletPaymentInfo$12.L$2;
                    str3 = (String) paymentInfoFactory$createYbWalletPaymentInfo$12.L$1;
                    kotlin.b.b(obj);
                }
                PaymentInfo$PaymentInfoTitle paymentInfo$PaymentInfoTitle = (PaymentInfo$PaymentInfoTitle) obj;
                xxc c = this.i.c(str3);
                return new m1a0(uv51Var.g(), e(c), ((com.yandex.go.payments.common.a) this.g).e(PaymentIconInfoType.CARD_BANK_NAME, yy51Var.f(), new uyz(IconType.GENERIC_CARD, i4)), this.j.j(c), null, i2 == 0, paymentInfo$PaymentInfoTitle);
            }
        }
        paymentInfoFactory$createYbWalletPaymentInfo$1 = new PaymentInfoFactory$createYbWalletPaymentInfo$1(this, continuationImpl);
        PaymentInfoFactory$createYbWalletPaymentInfo$1 paymentInfoFactory$createYbWalletPaymentInfo$122 = paymentInfoFactory$createYbWalletPaymentInfo$1;
        Object obj3 = paymentInfoFactory$createYbWalletPaymentInfo$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentInfoFactory$createYbWalletPaymentInfo$122.label;
        int i42 = 1;
        if (i != 0) {
        }
        PaymentInfo$PaymentInfoTitle paymentInfo$PaymentInfoTitle2 = (PaymentInfo$PaymentInfoTitle) obj3;
        xxc c2 = this.i.c(str3);
        return new m1a0(uv51Var.g(), e(c2), ((com.yandex.go.payments.common.a) this.g).e(PaymentIconInfoType.CARD_BANK_NAME, yy51Var.f(), new uyz(IconType.GENERIC_CARD, i42)), this.j.j(c2), null, i2 == 0, paymentInfo$PaymentInfoTitle2);
    }

    public final String e(xxc xxcVar) {
        String str = xxcVar != null ? xxcVar.c : null;
        if (str == null || evu0.J(str)) {
            return "";
        }
        return ((avj0) this.a).i(kyh0.composite_payment_subtitle, str);
    }
}
