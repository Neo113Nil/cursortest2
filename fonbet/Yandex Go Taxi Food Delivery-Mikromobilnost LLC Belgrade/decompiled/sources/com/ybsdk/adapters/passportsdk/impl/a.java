package com.ybsdk.adapters.passportsdk.impl;

import android.content.Context;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.KPassportStashCell;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.b;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.g2;
import com.yandex.passport.api.i;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.impl.f;
import com.yandex.passport.internal.m;
import com.yandex.passport.internal.provider.communication.p;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.od;
import com.yandex.passport.internal.s;
import com.ybsdk.feature.passport.api.adapter.PassportReloginRequiredException;
import com.ybsdk.feature.passport.api.adapter.PassportStashCell;
import defpackage.fn90;
import defpackage.ny61;
import defpackage.th40;
import defpackage.w511;
import defpackage.ym90;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public static final Object c = new Object();
    public static volatile f d;
    public final KPassportEnvironment a;
    public final b b;

    public a(Context context, KPassportEnvironment kPassportEnvironment) {
        f fVar;
        this.a = kPassportEnvironment;
        synchronized (c) {
            fVar = d;
            if (fVar == null) {
                IReporterYandex b = od.b(context);
                Thread.setDefaultUncaughtExceptionHandler(new m(new kd(context, b)));
                s.b(context, b);
                if (p.a == null) {
                    p.a = p.a();
                }
                f fVar2 = new f(context.getApplicationContext(), b);
                d = fVar2;
                fVar = fVar2;
            }
        }
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$dropToken$1 passportAdapterImpl$dropToken$1;
        int i;
        if (continuationImpl instanceof PassportAdapterImpl$dropToken$1) {
            passportAdapterImpl$dropToken$1 = (PassportAdapterImpl$dropToken$1) continuationImpl;
            int i2 = passportAdapterImpl$dropToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$dropToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$dropToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$dropToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    passportAdapterImpl$dropToken$1.label = 1;
                    Object A = this.b.A(str, passportAdapterImpl$dropToken$1);
                    return A == coroutineSingletons ? coroutineSingletons : A;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        passportAdapterImpl$dropToken$1 = new PassportAdapterImpl$dropToken$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$dropToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$dropToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$getAccountInfo$1 passportAdapterImpl$getAccountInfo$1;
        int i;
        Object g;
        if (continuationImpl instanceof PassportAdapterImpl$getAccountInfo$1) {
            passportAdapterImpl$getAccountInfo$1 = (PassportAdapterImpl$getAccountInfo$1) continuationImpl;
            int i2 = passportAdapterImpl$getAccountInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$getAccountInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$getAccountInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$getAccountInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object f = f(j);
                    Throwable a = Result.a(f);
                    if (a != null) {
                        return new Result.Failure(a);
                    }
                    passportAdapterImpl$getAccountInfo$1.label = 1;
                    g = this.b.g((k2) f, passportAdapterImpl$getAccountInfo$1);
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
                if (!(g instanceof Result.Failure)) {
                    return g;
                }
                i iVar = (i) g;
                return new ym90(iVar.getUid().getValue(), iVar.getLastName(), iVar.getFirstName(), iVar.getPrimaryDisplayName(), iVar.getSecondaryDisplayName(), iVar.getNativeDefaultEmail(), iVar.getHasPlus(), iVar.isAvatarEmpty() ? null : iVar.getAvatarUrl(), iVar.isYandexoid(), iVar.isAuthorized());
            }
        }
        passportAdapterImpl$getAccountInfo$1 = new PassportAdapterImpl$getAccountInfo$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$getAccountInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$getAccountInfo$1.label;
        if (i != 0) {
        }
        if (!(g instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$getAccountManagementUrl$1 passportAdapterImpl$getAccountManagementUrl$1;
        int i;
        if (continuationImpl instanceof PassportAdapterImpl$getAccountManagementUrl$1) {
            passportAdapterImpl$getAccountManagementUrl$1 = (PassportAdapterImpl$getAccountManagementUrl$1) continuationImpl;
            int i2 = passportAdapterImpl$getAccountManagementUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$getAccountManagementUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$getAccountManagementUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$getAccountManagementUrl$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object f = f(j);
                Throwable a = Result.a(f);
                if (a != null) {
                    return new Result.Failure(a);
                }
                passportAdapterImpl$getAccountManagementUrl$1.label = 1;
                Object z = this.b.z((k2) f, passportAdapterImpl$getAccountManagementUrl$1);
                return z == coroutineSingletons ? coroutineSingletons : z;
            }
        }
        passportAdapterImpl$getAccountManagementUrl$1 = new PassportAdapterImpl$getAccountManagementUrl$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$getAccountManagementUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$getAccountManagementUrl$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j, String str, String str2, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$getAuthorizationUrl$1 passportAdapterImpl$getAuthorizationUrl$1;
        int i;
        if (continuationImpl instanceof PassportAdapterImpl$getAuthorizationUrl$1) {
            passportAdapterImpl$getAuthorizationUrl$1 = (PassportAdapterImpl$getAuthorizationUrl$1) continuationImpl;
            int i2 = passportAdapterImpl$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$getAuthorizationUrl$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object f = f(j);
                Throwable a = Result.a(f);
                if (a == null) {
                    th40 th40Var = new th40(9, (k2) f, str2, str);
                    passportAdapterImpl$getAuthorizationUrl$1.label = 1;
                    Object p = this.b.p(th40Var, passportAdapterImpl$getAuthorizationUrl$1);
                    return p == coroutineSingletons ? coroutineSingletons : p;
                }
                if ((a instanceof PassportAccountNotAuthorizedException) || (a instanceof PassportAccountNotFoundException)) {
                    a = new PassportReloginRequiredException();
                }
                return new Result.Failure(a);
            }
        }
        passportAdapterImpl$getAuthorizationUrl$1 = new PassportAdapterImpl$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$getAuthorizationUrl$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, PassportStashCell passportStashCell, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$getFromStash$1 passportAdapterImpl$getFromStash$1;
        int i;
        Object g;
        KPassportStashCell kPassportStashCell;
        if (continuationImpl instanceof PassportAdapterImpl$getFromStash$1) {
            passportAdapterImpl$getFromStash$1 = (PassportAdapterImpl$getFromStash$1) continuationImpl;
            int i2 = passportAdapterImpl$getFromStash$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$getFromStash$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$getFromStash$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$getFromStash$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object f = f(j);
                    Throwable a = Result.a(f);
                    if (a != null) {
                        return new Result.Failure(a);
                    }
                    passportAdapterImpl$getFromStash$1.L$0 = passportStashCell;
                    passportAdapterImpl$getFromStash$1.label = 1;
                    g = this.b.g((k2) f, passportAdapterImpl$getFromStash$1);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    passportStashCell = (PassportStashCell) passportAdapterImpl$getFromStash$1.L$0;
                    kotlin.b.b(obj);
                    g = ((Result) obj).getValue();
                }
                if (!(g instanceof Result.Failure)) {
                    return g;
                }
                g2 stash = ((i) g).getStash();
                int i3 = fn90.a[passportStashCell.ordinal()];
                if (i3 == 1) {
                    kPassportStashCell = KPassportStashCell.BANK_PIN_CODE;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    kPassportStashCell = KPassportStashCell.BANK_PIN_CODE_V2;
                }
                return stash.get(kPassportStashCell);
            }
        }
        passportAdapterImpl$getFromStash$1 = new PassportAdapterImpl$getFromStash$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$getFromStash$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$getFromStash$1.label;
        if (i != 0) {
        }
        if (!(g instanceof Result.Failure)) {
        }
    }

    public final Object f(long j) {
        try {
            return new PassportUidImpl(PassportEnvironmentImpl.from(this.a), j);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, String str, String str2, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$getToken$1 passportAdapterImpl$getToken$1;
        int i;
        Object w;
        if (continuationImpl instanceof PassportAdapterImpl$getToken$1) {
            passportAdapterImpl$getToken$1 = (PassportAdapterImpl$getToken$1) continuationImpl;
            int i2 = passportAdapterImpl$getToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$getToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$getToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$getToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object f = f(j);
                    Throwable a = Result.a(f);
                    if (a != null) {
                        return new Result.Failure(a);
                    }
                    ClientCredentials.Factory.getClass();
                    Credentials credentials = new Credentials(str, str2);
                    passportAdapterImpl$getToken$1.label = 1;
                    w = this.b.w((k2) f, credentials, passportAdapterImpl$getToken$1);
                    if (w == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    w = ((Result) obj).getValue();
                }
                return w instanceof Result.Failure ? ((com.yandex.passport.api.f) w).a : w;
            }
        }
        passportAdapterImpl$getToken$1 = new PassportAdapterImpl$getToken$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$getToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$getToken$1.label;
        if (i != 0) {
        }
        if (w instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, String str, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$injectCookie$1 passportAdapterImpl$injectCookie$1;
        int i;
        if (continuationImpl instanceof PassportAdapterImpl$injectCookie$1) {
            passportAdapterImpl$injectCookie$1 = (PassportAdapterImpl$injectCookie$1) continuationImpl;
            int i2 = passportAdapterImpl$injectCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$injectCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$injectCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$injectCookie$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object f = f(j);
                Throwable a = Result.a(f);
                if (a != null) {
                    return new Result.Failure(a);
                }
                passportAdapterImpl$injectCookie$1.label = 1;
                Object d2 = this.b.d((k2) f, str, passportAdapterImpl$injectCookie$1);
                return d2 == coroutineSingletons ? coroutineSingletons : d2;
            }
        }
        passportAdapterImpl$injectCookie$1 = new PassportAdapterImpl$injectCookie$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$injectCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$injectCookie$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, PassportStashCell passportStashCell, String str, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$stashValue$1 passportAdapterImpl$stashValue$1;
        int i;
        KPassportStashCell kPassportStashCell;
        if (continuationImpl instanceof PassportAdapterImpl$stashValue$1) {
            passportAdapterImpl$stashValue$1 = (PassportAdapterImpl$stashValue$1) continuationImpl;
            int i2 = passportAdapterImpl$stashValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$stashValue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$stashValue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$stashValue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object f = f(j);
                    if (f instanceof Result.Failure) {
                        return f;
                    }
                    k2 k2Var = (k2) f;
                    int i3 = fn90.a[passportStashCell.ordinal()];
                    if (i3 == 1) {
                        kPassportStashCell = KPassportStashCell.BANK_PIN_CODE;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        kPassportStashCell = KPassportStashCell.BANK_PIN_CODE_V2;
                    }
                    passportAdapterImpl$stashValue$1.label = 1;
                    if (this.b.n(k2Var, kPassportStashCell, str, passportAdapterImpl$stashValue$1) == coroutineSingletons) {
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
        passportAdapterImpl$stashValue$1 = new PassportAdapterImpl$stashValue$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$stashValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$stashValue$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, String str, ContinuationImpl continuationImpl) {
        PassportAdapterImpl$updateCookie$1 passportAdapterImpl$updateCookie$1;
        int i;
        if (continuationImpl instanceof PassportAdapterImpl$updateCookie$1) {
            passportAdapterImpl$updateCookie$1 = (PassportAdapterImpl$updateCookie$1) continuationImpl;
            int i2 = passportAdapterImpl$updateCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAdapterImpl$updateCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAdapterImpl$updateCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAdapterImpl$updateCookie$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object f = f(j);
                Throwable a = Result.a(f);
                if (a != null) {
                    return new Result.Failure(a);
                }
                passportAdapterImpl$updateCookie$1.label = 1;
                Object c2 = this.b.c((k2) f, str, passportAdapterImpl$updateCookie$1);
                return c2 == coroutineSingletons ? coroutineSingletons : c2;
            }
        }
        passportAdapterImpl$updateCookie$1 = new PassportAdapterImpl$updateCookie$1(this, continuationImpl);
        Object obj2 = passportAdapterImpl$updateCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAdapterImpl$updateCookie$1.label;
        if (i == 0) {
        }
    }
}
