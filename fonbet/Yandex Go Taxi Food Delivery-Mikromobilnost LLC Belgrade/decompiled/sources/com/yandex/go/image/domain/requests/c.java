package com.yandex.go.image.domain.requests;

import defpackage.ny61;
import defpackage.tbv;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ tbv b;
    public final /* synthetic */ d c;

    public c(tpr tprVar, tbv tbvVar, d dVar) {
        this.a = tprVar;
        this.b = tbvVar;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$1 coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$1) {
            coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1 = (CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$1) continuation;
            int i2 = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.L$0 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.L$1 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.L$2 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1 = new CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
