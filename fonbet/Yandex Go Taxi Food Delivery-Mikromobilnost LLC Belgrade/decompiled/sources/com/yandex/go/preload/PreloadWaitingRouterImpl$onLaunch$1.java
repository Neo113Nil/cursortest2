package com.yandex.go.preload;

import defpackage.avj0;
import defpackage.dl1;
import defpackage.hxx;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.uoe0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preload.PreloadWaitingRouterImpl$onLaunch$1", f = "PreloadWaitingRouterImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreloadWaitingRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadWaitingRouterImpl$onLaunch$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreloadWaitingRouterImpl$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreloadWaitingRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = (b) this.this$0.D.get();
            f fVar = this.this$0;
            fVar.E(bVar2, new uoe0(((avj0) fVar.H).h(kyh0.newbies_loading_screen_text), false), new dl1(28, this.this$0), hxx.a);
            f fVar2 = this.this$0;
            this.L$0 = bVar2;
            this.label = 1;
            if (f.P(fVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        bVar.i();
        this.this$0.r(new qu(9));
        return zy11.a;
    }
}
