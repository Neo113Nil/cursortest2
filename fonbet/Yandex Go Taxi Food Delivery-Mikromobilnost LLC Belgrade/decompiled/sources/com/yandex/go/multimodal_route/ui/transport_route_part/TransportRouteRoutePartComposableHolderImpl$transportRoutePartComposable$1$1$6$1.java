package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import defpackage.f811;
import defpackage.g811;
import defpackage.j811;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1", f = "TransportRouteRoutePartComposableHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ j811 $uiState;
    int label;
    final /* synthetic */ f811 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1(f811 f811Var, androidx.compose.foundation.lazy.b bVar, j811 j811Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f811Var;
        this.$listState = bVar;
        this.$uiState = j811Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1(this.this$0, this.$listState, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1 transportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1 = (TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$6$1.invokeSuspend(zy11Var);
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
        if (((Boolean) this.this$0.f.getValue()).booleanValue() && !this.$listState.b()) {
            f811 f811Var = this.this$0;
            f811Var.b.c(((g811) this.$uiState).a, f811Var.c, MultimodalRouteAnalytics$MultimodalRouteButtonType.EndOfModal);
        }
        return zy11.a;
    }
}
