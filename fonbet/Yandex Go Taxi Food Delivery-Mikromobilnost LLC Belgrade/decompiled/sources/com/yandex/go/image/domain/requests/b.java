package com.yandex.go.image.domain.requests;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import defpackage.aev;
import defpackage.gev;
import defpackage.mev;
import defpackage.ny61;
import defpackage.oav;
import defpackage.obv;
import defpackage.tbv;
import defpackage.vac;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tbv b;
    public final /* synthetic */ d c;

    public b(vpr vprVar, tbv tbvVar, d dVar) {
        this.a = vprVar;
        this.b = tbvVar;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00de, code lost:
    
        if (r9.emit(r10, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1 coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1) {
            coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1 = (CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1) continuation;
            int i2 = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ThemeType themeType = (ThemeType) obj;
                    obv obvVar = (obv) this.b;
                    d dVar = this.c;
                    Context context = dVar.a;
                    ImageModel$Tag$Theme imageModel$Tag$Theme = obvVar.c;
                    int i3 = obvVar.d;
                    if (imageModel$Tag$Theme == null || i3 <= 0) {
                        if (imageModel$Tag$Theme == null) {
                            imageModel$Tag$Theme = vez0.X(themeType);
                        }
                        Integer valueOf = Integer.valueOf(i3);
                        if (i3 <= 0) {
                            valueOf = null;
                        }
                        obvVar = obv.a(obvVar, imageModel$Tag$Theme, valueOf != null ? valueOf.intValue() : context.getResources().getDisplayMetrics().densityDpi, 1);
                    }
                    aev aevVar = dVar.f;
                    aevVar.c = obvVar;
                    vac.c(aevVar, obvVar, dVar.d);
                    gev a = aevVar.a();
                    oav oavVar = dVar.b;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$0 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$1 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$2 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$5 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$6 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$7 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$8 = null;
                    coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = ((coil3.c) oavVar).c(a, coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                Bitmap a2 = vac.a((mev) obj2);
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$0 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$1 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$2 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$3 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$4 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$5 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$6 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$7 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$8 = null;
                coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1 = new CoilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Bitmap a22 = vac.a((mev) obj22);
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$0 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$1 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$2 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$3 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$4 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$5 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$6 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$7 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.L$8 = null;
        coilBitmapRequest$safeSubmitFlow$$inlined$map$1$2$1.label = 2;
    }
}
