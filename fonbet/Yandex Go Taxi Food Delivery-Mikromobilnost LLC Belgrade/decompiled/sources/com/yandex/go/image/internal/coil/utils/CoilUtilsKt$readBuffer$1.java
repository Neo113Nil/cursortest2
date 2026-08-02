package com.yandex.go.image.internal.coil.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.image.internal.coil.utils.CoilUtilsKt", f = "CoilUtils.kt", l = {29}, m = "readBuffer", v = 2)
/* loaded from: classes.dex */
final class CoilUtilsKt$readBuffer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(null, this);
    }
}
