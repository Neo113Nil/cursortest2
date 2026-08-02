package com.yandex.go.suggest.impl.data.flex;

import defpackage.d6x;
import defpackage.jl40;
import defpackage.k6x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld6x;", "<anonymous>", "(Ltse;)Ld6x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1", f = "SuperappSuggestFlexJasonStateDiskStorageRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ d6x $state;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1(a aVar, d6x d6xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$state = d6xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        k6x k6xVar = this.this$0.b;
        d6x d6xVar = this.$state;
        if (k6xVar.a() && !jl40.l(d6xVar, k6xVar.b())) {
            return k6xVar.e(d6xVar);
        }
        return k6xVar.b();
    }
}
