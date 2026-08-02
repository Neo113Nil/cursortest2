package com.yandex.go.taxi.order.geo_sharing;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.a20;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.vpk0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a extends a20 {
    public final /* synthetic */ vpk0 c;

    public a(vpk0 vpk0Var) {
        this.c = vpk0Var;
    }

    @Override // defpackage.a20
    public final String a() {
        return "set geo sharing enabled";
    }

    @Override // defpackage.a20
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj, Continuation continuation) {
        return e(str, (ContinuationImpl) continuation, ((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl, boolean z) {
        RideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1 rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1;
        int i;
        if (continuationImpl instanceof RideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1) {
            rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1 = (RideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1) continuationImpl;
            int i2 = rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.label;
                if (i != 0) {
                    b.b(obj);
                    vpk0 vpk0Var = this.c;
                    cmt<OrderChangesDto.PendingChangeDto> g = ((ChangeOrderApi) vpk0Var.d.get()).g(vpk0Var.c.a(str).b(z));
                    rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.L$0 = null;
                    rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.L$1 = null;
                    rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.Z$0 = z;
                    rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(g, null, rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1 = new RideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1(this, continuationImpl);
        Object obj2 = rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideGeoSharingRemoteSettingsUpdaterImpl$GeoSharingDelegate$update$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
