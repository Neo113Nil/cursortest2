package com.yandex.go.design.compose.images;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.design.compose.images.ImageLoaderExtensionsKt", f = "ImageLoaderExtensions.kt", l = {8}, m = "safeLoadImage", v = 2)
/* loaded from: classes12.dex */
final class ImageLoaderExtensionsKt$safeLoadImage$1 extends ContinuationImpl {
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
        return a.a(null, null, null, null, this);
    }
}
