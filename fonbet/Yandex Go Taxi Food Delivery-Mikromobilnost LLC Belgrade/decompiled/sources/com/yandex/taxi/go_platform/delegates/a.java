package com.yandex.taxi.go_platform.delegates;

import com.yandex.go.platform.sdk.models.PhonishUpgradeResult;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.fk;
import defpackage.j18;
import defpackage.jl40;
import defpackage.kj;
import defpackage.lwc0;
import defpackage.nv5;
import defpackage.ny61;
import defpackage.qzj0;
import defpackage.uj;
import defpackage.vj;
import defpackage.wj;
import defpackage.za21;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.s0;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes2.dex */
public final class a implements fk {
    public final g a;
    public final ru.yandex.taxi.am.token.a b;
    public final e c;
    public final f d;
    public final s0 e;

    public a(g gVar, ru.yandex.taxi.am.token.a aVar, e eVar, f fVar, s0 s0Var) {
        this.a = gVar;
        this.b = aVar;
        this.c = eVar;
        this.d = fVar;
        this.e = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nv5 nv5Var, ContinuationImpl continuationImpl) {
        AccountDelegateImpl$bindPhone$1 accountDelegateImpl$bindPhone$1;
        int i;
        if (continuationImpl instanceof AccountDelegateImpl$bindPhone$1) {
            accountDelegateImpl$bindPhone$1 = (AccountDelegateImpl$bindPhone$1) continuationImpl;
            int i2 = accountDelegateImpl$bindPhone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDelegateImpl$bindPhone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountDelegateImpl$bindPhone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDelegateImpl$bindPhone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    accountDelegateImpl$bindPhone$1.L$0 = nv5Var;
                    accountDelegateImpl$bindPhone$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(accountDelegateImpl$bindPhone$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(1, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    qzj0 qzj0Var = new qzj0(null, new AccountDelegateImpl$bindPhonegIAlus$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0));
                    f fVar = this.d;
                    String str = nv5Var != null ? nv5Var.a : null;
                    fVar.j = qzj0Var;
                    fVar.m = true;
                    fVar.f.a = true;
                    fVar.b(str);
                    y.element = uj.c;
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 1));
                    }
                    obj = j18Var.s();
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
        accountDelegateImpl$bindPhone$1 = new AccountDelegateImpl$bindPhone$1(this, continuationImpl);
        Object obj2 = accountDelegateImpl$bindPhone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDelegateImpl$bindPhone$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final Object b() {
        Object failure;
        try {
            failure = this.a.a.Ig();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (failure instanceof Result.Failure) {
            return failure;
        }
        kj kjVar = (kj) failure;
        if (kjVar == null) {
            return null;
        }
        String valueOf = String.valueOf(kjVar.a);
        String str = kjVar.b;
        String str2 = kjVar.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = kjVar.f;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = kjVar.g;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = kjVar.h;
        return new lwc0(valueOf, str, str2, str3, str4, str5 != null ? str5 : "", kjVar.d, kjVar.k, kjVar.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        AccountDelegateImpl$login$1 accountDelegateImpl$login$1;
        int i;
        Object d;
        Throwable a;
        Object failure;
        Object d2;
        if (continuationImpl instanceof AccountDelegateImpl$login$1) {
            accountDelegateImpl$login$1 = (AccountDelegateImpl$login$1) continuationImpl;
            int i2 = accountDelegateImpl$login$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDelegateImpl$login$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountDelegateImpl$login$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDelegateImpl$login$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    accountDelegateImpl$login$1.label = 1;
                    d = d(accountDelegateImpl$login$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj3 = accountDelegateImpl$login$1.L$0;
                            kotlin.b.b(obj);
                            ((Result) obj).getClass();
                            return obj3;
                        }
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        if (!(failure instanceof Result.Failure)) {
                            accountDelegateImpl$login$1.L$0 = failure;
                            accountDelegateImpl$login$1.L$1 = null;
                            accountDelegateImpl$login$1.L$2 = null;
                            accountDelegateImpl$login$1.label = 3;
                            d2 = this.b.d(false, accountDelegateImpl$login$1);
                            if (d2 == obj2) {
                                return obj2;
                            }
                        }
                        return failure;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                a = Result.a(d);
                if (a != null) {
                    accountDelegateImpl$login$1.L$0 = null;
                    accountDelegateImpl$login$1.L$1 = null;
                    accountDelegateImpl$login$1.L$2 = null;
                    accountDelegateImpl$login$1.label = 2;
                    failure = b();
                } else {
                    failure = new Result.Failure(a);
                }
                if (!(failure instanceof Result.Failure)) {
                }
                return failure;
            }
        }
        accountDelegateImpl$login$1 = new AccountDelegateImpl$login$1(this, continuationImpl);
        Object obj4 = accountDelegateImpl$login$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDelegateImpl$login$1.label;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        AccountDelegateImpl$loginViaAccountHandler$1 accountDelegateImpl$loginViaAccountHandler$1;
        int i;
        if (continuationImpl instanceof AccountDelegateImpl$loginViaAccountHandler$1) {
            accountDelegateImpl$loginViaAccountHandler$1 = (AccountDelegateImpl$loginViaAccountHandler$1) continuationImpl;
            int i2 = accountDelegateImpl$loginViaAccountHandler$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDelegateImpl$loginViaAccountHandler$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountDelegateImpl$loginViaAccountHandler$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDelegateImpl$loginViaAccountHandler$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.GO_PLATFORM;
                accountDelegateImpl$loginViaAccountHandler$1.label = 1;
                Object c = this.c.c(events$Zalogin$LoginContext, true, accountDelegateImpl$loginViaAccountHandler$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        accountDelegateImpl$loginViaAccountHandler$1 = new AccountDelegateImpl$loginViaAccountHandler$1(this, continuationImpl);
        Object obj2 = accountDelegateImpl$loginViaAccountHandler$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDelegateImpl$loginViaAccountHandler$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        AccountDelegateImpl$updateSession$1 accountDelegateImpl$updateSession$1;
        int i;
        Object d;
        try {
            if (continuationImpl instanceof AccountDelegateImpl$updateSession$1) {
                accountDelegateImpl$updateSession$1 = (AccountDelegateImpl$updateSession$1) continuationImpl;
                int i2 = accountDelegateImpl$updateSession$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    accountDelegateImpl$updateSession$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = accountDelegateImpl$updateSession$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = accountDelegateImpl$updateSession$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.am.token.a aVar = this.b;
                        accountDelegateImpl$updateSession$1.label = 1;
                        d = aVar.d(false, accountDelegateImpl$updateSession$1);
                        if (d == coroutineSingletons) {
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
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        accountDelegateImpl$updateSession$1 = new AccountDelegateImpl$updateSession$1(this, continuationImpl);
        Object obj2 = accountDelegateImpl$updateSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDelegateImpl$updateSession$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum f(za21 za21Var, ContinuationImpl continuationImpl) {
        AccountDelegateImpl$upgradePhonishAccount$1 accountDelegateImpl$upgradePhonishAccount$1;
        int i;
        Object h;
        Throwable a;
        if (continuationImpl instanceof AccountDelegateImpl$upgradePhonishAccount$1) {
            accountDelegateImpl$upgradePhonishAccount$1 = (AccountDelegateImpl$upgradePhonishAccount$1) continuationImpl;
            int i2 = accountDelegateImpl$upgradePhonishAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDelegateImpl$upgradePhonishAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountDelegateImpl$upgradePhonishAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDelegateImpl$upgradePhonishAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = za21Var.a;
                    accountDelegateImpl$upgradePhonishAccount$1.L$0 = null;
                    accountDelegateImpl$upgradePhonishAccount$1.label = 1;
                    h = this.e.h(z, accountDelegateImpl$upgradePhonishAccount$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    h = ((Result) obj).getValue();
                }
                a = Result.a(h);
                if (a == null) {
                    return jl40.l(a.getMessage(), "Upgrade cancelled") ? PhonishUpgradeResult.CANCELLED : PhonishUpgradeResult.FAILURE;
                }
                return PhonishUpgradeResult.OK;
            }
        }
        accountDelegateImpl$upgradePhonishAccount$1 = new AccountDelegateImpl$upgradePhonishAccount$1(this, continuationImpl);
        Object obj2 = accountDelegateImpl$upgradePhonishAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDelegateImpl$upgradePhonishAccount$1.label;
        if (i != 0) {
        }
        a = Result.a(h);
        if (a == null) {
        }
    }
}
