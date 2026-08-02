package com.yandex.go.scooters.qr.domain;

import defpackage.jpo0;
import defpackage.jqo0;
import defpackage.lqo0;
import defpackage.ny61;
import defpackage.suo0;
import defpackage.tt2;
import defpackage.w511;
import defpackage.yln0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final tt2 a;
    public final e b;
    public final jpo0 c;
    public final lqo0 d;
    public final com.yandex.go.scooters.qr.domain.result.a e;

    public d(tt2 tt2Var, e eVar, jpo0 jpo0Var, lqo0 lqo0Var, com.yandex.go.scooters.qr.domain.result.a aVar) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = jpo0Var;
        this.d = lqo0Var;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jqo0 jqo0Var, ContinuationImpl continuationImpl) {
        ScootersQrScanInteractorFactory$create$1 scootersQrScanInteractorFactory$create$1;
        int i;
        tt2 tt2Var;
        e eVar;
        jpo0 jpo0Var;
        if (continuationImpl instanceof ScootersQrScanInteractorFactory$create$1) {
            scootersQrScanInteractorFactory$create$1 = (ScootersQrScanInteractorFactory$create$1) continuationImpl;
            int i2 = scootersQrScanInteractorFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrScanInteractorFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersQrScanInteractorFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrScanInteractorFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jqo0Var == null) {
                        w511.b();
                        return null;
                    }
                    scootersQrScanInteractorFactory$create$1.L$0 = null;
                    tt2Var = this.a;
                    scootersQrScanInteractorFactory$create$1.L$1 = tt2Var;
                    e eVar2 = this.b;
                    scootersQrScanInteractorFactory$create$1.L$2 = eVar2;
                    jpo0 jpo0Var2 = this.c;
                    scootersQrScanInteractorFactory$create$1.L$3 = jpo0Var2;
                    scootersQrScanInteractorFactory$create$1.label = 1;
                    Object a = this.e.a(scootersQrScanInteractorFactory$create$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar = eVar2;
                    jpo0Var = jpo0Var2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpo0 jpo0Var3 = (jpo0) scootersQrScanInteractorFactory$create$1.L$3;
                    e eVar3 = (e) scootersQrScanInteractorFactory$create$1.L$2;
                    tt2Var = (tt2) scootersQrScanInteractorFactory$create$1.L$1;
                    kotlin.b.b(obj);
                    jpo0Var = jpo0Var3;
                    eVar = eVar3;
                }
                return new yln0(tt2Var, eVar, jpo0Var, (suo0) obj, this.d);
            }
        }
        scootersQrScanInteractorFactory$create$1 = new ScootersQrScanInteractorFactory$create$1(this, continuationImpl);
        Object obj2 = scootersQrScanInteractorFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrScanInteractorFactory$create$1.label;
        if (i != 0) {
        }
        return new yln0(tt2Var, eVar, jpo0Var, (suo0) obj2, this.d);
    }
}
