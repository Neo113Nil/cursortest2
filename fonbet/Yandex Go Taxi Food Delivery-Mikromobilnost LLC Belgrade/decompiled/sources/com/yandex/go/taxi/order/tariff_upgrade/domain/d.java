package com.yandex.go.taxi.order.tariff_upgrade.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TariffUpgradeDto;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.opx0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar, l lVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1 tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1) {
            tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1 = (TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1) continuation;
            int i2 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    if (!taxiOrder.l.n) {
                        OrderStatusInfo V = taxiOrder.V();
                        DriveState driveState = V.i;
                        switch (driveState == null ? -1 : opx0.a[driveState.ordinal()]) {
                            case -1:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                break;
                            case 0:
                            default:
                                w511.b();
                                return null;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                                TariffUpgradeDto tariffUpgradeDto = V.z;
                                if (tariffUpgradeDto != TariffUpgradeDto.e && !evu0.J(tariffUpgradeDto.b) && !evu0.J(tariffUpgradeDto.c)) {
                                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.L$0 = null;
                                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.L$1 = null;
                                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.L$2 = null;
                                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.L$3 = null;
                                    tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.label = 1;
                                    if (vprVar.emit(obj, tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                break;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1 = new TariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUpgradeInteractor$tariffUpgradeFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
