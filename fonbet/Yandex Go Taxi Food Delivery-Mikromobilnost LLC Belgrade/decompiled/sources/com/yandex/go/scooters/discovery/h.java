package com.yandex.go.scooters.discovery;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements tpr {
    public final /* synthetic */ f a;

    public h(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersDiscoveryPresenter$listenFallback$$inlined$map$1$1 scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersDiscoveryPresenter$listenFallback$$inlined$map$1$1) {
            scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1 = (ScootersDiscoveryPresenter$listenFallback$$inlined$map$1$1) continuation;
            int i2 = scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar);
                    scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.L$0 = null;
                    scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.L$1 = null;
                    scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.L$2 = null;
                    scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1 = new ScootersDiscoveryPresenter$listenFallback$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryPresenter$listenFallback$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
