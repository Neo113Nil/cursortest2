package com.yandex.go.summary.ui.compose.common.animation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt", f = "LazyListScroll.kt", l = {175}, m = "awaitDisplacementFromCenter", v = 2)
/* loaded from: classes14.dex */
final class LazyListScrollKt$awaitDisplacementFromCenter$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.e(null, 0, this);
    }
}
