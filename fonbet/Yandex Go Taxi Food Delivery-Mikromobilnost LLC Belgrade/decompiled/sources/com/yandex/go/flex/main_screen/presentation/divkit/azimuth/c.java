package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import defpackage.iwc;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ float c;

    public c(vpr vprVar, e eVar, float f) {
        this.a = vprVar;
        this.b = eVar;
        this.c = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1 superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1) {
            superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1 = (SuperappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long j = ((iwc) obj).a;
                    this.b.getClass();
                    iwc iwcVar = new iwc(j);
                    if ((j & Long.MIN_VALUE) == 0) {
                        iwcVar = null;
                    }
                    Float valueOf = iwcVar != null ? Float.valueOf(-(Float.intBitsToFloat((int) (iwcVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - this.c)) : null;
                    superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1 = new SuperappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAzimuthRotationPresenter$observeRotationDegrees$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
