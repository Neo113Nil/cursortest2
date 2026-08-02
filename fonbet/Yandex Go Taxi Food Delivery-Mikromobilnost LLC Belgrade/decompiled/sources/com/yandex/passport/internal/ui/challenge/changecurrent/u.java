package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.usecase.j1;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.internal.ui.challenge.i c;
    public final j1 d;
    public final com.yandex.passport.internal.account.a e;
    public com.yandex.passport.internal.ui.challenge.v f;

    public u(com.yandex.passport.internal.ui.challenge.i iVar, j1 j1Var, com.yandex.passport.internal.account.a aVar) {
        this.c = iVar;
        this.d = j1Var;
        this.e = aVar;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        t tVar = (t) obj;
        if (tVar != null) {
            Object k = k(tVar.a, tVar.b, (ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        r rVar = (r) obj;
        if (rVar instanceof r) {
            Object m = m(rVar.a(), (ContinuationImpl) continuation);
            return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "onUnhandledError: " + th, 8);
        }
        a(new w(th));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Uid uid, AppTheme appTheme, ContinuationImpl continuationImpl) {
        SetCurrentStoreFactory$ExecutorImpl$onLoadContent$1 setCurrentStoreFactory$ExecutorImpl$onLoadContent$1;
        int i;
        if (continuationImpl instanceof SetCurrentStoreFactory$ExecutorImpl$onLoadContent$1) {
            setCurrentStoreFactory$ExecutorImpl$onLoadContent$1 = (SetCurrentStoreFactory$ExecutorImpl$onLoadContent$1) continuationImpl;
            int i2 = setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ModernAccount a = this.e.a();
                    Uid uid2 = a != null ? a.getUid() : null;
                    if (jl40.l(uid2, uid)) {
                        uid2 = null;
                    }
                    if (uid2 == null) {
                        setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$0 = this;
                        setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label = 1;
                        obj = l(uid, setCurrentStoreFactory$ExecutorImpl$onLoadContent$1);
                    } else {
                        a(new v(new o(uid, uid2)));
                        setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$0 = this;
                        setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$1 = uid;
                        setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label = 2;
                        obj = this.c.a(uid2, appTheme, setCurrentStoreFactory$ExecutorImpl$onLoadContent$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    this = (u) setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$0;
                    kotlin.b.b(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    this.getClass();
                    this.a(new x(booleanValue));
                    return zy11Var;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (u) setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$0;
                    kotlin.b.b(obj);
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    this.getClass();
                    this.a(new x(booleanValue2));
                    return zy11Var;
                }
                uid = (Uid) setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$1;
                this = (u) setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$0;
                kotlin.b.b(obj);
                com.yandex.passport.internal.ui.challenge.h hVar = (com.yandex.passport.internal.ui.challenge.h) obj;
                if (hVar instanceof com.yandex.passport.internal.ui.challenge.e) {
                    this.getClass();
                    this.a(new x(false));
                    return zy11Var;
                }
                if (!(hVar instanceof com.yandex.passport.internal.ui.challenge.f)) {
                    if (!(hVar instanceof com.yandex.passport.internal.ui.challenge.g)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.passport.internal.ui.challenge.g gVar = (com.yandex.passport.internal.ui.challenge.g) hVar;
                    this.f = gVar.a();
                    new com.yandex.passport.internal.ui.challenge.webview.l();
                    this.a(new z(com.yandex.passport.internal.ui.challenge.webview.l.a(gVar.a())));
                    return zy11Var;
                }
                setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$0 = this;
                setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.L$1 = null;
                setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label = 3;
                obj = this.l(uid, setCurrentStoreFactory$ExecutorImpl$onLoadContent$1);
            }
        }
        setCurrentStoreFactory$ExecutorImpl$onLoadContent$1 = new SetCurrentStoreFactory$ExecutorImpl$onLoadContent$1(this, continuationImpl);
        Object obj2 = setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentStoreFactory$ExecutorImpl$onLoadContent$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Uid uid, ContinuationImpl continuationImpl) {
        SetCurrentStoreFactory$ExecutorImpl$performChallengedAction$1 setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof SetCurrentStoreFactory$ExecutorImpl$performChallengedAction$1) {
            setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1 = (SetCurrentStoreFactory$ExecutorImpl$performChallengedAction$1) continuationImpl;
            int i2 = setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, "Executing setCurrentAccountUseCase", 10);
                    }
                    setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.L$0 = uid;
                    setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.label = 1;
                    obj = this.d.a(uid, setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uid = (Uid) setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.L$0;
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a != null) {
                    return Boolean.TRUE;
                }
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error performing challenged action for uid: " + uid, a);
                }
                return Boolean.FALSE;
            }
        }
        setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1 = new SetCurrentStoreFactory$ExecutorImpl$performChallengedAction$1(this, continuationImpl);
        Object obj2 = setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentStoreFactory$ExecutorImpl$performChallengedAction$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        a = Result.a(value2);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, ContinuationImpl continuationImpl) {
        SetCurrentStoreFactory$ExecutorImpl$processReturnUrl$1 setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1;
        int i;
        o oVar;
        com.yandex.passport.internal.ui.challenge.v vVar;
        Object b;
        if (continuationImpl instanceof SetCurrentStoreFactory$ExecutorImpl$processReturnUrl$1) {
            setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1 = (SetCurrentStoreFactory$ExecutorImpl$processReturnUrl$1) continuationImpl;
            int i2 = setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a(new z(null));
                    oVar = ((q) g()).a;
                    if (oVar == null || (vVar = this.f) == null) {
                        return zy11Var;
                    }
                    Uid uid = oVar.b;
                    setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$0 = this;
                    setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$1 = oVar;
                    setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.label = 1;
                    b = this.c.b(str, uid, vVar, setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (u) setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$0;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.getClass();
                        this.a(new x(booleanValue));
                        return zy11Var;
                    }
                    o oVar2 = (o) setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$1;
                    u uVar = (u) setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$0;
                    kotlin.b.b(obj);
                    oVar = oVar2;
                    this = uVar;
                    b = obj;
                }
                if (((com.yandex.passport.internal.ui.challenge.h) b) instanceof com.yandex.passport.internal.ui.challenge.f) {
                    this.getClass();
                    this.a(new x(false));
                    return zy11Var;
                }
                Uid uid2 = oVar.a;
                setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$0 = this;
                setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.L$1 = null;
                setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.label = 2;
                obj = this.l(uid2, setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1);
            }
        }
        setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1 = new SetCurrentStoreFactory$ExecutorImpl$processReturnUrl$1(this, continuationImpl);
        Object obj2 = setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentStoreFactory$ExecutorImpl$processReturnUrl$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((com.yandex.passport.internal.ui.challenge.h) b) instanceof com.yandex.passport.internal.ui.challenge.f) {
        }
    }
}
