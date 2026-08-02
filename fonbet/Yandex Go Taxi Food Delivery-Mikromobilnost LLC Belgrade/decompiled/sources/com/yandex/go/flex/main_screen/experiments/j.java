package com.yandex.go.flex.main_screen.experiments;

import defpackage.ny61;
import defpackage.q1w0;
import defpackage.rqo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class j implements q1w0 {
    public final rqo a;
    public final com.yandex.go.coroutines.h b = new com.yandex.go.coroutines.h(new SuperAppMainScreenFeaturesExperimentRepository$experiment$1(this, null));

    public j(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1 superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1;
        int i;
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        if (continuationImpl instanceof SuperAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1) {
            superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1 = (SuperAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1) continuationImpl;
            int i2 = superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.label = 1;
                    obj = this.b.a(superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1);
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
                superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj;
                boolean z = false;
                if (superAppMainScreenFeaturesExperiment != null) {
                    z = superAppMainScreenFeaturesExperiment.c && superAppMainScreenFeaturesExperiment.d.b.a;
                }
                return Boolean.valueOf(z);
            }
        }
        superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1 = new SuperAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1(this, continuationImpl);
        Object obj2 = superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenFeaturesExperimentRepository$isNewSearchScreenEnabled$1.label;
        if (i != 0) {
        }
        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj2;
        boolean z2 = false;
        if (superAppMainScreenFeaturesExperiment != null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuperAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1 superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1;
        int i;
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        if (continuationImpl instanceof SuperAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1) {
            superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1 = (SuperAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1) continuationImpl;
            int i2 = superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.label = 1;
                    obj = this.b.a(superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1);
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
                superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj;
                boolean z = false;
                if (superAppMainScreenFeaturesExperiment != null) {
                    z = superAppMainScreenFeaturesExperiment.c && superAppMainScreenFeaturesExperiment.d.d.a;
                }
                return Boolean.valueOf(z);
            }
        }
        superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1 = new SuperAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1(this, continuationImpl);
        Object obj2 = superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenFeaturesExperimentRepository$isSuperappCompactTopPlaqueEnabled$1.label;
        if (i != 0) {
        }
        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj2;
        boolean z2 = false;
        if (superAppMainScreenFeaturesExperiment != null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SuperAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1 superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1;
        int i;
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        if (continuationImpl instanceof SuperAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1) {
            superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1 = (SuperAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1) continuationImpl;
            int i2 = superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.label = 1;
                    obj = this.b.a(superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1);
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
                superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj;
                boolean z = false;
                if (superAppMainScreenFeaturesExperiment != null) {
                    z = superAppMainScreenFeaturesExperiment.c && superAppMainScreenFeaturesExperiment.d.c.a;
                }
                return Boolean.valueOf(z);
            }
        }
        superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1 = new SuperAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1(this, continuationImpl);
        Object obj2 = superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenFeaturesExperimentRepository$isSuperappFloatingHeaderEnabled$1.label;
        if (i != 0) {
        }
        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj2;
        boolean z2 = false;
        if (superAppMainScreenFeaturesExperiment != null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SuperAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1 superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1;
        int i;
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        if (continuationImpl instanceof SuperAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1) {
            superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1 = (SuperAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1) continuationImpl;
            int i2 = superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.label = 1;
                    obj = this.b.a(superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1);
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
                superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj;
                boolean z = false;
                if (superAppMainScreenFeaturesExperiment != null) {
                    z = superAppMainScreenFeaturesExperiment.c && superAppMainScreenFeaturesExperiment.d.a.a;
                }
                return Boolean.valueOf(z);
            }
        }
        superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1 = new SuperAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1(this, continuationImpl);
        Object obj2 = superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenFeaturesExperimentRepository$isSuperappMainSearchbarEnabled$1.label;
        if (i != 0) {
        }
        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj2;
        boolean z2 = false;
        if (superAppMainScreenFeaturesExperiment != null) {
        }
        return Boolean.valueOf(z2);
    }
}
