package com.yandex.go.quark.dynamic.chat;

import android.net.Uri;
import defpackage.ep90;
import defpackage.jyj0;
import defpackage.lyj0;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.syj0;
import defpackage.th40;
import defpackage.w511;
import defpackage.wn3;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final ep90 a;

    public b(ep90 ep90Var) {
        this.a = ep90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, String str, String str2, ContinuationImpl continuationImpl) {
        PassportAuthorizationUrlFactory$createAuthorizationUrl$1 passportAuthorizationUrlFactory$createAuthorizationUrl$1;
        int i;
        Object p;
        syj0 i0;
        if (continuationImpl instanceof PassportAuthorizationUrlFactory$createAuthorizationUrl$1) {
            passportAuthorizationUrlFactory$createAuthorizationUrl$1 = (PassportAuthorizationUrlFactory$createAuthorizationUrl$1) continuationImpl;
            int i2 = passportAuthorizationUrlFactory$createAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAuthorizationUrlFactory$createAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAuthorizationUrlFactory$createAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAuthorizationUrlFactory$createAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.api.b a = this.a.a();
                    th40 th40Var = new th40(this, str, uri, str2);
                    passportAuthorizationUrlFactory$createAuthorizationUrl$1.L$0 = null;
                    passportAuthorizationUrlFactory$createAuthorizationUrl$1.L$1 = null;
                    passportAuthorizationUrlFactory$createAuthorizationUrl$1.L$2 = null;
                    passportAuthorizationUrlFactory$createAuthorizationUrl$1.label = 1;
                    p = a.p(th40Var, passportAuthorizationUrlFactory$createAuthorizationUrl$1);
                    if (p == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    p = ((Result) obj).getValue();
                }
                i0 = q5z.i0(p);
                if (!(i0 instanceof lyj0)) {
                    if (!(i0 instanceof jyj0)) {
                        w511.b();
                        return null;
                    }
                    Throwable th = (Throwable) ((jyj0) i0).a;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    String concat = "Failed to get authorization url: ".concat(message);
                    th.getCause();
                    i0 = new jyj0(new wn3(concat));
                }
                return i0.b(PassportAuthorizationUrlFactory$createAuthorizationUrl$4.b);
            }
        }
        passportAuthorizationUrlFactory$createAuthorizationUrl$1 = new PassportAuthorizationUrlFactory$createAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = passportAuthorizationUrlFactory$createAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAuthorizationUrlFactory$createAuthorizationUrl$1.label;
        if (i != 0) {
        }
        i0 = q5z.i0(p);
        if (!(i0 instanceof lyj0)) {
        }
        return i0.b(PassportAuthorizationUrlFactory$createAuthorizationUrl$4.b);
    }
}
