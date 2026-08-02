package com.yandex.go.flex.common.api;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.flex.common.api.FlexGeoParamsRepositoryKt", f = "FlexGeoParamsRepository.kt", l = {31}, m = "awaitSelectedPosition", v = 2)
/* loaded from: classes.dex */
final class FlexGeoParamsRepositoryKt$awaitSelectedPosition$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(null, this);
    }
}
