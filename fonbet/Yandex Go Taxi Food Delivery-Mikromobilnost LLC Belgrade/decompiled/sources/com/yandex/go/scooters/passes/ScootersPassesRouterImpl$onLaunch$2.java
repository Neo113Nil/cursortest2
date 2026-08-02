package com.yandex.go.scooters.passes;

import defpackage.ggo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oeo0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesRouterImpl$onLaunch$2", f = "ScootersPassesRouterImpl.kt", l = {17}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesRouterImpl$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ ggo0 $payload;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesRouterImpl$onLaunch$2(i iVar, ggo0 ggo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$payload = ggo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassesRouterImpl$onLaunch$2(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesRouterImpl$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oeo0 oeo0Var = this.this$0.E;
            ggo0 ggo0Var = this.$payload;
            this.label = 1;
            if (oeo0Var.a.emit(ggo0Var, this) == coroutineSingletons) {
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
