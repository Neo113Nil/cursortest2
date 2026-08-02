package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class kd implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public kd(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(jd jdVar, ContinuationImpl continuationImpl) {
        TryAddPlusDeviceRequest$RequestFactory$createRequest$1 tryAddPlusDeviceRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof TryAddPlusDeviceRequest$RequestFactory$createRequest$1) {
            tryAddPlusDeviceRequest$RequestFactory$createRequest$1 = (TryAddPlusDeviceRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = tryAddPlusDeviceRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tryAddPlusDeviceRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tryAddPlusDeviceRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tryAddPlusDeviceRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(jdVar.d(), this.a, jdVar.c()).a, "/1/bundle/device/bindings/check/");
                    g.b("Ya-Consumer-Authorization", "OAuth " + jdVar.e().getRawValue());
                    g.f(Constants.KEY_SERVICE, jdVar.f());
                    g.f("brand", jdVar.b());
                    tryAddPlusDeviceRequest$RequestFactory$createRequest$1.L$0 = g;
                    tryAddPlusDeviceRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, tryAddPlusDeviceRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) tryAddPlusDeviceRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        tryAddPlusDeviceRequest$RequestFactory$createRequest$1 = new TryAddPlusDeviceRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = tryAddPlusDeviceRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tryAddPlusDeviceRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
