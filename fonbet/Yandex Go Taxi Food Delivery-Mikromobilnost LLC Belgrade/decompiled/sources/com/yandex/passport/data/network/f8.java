package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f8 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;
    public final com.yandex.passport.data.network.core.l c;

    public f8(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar, com.yandex.passport.data.network.core.l lVar) {
        this.a = pVar;
        this.b = hVar;
        this.c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e8 e8Var, ContinuationImpl continuationImpl) {
        GetQrLinkRequest$RequestFactory$createRequest$1 getQrLinkRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetQrLinkRequest$RequestFactory$createRequest$1) {
            getQrLinkRequest$RequestFactory$createRequest$1 = (GetQrLinkRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getQrLinkRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getQrLinkRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getQrLinkRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getQrLinkRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, e8Var.a()).a, "/2/bundle/auth/password/submit/");
                    g.b("Ya-Client-Host", this.c.a(e8Var.a()));
                    g.b("Ya-Client-Cookie", "");
                    g.f("with_code", "1");
                    String b = e8Var.b();
                    if (b != null) {
                        g.f("qrpath", b);
                    }
                    getQrLinkRequest$RequestFactory$createRequest$1.L$0 = g;
                    getQrLinkRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getQrLinkRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getQrLinkRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getQrLinkRequest$RequestFactory$createRequest$1 = new GetQrLinkRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getQrLinkRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getQrLinkRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
