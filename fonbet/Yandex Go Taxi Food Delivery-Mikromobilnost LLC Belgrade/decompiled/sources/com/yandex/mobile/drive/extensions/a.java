package com.yandex.mobile.drive.extensions;

import android.graphics.Bitmap;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, ContinuationImpl continuationImpl) {
        BitmapKt$compressToByteArray$1 bitmapKt$compressToByteArray$1;
        int i2;
        if (continuationImpl instanceof BitmapKt$compressToByteArray$1) {
            bitmapKt$compressToByteArray$1 = (BitmapKt$compressToByteArray$1) continuationImpl;
            int i3 = bitmapKt$compressToByteArray$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bitmapKt$compressToByteArray$1.label = i3 - Integer.MIN_VALUE;
                Object obj = bitmapKt$compressToByteArray$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bitmapKt$compressToByteArray$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    BitmapKt$compressToByteArray$2 bitmapKt$compressToByteArray$2 = new BitmapKt$compressToByteArray$2(bitmap, compressFormat, i, null);
                    bitmapKt$compressToByteArray$1.L$0 = null;
                    bitmapKt$compressToByteArray$1.L$1 = null;
                    bitmapKt$compressToByteArray$1.I$0 = i;
                    bitmapKt$compressToByteArray$1.label = 1;
                    obj = tje.k0(mdhVar, bitmapKt$compressToByteArray$2, bitmapKt$compressToByteArray$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return obj;
            }
        }
        bitmapKt$compressToByteArray$1 = new BitmapKt$compressToByteArray$1(continuationImpl);
        Object obj2 = bitmapKt$compressToByteArray$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = bitmapKt$compressToByteArray$1.label;
        if (i2 != 0) {
        }
        return obj2;
    }
}
