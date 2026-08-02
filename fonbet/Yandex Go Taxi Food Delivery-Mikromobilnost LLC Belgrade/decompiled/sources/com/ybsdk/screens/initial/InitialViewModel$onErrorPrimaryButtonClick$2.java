package com.ybsdk.screens.initial;

import defpackage.gwv;
import defpackage.iwv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.InitialViewModel$onErrorPrimaryButtonClick$2", f = "InitialViewModel.kt", l = {792}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InitialViewModel$onErrorPrimaryButtonClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ iwv $currentState;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialViewModel$onErrorPrimaryButtonClick$2(d dVar, iwv iwvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$currentState = iwvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitialViewModel$onErrorPrimaryButtonClick$2(this.this$0, this.$currentState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InitialViewModel$onErrorPrimaryButtonClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            gwv gwvVar = (gwv) this.$currentState;
            String str = gwvVar.b;
            String str2 = gwvVar.c;
            String str3 = gwvVar.d;
            this.label = 1;
            if (dVar.g0(str, str2, str3, this) == coroutineSingletons) {
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
