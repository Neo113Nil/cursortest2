package com.yandex.go.scooters.qr.domain;

import android.graphics.Rect;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.ypo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1 scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1) {
            scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1 = (ScootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1) continuation;
            int i2 = scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ypo0 ypo0Var = new ypo0((Rect) obj);
                    scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.L$0 = null;
                    scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.L$1 = null;
                    scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.L$2 = null;
                    scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.L$3 = null;
                    scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ypo0Var, scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1 = new ScootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFindAnyNumberInteractor$listenAction$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
