package com.yandex.messaging.domain;

import defpackage.el21;
import defpackage.g6u;
import defpackage.kse;
import defpackage.ny61;
import defpackage.tje;
import defpackage.y9i0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class j {
    public final el21 a;
    public final kse b;

    public j(el21 el21Var, kse kseVar) {
        this.a = el21Var;
        this.b = kseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y9i0 y9i0Var, ContinuationImpl continuationImpl) {
        ProcessCloudMessageUseCase$execute$1 processCloudMessageUseCase$execute$1;
        int i;
        if (continuationImpl instanceof ProcessCloudMessageUseCase$execute$1) {
            processCloudMessageUseCase$execute$1 = (ProcessCloudMessageUseCase$execute$1) continuationImpl;
            int i2 = processCloudMessageUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processCloudMessageUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = processCloudMessageUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processCloudMessageUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g6u g6uVar = this.b.e;
                    ProcessCloudMessageUseCase$execute$2 processCloudMessageUseCase$execute$2 = new ProcessCloudMessageUseCase$execute$2(this, y9i0Var, null);
                    processCloudMessageUseCase$execute$1.label = 1;
                    if (tje.k0(g6uVar, processCloudMessageUseCase$execute$2, processCloudMessageUseCase$execute$1) == coroutineSingletons) {
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
        processCloudMessageUseCase$execute$1 = new ProcessCloudMessageUseCase$execute$1(this, continuationImpl);
        Object obj2 = processCloudMessageUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processCloudMessageUseCase$execute$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
