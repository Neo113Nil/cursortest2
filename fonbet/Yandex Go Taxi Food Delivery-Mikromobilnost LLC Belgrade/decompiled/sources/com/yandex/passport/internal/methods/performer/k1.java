package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.s2;
import com.yandex.passport.internal.methods.x2;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k1 implements w0 {
    public final com.yandex.passport.internal.database.auth_cookie.a a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.usecase.j0 c;

    public k1(com.yandex.passport.internal.database.auth_cookie.a aVar, com.yandex.passport.internal.methods.performer.error.a aVar2, com.yandex.passport.internal.usecase.j0 j0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = j0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r6.c(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(k1 k1Var, Uid uid, String str, ContinuationImpl continuationImpl) {
        UpdateAuthCookiePerformer$updateCookie$1 updateAuthCookiePerformer$updateCookie$1;
        int i;
        Object c;
        k1Var.getClass();
        if (continuationImpl instanceof UpdateAuthCookiePerformer$updateCookie$1) {
            updateAuthCookiePerformer$updateCookie$1 = (UpdateAuthCookiePerformer$updateCookie$1) continuationImpl;
            int i2 = updateAuthCookiePerformer$updateCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateAuthCookiePerformer$updateCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateAuthCookiePerformer$updateCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateAuthCookiePerformer$updateCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.j0 j0Var = k1Var.c;
                    String d0 = evu0.d0(str, "://", str);
                    updateAuthCookiePerformer$updateCookie$1.L$0 = k1Var;
                    updateAuthCookiePerformer$updateCookie$1.L$1 = uid;
                    updateAuthCookiePerformer$updateCookie$1.L$2 = str;
                    updateAuthCookiePerformer$updateCookie$1.label = 1;
                    c = j0Var.c(uid, d0, updateAuthCookiePerformer$updateCookie$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) updateAuthCookiePerformer$updateCookie$1.L$2;
                    uid = (Uid) updateAuthCookiePerformer$updateCookie$1.L$1;
                    k1Var = (k1) updateAuthCookiePerformer$updateCookie$1.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                kotlin.b.b(c);
                List<String> cookies = ((AuthCookie) c).getCookies();
                com.yandex.passport.internal.database.auth_cookie.a aVar = k1Var.a;
                com.yandex.passport.internal.database.auth_cookie.f fVar = new com.yandex.passport.internal.database.auth_cookie.f(uid, cookies, str);
                updateAuthCookiePerformer$updateCookie$1.L$0 = null;
                updateAuthCookiePerformer$updateCookie$1.L$1 = null;
                updateAuthCookiePerformer$updateCookie$1.L$2 = null;
                updateAuthCookiePerformer$updateCookie$1.label = 2;
            }
        }
        updateAuthCookiePerformer$updateCookie$1 = new UpdateAuthCookiePerformer$updateCookie$1(k1Var, continuationImpl);
        Object obj2 = updateAuthCookiePerformer$updateCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateAuthCookiePerformer$updateCookie$1.label;
        if (i != 0) {
        }
        kotlin.b.b(c);
        List<String> cookies2 = ((AuthCookie) c).getCookies();
        com.yandex.passport.internal.database.auth_cookie.a aVar2 = k1Var.a;
        com.yandex.passport.internal.database.auth_cookie.f fVar2 = new com.yandex.passport.internal.database.auth_cookie.f(uid, cookies2, str);
        updateAuthCookiePerformer$updateCookie$1.L$0 = null;
        updateAuthCookiePerformer$updateCookie$1.L$1 = null;
        updateAuthCookiePerformer$updateCookie$1.L$2 = null;
        updateAuthCookiePerformer$updateCookie$1.label = 2;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new UpdateAuthCookiePerformer$performMethod$1((s2) x2Var, this, null));
        Throwable a = Result.a(g);
        if (a == null) {
            return g;
        }
        try {
            if (a instanceof PassportActionForbiddenException) {
                throw new PassportAccountNotAuthorizedException();
            }
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
