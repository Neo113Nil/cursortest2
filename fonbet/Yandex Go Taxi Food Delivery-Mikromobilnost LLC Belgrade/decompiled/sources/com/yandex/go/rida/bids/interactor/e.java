package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.interactor.e;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.avu0;
import defpackage.evu0;
import defpackage.f5k0;
import defpackage.fq5;
import defpackage.i3y;
import defpackage.ief;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sls;
import defpackage.v8a0;
import defpackage.z0a0;
import defpackage.zuj0;
import java.math.BigDecimal;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class e {
    public final zuj0 a;
    public final o2y0 b;
    public final f5k0 c;
    public final x d;
    public final ru.yandex.taxi.order.view.b e;
    public final z0a0 f;
    public final i3y g;
    public final i3y h;

    public e(zuj0 zuj0Var, o2y0 o2y0Var, f5k0 f5k0Var, x xVar, ru.yandex.taxi.order.view.b bVar, z0a0 z0a0Var) {
        this.a = zuj0Var;
        this.b = o2y0Var;
        this.c = f5k0Var;
        this.d = xVar;
        this.e = bVar;
        this.f = z0a0Var;
        final int i = 0;
        this.g = kotlin.a.a(new sls(this) { // from class: hq5
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                e eVar = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) eVar.a).h(gyh0.rida_bids_waiting_for_driver_offers);
                    default:
                        return ((avj0) eVar.a).h(gyh0.rida_bids_choose_a_driver);
                }
            }
        });
        final int i2 = 1;
        this.h = kotlin.a.a(new sls(this) { // from class: hq5
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) eVar.a).h(gyh0.rida_bids_waiting_for_driver_offers);
                    default:
                        return ((avj0) eVar.a).h(gyh0.rida_bids_choose_a_driver);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, TaxiOrder taxiOrder, String str, ContinuationImpl continuationImpl) {
        BidsDriveCardUiStateInteractor$paymentBlockUiState$1 bidsDriveCardUiStateInteractor$paymentBlockUiState$1;
        int i;
        v8a0 v8a0Var;
        eVar.getClass();
        if (continuationImpl instanceof BidsDriveCardUiStateInteractor$paymentBlockUiState$1) {
            bidsDriveCardUiStateInteractor$paymentBlockUiState$1 = (BidsDriveCardUiStateInteractor$paymentBlockUiState$1) continuationImpl;
            int i2 = bidsDriveCardUiStateInteractor$paymentBlockUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsDriveCardUiStateInteractor$paymentBlockUiState$1.label = i2 - Integer.MIN_VALUE;
                BidsDriveCardUiStateInteractor$paymentBlockUiState$1 bidsDriveCardUiStateInteractor$paymentBlockUiState$12 = bidsDriveCardUiStateInteractor$paymentBlockUiState$1;
                Object obj = bidsDriveCardUiStateInteractor$paymentBlockUiState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsDriveCardUiStateInteractor$paymentBlockUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        lv90 lv90Var = taxiOrder.V().I;
                        ru.yandex.taxi.order.view.b bVar = eVar.e;
                        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
                        String str2 = lv90Var.b;
                        String str3 = taxiOrder.V().v;
                        BigDecimal h = str3 != null ? avu0.h(str3) : null;
                        ief iefVar = taxiOrder.V().K;
                        String str4 = iefVar != null ? iefVar.b : null;
                        bidsDriveCardUiStateInteractor$paymentBlockUiState$12.L$0 = null;
                        bidsDriveCardUiStateInteractor$paymentBlockUiState$12.L$1 = str;
                        bidsDriveCardUiStateInteractor$paymentBlockUiState$12.L$2 = null;
                        bidsDriveCardUiStateInteractor$paymentBlockUiState$12.label = 1;
                        obj = bVar.d(paymentMethod$Type, str2, h, str4, bidsDriveCardUiStateInteractor$paymentBlockUiState$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) bidsDriveCardUiStateInteractor$paymentBlockUiState$12.L$1;
                kotlin.b.b(obj);
                v8a0Var = (v8a0) obj;
                if (v8a0Var != null) {
                    return new fq5(v8a0Var.b, eVar.f, str);
                }
                return null;
            }
        }
        bidsDriveCardUiStateInteractor$paymentBlockUiState$1 = new BidsDriveCardUiStateInteractor$paymentBlockUiState$1(eVar, continuationImpl);
        BidsDriveCardUiStateInteractor$paymentBlockUiState$1 bidsDriveCardUiStateInteractor$paymentBlockUiState$122 = bidsDriveCardUiStateInteractor$paymentBlockUiState$1;
        Object obj2 = bidsDriveCardUiStateInteractor$paymentBlockUiState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsDriveCardUiStateInteractor$paymentBlockUiState$122.label;
        if (i != 0) {
        }
        v8a0Var = (v8a0) obj2;
        if (v8a0Var != null) {
        }
        return null;
    }
}
