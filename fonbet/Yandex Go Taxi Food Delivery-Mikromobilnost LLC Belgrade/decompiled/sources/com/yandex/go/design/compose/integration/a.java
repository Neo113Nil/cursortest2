package com.yandex.go.design.compose.integration;

import android.content.Context;
import coil3.c;
import com.yandex.go.design.compose.images.ComposeImageSource;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import com.yandex.go.image.internal.coil.model.TagBitmapDecodeType;
import defpackage.aev;
import defpackage.clx;
import defpackage.ebv;
import defpackage.gev;
import defpackage.i3y;
import defpackage.iac;
import defpackage.kfv;
import defpackage.m16;
import defpackage.m9o;
import defpackage.mev;
import defpackage.mgd;
import defpackage.n8v;
import defpackage.ny61;
import defpackage.oav;
import defpackage.obv;
import defpackage.q7v;
import defpackage.sac;
import defpackage.t3v0;
import defpackage.tbv;
import defpackage.u92;
import defpackage.vac;
import defpackage.vez0;
import defpackage.w06;
import defpackage.w511;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final i3y b;

    public a(Context context, i3y i3yVar) {
        this.a = context;
        this.b = i3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tbv tbvVar, kfv kfvVar, mgd mgdVar, ContinuationImpl continuationImpl) {
        CoilComposeImageLoader$loadImage$1 coilComposeImageLoader$loadImage$1;
        int i;
        tbv tbvVar2;
        mev mevVar;
        if (continuationImpl instanceof CoilComposeImageLoader$loadImage$1) {
            coilComposeImageLoader$loadImage$1 = (CoilComposeImageLoader$loadImage$1) continuationImpl;
            int i2 = coilComposeImageLoader$loadImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilComposeImageLoader$loadImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilComposeImageLoader$loadImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilComposeImageLoader$loadImage$1.label;
                if (i != 0) {
                    b.b(obj);
                    tbv f0 = vez0.f0(tbvVar);
                    Context context = this.a;
                    if (f0 != null) {
                        boolean z = mgdVar.b;
                        boolean z2 = f0 instanceof obv;
                        tbvVar2 = f0;
                        if (z2) {
                            obv obvVar = (obv) f0;
                            int i3 = obvVar.d;
                            ImageModel$Tag$Theme imageModel$Tag$Theme = obvVar.c;
                            tbvVar2 = obvVar;
                            if (imageModel$Tag$Theme == null || i3 <= 0) {
                                if (imageModel$Tag$Theme == null) {
                                    imageModel$Tag$Theme = z ? ImageModel$Tag$Theme.Dark : ImageModel$Tag$Theme.Light;
                                }
                                Integer valueOf = Integer.valueOf(i3);
                                if (i3 <= 0) {
                                    valueOf = null;
                                }
                                tbvVar2 = obv.a(obvVar, imageModel$Tag$Theme, valueOf != null ? valueOf.intValue() : context.getResources().getDisplayMetrics().densityDpi, 1);
                            }
                        }
                    } else {
                        tbvVar2 = null;
                    }
                    aev aevVar = new aev(context);
                    aevVar.c = tbvVar2;
                    m16 m16Var = vac.a;
                    if (tbvVar2 instanceof obv) {
                        aevVar.b().b(clx.a, TagBitmapDecodeType.Compose);
                        aevVar.b().b(clx.c, Integer.valueOf(((obv) tbvVar2).d));
                    }
                    gev a = aevVar.a();
                    oav oavVar = (oav) this.b.getValue();
                    coilComposeImageLoader$loadImage$1.L$0 = null;
                    coilComposeImageLoader$loadImage$1.L$1 = kfvVar;
                    coilComposeImageLoader$loadImage$1.L$2 = mgdVar;
                    coilComposeImageLoader$loadImage$1.L$3 = null;
                    coilComposeImageLoader$loadImage$1.L$4 = null;
                    coilComposeImageLoader$loadImage$1.label = 1;
                    obj = ((c) oavVar).c(a, coilComposeImageLoader$loadImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mgdVar = (mgd) coilComposeImageLoader$loadImage$1.L$2;
                    kfvVar = (kfv) coilComposeImageLoader$loadImage$1.L$1;
                    b.b(obj);
                }
                kfv kfvVar2 = kfvVar;
                mgd mgdVar2 = mgdVar;
                mevVar = (mev) obj;
                if (mevVar instanceof t3v0) {
                    if (mevVar instanceof m9o) {
                        throw ((m9o) mevVar).c;
                    }
                    w511.b();
                    return null;
                }
                t3v0 t3v0Var = (t3v0) mevVar;
                q7v q7vVar = t3v0Var.a;
                int i4 = iac.a[t3v0Var.c.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    ComposeImageSource composeImageSource = ComposeImageSource.Cache;
                } else {
                    if (i4 != 4) {
                        w511.b();
                        return null;
                    }
                    ComposeImageSource composeImageSource2 = ComposeImageSource.Cache;
                }
                if (q7vVar instanceof sac) {
                    sac sacVar = (sac) q7vVar;
                    u92 u92Var = new u92(sacVar.a.a);
                    ebv ebvVar = sacVar.b;
                    return new n8v(mgdVar2, u92Var, ebvVar.a, ebvVar.b, kfvVar2);
                }
                if (q7vVar instanceof w06) {
                    return new n8v(mgdVar2, new u92(((w06) q7vVar).a), false, false, kfvVar2);
                }
                ny61.r("Loaded image is not Bitmap!");
                return null;
            }
        }
        coilComposeImageLoader$loadImage$1 = new CoilComposeImageLoader$loadImage$1(this, continuationImpl);
        Object obj2 = coilComposeImageLoader$loadImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilComposeImageLoader$loadImage$1.label;
        if (i != 0) {
        }
        kfv kfvVar22 = kfvVar;
        mgd mgdVar22 = mgdVar;
        mevVar = (mev) obj2;
        if (mevVar instanceof t3v0) {
        }
    }
}
