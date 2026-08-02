package com.yandex.go;

import android.location.Location;
import com.yandex.go.config.i;
import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import defpackage.adz;
import defpackage.bvf0;
import defpackage.g7z;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.k7z;
import defpackage.ky80;
import defpackage.ny61;
import defpackage.o9z;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.q6z;
import defpackage.qke;
import defpackage.rcz;
import defpackage.sls;
import defpackage.sr3;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.udq0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.o;

/* loaded from: classes.dex */
public final class g implements adz {
    public final h3y a;
    public final po21 b;
    public final rcz c;
    public final tt2 d;
    public final i e;
    public final o f;
    public final h3y g;
    public final i3y h = kotlin.a.a(new sls() { // from class: com.yandex.go.b
        @Override // defpackage.sls
        public final Object invoke() {
            g gVar = g.this;
            hbp0 hbp0Var = new hbp0(new LocationSdkController$scope$2$1(0, gVar.d, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "LocationSdkController", new sr3(gVar));
            hbp0Var.a();
            return hbp0Var;
        }
    });
    public final r0 i = bvf0.c(null);
    public pzt0 j;

    public g(h3y h3yVar, po21 po21Var, rcz rczVar, tt2 tt2Var, i iVar, o oVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = po21Var;
        this.c = rczVar;
        this.d = tt2Var;
        this.e = iVar;
        this.f = oVar;
        this.g = h3yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r8 == r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1 locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1;
        int i;
        int i2;
        Object s;
        Object obj = zy11.a;
        if (continuationImpl instanceof LocationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1) {
            locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1 = (LocationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1) continuationImpl;
            int i3 = locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i iVar = this.e;
                    locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.label = 1;
                    obj2 = iVar.c(locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    kotlin.b.b(obj2);
                }
                LocationSdkAndroidGoExperiment.GoConfig goConfig = (LocationSdkAndroidGoExperiment.GoConfig) obj2;
                i2 = goConfig == null ? goConfig.l : 0;
                if (i2 != 0) {
                    com.yandex.go.sdk.a h = h();
                    locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.L$0 = null;
                    locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.I$0 = i2;
                    locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.label = 2;
                    if (h.f && (s = h.e.s(locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1)) == obj3) {
                        obj = s;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                }
                return obj;
            }
        }
        locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1 = new LocationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1(this, continuationImpl);
        Object obj22 = locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$awaitLastKnownLocationsFetchedIfNeeded$1.label;
        if (i != 0) {
        }
        LocationSdkAndroidGoExperiment.GoConfig goConfig2 = (LocationSdkAndroidGoExperiment.GoConfig) obj22;
        if (goConfig2 == null) {
        }
        if (i2 != 0) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LocationSdkController$canUseLastLocations$1 locationSdkController$canUseLastLocations$1;
        int i;
        if (continuationImpl instanceof LocationSdkController$canUseLastLocations$1) {
            locationSdkController$canUseLastLocations$1 = (LocationSdkController$canUseLastLocations$1) continuationImpl;
            int i2 = locationSdkController$canUseLastLocations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$canUseLastLocations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationSdkController$canUseLastLocations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$canUseLastLocations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$canUseLastLocations$1.label = 1;
                    obj = this.e.c(locationSdkController$canUseLastLocations$1);
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
                LocationSdkAndroidGoExperiment.GoConfig goConfig = (LocationSdkAndroidGoExperiment.GoConfig) obj;
                return Boolean.valueOf(goConfig == null && goConfig.e);
            }
        }
        locationSdkController$canUseLastLocations$1 = new LocationSdkController$canUseLastLocations$1(this, continuationImpl);
        Object obj2 = locationSdkController$canUseLastLocations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$canUseLastLocations$1.label;
        if (i != 0) {
        }
        LocationSdkAndroidGoExperiment.GoConfig goConfig2 = (LocationSdkAndroidGoExperiment.GoConfig) obj2;
        return Boolean.valueOf(goConfig2 == null && goConfig2.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        LocationSdkController$canUseLastLocationsForPolling$1 locationSdkController$canUseLastLocationsForPolling$1;
        int i;
        if (continuationImpl instanceof LocationSdkController$canUseLastLocationsForPolling$1) {
            locationSdkController$canUseLastLocationsForPolling$1 = (LocationSdkController$canUseLastLocationsForPolling$1) continuationImpl;
            int i2 = locationSdkController$canUseLastLocationsForPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$canUseLastLocationsForPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationSdkController$canUseLastLocationsForPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$canUseLastLocationsForPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$canUseLastLocationsForPolling$1.label = 1;
                    obj = this.e.c(locationSdkController$canUseLastLocationsForPolling$1);
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
                LocationSdkAndroidGoExperiment.GoConfig goConfig = (LocationSdkAndroidGoExperiment.GoConfig) obj;
                return Boolean.valueOf(goConfig == null && goConfig.c);
            }
        }
        locationSdkController$canUseLastLocationsForPolling$1 = new LocationSdkController$canUseLastLocationsForPolling$1(this, continuationImpl);
        Object obj2 = locationSdkController$canUseLastLocationsForPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$canUseLastLocationsForPolling$1.label;
        if (i != 0) {
        }
        LocationSdkAndroidGoExperiment.GoConfig goConfig2 = (LocationSdkAndroidGoExperiment.GoConfig) obj2;
        return Boolean.valueOf(goConfig2 == null && goConfig2.c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(3:13|14|(2:16|17)(1:19))(2:20|21))(15:22|23|24|25|(1:27)|28|(2:30|31)|32|(1:65)(1:36)|(1:38)(1:64)|(1:40)|41|(3:43|(2:45|(3:49|(3:52|(1:54)(1:55)|50)|56))(0)|(1:58)(2:61|62))|63|(0)(0)))(12:67|68|(2:70|(7:72|(2:74|60)|24|25|(0)|28|(0)))|32|(1:34)|65|(0)(0)|(0)|41|(0)|63|(0)(0)))(1:75))(1:81)|76|(1:78)(1:79)))|87|6|7|(0)(0)|76|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
    
        if (r12 == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0080, code lost:
    
        if (r12 == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0069, code lost:
    
        if (a(r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b8, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b9, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0052, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a4, code lost:
    
        r12 = new kotlin.Result.Failure(r12);
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.yandex.go.g] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.go.experiment.LocationSdkAndroidGoExperiment$GoConfig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.yandex.go.experiment.LocationSdkAndroidGoExperiment$GoConfig] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.go.experiment.LocationSdkAndroidGoExperiment$GoConfig] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LocationSdkController$getLastLocation$1 locationSdkController$getLastLocation$1;
        int i;
        Object failure;
        ?? r2;
        long longValue;
        Set set;
        Long l;
        k7z k7zVar;
        o9z o9zVar;
        if (continuationImpl instanceof LocationSdkController$getLastLocation$1) {
            locationSdkController$getLastLocation$1 = (LocationSdkController$getLastLocation$1) continuationImpl;
            int i2 = locationSdkController$getLastLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$getLastLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationSdkController$getLastLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$getLastLocation$1.label;
                r0 r0Var = this.i;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$getLastLocation$1.label = 1;
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    ?? r22 = (LocationSdkAndroidGoExperiment.GoConfig) obj;
                    r2 = r22;
                    if (r22 != 0) {
                        boolean z = r22.m;
                        r2 = r22;
                        if (z) {
                            ru.yandex.taxi.locationsdk.core.processor_controller.internal.d dVar = h().c;
                            locationSdkController$getLastLocation$1.L$0 = null;
                            locationSdkController$getLastLocation$1.L$1 = r22;
                            locationSdkController$getLastLocation$1.label = 3;
                            obj = dVar.b(locationSdkController$getLastLocation$1);
                            i = r22;
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            failure = (k7z) obj;
                            int i4 = i;
                            if (failure instanceof Result.Failure) {
                            }
                            k7zVar = (k7z) failure;
                            r2 = i4;
                            if (k7zVar != null) {
                            }
                        }
                    }
                    if (r2 != 0) {
                    }
                    if (r2 == 0) {
                    }
                    if (set == null) {
                    }
                    if (longValue > 0) {
                    }
                    i3 = 0;
                    if (i3 == 0) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        o9z o9zVar2 = (o9z) obj;
                        return o9zVar2 == null ? (o9z) r0Var.getValue() : o9zVar2;
                    }
                    ?? r23 = (LocationSdkAndroidGoExperiment.GoConfig) locationSdkController$getLastLocation$1.L$1;
                    kotlin.b.b(obj);
                    i = r23;
                    failure = (k7z) obj;
                    int i42 = i;
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    k7zVar = (k7z) failure;
                    r2 = i42;
                    if (k7zVar != null) {
                        return l(k7zVar);
                    }
                    longValue = (r2 != 0 || (l = r2.j) == null) ? 0L : l.longValue();
                    set = r2 == 0 ? r2.k : null;
                    if (set == null) {
                        set = EmptySet.a;
                    }
                    if (longValue > 0) {
                        if (!set.isEmpty()) {
                            Set keySet = h().a.c().keySet();
                            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                                Iterator it = keySet.iterator();
                                while (it.hasNext()) {
                                    if (set.contains(((q6z) it.next()).a)) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (i3 == 0) {
                            return (o9z) r0Var.getValue();
                        }
                        LocationSdkController$getLastLocation$4 locationSdkController$getLastLocation$4 = new LocationSdkController$getLastLocation$4(this, null);
                        locationSdkController$getLastLocation$1.L$0 = null;
                        locationSdkController$getLastLocation$1.L$1 = null;
                        locationSdkController$getLastLocation$1.L$2 = null;
                        locationSdkController$getLastLocation$1.J$0 = longValue;
                        locationSdkController$getLastLocation$1.I$0 = i3;
                        locationSdkController$getLastLocation$1.label = 4;
                        obj = kotlinx.coroutines.a.w(longValue, locationSdkController$getLastLocation$4, locationSdkController$getLastLocation$1);
                    }
                    i3 = 0;
                    if (i3 == 0) {
                    }
                }
                o9zVar = (o9z) r0Var.getValue();
                if (o9zVar == null) {
                    return o9zVar;
                }
                locationSdkController$getLastLocation$1.L$0 = null;
                locationSdkController$getLastLocation$1.label = 2;
                obj = this.e.c(locationSdkController$getLastLocation$1);
            }
        }
        locationSdkController$getLastLocation$1 = new LocationSdkController$getLastLocation$1(this, continuationImpl);
        Object obj2 = locationSdkController$getLastLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$getLastLocation$1.label;
        r0 r0Var2 = this.i;
        int i32 = 1;
        if (i != 0) {
        }
        o9zVar = (o9z) r0Var2.getValue();
        if (o9zVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (a(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        LocationSdkController$getLastLocations$1 locationSdkController$getLastLocations$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LocationSdkController$getLastLocations$1) {
            locationSdkController$getLastLocations$1 = (LocationSdkController$getLastLocations$1) continuationImpl;
            int i2 = locationSdkController$getLastLocations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$getLastLocations$1.label = i2 - Integer.MIN_VALUE;
                obj = locationSdkController$getLastLocations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$getLastLocations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$getLastLocations$1.label = 1;
                    obj = b(locationSdkController$getLastLocations$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return g();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return EmptyList.a;
                }
                locationSdkController$getLastLocations$1.label = 2;
            }
        }
        locationSdkController$getLastLocations$1 = new LocationSdkController$getLastLocations$1(this, continuationImpl);
        obj = locationSdkController$getLastLocations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$getLastLocations$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (a(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        LocationSdkController$getLastLocationsForPolling$1 locationSdkController$getLastLocationsForPolling$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LocationSdkController$getLastLocationsForPolling$1) {
            locationSdkController$getLastLocationsForPolling$1 = (LocationSdkController$getLastLocationsForPolling$1) continuationImpl;
            int i2 = locationSdkController$getLastLocationsForPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$getLastLocationsForPolling$1.label = i2 - Integer.MIN_VALUE;
                obj = locationSdkController$getLastLocationsForPolling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$getLastLocationsForPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$getLastLocationsForPolling$1.label = 1;
                    obj = c(locationSdkController$getLastLocationsForPolling$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return g();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return EmptyList.a;
                }
                locationSdkController$getLastLocationsForPolling$1.label = 2;
            }
        }
        locationSdkController$getLastLocationsForPolling$1 = new LocationSdkController$getLastLocationsForPolling$1(this, continuationImpl);
        obj = locationSdkController$getLastLocationsForPolling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$getLastLocationsForPolling$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public final List g() {
        ?? failure;
        try {
            Collection values = h().a.c().values();
            failure = new ArrayList(tcc.n(values, 10));
            Iterator it = values.iterator();
            while (it.hasNext()) {
                failure.add(k((k7z) it.next()));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        ru.yandex.taxi.locationsdk.core.utils.a.d(failure, this.c, "LocationSdkController/lastLocations", new Pair[0]);
        boolean z = failure instanceof Result.Failure;
        EmptyList emptyList = failure;
        if (z) {
            emptyList = EmptyList.a;
        }
        return emptyList;
    }

    public final com.yandex.go.sdk.a h() {
        return (com.yandex.go.sdk.a) this.a.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        LocationSdkController$isUseAsLocationProvider$1 locationSdkController$isUseAsLocationProvider$1;
        int i;
        boolean z;
        LocationSdkAndroidGoExperiment.GoConfig goConfig;
        if (continuationImpl instanceof LocationSdkController$isUseAsLocationProvider$1) {
            locationSdkController$isUseAsLocationProvider$1 = (LocationSdkController$isUseAsLocationProvider$1) continuationImpl;
            int i2 = locationSdkController$isUseAsLocationProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$isUseAsLocationProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationSdkController$isUseAsLocationProvider$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$isUseAsLocationProvider$1.label;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$isUseAsLocationProvider$1.label = 1;
                    obj = this.e.c(locationSdkController$isUseAsLocationProvider$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                goConfig = (LocationSdkAndroidGoExperiment.GoConfig) obj;
                if (goConfig != null && goConfig.b) {
                    if (goConfig.a) {
                        locationSdkController$isUseAsLocationProvider$1.L$0 = null;
                        locationSdkController$isUseAsLocationProvider$1.label = 2;
                        obj = d(locationSdkController$isUseAsLocationProvider$1);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        locationSdkController$isUseAsLocationProvider$1 = new LocationSdkController$isUseAsLocationProvider$1(this, continuationImpl);
        Object obj3 = locationSdkController$isUseAsLocationProvider$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$isUseAsLocationProvider$1.label;
        z = false;
        if (i != 0) {
        }
        goConfig = (LocationSdkAndroidGoExperiment.GoConfig) obj3;
        if (goConfig != null) {
            if (goConfig.a) {
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        LocationSdkController$isUseWithFallbackProvider$1 locationSdkController$isUseWithFallbackProvider$1;
        int i;
        if (continuationImpl instanceof LocationSdkController$isUseWithFallbackProvider$1) {
            locationSdkController$isUseWithFallbackProvider$1 = (LocationSdkController$isUseWithFallbackProvider$1) continuationImpl;
            int i2 = locationSdkController$isUseWithFallbackProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkController$isUseWithFallbackProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationSdkController$isUseWithFallbackProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkController$isUseWithFallbackProvider$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkController$isUseWithFallbackProvider$1.label = 1;
                    obj = this.e.c(locationSdkController$isUseWithFallbackProvider$1);
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
                LocationSdkAndroidGoExperiment.GoConfig goConfig = (LocationSdkAndroidGoExperiment.GoConfig) obj;
                return Boolean.valueOf(goConfig == null ? goConfig.d : false);
            }
        }
        locationSdkController$isUseWithFallbackProvider$1 = new LocationSdkController$isUseWithFallbackProvider$1(this, continuationImpl);
        Object obj2 = locationSdkController$isUseWithFallbackProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkController$isUseWithFallbackProvider$1.label;
        if (i != 0) {
        }
        LocationSdkAndroidGoExperiment.GoConfig goConfig2 = (LocationSdkAndroidGoExperiment.GoConfig) obj2;
        return Boolean.valueOf(goConfig2 == null ? goConfig2.d : false);
    }

    public final o9z k(k7z k7zVar) {
        i iVar = this.e;
        g7z g7zVar = (g7z) iVar.d.getValue();
        String name = g7zVar != null ? g7zVar.getName() : null;
        if (name == null) {
            name = "";
        }
        LocationSdkAndroidGoExperiment.GoConfig b = iVar.b();
        boolean z = false;
        if (b != null && b.g) {
            z = true;
        }
        Location k = udq0.k(k7zVar);
        String Z = bvf0.Z(qke.q(k7zVar));
        LinkedHashMap l = kotlin.collections.b.l(new Pair("source", "ridetech_sdk"), new Pair("config_name", name), new Pair("type", "last_location"), new Pair("sdk_provider", Z));
        if (z) {
            l.put("suffix_tag", Z);
        }
        return new o9z(k, l);
    }

    public final o9z l(k7z k7zVar) {
        i iVar = this.e;
        g7z g7zVar = (g7z) iVar.d.getValue();
        String name = g7zVar != null ? g7zVar.getName() : null;
        if (name == null) {
            name = "";
        }
        LocationSdkAndroidGoExperiment.GoConfig b = iVar.b();
        boolean z = false;
        if (b != null && b.f) {
            z = true;
        }
        return new o9z(udq0.k(k7zVar), z ? kotlin.collections.b.l(new Pair("source", "ridetech_sdk"), new Pair("config_name", name), new Pair("type", "verified_location"), new Pair("sdk_provider", bvf0.Z(((ky80) k7zVar.e).b))) : kotlin.collections.b.f());
    }

    public final Boolean m() {
        LocationSdkAndroidGoExperiment.GoConfig b = this.e.b();
        return Boolean.valueOf(b != null ? b.h : true);
    }
}
