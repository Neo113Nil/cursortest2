package com.yandex.go.location.provider;

import android.hardware.SensorManager;
import defpackage.ny61;
import defpackage.qwc;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qwc b;

    public c(vpr vprVar, qwc qwcVar) {
        this.a = vprVar;
        this.b = qwcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1 compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1) {
            compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1 = (CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1) continuation;
            int i2 = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qwc qwcVar = this.b;
                    float[] fArr = qwcVar.e;
                    SensorManager.getRotationMatrixFromVector(fArr, (float[]) obj);
                    SensorManager.getOrientation(fArr, qwcVar.f);
                    Float f = new Float((float) Math.toDegrees(r6[0]));
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.L$0 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.L$1 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.L$2 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.L$3 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1 = new CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
