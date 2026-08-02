package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class i {
    public final po21 a;
    public final com.yandex.go.zone.interactors.b b;
    public final b c;

    public i(po21 po21Var, com.yandex.go.zone.interactors.b bVar, b bVar2) {
        this.a = po21Var;
        this.b = bVar;
        this.c = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1 fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1;
        int i;
        if (continuationImpl instanceof FetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1) {
            fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1 = (FetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1) continuationImpl;
            int i2 = fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).g(fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.L$0 = null;
                        fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.L$1 = null;
                        fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label = 3;
                        Object b = this.c.b((Zone) obj, fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    kotlin.b.b(obj);
                }
                fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.L$0 = null;
                fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label = 2;
                obj = this.b.c((mo21) obj, fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1);
            }
        }
        fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1 = new FetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1(this, continuationImpl);
        Object obj2 = fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label;
        if (i != 0) {
        }
        fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.L$0 = null;
        fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1.label = 2;
        obj2 = this.b.c((mo21) obj2, fetchUserLocationZoneInteractorImpl$fetchUserLocationZoneAndAwaitTariffs$1);
    }
}
