package com.yandex.go.dynamic.impl.ui.loading;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7n;
import defpackage.qoh;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.dynamic.impl.ui.loading.DynamicFeatureLoadingPresenter$attachView$1", f = "DynamicFeatureLoadingPresenter.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DynamicFeatureLoadingPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o7n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFeatureLoadingPresenter$attachView$1(o7n o7nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o7nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicFeatureLoadingPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicFeatureLoadingPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            o7n o7nVar = this.this$0;
            qoh p = ((com.yandex.go.dynamic.impl.b) o7nVar.z).p(o7nVar.x);
            this.label = 1;
            if (p.s(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
