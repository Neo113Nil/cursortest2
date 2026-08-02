package com.yandex.go.platform.payments.internal;

import android.content.Context;
import com.yandex.go.platform.sdk.models.PlatformEnvironment;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.MetricaInitMode;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import defpackage.a0a0;
import defpackage.a3a0;
import defpackage.c0a0;
import defpackage.evu0;
import defpackage.fk;
import defpackage.h2a0;
import defpackage.ivc0;
import defpackage.lwc0;
import defpackage.ny61;
import defpackage.tv90;
import defpackage.ylf;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final fk a;
    public final PlatformEnvironment b;
    public final ivc0 c;

    public a(fk fkVar, PlatformEnvironment platformEnvironment, ivc0 ivc0Var) {
        this.a = fkVar;
        this.b = platformEnvironment;
        this.c = ivc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, String str, String str2, ContinuationImpl continuationImpl) {
        PaymentKitFactory$createPaymentApi$1 paymentKitFactory$createPaymentApi$1;
        int i;
        Object b;
        String str3;
        tv90 tv90Var;
        if (continuationImpl instanceof PaymentKitFactory$createPaymentApi$1) {
            paymentKitFactory$createPaymentApi$1 = (PaymentKitFactory$createPaymentApi$1) continuationImpl;
            int i2 = paymentKitFactory$createPaymentApi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentKitFactory$createPaymentApi$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentKitFactory$createPaymentApi$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentKitFactory$createPaymentApi$1.label;
                if (i != 0) {
                    b.b(obj);
                    paymentKitFactory$createPaymentApi$1.L$0 = this;
                    paymentKitFactory$createPaymentApi$1.L$1 = context;
                    paymentKitFactory$createPaymentApi$1.L$2 = str;
                    paymentKitFactory$createPaymentApi$1.L$3 = str2;
                    paymentKitFactory$createPaymentApi$1.label = 1;
                    b = ((com.yandex.taxi.go_platform.delegates.a) this.a).b();
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) paymentKitFactory$createPaymentApi$1.L$3;
                    str = (String) paymentKitFactory$createPaymentApi$1.L$2;
                    context = (Context) paymentKitFactory$createPaymentApi$1.L$1;
                    this = (a) paymentKitFactory$createPaymentApi$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                lwc0 lwc0Var = (lwc0) b;
                String f = ((com.yandex.taxi.go_platform.delegates.a) this.a).b.f();
                str3 = lwc0Var != null ? lwc0Var.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                Payer payer = new Payer(f, null, str3, null, null, null);
                Merchant merchant = new Merchant(str);
                PaymentSdkEnvironment paymentSdkEnvironment = this.b != PlatformEnvironment.PRODUCTION ? PaymentSdkEnvironment.PRODUCTION : PaymentSdkEnvironment.TESTING;
                ConsoleLoggingMode consoleLoggingMode = ConsoleLoggingMode.AUTOMATIC;
                MetricaInitMode metricaInitMode = MetricaInitMode.CORE;
                tv90Var = new tv90(new h2a0(context, paymentSdkEnvironment, consoleLoggingMode, metricaInitMode).d, paymentSdkEnvironment, consoleLoggingMode, metricaInitMode);
                tv90Var.e = payer;
                tv90Var.f = merchant;
                tv90Var.g = new a3a0();
                if (str2 != null && !evu0.J(str2)) {
                    tv90Var.A = str2;
                }
                return tv90Var.a();
            }
        }
        paymentKitFactory$createPaymentApi$1 = new PaymentKitFactory$createPaymentApi$1(this, continuationImpl);
        Object obj2 = paymentKitFactory$createPaymentApi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentKitFactory$createPaymentApi$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        lwc0 lwc0Var2 = (lwc0) b;
        String f2 = ((com.yandex.taxi.go_platform.delegates.a) this.a).b.f();
        if (lwc0Var2 != null) {
        }
        if (str3 == null) {
        }
        Payer payer2 = new Payer(f2, null, str3, null, null, null);
        Merchant merchant2 = new Merchant(str);
        if (this.b != PlatformEnvironment.PRODUCTION) {
        }
        ConsoleLoggingMode consoleLoggingMode2 = ConsoleLoggingMode.AUTOMATIC;
        MetricaInitMode metricaInitMode2 = MetricaInitMode.CORE;
        tv90Var = new tv90(new h2a0(context, paymentSdkEnvironment, consoleLoggingMode2, metricaInitMode2).d, paymentSdkEnvironment, consoleLoggingMode2, metricaInitMode2);
        tv90Var.e = payer2;
        tv90Var.f = merchant2;
        tv90Var.g = new a3a0();
        if (str2 != null) {
            tv90Var.A = str2;
        }
        return tv90Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PaymentKitFactory$createPaymentKitForCurrentUser$1 paymentKitFactory$createPaymentKitForCurrentUser$1;
        int i;
        Context context2;
        String str4;
        String str5;
        Object b;
        String str6;
        lwc0 lwc0Var;
        a aVar = this;
        if (continuationImpl instanceof PaymentKitFactory$createPaymentKitForCurrentUser$1) {
            paymentKitFactory$createPaymentKitForCurrentUser$1 = (PaymentKitFactory$createPaymentKitForCurrentUser$1) continuationImpl;
            int i2 = paymentKitFactory$createPaymentKitForCurrentUser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentKitFactory$createPaymentKitForCurrentUser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentKitFactory$createPaymentKitForCurrentUser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentKitFactory$createPaymentKitForCurrentUser$1.label;
                if (i != 0) {
                    b.b(obj);
                    paymentKitFactory$createPaymentKitForCurrentUser$1.L$0 = aVar;
                    context2 = context;
                    paymentKitFactory$createPaymentKitForCurrentUser$1.L$1 = context2;
                    str4 = str;
                    paymentKitFactory$createPaymentKitForCurrentUser$1.L$2 = str4;
                    paymentKitFactory$createPaymentKitForCurrentUser$1.L$3 = str2;
                    str5 = str3;
                    paymentKitFactory$createPaymentKitForCurrentUser$1.L$4 = str5;
                    paymentKitFactory$createPaymentKitForCurrentUser$1.label = 1;
                    b = ((com.yandex.taxi.go_platform.delegates.a) aVar.a).b();
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str6 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str7 = (String) paymentKitFactory$createPaymentKitForCurrentUser$1.L$4;
                    str6 = (String) paymentKitFactory$createPaymentKitForCurrentUser$1.L$3;
                    str4 = (String) paymentKitFactory$createPaymentKitForCurrentUser$1.L$2;
                    Context context3 = (Context) paymentKitFactory$createPaymentKitForCurrentUser$1.L$1;
                    a aVar2 = (a) paymentKitFactory$createPaymentKitForCurrentUser$1.L$0;
                    b.b(obj);
                    str5 = str7;
                    aVar = aVar2;
                    b = ((Result) obj).getValue();
                    context2 = context3;
                }
                lwc0Var = (lwc0) (b instanceof Result.Failure ? null : b);
                if (lwc0Var != null) {
                    throw new IllegalStateException() { // from class: com.yandex.go.platform.payments.internal.PaymentKitFactory$UnauthorizedUserException
                    };
                }
                Merchant merchant = new Merchant(str4);
                Payer payer = new Payer(((com.yandex.taxi.go_platform.delegates.a) aVar.a).b.f(), null, lwc0Var.a, null, null, null);
                a0a0 a0a0Var = new a0a0();
                a0a0Var.a = context2.getApplicationContext();
                a0a0Var.b = aVar.b == PlatformEnvironment.PRODUCTION ? PaymentSdkEnvironment.PRODUCTION : PaymentSdkEnvironment.TESTING;
                c0a0 a = a0a0Var.a();
                AdditionalSettings.a aVar3 = new AdditionalSettings.a();
                aVar3.h = true;
                aVar.c.getClass();
                aVar3.g = "";
                aVar3.i = str5;
                if (str6 != null && !evu0.J(str6)) {
                    aVar3.r = str6;
                }
                return a.a(payer, merchant, aVar3.a(), new ylf(), null);
            }
        }
        paymentKitFactory$createPaymentKitForCurrentUser$1 = new PaymentKitFactory$createPaymentKitForCurrentUser$1(aVar, continuationImpl);
        Object obj2 = paymentKitFactory$createPaymentKitForCurrentUser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentKitFactory$createPaymentKitForCurrentUser$1.label;
        if (i != 0) {
        }
        lwc0Var = (lwc0) (b instanceof Result.Failure ? null : b);
        if (lwc0Var != null) {
        }
    }
}
