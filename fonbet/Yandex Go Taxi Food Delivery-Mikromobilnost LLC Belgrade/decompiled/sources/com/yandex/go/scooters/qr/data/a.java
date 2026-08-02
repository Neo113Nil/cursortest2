package com.yandex.go.scooters.qr.data;

import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse;
import com.yandex.go.scooters.qr.domain.model.ScootersAvailabilityCheckOpenReason;
import defpackage.cmt;
import defpackage.e8p0;
import defpackage.ny61;
import defpackage.r7p0;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.scooters.data.a a;
    public final ScootersScooterAvailabilityApi b;
    public final com.yandex.go.scooters.qr.data.mapper.a c;

    public a(ru.yandex.taxi.scooters.data.a aVar, ScootersScooterAvailabilityApi scootersScooterAvailabilityApi, com.yandex.go.scooters.qr.data.mapper.a aVar2) {
        this.a = aVar;
        this.b = scootersScooterAvailabilityApi;
        this.c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r7p0 r7p0Var, ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason, boolean z, ContinuationImpl continuationImpl) {
        ScootersScooterAvailabilityRepository$checkScooter$1 scootersScooterAvailabilityRepository$checkScooter$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason2;
        Object a;
        r7p0 r7p0Var2;
        ?? r13;
        ScootersScooterAvailabilityApi scootersScooterAvailabilityApi;
        boolean z2;
        e8p0 e8p0Var;
        if (continuationImpl instanceof ScootersScooterAvailabilityRepository$checkScooter$1) {
            scootersScooterAvailabilityRepository$checkScooter$1 = (ScootersScooterAvailabilityRepository$checkScooter$1) continuationImpl;
            int i2 = scootersScooterAvailabilityRepository$checkScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersScooterAvailabilityRepository$checkScooter$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersScooterAvailabilityRepository$checkScooter$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersScooterAvailabilityRepository$checkScooter$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersScooterAvailabilityRepository$checkScooter$1.L$0 = r7p0Var;
                    scootersAvailabilityCheckOpenReason2 = scootersAvailabilityCheckOpenReason;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$1 = scootersAvailabilityCheckOpenReason2;
                    ScootersScooterAvailabilityApi scootersScooterAvailabilityApi2 = this.b;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$2 = scootersScooterAvailabilityApi2;
                    scootersScooterAvailabilityRepository$checkScooter$1.Z$0 = z;
                    scootersScooterAvailabilityRepository$checkScooter$1.label = 1;
                    a = this.a.a(false, scootersScooterAvailabilityRepository$checkScooter$1);
                    if (a != coroutineSingletons) {
                        r7p0Var2 = r7p0Var;
                        r13 = z;
                        scootersScooterAvailabilityApi = scootersScooterAvailabilityApi2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    z2 = scootersScooterAvailabilityRepository$checkScooter$1.Z$0;
                    b.b(obj);
                    scootersScooterAvailabilityRepository$checkScooter$1.L$0 = null;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$1 = null;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$2 = null;
                    scootersScooterAvailabilityRepository$checkScooter$1.Z$0 = z2;
                    scootersScooterAvailabilityRepository$checkScooter$1.label = 3;
                    Object a2 = this.c.a((ScootersVehicleAvailabilityResponse) obj, scootersScooterAvailabilityRepository$checkScooter$1);
                    return a2 != coroutineSingletons ? coroutineSingletons : a2;
                }
                boolean z3 = scootersScooterAvailabilityRepository$checkScooter$1.Z$0;
                ScootersScooterAvailabilityApi scootersScooterAvailabilityApi3 = (ScootersScooterAvailabilityApi) scootersScooterAvailabilityRepository$checkScooter$1.L$2;
                ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason3 = (ScootersAvailabilityCheckOpenReason) scootersScooterAvailabilityRepository$checkScooter$1.L$1;
                r7p0 r7p0Var3 = (r7p0) scootersScooterAvailabilityRepository$checkScooter$1.L$0;
                b.b(obj);
                r13 = z3;
                scootersAvailabilityCheckOpenReason2 = scootersAvailabilityCheckOpenReason3;
                scootersScooterAvailabilityApi = scootersScooterAvailabilityApi3;
                a = obj;
                r7p0Var2 = r7p0Var3;
                cmt<ScootersVehicleAvailabilityResponse> a3 = scootersScooterAvailabilityApi.a((Map) a, r7p0Var2 == null ? r7p0Var2.a : null, (r7p0Var2 != null || (e8p0Var = r7p0Var2.b) == null) ? null : e8p0Var.k(), scootersAvailabilityCheckOpenReason2 == null ? scootersAvailabilityCheckOpenReason2.getValue() : null, r13);
                scootersScooterAvailabilityRepository$checkScooter$1.L$0 = null;
                scootersScooterAvailabilityRepository$checkScooter$1.L$1 = null;
                scootersScooterAvailabilityRepository$checkScooter$1.L$2 = null;
                scootersScooterAvailabilityRepository$checkScooter$1.Z$0 = r13;
                scootersScooterAvailabilityRepository$checkScooter$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.d(a3, scootersScooterAvailabilityRepository$checkScooter$1);
                if (obj != coroutineSingletons) {
                    z2 = r13;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$0 = null;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$1 = null;
                    scootersScooterAvailabilityRepository$checkScooter$1.L$2 = null;
                    scootersScooterAvailabilityRepository$checkScooter$1.Z$0 = z2;
                    scootersScooterAvailabilityRepository$checkScooter$1.label = 3;
                    Object a22 = this.c.a((ScootersVehicleAvailabilityResponse) obj, scootersScooterAvailabilityRepository$checkScooter$1);
                    if (a22 != coroutineSingletons) {
                    }
                }
            }
        }
        scootersScooterAvailabilityRepository$checkScooter$1 = new ScootersScooterAvailabilityRepository$checkScooter$1(this, continuationImpl);
        obj = scootersScooterAvailabilityRepository$checkScooter$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersScooterAvailabilityRepository$checkScooter$1.label;
        if (i != 0) {
        }
        cmt<ScootersVehicleAvailabilityResponse> a32 = scootersScooterAvailabilityApi.a((Map) a, r7p0Var2 == null ? r7p0Var2.a : null, (r7p0Var2 != null || (e8p0Var = r7p0Var2.b) == null) ? null : e8p0Var.k(), scootersAvailabilityCheckOpenReason2 == null ? scootersAvailabilityCheckOpenReason2.getValue() : null, r13);
        scootersScooterAvailabilityRepository$checkScooter$1.L$0 = null;
        scootersScooterAvailabilityRepository$checkScooter$1.L$1 = null;
        scootersScooterAvailabilityRepository$checkScooter$1.L$2 = null;
        scootersScooterAvailabilityRepository$checkScooter$1.Z$0 = r13;
        scootersScooterAvailabilityRepository$checkScooter$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.d(a32, scootersScooterAvailabilityRepository$checkScooter$1);
        if (obj != coroutineSingletons) {
        }
    }
}
