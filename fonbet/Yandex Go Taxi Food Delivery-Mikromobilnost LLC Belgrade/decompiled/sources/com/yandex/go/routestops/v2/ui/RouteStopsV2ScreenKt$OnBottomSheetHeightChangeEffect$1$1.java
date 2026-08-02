package com.yandex.go.routestops.v2.ui;

import androidx.compose.runtime.f;
import defpackage.gp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.ui.RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1", f = "RouteStopsV2Screen.kt", l = {233}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $anchor;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ tls $onHeightChange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1(int i, wg6 wg6Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = wg6Var;
        this.$anchor = i;
        this.$onHeightChange = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1(this.$anchor, this.$bottomSheetState, this.$onHeightChange, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new b(f.o(new gp5(this.$bottomSheetState, 16)), this.$bottomSheetState, this.$anchor));
            t24 t24Var = new t24(14, this.$onHeightChange);
            this.label = 1;
            if (t.collect(t24Var, this) == coroutineSingletons) {
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
