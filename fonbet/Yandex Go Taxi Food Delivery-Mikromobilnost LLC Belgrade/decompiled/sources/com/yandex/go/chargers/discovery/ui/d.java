package com.yandex.go.chargers.discovery.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ b a;

    public d(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersDiscoveryPresenter$attachView$$inlined$map$1$1 chargersDiscoveryPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersDiscoveryPresenter$attachView$$inlined$map$1$1) {
            chargersDiscoveryPresenter$attachView$$inlined$map$1$1 = (ChargersDiscoveryPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = chargersDiscoveryPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscoveryPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscoveryPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscoveryPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    chargersDiscoveryPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    chargersDiscoveryPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    chargersDiscoveryPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    chargersDiscoveryPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, chargersDiscoveryPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersDiscoveryPresenter$attachView$$inlined$map$1$1 = new ChargersDiscoveryPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersDiscoveryPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscoveryPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
