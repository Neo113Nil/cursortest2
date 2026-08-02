package com.yandex.go.taxi.order.net.tracker;

import com.yandex.go.taxi.order.net.taxi.dto.request.TaxiRouteParam;
import defpackage.bay0;
import defpackage.mdh;
import defpackage.mw2;
import defpackage.ny61;
import defpackage.o201;
import defpackage.r201;
import defpackage.s201;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.net.taxi.TaxiApi;
import ru.yandex.taxi.net.tracker.analytics.TaxiRouteError;

/* loaded from: classes14.dex */
public final class e implements s201 {
    public final tt2 a;
    public final String b;
    public final TaxiApi c;
    public final ru.yandex.taxi.launch.c d;
    public final ru.yandex.taxi.net.tracker.analytics.a e;
    public final bay0 f;

    public e(tt2 tt2Var, String str, TaxiApi taxiApi, ru.yandex.taxi.launch.c cVar, ru.yandex.taxi.net.tracker.analytics.a aVar, bay0 bay0Var) {
        this.a = tt2Var;
        this.b = str;
        this.c = taxiApi;
        this.d = cVar;
        this.e = aVar;
        this.f = bay0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, sls slsVar, ContinuationImpl continuationImpl) {
        TaxiTrackerRequestFactory$createParam$1 taxiTrackerRequestFactory$createParam$1;
        int i;
        r201 r201Var;
        eVar.getClass();
        if (continuationImpl instanceof TaxiTrackerRequestFactory$createParam$1) {
            taxiTrackerRequestFactory$createParam$1 = (TaxiTrackerRequestFactory$createParam$1) continuationImpl;
            int i2 = taxiTrackerRequestFactory$createParam$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiTrackerRequestFactory$createParam$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiTrackerRequestFactory$createParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiTrackerRequestFactory$createParam$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r201Var = (r201) slsVar.invoke();
                    ru.yandex.taxi.launch.c cVar = eVar.d;
                    taxiTrackerRequestFactory$createParam$1.L$0 = null;
                    taxiTrackerRequestFactory$createParam$1.L$1 = r201Var;
                    taxiTrackerRequestFactory$createParam$1.label = 1;
                    obj = cVar.c(taxiTrackerRequestFactory$createParam$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r201Var = (r201) taxiTrackerRequestFactory$createParam$1.L$1;
                    kotlin.b.b(obj);
                }
                return new TaxiRouteParam((String) obj, eVar.b, r201Var.c, r201Var.a, r201Var.b, Boolean.TRUE, Boolean.FALSE);
            }
        }
        taxiTrackerRequestFactory$createParam$1 = new TaxiTrackerRequestFactory$createParam$1(eVar, continuationImpl);
        Object obj2 = taxiTrackerRequestFactory$createParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiTrackerRequestFactory$createParam$1.label;
        if (i != 0) {
        }
        return new TaxiRouteParam((String) obj2, eVar.b, r201Var.c, r201Var.a, r201Var.b, Boolean.TRUE, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.s201
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mw2 mw2Var, ContinuationImpl continuationImpl) {
        TaxiTrackerRequestFactory$request$1 taxiTrackerRequestFactory$request$1;
        int i;
        try {
            if (continuationImpl instanceof TaxiTrackerRequestFactory$request$1) {
                taxiTrackerRequestFactory$request$1 = (TaxiTrackerRequestFactory$request$1) continuationImpl;
                int i2 = taxiTrackerRequestFactory$request$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    taxiTrackerRequestFactory$request$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = taxiTrackerRequestFactory$request$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiTrackerRequestFactory$request$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        TaxiTrackerRequestFactory$request$2$1 taxiTrackerRequestFactory$request$2$1 = new TaxiTrackerRequestFactory$request$2$1(this, mw2Var, null);
                        taxiTrackerRequestFactory$request$1.L$0 = null;
                        taxiTrackerRequestFactory$request$1.label = 1;
                        obj = tje.k0(mdhVar, taxiTrackerRequestFactory$request$2$1, taxiTrackerRequestFactory$request$1);
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
                    return (o201) obj;
                }
            }
            if (i != 0) {
            }
            return (o201) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            boolean x = s8o.x(th);
            ru.yandex.taxi.net.tracker.analytics.a aVar = this.e;
            if (x) {
                aVar.a(new TaxiRouteError.NetworkError(th));
            } else {
                aVar.a(new TaxiRouteError.AnotherError(th));
            }
            throw th;
        }
        taxiTrackerRequestFactory$request$1 = new TaxiTrackerRequestFactory$request$1(this, continuationImpl);
        Object obj2 = taxiTrackerRequestFactory$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiTrackerRequestFactory$request$1.label;
    }
}
