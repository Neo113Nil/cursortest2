package com.yandex.go.scooters.ble;

import com.yandex.go.scooters.ble.domain.model.ScootersBleCommandType;
import defpackage.e1n0;
import defpackage.h1n0;
import defpackage.ny61;
import defpackage.o1n0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements h1n0 {
    public final o1n0 a;

    public a(o1n0 o1n0Var) {
        this.a = o1n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r6.b(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, e1n0 e1n0Var, ContinuationImpl continuationImpl) {
        ScootersBleInteractorImpl$connect$1 scootersBleInteractorImpl$connect$1;
        int i;
        if (continuationImpl instanceof ScootersBleInteractorImpl$connect$1) {
            scootersBleInteractorImpl$connect$1 = (ScootersBleInteractorImpl$connect$1) continuationImpl;
            int i2 = scootersBleInteractorImpl$connect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBleInteractorImpl$connect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBleInteractorImpl$connect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBleInteractorImpl$connect$1.label;
                o1n0 o1n0Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    scootersBleInteractorImpl$connect$1.L$0 = null;
                    scootersBleInteractorImpl$connect$1.L$1 = e1n0Var;
                    scootersBleInteractorImpl$connect$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    e1n0Var = (e1n0) scootersBleInteractorImpl$connect$1.L$1;
                    b.b(obj);
                }
                ScootersBleCommandType scootersBleCommandType = ScootersBleCommandType.AUTH;
                scootersBleInteractorImpl$connect$1.L$0 = null;
                scootersBleInteractorImpl$connect$1.L$1 = null;
                scootersBleInteractorImpl$connect$1.label = 2;
                Object a = o1n0Var.a(scootersBleCommandType, e1n0Var, scootersBleInteractorImpl$connect$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        scootersBleInteractorImpl$connect$1 = new ScootersBleInteractorImpl$connect$1(this, continuationImpl);
        Object obj2 = scootersBleInteractorImpl$connect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBleInteractorImpl$connect$1.label;
        o1n0 o1n0Var2 = this.a;
        if (i != 0) {
        }
        ScootersBleCommandType scootersBleCommandType2 = ScootersBleCommandType.AUTH;
        scootersBleInteractorImpl$connect$1.L$0 = null;
        scootersBleInteractorImpl$connect$1.L$1 = null;
        scootersBleInteractorImpl$connect$1.label = 2;
        Object a2 = o1n0Var2.a(scootersBleCommandType2, e1n0Var, scootersBleInteractorImpl$connect$1);
        if (a2 != coroutineSingletons2) {
        }
    }

    public final void b() {
        this.a.disconnect();
    }
}
