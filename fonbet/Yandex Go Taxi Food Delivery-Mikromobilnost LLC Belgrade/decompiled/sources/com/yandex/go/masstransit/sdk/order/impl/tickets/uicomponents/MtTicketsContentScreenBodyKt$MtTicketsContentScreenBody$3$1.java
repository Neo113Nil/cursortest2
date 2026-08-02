package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import androidx.compose.runtime.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.xur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1", f = "MtTicketsContentScreenBody.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    final /* synthetic */ float $scrollThresholdPx;
    final /* synthetic */ oz40 $scrollTracked$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1(androidx.compose.foundation.lazy.b bVar, float f, oz40 oz40Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$lazyListState = bVar;
        this.$scrollThresholdPx = f;
        this.$scrollTracked$delegate = oz40Var;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1(this.$lazyListState, this.$scrollThresholdPx, this.$scrollTracked$delegate, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new vs9(this.$lazyListState, 12));
            float f = this.$scrollThresholdPx;
            oz40 oz40Var = this.$scrollTracked$delegate;
            b bVar = new b(o, f, oz40Var);
            xur xurVar = new xur(18, this.$action, oz40Var);
            this.label = 1;
            if (bVar.collect(xurVar, this) == coroutineSingletons) {
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
