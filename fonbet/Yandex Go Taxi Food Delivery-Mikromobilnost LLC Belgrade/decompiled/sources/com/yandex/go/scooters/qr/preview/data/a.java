package com.yandex.go.scooters.qr.preview.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.d6z;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xng0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.design.utils.a c;
    public final int d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public LayerDrawable f;
    public LayerDrawable g;

    public a(Context context, tt2 tt2Var, ru.yandex.taxi.design.utils.a aVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = aVar;
        this.d = tje.u(16, context);
    }

    public static final Drawable a(a aVar, int i, boolean z) {
        Context context = aVar.a;
        if (!z) {
            return d6z.W(qje.t(xng0.bgMain, context), tje.u(24, context));
        }
        return gtq0.v(aVar.c, context, tje.r(mrg0.go_design_l_space, context), new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom)), i, 8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(6:(2:3|(6:5|6|(1:(1:(5:10|11|12|13|14)(2:20|21))(1:22))(1:47)|23|24|(2:29|(6:34|35|36|37|(3:40|13|14)|39)(2:32|33))(2:27|28)))|35|36|37|(0)|39)|49|6|(0)(0)|23|24|(0)|29|(0)|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        if (r9.a(r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        ScootersPreviewBackgroundRepository$getBackground$1 scootersPreviewBackgroundRepository$getBackground$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Object k0;
        try {
            if (continuationImpl instanceof ScootersPreviewBackgroundRepository$getBackground$1) {
                scootersPreviewBackgroundRepository$getBackground$1 = (ScootersPreviewBackgroundRepository$getBackground$1) continuationImpl;
                int i2 = scootersPreviewBackgroundRepository$getBackground$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPreviewBackgroundRepository$getBackground$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPreviewBackgroundRepository$getBackground$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPreviewBackgroundRepository$getBackground$1.label;
                    if (i != 0) {
                        b.b(obj);
                        aVar = this.e;
                        scootersPreviewBackgroundRepository$getBackground$1.L$0 = aVar;
                        scootersPreviewBackgroundRepository$getBackground$1.Z$0 = z;
                        scootersPreviewBackgroundRepository$getBackground$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) scootersPreviewBackgroundRepository$getBackground$1.L$0;
                            try {
                                b.b(obj);
                                g050Var.d(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        z = scootersPreviewBackgroundRepository$getBackground$1.Z$0;
                        ?? r2 = (g050) scootersPreviewBackgroundRepository$getBackground$1.L$0;
                        b.b(obj);
                        aVar = r2;
                    }
                    LayerDrawable layerDrawable = this.g;
                    if (!z && layerDrawable != null) {
                        aVar.d(null);
                        return layerDrawable;
                    }
                    LayerDrawable layerDrawable2 = this.f;
                    if (z && layerDrawable2 != null) {
                        aVar.d(null);
                        return layerDrawable2;
                    }
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    ScootersPreviewBackgroundRepository$getBackground$2$1 scootersPreviewBackgroundRepository$getBackground$2$1 = new ScootersPreviewBackgroundRepository$getBackground$2$1(z, this, null);
                    scootersPreviewBackgroundRepository$getBackground$1.L$0 = aVar;
                    scootersPreviewBackgroundRepository$getBackground$1.L$1 = null;
                    scootersPreviewBackgroundRepository$getBackground$1.L$2 = null;
                    scootersPreviewBackgroundRepository$getBackground$1.Z$0 = z;
                    scootersPreviewBackgroundRepository$getBackground$1.label = 2;
                    k0 = tje.k0(sjhVar, scootersPreviewBackgroundRepository$getBackground$2$1, scootersPreviewBackgroundRepository$getBackground$1);
                    if (k0 != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = k0;
                        g050Var = aVar2;
                        g050Var.d(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            this.b.getClass();
            sjh sjhVar2 = uyj.a;
            ScootersPreviewBackgroundRepository$getBackground$2$1 scootersPreviewBackgroundRepository$getBackground$2$12 = new ScootersPreviewBackgroundRepository$getBackground$2$1(z, this, null);
            scootersPreviewBackgroundRepository$getBackground$1.L$0 = aVar;
            scootersPreviewBackgroundRepository$getBackground$1.L$1 = null;
            scootersPreviewBackgroundRepository$getBackground$1.L$2 = null;
            scootersPreviewBackgroundRepository$getBackground$1.Z$0 = z;
            scootersPreviewBackgroundRepository$getBackground$1.label = 2;
            k0 = tje.k0(sjhVar2, scootersPreviewBackgroundRepository$getBackground$2$12, scootersPreviewBackgroundRepository$getBackground$1);
            if (k0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        scootersPreviewBackgroundRepository$getBackground$1 = new ScootersPreviewBackgroundRepository$getBackground$1(this, continuationImpl);
        Object obj2 = scootersPreviewBackgroundRepository$getBackground$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewBackgroundRepository$getBackground$1.label;
        if (i != 0) {
        }
        LayerDrawable layerDrawable3 = this.g;
        if (!z) {
        }
        LayerDrawable layerDrawable22 = this.f;
        if (z) {
        }
    }
}
