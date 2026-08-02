package com.yandex.go.taxi.order.cache.data;

import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams;
import com.yandex.go.taxi.order.cache.data.model.OrderDetailsPresentationInfoSerializable;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rs70;
import defpackage.ss70;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ts70;
import defpackage.tse;
import defpackage.us70;
import defpackage.vs70;
import defpackage.ws70;
import defpackage.ww60;
import defpackage.ys70;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public final class a implements ww60 {
    public final b a;
    public final tse b;
    public pzt0 c;

    public a(b bVar, tse tseVar) {
        this.a = bVar;
        this.b = tseVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x004f, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0042, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(ContinuationImpl continuationImpl) {
        CachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1 cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1;
        int i;
        if (continuationImpl instanceof CachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1) {
            cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1 = (CachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1) continuationImpl;
            int i2 = cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var = this.c;
                    if (pzt0Var != null) {
                        cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label = 1;
                        obj = pzt0Var.u0(cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1);
                    }
                    cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label = 2;
                    obj = this.a.a(cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Iterable<OrderDetailsPresentationInfoSerializable> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                        for (OrderDetailsPresentationInfoSerializable orderDetailsPresentationInfoSerializable : iterable) {
                            OrderCacheParams.Service service = orderDetailsPresentationInfoSerializable.d;
                            String str = orderDetailsPresentationInfoSerializable.a;
                            long j = orderDetailsPresentationInfoSerializable.c;
                            int i3 = ys70.a[service.ordinal()];
                            arrayList.add(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? new ss70(str, j) : new us70(str, j) : new rs70(str, j) : new vs70(orderDetailsPresentationInfoSerializable.c, orderDetailsPresentationInfoSerializable.a, orderDetailsPresentationInfoSerializable.e, orderDetailsPresentationInfoSerializable.f) : new ts70(str, j, orderDetailsPresentationInfoSerializable.g) : new ws70(str, j));
                        }
                        return arrayList;
                    }
                    kotlin.b.b(obj);
                }
                cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label = 2;
                obj = this.a.a(cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1);
            }
        }
        cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1 = new CachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1(this, continuationImpl);
        Object obj2 = cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label;
        if (i != 0) {
        }
        cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1.label = 2;
        obj2 = this.a.a(cachedOrdersOnStartRepositoryImpl$getCachedOrdersOnStart$1);
    }

    @Override // defpackage.ww60
    public final void f() {
        this.c = tje.N(this.b, null, CoroutineStart.UNDISPATCHED, new CachedOrdersOnStartRepositoryImpl$onAppConfiguration$1(this, null), 1);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "OrdersCacheOnStartRepository";
    }
}
