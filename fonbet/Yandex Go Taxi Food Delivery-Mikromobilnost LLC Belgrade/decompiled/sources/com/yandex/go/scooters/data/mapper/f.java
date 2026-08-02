package com.yandex.go.scooters.data.mapper;

import defpackage.h3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rhf;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.wnt;
import defpackage.xnt;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f {
    public final wnt a;
    public final h3y b;

    public f(wnt wntVar, h3y h3yVar) {
        this.a = wntVar;
        this.b = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlinx.serialization.json.b bVar, ContinuationImpl continuationImpl) {
        UnifiedPollingScootersOrdersMapperImpl$map$1 unifiedPollingScootersOrdersMapperImpl$map$1;
        int i;
        try {
            if (continuationImpl instanceof UnifiedPollingScootersOrdersMapperImpl$map$1) {
                unifiedPollingScootersOrdersMapperImpl$map$1 = (UnifiedPollingScootersOrdersMapperImpl$map$1) continuationImpl;
                int i2 = unifiedPollingScootersOrdersMapperImpl$map$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    unifiedPollingScootersOrdersMapperImpl$map$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = unifiedPollingScootersOrdersMapperImpl$map$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = unifiedPollingScootersOrdersMapperImpl$map$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        rhf rhfVar = (rhf) ((xnt) this.a).d(bVar, rhf.Companion.serializer());
                        ru.yandex.taxi.scooters.data.mapper.a aVar = (ru.yandex.taxi.scooters.data.mapper.a) this.b.get();
                        unifiedPollingScootersOrdersMapperImpl$map$1.L$0 = null;
                        unifiedPollingScootersOrdersMapperImpl$map$1.L$1 = null;
                        unifiedPollingScootersOrdersMapperImpl$map$1.label = 1;
                        obj = aVar.a(rhfVar, unifiedPollingScootersOrdersMapperImpl$map$1);
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
                    return uh6.C((sqm0) obj);
                }
            }
            if (i != 0) {
            }
            return uh6.C((sqm0) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error on scooters orders mapping");
            return EmptyList.a;
        }
        unifiedPollingScootersOrdersMapperImpl$map$1 = new UnifiedPollingScootersOrdersMapperImpl$map$1(this, continuationImpl);
        Object obj2 = unifiedPollingScootersOrdersMapperImpl$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingScootersOrdersMapperImpl$map$1.label;
    }
}
