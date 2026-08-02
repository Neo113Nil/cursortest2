package com.yandex.passport.internal.startup;

import com.yandex.passport.internal.methods.requester.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.startup.HostProcessForegroundObserver$start$1$2$1$onStart$1", f = "HostProcessForegroundObserver.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HostProcessForegroundObserver$start$1$2$1$onStart$1 extends SuspendLambda implements wls {
    final /* synthetic */ f $methodRequestDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostProcessForegroundObserver$start$1$2$1$onStart$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.$methodRequestDispatcher = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HostProcessForegroundObserver$start$1$2$1$onStart$1(this.$methodRequestDispatcher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HostProcessForegroundObserver$start$1$2$1$onStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = b.a;
            f fVar = this.$methodRequestDispatcher;
            this.label = 1;
            if (b.a(bVar, fVar, false, this) == coroutineSingletons) {
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
