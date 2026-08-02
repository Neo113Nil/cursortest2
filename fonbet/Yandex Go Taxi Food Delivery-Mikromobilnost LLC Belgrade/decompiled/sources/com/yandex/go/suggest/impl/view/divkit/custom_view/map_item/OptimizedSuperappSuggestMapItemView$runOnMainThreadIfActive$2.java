package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2", f = "OptimizedSuperappSuggestMapItemView.kt", l = {275}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OptimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OptimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2 optimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2 = new OptimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2(this.$block, continuation);
        optimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2.L$0 = obj;
        return optimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OptimizedSuperappSuggestMapItemView$runOnMainThreadIfActive$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bvf0.t(tseVar);
            wls wlsVar = this.$block;
            this.L$0 = null;
            this.label = 1;
            if (wlsVar.invoke(tseVar, this) == coroutineSingletons) {
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
