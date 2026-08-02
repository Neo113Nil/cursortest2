package com.yandex.go.external_service.deeplink;

import android.content.Intent;
import android.net.Uri;
import defpackage.edn;
import defpackage.h1p;
import defpackage.loj;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.v770;
import defpackage.wsv0;
import defpackage.xsv0;
import defpackage.y3p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes12.dex */
public final class a {
    public final xsv0 a;
    public final y3p b;
    public final com.yandex.go.superapp.impl.presenter_delegate.a c;
    public final b d;
    public final h1p e;
    public final com.yandex.go.superapp.impl.delegate.a f;
    public final edn g;

    public a(xsv0 xsv0Var, y3p y3pVar, com.yandex.go.superapp.impl.presenter_delegate.a aVar, b bVar, h1p h1pVar, com.yandex.go.superapp.impl.delegate.a aVar2, edn ednVar) {
        this.a = xsv0Var;
        this.b = y3pVar;
        this.c = aVar;
        this.d = bVar;
        this.e = h1pVar;
        this.f = aVar2;
        this.g = ednVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Intent intent, ContinuationImpl continuationImpl) {
        ExternalServiceDeeplinkInterceptor$proccessIntent$1 externalServiceDeeplinkInterceptor$proccessIntent$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ExternalServiceDeeplinkInterceptor$proccessIntent$1) {
            externalServiceDeeplinkInterceptor$proccessIntent$1 = (ExternalServiceDeeplinkInterceptor$proccessIntent$1) continuationImpl;
            int i2 = externalServiceDeeplinkInterceptor$proccessIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceDeeplinkInterceptor$proccessIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServiceDeeplinkInterceptor$proccessIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceDeeplinkInterceptor$proccessIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uri data = intent.getData();
                    if (data == null || !aVar.g.a(data, aVar.e)) {
                        return n5u.a;
                    }
                    aVar.a.getClass();
                    wsv0 a = xsv0.a(data);
                    com.yandex.go.superapp.impl.delegate.a aVar2 = aVar.f;
                    loj lojVar = new loj(16, aVar);
                    externalServiceDeeplinkInterceptor$proccessIntent$1.L$0 = null;
                    externalServiceDeeplinkInterceptor$proccessIntent$1.L$1 = null;
                    externalServiceDeeplinkInterceptor$proccessIntent$1.L$2 = null;
                    externalServiceDeeplinkInterceptor$proccessIntent$1.label = 1;
                    if (aVar2.b(a, v770.c, lojVar, externalServiceDeeplinkInterceptor$proccessIntent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new m5u(false, false);
            }
        }
        externalServiceDeeplinkInterceptor$proccessIntent$1 = new ExternalServiceDeeplinkInterceptor$proccessIntent$1(aVar, continuationImpl);
        Object obj2 = externalServiceDeeplinkInterceptor$proccessIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceDeeplinkInterceptor$proccessIntent$1.label;
        if (i != 0) {
        }
        return new m5u(false, false);
    }
}
