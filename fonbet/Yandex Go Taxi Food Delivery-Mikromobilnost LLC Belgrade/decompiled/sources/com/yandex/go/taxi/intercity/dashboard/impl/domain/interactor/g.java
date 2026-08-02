package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardGeoPointDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardRouteDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardRequestDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import defpackage.amc;
import defpackage.apw;
import defpackage.axm;
import defpackage.gay0;
import defpackage.lc0;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.qgw;
import defpackage.rfa0;
import defpackage.rgw;
import defpackage.scc;
import defpackage.sgw;
import defpackage.tgw;
import defpackage.ugw;
import defpackage.w511;
import defpackage.y1s;
import defpackage.yfw;
import java.util.Calendar;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class g {
    public final gay0 a;
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a b;
    public final axm c;
    public final y1s d;
    public final apw e;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j f;
    public final amc g;

    public g(gay0 gay0Var, com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, axm axmVar, y1s y1sVar, apw apwVar, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j jVar, amc amcVar) {
        this.a = gay0Var;
        this.b = aVar;
        this.c = axmVar;
        this.d = y1sVar;
        this.e = apwVar;
        this.f = jVar;
        this.g = amcVar;
    }

    public static IntercityDashboardGeoPointDto a(tgw tgwVar) {
        if (tgwVar instanceof rgw) {
            rgw rgwVar = (rgw) tgwVar;
            return new IntercityDashboardGeoPointDto(scc.g(Double.valueOf(rgwVar.b), Double.valueOf(rgwVar.a)), (String) null, 2);
        }
        if (tgwVar instanceof sgw) {
            sgw sgwVar = (sgw) tgwVar;
            return new IntercityDashboardGeoPointDto(scc.g(Double.valueOf(sgwVar.c), Double.valueOf(sgwVar.b)), (String) null, 2);
        }
        if (tgwVar instanceof qgw) {
            return new IntercityDashboardGeoPointDto((List) null, ((qgw) tgwVar).a, 1);
        }
        if (tgwVar == null) {
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ugw ugwVar, ContinuationImpl continuationImpl) {
        IntercityDashboardRequestInteractor$requestDashboardContent$1 intercityDashboardRequestInteractor$requestDashboardContent$1;
        int i;
        rfa0 rfa0Var;
        ugw ugwVar2;
        Calendar calendar;
        lc0 lc0Var;
        r0 r0Var;
        Object value;
        Object invoke;
        if (continuationImpl instanceof IntercityDashboardRequestInteractor$requestDashboardContent$1) {
            intercityDashboardRequestInteractor$requestDashboardContent$1 = (IntercityDashboardRequestInteractor$requestDashboardContent$1) continuationImpl;
            int i2 = intercityDashboardRequestInteractor$requestDashboardContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardRequestInteractor$requestDashboardContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardRequestInteractor$requestDashboardContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardRequestInteractor$requestDashboardContent$1.label;
                com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    IntercityDashboardRouteDto intercityDashboardRouteDto = new IntercityDashboardRouteDto(a(ugwVar.a), a(ugwVar.b));
                    lv90 a = this.a.b.a();
                    if (a.a == null) {
                        rfa0Var = null;
                    } else {
                        PaymentMethod$Type paymentMethod$Type = a.a;
                        if (paymentMethod$Type == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        rfa0Var = new rfa0(paymentMethod$Type, a.b, (String) null, (Boolean) null, (List) null, 28);
                    }
                    Calendar b = this.c.b();
                    IntercityDashboardRequestDto intercityDashboardRequestDto = new IntercityDashboardRequestDto(intercityDashboardRouteDto, b, rfa0Var, b == null ? Boolean.valueOf(this.d.a()) : null);
                    intercityDashboardRequestInteractor$requestDashboardContent$1.L$0 = ugwVar;
                    intercityDashboardRequestInteractor$requestDashboardContent$1.L$1 = null;
                    intercityDashboardRequestInteractor$requestDashboardContent$1.L$2 = null;
                    intercityDashboardRequestInteractor$requestDashboardContent$1.L$3 = b;
                    intercityDashboardRequestInteractor$requestDashboardContent$1.L$4 = null;
                    intercityDashboardRequestInteractor$requestDashboardContent$1.L$5 = null;
                    intercityDashboardRequestInteractor$requestDashboardContent$1.label = 1;
                    obj = aVar.b(intercityDashboardRequestDto, intercityDashboardRequestInteractor$requestDashboardContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ugwVar2 = ugwVar;
                    calendar = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Calendar calendar2 = (Calendar) intercityDashboardRequestInteractor$requestDashboardContent$1.L$3;
                    ugwVar2 = (ugw) intercityDashboardRequestInteractor$requestDashboardContent$1.L$0;
                    kotlin.b.b(obj);
                    calendar = calendar2;
                }
                lc0Var = new lc0(this, (IntercityDashboardResponseDto) obj, ugwVar2, calendar, 25);
                r0Var = aVar.b;
                do {
                    value = r0Var.getValue();
                    invoke = lc0Var.invoke(value);
                } while (!r0Var.k(value, invoke));
                return (yfw) invoke;
            }
        }
        intercityDashboardRequestInteractor$requestDashboardContent$1 = new IntercityDashboardRequestInteractor$requestDashboardContent$1(this, continuationImpl);
        Object obj2 = intercityDashboardRequestInteractor$requestDashboardContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardRequestInteractor$requestDashboardContent$1.label;
        com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar2 = this.b;
        if (i != 0) {
        }
        lc0Var = new lc0(this, (IntercityDashboardResponseDto) obj2, ugwVar2, calendar, 25);
        r0Var = aVar2.b;
        do {
            value = r0Var.getValue();
            invoke = lc0Var.invoke(value);
        } while (!r0Var.k(value, invoke));
        return (yfw) invoke;
    }
}
