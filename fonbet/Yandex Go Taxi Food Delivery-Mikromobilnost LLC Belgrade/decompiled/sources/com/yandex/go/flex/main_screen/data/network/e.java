package com.yandex.go.flex.main_screen.data.network;

import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenFeaturesExperiment;
import com.yandex.go.flex.main_screen.experiments.j;
import defpackage.ajr;
import defpackage.c5j0;
import defpackage.d2m;
import defpackage.e2m;
import defpackage.f2m;
import defpackage.h3y;
import defpackage.hv90;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k0b0;
import defpackage.kdx;
import defpackage.ksx;
import defpackage.nsx;
import defpackage.ny61;
import defpackage.qcx;
import defpackage.w511;
import defpackage.xby;
import defpackage.xsq0;
import defpackage.ywl;
import defpackage.zd1;
import defpackage.zzs;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class e implements hv90 {
    public final nsx a;
    public final ksx b;
    public final ajr c;
    public final h3y d;
    public final j e;
    public final k0b0 f;
    public final zd1 g;
    public final AtomicBoolean h = new AtomicBoolean(true);

    public e(nsx nsxVar, ksx ksxVar, ajr ajrVar, h3y h3yVar, j jVar, k0b0 k0b0Var, zd1 zd1Var) {
        this.a = nsxVar;
        this.b = ksxVar;
        this.c = ajrVar;
        this.d = h3yVar;
        this.e = jVar;
        this.f = k0b0Var;
        this.g = zd1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        if (r13 != r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v30 */
    @Override // defpackage.hv90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ywl ywlVar, c5j0 c5j0Var, Continuation continuation) {
        MainScreenPayloadExtender$formatExtraPayload$1 mainScreenPayloadExtender$formatExtraPayload$1;
        int i;
        ?? r13;
        kotlinx.serialization.json.b bVar;
        Object a;
        int i2;
        kotlinx.serialization.json.b bVar2;
        Map map;
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        k0b0 k0b0Var;
        if (continuation instanceof MainScreenPayloadExtender$formatExtraPayload$1) {
            mainScreenPayloadExtender$formatExtraPayload$1 = (MainScreenPayloadExtender$formatExtraPayload$1) continuation;
            int i3 = mainScreenPayloadExtender$formatExtraPayload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mainScreenPayloadExtender$formatExtraPayload$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mainScreenPayloadExtender$formatExtraPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenPayloadExtender$formatExtraPayload$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (c5j0Var instanceof f2m) {
                        f2m f2mVar = (f2m) c5j0Var;
                        if (jl40.l(f2mVar.a().a, "mlutp/v1/widgets/layout/superapp")) {
                            if (!(f2mVar instanceof e2m)) {
                                if (!(f2mVar instanceof d2m)) {
                                    w511.b();
                                    return null;
                                }
                                d2m d2mVar = (d2m) c5j0Var;
                                boolean z2 = d2mVar.c;
                                AtomicBoolean atomicBoolean = this.h;
                                if (z2) {
                                    boolean compareAndSet = atomicBoolean.compareAndSet(true, false);
                                    if (d2mVar.b && compareAndSet) {
                                        r13 = 1;
                                    }
                                } else {
                                    atomicBoolean.set(false);
                                    r13 = d2mVar.b;
                                }
                                if (c5j0Var instanceof d2m) {
                                    bVar = null;
                                } else {
                                    kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) this.g.a.getAndSet(null);
                                    if (aVar == null) {
                                        aVar = null;
                                    }
                                    bVar = aVar;
                                }
                                ajr ajrVar = this.c;
                                mainScreenPayloadExtender$formatExtraPayload$1.L$0 = null;
                                mainScreenPayloadExtender$formatExtraPayload$1.L$1 = null;
                                mainScreenPayloadExtender$formatExtraPayload$1.L$2 = bVar;
                                mainScreenPayloadExtender$formatExtraPayload$1.I$0 = r13;
                                mainScreenPayloadExtender$formatExtraPayload$1.label = 1;
                                a = com.yandex.go.flex.common.api.c.a(ajrVar, mainScreenPayloadExtender$formatExtraPayload$1);
                                if (a != coroutineSingletons) {
                                    int i4 = r13;
                                    obj = a;
                                    i2 = i4;
                                }
                                return coroutineSingletons;
                            }
                            this.h.set(false);
                            r13 = 0;
                            if (c5j0Var instanceof d2m) {
                            }
                            ajr ajrVar2 = this.c;
                            mainScreenPayloadExtender$formatExtraPayload$1.L$0 = null;
                            mainScreenPayloadExtender$formatExtraPayload$1.L$1 = null;
                            mainScreenPayloadExtender$formatExtraPayload$1.L$2 = bVar;
                            mainScreenPayloadExtender$formatExtraPayload$1.I$0 = r13;
                            mainScreenPayloadExtender$formatExtraPayload$1.label = 1;
                            a = com.yandex.go.flex.common.api.c.a(ajrVar2, mainScreenPayloadExtender$formatExtraPayload$1);
                            if (a != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                    }
                    return kotlin.collections.b.f();
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = (Map) mainScreenPayloadExtender$formatExtraPayload$1.L$4;
                        bVar2 = (kotlinx.serialization.json.b) mainScreenPayloadExtender$formatExtraPayload$1.L$2;
                        kotlin.b.b(obj);
                        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj;
                        MapBuilder mapBuilder = new MapBuilder(4);
                        mapBuilder.put("request", xsq0.b(map));
                        kdx kdxVar = new kdx();
                        if (superAppMainScreenFeaturesExperiment != null) {
                            try {
                                kotlinx.serialization.json.b bVar3 = superAppMainScreenFeaturesExperiment.b;
                                if (bVar3 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                kdxVar.b("superapp_main_screen_features", bVar3);
                            } catch (Throwable th) {
                                xby.t(jst.e, "MainScreenPayloadExtender", th, null, 10);
                            }
                        }
                        mapBuilder.put("experiments_values", kdxVar.a());
                        k0b0Var = this.f;
                        if (!k0b0Var.g() && !k0b0Var.a()) {
                            z = false;
                        }
                        kdx kdxVar2 = new kdx();
                        kdxVar2.b("is_geolocation_allowed", qcx.a(Boolean.valueOf(z)));
                        mapBuilder.put("analytics_data", kdxVar2.a());
                        if (bVar2 != null) {
                            mapBuilder.put("sections", bVar2);
                        }
                        return mapBuilder.j();
                    }
                    i2 = mainScreenPayloadExtender$formatExtraPayload$1.I$0;
                    bVar = (kotlinx.serialization.json.b) mainScreenPayloadExtender$formatExtraPayload$1.L$2;
                    kotlin.b.b(obj);
                    Pair pair = (Pair) obj;
                    Map map2 = (Map) pair.getFirst();
                    List list = (List) pair.getSecond();
                    if (i2 != 0 && list != null) {
                        nsx nsxVar = this.a;
                        this.b.getClass();
                        nsxVar.a = ksx.a(list);
                    }
                    j jVar = this.e;
                    mainScreenPayloadExtender$formatExtraPayload$1.L$0 = null;
                    mainScreenPayloadExtender$formatExtraPayload$1.L$1 = null;
                    mainScreenPayloadExtender$formatExtraPayload$1.L$2 = bVar;
                    mainScreenPayloadExtender$formatExtraPayload$1.L$3 = null;
                    mainScreenPayloadExtender$formatExtraPayload$1.L$4 = map2;
                    mainScreenPayloadExtender$formatExtraPayload$1.L$5 = null;
                    mainScreenPayloadExtender$formatExtraPayload$1.I$0 = i2;
                    mainScreenPayloadExtender$formatExtraPayload$1.label = 3;
                    obj = jVar.b.a(mainScreenPayloadExtender$formatExtraPayload$1);
                    if (obj != coroutineSingletons) {
                        bVar2 = bVar;
                        map = map2;
                        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj;
                        MapBuilder mapBuilder2 = new MapBuilder(4);
                        mapBuilder2.put("request", xsq0.b(map));
                        kdx kdxVar3 = new kdx();
                        if (superAppMainScreenFeaturesExperiment != null) {
                        }
                        mapBuilder2.put("experiments_values", kdxVar3.a());
                        k0b0Var = this.f;
                        if (!k0b0Var.g()) {
                            z = false;
                        }
                        kdx kdxVar22 = new kdx();
                        kdxVar22.b("is_geolocation_allowed", qcx.a(Boolean.valueOf(z)));
                        mapBuilder2.put("analytics_data", kdxVar22.a());
                        if (bVar2 != null) {
                        }
                        return mapBuilder2.j();
                    }
                    return coroutineSingletons;
                }
                i2 = mainScreenPayloadExtender$formatExtraPayload$1.I$0;
                bVar = (kotlinx.serialization.json.b) mainScreenPayloadExtender$formatExtraPayload$1.L$2;
                kotlin.b.b(obj);
                com.yandex.go.flex.main_screen.interactors.a aVar2 = (com.yandex.go.flex.main_screen.interactors.a) this.d.get();
                mainScreenPayloadExtender$formatExtraPayload$1.L$0 = null;
                mainScreenPayloadExtender$formatExtraPayload$1.L$1 = null;
                mainScreenPayloadExtender$formatExtraPayload$1.L$2 = bVar;
                mainScreenPayloadExtender$formatExtraPayload$1.L$3 = null;
                mainScreenPayloadExtender$formatExtraPayload$1.I$0 = i2;
                mainScreenPayloadExtender$formatExtraPayload$1.label = 2;
                obj = aVar2.b((zzs) obj, mainScreenPayloadExtender$formatExtraPayload$1);
            }
        }
        mainScreenPayloadExtender$formatExtraPayload$1 = new MainScreenPayloadExtender$formatExtraPayload$1(this, (ContinuationImpl) continuation);
        Object obj2 = mainScreenPayloadExtender$formatExtraPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenPayloadExtender$formatExtraPayload$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        com.yandex.go.flex.main_screen.interactors.a aVar22 = (com.yandex.go.flex.main_screen.interactors.a) this.d.get();
        mainScreenPayloadExtender$formatExtraPayload$1.L$0 = null;
        mainScreenPayloadExtender$formatExtraPayload$1.L$1 = null;
        mainScreenPayloadExtender$formatExtraPayload$1.L$2 = bVar;
        mainScreenPayloadExtender$formatExtraPayload$1.L$3 = null;
        mainScreenPayloadExtender$formatExtraPayload$1.I$0 = i2;
        mainScreenPayloadExtender$formatExtraPayload$1.label = 2;
        obj2 = aVar22.b((zzs) obj2, mainScreenPayloadExtender$formatExtraPayload$1);
    }

    @Override // defpackage.hv90
    public final Map b() {
        return kotlin.collections.b.f();
    }
}
