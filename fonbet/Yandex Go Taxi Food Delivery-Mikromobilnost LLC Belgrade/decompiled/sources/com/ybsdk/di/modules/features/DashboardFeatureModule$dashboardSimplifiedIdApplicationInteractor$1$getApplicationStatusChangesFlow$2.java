package com.ybsdk.di.modules.features;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s2e0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls2e0;", "it", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.features.DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2", f = "DashboardFeatureModule.kt", l = {379}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ com.ybsdk.screens.common.c $simplifiedIdApplicationStatusProvider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2(com.ybsdk.screens.common.c cVar, Continuation continuation) {
        super(2, continuation);
        this.$simplifiedIdApplicationStatusProvider = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2(this.$simplifiedIdApplicationStatusProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardFeatureModule$dashboardSimplifiedIdApplicationInteractor$1$getApplicationStatusChangesFlow$2) create((s2e0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.ybsdk.screens.common.c cVar = this.$simplifiedIdApplicationStatusProvider;
        this.label = 1;
        String a = cVar.a();
        if (a != null) {
            obj2 = ((com.ybsdk.common.repositiories.applications.b) cVar.a).d(a, this);
            if (obj2 != coroutineSingletons) {
            }
            return obj2 != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        obj2 = zy11Var;
        if (obj2 != coroutineSingletons) {
        }
    }
}
