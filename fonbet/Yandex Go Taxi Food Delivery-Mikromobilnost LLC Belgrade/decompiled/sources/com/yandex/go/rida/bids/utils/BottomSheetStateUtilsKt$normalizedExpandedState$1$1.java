package com.yandex.go.rida.bids.utils;

import androidx.compose.runtime.f;
import defpackage.gp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.tx40;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zg6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.utils.BottomSheetStateUtilsKt$normalizedExpandedState$1$1", f = "BottomSheetStateUtils.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BottomSheetStateUtilsKt$normalizedExpandedState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isReversed;
    final /* synthetic */ tx40 $state;
    final /* synthetic */ wg6 $this_normalizedExpandedState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetStateUtilsKt$normalizedExpandedState$1$1(wg6 wg6Var, boolean z, tx40 tx40Var, Continuation continuation) {
        super(2, continuation);
        this.$this_normalizedExpandedState = wg6Var;
        this.$isReversed = z;
        this.$state = tx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetStateUtilsKt$normalizedExpandedState$1$1(this.$this_normalizedExpandedState, this.$isReversed, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetStateUtilsKt$normalizedExpandedState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new gp5(this.$this_normalizedExpandedState, 5));
            zg6 zg6Var = new zg6(this.$isReversed, this.$state);
            this.label = 1;
            if (o.collect(zg6Var, this) == coroutineSingletons) {
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
