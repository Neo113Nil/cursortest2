package com.yandex.go.navigator;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.BaseNavigatorModalView", f = "BaseNavigatorModalView.kt", l = {212}, m = "prepareStaticFocusRect", v = 2)
/* loaded from: classes12.dex */
public final class BaseNavigatorModalView$prepareStaticFocusRect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseNavigatorModalView<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNavigatorModalView$prepareStaticFocusRect$1(BaseNavigatorModalView baseNavigatorModalView, Continuation continuation) {
        super(continuation);
        this.this$0 = baseNavigatorModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.prepareStaticFocusRect(this);
    }
}
