package com.yandex.go.zone.interactors;

import com.yandex.go.zone.model.Zone;
import defpackage.fd61;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.xby;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final fd61 a;
    public final b b;

    public a(fd61 fd61Var, b bVar) {
        this.a = fd61Var;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchRegionIdInteractorImpl$regionIdByLastLocation$1 fetchRegionIdInteractorImpl$regionIdByLastLocation$1;
        int i;
        try {
            if (continuationImpl instanceof FetchRegionIdInteractorImpl$regionIdByLastLocation$1) {
                fetchRegionIdInteractorImpl$regionIdByLastLocation$1 = (FetchRegionIdInteractorImpl$regionIdByLastLocation$1) continuationImpl;
                int i2 = fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fetchRegionIdInteractorImpl$regionIdByLastLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fd61 fd61Var = this.a;
                        fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label = 1;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) fd61Var.a).f(fetchRegionIdInteractorImpl$regionIdByLastLocation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return new Integer(((Zone) obj).n);
                        }
                        kotlin.b.b(obj);
                    }
                    b bVar = this.b;
                    fetchRegionIdInteractorImpl$regionIdByLastLocation$1.L$0 = null;
                    fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label = 2;
                    obj = bVar.c((mo21) obj, fetchRegionIdInteractorImpl$regionIdByLastLocation$1);
                }
            }
            if (i != 0) {
            }
            b bVar2 = this.b;
            fetchRegionIdInteractorImpl$regionIdByLastLocation$1.L$0 = null;
            fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label = 2;
            obj = bVar2.c((mo21) obj, fetchRegionIdInteractorImpl$regionIdByLastLocation$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "ZoneInfo: RegionId", null, th, "Error while trying to get location from locationProvider", 2);
            return new Integer(225);
        }
        fetchRegionIdInteractorImpl$regionIdByLastLocation$1 = new FetchRegionIdInteractorImpl$regionIdByLastLocation$1(this, continuationImpl);
        Object obj2 = fetchRegionIdInteractorImpl$regionIdByLastLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchRegionIdInteractorImpl$regionIdByLastLocation$1.label;
    }
}
