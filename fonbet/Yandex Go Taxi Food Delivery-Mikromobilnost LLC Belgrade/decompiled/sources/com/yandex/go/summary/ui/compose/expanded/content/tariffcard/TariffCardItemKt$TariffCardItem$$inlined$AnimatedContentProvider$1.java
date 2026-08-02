package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import androidx.compose.runtime.f;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u6s0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1", f = "TariffCardItem.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $animatedContentData;
    final /* synthetic */ androidx.compose.animation.core.a $animationProgress;
    final /* synthetic */ oz40 $completedAnimationContentData;
    final /* synthetic */ m3u0 $currentContent;
    final /* synthetic */ m3u0 $isVisibleState$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1(m3u0 m3u0Var, oz40 oz40Var, oz40 oz40Var2, androidx.compose.animation.core.a aVar, Continuation continuation, m3u0 m3u0Var2) {
        super(2, continuation);
        this.$currentContent = m3u0Var;
        this.$animatedContentData = oz40Var;
        this.$completedAnimationContentData = oz40Var2;
        this.$animationProgress = aVar;
        this.$isVisibleState$inlined = m3u0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1(this.$currentContent, this.$animatedContentData, this.$completedAnimationContentData, this.$animationProgress, continuation, this.$isVisibleState$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr o = e.o(e.t(f.o(new u6s0(4, this.$currentContent))));
            b bVar = new b(this.$animatedContentData, this.$completedAnimationContentData, this.$animationProgress, this.$currentContent, this.$isVisibleState$inlined);
            this.label = 1;
            if (o.collect(bVar, this) == coroutineSingletons) {
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
