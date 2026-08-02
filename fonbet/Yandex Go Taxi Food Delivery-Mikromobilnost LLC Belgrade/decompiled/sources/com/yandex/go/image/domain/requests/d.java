package com.yandex.go.image.domain.requests;

import android.content.Context;
import android.graphics.Bitmap;
import coil3.request.CachePolicy;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;
import defpackage.aev;
import defpackage.clx;
import defpackage.f16;
import defpackage.g16;
import defpackage.gac;
import defpackage.gev;
import defpackage.hac;
import defpackage.lb7;
import defpackage.lev;
import defpackage.m16;
import defpackage.m9o;
import defpackage.mev;
import defpackage.ny61;
import defpackage.oav;
import defpackage.obv;
import defpackage.ppr;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tbv;
import defpackage.tfv;
import defpackage.tpr;
import defpackage.uh;
import defpackage.vac;
import defpackage.vez0;
import defpackage.w511;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.widget.image.BitmapRequest$ForceCacheType;

/* loaded from: classes.dex */
public final class d implements g16 {
    public final Context a;
    public final oav b;
    public final pwy0 c;
    public sls d;
    public tbv e;
    public aev f;

    public d(Context context, oav oavVar, pwy0 pwy0Var, ppr pprVar) {
        this.a = context;
        this.b = oavVar;
        this.c = pwy0Var;
        this.d = pprVar;
        this.f = new aev(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.g16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        CoilBitmapRequest$suspend$1 coilBitmapRequest$suspend$1;
        int i;
        Bitmap a;
        if (continuation instanceof CoilBitmapRequest$suspend$1) {
            coilBitmapRequest$suspend$1 = (CoilBitmapRequest$suspend$1) continuation;
            int i2 = coilBitmapRequest$suspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilBitmapRequest$suspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilBitmapRequest$suspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilBitmapRequest$suspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tbv tbvVar = this.e;
                    tbv S = tbvVar != null ? vez0.S(tbvVar, this.a, this.c) : null;
                    aev aevVar = this.f;
                    aevVar.c = S;
                    vac.c(aevVar, S, this.d);
                    gev a2 = aevVar.a();
                    coilBitmapRequest$suspend$1.L$0 = null;
                    coilBitmapRequest$suspend$1.L$1 = null;
                    coilBitmapRequest$suspend$1.label = 1;
                    obj = ((coil3.c) this.b).c(a2, coilBitmapRequest$suspend$1);
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
                mev mevVar = (mev) obj;
                a = vac.a(mevVar);
                if (a == null) {
                    return a;
                }
                if (mevVar instanceof m9o) {
                    throw ((m9o) mevVar).c;
                }
                ny61.r("Loaded image is not Bitmap!");
                return null;
            }
        }
        coilBitmapRequest$suspend$1 = new CoilBitmapRequest$suspend$1(this, continuation);
        Object obj2 = coilBitmapRequest$suspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilBitmapRequest$suspend$1.label;
        if (i != 0) {
        }
        mev mevVar2 = (mev) obj2;
        a = vac.a(mevVar2);
        if (a == null) {
        }
    }

    @Override // defpackage.g16
    public final g16 b(String str) {
        this.e = str != null ? vez0.e(str) : null;
        return this;
    }

    @Override // defpackage.g16
    public final g16 c() {
        aev aevVar = this.f;
        m16 m16Var = vac.a;
        uh uhVar = lev.a;
        aevVar.b().b(lev.e, Boolean.FALSE);
        aevVar.b().b(lev.a, Bitmap.Config.ARGB_8888);
        this.f = aevVar;
        return this;
    }

    @Override // defpackage.g16
    public final g16 d(ImageLoadPriority imageLoadPriority) {
        aev aevVar = this.f;
        m16 m16Var = vac.a;
        aevVar.b().b(clx.d, imageLoadPriority);
        this.f = aevVar;
        return this;
    }

    @Override // defpackage.g16
    public final g16 e(tfv tfvVar) {
        this.f = vac.e(this.f, this.a, tfvVar);
        return this;
    }

    @Override // defpackage.g16
    public final tpr f() {
        tbv tbvVar = this.e;
        return ((tbvVar instanceof obv) && ((obv) tbvVar).c == null) ? new c(this.c.a(), tbvVar, this) : new rol0(new CoilBitmapRequest$safeSubmitFlow$2(this, null));
    }

    @Override // defpackage.g16
    public final g16 g(int i, int i2) {
        aev aevVar = this.f;
        vac.d(aevVar, i, i2);
        this.f = aevVar;
        return this;
    }

    @Override // defpackage.g16
    public final a h(f16 f16Var) {
        tbv tbvVar = this.e;
        tbv S = tbvVar != null ? vez0.S(tbvVar, this.a, this.c) : null;
        aev aevVar = this.f;
        aevVar.c = S;
        vac.c(aevVar, S, this.d);
        aevVar.e = new lb7(17, f16Var, f16Var);
        return new a(((coil3.c) this.b).a(aevVar.a()));
    }

    @Override // defpackage.g16
    public final g16 i(tbv tbvVar) {
        this.e = vez0.f0(tbvVar);
        return this;
    }

    @Override // defpackage.g16
    public final g16 j(BitmapRequest$ForceCacheType bitmapRequest$ForceCacheType) {
        aev aevVar = this.f;
        int i = hac.a[bitmapRequest$ForceCacheType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                CachePolicy cachePolicy = CachePolicy.ENABLED;
                aevVar.j = cachePolicy;
                aevVar.i = cachePolicy;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                aevVar.j = CachePolicy.DISABLED;
                aevVar.i = CachePolicy.ENABLED;
            }
        }
        this.f = aevVar;
        return this;
    }

    @Override // defpackage.g16
    public final g16 k(int i) {
        this.d = new gac(i, 0);
        return this;
    }
}
