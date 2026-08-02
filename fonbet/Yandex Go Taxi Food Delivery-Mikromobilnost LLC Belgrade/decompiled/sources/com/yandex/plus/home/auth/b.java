package com.yandex.plus.home.auth;

import android.net.Uri;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Theme;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.authorization.LogoutResult;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.gwk0;
import defpackage.hj;
import defpackage.jse;
import defpackage.kp50;
import defpackage.lj;
import defpackage.n4u0;
import defpackage.nn3;
import defpackage.ny61;
import defpackage.o430;
import defpackage.on3;
import defpackage.pn3;
import defpackage.skd0;
import defpackage.tje;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes2.dex */
public final class b {
    public final com.yandex.plus.domain.auth.impl.a a;
    public final n4u0 b;
    public final jse c;
    public final long d;

    public b(com.yandex.plus.domain.auth.impl.a aVar, n4u0 n4u0Var, jse jseVar) {
        this.a = aVar;
        this.b = n4u0Var;
        this.c = jseVar;
        o430 o430Var = e3n.b;
        this.d = kp50.U(60, DurationUnit.SECONDS);
    }

    public final String a() {
        return ((lj) this.a.h.getValue()).getAuthToken();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        AuthorizationInteractorImpl$injectAuthCookie$1 authorizationInteractorImpl$injectAuthCookie$1;
        int i;
        if (continuationImpl instanceof AuthorizationInteractorImpl$injectAuthCookie$1) {
            authorizationInteractorImpl$injectAuthCookie$1 = (AuthorizationInteractorImpl$injectAuthCookie$1) continuationImpl;
            int i2 = authorizationInteractorImpl$injectAuthCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationInteractorImpl$injectAuthCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationInteractorImpl$injectAuthCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationInteractorImpl$injectAuthCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    authorizationInteractorImpl$injectAuthCookie$1.L$0 = null;
                    authorizationInteractorImpl$injectAuthCookie$1.label = 1;
                    if (this.a.h(str, authorizationInteractorImpl$injectAuthCookie$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        authorizationInteractorImpl$injectAuthCookie$1 = new AuthorizationInteractorImpl$injectAuthCookie$1(this, continuationImpl);
        Object obj2 = authorizationInteractorImpl$injectAuthCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationInteractorImpl$injectAuthCookie$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final boolean c() {
        return this.a.h.getValue() instanceof hj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: CancellationException -> 0x0061, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x005e, B:21:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x005e, B:21:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        AuthorizationInteractorImpl$login$1 authorizationInteractorImpl$login$1;
        int i;
        Object f;
        try {
            if (continuationImpl instanceof AuthorizationInteractorImpl$login$1) {
                authorizationInteractorImpl$login$1 = (AuthorizationInteractorImpl$login$1) continuationImpl;
                int i2 = authorizationInteractorImpl$login$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    authorizationInteractorImpl$login$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = authorizationInteractorImpl$login$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = authorizationInteractorImpl$login$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.plus.domain.auth.impl.a aVar = this.a;
                        PlusAuthAdapter$Theme g = gwk0.g((PlusTheme) this.b.getValue());
                        authorizationInteractorImpl$login$1.label = 1;
                        f = aVar.f(g, authorizationInteractorImpl$login$1);
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        f = ((Result) obj).getValue();
                    }
                    return Result.a(f) != null ? new pn3(((hj) f).a) : on3.a;
                }
            }
            if (i != 0) {
            }
            if (Result.a(f) != null) {
            }
        } catch (CancellationException unused) {
            return nn3.a;
        }
        authorizationInteractorImpl$login$1 = new AuthorizationInteractorImpl$login$1(this, continuationImpl);
        Object obj2 = authorizationInteractorImpl$login$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationInteractorImpl$login$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: CancellationException -> 0x005c, TryCatch #0 {CancellationException -> 0x005c, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x0059, B:21:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: CancellationException -> 0x005c, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x005c, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x0059, B:21:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(ContinuationImpl continuationImpl) {
        AuthorizationInteractorImpl$logout$1 authorizationInteractorImpl$logout$1;
        int i;
        Object g;
        try {
            if (continuationImpl instanceof AuthorizationInteractorImpl$logout$1) {
                authorizationInteractorImpl$logout$1 = (AuthorizationInteractorImpl$logout$1) continuationImpl;
                int i2 = authorizationInteractorImpl$logout$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    authorizationInteractorImpl$logout$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = authorizationInteractorImpl$logout$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = authorizationInteractorImpl$logout$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.plus.domain.auth.impl.a aVar = this.a;
                        PlusAuthAdapter$Theme g2 = gwk0.g((PlusTheme) this.b.getValue());
                        authorizationInteractorImpl$logout$1.label = 1;
                        g = aVar.g(g2, authorizationInteractorImpl$logout$1);
                        if (g == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        g = ((Result) obj).getValue();
                    }
                    if (Result.a(g) == null) {
                        return LogoutResult.ERROR;
                    }
                    return LogoutResult.SUCCESS;
                }
            }
            if (i != 0) {
            }
            if (Result.a(g) == null) {
            }
        } catch (CancellationException unused) {
            return LogoutResult.CANCEL;
        }
        authorizationInteractorImpl$logout$1 = new AuthorizationInteractorImpl$logout$1(this, continuationImpl);
        Object obj2 = authorizationInteractorImpl$logout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationInteractorImpl$logout$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        AuthorizationInteractorImpl$waitIsAuthorized$1 authorizationInteractorImpl$waitIsAuthorized$1;
        int i;
        if (continuationImpl instanceof AuthorizationInteractorImpl$waitIsAuthorized$1) {
            authorizationInteractorImpl$waitIsAuthorized$1 = (AuthorizationInteractorImpl$waitIsAuthorized$1) continuationImpl;
            int i2 = authorizationInteractorImpl$waitIsAuthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationInteractorImpl$waitIsAuthorized$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationInteractorImpl$waitIsAuthorized$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationInteractorImpl$waitIsAuthorized$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthorizationInteractorImpl$waitIsAuthorized$2 authorizationInteractorImpl$waitIsAuthorized$2 = new AuthorizationInteractorImpl$waitIsAuthorized$2(this, null);
                    authorizationInteractorImpl$waitIsAuthorized$1.label = 1;
                    obj = kotlinx.coroutines.a.x(this.d, authorizationInteractorImpl$waitIsAuthorized$2, authorizationInteractorImpl$waitIsAuthorized$1);
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
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        authorizationInteractorImpl$waitIsAuthorized$1 = new AuthorizationInteractorImpl$waitIsAuthorized$1(this, continuationImpl);
        Object obj2 = authorizationInteractorImpl$waitIsAuthorized$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationInteractorImpl$waitIsAuthorized$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    public final Object g(String str, Continuation continuation) {
        Uri parse = Uri.parse(str);
        PlusLogTag plusLogTag = PlusLogTag.SDK;
        skd0.e(plusLogTag, "Authorize url = \"" + str + OpenList.CHAR_QUOTE);
        String host = parse.getHost();
        if (host == null || host.length() == 0) {
            skd0.h(plusLogTag, "Can't get host for url = \"" + str + OpenList.CHAR_QUOTE, null);
            return str;
        }
        String host2 = parse.getHost();
        List Y = host2 != null ? evu0.Y(host2, new char[]{'.'}, 0, 6) : null;
        String str2 = Y != null ? (String) kotlin.collections.a.b0(Y) : null;
        if (str2 != null) {
            return tje.k0(this.c, new AuthorizationInteractorImpl$withAuthCookieRedirect$2(this, str, str2, null), continuation);
        }
        skd0.h(plusLogTag, "Can't get TLD for url = \"" + str + OpenList.CHAR_QUOTE, null);
        return str;
    }
}
