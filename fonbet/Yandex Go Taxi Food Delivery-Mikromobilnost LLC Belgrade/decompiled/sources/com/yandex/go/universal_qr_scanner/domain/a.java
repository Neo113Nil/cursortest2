package com.yandex.go.universal_qr_scanner.domain;

import com.yandex.go.universal_qr_scanner.experiments.config.e;
import defpackage.d701;
import defpackage.ffg0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends ffg0 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;
    public final e d;

    public a(com.yandex.go.lifecycle.a aVar, d701 d701Var, e eVar) {
        this.b = aVar;
        this.c = d701Var;
        this.d = eVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r7.b.a(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        UniversalQrScannerDeeplinkHandler$handleDeeplink$1 universalQrScannerDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof UniversalQrScannerDeeplinkHandler$handleDeeplink$1) {
            universalQrScannerDeeplinkHandler$handleDeeplink$1 = (UniversalQrScannerDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = universalQrScannerDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalQrScannerDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = universalQrScannerDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalQrScannerDeeplinkHandler$handleDeeplink$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    universalQrScannerDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    universalQrScannerDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    universalQrScannerDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    universalQrScannerDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    universalQrScannerDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.d.d(universalQrScannerDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oep0Var = (oep0) universalQrScannerDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        oep0.b(oep0Var, (m950) this.c.get());
                        return zy11Var;
                    }
                    oep0Var = (oep0) universalQrScannerDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11Var;
                }
                universalQrScannerDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                universalQrScannerDeeplinkHandler$handleDeeplink$1.L$1 = null;
                universalQrScannerDeeplinkHandler$handleDeeplink$1.L$2 = null;
                universalQrScannerDeeplinkHandler$handleDeeplink$1.L$3 = null;
                universalQrScannerDeeplinkHandler$handleDeeplink$1.label = 2;
            }
        }
        universalQrScannerDeeplinkHandler$handleDeeplink$1 = new UniversalQrScannerDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = universalQrScannerDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalQrScannerDeeplinkHandler$handleDeeplink$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
