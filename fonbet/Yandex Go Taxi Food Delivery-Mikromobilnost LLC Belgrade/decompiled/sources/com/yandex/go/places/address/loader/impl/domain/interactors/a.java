package com.yandex.go.places.address.loader.impl.domain.interactors;

import defpackage.atd0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class a {
    public final atd0 a;

    public a(atd0 atd0Var) {
        this.a = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, ContinuationImpl continuationImpl, RoutePointType routePointType) {
        PlacesAddressLoadersInteractor$loadAddressInfo$1 placesAddressLoadersInteractor$loadAddressInfo$1;
        int i;
        try {
            if (continuationImpl instanceof PlacesAddressLoadersInteractor$loadAddressInfo$1) {
                placesAddressLoadersInteractor$loadAddressInfo$1 = (PlacesAddressLoadersInteractor$loadAddressInfo$1) continuationImpl;
                int i2 = placesAddressLoadersInteractor$loadAddressInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesAddressLoadersInteractor$loadAddressInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesAddressLoadersInteractor$loadAddressInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesAddressLoadersInteractor$loadAddressInfo$1.label;
                    if (i != 0) {
                        b.b(obj);
                        i iVar = (i) this.a;
                        iVar.getClass();
                        tpr c = atd0.c(iVar, zzsVar, routePointType, null, null, null, str, 24);
                        placesAddressLoadersInteractor$loadAddressInfo$1.L$0 = null;
                        placesAddressLoadersInteractor$loadAddressInfo$1.L$1 = null;
                        placesAddressLoadersInteractor$loadAddressInfo$1.L$2 = null;
                        placesAddressLoadersInteractor$loadAddressInfo$1.label = 1;
                        obj = e.y(c, placesAddressLoadersInteractor$loadAddressInfo$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (pv0) obj;
                }
            }
            if (i != 0) {
            }
            return (pv0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        placesAddressLoadersInteractor$loadAddressInfo$1 = new PlacesAddressLoadersInteractor$loadAddressInfo$1(this, continuationImpl);
        Object obj2 = placesAddressLoadersInteractor$loadAddressInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesAddressLoadersInteractor$loadAddressInfo$1.label;
    }
}
