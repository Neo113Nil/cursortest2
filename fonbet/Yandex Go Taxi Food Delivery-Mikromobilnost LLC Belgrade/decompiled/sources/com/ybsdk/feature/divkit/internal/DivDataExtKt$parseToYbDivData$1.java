package com.ybsdk.feature.divkit.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.DivDataExtKt", f = "DivDataExt.kt", l = {8}, m = "parseToYbDivData")
/* loaded from: classes3.dex */
final class DivDataExtKt$parseToYbDivData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
