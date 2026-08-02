package com.yandex.go.design.compose.modal.bottomsheet;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.BottomSheetStateExtensionsKt", f = "BottomSheetStateExtensions.kt", l = {139}, m = "waitForCardMeasure", v = 2)
/* loaded from: classes12.dex */
final class BottomSheetStateExtensionsKt$waitForCardMeasure$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.c(null, this);
    }
}
