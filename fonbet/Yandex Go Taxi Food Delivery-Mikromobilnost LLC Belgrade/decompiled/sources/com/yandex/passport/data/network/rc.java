package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class rc implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public rc(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(qc qcVar, ContinuationImpl continuationImpl) {
        StartBiometricSessionRequest$RequestFactory$createRequest$1 startBiometricSessionRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof StartBiometricSessionRequest$RequestFactory$createRequest$1) {
            startBiometricSessionRequest$RequestFactory$createRequest$1 = (StartBiometricSessionRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = startBiometricSessionRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startBiometricSessionRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startBiometricSessionRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startBiometricSessionRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, qcVar.d).a, "1/bundle/biometrics/ebs/start_session/");
                    g.b("Authorization", "OAuth " + qcVar.a.getRawValue());
                    g.f("track_id", qcVar.b);
                    String str = qcVar.c;
                    if (str != null) {
                        g.f("flow_id", str);
                    }
                    startBiometricSessionRequest$RequestFactory$createRequest$1.L$0 = g;
                    startBiometricSessionRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, startBiometricSessionRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) startBiometricSessionRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        startBiometricSessionRequest$RequestFactory$createRequest$1 = new StartBiometricSessionRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = startBiometricSessionRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startBiometricSessionRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
