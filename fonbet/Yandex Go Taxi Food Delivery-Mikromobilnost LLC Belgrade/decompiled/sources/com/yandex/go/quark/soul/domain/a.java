package com.yandex.go.quark.soul.domain;

import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import defpackage.d6z;
import defpackage.g9t0;
import defpackage.nl1;
import defpackage.ny61;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final g9t0 a;

    public a(g9t0 g9t0Var) {
        this.a = g9t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SoulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1 soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1;
        int i;
        if (continuationImpl instanceof SoulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1) {
            soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1 = (SoulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1) continuationImpl;
            int i2 = soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.label;
                if (i != 0) {
                    b.b(obj);
                    soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.label = 1;
                    obj = this.a.a.b(soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1);
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
                SoulAiAssistantExperiment soulAiAssistantExperiment = (SoulAiAssistantExperiment) obj;
                SoulAiAssistantExperiment.ErrorScreen errorScreen = soulAiAssistantExperiment.e;
                return new nl1(d6z.Y(soulAiAssistantExperiment, errorScreen.a), d6z.Y(soulAiAssistantExperiment, errorScreen.b), d6z.Y(soulAiAssistantExperiment, errorScreen.c));
            }
        }
        soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1 = new SoulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1(this, continuationImpl);
        Object obj2 = soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soulAiAssistantConfigurationInteractorImpl$errorScreenConfiguration$1.label;
        if (i != 0) {
        }
        SoulAiAssistantExperiment soulAiAssistantExperiment2 = (SoulAiAssistantExperiment) obj2;
        SoulAiAssistantExperiment.ErrorScreen errorScreen2 = soulAiAssistantExperiment2.e;
        return new nl1(d6z.Y(soulAiAssistantExperiment2, errorScreen2.a), d6z.Y(soulAiAssistantExperiment2, errorScreen2.b), d6z.Y(soulAiAssistantExperiment2, errorScreen2.c));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SoulAiAssistantConfigurationInteractorImpl$onboarding$1 soulAiAssistantConfigurationInteractorImpl$onboarding$1;
        int i;
        if (continuationImpl instanceof SoulAiAssistantConfigurationInteractorImpl$onboarding$1) {
            soulAiAssistantConfigurationInteractorImpl$onboarding$1 = (SoulAiAssistantConfigurationInteractorImpl$onboarding$1) continuationImpl;
            int i2 = soulAiAssistantConfigurationInteractorImpl$onboarding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                soulAiAssistantConfigurationInteractorImpl$onboarding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = soulAiAssistantConfigurationInteractorImpl$onboarding$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soulAiAssistantConfigurationInteractorImpl$onboarding$1.label;
                if (i != 0) {
                    b.b(obj);
                    soulAiAssistantConfigurationInteractorImpl$onboarding$1.label = 1;
                    obj = this.a.a.b(soulAiAssistantConfigurationInteractorImpl$onboarding$1);
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
                return ((SoulAiAssistantExperiment) obj).f;
            }
        }
        soulAiAssistantConfigurationInteractorImpl$onboarding$1 = new SoulAiAssistantConfigurationInteractorImpl$onboarding$1(this, continuationImpl);
        Object obj2 = soulAiAssistantConfigurationInteractorImpl$onboarding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soulAiAssistantConfigurationInteractorImpl$onboarding$1.label;
        if (i != 0) {
        }
        return ((SoulAiAssistantExperiment) obj2).f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SoulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1 soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1;
        int i;
        if (continuationImpl instanceof SoulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1) {
            soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1 = (SoulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1) continuationImpl;
            int i2 = soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.label = i2 - Integer.MIN_VALUE;
                Object obj = soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.label;
                if (i != 0) {
                    b.b(obj);
                    soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.label = 1;
                    obj = this.a.a.b(soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1);
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
                return Boolean.valueOf(((SoulAiAssistantExperiment) obj).d);
            }
        }
        soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1 = new SoulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1(this, continuationImpl);
        Object obj2 = soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soulAiAssistantConfigurationInteractorImpl$warmUpOnSearchOpening$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((SoulAiAssistantExperiment) obj2).d);
    }
}
