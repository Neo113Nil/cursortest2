package com.yandex.go.masstransit.design.compose.route;

import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.b;
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
@mvg(c = "com.yandex.go.masstransit.design.compose.route.TransportRouteListKt$TransportRouteList$8$1$1$1$1", f = "TransportRouteList.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportRouteListKt$TransportRouteList$8$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ b $listState;
    final /* synthetic */ float $y;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRouteListKt$TransportRouteList$8$1$1$1$1(b bVar, float f, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$y = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportRouteListKt$TransportRouteList$8$1$1$1$1(this.$listState, this.$y, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportRouteListKt$TransportRouteList$8$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.$listState;
            float f = this.$y;
            this.label = 1;
            if (c.p(bVar, f, this) == coroutineSingletons) {
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
