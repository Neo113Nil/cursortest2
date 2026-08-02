package com.yandex.quark.webchat.auth.internal;

import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.CookieManager;
import defpackage.gtq0;
import defpackage.id5;
import defpackage.ike;
import defpackage.j73;
import defpackage.lb7;
import defpackage.lne;
import defpackage.ny61;
import defpackage.z3x0;
import defpackage.zwf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public static final Set f = j73.f0(new String[]{"Session_id", "sessar", "sessionid2", "sessguard", "yp", "ys", "L", "yandex_login", "lah", "mda2_beacon"});
    public final id5 a;
    public final zwf0 b;
    public final lb7 c;
    public final ike d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();

    public a(id5 id5Var, zwf0 zwf0Var, lb7 lb7Var, ike ikeVar) {
        this.a = id5Var;
        this.b = zwf0Var;
        this.c = lb7Var;
        this.d = ikeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00bb -> B:10:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        AuthorizationCookieManager$removeAuthorizationCookies$1 authorizationCookieManager$removeAuthorizationCookies$1;
        int i;
        Set<String> stringSet;
        Object failure;
        Uri uri;
        Iterator it;
        id5 id5Var = aVar.a;
        lb7 lb7Var = aVar.c;
        zwf0 zwf0Var = aVar.b;
        if (continuationImpl instanceof AuthorizationCookieManager$removeAuthorizationCookies$1) {
            authorizationCookieManager$removeAuthorizationCookies$1 = (AuthorizationCookieManager$removeAuthorizationCookies$1) continuationImpl;
            int i2 = authorizationCookieManager$removeAuthorizationCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationCookieManager$removeAuthorizationCookies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationCookieManager$removeAuthorizationCookies$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationCookieManager$removeAuthorizationCookies$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SharedPreferences sharedPreferences = (SharedPreferences) lb7Var.b;
                    String string = sharedPreferences.getString("cookies_uri", null);
                    lne lneVar = (string == null || (stringSet = sharedPreferences.getStringSet("cookies_names", null)) == null) ? null : new lne(string, stringSet);
                    if (lneVar == null) {
                        zwf0Var.b("AuthorizationCookieManager", "No cookies to remove");
                        return zy11Var;
                    }
                    try {
                        failure = Uri.parse(lneVar.b());
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    Uri uri2 = (Uri) failure;
                    if (uri2 != null) {
                        uri = uri2;
                        it = lneVar.a().iterator();
                        if (it.hasNext()) {
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = (String) authorizationCookieManager$removeAuthorizationCookies$1.L$2;
                it = (Iterator) authorizationCookieManager$removeAuthorizationCookies$1.L$1;
                uri = (Uri) authorizationCookieManager$removeAuthorizationCookies$1.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    zwf0Var.e("AuthorizationCookieManager", "Failed to remove cookie by name: " + str);
                }
                if (it.hasNext()) {
                    str = (String) it.next();
                    zwf0Var.b("AuthorizationCookieManager", "Remove cookie: " + str);
                    authorizationCookieManager$removeAuthorizationCookies$1.L$0 = uri;
                    authorizationCookieManager$removeAuthorizationCookies$1.L$1 = it;
                    authorizationCookieManager$removeAuthorizationCookies$1.L$2 = str;
                    authorizationCookieManager$removeAuthorizationCookies$1.label = 1;
                    obj = com.yandex.quark.webchat.cookie.internal.b.a(id5Var, uri, str, authorizationCookieManager$removeAuthorizationCookies$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    if (it.hasNext()) {
                        ((CookieManager) ((z3x0) id5Var).b.getValue()).flush();
                        lb7Var.B(null);
                        return zy11Var;
                    }
                }
            }
        }
        authorizationCookieManager$removeAuthorizationCookies$1 = new AuthorizationCookieManager$removeAuthorizationCookies$1(aVar, continuationImpl);
        Object obj2 = authorizationCookieManager$removeAuthorizationCookies$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationCookieManager$removeAuthorizationCookies$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
