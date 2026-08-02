package com.yandex.go.navigator.utils;

import com.yandex.mapkit.geometry.Point;
import defpackage.el00;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o400;
import defpackage.po21;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vlm;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class d {
    public final vlm a;
    public final po21 b;
    public final tt2 c;
    public final el00 d;
    public final HashMap e = new HashMap();

    public d(vlm vlmVar, po21 po21Var, tt2 tt2Var, el00 el00Var) {
        this.a = vlmVar;
        this.b = po21Var;
        this.c = tt2Var;
        this.d = el00Var;
    }

    public final Object a(Point point, Point point2, ContinuationImpl continuationImpl) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new DrivingRouteInteractor$requestFastestRouteToPoint$3(this, point2, point, null), continuationImpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(3:30|31|(2:33|26))|18|19|(1:21)|22|(2:24|(1:26)(1:27))(1:28)))|38|6|7|(0)(0)|18|19|(0)|22|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0041, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        r12 = new kotlin.Result.Failure(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Point point, ContinuationImpl continuationImpl) {
        DrivingRouteInteractor$requestFastestRouteToPoint$1 drivingRouteInteractor$requestFastestRouteToPoint$1;
        int i;
        Object failure;
        mo21 mo21Var;
        if (continuationImpl instanceof DrivingRouteInteractor$requestFastestRouteToPoint$1) {
            drivingRouteInteractor$requestFastestRouteToPoint$1 = (DrivingRouteInteractor$requestFastestRouteToPoint$1) continuationImpl;
            int i2 = drivingRouteInteractor$requestFastestRouteToPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingRouteInteractor$requestFastestRouteToPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = drivingRouteInteractor$requestFastestRouteToPoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingRouteInteractor$requestFastestRouteToPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = this.b;
                    drivingRouteInteractor$requestFastestRouteToPoint$1.L$0 = point;
                    drivingRouteInteractor$requestFastestRouteToPoint$1.label = 1;
                    obj = ((e) po21Var).f(drivingRouteInteractor$requestFastestRouteToPoint$1);
                    if (obj == obj2) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    point = (Point) drivingRouteInteractor$requestFastestRouteToPoint$1.L$0;
                    kotlin.b.b(obj);
                }
                failure = (mo21) obj;
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                mo21Var = (mo21) failure;
                if (mo21Var != null) {
                    return null;
                }
                zzs a = mo21Var.a();
                Point point2 = new Point(a.a, a.b);
                drivingRouteInteractor$requestFastestRouteToPoint$1.L$0 = null;
                drivingRouteInteractor$requestFastestRouteToPoint$1.L$1 = null;
                drivingRouteInteractor$requestFastestRouteToPoint$1.label = 2;
                Object a2 = a(point2, point, drivingRouteInteractor$requestFastestRouteToPoint$1);
                return a2 == obj2 ? obj2 : a2;
            }
        }
        drivingRouteInteractor$requestFastestRouteToPoint$1 = new DrivingRouteInteractor$requestFastestRouteToPoint$1(this, continuationImpl);
        Object obj3 = drivingRouteInteractor$requestFastestRouteToPoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingRouteInteractor$requestFastestRouteToPoint$1.label;
        if (i != 0) {
        }
        failure = (mo21) obj3;
        if (failure instanceof Result.Failure) {
        }
        mo21Var = (mo21) failure;
        if (mo21Var != null) {
        }
    }
}
