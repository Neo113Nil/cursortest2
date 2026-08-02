package com.yandex.go.preorder.lifecycle;

import defpackage.cwx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s6k0;
import defpackage.tpo0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.source.domain.SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$safeCollect$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.lifecycle.SourcePointSdcLifecycleListener$onResume$6", f = "SourcePointSdcLifecycleListener.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SourcePointSdcLifecycleListener$onResume$6 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointSdcLifecycleListener$onResume$6(p pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointSdcLifecycleListener$onResume$6(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointSdcLifecycleListener$onResume$6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s6k0 s6k0Var = this.this$0.i;
            this.label = 1;
            if (new kotlinx.coroutines.flow.o(new ru.yandex.taxi.preorder.source.domain.j(((cwx0) s6k0Var.a).b, s6k0Var), new SdcResetZoneModeInteractor$resetZoneModeOnMainScreen$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new tpo0(4, s6k0Var), this) == coroutineSingletons) {
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
