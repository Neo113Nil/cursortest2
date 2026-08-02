package com.yandex.go.intentprocessor;

import android.net.Uri;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.xby;
import defpackage.yn3;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final ru.yandex.taxi.am.o a;
    public final yn3 b;

    public a(ru.yandex.taxi.am.o oVar, yn3 yn3Var) {
        this.a = oVar;
        this.b = yn3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(2:23|(3:25|(1:27)(1:33)|(2:29|(1:31))(1:32))(1:34))|12|13|(1:15)(1:19)|16|17))|38|6|7|(0)(0)|12|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r11 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable a(Uri uri, ContinuationImpl continuationImpl) {
        AuthorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1 authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof AuthorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1) {
            authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1 = (AuthorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1) continuationImpl;
            int i2 = authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((Boolean) ((qqo) this.b.a.getValue()).b()).booleanValue()) {
                        return null;
                    }
                    String queryParameter = uri.getQueryParameter("need_authorization");
                    if (!(queryParameter != null ? jl40.l(evu0.j0(queryParameter), Boolean.TRUE) : false)) {
                        return null;
                    }
                    ru.yandex.taxi.am.o oVar = this.a;
                    String uri2 = uri.toString();
                    authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.L$0 = null;
                    authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.L$1 = null;
                    authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.label = 1;
                    obj = ru.yandex.taxi.am.n.a(oVar, uri2, authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1);
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
                Object failure = Uri.parse((String) obj);
                a = Result.a(failure);
                if (a != null) {
                    obj2 = failure;
                } else {
                    xby.l(jst.e, "URL:AUTH", null, a, "Failed to wrap url for authorization", 2);
                }
                return (Uri) obj2;
            }
        }
        authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1 = new AuthorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1(this, continuationImpl);
        Object obj3 = authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationUrlInterceptorImpl$wrapToAuthorizationUrl$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        Object failure2 = Uri.parse((String) obj3);
        a = Result.a(failure2);
        if (a != null) {
        }
        return (Uri) obj22;
    }
}
