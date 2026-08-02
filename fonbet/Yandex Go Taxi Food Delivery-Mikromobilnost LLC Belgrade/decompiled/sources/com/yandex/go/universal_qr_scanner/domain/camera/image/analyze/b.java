package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1 universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1) {
            universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1 = (UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(!((List) obj).isEmpty());
                    universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1 = new UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
