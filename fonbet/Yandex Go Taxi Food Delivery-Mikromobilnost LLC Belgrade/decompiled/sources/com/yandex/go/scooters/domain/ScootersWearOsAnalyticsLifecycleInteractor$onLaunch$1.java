package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ow91;
import defpackage.qxm0;
import defpackage.tse;
import defpackage.tse0;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1", f = "ScootersWearOsAnalyticsLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1(j0 j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1 scootersWearOsAnalyticsLifecycleInteractor$onLaunch$1 = (ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersWearOsAnalyticsLifecycleInteractor$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.d = true;
        String[] strArr = ow91.a;
        j0 j0Var = this.this$0;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                j0Var.a.getPackageManager().getPackageInfo(strArr[i], 0);
                z = true;
                break;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                i++;
            }
        }
        qxm0 qxm0Var = this.this$0.c;
        HashMap p = tse0.p(qxm0Var);
        qxm0Var.a.a("Scooters.WearOs.CheckWearableApp", p, 1, x4e.r(z, p, "is_available"));
        return zy11.a;
    }
}
