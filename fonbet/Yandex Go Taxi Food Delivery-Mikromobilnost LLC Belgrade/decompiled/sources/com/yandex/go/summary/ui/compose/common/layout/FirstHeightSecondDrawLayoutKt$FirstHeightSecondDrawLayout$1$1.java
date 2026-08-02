package com.yandex.go.summary.ui.compose.common.layout;

import androidx.compose.runtime.f;
import defpackage.c1o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.layout.FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1", f = "FirstHeightSecondDrawLayout.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $animatableHeight;
    final /* synthetic */ yx40 $measuredHeightState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1(yx40 yx40Var, androidx.compose.animation.core.a aVar, Continuation continuation) {
        super(2, continuation);
        this.$measuredHeightState = yx40Var;
        this.$animatableHeight = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1(this.$measuredHeightState, this.$animatableHeight, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new c1o(25, this.$measuredHeightState));
            androidx.compose.animation.core.a aVar = this.$animatableHeight;
            o oVar = new o(o, new FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            a aVar2 = new a(aVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(aVar2, this) == coroutineSingletons) {
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
