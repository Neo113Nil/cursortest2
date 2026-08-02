package com.yandex.go.taxi.order.details.v1.elements.user_requirements;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.e8j;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.q8j;
import defpackage.ws21;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements q8j {
    public final e8j a;
    public final c b;
    public final gci0 c;

    public b(e8j e8jVar, c cVar) {
        this.a = e8jVar;
        this.b = cVar;
        this.c = e8jVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        DetailsCardUserRequirementsStateInteractor$onOrderUpdated$1 detailsCardUserRequirementsStateInteractor$onOrderUpdated$1;
        int i;
        if (continuation instanceof DetailsCardUserRequirementsStateInteractor$onOrderUpdated$1) {
            detailsCardUserRequirementsStateInteractor$onOrderUpdated$1 = (DetailsCardUserRequirementsStateInteractor$onOrderUpdated$1) continuation;
            int i2 = detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.L$0 = null;
                    detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.label = 1;
                    obj = this.b.a(taxiOrder, detailsCardUserRequirementsStateInteractor$onOrderUpdated$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.a.a.l((ws21) obj);
                return zy11.a;
            }
        }
        detailsCardUserRequirementsStateInteractor$onOrderUpdated$1 = new DetailsCardUserRequirementsStateInteractor$onOrderUpdated$1(this, continuation);
        Object obj2 = detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardUserRequirementsStateInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        this.a.a.l((ws21) obj2);
        return zy11.a;
    }
}
