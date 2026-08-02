package com.yandex.go.taxi.order.details.v1.elements.buttons;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.q4j;
import defpackage.q8j;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final h a;
    public final q4j b;

    public a(h hVar, q4j q4jVar) {
        this.a = hVar;
        this.b = q4jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        DetailsCardBottomButtonsInteractor$onOrderUpdated$1 detailsCardBottomButtonsInteractor$onOrderUpdated$1;
        int i;
        if (continuation instanceof DetailsCardBottomButtonsInteractor$onOrderUpdated$1) {
            detailsCardBottomButtonsInteractor$onOrderUpdated$1 = (DetailsCardBottomButtonsInteractor$onOrderUpdated$1) continuation;
            int i2 = detailsCardBottomButtonsInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardBottomButtonsInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardBottomButtonsInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardBottomButtonsInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (taxiOrder.J()) {
                        return zy11.a;
                    }
                    detailsCardBottomButtonsInteractor$onOrderUpdated$1.L$0 = null;
                    detailsCardBottomButtonsInteractor$onOrderUpdated$1.label = 1;
                    obj = this.a.b(taxiOrder, detailsCardBottomButtonsInteractor$onOrderUpdated$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                DetailsCardBottomButtonsInteractor$onOrderUpdated$2 detailsCardBottomButtonsInteractor$onOrderUpdated$2 = new DetailsCardBottomButtonsInteractor$onOrderUpdated$2(this, null);
                detailsCardBottomButtonsInteractor$onOrderUpdated$1.L$0 = null;
                detailsCardBottomButtonsInteractor$onOrderUpdated$1.label = 2;
                Object k = kotlinx.coroutines.flow.e.k((tpr) obj, detailsCardBottomButtonsInteractor$onOrderUpdated$2, detailsCardBottomButtonsInteractor$onOrderUpdated$1);
                return k != coroutineSingletons ? coroutineSingletons : k;
            }
        }
        detailsCardBottomButtonsInteractor$onOrderUpdated$1 = new DetailsCardBottomButtonsInteractor$onOrderUpdated$1(this, continuation);
        Object obj2 = detailsCardBottomButtonsInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardBottomButtonsInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        DetailsCardBottomButtonsInteractor$onOrderUpdated$2 detailsCardBottomButtonsInteractor$onOrderUpdated$22 = new DetailsCardBottomButtonsInteractor$onOrderUpdated$2(this, null);
        detailsCardBottomButtonsInteractor$onOrderUpdated$1.L$0 = null;
        detailsCardBottomButtonsInteractor$onOrderUpdated$1.label = 2;
        Object k2 = kotlinx.coroutines.flow.e.k((tpr) obj2, detailsCardBottomButtonsInteractor$onOrderUpdated$22, detailsCardBottomButtonsInteractor$onOrderUpdated$1);
        if (k2 != coroutineSingletons2) {
        }
    }
}
