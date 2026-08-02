package com.yandex.go.scooters.utils;

import defpackage.ah00;
import defpackage.b64;
import defpackage.bh00;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.j18;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u6s0;
import defpackage.uj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(wls wlsVar, Object obj, ContinuationImpl continuationImpl) {
        WebExtensionsKt$awaitInvoke$1 webExtensionsKt$awaitInvoke$1;
        int i;
        if (continuationImpl instanceof WebExtensionsKt$awaitInvoke$1) {
            webExtensionsKt$awaitInvoke$1 = (WebExtensionsKt$awaitInvoke$1) continuationImpl;
            int i2 = webExtensionsKt$awaitInvoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webExtensionsKt$awaitInvoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webExtensionsKt$awaitInvoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webExtensionsKt$awaitInvoke$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    webExtensionsKt$awaitInvoke$1.L$0 = wlsVar;
                    webExtensionsKt$awaitInvoke$1.L$1 = obj;
                    webExtensionsKt$awaitInvoke$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(webExtensionsKt$awaitInvoke$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    cx60 cx60Var = new cx60(16, y);
                    cl7 cl7Var = new cl7(j18Var, cx60Var);
                    wlsVar.invoke(obj, new u6s0(7, new WebExtensionsKt$awaitInvoke$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0)));
                    y.element = uj.K;
                    if (cl7Var.c()) {
                        cx60Var.invoke();
                    } else {
                        j18Var.w(new dx60(cl7Var, 17));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        webExtensionsKt$awaitInvoke$1 = new WebExtensionsKt$awaitInvoke$1(continuationImpl);
        Object obj22 = webExtensionsKt$awaitInvoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webExtensionsKt$awaitInvoke$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public static final tpr b(ah00 ah00Var, bh00 bh00Var) {
        return e.o(e.g(new ScootersMapUtilsKt$listenUserCameraChanges$1(bh00Var, ah00Var, null)));
    }
}
