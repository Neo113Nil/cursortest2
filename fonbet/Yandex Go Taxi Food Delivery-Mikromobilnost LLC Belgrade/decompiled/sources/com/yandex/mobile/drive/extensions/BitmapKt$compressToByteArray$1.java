package com.yandex.mobile.drive.extensions;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mobile.drive.extensions.BitmapKt", f = "Bitmap.kt", l = {10}, m = "compressToByteArray")
/* loaded from: classes15.dex */
final class BitmapKt$compressToByteArray$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, 0, this);
    }
}
