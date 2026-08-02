package com.yandex.go.scooters.offers.v2.surge.info;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class h implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ i b;

    public h(m0 m0Var, i iVar) {
        this.a = m0Var;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1 scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1) {
            scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1 = (ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1 = new ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
