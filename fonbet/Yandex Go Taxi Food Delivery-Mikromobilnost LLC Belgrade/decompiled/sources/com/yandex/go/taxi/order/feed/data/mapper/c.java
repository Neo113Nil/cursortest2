package com.yandex.go.taxi.order.feed.data.mapper;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.feed_common.api.payment.PaymentInfo;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.f;
import com.yandex.go.shortcuts.dto.request.SavedPlace;
import com.yandex.go.shortcuts.factory.SavedPlaceFactory$CreationCacheStrategy;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import com.yandex.go.zone.repository.r;
import defpackage.bc2;
import defpackage.cda0;
import defpackage.ny61;
import defpackage.pf10;
import defpackage.q1m0;
import defpackage.rfa0;
import defpackage.scc;
import defpackage.vit;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zzs;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class c {
    public final f a;
    public final vit b;
    public final o c;
    public final r d;
    public final q1m0 e;
    public final wnt f;
    public final bc2 g;

    public c(f fVar, vit vitVar, o oVar, r rVar, q1m0 q1m0Var, wnt wntVar, bc2 bc2Var) {
        this.a = fVar;
        this.b = vitVar;
        this.c = oVar;
        this.d = rVar;
        this.e = q1m0Var;
        this.f = wntVar;
        this.g = bc2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(11:18|19|20|21|22|(1:24)(1:37)|25|(3:27|(1:29)(1:35)|30)(1:36)|31|(3:34|13|14)|33))(1:41))(3:49|(1:51)|33)|42|43|44|(8:46|21|22|(0)(0)|25|(0)(0)|31|(0))|33))|7|(0)(0)|42|43|44|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        r4 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TaxiOrderToDocumentBodyMapper$createUserLocation$1 taxiOrderToDocumentBodyMapper$createUserLocation$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        c cVar;
        TaxiOrder taxiOrder2;
        zzs zzsVar;
        Object c;
        String str;
        zzs m;
        SavedPlace.Location location;
        Serializable a;
        SavedPlace.Location location2;
        SavedPlace.Location location3;
        SavedPlace.Location location4;
        try {
            if (continuationImpl instanceof TaxiOrderToDocumentBodyMapper$createUserLocation$1) {
                taxiOrderToDocumentBodyMapper$createUserLocation$1 = (TaxiOrderToDocumentBodyMapper$createUserLocation$1) continuationImpl;
                int i2 = taxiOrderToDocumentBodyMapper$createUserLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    taxiOrderToDocumentBodyMapper$createUserLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = taxiOrderToDocumentBodyMapper$createUserLocation$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiOrderToDocumentBodyMapper$createUserLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0 = taxiOrder;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1 = this;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.label = 1;
                        obj = this.a.a(taxiOrderToDocumentBodyMapper$createUserLocation$1);
                        if (obj != coroutineSingletons) {
                            cVar = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            location4 = (SavedPlace.Location) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$3;
                            location3 = (SavedPlace.Location) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2;
                            location2 = (SavedPlace.Location) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1;
                            kotlin.b.b(obj);
                            return new TaxiOrderToDocumentBodyMapper$UserLocations(location2, location3, location4, (List) obj);
                        }
                        zzsVar = (zzs) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2;
                        cVar = (c) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1;
                        taxiOrder2 = (TaxiOrder) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            str = (String) obj;
                        } catch (Throwable unused) {
                            str = null;
                            SavedPlace.Location c2 = cVar.c(zzsVar, str);
                            zzs v = taxiOrder2.v();
                            if (v == null) {
                            }
                            m = taxiOrder2.m();
                            if (m == null) {
                            }
                            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0 = null;
                            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1 = c2;
                            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2 = r10;
                            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$3 = location;
                            taxiOrderToDocumentBodyMapper$createUserLocation$1.label = 3;
                            a = ((com.yandex.go.shortcuts.impl.factory.f) this.e).a(SavedPlaceFactory$CreationCacheStrategy.WITHOUT_CACHE, taxiOrderToDocumentBodyMapper$createUserLocation$1);
                            if (a != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        SavedPlace.Location c22 = cVar.c(zzsVar, str);
                        zzs v2 = taxiOrder2.v();
                        SavedPlace.Location c3 = v2 == null ? c(v2, taxiOrder2.w()) : null;
                        m = taxiOrder2.m();
                        if (m == null) {
                            Address l = taxiOrder2.l();
                            location = c(m, l != null ? l.getZoneName() : null);
                        } else {
                            location = null;
                        }
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0 = null;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1 = c22;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2 = c3;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$3 = location;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.label = 3;
                        a = ((com.yandex.go.shortcuts.impl.factory.f) this.e).a(SavedPlaceFactory$CreationCacheStrategy.WITHOUT_CACHE, taxiOrderToDocumentBodyMapper$createUserLocation$1);
                        if (a != coroutineSingletons) {
                            location2 = c22;
                            location3 = c3;
                            obj = a;
                            location4 = location;
                            return new TaxiOrderToDocumentBodyMapper$UserLocations(location2, location3, location4, (List) obj);
                        }
                        return coroutineSingletons;
                    }
                    c cVar2 = (c) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1;
                    TaxiOrder taxiOrder3 = (TaxiOrder) taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0;
                    kotlin.b.b(obj);
                    cVar = cVar2;
                    taxiOrder = taxiOrder3;
                    zzs zzsVar2 = (zzs) obj;
                    r rVar = this.d;
                    taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0 = taxiOrder;
                    taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1 = cVar;
                    taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2 = zzsVar2;
                    taxiOrderToDocumentBodyMapper$createUserLocation$1.label = 2;
                    c = rVar.c(taxiOrderToDocumentBodyMapper$createUserLocation$1);
                    if (c != coroutineSingletons) {
                        taxiOrder2 = taxiOrder;
                        zzsVar = zzsVar2;
                        obj = c;
                        str = (String) obj;
                        SavedPlace.Location c222 = cVar.c(zzsVar, str);
                        zzs v22 = taxiOrder2.v();
                        if (v22 == null) {
                        }
                        m = taxiOrder2.m();
                        if (m == null) {
                        }
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0 = null;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1 = c222;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2 = c3;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.L$3 = location;
                        taxiOrderToDocumentBodyMapper$createUserLocation$1.label = 3;
                        a = ((com.yandex.go.shortcuts.impl.factory.f) this.e).a(SavedPlaceFactory$CreationCacheStrategy.WITHOUT_CACHE, taxiOrderToDocumentBodyMapper$createUserLocation$1);
                        if (a != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            zzs zzsVar22 = (zzs) obj;
            r rVar2 = this.d;
            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$0 = taxiOrder;
            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$1 = cVar;
            taxiOrderToDocumentBodyMapper$createUserLocation$1.L$2 = zzsVar22;
            taxiOrderToDocumentBodyMapper$createUserLocation$1.label = 2;
            c = rVar2.c(taxiOrderToDocumentBodyMapper$createUserLocation$1);
            if (c != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
        taxiOrderToDocumentBodyMapper$createUserLocation$1 = new TaxiOrderToDocumentBodyMapper$createUserLocation$1(this, continuationImpl);
        Object obj2 = taxiOrderToDocumentBodyMapper$createUserLocation$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderToDocumentBodyMapper$createUserLocation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, DriveState driveState, ContinuationImpl continuationImpl) {
        TaxiOrderToDocumentBodyMapper$map$1 taxiOrderToDocumentBodyMapper$map$1;
        int i;
        if (continuationImpl instanceof TaxiOrderToDocumentBodyMapper$map$1) {
            taxiOrderToDocumentBodyMapper$map$1 = (TaxiOrderToDocumentBodyMapper$map$1) continuationImpl;
            int i2 = taxiOrderToDocumentBodyMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderToDocumentBodyMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderToDocumentBodyMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderToDocumentBodyMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiOrderToDocumentBodyMapper$map$1.L$0 = taxiOrder;
                    taxiOrderToDocumentBodyMapper$map$1.L$1 = driveState;
                    taxiOrderToDocumentBodyMapper$map$1.label = 1;
                    obj = a(taxiOrder, taxiOrderToDocumentBodyMapper$map$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    driveState = (DriveState) taxiOrderToDocumentBodyMapper$map$1.L$1;
                    taxiOrder = (TaxiOrder) taxiOrderToDocumentBodyMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations = (TaxiOrderToDocumentBodyMapper$UserLocations) obj;
                bc2 bc2Var = this.g;
                Context context = bc2Var.a;
                Context context2 = bc2Var.a;
                pf10 pf10Var = new pf10(context.getResources().getDisplayMetrics().heightPixels, context2.getResources().getDisplayMetrics().widthPixels, context2.getResources().getDisplayMetrics().density);
                rfa0 f = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) this.b.b)).f(null);
                PaymentInfo paymentInfo = new PaymentInfo(f.b, f.a.getCode());
                String driveState2 = driveState == null ? driveState.toString() : null;
                String x = taxiOrder.x();
                return ((xnt) this.f).f(new TaxiOrderDocumentBody(taxiOrderToDocumentBodyMapper$UserLocations, pf10Var, driveState2, paymentInfo, x.length() <= 0 ? x : null), TaxiOrderDocumentBody.Companion.serializer());
            }
        }
        taxiOrderToDocumentBodyMapper$map$1 = new TaxiOrderToDocumentBodyMapper$map$1(this, continuationImpl);
        Object obj3 = taxiOrderToDocumentBodyMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderToDocumentBodyMapper$map$1.label;
        if (i != 0) {
        }
        TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations2 = (TaxiOrderToDocumentBodyMapper$UserLocations) obj3;
        bc2 bc2Var2 = this.g;
        Context context3 = bc2Var2.a;
        Context context22 = bc2Var2.a;
        pf10 pf10Var2 = new pf10(context3.getResources().getDisplayMetrics().heightPixels, context22.getResources().getDisplayMetrics().widthPixels, context22.getResources().getDisplayMetrics().density);
        rfa0 f2 = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) this.b.b)).f(null);
        PaymentInfo paymentInfo2 = new PaymentInfo(f2.b, f2.a.getCode());
        if (driveState == null) {
        }
        String x2 = taxiOrder.x();
        return ((xnt) this.f).f(new TaxiOrderDocumentBody(taxiOrderToDocumentBodyMapper$UserLocations2, pf10Var2, driveState2, paymentInfo2, x2.length() <= 0 ? x2 : null), TaxiOrderDocumentBody.Companion.serializer());
    }

    public final SavedPlace.Location c(zzs zzsVar, String str) {
        Zone f;
        List g = scc.g(Double.valueOf(zzsVar.a), Double.valueOf(zzsVar.b));
        Integer num = null;
        if (str != null && (f = this.c.f(str)) != null) {
            num = Integer.valueOf(f.n);
        }
        return new SavedPlace.Location(g, num);
    }
}
