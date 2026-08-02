package com.yandex.go.universal_qr_scanner.domain.camera;

import android.content.Context;
import androidx.camera.core.j;
import defpackage.bvf0;
import defpackage.co7;
import defpackage.er7;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.i5f0;
import defpackage.l8x;
import defpackage.mth;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pv01;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final er7 b;
    public final r0 c = bvf0.c(null);
    public final i3y d = kotlin.a.a(new pv01(14, this));
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public l8x f;

    public a(Context context, er7 er7Var) {
        this.a = context;
        this.b = er7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x0089, B:21:0x005f, B:25:0x0069), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.camera.core.j[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j[] jVarArr, ContinuationImpl continuationImpl) {
        UniversalQrScannerCameraHolder$initCamera$1 universalQrScannerCameraHolder$initCamera$1;
        int i;
        r0 r0Var;
        j[] jVarArr2;
        kotlinx.coroutines.sync.a aVar;
        j[] jVarArr3;
        try {
            if (continuationImpl instanceof UniversalQrScannerCameraHolder$initCamera$1) {
                universalQrScannerCameraHolder$initCamera$1 = (UniversalQrScannerCameraHolder$initCamera$1) continuationImpl;
                int i2 = universalQrScannerCameraHolder$initCamera$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    universalQrScannerCameraHolder$initCamera$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = universalQrScannerCameraHolder$initCamera$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = universalQrScannerCameraHolder$initCamera$1.label;
                    zy11 zy11Var = zy11.a;
                    r0Var = this.c;
                    if (i != 0) {
                        b.b(obj);
                        universalQrScannerCameraHolder$initCamera$1.L$0 = jVarArr;
                        kotlinx.coroutines.sync.a aVar2 = this.e;
                        universalQrScannerCameraHolder$initCamera$1.L$1 = aVar2;
                        universalQrScannerCameraHolder$initCamera$1.label = 1;
                        if (aVar2.a(universalQrScannerCameraHolder$initCamera$1) != coroutineSingletons) {
                            jVarArr2 = jVarArr;
                            aVar = aVar2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050 g050Var = (g050) universalQrScannerCameraHolder$initCamera$1.L$1;
                        jVarArr3 = (j[]) universalQrScannerCameraHolder$initCamera$1.L$0;
                        b.b(obj);
                        jVarArr = g050Var;
                        i5f0 i5f0Var = (i5f0) obj;
                        i5f0Var.g();
                        co7 d = i5f0Var.d(this.b, xs7.c, (j[]) Arrays.copyOf(jVarArr3, jVarArr3.length));
                        r0Var.getClass();
                        r0Var.m(null, d);
                        return zy11Var;
                    }
                    ?? r9 = (g050) universalQrScannerCameraHolder$initCamera$1.L$1;
                    jVarArr2 = (j[]) universalQrScannerCameraHolder$initCamera$1.L$0;
                    b.b(obj);
                    aVar = r9;
                    if (r0Var.getValue() == null) {
                        return zy11Var;
                    }
                    this.f = kotlinx.coroutines.a.n(universalQrScannerCameraHolder$initCamera$1.get_context());
                    noh nohVar = (noh) this.d.getValue();
                    universalQrScannerCameraHolder$initCamera$1.L$0 = jVarArr2;
                    universalQrScannerCameraHolder$initCamera$1.L$1 = aVar;
                    universalQrScannerCameraHolder$initCamera$1.label = 2;
                    obj = nohVar.k(universalQrScannerCameraHolder$initCamera$1);
                    if (obj != coroutineSingletons) {
                        jVarArr3 = jVarArr2;
                        jVarArr = aVar;
                        i5f0 i5f0Var2 = (i5f0) obj;
                        i5f0Var2.g();
                        co7 d2 = i5f0Var2.d(this.b, xs7.c, (j[]) Arrays.copyOf(jVarArr3, jVarArr3.length));
                        r0Var.getClass();
                        r0Var.m(null, d2);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            if (r0Var.getValue() == null) {
            }
        } finally {
            jVarArr.d(null);
        }
        universalQrScannerCameraHolder$initCamera$1 = new UniversalQrScannerCameraHolder$initCamera$1(this, continuationImpl);
        Object obj2 = universalQrScannerCameraHolder$initCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerCameraHolder$initCamera$1.label;
        zy11 zy11Var2 = zy11.a;
        r0Var = this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r7.invoke(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wls wlsVar, Continuation continuation) {
        UniversalQrScannerCameraHolder$withCamera$1 universalQrScannerCameraHolder$withCamera$1;
        int i;
        if (continuation instanceof UniversalQrScannerCameraHolder$withCamera$1) {
            universalQrScannerCameraHolder$withCamera$1 = (UniversalQrScannerCameraHolder$withCamera$1) continuation;
            int i2 = universalQrScannerCameraHolder$withCamera$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerCameraHolder$withCamera$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerCameraHolder$withCamera$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerCameraHolder$withCamera$1.label;
                if (i != 0) {
                    b.b(obj);
                    universalQrScannerCameraHolder$withCamera$1.L$0 = null;
                    universalQrScannerCameraHolder$withCamera$1.L$1 = wlsVar;
                    universalQrScannerCameraHolder$withCamera$1.label = 1;
                    obj = e.y(new mth(this.c, 6), universalQrScannerCameraHolder$withCamera$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return zy11.a;
                    }
                    wlsVar = (wls) universalQrScannerCameraHolder$withCamera$1.L$1;
                    b.b(obj);
                }
                universalQrScannerCameraHolder$withCamera$1.L$0 = null;
                universalQrScannerCameraHolder$withCamera$1.L$1 = null;
                universalQrScannerCameraHolder$withCamera$1.label = 2;
            }
        }
        universalQrScannerCameraHolder$withCamera$1 = new UniversalQrScannerCameraHolder$withCamera$1(this, continuation);
        Object obj2 = universalQrScannerCameraHolder$withCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerCameraHolder$withCamera$1.label;
        if (i != 0) {
        }
        universalQrScannerCameraHolder$withCamera$1.L$0 = null;
        universalQrScannerCameraHolder$withCamera$1.L$1 = null;
        universalQrScannerCameraHolder$withCamera$1.label = 2;
    }
}
