package com.yandex.passport.internal.sloth;

import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.usecase.ui.u;
import com.yandex.passport.internal.usecase.ui.v;
import com.yandex.passport.sloth.SlothActionForbiddenException;
import com.yandex.passport.sloth.SlothInvalidTokenException;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class d {
    public final v a;

    public d(v vVar) {
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uid uid, String str, ContinuationImpl continuationImpl) {
        SlothAuthCookieProviderImpl$getAuthCookie$1 slothAuthCookieProviderImpl$getAuthCookie$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof SlothAuthCookieProviderImpl$getAuthCookie$1) {
            slothAuthCookieProviderImpl$getAuthCookie$1 = (SlothAuthCookieProviderImpl$getAuthCookie$1) continuationImpl;
            int i2 = slothAuthCookieProviderImpl$getAuthCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothAuthCookieProviderImpl$getAuthCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothAuthCookieProviderImpl$getAuthCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothAuthCookieProviderImpl$getAuthCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = new u(uid, str);
                    slothAuthCookieProviderImpl$getAuthCookie$1.label = 1;
                    obj = this.a.a(uVar, slothAuthCookieProviderImpl$getAuthCookie$1);
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
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    value = new com.yandex.passport.sloth.dependencies.a(((AuthCookie) value).getCookies());
                }
                a = Result.a(value);
                if (a != null) {
                    return value;
                }
                try {
                    if (a instanceof InvalidTokenException) {
                        throw new SlothInvalidTokenException();
                    }
                    if (a instanceof PassportActionForbiddenException) {
                        throw new SlothActionForbiddenException();
                    }
                    throw a;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        slothAuthCookieProviderImpl$getAuthCookie$1 = new SlothAuthCookieProviderImpl$getAuthCookie$1(this, continuationImpl);
        Object obj2 = slothAuthCookieProviderImpl$getAuthCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothAuthCookieProviderImpl$getAuthCookie$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
    }
}
