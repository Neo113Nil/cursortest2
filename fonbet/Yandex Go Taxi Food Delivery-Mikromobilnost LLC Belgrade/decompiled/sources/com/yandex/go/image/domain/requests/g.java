package com.yandex.go.image.domain.requests;

import android.content.Context;
import coil3.request.CachePolicy;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;
import defpackage.aev;
import defpackage.clx;
import defpackage.cpe0;
import defpackage.gev;
import defpackage.m16;
import defpackage.m9o;
import defpackage.mev;
import defpackage.ny61;
import defpackage.oav;
import defpackage.ppr;
import defpackage.pwy0;
import defpackage.tbv;
import defpackage.vac;
import defpackage.vez0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g implements cpe0 {
    public final Context a;
    public final oav b;
    public final pwy0 c;
    public final ppr d;
    public tbv e;
    public aev f;
    public boolean g;

    public g(Context context, oav oavVar, pwy0 pwy0Var, ppr pprVar) {
        this.a = context;
        this.b = oavVar;
        this.c = pwy0Var;
        this.d = pprVar;
        aev aevVar = new aev(context);
        ImageLoadPriority imageLoadPriority = ImageLoadPriority.LOW;
        m16 m16Var = vac.a;
        aevVar.b().b(clx.d, imageLoadPriority);
        this.f = aevVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CoilPreloadRequest$suspend$1 coilPreloadRequest$suspend$1;
        int i;
        mev mevVar;
        if (continuationImpl instanceof CoilPreloadRequest$suspend$1) {
            coilPreloadRequest$suspend$1 = (CoilPreloadRequest$suspend$1) continuationImpl;
            int i2 = coilPreloadRequest$suspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilPreloadRequest$suspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilPreloadRequest$suspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilPreloadRequest$suspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aev aevVar = this.f;
                    if (this.g) {
                        vac.c(aevVar, this.e, this.d);
                    } else {
                        aevVar.h = vac.a;
                        aevVar.i = CachePolicy.DISABLED;
                    }
                    gev a = aevVar.a();
                    coilPreloadRequest$suspend$1.L$0 = null;
                    coilPreloadRequest$suspend$1.label = 1;
                    obj = ((coil3.c) this.b).c(a, coilPreloadRequest$suspend$1);
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
                mevVar = (mev) obj;
                if (mevVar instanceof m9o) {
                    return zy11.a;
                }
                throw ((m9o) mevVar).c;
            }
        }
        coilPreloadRequest$suspend$1 = new CoilPreloadRequest$suspend$1(this, continuationImpl);
        Object obj2 = coilPreloadRequest$suspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilPreloadRequest$suspend$1.label;
        if (i != 0) {
        }
        mevVar = (mev) obj2;
        if (mevVar instanceof m9o) {
        }
    }

    public final g b(tbv tbvVar) {
        tbv f0 = vez0.f0(tbvVar);
        tbv S = f0 != null ? vez0.S(f0, this.a, this.c) : null;
        this.e = S;
        aev aevVar = this.f;
        aevVar.c = S;
        this.f = aevVar;
        return this;
    }

    public final g c(String str) {
        tbv e;
        tbv S = (str == null || (e = vez0.e(str)) == null) ? null : vez0.S(e, this.a, this.c);
        this.e = S;
        aev aevVar = this.f;
        aevVar.c = S;
        this.f = aevVar;
        return this;
    }
}
