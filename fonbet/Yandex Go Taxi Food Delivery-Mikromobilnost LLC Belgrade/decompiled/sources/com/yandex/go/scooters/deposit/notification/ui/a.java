package com.yandex.go.scooters.deposit.notification.ui;

import com.yandex.go.scooters.deposit.experiments.model.ScootersDepositCommunicationExperiment;
import defpackage.cno0;
import defpackage.d6z;
import defpackage.e1f0;
import defpackage.gen0;
import defpackage.ny61;
import defpackage.rdn0;
import defpackage.tdn0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final cno0 a;
    public final tdn0 b;

    public a(cno0 cno0Var, tdn0 tdn0Var) {
        this.a = cno0Var;
        this.b = tdn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rdn0 rdn0Var, ContinuationImpl continuationImpl) {
        ScootersDepositNotificationUiStateInteractor$prepareUiState$1 scootersDepositNotificationUiStateInteractor$prepareUiState$1;
        int i;
        if (continuationImpl instanceof ScootersDepositNotificationUiStateInteractor$prepareUiState$1) {
            scootersDepositNotificationUiStateInteractor$prepareUiState$1 = (ScootersDepositNotificationUiStateInteractor$prepareUiState$1) continuationImpl;
            int i2 = scootersDepositNotificationUiStateInteractor$prepareUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDepositNotificationUiStateInteractor$prepareUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDepositNotificationUiStateInteractor$prepareUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDepositNotificationUiStateInteractor$prepareUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersDepositNotificationUiStateInteractor$prepareUiState$1.L$0 = rdn0Var;
                    scootersDepositNotificationUiStateInteractor$prepareUiState$1.label = 1;
                    obj = this.b.a.b(scootersDepositNotificationUiStateInteractor$prepareUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rdn0Var = (rdn0) scootersDepositNotificationUiStateInteractor$prepareUiState$1.L$0;
                    b.b(obj);
                }
                ScootersDepositCommunicationExperiment scootersDepositCommunicationExperiment = (ScootersDepositCommunicationExperiment) obj;
                String b = this.a.b(rdn0Var.b, d6z.Y(scootersDepositCommunicationExperiment, scootersDepositCommunicationExperiment.d.a).concat(" %s"), new e1f0(new Integer(rdn0Var.a).doubleValue()));
                String str = scootersDepositCommunicationExperiment.d.b;
                return new gen0(b, str != null ? d6z.Y(scootersDepositCommunicationExperiment, str) : null);
            }
        }
        scootersDepositNotificationUiStateInteractor$prepareUiState$1 = new ScootersDepositNotificationUiStateInteractor$prepareUiState$1(this, continuationImpl);
        Object obj2 = scootersDepositNotificationUiStateInteractor$prepareUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDepositNotificationUiStateInteractor$prepareUiState$1.label;
        if (i != 0) {
        }
        ScootersDepositCommunicationExperiment scootersDepositCommunicationExperiment2 = (ScootersDepositCommunicationExperiment) obj2;
        String b2 = this.a.b(rdn0Var.b, d6z.Y(scootersDepositCommunicationExperiment2, scootersDepositCommunicationExperiment2.d.a).concat(" %s"), new e1f0(new Integer(rdn0Var.a).doubleValue()));
        String str2 = scootersDepositCommunicationExperiment2.d.b;
        return new gen0(b2, str2 != null ? d6z.Y(scootersDepositCommunicationExperiment2, str2) : null);
    }
}
