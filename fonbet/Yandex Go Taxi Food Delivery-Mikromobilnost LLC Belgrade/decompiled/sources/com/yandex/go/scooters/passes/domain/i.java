package com.yandex.go.scooters.passes.domain;

import com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException;
import com.yandex.go.scooters.passes.model.PassType;
import defpackage.e2e0;
import defpackage.hfa0;
import defpackage.lea0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class i {
    public final e2e0 a;
    public final com.yandex.go.scooters.passes.data.a b;
    public final com.yandex.go.scooters.payments.domain.a c;

    public i(e2e0 e2e0Var, com.yandex.go.scooters.passes.data.a aVar, com.yandex.go.scooters.payments.domain.a aVar2) {
        this.a = e2e0Var;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, PassType passType, ContinuationImpl continuationImpl) {
        ScootersPassesPurchasingInteractorImpl$purchasePass$1 scootersPassesPurchasingInteractorImpl$purchasePass$1;
        int i;
        int i2;
        if (continuationImpl instanceof ScootersPassesPurchasingInteractorImpl$purchasePass$1) {
            scootersPassesPurchasingInteractorImpl$purchasePass$1 = (ScootersPassesPurchasingInteractorImpl$purchasePass$1) continuationImpl;
            int i3 = scootersPassesPurchasingInteractorImpl$purchasePass$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersPassesPurchasingInteractorImpl$purchasePass$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersPassesPurchasingInteractorImpl$purchasePass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesPurchasingInteractorImpl$purchasePass$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hfa0 c = this.c.c();
                    lea0 b = c.b();
                    if (b == null || b.d()) {
                        throw new ScootersNoSelectedPaymentMethodException();
                    }
                    int i4 = passType == PassType.SUPER_PASS ? 1 : 0;
                    boolean z = c.c() != null;
                    scootersPassesPurchasingInteractorImpl$purchasePass$1.L$0 = null;
                    scootersPassesPurchasingInteractorImpl$purchasePass$1.L$1 = null;
                    scootersPassesPurchasingInteractorImpl$purchasePass$1.L$2 = null;
                    scootersPassesPurchasingInteractorImpl$purchasePass$1.L$3 = null;
                    scootersPassesPurchasingInteractorImpl$purchasePass$1.I$0 = i4;
                    scootersPassesPurchasingInteractorImpl$purchasePass$1.label = 1;
                    obj = this.b.b(str, z, b, scootersPassesPurchasingInteractorImpl$purchasePass$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = scootersPassesPurchasingInteractorImpl$purchasePass$1.I$0;
                    kotlin.b.b(obj);
                }
                String str2 = (String) obj;
                this.a.d(i2 == 0 ? "superpass" : "package", str2);
                return str2;
            }
        }
        scootersPassesPurchasingInteractorImpl$purchasePass$1 = new ScootersPassesPurchasingInteractorImpl$purchasePass$1(this, continuationImpl);
        Object obj2 = scootersPassesPurchasingInteractorImpl$purchasePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesPurchasingInteractorImpl$purchasePass$1.label;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        this.a.d(i2 == 0 ? "superpass" : "package", str22);
        return str22;
    }
}
