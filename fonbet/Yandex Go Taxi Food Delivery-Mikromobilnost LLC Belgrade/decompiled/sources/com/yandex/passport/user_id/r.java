package com.yandex.passport.user_id;

import android.webkit.CookieManager;
import com.yandex.passport.api.exception.PassportFailedGetUserIdUrlException;
import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.api.r2;
import com.yandex.passport.api.s2;
import com.yandex.passport.api.t2;
import com.yandex.passport.api.v2;
import com.yandex.passport.api.w2;
import com.yandex.passport.api.x2;
import com.yandex.passport.api.y2;
import com.yandex.passport.api.z2;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.web.BridgeMethod;
import com.yandex.passport.user_id.di.GetUserIdUrlRequester$Response;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zcx;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.biometric.ui.verification.a c;
    public final com.yandex.passport.internal.upgrader.h d;
    public final com.yandex.passport.internal.methods.requester.e e;
    public final UserIdProperties f;

    public r(com.yandex.passport.biometric.ui.verification.a aVar, com.yandex.passport.internal.upgrader.h hVar, com.yandex.passport.internal.methods.requester.e eVar, UserIdProperties userIdProperties) {
        this.c = aVar;
        this.d = hVar;
        this.e = eVar;
        this.f = userIdProperties;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        if (((q) obj) != null) {
            Object k = k((ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        Object failure;
        c cVar;
        Object obj2;
        BridgeMethod bridgeMethod;
        p pVar;
        com.yandex.passport.user_id.models.k kVar = (com.yandex.passport.user_id.models.k) obj;
        boolean z = kVar instanceof com.yandex.passport.user_id.models.i;
        zy11 zy11Var = zy11.a;
        if (!z) {
            if (!(kVar instanceof com.yandex.passport.user_id.models.j)) {
                w511.b();
                return null;
            }
            t2 t2Var = ((com.yandex.passport.user_id.models.j) kVar).a;
            if (t2Var instanceof s2) {
                f(new com.yandex.passport.user_id.models.b(unr0.l(')', "window.nativeAMResponse.additionalData(", JSONObject.quote(((s2) t2Var).a))));
            } else {
                if (!(t2Var instanceof r2)) {
                    w511.b();
                    return null;
                }
                e(q.a);
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return zy11Var;
        }
        String str = ((com.yandex.passport.user_id.models.i) kVar).a;
        o oVar = o.a;
        zcx zcxVar = (zcx) this.c.b;
        try {
            cVar = (c) zcxVar.b(c.Companion.serializer(), str);
            Iterator<E> it = BridgeMethod.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((BridgeMethod) obj2).getMethodName(), cVar.a)) {
                    break;
                }
            }
            bridgeMethod = (BridgeMethod) obj2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (bridgeMethod == null) {
            throw new IllegalStateException("Unknown method: " + cVar.a);
        }
        int i = e.a[bridgeMethod.ordinal()];
        if (i == 1) {
            pVar = oVar;
        } else if (i == 2) {
            String str2 = cVar.c;
            if (str2 == null) {
                throw new IllegalArgumentException("data must be not null");
            }
            pVar = (p) zcxVar.b(k.Companion.serializer(), str2);
        } else if (i == 3) {
            String str3 = cVar.c;
            if (str3 == null) {
                throw new IllegalArgumentException("data must be not null");
            }
            pVar = (p) zcxVar.b(h.Companion.serializer(), str3);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown method: " + cVar.a);
            }
            String str4 = cVar.c;
            if (str4 == null) {
                throw new IllegalArgumentException("data must be not null");
            }
            pVar = (p) zcxVar.b(n.Companion.serializer(), str4);
        }
        failure = new d(pVar, cVar.b);
        Throwable a = Result.a(failure);
        if (a == null) {
            d dVar = (d) failure;
            p pVar2 = dVar.a;
            if (jl40.l(pVar2, oVar)) {
                a(s.a);
            } else if (pVar2 instanceof h) {
                h hVar = (h) pVar2;
                f(new com.yandex.passport.user_id.models.a(new x2(hVar.a, hVar.b)));
            } else if (pVar2 instanceof k) {
                k kVar2 = (k) pVar2;
                f(new com.yandex.passport.user_id.models.a(new y2(kVar2.a, kVar2.b)));
            } else {
                if (!(pVar2 instanceof n)) {
                    w511.b();
                    return null;
                }
                f(new com.yandex.passport.user_id.models.a(new v2(dVar.b, ((n) pVar2).a)));
            }
        } else {
            this.d.a.reportEvent("process_bridge_command_error", gw00.e(new Pair("throwable", a.toString())));
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Unhandled exception occurred.", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        UserIdStoreFactory$ExecutorImpl$loadUserId$1 userIdStoreFactory$ExecutorImpl$loadUserId$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof UserIdStoreFactory$ExecutorImpl$loadUserId$1) {
            userIdStoreFactory$ExecutorImpl$loadUserId$1 = (UserIdStoreFactory$ExecutorImpl$loadUserId$1) continuationImpl;
            int i2 = userIdStoreFactory$ExecutorImpl$loadUserId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userIdStoreFactory$ExecutorImpl$loadUserId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userIdStoreFactory$ExecutorImpl$loadUserId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userIdStoreFactory$ExecutorImpl$loadUserId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f(new com.yandex.passport.user_id.models.a(z2.a));
                    userIdStoreFactory$ExecutorImpl$loadUserId$1.L$0 = this;
                    userIdStoreFactory$ExecutorImpl$loadUserId$1.label = 1;
                    c = this.e.c(this.f, userIdStoreFactory$ExecutorImpl$loadUserId$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (r) userIdStoreFactory$ExecutorImpl$loadUserId$1.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    try {
                        GetUserIdUrlRequester$Response getUserIdUrlRequester$Response = (GetUserIdUrlRequester$Response) c;
                        AuthCookie authCookie = getUserIdUrlRequester$Response.getAuthCookie();
                        if (authCookie != null) {
                            String url = getUserIdUrlRequester$Response.getUrl();
                            this.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            Iterator<T> it = authCookie.getCookies().iterator();
                            while (it.hasNext()) {
                                cookieManager.setCookie(url, (String) it.next());
                            }
                            cookieManager.flush();
                        }
                        c = getUserIdUrlRequester$Response.getUrl();
                    } catch (Throwable th) {
                        c = new Result.Failure(th);
                    }
                }
                a = Result.a(c);
                if (a != null) {
                    this.f(new com.yandex.passport.user_id.models.c((String) c));
                    if (((com.yandex.passport.user_id.models.e) this.g()).b) {
                        this.a(s.a);
                    }
                } else {
                    this.d.a.reportEvent("get_user_id_url_error", gw00.e(new Pair("throwable", a.toString())));
                    this.f(new com.yandex.passport.user_id.models.a(new w2(new PassportFailedGetUserIdUrlException(a))));
                }
                return zy11.a;
            }
        }
        userIdStoreFactory$ExecutorImpl$loadUserId$1 = new UserIdStoreFactory$ExecutorImpl$loadUserId$1(this, continuationImpl);
        Object obj2 = userIdStoreFactory$ExecutorImpl$loadUserId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userIdStoreFactory$ExecutorImpl$loadUserId$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        return zy11.a;
    }
}
