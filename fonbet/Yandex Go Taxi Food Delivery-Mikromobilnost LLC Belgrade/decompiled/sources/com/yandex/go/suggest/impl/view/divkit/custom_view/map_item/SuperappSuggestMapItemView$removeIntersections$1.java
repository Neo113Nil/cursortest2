package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView", f = "SuperappSuggestMapItemView.kt", l = {189, 230}, m = "removeIntersections", v = 2)
/* loaded from: classes14.dex */
public final class SuperappSuggestMapItemView$removeIntersections$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuperappSuggestMapItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestMapItemView$removeIntersections$1(SuperappSuggestMapItemView superappSuggestMapItemView, Continuation continuation) {
        super(continuation);
        this.this$0 = superappSuggestMapItemView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object removeIntersections;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        removeIntersections = this.this$0.removeIntersections(null, this);
        return removeIntersections;
    }
}
