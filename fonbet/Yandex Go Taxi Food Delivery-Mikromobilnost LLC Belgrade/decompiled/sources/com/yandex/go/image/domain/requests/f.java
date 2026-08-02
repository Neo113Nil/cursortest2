package com.yandex.go.image.domain.requests;

import android.content.Context;
import coil3.request.CachePolicy;
import defpackage.aev;
import defpackage.bgc;
import defpackage.gev;
import defpackage.kv8;
import defpackage.mev;
import defpackage.ny61;
import defpackage.oav;
import defpackage.obv;
import defpackage.ppr;
import defpackage.pwy0;
import defpackage.tbv;
import defpackage.tfv;
import defpackage.tls;
import defpackage.vac;
import defpackage.vez0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f {
    public final Context a;
    public final oav b;
    public final pwy0 c;
    public final ppr d;
    public tbv e;
    public aev f;

    public f(Context context, oav oavVar, pwy0 pwy0Var, ppr pprVar) {
        this.a = context;
        this.b = oavVar;
        this.c = pwy0Var;
        this.d = pprVar;
        aev aevVar = new aev(context);
        aevVar.k = CachePolicy.DISABLED;
        this.f = aevVar;
    }

    public static void a(f fVar, tls tlsVar) {
        bgc bgcVar = new bgc(12);
        aev aevVar = fVar.f;
        vac.c(aevVar, fVar.e, fVar.d);
        aevVar.e = new kv8(bgcVar, tlsVar, bgcVar);
        ((coil3.c) fVar.b).a(aevVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        CoilLoadFromCacheRequest$safeSuspend$1 coilLoadFromCacheRequest$safeSuspend$1;
        int i;
        if (continuationImpl instanceof CoilLoadFromCacheRequest$safeSuspend$1) {
            coilLoadFromCacheRequest$safeSuspend$1 = (CoilLoadFromCacheRequest$safeSuspend$1) continuationImpl;
            int i2 = coilLoadFromCacheRequest$safeSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilLoadFromCacheRequest$safeSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilLoadFromCacheRequest$safeSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilLoadFromCacheRequest$safeSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aev aevVar = this.f;
                    vac.c(aevVar, this.e, this.d);
                    gev a = aevVar.a();
                    coilLoadFromCacheRequest$safeSuspend$1.L$0 = null;
                    coilLoadFromCacheRequest$safeSuspend$1.label = 1;
                    obj = ((coil3.c) this.b).c(a, coilLoadFromCacheRequest$safeSuspend$1);
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
                return vac.a((mev) obj);
            }
        }
        coilLoadFromCacheRequest$safeSuspend$1 = new CoilLoadFromCacheRequest$safeSuspend$1(this, continuationImpl);
        Object obj2 = coilLoadFromCacheRequest$safeSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilLoadFromCacheRequest$safeSuspend$1.label;
        if (i != 0) {
        }
        return vac.a((mev) obj2);
    }

    public final f c(obv obvVar) {
        tbv f0 = vez0.f0(obvVar);
        tbv S = f0 != null ? vez0.S(f0, this.a, this.c) : null;
        this.e = S;
        aev aevVar = this.f;
        aevVar.c = S;
        this.f = aevVar;
        return this;
    }

    public final f d(String str) {
        tbv e;
        tbv S = (str == null || (e = vez0.e(str)) == null) ? null : vez0.S(e, this.a, this.c);
        this.e = S;
        aev aevVar = this.f;
        aevVar.c = S;
        this.f = aevVar;
        return this;
    }

    public final f e(int i, int i2) {
        aev aevVar = this.f;
        vac.d(aevVar, i, i2);
        this.f = aevVar;
        return this;
    }

    public final f f(tfv tfvVar) {
        this.f = vac.e(this.f, this.a, tfvVar);
        return this;
    }
}
