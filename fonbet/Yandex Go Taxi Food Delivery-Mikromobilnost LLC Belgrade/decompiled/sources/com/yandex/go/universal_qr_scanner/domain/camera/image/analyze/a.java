package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze;

import defpackage.gwk0;
import defpackage.jdv;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(jdv jdvVar, Continuation continuation) {
        UniversalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1 universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1;
        int i;
        try {
            if (continuation instanceof UniversalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1) {
                universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1 = (UniversalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1) continuation;
                int i2 = universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.b bVar = this.a.b;
                        universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.L$0 = null;
                        universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.L$1 = jdvVar;
                        universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.L$2 = null;
                        universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.label = 1;
                        Object a = bVar.a(jdvVar, universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1);
                        jdvVar = jdvVar;
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (AutoCloseable) universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.L$1;
                        kotlin.b.b(obj);
                        jdvVar = r6;
                    }
                    gwk0.m(jdvVar, null);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            gwk0.m(jdvVar, null);
            return zy11.a;
        } finally {
        }
        universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1 = new UniversalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1(this, continuation);
        Object obj2 = universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerImageInteractor$startAnalyze$2$1$3$emit$1.label;
    }
}
