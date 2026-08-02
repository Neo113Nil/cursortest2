package com.yandex.go.zone.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.dz21;
import defpackage.fz21;
import defpackage.g8e;
import defpackage.gz21;
import defpackage.jst;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.xby;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final b a;
    public final com.yandex.go.route.interactor.c b;
    public final com.yandex.go.route.interactor.b c;

    public e(b bVar, com.yandex.go.route.interactor.c cVar, com.yandex.go.route.interactor.b bVar2) {
        this.a = bVar;
        this.b = cVar;
        this.c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Address address, ContinuationImpl continuationImpl) {
        ValidateZoneInteractorImpl$fetchZone$1 validateZoneInteractorImpl$fetchZone$1;
        int i;
        Zone zone;
        try {
            if (continuationImpl instanceof ValidateZoneInteractorImpl$fetchZone$1) {
                validateZoneInteractorImpl$fetchZone$1 = (ValidateZoneInteractorImpl$fetchZone$1) continuationImpl;
                int i2 = validateZoneInteractorImpl$fetchZone$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    validateZoneInteractorImpl$fetchZone$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = validateZoneInteractorImpl$fetchZone$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = validateZoneInteractorImpl$fetchZone$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        b bVar = this.a;
                        String zoneName = address.getZoneName();
                        zzs B = address.B();
                        validateZoneInteractorImpl$fetchZone$1.L$0 = address;
                        validateZoneInteractorImpl$fetchZone$1.label = 1;
                        obj = bVar.d(zoneName, B, validateZoneInteractorImpl$fetchZone$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        address = (Address) validateZoneInteractorImpl$fetchZone$1.L$0;
                        kotlin.b.b(obj);
                    }
                    zone = (Zone) obj;
                    if (zone.h()) {
                        return gz21.a;
                    }
                    this.c.m(new ZoneAddress(address, zone), null);
                    return new fz21(zone);
                }
            }
            if (i != 0) {
            }
            zone = (Zone) obj;
            if (zone.h()) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String o = g8e.o("Failed to resolve zone for address", address.D1());
            if (s8o.u(th)) {
                xby.t(jst.e, "ZONE_VALIDATION:CLIENT_ERROR", th, o, 2);
            } else {
                xby.l(jst.e, s8o.E(th) ? "ZONE_VALIDATION:SERVER_ERROR" : s8o.z(th) ? "ZONE_VALIDATION:IO_ERROR" : "ZONE_VALIDATION:UNKNOWN_ERROR", null, th, o, 2);
            }
            return dz21.a;
        }
        validateZoneInteractorImpl$fetchZone$1 = new ValidateZoneInteractorImpl$fetchZone$1(this, continuationImpl);
        Object obj2 = validateZoneInteractorImpl$fetchZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = validateZoneInteractorImpl$fetchZone$1.label;
    }
}
