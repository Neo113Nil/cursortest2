package com.yandex.go.sdk_registry;

import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import defpackage.b7p0;
import defpackage.fwf0;
import defpackage.gwf0;
import defpackage.jop0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk_registry.SdkRegistryActivityLifecycleInitializer$initializeStage$1", f = "SdkRegistryActivityLifecycleInitializer.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SdkRegistryActivityLifecycleInitializer$initializeStage$1 extends SuspendLambda implements wls {
    final /* synthetic */ SdkLifecycleStage $stage;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkRegistryActivityLifecycleInitializer$initializeStage$1(b bVar, SdkLifecycleStage sdkLifecycleStage, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$stage = sdkLifecycleStage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkRegistryActivityLifecycleInitializer$initializeStage$1(this.this$0, this.$stage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkRegistryActivityLifecycleInitializer$initializeStage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        b bVar = this.this$0;
        com.yandex.go.sdk_registry.runtime.b bVar2 = bVar.a;
        SdkLifecycleStage sdkLifecycleStage = this.$stage;
        gwf0 gwf0Var = new gwf0();
        gwf0Var.a(jop0.a, new b7p0(5, bVar));
        fwf0 fwf0Var = new fwf0(gwf0Var.a);
        this.label = 1;
        return bVar2.b(sdkLifecycleStage, fwf0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
