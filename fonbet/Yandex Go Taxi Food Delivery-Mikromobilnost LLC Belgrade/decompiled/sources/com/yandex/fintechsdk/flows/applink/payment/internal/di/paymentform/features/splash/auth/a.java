package com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.splash.auth;

import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.payment.PaymentData;
import defpackage.cqt0;
import defpackage.g180;
import defpackage.ny61;
import defpackage.pm5;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a implements cqt0 {
    public final pm5 a;
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.a b;
    public final PayboxScenario c;
    public final PaymentData d;
    public final Region e;

    public a(pm5 pm5Var, com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar, PayboxScenario payboxScenario, PaymentData paymentData, Region region) {
        this.a = pm5Var;
        this.b = aVar;
        this.c = payboxScenario;
        this.d = paymentData;
        this.e = region;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r3.a == true) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cqt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SplashAuthOptionsProviderImpl$isAuthOptional$1 splashAuthOptionsProviderImpl$isAuthOptional$1;
        int i;
        Result result;
        Object a;
        if (continuationImpl instanceof SplashAuthOptionsProviderImpl$isAuthOptional$1) {
            splashAuthOptionsProviderImpl$isAuthOptional$1 = (SplashAuthOptionsProviderImpl$isAuthOptional$1) continuationImpl;
            int i2 = splashAuthOptionsProviderImpl$isAuthOptional$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashAuthOptionsProviderImpl$isAuthOptional$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashAuthOptionsProviderImpl$isAuthOptional$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashAuthOptionsProviderImpl$isAuthOptional$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    if (this.c == PayboxScenario.PAY_OFFLINE) {
                        return Boolean.TRUE;
                    }
                    Boolean bool = (Boolean) this.a.b;
                    if (bool != null) {
                        return bool;
                    }
                    if (this.e != Region.RU) {
                        result = null;
                        if (result != null) {
                            Object value = result.getValue();
                            g180 g180Var = (g180) (value instanceof Result.Failure ? null : value);
                            if (g180Var != null) {
                            }
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    String paymentUrl = this.d.getPaymentUrl();
                    splashAuthOptionsProviderImpl$isAuthOptional$1.label = 1;
                    a = this.b.a(paymentUrl, splashAuthOptionsProviderImpl$isAuthOptional$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                result = new Result(a);
                if (result != null) {
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        splashAuthOptionsProviderImpl$isAuthOptional$1 = new SplashAuthOptionsProviderImpl$isAuthOptional$1(this, continuationImpl);
        Object obj2 = splashAuthOptionsProviderImpl$isAuthOptional$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashAuthOptionsProviderImpl$isAuthOptional$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        result = new Result(a);
        if (result != null) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
