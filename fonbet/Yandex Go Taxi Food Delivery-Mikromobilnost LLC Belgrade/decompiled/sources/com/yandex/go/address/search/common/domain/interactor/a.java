package com.yandex.go.address.search.common.domain.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.analytics.ListBasedOrderAddressAnalyticsData;
import com.yandex.go.analytics.e;
import defpackage.atd0;
import defpackage.b64;
import defpackage.evu0;
import defpackage.i4v0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.p931;
import defpackage.pv0;
import defpackage.q931;
import defpackage.xby;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class a {
    public final atd0 a;

    public a(atd0 atd0Var) {
        this.a = atd0Var;
    }

    public final Object a(Address address, String str, RoutePointType routePointType, PositionInitAction positionInitAction, boolean z, Continuation continuation) {
        boolean z2;
        String str2;
        Integer num;
        i4v0 i4v0Var;
        e analyticsData = address.getAnalyticsData();
        if (analyticsData == null) {
            xby.l(jst.e, "DESTINATION_VERIFY_ERROR:MISSED_ANALYTICS_DATA", null, new NullPointerException("Missed address analytics data"), b64.l("Passed address=", address.D1(), " without analytics data with pickMethod=", address.getPickMethod()), 2);
            i4v0Var = i4v0.j;
        } else {
            if (analyticsData instanceof ListBasedOrderAddressAnalyticsData) {
                ListBasedOrderAddressAnalyticsData listBasedOrderAddressAnalyticsData = (ListBasedOrderAddressAnalyticsData) analyticsData;
                Integer valueOf = Integer.valueOf(listBasedOrderAddressAnalyticsData.h);
                z2 = listBasedOrderAddressAnalyticsData.j;
                str2 = listBasedOrderAddressAnalyticsData.h();
                num = valueOf;
            } else {
                z2 = false;
                str2 = null;
                num = null;
            }
            i4v0Var = new i4v0(analyticsData.getA(), analyticsData.getC(), str2, num, null, null, null, z2, false, 256);
        }
        GeoPointAcquisitionType geoPointAcquisitionType = address.getGeoPointAcquisitionType();
        if (geoPointAcquisitionType == null) {
            geoPointAcquisitionType = GeoPointAcquisitionType.DEFAULT;
        }
        return kotlinx.coroutines.flow.e.y(((i) this.a).h(address.B(), "addressCorrection", routePointType, str, i4v0Var, address.q2(), address.D0(), geoPointAcquisitionType, null, positionInitAction, z), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[Catch: all -> 0x0046, CancellationException -> 0x00d9, TryCatch #1 {all -> 0x0046, blocks: (B:13:0x0042, B:14:0x007f, B:16:0x0087, B:19:0x008d), top: B:12:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d A[Catch: all -> 0x0046, CancellationException -> 0x00d9, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:13:0x0042, B:14:0x007f, B:16:0x0087, B:19:0x008d), top: B:12:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Address address, RoutePointType routePointType, PositionInitAction positionInitAction, boolean z, ContinuationImpl continuationImpl) {
        VerifyDestinationInteractor$verifyForBlockedZone$1 verifyDestinationInteractor$verifyForBlockedZone$1;
        int i;
        Address address2;
        RoutePointType routePointType2;
        try {
            if (continuationImpl instanceof VerifyDestinationInteractor$verifyForBlockedZone$1) {
                verifyDestinationInteractor$verifyForBlockedZone$1 = (VerifyDestinationInteractor$verifyForBlockedZone$1) continuationImpl;
                int i2 = verifyDestinationInteractor$verifyForBlockedZone$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    verifyDestinationInteractor$verifyForBlockedZone$1.label = i2 - Integer.MIN_VALUE;
                    VerifyDestinationInteractor$verifyForBlockedZone$1 verifyDestinationInteractor$verifyForBlockedZone$12 = verifyDestinationInteractor$verifyForBlockedZone$1;
                    Object obj = verifyDestinationInteractor$verifyForBlockedZone$12.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = verifyDestinationInteractor$verifyForBlockedZone$12.label;
                    if (i != 0) {
                        b.b(obj);
                        String c2 = address.c2();
                        if (c2 == null || evu0.J(c2)) {
                            xby.l(jst.e, "DESTINATION_VERIFY_ERROR:MISSED_LOG", null, new NullPointerException("Missed log"), "Failed to verify address=" + address.D1() + " for point=" + routePointType, 2);
                            return new p931(new pv0(address, null, null, null, null, null, null, null, 1022));
                        }
                        try {
                            verifyDestinationInteractor$verifyForBlockedZone$12.L$0 = address;
                            verifyDestinationInteractor$verifyForBlockedZone$12.L$1 = routePointType;
                            verifyDestinationInteractor$verifyForBlockedZone$12.L$2 = null;
                            verifyDestinationInteractor$verifyForBlockedZone$12.L$3 = null;
                            verifyDestinationInteractor$verifyForBlockedZone$12.Z$0 = z;
                            verifyDestinationInteractor$verifyForBlockedZone$12.label = 1;
                            obj = a(address, c2, routePointType, positionInitAction, z, verifyDestinationInteractor$verifyForBlockedZone$12);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            address2 = address;
                            routePointType2 = routePointType;
                            xby.l(jst.e, "DESTINATION_VERIFY_ERROR:FINALIZE_FAILED", null, th, "Failed to verify address=" + address2.D1() + " for point=" + routePointType2, 2);
                            return new p931(new pv0(address2, null, null, null, null, null, null, null, 1022));
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        routePointType2 = (RoutePointType) verifyDestinationInteractor$verifyForBlockedZone$12.L$1;
                        try {
                            b.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            address2 = (Address) verifyDestinationInteractor$verifyForBlockedZone$12.L$0;
                            xby.l(jst.e, "DESTINATION_VERIFY_ERROR:FINALIZE_FAILED", null, th, "Failed to verify address=" + address2.D1() + " for point=" + routePointType2, 2);
                            return new p931(new pv0(address2, null, null, null, null, null, null, null, 1022));
                        }
                    }
                    pv0 pv0Var = (pv0) obj;
                    return !pv0Var.b.f ? new q931(pv0Var) : new p931(pv0Var);
                }
            }
            if (i != 0) {
            }
            pv0 pv0Var2 = (pv0) obj;
            if (!pv0Var2.b.f) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        verifyDestinationInteractor$verifyForBlockedZone$1 = new VerifyDestinationInteractor$verifyForBlockedZone$1(this, continuationImpl);
        VerifyDestinationInteractor$verifyForBlockedZone$1 verifyDestinationInteractor$verifyForBlockedZone$122 = verifyDestinationInteractor$verifyForBlockedZone$1;
        Object obj3 = verifyDestinationInteractor$verifyForBlockedZone$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyDestinationInteractor$verifyForBlockedZone$122.label;
    }
}
