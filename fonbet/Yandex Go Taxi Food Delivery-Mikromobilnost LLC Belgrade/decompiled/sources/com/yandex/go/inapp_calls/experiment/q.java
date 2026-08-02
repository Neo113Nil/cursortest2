package com.yandex.go.inapp_calls.experiment;

import defpackage.jbh;
import defpackage.mz31;
import defpackage.ny61;
import defpackage.nz31;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.vri0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class q {
    public final ru.yandex.taxi.experiments.q a;
    public final ru.yandex.taxi.experiments.q b;
    public final ru.yandex.taxi.experiments.q c;
    public final t1b0 d;

    public q(rqo rqoVar) {
        RegsConnectionRetryExperiment.Companion.getClass();
        jbh jbhVar = (jbh) rqoVar;
        this.a = jbhVar.d(RegsConnectionRetryExperiment.f);
        VoipCallHangupConfirmationExperiment.Companion.getClass();
        this.b = jbhVar.d(VoipCallHangupConfirmationExperiment.d);
        VoipCallUiRedesignExperiment.Companion.getClass();
        this.c = jbhVar.d(VoipCallUiRedesignExperiment.c);
        InAppCallExperiment.Companion.getClass();
        this.d = jbhVar.e(InAppCallExperiment.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1 inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1;
        int i;
        if (continuationImpl instanceof InAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1) {
            inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1 = (InAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1) continuationImpl;
            int i2 = inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.label = 1;
                    obj = this.a.b(inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                RegsConnectionRetryExperiment regsConnectionRetryExperiment = (RegsConnectionRetryExperiment) obj;
                return new vri0(regsConnectionRetryExperiment.c, regsConnectionRetryExperiment.d, regsConnectionRetryExperiment.e, regsConnectionRetryExperiment.b);
            }
        }
        inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1 = new InAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1(this, continuationImpl);
        Object obj2 = inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsExperimentsRepository$getRegsConnectionRetryExperimentData$1.label;
        if (i != 0) {
        }
        RegsConnectionRetryExperiment regsConnectionRetryExperiment2 = (RegsConnectionRetryExperiment) obj2;
        return new vri0(regsConnectionRetryExperiment2.c, regsConnectionRetryExperiment2.d, regsConnectionRetryExperiment2.e, regsConnectionRetryExperiment2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        InAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1 inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1;
        int i;
        if (continuationImpl instanceof InAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1) {
            inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1 = (InAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1) continuationImpl;
            int i2 = inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.label = 1;
                    obj = this.b.b(inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                VoipCallHangupConfirmationExperiment voipCallHangupConfirmationExperiment = (VoipCallHangupConfirmationExperiment) obj;
                return new mz31(voipCallHangupConfirmationExperiment.b, voipCallHangupConfirmationExperiment.c);
            }
        }
        inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1 = new InAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1(this, continuationImpl);
        Object obj2 = inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsExperimentsRepository$getVoipCallHangupConfirmationExperimentData$1.label;
        if (i != 0) {
        }
        VoipCallHangupConfirmationExperiment voipCallHangupConfirmationExperiment2 = (VoipCallHangupConfirmationExperiment) obj2;
        return new mz31(voipCallHangupConfirmationExperiment2.b, voipCallHangupConfirmationExperiment2.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        InAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1 inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1;
        int i;
        if (continuationImpl instanceof InAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1) {
            inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1 = (InAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1) continuationImpl;
            int i2 = inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.label = 1;
                    obj = this.c.b(inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new nz31(((VoipCallUiRedesignExperiment) obj).b);
            }
        }
        inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1 = new InAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1(this, continuationImpl);
        Object obj2 = inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsExperimentsRepository$getVoipCallUiRedesignExperimentData$1.label;
        if (i != 0) {
        }
        return new nz31(((VoipCallUiRedesignExperiment) obj2).b);
    }
}
