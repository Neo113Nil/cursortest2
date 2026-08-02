package com.yandex.plus.home.common.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.common.utils.CoroutinesExtKt$parallelMap$2$1", f = "CoroutinesExt.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoroutinesExtKt$parallelMap$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ zls $block;
    final /* synthetic */ Object $it;
    final /* synthetic */ tse $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtKt$parallelMap$2$1(zls zlsVar, tse tseVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$block = zlsVar;
        this.$scope = tseVar;
        this.$it = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutinesExtKt$parallelMap$2$1(this.$block, this.$scope, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesExtKt$parallelMap$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zls zlsVar = this.$block;
        tse tseVar = this.$scope;
        Object obj2 = this.$it;
        this.label = 1;
        Object invoke = zlsVar.invoke(tseVar, obj2, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
