package com.yandex.go.universal_qr_scanner.experiments.config;

import defpackage.d6z;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.u021;
import defpackage.uz11;
import defpackage.y021;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final t1b0 a;

    public e(rqo rqoVar) {
        UniversalQrScannerConfigExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(UniversalQrScannerConfigExperiment.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UniversalQrScannerConfigInteractor$getCameraUnavailableConfig$1 universalQrScannerConfigInteractor$getCameraUnavailableConfig$1;
        int i;
        if (continuationImpl instanceof UniversalQrScannerConfigInteractor$getCameraUnavailableConfig$1) {
            universalQrScannerConfigInteractor$getCameraUnavailableConfig$1 = (UniversalQrScannerConfigInteractor$getCameraUnavailableConfig$1) continuationImpl;
            int i2 = universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.label = 1;
                    obj = this.a.b(universalQrScannerConfigInteractor$getCameraUnavailableConfig$1);
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
                UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment = (UniversalQrScannerConfigExperiment) obj;
                CameraUnavailableConfig cameraUnavailableConfig = universalQrScannerConfigExperiment.f;
                return new uz11(d6z.Y(universalQrScannerConfigExperiment, cameraUnavailableConfig.a), d6z.Y(universalQrScannerConfigExperiment, cameraUnavailableConfig.b), d6z.Y(universalQrScannerConfigExperiment, cameraUnavailableConfig.c));
            }
        }
        universalQrScannerConfigInteractor$getCameraUnavailableConfig$1 = new UniversalQrScannerConfigInteractor$getCameraUnavailableConfig$1(this, continuationImpl);
        Object obj2 = universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerConfigInteractor$getCameraUnavailableConfig$1.label;
        if (i != 0) {
        }
        UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment2 = (UniversalQrScannerConfigExperiment) obj2;
        CameraUnavailableConfig cameraUnavailableConfig2 = universalQrScannerConfigExperiment2.f;
        return new uz11(d6z.Y(universalQrScannerConfigExperiment2, cameraUnavailableConfig2.a), d6z.Y(universalQrScannerConfigExperiment2, cameraUnavailableConfig2.b), d6z.Y(universalQrScannerConfigExperiment2, cameraUnavailableConfig2.c));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        UniversalQrScannerConfigInteractor$getQrNotSupportedConfig$1 universalQrScannerConfigInteractor$getQrNotSupportedConfig$1;
        int i;
        if (continuationImpl instanceof UniversalQrScannerConfigInteractor$getQrNotSupportedConfig$1) {
            universalQrScannerConfigInteractor$getQrNotSupportedConfig$1 = (UniversalQrScannerConfigInteractor$getQrNotSupportedConfig$1) continuationImpl;
            int i2 = universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.label = 1;
                    obj = this.a.b(universalQrScannerConfigInteractor$getQrNotSupportedConfig$1);
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
                UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment = (UniversalQrScannerConfigExperiment) obj;
                QrNotSupportedConfig qrNotSupportedConfig = universalQrScannerConfigExperiment.e;
                return new u021(d6z.Y(universalQrScannerConfigExperiment, qrNotSupportedConfig.a), d6z.Y(universalQrScannerConfigExperiment, qrNotSupportedConfig.b));
            }
        }
        universalQrScannerConfigInteractor$getQrNotSupportedConfig$1 = new UniversalQrScannerConfigInteractor$getQrNotSupportedConfig$1(this, continuationImpl);
        Object obj2 = universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerConfigInteractor$getQrNotSupportedConfig$1.label;
        if (i != 0) {
        }
        UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment2 = (UniversalQrScannerConfigExperiment) obj2;
        QrNotSupportedConfig qrNotSupportedConfig2 = universalQrScannerConfigExperiment2.e;
        return new u021(d6z.Y(universalQrScannerConfigExperiment2, qrNotSupportedConfig2.a), d6z.Y(universalQrScannerConfigExperiment2, qrNotSupportedConfig2.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        UniversalQrScannerConfigInteractor$getReadyToScanConfig$1 universalQrScannerConfigInteractor$getReadyToScanConfig$1;
        int i;
        if (continuationImpl instanceof UniversalQrScannerConfigInteractor$getReadyToScanConfig$1) {
            universalQrScannerConfigInteractor$getReadyToScanConfig$1 = (UniversalQrScannerConfigInteractor$getReadyToScanConfig$1) continuationImpl;
            int i2 = universalQrScannerConfigInteractor$getReadyToScanConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerConfigInteractor$getReadyToScanConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerConfigInteractor$getReadyToScanConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerConfigInteractor$getReadyToScanConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    universalQrScannerConfigInteractor$getReadyToScanConfig$1.label = 1;
                    obj = this.a.b(universalQrScannerConfigInteractor$getReadyToScanConfig$1);
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
                UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment = (UniversalQrScannerConfigExperiment) obj;
                return new y021(d6z.Y(universalQrScannerConfigExperiment, universalQrScannerConfigExperiment.d.a));
            }
        }
        universalQrScannerConfigInteractor$getReadyToScanConfig$1 = new UniversalQrScannerConfigInteractor$getReadyToScanConfig$1(this, continuationImpl);
        Object obj2 = universalQrScannerConfigInteractor$getReadyToScanConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerConfigInteractor$getReadyToScanConfig$1.label;
        if (i != 0) {
        }
        UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment2 = (UniversalQrScannerConfigExperiment) obj2;
        return new y021(d6z.Y(universalQrScannerConfigExperiment2, universalQrScannerConfigExperiment2.d.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (defpackage.evu0.J(defpackage.d6z.Y(r5, r4.c)) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        UniversalQrScannerConfigInteractor$isEnabled$1 universalQrScannerConfigInteractor$isEnabled$1;
        int i;
        UniversalQrScannerConfigExperiment universalQrScannerConfigExperiment;
        QrNotSupportedConfig qrNotSupportedConfig;
        CameraUnavailableConfig cameraUnavailableConfig;
        if (continuationImpl instanceof UniversalQrScannerConfigInteractor$isEnabled$1) {
            universalQrScannerConfigInteractor$isEnabled$1 = (UniversalQrScannerConfigInteractor$isEnabled$1) continuationImpl;
            int i2 = universalQrScannerConfigInteractor$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerConfigInteractor$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalQrScannerConfigInteractor$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerConfigInteractor$isEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    universalQrScannerConfigInteractor$isEnabled$1.label = 1;
                    obj = this.a.b(universalQrScannerConfigInteractor$isEnabled$1);
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
                universalQrScannerConfigExperiment = (UniversalQrScannerConfigExperiment) obj;
                if (universalQrScannerConfigExperiment.c && !evu0.J(d6z.Y(universalQrScannerConfigExperiment, universalQrScannerConfigExperiment.d.a))) {
                    qrNotSupportedConfig = universalQrScannerConfigExperiment.e;
                    if (!evu0.J(d6z.Y(universalQrScannerConfigExperiment, qrNotSupportedConfig.a)) && !evu0.J(d6z.Y(universalQrScannerConfigExperiment, qrNotSupportedConfig.b))) {
                        cameraUnavailableConfig = universalQrScannerConfigExperiment.f;
                        if (!evu0.J(d6z.Y(universalQrScannerConfigExperiment, cameraUnavailableConfig.a))) {
                            if (!evu0.J(d6z.Y(universalQrScannerConfigExperiment, cameraUnavailableConfig.b))) {
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        universalQrScannerConfigInteractor$isEnabled$1 = new UniversalQrScannerConfigInteractor$isEnabled$1(this, continuationImpl);
        Object obj2 = universalQrScannerConfigInteractor$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerConfigInteractor$isEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        universalQrScannerConfigExperiment = (UniversalQrScannerConfigExperiment) obj2;
        if (universalQrScannerConfigExperiment.c) {
            qrNotSupportedConfig = universalQrScannerConfigExperiment.e;
            if (!evu0.J(d6z.Y(universalQrScannerConfigExperiment, qrNotSupportedConfig.a))) {
                cameraUnavailableConfig = universalQrScannerConfigExperiment.f;
                if (!evu0.J(d6z.Y(universalQrScannerConfigExperiment, cameraUnavailableConfig.a))) {
                }
            }
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
