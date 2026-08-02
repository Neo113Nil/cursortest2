package com.yandex.go.location.provider;

import defpackage.ny61;
import defpackage.qwc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.k;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ k a;
    public final /* synthetic */ qwc b;

    public d(k kVar, qwc qwcVar) {
        this.a = kVar;
        this.b = qwcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1 compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1) {
            compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1 = (CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1) continuation;
            int i2 = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.L$0 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.L$1 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.L$2 = null;
                    compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1 = new CompassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compassProviderImpl$createCommonRotationVectorFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
