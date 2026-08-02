package defpackage;

import com.yandex.auth.LegacyAccountType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public interface e1d0 {
    r0 a();

    default Object b(d1d0 d1d0Var, ContinuationImpl continuationImpl) {
        return un91.a("updateAndInjectAuthCookie");
    }

    default Object c(a1d0 a1d0Var, ContinuationImpl continuationImpl) {
        return un91.a("isXTokenValid");
    }

    default Object d(x0d0 x0d0Var, ContinuationImpl continuationImpl) {
        return un91.a("getAccountInfo");
    }

    default Object e(b1d0 b1d0Var, Continuation continuation) {
        return un91.a(LegacyAccountType.STRING_LOGIN);
    }

    default Object f(c1d0 c1d0Var, Continuation continuation) {
        return un91.a("logout");
    }

    default Object g(w0d0 w0d0Var, ContinuationImpl continuationImpl) {
        return un91.a("dropAuthToken");
    }

    default Object h(z0d0 z0d0Var, ContinuationImpl continuationImpl) {
        return un91.a("getAuthorizationUrl");
    }

    default Object i(y0d0 y0d0Var, ContinuationImpl continuationImpl) {
        return un91.a("getAuthToken");
    }
}
