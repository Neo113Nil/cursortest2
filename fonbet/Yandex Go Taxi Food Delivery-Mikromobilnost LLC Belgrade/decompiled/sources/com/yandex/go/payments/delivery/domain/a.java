package com.yandex.go.payments.delivery.domain;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.fvt;
import defpackage.ivt;
import defpackage.jbh;
import defpackage.mii;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.ogz0;
import defpackage.qw6;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.u0k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements mii {
    public final fvt a;
    public final qw6 b;
    public final t1b0 c;

    public a(qw6 qw6Var, rqo rqoVar, fvt fvtVar) {
        this.a = fvtVar;
        this.b = qw6Var;
        this.c = ((jbh) rqoVar).e(YbWalletEntryPointExperiment.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (((com.yandex.go.payments.googlepay.domain.e) r5.a).q == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (r5.b.a(((defpackage.nj0) r6).b) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.mii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0k u0kVar, boolean z, boolean z2, Continuation continuation) {
        CargoFormSupportedOptionsFilter$isSupported$1 cargoFormSupportedOptionsFilter$isSupported$1;
        int i;
        if (continuation instanceof CargoFormSupportedOptionsFilter$isSupported$1) {
            cargoFormSupportedOptionsFilter$isSupported$1 = (CargoFormSupportedOptionsFilter$isSupported$1) continuation;
            int i2 = cargoFormSupportedOptionsFilter$isSupported$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cargoFormSupportedOptionsFilter$isSupported$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cargoFormSupportedOptionsFilter$isSupported$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cargoFormSupportedOptionsFilter$isSupported$1.label;
                boolean z3 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(u0kVar instanceof ogz0)) {
                        if (u0kVar instanceof ivt) {
                            if (!z) {
                                if (!z2) {
                                }
                            }
                        } else if (u0kVar instanceof nk0) {
                            t1b0 t1b0Var = this.c;
                            cargoFormSupportedOptionsFilter$isSupported$1.L$0 = null;
                            cargoFormSupportedOptionsFilter$isSupported$1.Z$0 = z;
                            cargoFormSupportedOptionsFilter$isSupported$1.Z$1 = z2;
                            cargoFormSupportedOptionsFilter$isSupported$1.label = 1;
                            obj = t1b0Var.b(cargoFormSupportedOptionsFilter$isSupported$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (u0kVar instanceof nj0) {
                        }
                        return Boolean.valueOf(z3);
                    }
                    z3 = false;
                    return Boolean.valueOf(z3);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                z3 = ((YbWalletEntryPointExperiment) obj).d.contains(YbWalletEntryPointExperiment.EntryPoint.SUMMARY);
                return Boolean.valueOf(z3);
            }
        }
        cargoFormSupportedOptionsFilter$isSupported$1 = new CargoFormSupportedOptionsFilter$isSupported$1(this, (ContinuationImpl) continuation);
        Object obj2 = cargoFormSupportedOptionsFilter$isSupported$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cargoFormSupportedOptionsFilter$isSupported$1.label;
        boolean z32 = true;
        if (i != 0) {
        }
        z32 = ((YbWalletEntryPointExperiment) obj2).d.contains(YbWalletEntryPointExperiment.EntryPoint.SUMMARY);
        return Boolean.valueOf(z32);
    }
}
