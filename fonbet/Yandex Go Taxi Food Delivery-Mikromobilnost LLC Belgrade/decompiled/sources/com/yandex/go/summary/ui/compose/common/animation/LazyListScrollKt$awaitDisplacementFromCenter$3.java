package com.yandex.go.summary.ui.compose.common.animation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$awaitDisplacementFromCenter$3", f = "LazyListScroll.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LazyListScrollKt$awaitDisplacementFromCenter$3 extends SuspendLambda implements wls {
    /* synthetic */ float F$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyListScrollKt$awaitDisplacementFromCenter$3 lazyListScrollKt$awaitDisplacementFromCenter$3 = new LazyListScrollKt$awaitDisplacementFromCenter$3(2, continuation);
        lazyListScrollKt$awaitDisplacementFromCenter$3.F$0 = ((Number) obj).floatValue();
        return lazyListScrollKt$awaitDisplacementFromCenter$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListScrollKt$awaitDisplacementFromCenter$3) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(Math.abs(f) >= 1.0f);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
