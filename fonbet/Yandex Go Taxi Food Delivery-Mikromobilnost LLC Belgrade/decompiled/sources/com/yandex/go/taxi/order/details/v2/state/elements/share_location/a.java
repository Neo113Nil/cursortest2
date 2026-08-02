package com.yandex.go.taxi.order.details.v2.state.elements.share_location;

import android.graphics.drawable.Drawable;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ShareLocation;
import defpackage.avj0;
import defpackage.css0;
import defpackage.ess0;
import defpackage.f1h0;
import defpackage.fss0;
import defpackage.g92;
import defpackage.gss0;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.irs0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qrs0;
import defpackage.sqs0;
import defpackage.sss0;
import defpackage.tpr;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.yjk0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.order.d;

/* loaded from: classes14.dex */
public final class a {
    public final irs0 a;
    public final sqs0 b;
    public final d c;
    public final zuj0 d;

    public a(irs0 irs0Var, sqs0 sqs0Var, d dVar, zuj0 zuj0Var) {
        this.a = irs0Var;
        this.b = sqs0Var;
        this.c = dVar;
        this.d = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, SlotItemDto slotItemDto, ContinuationImpl continuationImpl) {
        RideCardShareLocationItemDataSource$getUnavailableSlotState$1 rideCardShareLocationItemDataSource$getUnavailableSlotState$1;
        int i;
        gss0 gss0Var;
        irs0 irs0Var = aVar.a;
        zuj0 zuj0Var = aVar.d;
        if (continuationImpl instanceof RideCardShareLocationItemDataSource$getUnavailableSlotState$1) {
            rideCardShareLocationItemDataSource$getUnavailableSlotState$1 = (RideCardShareLocationItemDataSource$getUnavailableSlotState$1) continuationImpl;
            int i2 = rideCardShareLocationItemDataSource$getUnavailableSlotState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardShareLocationItemDataSource$getUnavailableSlotState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardShareLocationItemDataSource$getUnavailableSlotState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardShareLocationItemDataSource$getUnavailableSlotState$1.label;
                if (i != 0) {
                    b.b(obj);
                    avj0 avj0Var = (avj0) zuj0Var;
                    Drawable t = vng.t(f1h0.ic_order_card_live_location_unavailable, avj0Var.a);
                    gss0 fss0Var = t != null ? new fss0(t, false) : ess0.a;
                    ArrayList a = qrs0.a(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(qje.t(xng0.textMinor, avj0Var.a))}, 1)), slotItemDto.d);
                    rideCardShareLocationItemDataSource$getUnavailableSlotState$1.L$0 = slotItemDto;
                    rideCardShareLocationItemDataSource$getUnavailableSlotState$1.L$1 = null;
                    rideCardShareLocationItemDataSource$getUnavailableSlotState$1.L$2 = fss0Var;
                    rideCardShareLocationItemDataSource$getUnavailableSlotState$1.L$3 = null;
                    rideCardShareLocationItemDataSource$getUnavailableSlotState$1.label = 1;
                    Object k = ((com.yandex.go.slot.mapper.a) irs0Var).k(a, null, rideCardShareLocationItemDataSource$getUnavailableSlotState$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gss0Var = fss0Var;
                    obj = k;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gss0 gss0Var2 = (gss0) rideCardShareLocationItemDataSource$getUnavailableSlotState$1.L$2;
                    SlotItemDto slotItemDto2 = (SlotItemDto) rideCardShareLocationItemDataSource$getUnavailableSlotState$1.L$0;
                    b.b(obj);
                    gss0Var = gss0Var2;
                    slotItemDto = slotItemDto2;
                }
                sss0 sss0Var = new sss0(false, false);
                sqs0 sqs0Var = aVar.b;
                b2 b2Var = slotItemDto.a;
                irs0Var.getClass();
                return new xss0(gss0Var, (css0) obj, sss0Var, (ibk0) sqs0Var.a(b2Var), SlotItemUiState$Size.L);
            }
        }
        rideCardShareLocationItemDataSource$getUnavailableSlotState$1 = new RideCardShareLocationItemDataSource$getUnavailableSlotState$1(aVar, continuationImpl);
        Object obj2 = rideCardShareLocationItemDataSource$getUnavailableSlotState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardShareLocationItemDataSource$getUnavailableSlotState$1.label;
        if (i != 0) {
        }
        sss0 sss0Var2 = new sss0(false, false);
        sqs0 sqs0Var2 = aVar.b;
        b2 b2Var2 = slotItemDto.a;
        irs0Var.getClass();
        return new xss0(gss0Var, (css0) obj2, sss0Var2, (ibk0) sqs0Var2.a(b2Var2), SlotItemUiState$Size.L);
    }

    public final tpr b(RideCardItemDto$ShareLocation rideCardItemDto$ShareLocation) {
        return !ijk0.b(rideCardItemDto$ShareLocation) ? new g92(2, new yjk0(rideCardItemDto$ShareLocation.a)) : e.I(new mth(this.c.k, 6), new RideCardShareLocationItemDataSource$stateFlow$1(rideCardItemDto$ShareLocation, this, null));
    }
}
