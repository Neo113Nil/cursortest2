package com.ybsdk.feature.pfm.internal.data.mappers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pfm.internal.data.mappers.PfmResponseFunFactMapperKt", f = "PfmResponseFunFactMapper.kt", l = {20}, m = "toYbDivData")
/* loaded from: classes3.dex */
final class PfmResponseFunFactMapperKt$toYbDivData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(null, this);
    }
}
