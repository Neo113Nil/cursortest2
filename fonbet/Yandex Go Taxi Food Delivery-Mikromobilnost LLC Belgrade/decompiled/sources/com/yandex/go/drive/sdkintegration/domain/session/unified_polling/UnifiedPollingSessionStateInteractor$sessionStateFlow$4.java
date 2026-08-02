package com.yandex.go.drive.sdkintegration.domain.session.unified_polling;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v3x;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ljnt;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.unified_polling.UnifiedPollingSessionStateInteractor$sessionStateFlow$4", f = "UnifiedPollingSessionStateInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UnifiedPollingSessionStateInteractor$sessionStateFlow$4 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingSessionStateInteractor$sessionStateFlow$4(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new UnifiedPollingSessionStateInteractor$sessionStateFlow$4(this.this$0, (Continuation) obj3).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l8x l8xVar = (l8x) this.this$0.d.getAndSet(null);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            n0 n0Var = this.this$0.c;
            this.label = 1;
            if (n0Var.emit(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        v3x.a.getClass();
        return zy11.a;
    }
}
