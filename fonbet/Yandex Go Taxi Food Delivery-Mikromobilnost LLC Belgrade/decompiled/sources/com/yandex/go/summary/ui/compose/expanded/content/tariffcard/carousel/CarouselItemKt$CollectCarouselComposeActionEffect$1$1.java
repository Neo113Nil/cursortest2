package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel;

import androidx.compose.foundation.lazy.b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.CarouselItemKt$CollectCarouselComposeActionEffect$1$1", f = "CarouselItem.kt", l = {112}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CarouselItemKt$CollectCarouselComposeActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $carouselComposeActionFlow;
    final /* synthetic */ b $carouselLazyListState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselItemKt$CollectCarouselComposeActionEffect$1$1(tpr tprVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$carouselComposeActionFlow = tprVar;
        this.$carouselLazyListState = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarouselItemKt$CollectCarouselComposeActionEffect$1$1(this.$carouselComposeActionFlow, this.$carouselLazyListState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselItemKt$CollectCarouselComposeActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$carouselComposeActionFlow;
            b bVar = this.$carouselLazyListState;
            o oVar = new o(tprVar, new CarouselItemKt$CollectCarouselComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            xw4 xw4Var = new xw4(23, bVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(xw4Var, this) == coroutineSingletons) {
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
