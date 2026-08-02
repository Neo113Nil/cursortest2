package com.yandex.go.payments.shared.business;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BusinessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1 businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BusinessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1) {
            businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1 = (BusinessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1) continuation;
            int i2 = businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List a = this.b.a((BusinessAccountFlowExperiment) obj);
                    businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.L$0 = null;
                    businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.L$1 = null;
                    businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.L$2 = null;
                    businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.L$3 = null;
                    businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1 = new BusinessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessAccountExperimentsFacade$getSharedAccountTypeDescriptionsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
