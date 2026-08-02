package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import defpackage.d6z;
import defpackage.f5w0;
import defpackage.gyv0;
import defpackage.i3y;
import defpackage.jtv0;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.rbh;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.uh00;
import defpackage.w511;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class p {
    public final rqo a;
    public final f5w0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new ogu0(24, this));

    public p(rqo rqoVar, f5w0 f5w0Var) {
        this.a = rqoVar;
        this.b = f5w0Var;
    }

    public final t1b0 a() {
        return (t1b0) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1 superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1;
        p pVar;
        int i;
        SuperAppDiscoveryMapV2Experiment.MapExplorationConfigDto mapExplorationConfigDto;
        Object obj;
        int i2;
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer;
        if (continuationImpl instanceof SuperAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1) {
            superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1 = (SuperAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1) continuationImpl;
            int i3 = superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.label = i3 - Integer.MIN_VALUE;
                pVar = this;
                Object obj2 = superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t1b0 a = pVar.a();
                    superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.label = 1;
                    obj2 = a.b(superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                SuperAppDiscoveryMapV2Experiment superAppDiscoveryMapV2Experiment = (SuperAppDiscoveryMapV2Experiment) obj2;
                String str = superAppDiscoveryMapV2Experiment.i;
                SuperAppDiscoveryMapV2Experiment.ScreenOptions screenOptions = superAppDiscoveryMapV2Experiment.j;
                String str2 = screenOptions == null ? screenOptions.a : null;
                String str3 = str2 != null ? "" : str2;
                float f = screenOptions == null ? screenOptions.b : 12.0f;
                String Y = d6z.Y(superAppDiscoveryMapV2Experiment, superAppDiscoveryMapV2Experiment.g);
                String Y2 = d6z.Y(superAppDiscoveryMapV2Experiment, superAppDiscoveryMapV2Experiment.h);
                SuperAppDiscoveryMapV2Experiment.FlexContainerConfig flexContainerConfig = superAppDiscoveryMapV2Experiment.l;
                String str4 = flexContainerConfig == null ? flexContainerConfig.a : null;
                rbh rbhVar = new rbh(str4 != null ? str4 : "", flexContainerConfig == null ? flexContainerConfig.b : null, 9);
                mapExplorationConfigDto = superAppDiscoveryMapV2Experiment.m;
                uh00 uh00Var = uh00.e;
                if (mapExplorationConfigDto != null) {
                    double d = mapExplorationConfigDto.a;
                    double d2 = mapExplorationConfigDto.b;
                    if (d < d2) {
                        obj = null;
                        uh00Var = new uh00(d, d2, mapExplorationConfigDto.c, mapExplorationConfigDto.d);
                        uh00 uh00Var2 = uh00Var;
                        boolean z = superAppDiscoveryMapV2Experiment.e;
                        i2 = gyv0.a[superAppDiscoveryMapV2Experiment.f.ordinal()];
                        if (i2 == 1) {
                            superAppDiscoveryMapLayer = SuperAppDiscoveryMapLayer.PLACES;
                        } else if (i2 == 2) {
                            superAppDiscoveryMapLayer = SuperAppDiscoveryMapLayer.TRANSPORT;
                        } else if (i2 == 3) {
                            superAppDiscoveryMapLayer = SuperAppDiscoveryMapLayer.SCOOTERS;
                        } else if (i2 == 4) {
                            superAppDiscoveryMapLayer = SuperAppDiscoveryMapLayer.TAXI;
                        } else {
                            if (i2 != 5) {
                                w511.b();
                                return obj;
                            }
                            superAppDiscoveryMapLayer = SuperAppDiscoveryMapLayer.CHARGERS;
                        }
                        return new jtv0(str, str3, f, Y, Y2, z, superAppDiscoveryMapLayer, rbhVar, uh00Var2);
                    }
                }
                obj = null;
                uh00 uh00Var22 = uh00Var;
                boolean z2 = superAppDiscoveryMapV2Experiment.e;
                i2 = gyv0.a[superAppDiscoveryMapV2Experiment.f.ordinal()];
                if (i2 == 1) {
                }
                return new jtv0(str, str3, f, Y, Y2, z2, superAppDiscoveryMapLayer, rbhVar, uh00Var22);
            }
        }
        pVar = this;
        superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1 = new SuperAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1(pVar, continuationImpl);
        Object obj22 = superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapV2ExperimentRepository$getMapV2Config$1.label;
        if (i != 0) {
        }
        SuperAppDiscoveryMapV2Experiment superAppDiscoveryMapV2Experiment2 = (SuperAppDiscoveryMapV2Experiment) obj22;
        String str5 = superAppDiscoveryMapV2Experiment2.i;
        SuperAppDiscoveryMapV2Experiment.ScreenOptions screenOptions2 = superAppDiscoveryMapV2Experiment2.j;
        if (screenOptions2 == null) {
        }
        if (str2 != null) {
        }
        float f2 = screenOptions2 == null ? screenOptions2.b : 12.0f;
        String Y3 = d6z.Y(superAppDiscoveryMapV2Experiment2, superAppDiscoveryMapV2Experiment2.g);
        String Y22 = d6z.Y(superAppDiscoveryMapV2Experiment2, superAppDiscoveryMapV2Experiment2.h);
        SuperAppDiscoveryMapV2Experiment.FlexContainerConfig flexContainerConfig2 = superAppDiscoveryMapV2Experiment2.l;
        if (flexContainerConfig2 == null) {
        }
        rbh rbhVar2 = new rbh(str4 != null ? str4 : "", flexContainerConfig2 == null ? flexContainerConfig2.b : null, 9);
        mapExplorationConfigDto = superAppDiscoveryMapV2Experiment2.m;
        uh00 uh00Var3 = uh00.e;
        if (mapExplorationConfigDto != null) {
        }
        obj = null;
        uh00 uh00Var222 = uh00Var3;
        boolean z22 = superAppDiscoveryMapV2Experiment2.e;
        i2 = gyv0.a[superAppDiscoveryMapV2Experiment2.f.ordinal()];
        if (i2 == 1) {
        }
        return new jtv0(str5, str3, f2, Y3, Y22, z22, superAppDiscoveryMapLayer, rbhVar2, uh00Var222);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1 superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1;
        int i;
        if (continuationImpl instanceof SuperAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1) {
            superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1 = (SuperAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1) continuationImpl;
            int i2 = superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 a = a();
                    superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.label = 1;
                    obj = a.b(superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1);
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
                return ((SuperAppDiscoveryMapV2Experiment) obj).n;
            }
        }
        superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1 = new SuperAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapV2ExperimentRepository$getMapVisibleBboxConfig$1.label;
        if (i != 0) {
        }
        return ((SuperAppDiscoveryMapV2Experiment) obj2).n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(SuperAppOpenServiceActionType superAppOpenServiceActionType, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1 superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1;
        int i;
        Iterator it;
        Object obj;
        SuperAppDiscoveryMapV2Experiment.ServiceSearchBarConfig serviceSearchBarConfig;
        if (continuationImpl instanceof SuperAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1) {
            superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1 = (SuperAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1) continuationImpl;
            int i2 = superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t1b0 a = a();
                    superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.L$0 = superAppOpenServiceActionType;
                    superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.label = 1;
                    obj2 = a.b(superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    superAppOpenServiceActionType = (SuperAppOpenServiceActionType) superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((SuperAppDiscoveryMapV2Experiment) obj2).k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = ((SuperAppDiscoveryMapV2Experiment.ServiceSearchBarConfig) obj).a;
                    this.b.getClass();
                    if (f5w0.a(str) == superAppOpenServiceActionType) {
                        break;
                    }
                }
                serviceSearchBarConfig = (SuperAppDiscoveryMapV2Experiment.ServiceSearchBarConfig) obj;
                if (serviceSearchBarConfig == null) {
                    return serviceSearchBarConfig.b;
                }
                return null;
            }
        }
        superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1 = new SuperAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1(this, continuationImpl);
        Object obj22 = superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapV2ExperimentRepository$getSearchBarV2Config$1.label;
        if (i != 0) {
        }
        it = ((SuperAppDiscoveryMapV2Experiment) obj22).k.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        serviceSearchBarConfig = (SuperAppDiscoveryMapV2Experiment.ServiceSearchBarConfig) obj;
        if (serviceSearchBarConfig == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapV2ExperimentRepository$isEnabled$1 superAppDiscoveryMapV2ExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof SuperAppDiscoveryMapV2ExperimentRepository$isEnabled$1) {
            superAppDiscoveryMapV2ExperimentRepository$isEnabled$1 = (SuperAppDiscoveryMapV2ExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 a = a();
                    superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.label = 1;
                    obj = a.b(superAppDiscoveryMapV2ExperimentRepository$isEnabled$1);
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
                return Boolean.valueOf(((SuperAppDiscoveryMapV2Experiment) obj).c);
            }
        }
        superAppDiscoveryMapV2ExperimentRepository$isEnabled$1 = new SuperAppDiscoveryMapV2ExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapV2ExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((SuperAppDiscoveryMapV2Experiment) obj2).c);
    }
}
