package com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.Address;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.SearchType;
import defpackage.a7w0;
import defpackage.cv0;
import defpackage.dtv0;
import defpackage.dvw;
import defpackage.e7w0;
import defpackage.j18;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.scc;
import defpackage.z6w0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes14.dex */
public final class d {
    public static final List e = scc.g(Address.Component.Kind.LOCALITY, Address.Component.Kind.DISTRICT, Address.Component.Kind.AREA);
    public final po21 a;
    public final com.yandex.go.superapp.discovery.map.impl.data.repositories.state.settlement.a b;
    public final a7w0 c;
    public final dtv0 d;

    public d(po21 po21Var, com.yandex.go.superapp.discovery.map.impl.data.repositories.state.settlement.a aVar, a7w0 a7w0Var, dtv0 dtv0Var) {
        this.a = po21Var;
        this.b = aVar;
        this.c = a7w0Var;
        this.d = dtv0Var;
    }

    public static boolean b(BoundingBox boundingBox, Point point) {
        double latitude = boundingBox.getSouthWest().getLatitude();
        double latitude2 = boundingBox.getNorthEast().getLatitude();
        double latitude3 = point.getLatitude();
        if (latitude > latitude3 || latitude3 > latitude2) {
            return false;
        }
        double longitude = boundingBox.getSouthWest().getLongitude();
        double longitude2 = boundingBox.getNorthEast().getLongitude();
        double longitude3 = point.getLongitude();
        return longitude <= longitude3 && longitude3 <= longitude2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Point point, long j, ContinuationImpl continuationImpl) {
        SuperAppSettlementFocusInteractor$awaitCachedBbox$1 superAppSettlementFocusInteractor$awaitCachedBbox$1;
        int i;
        z6w0 z6w0Var;
        BoundingBox boundingBox;
        if (continuationImpl instanceof SuperAppSettlementFocusInteractor$awaitCachedBbox$1) {
            superAppSettlementFocusInteractor$awaitCachedBbox$1 = (SuperAppSettlementFocusInteractor$awaitCachedBbox$1) continuationImpl;
            int i2 = superAppSettlementFocusInteractor$awaitCachedBbox$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppSettlementFocusInteractor$awaitCachedBbox$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppSettlementFocusInteractor$awaitCachedBbox$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppSettlementFocusInteractor$awaitCachedBbox$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SuperAppSettlementFocusInteractor$awaitCachedBbox$bbox$1 superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1 = new SuperAppSettlementFocusInteractor$awaitCachedBbox$bbox$1(this, null);
                    superAppSettlementFocusInteractor$awaitCachedBbox$1.L$0 = point;
                    superAppSettlementFocusInteractor$awaitCachedBbox$1.J$0 = j;
                    superAppSettlementFocusInteractor$awaitCachedBbox$1.label = 1;
                    obj = kotlinx.coroutines.a.w(j, superAppSettlementFocusInteractor$awaitCachedBbox$bbox$1, superAppSettlementFocusInteractor$awaitCachedBbox$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    point = (Point) superAppSettlementFocusInteractor$awaitCachedBbox$1.L$0;
                    kotlin.b.b(obj);
                }
                z6w0Var = (z6w0) obj;
                if (z6w0Var == null && (boundingBox = z6w0Var.a) != null && b(boundingBox, point)) {
                    return boundingBox;
                }
                return null;
            }
        }
        superAppSettlementFocusInteractor$awaitCachedBbox$1 = new SuperAppSettlementFocusInteractor$awaitCachedBbox$1(this, continuationImpl);
        Object obj2 = superAppSettlementFocusInteractor$awaitCachedBbox$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppSettlementFocusInteractor$awaitCachedBbox$1.label;
        if (i != 0) {
        }
        z6w0Var = (z6w0) obj2;
        if (z6w0Var == null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0108, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (r4 == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig, ContinuationImpl continuationImpl) {
        SuperAppSettlementFocusInteractor$initSettlementBbox$1 superAppSettlementFocusInteractor$initSettlementBbox$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig2;
        Object h;
        Point point;
        BoundingBox boundingBox;
        Object a;
        SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig3;
        Point point2;
        if (continuationImpl instanceof SuperAppSettlementFocusInteractor$initSettlementBbox$1) {
            superAppSettlementFocusInteractor$initSettlementBbox$1 = (SuperAppSettlementFocusInteractor$initSettlementBbox$1) continuationImpl;
            int i2 = superAppSettlementFocusInteractor$initSettlementBbox$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppSettlementFocusInteractor$initSettlementBbox$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppSettlementFocusInteractor$initSettlementBbox$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppSettlementFocusInteractor$initSettlementBbox$1.label;
                zy11 zy11Var = zy11.a;
                a7w0 a7w0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    settlementFocusingConfig2 = settlementFocusingConfig;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$0 = settlementFocusingConfig2;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.label = 1;
                    h = ((e) this.a).h(superAppSettlementFocusInteractor$initSettlementBbox$1);
                } else if (i == 1) {
                    SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig4 = (SuperAppDiscoveryMapExperiment.SettlementFocusingConfig) superAppSettlementFocusInteractor$initSettlementBbox$1.L$0;
                    kotlin.b.b(obj);
                    h = obj;
                    settlementFocusingConfig2 = settlementFocusingConfig4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        r0 r0Var = a7w0Var.a;
                        z6w0 z6w0Var = new z6w0((BoundingBox) obj);
                        r0Var.getClass();
                        r0Var.m(null, z6w0Var);
                        return zy11Var;
                    }
                    point2 = (Point) superAppSettlementFocusInteractor$initSettlementBbox$1.L$2;
                    settlementFocusingConfig3 = (SuperAppDiscoveryMapExperiment.SettlementFocusingConfig) superAppSettlementFocusInteractor$initSettlementBbox$1.L$0;
                    kotlin.b.b(obj);
                    Double d = settlementFocusingConfig3.c;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$0 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$1 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$2 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$3 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$4 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.label = 3;
                    j18 j18Var = new j18(1, dvw.b(superAppSettlementFocusInteractor$initSettlementBbox$1));
                    j18Var.u();
                    SearchOptions searchOptions = new SearchOptions();
                    searchOptions.setSearchTypes(SearchType.GEO.value);
                    j18Var.w(new cv0(((SearchManager) obj).submit(point2, (Integer) null, searchOptions, new e7w0(this, point2, d, j18Var)), 2));
                    obj = j18Var.s();
                }
                mo21 mo21Var = (mo21) h;
                point = new Point(mo21Var.a, mo21Var.b);
                Object value = a7w0Var.b.a.getValue();
                z6w0 z6w0Var2 = !(value instanceof z6w0) ? (z6w0) value : null;
                boundingBox = z6w0Var2 == null ? z6w0Var2.a : null;
                if (boundingBox == null && b(boundingBox, point)) {
                    return zy11Var;
                }
                superAppSettlementFocusInteractor$initSettlementBbox$1.L$0 = settlementFocusingConfig2;
                superAppSettlementFocusInteractor$initSettlementBbox$1.L$1 = null;
                superAppSettlementFocusInteractor$initSettlementBbox$1.L$2 = point;
                superAppSettlementFocusInteractor$initSettlementBbox$1.L$3 = null;
                superAppSettlementFocusInteractor$initSettlementBbox$1.label = 2;
                a = this.b.a(superAppSettlementFocusInteractor$initSettlementBbox$1);
                if (a != coroutineSingletons) {
                    settlementFocusingConfig3 = settlementFocusingConfig2;
                    obj = a;
                    point2 = point;
                    Double d2 = settlementFocusingConfig3.c;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$0 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$1 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$2 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$3 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.L$4 = null;
                    superAppSettlementFocusInteractor$initSettlementBbox$1.label = 3;
                    j18 j18Var2 = new j18(1, dvw.b(superAppSettlementFocusInteractor$initSettlementBbox$1));
                    j18Var2.u();
                    SearchOptions searchOptions2 = new SearchOptions();
                    searchOptions2.setSearchTypes(SearchType.GEO.value);
                    j18Var2.w(new cv0(((SearchManager) obj).submit(point2, (Integer) null, searchOptions2, new e7w0(this, point2, d2, j18Var2)), 2));
                    obj = j18Var2.s();
                }
                return coroutineSingletons;
            }
        }
        superAppSettlementFocusInteractor$initSettlementBbox$1 = new SuperAppSettlementFocusInteractor$initSettlementBbox$1(this, continuationImpl);
        Object obj2 = superAppSettlementFocusInteractor$initSettlementBbox$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppSettlementFocusInteractor$initSettlementBbox$1.label;
        zy11 zy11Var2 = zy11.a;
        a7w0 a7w0Var2 = this.c;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) h;
        point = new Point(mo21Var2.a, mo21Var2.b);
        Object value2 = a7w0Var2.b.a.getValue();
        if (!(value2 instanceof z6w0)) {
        }
        if (z6w0Var2 == null) {
        }
        if (boundingBox == null) {
        }
        superAppSettlementFocusInteractor$initSettlementBbox$1.L$0 = settlementFocusingConfig2;
        superAppSettlementFocusInteractor$initSettlementBbox$1.L$1 = null;
        superAppSettlementFocusInteractor$initSettlementBbox$1.L$2 = point;
        superAppSettlementFocusInteractor$initSettlementBbox$1.L$3 = null;
        superAppSettlementFocusInteractor$initSettlementBbox$1.label = 2;
        a = this.b.a(superAppSettlementFocusInteractor$initSettlementBbox$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
