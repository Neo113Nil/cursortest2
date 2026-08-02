package com.yandex.go.multimodal_route.ui.detailed_card;

import defpackage.gp5;
import defpackage.ms40;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardScreenKt$MultimodalRouteDetailedCardScreen$1$3$1$3$1", f = "MultimodalRouteDetailedCardScreen.kt", l = {166, 175}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteDetailedCardScreenKt$MultimodalRouteDetailedCardScreen$1$3$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ tls $onAnchoredHeightChanged;
    final /* synthetic */ wg6 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteDetailedCardScreenKt$MultimodalRouteDetailedCardScreen$1$3$1$3$1(androidx.compose.foundation.lazy.b bVar, wg6 wg6Var, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$state = wg6Var;
        this.$action = tlsVar;
        this.$onAnchoredHeightChanged = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRouteDetailedCardScreenKt$MultimodalRouteDetailedCardScreen$1$3$1$3$1(this.$listState, this.$state, this.$action, this.$onAnchoredHeightChanged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRouteDetailedCardScreenKt$MultimodalRouteDetailedCardScreen$1$3$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r10.collect(r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r10.collect(r1, r9) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new mth(androidx.compose.runtime.f.o(new vs9(this.$listState, 13)), 6));
            ms40 ms40Var = new ms40(0, this.$state, this.$action);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tpr t2 = kotlinx.coroutines.flow.e.t(new mth(androidx.compose.runtime.f.o(new gp5(this.$state, 13)), 6));
        ms40 ms40Var2 = new ms40(1, this.$state, this.$onAnchoredHeightChanged);
        this.label = 2;
    }
}
