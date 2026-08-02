package com.yandex.go.loyalty.impl.common.data;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ c b;

    public b(mth mthVar, c cVar) {
        this.a = mthVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AllLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1 allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof AllLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1) {
            allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1 = (AllLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1) continuation;
            int i2 = allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.L$0 = null;
                    allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.L$1 = null;
                    allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.L$2 = null;
                    allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1 = new AllLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = allLoyaltyProgramsInteractorImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
