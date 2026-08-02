package com.ybsdk.rconfig;

import defpackage.dfr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.rconfig.RemoteConfig$readLatestValue$remoteValue$2", f = "RemoteConfig.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RemoteConfig$readLatestValue$remoteValue$2 extends SuspendLambda implements wls {
    final /* synthetic */ dfr $flag;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfig$readLatestValue$remoteValue$2(b bVar, dfr dfrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$flag = dfrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteConfig$readLatestValue$remoteValue$2(this.this$0, this.$flag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RemoteConfig$readLatestValue$remoteValue$2 remoteConfig$readLatestValue$remoteValue$2 = (RemoteConfig$readLatestValue$remoteValue$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        remoteConfig$readLatestValue$remoteValue$2.invokeSuspend(zy11Var);
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
        rje.m(this.this$0.d, "Failed to read remote value: ".concat(this.$flag.a));
        return zy11.a;
    }
}
