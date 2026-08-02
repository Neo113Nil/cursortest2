package com.yandex.messaging.extension;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.extension.ImagesExtensionsKt", f = "ImagesExtensions.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "suspendLoadFile")
/* loaded from: classes15.dex */
final class ImagesExtensionsKt$suspendLoadFile$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(null, this);
    }
}
