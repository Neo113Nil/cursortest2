package com.ybsdk.feature.testpayment.internal.domain;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupTestPaymentPaymentResultStatus;
import com.ybsdk.core.utils.poller.PollerTimeoutException;
import defpackage.hhy0;
import defpackage.jhy0;
import defpackage.jl40;
import defpackage.khy0;
import defpackage.lhy0;
import defpackage.lrp0;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;
    public final /* synthetic */ hhy0 c;

    public a(vpr vprVar, b bVar, hhy0 hhy0Var) {
        this.a = vprVar;
        this.b = bVar;
        this.c = hhy0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TestPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1 testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof TestPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1) {
            testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1 = (TestPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    lrp0 lrp0Var = lrp0.b;
                    boolean z = s2e0Var instanceof q2e0;
                    b bVar = this.b;
                    if (z) {
                        Object obj4 = ((q2e0) s2e0Var).a;
                        if (obj4 instanceof jhy0) {
                            bVar.f(AutotopupEvents$AutoTopupTestPaymentPaymentResultStatus.SUCCESS, null);
                        }
                        obj3 = (lhy0) obj4;
                    } else if (jl40.l(s2e0Var, r2e0.a)) {
                        PollerTimeoutException pollerTimeoutException = new PollerTimeoutException();
                        x4c.g("Failed to get auto topup payment status", pollerTimeoutException, null, Collections.singletonList(lrp0Var), 4);
                        bVar.f(AutotopupEvents$AutoTopupTestPaymentPaymentResultStatus.TIMEOUT, pollerTimeoutException.getMessage());
                        obj3 = this.c;
                    } else if (s2e0Var instanceof n2e0) {
                        Throwable th = ((n2e0) s2e0Var).a;
                        x4c.g("Failed to get auto topup payment status", th, null, Collections.singletonList(lrp0Var), 4);
                        bVar.f(AutotopupEvents$AutoTopupTestPaymentPaymentResultStatus.FAILURE, th.getMessage());
                        obj3 = new khy0(th);
                    }
                    if (obj3 != null) {
                        testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj3, testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1 = new TestPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = testPaymentInteractor$getTestPaymentStatus$$inlined$mapNotNull$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
