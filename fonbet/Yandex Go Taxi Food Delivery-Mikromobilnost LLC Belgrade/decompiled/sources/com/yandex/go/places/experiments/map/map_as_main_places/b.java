package com.yandex.go.places.experiments.map.map_as_main_places;

import defpackage.i3y;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.xyz;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final rqo a;
    public final k7x0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new xyz(9, this));

    public b(rqo rqoVar, k7x0 k7x0Var) {
        this.a = rqoVar;
        this.b = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MapAsMainPlacesExperimentRepository$getLogoUrl$1 mapAsMainPlacesExperimentRepository$getLogoUrl$1;
        int i;
        MapAsMainPlacesExperiment mapAsMainPlacesExperiment;
        if (continuationImpl instanceof MapAsMainPlacesExperimentRepository$getLogoUrl$1) {
            mapAsMainPlacesExperimentRepository$getLogoUrl$1 = (MapAsMainPlacesExperimentRepository$getLogoUrl$1) continuationImpl;
            int i2 = mapAsMainPlacesExperimentRepository$getLogoUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapAsMainPlacesExperimentRepository$getLogoUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapAsMainPlacesExperimentRepository$getLogoUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapAsMainPlacesExperimentRepository$getLogoUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    mapAsMainPlacesExperimentRepository$getLogoUrl$1.label = 1;
                    obj = t1b0Var.b(mapAsMainPlacesExperimentRepository$getLogoUrl$1);
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
                mapAsMainPlacesExperiment = (MapAsMainPlacesExperiment) obj;
                String a = ((m7x0) this.b).a(mapAsMainPlacesExperiment.c);
                if (mapAsMainPlacesExperiment.c.length() <= 0) {
                    return a;
                }
                return null;
            }
        }
        mapAsMainPlacesExperimentRepository$getLogoUrl$1 = new MapAsMainPlacesExperimentRepository$getLogoUrl$1(this, continuationImpl);
        Object obj2 = mapAsMainPlacesExperimentRepository$getLogoUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapAsMainPlacesExperimentRepository$getLogoUrl$1.label;
        if (i != 0) {
        }
        mapAsMainPlacesExperiment = (MapAsMainPlacesExperiment) obj2;
        String a2 = ((m7x0) this.b).a(mapAsMainPlacesExperiment.c);
        if (mapAsMainPlacesExperiment.c.length() <= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MapAsMainPlacesExperimentRepository$isEnabled$1 mapAsMainPlacesExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof MapAsMainPlacesExperimentRepository$isEnabled$1) {
            mapAsMainPlacesExperimentRepository$isEnabled$1 = (MapAsMainPlacesExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = mapAsMainPlacesExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapAsMainPlacesExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapAsMainPlacesExperimentRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapAsMainPlacesExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    mapAsMainPlacesExperimentRepository$isEnabled$1.label = 1;
                    obj = t1b0Var.b(mapAsMainPlacesExperimentRepository$isEnabled$1);
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
                return Boolean.valueOf(((MapAsMainPlacesExperiment) obj).b);
            }
        }
        mapAsMainPlacesExperimentRepository$isEnabled$1 = new MapAsMainPlacesExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = mapAsMainPlacesExperimentRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapAsMainPlacesExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((MapAsMainPlacesExperiment) obj2).b);
    }
}
