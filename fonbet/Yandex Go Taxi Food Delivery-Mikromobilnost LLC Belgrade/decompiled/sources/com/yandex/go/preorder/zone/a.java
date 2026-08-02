package com.yandex.go.preorder.zone;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public a(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r9.emit(r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1 preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Address address;
        if (continuation instanceof PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1) {
            preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1 = (PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1) continuation;
            int i2 = preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address address2 = ((ZoneAddress) obj).a;
                    com.yandex.go.zone.interactors.b bVar = this.b.g;
                    String zoneName = address2.getZoneName();
                    zzs B = address2.B();
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$0 = null;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$1 = null;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$2 = null;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$4 = vprVar2;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$5 = null;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$6 = null;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$7 = address2;
                    preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.d(zoneName, B, preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        address = address2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                address = (Address) preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$7;
                vprVar = (vpr) preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                ZoneAddress zoneAddress = new ZoneAddress(address, (Zone) obj2);
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$0 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$1 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$2 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$3 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$4 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$5 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$6 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$7 = null;
                preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label = 2;
            }
        }
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1 = new PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1(this, continuation);
        Object obj22 = preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        ZoneAddress zoneAddress2 = new ZoneAddress(address, (Zone) obj22);
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$0 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$1 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$2 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$3 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$4 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$5 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$6 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.L$7 = null;
        preorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$map$1$2$1.label = 2;
    }
}
