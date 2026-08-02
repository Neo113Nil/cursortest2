package com.yandex.go.masstransit.sdk.camera.ml;

import androidx.camera.core.f;
import androidx.camera.core.g;
import androidx.camera.core.j;
import com.yandex.go.masstransit.sdk.camera.view.BaseCameraPreview;
import defpackage.fr7;
import defpackage.i5f0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pxe0;
import defpackage.xby;
import defpackage.xs7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(noh nohVar, fr7 fr7Var, xs7 xs7Var, BaseCameraPreview baseCameraPreview, f fVar, ContinuationImpl continuationImpl) {
        CameraProviderExtensionKt$startCamera$1 cameraProviderExtensionKt$startCamera$1;
        int i;
        Object obj;
        try {
            if (continuationImpl instanceof CameraProviderExtensionKt$startCamera$1) {
                cameraProviderExtensionKt$startCamera$1 = (CameraProviderExtensionKt$startCamera$1) continuationImpl;
                int i2 = cameraProviderExtensionKt$startCamera$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cameraProviderExtensionKt$startCamera$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = cameraProviderExtensionKt$startCamera$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cameraProviderExtensionKt$startCamera$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        cameraProviderExtensionKt$startCamera$1.L$0 = null;
                        cameraProviderExtensionKt$startCamera$1.L$1 = fr7Var;
                        cameraProviderExtensionKt$startCamera$1.L$2 = xs7Var;
                        cameraProviderExtensionKt$startCamera$1.L$3 = baseCameraPreview;
                        cameraProviderExtensionKt$startCamera$1.L$4 = fVar;
                        cameraProviderExtensionKt$startCamera$1.label = 1;
                        obj2 = nohVar.k(cameraProviderExtensionKt$startCamera$1);
                        obj = fVar;
                        if (obj2 == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj4 = (j) cameraProviderExtensionKt$startCamera$1.L$4;
                        baseCameraPreview = (BaseCameraPreview) cameraProviderExtensionKt$startCamera$1.L$3;
                        xs7Var = (xs7) cameraProviderExtensionKt$startCamera$1.L$2;
                        fr7Var = (fr7) cameraProviderExtensionKt$startCamera$1.L$1;
                        kotlin.b.b(obj2);
                        obj = obj4;
                    }
                    i5f0 i5f0Var = (i5f0) obj2;
                    g f = new pxe0().f();
                    baseCameraPreview.attachPreview(f);
                    i5f0Var.g();
                    return i5f0Var.d(fr7Var, xs7Var, f, obj);
                }
            }
            return i5f0Var.d(fr7Var, xs7Var, f, obj);
        } catch (IllegalArgumentException e) {
            xby.d.k(e, "Unable to init camera");
            return null;
        } catch (IllegalStateException e2) {
            xby.d.k(e2, "Unable to init camera");
            return null;
        }
        cameraProviderExtensionKt$startCamera$1 = new CameraProviderExtensionKt$startCamera$1(continuationImpl);
        Object obj22 = cameraProviderExtensionKt$startCamera$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraProviderExtensionKt$startCamera$1.label;
        if (i != 0) {
        }
        i5f0 i5f0Var2 = (i5f0) obj22;
        g f2 = new pxe0().f();
        baseCameraPreview.attachPreview(f2);
        i5f0Var2.g();
    }
}
