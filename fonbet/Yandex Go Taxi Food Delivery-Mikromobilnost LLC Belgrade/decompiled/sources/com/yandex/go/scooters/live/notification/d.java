package com.yandex.go.scooters.live.notification;

import android.graphics.Bitmap;
import android.os.SystemClock;
import defpackage.e3n;
import defpackage.k7x0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pav;
import defpackage.ywn0;
import defpackage.zuj0;
import defpackage.zuo0;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes13.dex */
public final class d {
    public final pav a;
    public final com.yandex.go.analytics.b b;
    public final zuj0 c;
    public final k7x0 d;

    public d(pav pavVar, com.yandex.go.analytics.b bVar, zuj0 zuj0Var, k7x0 k7x0Var) {
        this.a = pavVar;
        this.b = bVar;
        this.c = zuj0Var;
        this.d = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$1 scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1;
        int i;
        Bitmap bitmap;
        dVar.getClass();
        if (continuationImpl instanceof ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$1) {
            scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1 = (ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$1) continuationImpl;
            int i2 = scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o430 o430Var = e3n.b;
                    long U = kp50.U(5, DurationUnit.SECONDS);
                    ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1 scootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1 = new ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1(zuo0Var, dVar, null);
                    scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.L$0 = zuo0Var;
                    scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.label = 1;
                    obj = kotlinx.coroutines.a.x(U, scootersLiveNotificationUiStateMapper$mapToVehicleInfo$smallImage$1, scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zuo0Var = (zuo0) scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    com.yandex.go.analytics.b bVar = dVar.b;
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
                    bVar.b("Scooters.Live.UiStateMapperSmallImageNull", mapBuilder.j());
                }
                return new ywn0(bitmap, zuo0Var.getNumber().a);
            }
        }
        scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1 = new ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$1(dVar, continuationImpl);
        Object obj2 = scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveNotificationUiStateMapper$mapToVehicleInfo$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
        return new ywn0(bitmap, zuo0Var.getNumber().a);
    }
}
