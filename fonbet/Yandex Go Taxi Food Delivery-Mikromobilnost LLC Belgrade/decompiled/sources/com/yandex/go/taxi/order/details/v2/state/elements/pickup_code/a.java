package com.yandex.go.taxi.order.details.v2.state.elements.pickup_code;

import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PickupCode;
import defpackage.g92;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.lbk0;
import defpackage.ny61;
import defpackage.tlk0;
import defpackage.yjk0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final lbk0 a;
    public final c b;

    public a(lbk0 lbk0Var, c cVar) {
        this.a = lbk0Var;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$PickupCode rideCardItemDto$PickupCode, ContinuationImpl continuationImpl) {
        RideCardPickupCodeItemDataSource$stateFlow$1 rideCardPickupCodeItemDataSource$stateFlow$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ibk0 b;
        Object i2;
        ibk0 ibk0Var;
        CharSequence charSequence;
        RideCardItemDto$PickupCode rideCardItemDto$PickupCode2;
        RideCardItemDto$PickupCode rideCardItemDto$PickupCode3 = rideCardItemDto$PickupCode;
        if (continuationImpl instanceof RideCardPickupCodeItemDataSource$stateFlow$1) {
            rideCardPickupCodeItemDataSource$stateFlow$1 = (RideCardPickupCodeItemDataSource$stateFlow$1) continuationImpl;
            int i3 = rideCardPickupCodeItemDataSource$stateFlow$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardPickupCodeItemDataSource$stateFlow$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardPickupCodeItemDataSource$stateFlow$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPickupCodeItemDataSource$stateFlow$1.label;
                c cVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    if (!ijk0.b(rideCardItemDto$PickupCode3)) {
                        return new g92(2, new yjk0(rideCardItemDto$PickupCode3.a));
                    }
                    b2 b2Var = rideCardItemDto$PickupCode3.c;
                    this.a.getClass();
                    b = lbk0.b(b2Var);
                    FormattedText formattedText = rideCardItemDto$PickupCode3.e;
                    rideCardPickupCodeItemDataSource$stateFlow$1.L$0 = rideCardItemDto$PickupCode3;
                    rideCardPickupCodeItemDataSource$stateFlow$1.L$1 = b;
                    rideCardPickupCodeItemDataSource$stateFlow$1.label = 1;
                    obj = c.i(cVar, formattedText, null, rideCardPickupCodeItemDataSource$stateFlow$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence2 = (CharSequence) rideCardPickupCodeItemDataSource$stateFlow$1.L$2;
                        ibk0 ibk0Var2 = (ibk0) rideCardPickupCodeItemDataSource$stateFlow$1.L$1;
                        rideCardItemDto$PickupCode2 = (RideCardItemDto$PickupCode) rideCardPickupCodeItemDataSource$stateFlow$1.L$0;
                        b.b(obj);
                        charSequence = charSequence2;
                        ibk0Var = ibk0Var2;
                        return new g92(2, new tlk0(rideCardItemDto$PickupCode2.a, rideCardItemDto$PickupCode2.b, ibk0Var, rideCardItemDto$PickupCode2.d, charSequence, (CharSequence) obj, false));
                    }
                    b = (ibk0) rideCardPickupCodeItemDataSource$stateFlow$1.L$1;
                    rideCardItemDto$PickupCode3 = (RideCardItemDto$PickupCode) rideCardPickupCodeItemDataSource$stateFlow$1.L$0;
                    b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                FormattedText formattedText2 = rideCardItemDto$PickupCode3.f;
                rideCardPickupCodeItemDataSource$stateFlow$1.L$0 = rideCardItemDto$PickupCode3;
                rideCardPickupCodeItemDataSource$stateFlow$1.L$1 = b;
                rideCardPickupCodeItemDataSource$stateFlow$1.L$2 = charSequence3;
                rideCardPickupCodeItemDataSource$stateFlow$1.label = 2;
                i2 = c.i(cVar, formattedText2, null, rideCardPickupCodeItemDataSource$stateFlow$1, 30);
                if (i2 != coroutineSingletons) {
                    ibk0Var = b;
                    charSequence = charSequence3;
                    obj = i2;
                    rideCardItemDto$PickupCode2 = rideCardItemDto$PickupCode3;
                    return new g92(2, new tlk0(rideCardItemDto$PickupCode2.a, rideCardItemDto$PickupCode2.b, ibk0Var, rideCardItemDto$PickupCode2.d, charSequence, (CharSequence) obj, false));
                }
                return coroutineSingletons;
            }
        }
        rideCardPickupCodeItemDataSource$stateFlow$1 = new RideCardPickupCodeItemDataSource$stateFlow$1(this, continuationImpl);
        Object obj2 = rideCardPickupCodeItemDataSource$stateFlow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPickupCodeItemDataSource$stateFlow$1.label;
        c cVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        FormattedText formattedText22 = rideCardItemDto$PickupCode3.f;
        rideCardPickupCodeItemDataSource$stateFlow$1.L$0 = rideCardItemDto$PickupCode3;
        rideCardPickupCodeItemDataSource$stateFlow$1.L$1 = b;
        rideCardPickupCodeItemDataSource$stateFlow$1.L$2 = charSequence32;
        rideCardPickupCodeItemDataSource$stateFlow$1.label = 2;
        i2 = c.i(cVar2, formattedText22, null, rideCardPickupCodeItemDataSource$stateFlow$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
