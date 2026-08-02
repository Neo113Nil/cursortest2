package com.yandex.go.taxi.order.performer;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.DriverPictures;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import defpackage.bxl;
import defpackage.eo5;
import defpackage.evu0;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.oim;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.wwa0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final eo5 a;
    public final b b;
    public final com.yandex.go.taxi.order.domain.interactors.c c;

    public a(eo5 eo5Var, b bVar, com.yandex.go.taxi.order.domain.interactors.c cVar) {
        this.a = eo5Var;
        this.b = bVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, String str2, ContinuationImpl continuationImpl) {
        DriverInfoInteractor$getDriverPhoto$1 driverInfoInteractor$getDriverPhoto$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof DriverInfoInteractor$getDriverPhoto$1) {
            driverInfoInteractor$getDriverPhoto$1 = (DriverInfoInteractor$getDriverPhoto$1) continuationImpl;
            int i2 = driverInfoInteractor$getDriverPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driverInfoInteractor$getDriverPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driverInfoInteractor$getDriverPhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driverInfoInteractor$getDriverPhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eo5 eo5Var = aVar.a;
                    driverInfoInteractor$getDriverPhoto$1.L$0 = null;
                    driverInfoInteractor$getDriverPhoto$1.L$1 = str2;
                    driverInfoInteractor$getDriverPhoto$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(((OrderPerformerApi) eo5Var.a.getValue()).a(str, str2), null, driverInfoInteractor$getDriverPhoto$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) driverInfoInteractor$getDriverPhoto$1.L$1;
                    kotlin.b.b(obj);
                }
                return new wwa0(((OrderPerformerInfoResponse) obj).a, str2);
            }
        }
        driverInfoInteractor$getDriverPhoto$1 = new DriverInfoInteractor$getDriverPhoto$1(aVar, continuationImpl);
        Object obj2 = driverInfoInteractor$getDriverPhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driverInfoInteractor$getDriverPhoto$1.label;
        if (i != 0) {
        }
        return new wwa0(((OrderPerformerInfoResponse) obj2).a, str2);
    }

    public final void b(TaxiOrder taxiOrder) {
        n7v n7vVar;
        pzt0 pzt0Var;
        oim b = this.b.b(taxiOrder);
        Driver driver = taxiOrder.V().g;
        TaxiOrderAdditionalData b2 = taxiOrder.b();
        DriverInfoInteractor$requestDriverPhoto$1 driverInfoInteractor$requestDriverPhoto$1 = new DriverInfoInteractor$requestDriverPhoto$1(this, taxiOrder, null);
        b.getClass();
        String str = driver.p;
        if (evu0.J(str)) {
            b.b.f(new bxl(10, b), "reset");
            pzt0 pzt0Var2 = b.d;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            b.e = false;
            b.f = null;
            return;
        }
        n7v a = b2.a();
        n7v n7vVar2 = n7v.f;
        if (a.equals(n7vVar2)) {
            DriverPictures driverPictures = b2.a;
            if (driverPictures == null || (n7vVar = driverPictures.b) == null) {
                n7vVar = n7vVar2;
            }
            if (n7vVar.equals(n7vVar2)) {
                if (!str.equals(b.f) || (((pzt0Var = b.d) == null || !pzt0Var.isActive()) && !b.e)) {
                    pzt0 pzt0Var3 = b.d;
                    if (pzt0Var3 != null) {
                        pzt0Var3.a(null);
                    }
                    b.e = false;
                    b.f = str;
                    b.d = tje.N(b.a, null, null, new DriverInfoProcessing$makeRequestIfNeeded$1(driverInfoInteractor$requestDriverPhoto$1, str, b, null), 3);
                }
            }
        }
    }
}
