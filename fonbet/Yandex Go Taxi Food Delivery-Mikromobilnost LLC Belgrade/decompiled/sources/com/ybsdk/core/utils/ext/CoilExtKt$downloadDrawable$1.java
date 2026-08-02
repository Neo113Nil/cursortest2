package com.ybsdk.core.utils.ext;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.ext.CoilExtKt", f = "CoilExt.kt", l = {128}, m = "downloadDrawable")
/* loaded from: classes11.dex */
final class CoilExtKt$downloadDrawable$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public CoilExtKt$downloadDrawable$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(null, null, null, false, this);
    }
}
