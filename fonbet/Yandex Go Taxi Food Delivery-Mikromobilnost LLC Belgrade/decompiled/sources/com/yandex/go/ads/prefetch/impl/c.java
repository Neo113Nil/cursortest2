package com.yandex.go.ads.prefetch.impl;

import android.content.Context;
import defpackage.bvf0;
import defpackage.cp60;
import defpackage.j5z;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tt2;
import defpackage.yd1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes.dex */
public final class c implements yd1 {
    public final Context a;
    public final j5z b;
    public final po21 c;
    public final cp60 d;
    public final tt2 e;

    public c(Context context, j5z j5zVar, po21 po21Var, cp60 cp60Var, tt2 tt2Var) {
        this.a = context;
        this.b = j5zVar;
        this.c = po21Var;
        this.d = cp60Var;
        this.e = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        AdvertPrefetchHeadersProviderImpl$fetchLocationOrNull$1 advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1;
        int i;
        cVar.getClass();
        try {
            if (continuationImpl instanceof AdvertPrefetchHeadersProviderImpl$fetchLocationOrNull$1) {
                advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1 = (AdvertPrefetchHeadersProviderImpl$fetchLocationOrNull$1) continuationImpl;
                int i2 = advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        po21 po21Var = cVar.c;
                        advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.label = 1;
                        obj = ((e) po21Var).f(advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1);
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
                    return (mo21) obj;
                }
            }
            if (i != 0) {
            }
            return (mo21) obj;
        } catch (Exception e) {
            jst.e.k(e, "AdvertPrefetchHeadersProvider: location failed");
            return null;
        }
        advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1 = new AdvertPrefetchHeadersProviderImpl$fetchLocationOrNull$1(cVar, continuationImpl);
        Object obj2 = advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertPrefetchHeadersProviderImpl$fetchLocationOrNull$1.label;
    }

    public final Object b(Continuation continuation) {
        return bvf0.n(new AdvertPrefetchHeadersProviderImpl$get$2(this, null), continuation);
    }
}
