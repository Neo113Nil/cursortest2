package com.yandex.go.drive.sdkintegration.domain.session.unified_polling;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.v3x;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljnt;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.unified_polling.UnifiedPollingSessionStateInteractor$sessionStateFlow$3", f = "UnifiedPollingSessionStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UnifiedPollingSessionStateInteractor$sessionStateFlow$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingSessionStateInteractor$sessionStateFlow$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingSessionStateInteractor$sessionStateFlow$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UnifiedPollingSessionStateInteractor$sessionStateFlow$3 unifiedPollingSessionStateInteractor$sessionStateFlow$3 = (UnifiedPollingSessionStateInteractor$sessionStateFlow$3) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        unifiedPollingSessionStateInteractor$sessionStateFlow$3.invokeSuspend(zy11Var);
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
        v3x.a.getClass();
        e eVar = this.this$0;
        l8x l8xVar = (l8x) eVar.d.getAndSet(tje.N(eVar.a, null, null, new UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1(eVar, null), 3));
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        return zy11.a;
    }
}
