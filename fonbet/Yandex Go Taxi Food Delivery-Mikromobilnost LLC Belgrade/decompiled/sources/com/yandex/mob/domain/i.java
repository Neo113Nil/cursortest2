package com.yandex.mob.domain;

import defpackage.co20;
import defpackage.fo20;
import defpackage.gp20;
import defpackage.jn20;
import defpackage.ln20;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tl20;
import defpackage.xl20;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i {
    public final com.yandex.mob.okhttp.c a;
    public final com.yandex.mob.a b;
    public final m c;
    public final gp20 d;

    public i(com.yandex.mob.okhttp.c cVar, com.yandex.mob.a aVar, m mVar, com.yandex.mob.network.a aVar2) {
        this.a = cVar;
        this.b = aVar;
        this.c = mVar;
        this.d = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r0 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(double d, double d2, ContinuationImpl continuationImpl) {
        GeocodeCountryUseCase$invoke$1 geocodeCountryUseCase$invoke$1;
        int i;
        xl20 xl20Var;
        if (continuationImpl instanceof GeocodeCountryUseCase$invoke$1) {
            geocodeCountryUseCase$invoke$1 = (GeocodeCountryUseCase$invoke$1) continuationImpl;
            int i2 = geocodeCountryUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geocodeCountryUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                GeocodeCountryUseCase$invoke$1 geocodeCountryUseCase$invoke$12 = geocodeCountryUseCase$invoke$1;
                Object obj = geocodeCountryUseCase$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geocodeCountryUseCase$invoke$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GeocodeCountryUseCase$invoke$result$1 geocodeCountryUseCase$invoke$result$1 = new GeocodeCountryUseCase$invoke$result$1(this, new co20(scc.g(new Double(d2), new Double(d))), null);
                    geocodeCountryUseCase$invoke$12.L$0 = null;
                    geocodeCountryUseCase$invoke$12.D$0 = d;
                    geocodeCountryUseCase$invoke$12.D$1 = d2;
                    geocodeCountryUseCase$invoke$12.label = 1;
                    obj = this.d.a(geocodeCountryUseCase$invoke$result$1, geocodeCountryUseCase$invoke$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    d2 = geocodeCountryUseCase$invoke$12.D$1;
                    d = geocodeCountryUseCase$invoke$12.D$0;
                    kotlin.b.b(obj);
                }
                xl20Var = (xl20) obj;
                if (!(xl20Var instanceof tl20)) {
                    return new ln20(new jn20(((fo20) ((tl20) xl20Var).a).a, new Double(d), new Double(d2)));
                }
                geocodeCountryUseCase$invoke$12.L$0 = null;
                geocodeCountryUseCase$invoke$12.L$1 = null;
                geocodeCountryUseCase$invoke$12.D$0 = d;
                geocodeCountryUseCase$invoke$12.D$1 = d2;
                geocodeCountryUseCase$invoke$12.label = 2;
                Object b = this.b.b(d, d2, geocodeCountryUseCase$invoke$12);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        geocodeCountryUseCase$invoke$1 = new GeocodeCountryUseCase$invoke$1(this, continuationImpl);
        GeocodeCountryUseCase$invoke$1 geocodeCountryUseCase$invoke$122 = geocodeCountryUseCase$invoke$1;
        Object obj2 = geocodeCountryUseCase$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geocodeCountryUseCase$invoke$122.label;
        if (i != 0) {
        }
        xl20Var = (xl20) obj2;
        if (!(xl20Var instanceof tl20)) {
        }
    }
}
