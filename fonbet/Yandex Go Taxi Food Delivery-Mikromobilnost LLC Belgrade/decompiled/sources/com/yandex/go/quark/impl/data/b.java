package com.yandex.go.quark.impl.data;

import defpackage.cne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final tig0 a;
    public final ru.yandex.taxi.am.token.a b;
    public final tse c;
    public final tt2 d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();

    public b(tig0 tig0Var, ru.yandex.taxi.am.token.a aVar, tse tseVar, tt2 tt2Var) {
        this.a = tig0Var;
        this.b = aVar;
        this.c = tseVar;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        QuarkOAuthRepository$onUserUnauthorized$1 quarkOAuthRepository$onUserUnauthorized$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof QuarkOAuthRepository$onUserUnauthorized$1) {
                quarkOAuthRepository$onUserUnauthorized$1 = (QuarkOAuthRepository$onUserUnauthorized$1) continuationImpl;
                int i2 = quarkOAuthRepository$onUserUnauthorized$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    quarkOAuthRepository$onUserUnauthorized$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = quarkOAuthRepository$onUserUnauthorized$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = quarkOAuthRepository$onUserUnauthorized$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.e;
                        quarkOAuthRepository$onUserUnauthorized$1.L$0 = aVar;
                        quarkOAuthRepository$onUserUnauthorized$1.label = 1;
                        if (aVar.a(quarkOAuthRepository$onUserUnauthorized$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) quarkOAuthRepository$onUserUnauthorized$1.L$0;
                        kotlin.b.b(obj);
                    }
                    ((cne0) ((i3y) this.a.b).getValue()).u("oauth_token_has_quark_scopes", true);
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            ((cne0) ((i3y) this.a.b).getValue()).u("oauth_token_has_quark_scopes", true);
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        quarkOAuthRepository$onUserUnauthorized$1 = new QuarkOAuthRepository$onUserUnauthorized$1(this, continuationImpl);
        Object obj2 = quarkOAuthRepository$onUserUnauthorized$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkOAuthRepository$onUserUnauthorized$1.label;
        if (i != 0) {
        }
    }

    public final void b() {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.c, mdh.b, null, new QuarkOAuthRepository$refreshOAuthTokenAsyncIfNeed$1(this, null), 2);
    }
}
