package com.yandex.go.antirobot.experiment;

import com.yandex.go.antirobot.api.HostType;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.lso;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes.dex */
public final class b {
    public final t1b0 a;

    public b(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(AntirobotExperiment.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AntirobotExperimentRepositoryImpl$authChallengeExplainStrings$1 antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1;
        int i;
        String Y;
        String Y2;
        if (continuationImpl instanceof AntirobotExperimentRepositoryImpl$authChallengeExplainStrings$1) {
            antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1 = (AntirobotExperimentRepositoryImpl$authChallengeExplainStrings$1) continuationImpl;
            int i2 = antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.label = 1;
                    obj = this.a.b(antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1);
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
                AntirobotExperiment antirobotExperiment = (AntirobotExperiment) obj;
                Y = d6z.Y(antirobotExperiment, antirobotExperiment.e);
                if (evu0.J(Y)) {
                    Y = null;
                }
                Y2 = d6z.Y(antirobotExperiment, antirobotExperiment.g);
                if (evu0.J(Y2)) {
                    Y2 = null;
                }
                String Y3 = d6z.Y(antirobotExperiment, antirobotExperiment.f);
                return new lso(Y, Y2, evu0.J(Y3) ? null : Y3);
            }
        }
        antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1 = new AntirobotExperimentRepositoryImpl$authChallengeExplainStrings$1(this, continuationImpl);
        Object obj2 = antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = antirobotExperimentRepositoryImpl$authChallengeExplainStrings$1.label;
        if (i != 0) {
        }
        AntirobotExperiment antirobotExperiment2 = (AntirobotExperiment) obj2;
        Y = d6z.Y(antirobotExperiment2, antirobotExperiment2.e);
        if (evu0.J(Y)) {
        }
        Y2 = d6z.Y(antirobotExperiment2, antirobotExperiment2.g);
        if (evu0.J(Y2)) {
        }
        String Y32 = d6z.Y(antirobotExperiment2, antirobotExperiment2.f);
        return new lso(Y, Y2, evu0.J(Y32) ? null : Y32);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(ContinuationImpl continuationImpl) {
        AntirobotExperimentRepositoryImpl$host$1 antirobotExperimentRepositoryImpl$host$1;
        int i;
        if (continuationImpl instanceof AntirobotExperimentRepositoryImpl$host$1) {
            antirobotExperimentRepositoryImpl$host$1 = (AntirobotExperimentRepositoryImpl$host$1) continuationImpl;
            int i2 = antirobotExperimentRepositoryImpl$host$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                antirobotExperimentRepositoryImpl$host$1.label = i2 - Integer.MIN_VALUE;
                Object obj = antirobotExperimentRepositoryImpl$host$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = antirobotExperimentRepositoryImpl$host$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    antirobotExperimentRepositoryImpl$host$1.label = 1;
                    obj = this.a.b(antirobotExperimentRepositoryImpl$host$1);
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
                return !jl40.l(((AntirobotExperiment) obj).c, TariffOrderFlow.ORDER_FLOW_TAXI_KEY) ? HostType.Taxi : HostType.Narwhal;
            }
        }
        antirobotExperimentRepositoryImpl$host$1 = new AntirobotExperimentRepositoryImpl$host$1(this, continuationImpl);
        Object obj2 = antirobotExperimentRepositoryImpl$host$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = antirobotExperimentRepositoryImpl$host$1.label;
        if (i != 0) {
        }
        if (!jl40.l(((AntirobotExperiment) obj2).c, TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        AntirobotExperimentRepositoryImpl$isEnabled$1 antirobotExperimentRepositoryImpl$isEnabled$1;
        int i;
        if (continuationImpl instanceof AntirobotExperimentRepositoryImpl$isEnabled$1) {
            antirobotExperimentRepositoryImpl$isEnabled$1 = (AntirobotExperimentRepositoryImpl$isEnabled$1) continuationImpl;
            int i2 = antirobotExperimentRepositoryImpl$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                antirobotExperimentRepositoryImpl$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = antirobotExperimentRepositoryImpl$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = antirobotExperimentRepositoryImpl$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    antirobotExperimentRepositoryImpl$isEnabled$1.label = 1;
                    obj = this.a.b(antirobotExperimentRepositoryImpl$isEnabled$1);
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
                return Boolean.valueOf(((AntirobotExperiment) obj).b);
            }
        }
        antirobotExperimentRepositoryImpl$isEnabled$1 = new AntirobotExperimentRepositoryImpl$isEnabled$1(this, continuationImpl);
        Object obj2 = antirobotExperimentRepositoryImpl$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = antirobotExperimentRepositoryImpl$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((AntirobotExperiment) obj2).b);
    }
}
