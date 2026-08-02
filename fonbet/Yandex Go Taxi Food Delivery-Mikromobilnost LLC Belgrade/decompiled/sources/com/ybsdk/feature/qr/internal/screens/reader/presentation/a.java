package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import defpackage.hcg0;
import defpackage.icg0;
import defpackage.jcg0;
import defpackage.jl40;
import defpackage.kcg0;
import defpackage.lcg0;
import defpackage.mcg0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qdg0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;

    public a(vpr vprVar, b bVar) {
        this.a = vprVar;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        if (r0.emit(r1, r2) != r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1 qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1;
        int i;
        r0 r0Var;
        Object value;
        vpr vprVar;
        if (continuation instanceof QrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1) {
            qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1 = (QrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1) continuation;
            int i2 = qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) obj;
                    vpr vprVar2 = this.a;
                    qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.L$0 = vprVar2;
                    qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label = 1;
                    b bVar = this.b;
                    lcg0 lcg0Var = ((mcg0) bVar.X()).f;
                    if (lcg0Var instanceof kcg0) {
                        Object d0 = bVar.d0(str, ((kcg0) lcg0Var).a, qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1);
                        if (d0 != coroutineSingletons) {
                            d0 = (qdg0) d0;
                        }
                        obj2 = d0;
                    } else {
                        if (lcg0Var instanceof hcg0) {
                            bVar.e0();
                        } else if (!(lcg0Var instanceof jcg0)) {
                            if (!jl40.l(lcg0Var, icg0.a)) {
                                w511.b();
                                return null;
                            }
                            bVar.C.Y.a.a("qr.resolving_rules.loading", null);
                            pz40 Y = bVar.Y();
                            do {
                                r0Var = (r0) Y;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, mcg0.a((mcg0) value, false, false, 0, false, new jcg0(str), 31)));
                            bVar.t0();
                        }
                        obj2 = null;
                    }
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.L$0 = null;
                qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1 = new QrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.L$0 = null;
        qrReaderViewModel$startCameraQrFlow$$inlined$map$1$2$1.label = 2;
    }
}
