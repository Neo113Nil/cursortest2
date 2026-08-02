package com.yandex.go.navigator.domain;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import defpackage.czo0;
import defpackage.e621;
import defpackage.hbp0;
import defpackage.l4u;
import defpackage.mth;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vff;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a0 {
    public final l4u a;
    public final tt2 b;
    public final vff c;
    public final e621 d;
    public final hbp0 e;

    public a0(l4u l4uVar, tt2 tt2Var, vff vffVar, e621 e621Var) {
        this.a = l4uVar;
        this.b = tt2Var;
        this.c = vffVar;
        this.d = e621Var;
        String d = qoi0.a(a0.class).d();
        this.e = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e4 -> B:10:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a0 a0Var, DrivingRoute drivingRoute, ContinuationImpl continuationImpl) {
        UpcomingStopsCounter$getStopsPositionsIndices$1 upcomingStopsCounter$getStopsPositionsIndices$1;
        int i;
        EmptyList emptyList;
        Iterator it;
        List<Point> list;
        Collection collection;
        a0Var.getClass();
        if (continuationImpl instanceof UpcomingStopsCounter$getStopsPositionsIndices$1) {
            upcomingStopsCounter$getStopsPositionsIndices$1 = (UpcomingStopsCounter$getStopsPositionsIndices$1) continuationImpl;
            int i2 = upcomingStopsCounter$getStopsPositionsIndices$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingStopsCounter$getStopsPositionsIndices$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upcomingStopsCounter$getStopsPositionsIndices$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingStopsCounter$getStopsPositionsIndices$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<RequestPoint> requestPoints = drivingRoute.getRequestPoints();
                    if (requestPoints != null) {
                        List J = kotlin.collections.a.J(requestPoints, 1);
                        ArrayList arrayList = new ArrayList(tcc.n(J, 10));
                        Iterator it2 = J.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((RequestPoint) it2.next()).getPoint());
                        }
                        boolean isEmpty = arrayList.isEmpty();
                        emptyList = arrayList;
                    }
                    emptyList = null;
                    if (emptyList == null) {
                        emptyList = EmptyList.a;
                    }
                    List<Point> points = drivingRoute.getGeometry().getPoints();
                    EmptyList emptyList2 = emptyList;
                    ArrayList arrayList2 = new ArrayList(tcc.n(emptyList2, 10));
                    it = emptyList2.iterator();
                    list = points;
                    collection = arrayList2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) upcomingStopsCounter$getStopsPositionsIndices$1.L$9;
                    it = (Iterator) upcomingStopsCounter$getStopsPositionsIndices$1.L$6;
                    Collection collection2 = (Collection) upcomingStopsCounter$getStopsPositionsIndices$1.L$5;
                    list = (List) upcomingStopsCounter$getStopsPositionsIndices$1.L$2;
                    kotlin.b.b(obj);
                    collection.add(new Integer(((Number) obj).intValue()));
                    collection = collection2;
                    if (it.hasNext()) {
                        Point point = (Point) it.next();
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$0 = null;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$1 = null;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$2 = list;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$3 = null;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$4 = null;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$5 = collection;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$6 = it;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$7 = null;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$8 = null;
                        upcomingStopsCounter$getStopsPositionsIndices$1.L$9 = collection;
                        upcomingStopsCounter$getStopsPositionsIndices$1.label = 1;
                        a0Var.b.getClass();
                        obj = tje.k0(uyj.a, new UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2(list, point, null), upcomingStopsCounter$getStopsPositionsIndices$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add(new Integer(((Number) obj).intValue()));
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        upcomingStopsCounter$getStopsPositionsIndices$1 = new UpcomingStopsCounter$getStopsPositionsIndices$1(a0Var, continuationImpl);
        Object obj2 = upcomingStopsCounter$getStopsPositionsIndices$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingStopsCounter$getStopsPositionsIndices$1.label;
        if (i != 0) {
        }
    }

    public final void b() {
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new UpcomingStopsCounter$attach$$inlined$safeCollectIn$1(new m0(new x(new mth(this.c.c, 6), this), kotlinx.coroutines.flow.e.t(new z(this.a.a)), new UpcomingStopsCounter$getUpcomingStopsCountFlow$1(this, null)), null, this), 3);
    }
}
