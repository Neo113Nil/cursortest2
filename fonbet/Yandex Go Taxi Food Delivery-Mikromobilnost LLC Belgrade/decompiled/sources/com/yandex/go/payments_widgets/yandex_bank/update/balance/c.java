package com.yandex.go.payments_widgets.yandex_bank.update.balance;

import defpackage.cc20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sf00;
import defpackage.uf00;
import defpackage.v4r0;
import defpackage.vf00;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cc20 b;

    public c(vpr vprVar, cc20 cc20Var) {
        this.a = vprVar;
        this.b = cc20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1 updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1;
        int i;
        zy11 zy11Var;
        zy11 zy11Var2 = zy11.a;
        if (continuation instanceof UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1) {
            updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1 = (UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var2;
                }
                kotlin.b.b(obj2);
                vpr vprVar = this.a;
                List<o2y0> list = ((wl40) obj).a;
                this.b.getClass();
                MapBuilder mapBuilder = new MapBuilder();
                for (o2y0 o2y0Var : list) {
                    if (o2y0Var.b().r() == PaymentMethod$Type.YB_WALLET) {
                        mapBuilder.put(o2y0Var.b().a, o2y0Var.b().h.getB());
                    }
                }
                MapBuilder j = mapBuilder.j();
                MapBuilder mapBuilder2 = (MapBuilder) this.b.b;
                this.b.b = j;
                if (mapBuilder2 != null && (!j.isEmpty() || !mapBuilder2.isEmpty())) {
                    if (v4r0.g(j.keySet(), mapBuilder2.keySet()).isEmpty()) {
                        this.b.getClass();
                        Object it = ((vf00) j.entrySet()).iterator();
                        while (((uf00) it).hasNext()) {
                            Map.Entry entry = (Map.Entry) ((sf00) it).next();
                            String str = (String) entry.getKey();
                            DriveState driveState = (DriveState) entry.getValue();
                            if (driveState == ((DriveState) mapBuilder2.get(str)) || driveState.compareTo(DriveState.TRANSPORTING) < 0) {
                            }
                        }
                    }
                    zy11Var = zy11Var2;
                    if (zy11Var != null) {
                        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (vprVar.emit(zy11Var, updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var2;
                }
                zy11Var = null;
                if (zy11Var != null) {
                }
                return zy11Var2;
            }
        }
        updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1 = new UpdateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYandexCardBalanceByTaxiOrderInteractor$updateBalanceFlow$$inlined$mapNotNull$1$2$1.label;
        if (i == 0) {
        }
    }
}
