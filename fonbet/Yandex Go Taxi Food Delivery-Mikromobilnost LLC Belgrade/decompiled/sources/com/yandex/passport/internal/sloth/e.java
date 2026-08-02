package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.entities.Cookie;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e {
    public final com.yandex.passport.internal.usecase.authorize.b a;

    public e(com.yandex.passport.internal.usecase.authorize.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.sloth.data.a aVar, String str, Long l, ContinuationImpl continuationImpl) {
        SlothAuthDelegateImpl$authorizeByCookie$1 slothAuthDelegateImpl$authorizeByCookie$1;
        int i;
        AnalyticsFromValue analyticsFromValue;
        if (continuationImpl instanceof SlothAuthDelegateImpl$authorizeByCookie$1) {
            slothAuthDelegateImpl$authorizeByCookie$1 = (SlothAuthDelegateImpl$authorizeByCookie$1) continuationImpl;
            int i2 = slothAuthDelegateImpl$authorizeByCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothAuthDelegateImpl$authorizeByCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothAuthDelegateImpl$authorizeByCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothAuthDelegateImpl$authorizeByCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Cookie cookie = new Cookie(com.yandex.passport.internal.util.p.y(aVar.a), null, null, aVar.b, aVar.c, 6, null);
                    AnalyticsFromValue.Companion.getClass();
                    analyticsFromValue = AnalyticsFromValue.SLOTH;
                    com.yandex.passport.internal.usecase.authorize.a aVar2 = new com.yandex.passport.internal.usecase.authorize.a(cookie, analyticsFromValue, str, l != null ? l.longValue() : 0L);
                    slothAuthDelegateImpl$authorizeByCookie$1.label = 1;
                    obj = this.a.a(aVar2, slothAuthDelegateImpl$authorizeByCookie$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothAuthDelegateImpl$authorizeByCookie$1 = new SlothAuthDelegateImpl$authorizeByCookie$1(this, continuationImpl);
        Object obj2 = slothAuthDelegateImpl$authorizeByCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothAuthDelegateImpl$authorizeByCookie$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
