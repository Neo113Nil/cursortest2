package com.yandex.passport.data.network;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public f(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(e eVar, ContinuationImpl continuationImpl) {
        AuthorizeByPasswordRequest$RequestFactory$createRequest$1 authorizeByPasswordRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof AuthorizeByPasswordRequest$RequestFactory$createRequest$1) {
            authorizeByPasswordRequest$RequestFactory$createRequest$1 = (AuthorizeByPasswordRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = authorizeByPasswordRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByPasswordRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByPasswordRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByPasswordRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.a, eVar.d()).a, "/1/bundle/mobile/auth/password/");
                    g.f("track_id", eVar.g());
                    g.f(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, eVar.e());
                    if (eVar.a() != null) {
                        g.f("avatar_url", eVar.a());
                    }
                    g.f("captcha_answer", eVar.b());
                    g.f("password_source", eVar.f());
                    authorizeByPasswordRequest$RequestFactory$createRequest$1.L$0 = g;
                    authorizeByPasswordRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, authorizeByPasswordRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) authorizeByPasswordRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        authorizeByPasswordRequest$RequestFactory$createRequest$1 = new AuthorizeByPasswordRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = authorizeByPasswordRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByPasswordRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
