package com.yandex.go.flex.common.loader;

import defpackage.l8x;
import defpackage.ny61;
import defpackage.y4j0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Collection collection, ContinuationImpl continuationImpl) {
        LinkedDocumentLoaderKt$joinAll$1 linkedDocumentLoaderKt$joinAll$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof LinkedDocumentLoaderKt$joinAll$1) {
            linkedDocumentLoaderKt$joinAll$1 = (LinkedDocumentLoaderKt$joinAll$1) continuationImpl;
            int i2 = linkedDocumentLoaderKt$joinAll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedDocumentLoaderKt$joinAll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedDocumentLoaderKt$joinAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedDocumentLoaderKt$joinAll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = collection.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) linkedDocumentLoaderKt$joinAll$1.L$2;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    y4j0 y4j0Var = (y4j0) it.next();
                    linkedDocumentLoaderKt$joinAll$1.L$0 = null;
                    linkedDocumentLoaderKt$joinAll$1.L$1 = null;
                    linkedDocumentLoaderKt$joinAll$1.L$2 = it;
                    linkedDocumentLoaderKt$joinAll$1.L$3 = null;
                    linkedDocumentLoaderKt$joinAll$1.L$4 = null;
                    linkedDocumentLoaderKt$joinAll$1.label = 1;
                    if (kotlinx.coroutines.a.q(new l8x[]{y4j0Var.b, y4j0Var.d}, linkedDocumentLoaderKt$joinAll$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        linkedDocumentLoaderKt$joinAll$1 = new LinkedDocumentLoaderKt$joinAll$1(continuationImpl);
        Object obj2 = linkedDocumentLoaderKt$joinAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedDocumentLoaderKt$joinAll$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
