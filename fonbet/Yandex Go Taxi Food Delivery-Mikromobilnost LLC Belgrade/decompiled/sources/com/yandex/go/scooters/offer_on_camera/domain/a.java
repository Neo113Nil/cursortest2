package com.yandex.go.scooters.offer_on_camera.domain;

import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import defpackage.a8p0;
import defpackage.b8p0;
import defpackage.fi9;
import defpackage.mxm0;
import defpackage.ny61;
import defpackage.o4o0;
import defpackage.p4o0;
import defpackage.ppo0;
import defpackage.pz40;
import defpackage.qoo0;
import defpackage.qpo0;
import defpackage.r4n0;
import defpackage.r7p0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uoo0;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w2o0;
import defpackage.w3b1;
import defpackage.y7p0;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class a {
    public final tt2 a;
    public final qoo0 b;
    public final uoo0 c;
    public final w2o0 d;
    public final p4o0 e;
    public final mxm0 f;

    public a(tt2 tt2Var, qoo0 qoo0Var, uoo0 uoo0Var, w2o0 w2o0Var, p4o0 p4o0Var, mxm0 mxm0Var) {
        this.a = tt2Var;
        this.b = qoo0Var;
        this.c = uoo0Var;
        this.d = w2o0Var;
        this.e = p4o0Var;
        this.f = mxm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(a aVar, pz40 pz40Var, ContinuationImpl continuationImpl) {
        ScootersOfferOnCameraInteractor$listenNumberRemoving$1 scootersOfferOnCameraInteractor$listenNumberRemoving$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersOfferOnCameraInteractor$listenNumberRemoving$1) {
            scootersOfferOnCameraInteractor$listenNumberRemoving$1 = (ScootersOfferOnCameraInteractor$listenNumberRemoving$1) continuationImpl;
            int i2 = scootersOfferOnCameraInteractor$listenNumberRemoving$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferOnCameraInteractor$listenNumberRemoving$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferOnCameraInteractor$listenNumberRemoving$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferOnCameraInteractor$listenNumberRemoving$1.label;
                if (i != 0) {
                    b.b(obj);
                    vpr r4n0Var = new r4n0(19, aVar);
                    scootersOfferOnCameraInteractor$listenNumberRemoving$1.L$0 = null;
                    scootersOfferOnCameraInteractor$listenNumberRemoving$1.label = 1;
                    if (pz40Var.collect(r4n0Var, scootersOfferOnCameraInteractor$listenNumberRemoving$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        scootersOfferOnCameraInteractor$listenNumberRemoving$1 = new ScootersOfferOnCameraInteractor$listenNumberRemoving$1(aVar, continuationImpl);
        Object obj2 = scootersOfferOnCameraInteractor$listenNumberRemoving$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferOnCameraInteractor$listenNumberRemoving$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }

    public final tpr b(qpo0 qpo0Var) {
        fi9 i = e.i(new ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1(qpo0Var, this, null));
        this.a.getClass();
        return e.F(i, uyj.a);
    }

    public final o4o0 c(ppo0 ppo0Var) {
        b8p0 a8p0Var;
        r7p0 r7p0Var = (r7p0) kotlin.collections.a.t0(ppo0Var.b);
        zzs zzsVar = ppo0Var.a;
        if (r7p0Var == null) {
            if (zzsVar == null) {
                zzsVar = zzs.f;
            }
            a8p0Var = new y7p0(zzsVar, ppo0Var.b);
        } else {
            if (zzsVar == null) {
                zzsVar = zzs.f;
            }
            a8p0Var = new a8p0(zzsVar, r7p0Var);
        }
        String c = w3b1.c(ppo0Var.c);
        return p4o0.a(this.e, ScootersOffersPresentationState$LaunchContext.ON_CAMERA, a8p0Var, c, null, 24);
    }
}
