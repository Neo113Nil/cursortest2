package com.yandex.go.multimodal_route.ui.transport_route_part;

import defpackage.f811;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tig0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$4$1", f = "TransportRouteRoutePartComposableHolderImpl.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    int label;
    final /* synthetic */ f811 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$4$1(f811 f811Var, androidx.compose.foundation.lazy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f811Var;
        this.$listState = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$4$1(this.this$0, this.$listState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!((Boolean) this.this$0.f.getValue()).booleanValue()) {
                androidx.compose.foundation.lazy.b bVar = this.$listState;
                this.label = 1;
                tig0 tig0Var = androidx.compose.foundation.lazy.b.y;
                if (bVar.f(0, 0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
