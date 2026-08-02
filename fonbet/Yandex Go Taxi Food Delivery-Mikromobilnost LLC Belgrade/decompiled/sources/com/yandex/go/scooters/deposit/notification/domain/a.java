package com.yandex.go.scooters.deposit.notification.domain;

import com.yandex.go.scooters.deposit.experiments.model.ScootersDepositCommunicationExperiment;
import defpackage.hen0;
import defpackage.ny61;
import defpackage.qwo0;
import defpackage.tdn0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final qwo0 a;
    public final hen0 b;
    public final tdn0 c;

    public a(qwo0 qwo0Var, hen0 hen0Var, tdn0 tdn0Var) {
        this.a = qwo0Var;
        this.b = hen0Var;
        this.c = tdn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (((java.lang.Number) r4.g.getValue(r4, defpackage.qwo0.B[5])).intValue() < r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersDepositNotificationInteractor$needNotification$1 scootersDepositNotificationInteractor$needNotification$1;
        int i;
        ScootersDepositCommunicationExperiment scootersDepositCommunicationExperiment;
        if (continuationImpl instanceof ScootersDepositNotificationInteractor$needNotification$1) {
            scootersDepositNotificationInteractor$needNotification$1 = (ScootersDepositNotificationInteractor$needNotification$1) continuationImpl;
            int i2 = scootersDepositNotificationInteractor$needNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDepositNotificationInteractor$needNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDepositNotificationInteractor$needNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDepositNotificationInteractor$needNotification$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    scootersDepositNotificationInteractor$needNotification$1.label = 1;
                    obj = this.c.a.b(scootersDepositNotificationInteractor$needNotification$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                scootersDepositCommunicationExperiment = (ScootersDepositCommunicationExperiment) obj;
                if (scootersDepositCommunicationExperiment.b) {
                    int i3 = scootersDepositCommunicationExperiment.d.c;
                    qwo0 qwo0Var = this.a;
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        scootersDepositNotificationInteractor$needNotification$1 = new ScootersDepositNotificationInteractor$needNotification$1(this, continuationImpl);
        Object obj2 = scootersDepositNotificationInteractor$needNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDepositNotificationInteractor$needNotification$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        scootersDepositCommunicationExperiment = (ScootersDepositCommunicationExperiment) obj2;
        if (scootersDepositCommunicationExperiment.b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
