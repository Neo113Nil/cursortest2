package com.yandex.quark.webchat.auth.internal;

import android.net.Uri;
import defpackage.i3y;
import defpackage.id5;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.q5z;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wly0;
import defpackage.wp01;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class b {
    public final a a;
    public final id5 b;
    public final wly0 c;
    public final OkHttpClient.a d;
    public final i3y e = kotlin.a.a(new oay0(15, this));

    public b(a aVar, id5 id5Var, wly0 wly0Var, OkHttpClient.a aVar2) {
        this.a = aVar;
        this.b = id5Var;
        this.c = wly0Var;
        this.d = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, Uri uri, List list, ContinuationImpl continuationImpl) {
        WebAuthorizer$callAuthUrl$1 webAuthorizer$callAuthUrl$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof WebAuthorizer$callAuthUrl$1) {
            webAuthorizer$callAuthUrl$1 = (WebAuthorizer$callAuthUrl$1) continuationImpl;
            int i2 = webAuthorizer$callAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizer$callAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthorizer$callAuthUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizer$callAuthUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wp01 wp01Var = new wp01(6, bVar, uri, list);
                    webAuthorizer$callAuthUrl$1.label = 1;
                    obj = kotlinx.coroutines.a.r(wp01Var, webAuthorizer$callAuthUrl$1);
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
        webAuthorizer$callAuthUrl$1 = new WebAuthorizer$callAuthUrl$1(bVar, continuationImpl);
        Object obj2 = webAuthorizer$callAuthUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizer$callAuthUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final Object b(Uri uri, Uri uri2, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new WebAuthorizer$login$2(this, uri2, uri, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WebAuthorizer$logout$1 webAuthorizer$logout$1;
        int i;
        if (continuationImpl instanceof WebAuthorizer$logout$1) {
            webAuthorizer$logout$1 = (WebAuthorizer$logout$1) continuationImpl;
            int i2 = webAuthorizer$logout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizer$logout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webAuthorizer$logout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizer$logout$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = this.a;
                    qoh h = tje.h(aVar.d, null, null, new AuthorizationCookieManager$resetAuthorizationCookies$1(aVar, null), 3);
                    webAuthorizer$logout$1.label = 1;
                    if (h.s(webAuthorizer$logout$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return q5z.N();
            }
        }
        webAuthorizer$logout$1 = new WebAuthorizer$logout$1(this, continuationImpl);
        Object obj2 = webAuthorizer$logout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizer$logout$1.label;
        if (i != 0) {
        }
        return q5z.N();
    }
}
