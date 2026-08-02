package com.yandex.go.design.compose.images;

import defpackage.igd;
import defpackage.kfv;
import defpackage.mgd;
import defpackage.n8v;
import defpackage.ny61;
import defpackage.tbv;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(igd igdVar, tbv tbvVar, kfv kfvVar, mgd mgdVar, ContinuationImpl continuationImpl) {
        ImageLoaderExtensionsKt$safeLoadImage$1 imageLoaderExtensionsKt$safeLoadImage$1;
        int i;
        try {
            if (continuationImpl instanceof ImageLoaderExtensionsKt$safeLoadImage$1) {
                imageLoaderExtensionsKt$safeLoadImage$1 = (ImageLoaderExtensionsKt$safeLoadImage$1) continuationImpl;
                int i2 = imageLoaderExtensionsKt$safeLoadImage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    imageLoaderExtensionsKt$safeLoadImage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = imageLoaderExtensionsKt$safeLoadImage$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = imageLoaderExtensionsKt$safeLoadImage$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        imageLoaderExtensionsKt$safeLoadImage$1.L$0 = null;
                        imageLoaderExtensionsKt$safeLoadImage$1.L$1 = null;
                        imageLoaderExtensionsKt$safeLoadImage$1.L$2 = null;
                        imageLoaderExtensionsKt$safeLoadImage$1.L$3 = null;
                        imageLoaderExtensionsKt$safeLoadImage$1.label = 1;
                        obj = igdVar.a(tbvVar, kfvVar, mgdVar, imageLoaderExtensionsKt$safeLoadImage$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (n8v) obj;
                }
            }
            if (i != 0) {
            }
            return (n8v) obj;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            return null;
        }
        imageLoaderExtensionsKt$safeLoadImage$1 = new ImageLoaderExtensionsKt$safeLoadImage$1(continuationImpl);
        Object obj3 = imageLoaderExtensionsKt$safeLoadImage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageLoaderExtensionsKt$safeLoadImage$1.label;
    }
}
