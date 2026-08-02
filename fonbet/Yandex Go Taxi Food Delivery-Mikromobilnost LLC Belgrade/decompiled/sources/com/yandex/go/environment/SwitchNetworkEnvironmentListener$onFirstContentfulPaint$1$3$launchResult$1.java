package com.yandex.go.environment;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lowx;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.environment.SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1", f = "SwitchNetworkEnvironmentListener.kt", l = {105, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r9 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        ru.yandex.taxi.startup.launch.i iVar;
        Object obj2;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.startup.launch.i iVar2 = (ru.yandex.taxi.startup.launch.i) this.this$0.h.get();
            this.this$0.getClass();
            ru.yandex.taxi.am.token.a aVar = this.this$0.i;
            this.L$0 = iVar2;
            str = "SwitchNetworkEnvironmentListener";
            this.L$1 = "SwitchNetworkEnvironmentListener";
            this.label = 1;
            Object d = aVar.d(false, this);
            if (d != coroutineSingletons) {
                iVar = iVar2;
                obj2 = d;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
            return new Result(b);
        }
        String str2 = (String) this.L$1;
        iVar = (ru.yandex.taxi.startup.launch.i) this.L$0;
        kotlin.b.b(obj);
        obj2 = ((Result) obj).getValue();
        str = str2;
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        b = ru.yandex.taxi.startup.launch.i.b(iVar, str, (String) obj2, true, this, 2);
    }
}
