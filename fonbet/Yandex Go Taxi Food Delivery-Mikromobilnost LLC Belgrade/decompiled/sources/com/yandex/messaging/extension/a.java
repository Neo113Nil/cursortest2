package com.yandex.messaging.extension;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bgc;
import defpackage.bvf0;
import defpackage.ex0;
import defpackage.it10;
import defpackage.jse;
import defpackage.jt10;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vmz;
import defpackage.yn50;
import java.io.File;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public abstract class a {
    public static pzt0 a(yn50 yn50Var, ImageView imageView, tse tseVar, tls tlsVar, ex0 ex0Var, tls tlsVar2, int i) {
        if ((i & 2) != 0) {
            sjh sjhVar = uyj.a;
            tseVar = bvf0.a(o400.a.x);
        }
        sls slsVar = ex0Var;
        if ((i & 8) != 0) {
            slsVar = new bgc(12);
        }
        return tje.N(tseVar, null, null, new ImagesExtensionsKt$loadInto$4(yn50Var, imageView, slsVar, tlsVar2, tlsVar, null), 3);
    }

    public static pzt0 b(yn50 yn50Var, AppCompatImageView appCompatImageView, long j, int i, pzt0 pzt0Var, jse jseVar, it10 it10Var, jt10 jt10Var, jt10 jt10Var2, vmz vmzVar) {
        sjh sjhVar = uyj.a;
        return tje.N(bvf0.a(o400.a), null, null, new ImagesExtensionsKt$loadIntoAnimated$5(jseVar, yn50Var, it10Var, appCompatImageView, vmzVar, jt10Var, jt10Var2, pzt0Var, j, i, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yn50 yn50Var, ContinuationImpl continuationImpl) {
        ImagesExtensionsKt$suspendLoadFile$1 imagesExtensionsKt$suspendLoadFile$1;
        int i;
        File file;
        if (continuationImpl instanceof ImagesExtensionsKt$suspendLoadFile$1) {
            imagesExtensionsKt$suspendLoadFile$1 = (ImagesExtensionsKt$suspendLoadFile$1) continuationImpl;
            int i2 = imagesExtensionsKt$suspendLoadFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imagesExtensionsKt$suspendLoadFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imagesExtensionsKt$suspendLoadFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imagesExtensionsKt$suspendLoadFile$1.label;
                if (i != 0) {
                    b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ImagesExtensionsKt$suspendLoadFile$loadedFile$1 imagesExtensionsKt$suspendLoadFile$loadedFile$1 = new ImagesExtensionsKt$suspendLoadFile$loadedFile$1(yn50Var, null);
                    imagesExtensionsKt$suspendLoadFile$1.label = 1;
                    obj = tje.k0(mdhVar, imagesExtensionsKt$suspendLoadFile$loadedFile$1, imagesExtensionsKt$suspendLoadFile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                file = (File) obj;
                if (file == null && file.exists()) {
                    return file;
                }
                return null;
            }
        }
        imagesExtensionsKt$suspendLoadFile$1 = new ImagesExtensionsKt$suspendLoadFile$1(continuationImpl);
        Object obj2 = imagesExtensionsKt$suspendLoadFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imagesExtensionsKt$suspendLoadFile$1.label;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file == null) {
        }
        return null;
    }
}
