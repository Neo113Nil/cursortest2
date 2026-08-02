package com.yandex.go.multimodal_route.ui.transport_tracking;

import defpackage.ba11;
import defpackage.ia11;
import defpackage.la11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.y911;
import defpackage.z911;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_tracking.TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1", f = "TransportTrackingCardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ la11 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1(la11 la11Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$uiState = la11Var;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1(this.$uiState, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1 transportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1 = (TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1.invokeSuspend(zy11Var);
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
        this.$action.invoke(new ba11(((ia11) this.$uiState).e));
        ia11 ia11Var = (ia11) this.$uiState;
        boolean z = ia11Var.g;
        tls tlsVar = this.$action;
        if (z) {
            tlsVar.invoke(new z911(ia11Var.d));
        } else {
            tlsVar.invoke(new y911(ia11Var.e));
        }
        return zy11.a;
    }
}
