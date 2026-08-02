package com.yandex.go.rida.bids.utils;

import defpackage.jj2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.utils.StateUtilsKt$asAnimatable$2$1$2$1", f = "StateUtils.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class StateUtilsKt$asAnimatable$2$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $animatable;
    final /* synthetic */ jj2 $animationSpec;
    final /* synthetic */ long $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateUtilsKt$asAnimatable$2$1$2$1(androidx.compose.animation.core.a aVar, long j, jj2 jj2Var, Continuation continuation) {
        super(2, continuation);
        this.$animatable = aVar;
        this.$it = j;
        this.$animationSpec = jj2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StateUtilsKt$asAnimatable$2$1$2$1(this.$animatable, this.$it, this.$animationSpec, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StateUtilsKt$asAnimatable$2$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = this.$animatable;
            wu60 wu60Var = new wu60(this.$it);
            jj2 jj2Var = this.$animationSpec;
            this.label = 1;
            if (androidx.compose.animation.core.a.d(aVar, wu60Var, jj2Var, null, null, this, 12) == coroutineSingletons) {
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
