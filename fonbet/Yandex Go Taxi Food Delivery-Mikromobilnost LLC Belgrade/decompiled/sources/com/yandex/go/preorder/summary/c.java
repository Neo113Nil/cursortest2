package com.yandex.go.preorder.summary;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.jl40;
import defpackage.mth;
import defpackage.ny61;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.route.interactor.b a;
    public final com.yandex.go.zone.interactors.b b;
    public final o c;

    public c(com.yandex.go.route.interactor.b bVar, com.yandex.go.zone.interactors.b bVar2, o oVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SummaryZoneInteractor$awaitZone$1 summaryZoneInteractor$awaitZone$1;
        int i;
        if (continuationImpl instanceof SummaryZoneInteractor$awaitZone$1) {
            summaryZoneInteractor$awaitZone$1 = (SummaryZoneInteractor$awaitZone$1) continuationImpl;
            int i2 = summaryZoneInteractor$awaitZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryZoneInteractor$awaitZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryZoneInteractor$awaitZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryZoneInteractor$awaitZone$1.label;
                com.yandex.go.route.interactor.b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    summaryZoneInteractor$awaitZone$1.label = 1;
                    obj = bVar.c().h();
                    if (obj == null) {
                        obj = e.y(new mth(new b(bVar.k()), 6), summaryZoneInteractor$awaitZone$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Zone zone = (Zone) obj;
                        ZoneAddress zoneAddress = bVar.c().a;
                        if (zoneAddress != null) {
                            Address address = zoneAddress.a;
                            if (zoneAddress.b == null && jl40.l(address.getZoneName(), zone.a)) {
                                bVar.m(new ZoneAddress(address, zone), bVar.d());
                            }
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                Address address2 = (Address) obj;
                String zoneName = address2.getZoneName();
                zzs B = address2.B();
                summaryZoneInteractor$awaitZone$1.L$0 = null;
                summaryZoneInteractor$awaitZone$1.label = 2;
                obj = this.b.d(zoneName, B, summaryZoneInteractor$awaitZone$1);
            }
        }
        summaryZoneInteractor$awaitZone$1 = new SummaryZoneInteractor$awaitZone$1(this, continuationImpl);
        Object obj2 = summaryZoneInteractor$awaitZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryZoneInteractor$awaitZone$1.label;
        com.yandex.go.route.interactor.b bVar2 = this.a;
        if (i != 0) {
        }
        Address address22 = (Address) obj2;
        String zoneName2 = address22.getZoneName();
        zzs B2 = address22.B();
        summaryZoneInteractor$awaitZone$1.L$0 = null;
        summaryZoneInteractor$awaitZone$1.label = 2;
        obj2 = this.b.d(zoneName2, B2, summaryZoneInteractor$awaitZone$1);
    }
}
