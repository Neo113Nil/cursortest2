package com.yandex.go.summary.ui.compose.common.animation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt", f = "LazyListScroll.kt", l = {162}, m = "withAutoScrollingFlag", v = 2)
/* loaded from: classes14.dex */
final class LazyListScrollKt$withAutoScrollingFlag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.g(null, null, this);
    }
}
