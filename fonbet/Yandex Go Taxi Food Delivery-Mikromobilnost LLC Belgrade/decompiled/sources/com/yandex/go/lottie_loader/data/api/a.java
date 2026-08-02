package com.yandex.go.lottie_loader.data.api;

import defpackage.cmt;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.rvj0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x6v;
import defpackage.zn1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final i3y b;

    public a(on2 on2Var, tt2 tt2Var) {
        this.a = tt2Var;
        this.b = kotlin.a.a(new zn1(on2Var, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LottieApi$downloadAnimationFile$1 lottieApi$downloadAnimationFile$1;
        int i;
        if (continuationImpl instanceof LottieApi$downloadAnimationFile$1) {
            lottieApi$downloadAnimationFile$1 = (LottieApi$downloadAnimationFile$1) continuationImpl;
            int i2 = lottieApi$downloadAnimationFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieApi$downloadAnimationFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lottieApi$downloadAnimationFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieApi$downloadAnimationFile$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<rvj0> a = ((LottieInternalApi) this.b.getValue()).a(str, x6v.a);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    LottieApi$downloadAnimationFile$response$1 lottieApi$downloadAnimationFile$response$1 = new LottieApi$downloadAnimationFile$response$1(a, null);
                    lottieApi$downloadAnimationFile$1.L$0 = null;
                    lottieApi$downloadAnimationFile$1.L$1 = null;
                    lottieApi$downloadAnimationFile$1.label = 1;
                    obj = tje.k0(mdhVar, lottieApi$downloadAnimationFile$response$1, lottieApi$downloadAnimationFile$1);
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
                return ((rvj0) obj).byteStream();
            }
        }
        lottieApi$downloadAnimationFile$1 = new LottieApi$downloadAnimationFile$1(this, continuationImpl);
        Object obj2 = lottieApi$downloadAnimationFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieApi$downloadAnimationFile$1.label;
        if (i != 0) {
        }
        return ((rvj0) obj2).byteStream();
    }
}
