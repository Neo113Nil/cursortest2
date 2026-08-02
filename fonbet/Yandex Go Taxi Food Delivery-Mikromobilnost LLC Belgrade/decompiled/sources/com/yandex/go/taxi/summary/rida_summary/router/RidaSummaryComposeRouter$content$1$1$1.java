package com.yandex.go.taxi.summary.rida_summary.router;

import com.yandex.go.taxi.summary.rida_summary.interactor.o;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.i7k0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6k0;
import defpackage.y6k0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.rida_summary.router.RidaSummaryComposeRouter$content$1$1$1", f = "RidaSummaryComposeRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RidaSummaryComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ i7k0 $action;
    int label;
    final /* synthetic */ y6k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaSummaryComposeRouter$content$1$1$1(y6k0 y6k0Var, i7k0 i7k0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y6k0Var;
        this.$action = i7k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RidaSummaryComposeRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RidaSummaryComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6k0 y6k0Var = this.this$0;
            o oVar = y6k0Var.I;
            i7k0 i7k0Var = this.$action;
            x6k0 x6k0Var = (x6k0) y6k0Var.S.getValue();
            this.label = 1;
            if (oVar.a(i7k0Var, x6k0Var, this) == coroutineSingletons) {
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
