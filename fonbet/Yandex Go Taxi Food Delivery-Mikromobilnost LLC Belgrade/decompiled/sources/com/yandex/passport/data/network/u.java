package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class u implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public u(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t tVar, ContinuationImpl continuationImpl) {
        BiometricTrackInitRequest$RequestFactory$createRequest$1 biometricTrackInitRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof BiometricTrackInitRequest$RequestFactory$createRequest$1) {
            biometricTrackInitRequest$RequestFactory$createRequest$1 = (BiometricTrackInitRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = biometricTrackInitRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricTrackInitRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricTrackInitRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricTrackInitRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, tVar.d).a, "1/bundle/biometrics/ebs/init_session/");
                    String str = tVar.b;
                    if (str != null) {
                        g.f("flow_id", str);
                    }
                    g.f("service_id", tVar.c);
                    g.f("biometric_session_id", tVar.e);
                    g.b("Authorization", "OAuth " + tVar.a.getRawValue());
                    biometricTrackInitRequest$RequestFactory$createRequest$1.L$0 = g;
                    biometricTrackInitRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, biometricTrackInitRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) biometricTrackInitRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        biometricTrackInitRequest$RequestFactory$createRequest$1 = new BiometricTrackInitRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = biometricTrackInitRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricTrackInitRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
