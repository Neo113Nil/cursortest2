package com.yandex.div.core.view2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyt31;", "<anonymous>", "(Ltse;)Lyt31;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DivViewCreator$viewPreCreationProfile$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $it;
    final /* synthetic */ com.yandex.div.internal.viewpool.optimization.a $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewCreator$viewPreCreationProfile$1$1(com.yandex.div.internal.viewpool.optimization.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$repository = aVar;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivViewCreator$viewPreCreationProfile$1$1(this.$repository, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivViewCreator$viewPreCreationProfile$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.div.internal.viewpool.optimization.a aVar = this.$repository;
        String str = this.$it;
        this.label = 1;
        Object a = aVar.a(str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
