package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView$bindData$onImageLoaded$1", f = "OptimizedSuperappSuggestMapItemView.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OptimizedSuperappSuggestMapItemView$bindData$onImageLoaded$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<SuperappSuggestMapItemPinView> $pinViews;
    int label;
    final /* synthetic */ OptimizedSuperappSuggestMapItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimizedSuperappSuggestMapItemView$bindData$onImageLoaded$1(OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = optimizedSuperappSuggestMapItemView;
        this.$pinViews = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OptimizedSuperappSuggestMapItemView$bindData$onImageLoaded$1(this.this$0, this.$pinViews, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OptimizedSuperappSuggestMapItemView$bindData$onImageLoaded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object removeIntersections;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView = this.this$0;
            List<SuperappSuggestMapItemPinView> list = this.$pinViews;
            this.label = 1;
            removeIntersections = optimizedSuperappSuggestMapItemView.removeIntersections(list, this);
            if (removeIntersections == coroutineSingletons) {
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
