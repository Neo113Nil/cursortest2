package com.yandex.go.flex.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.GoAsyncCachingDecorator$delete$1", f = "GoAsyncCachingDecorator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class GoAsyncCachingDecorator$delete$1 extends SuspendLambda implements wls {
    final /* synthetic */ p7j0 $networkDataModel;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoAsyncCachingDecorator$delete$1(a aVar, p7j0 p7j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$networkDataModel = p7j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoAsyncCachingDecorator$delete$1(this.this$0, this.$networkDataModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GoAsyncCachingDecorator$delete$1 goAsyncCachingDecorator$delete$1 = (GoAsyncCachingDecorator$delete$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        goAsyncCachingDecorator$delete$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.a.delete(this.$networkDataModel);
        return zy11.a;
    }
}
