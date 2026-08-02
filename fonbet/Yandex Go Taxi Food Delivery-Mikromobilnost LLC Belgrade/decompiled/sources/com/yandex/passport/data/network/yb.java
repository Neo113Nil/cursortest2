package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class yb implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public yb(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(xb xbVar, ContinuationImpl continuationImpl) {
        SmsCodeSendingRequest$RequestFactory$createRequest$1 smsCodeSendingRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof SmsCodeSendingRequest$RequestFactory$createRequest$1) {
            smsCodeSendingRequest$RequestFactory$createRequest$1 = (SmsCodeSendingRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = smsCodeSendingRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smsCodeSendingRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = smsCodeSendingRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smsCodeSendingRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r rVar2 = new com.yandex.passport.common.network.r((String) oo31.h(0L, this.a, xbVar.a).a);
                    rVar2.c(xbVar.h ? "/1/bundle/phone/confirm_tracked_secure/submit/" : "/1/bundle/phone/confirm/submit/");
                    rVar2.f("track_id", xbVar.b);
                    rVar2.f("number", xbVar.c);
                    rVar2.f("display_language", xbVar.d);
                    rVar2.f("country", xbVar.e);
                    rVar2.f("gps_package_name", xbVar.f);
                    rVar2.f("confirm_method", xbVar.g);
                    smsCodeSendingRequest$RequestFactory$createRequest$1.L$0 = rVar2;
                    smsCodeSendingRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(rVar2, smsCodeSendingRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) smsCodeSendingRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        smsCodeSendingRequest$RequestFactory$createRequest$1 = new SmsCodeSendingRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = smsCodeSendingRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smsCodeSendingRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
