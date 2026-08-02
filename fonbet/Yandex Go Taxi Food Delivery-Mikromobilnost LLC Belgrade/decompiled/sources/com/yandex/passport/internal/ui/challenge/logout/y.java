package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.usecase.v0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class y extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.internal.ui.challenge.i c;
    public final v0 d;
    public final com.yandex.passport.internal.usecase.q e;
    public final com.yandex.passport.internal.usecase.ui.r f;
    public com.yandex.passport.internal.ui.challenge.v g;

    public y(com.yandex.passport.internal.ui.challenge.i iVar, v0 v0Var, com.yandex.passport.internal.usecase.q qVar, com.yandex.passport.internal.usecase.ui.r rVar) {
        this.c = iVar;
        this.d = v0Var;
        this.e = qVar;
        this.f = rVar;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        w wVar = (w) obj;
        if (wVar != null) {
            Object k = k(wVar.a, wVar.c, wVar.b, (ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        q qVar = (q) obj;
        if (qVar != null) {
            Object m = m(qVar.a, (ContinuationImpl) continuation);
            return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new a0(th));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Uid uid, LogoutBehaviour logoutBehaviour, AppTheme appTheme, ContinuationImpl continuationImpl) {
        LogoutStoreFactory$ExecutorImpl$onLoadContent$1 logoutStoreFactory$ExecutorImpl$onLoadContent$1;
        int i;
        com.yandex.passport.internal.ui.challenge.h hVar;
        if (continuationImpl instanceof LogoutStoreFactory$ExecutorImpl$onLoadContent$1) {
            logoutStoreFactory$ExecutorImpl$onLoadContent$1 = (LogoutStoreFactory$ExecutorImpl$onLoadContent$1) continuationImpl;
            int i2 = logoutStoreFactory$ExecutorImpl$onLoadContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutStoreFactory$ExecutorImpl$onLoadContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutStoreFactory$ExecutorImpl$onLoadContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutStoreFactory$ExecutorImpl$onLoadContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a(new z(new n(uid, logoutBehaviour)));
                    logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$0 = this;
                    logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$1 = uid;
                    logoutStoreFactory$ExecutorImpl$onLoadContent$1.label = 1;
                    obj = this.c.a(uid, appTheme, logoutStoreFactory$ExecutorImpl$onLoadContent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (y) logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$0;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.getClass();
                        this.a(new b0(booleanValue));
                        return zy11.a;
                    }
                    uid = (Uid) logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$1;
                    this = (y) logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$0;
                    kotlin.b.b(obj);
                }
                hVar = (com.yandex.passport.internal.ui.challenge.h) obj;
                if (!(hVar instanceof com.yandex.passport.internal.ui.challenge.e)) {
                    this.getClass();
                    this.a(new b0(false));
                } else if (hVar instanceof com.yandex.passport.internal.ui.challenge.f) {
                    logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$0 = this;
                    logoutStoreFactory$ExecutorImpl$onLoadContent$1.L$1 = null;
                    logoutStoreFactory$ExecutorImpl$onLoadContent$1.label = 2;
                    obj = this.l(uid, logoutStoreFactory$ExecutorImpl$onLoadContent$1);
                } else {
                    if (!(hVar instanceof com.yandex.passport.internal.ui.challenge.g)) {
                        w511.b();
                        return null;
                    }
                    new com.yandex.passport.internal.ui.challenge.webview.l();
                    com.yandex.passport.internal.ui.challenge.v vVar = ((com.yandex.passport.internal.ui.challenge.g) hVar).a;
                    this.a(new c0(com.yandex.passport.internal.ui.challenge.webview.l.a(vVar)));
                    this.g = vVar;
                }
                return zy11.a;
            }
        }
        logoutStoreFactory$ExecutorImpl$onLoadContent$1 = new LogoutStoreFactory$ExecutorImpl$onLoadContent$1(this, continuationImpl);
        Object obj2 = logoutStoreFactory$ExecutorImpl$onLoadContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutStoreFactory$ExecutorImpl$onLoadContent$1.label;
        if (i != 0) {
        }
        hVar = (com.yandex.passport.internal.ui.challenge.h) obj2;
        if (!(hVar instanceof com.yandex.passport.internal.ui.challenge.e)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        if (r11 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        if (r11 == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Uid uid, ContinuationImpl continuationImpl) {
        LogoutStoreFactory$ExecutorImpl$performChallengedAction$1 logoutStoreFactory$ExecutorImpl$performChallengedAction$1;
        int i;
        LogoutBehaviour logoutBehaviour;
        Object value;
        Throwable th;
        Uid uid2;
        ModernAccount modernAccount;
        com.yandex.passport.internal.usecase.ui.r rVar;
        Throwable a;
        if (continuationImpl instanceof LogoutStoreFactory$ExecutorImpl$performChallengedAction$1) {
            logoutStoreFactory$ExecutorImpl$performChallengedAction$1 = (LogoutStoreFactory$ExecutorImpl$performChallengedAction$1) continuationImpl;
            int i2 = logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutStoreFactory$ExecutorImpl$performChallengedAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = ((p) g()).a;
                    if (nVar == null || (logoutBehaviour = nVar.b) == null) {
                        return Boolean.FALSE;
                    }
                    int i3 = x.a[logoutBehaviour.ordinal()];
                    if (i3 == 1) {
                        LogLevel logLevel = LogLevel.DEBUG;
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(logLevel, null, "Executing logoutUseCase", 10);
                        }
                        logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$0 = uid;
                        logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label = 1;
                        obj = this.d.a(uid, logoutStoreFactory$ExecutorImpl$performChallengedAction$1);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        LogLevel logLevel2 = LogLevel.DEBUG;
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(logLevel2, null, "Executing findMasterAccountUseCase", 10);
                        }
                        logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$0 = this;
                        logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$1 = uid;
                        logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label = 2;
                        obj = this.e.a(uid, logoutStoreFactory$ExecutorImpl$performChallengedAction$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    uid = (Uid) logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$0;
                    kotlin.b.b(obj);
                    value = ((Result) obj).getValue();
                } else if (i == 2) {
                    uid = (Uid) logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$1;
                    this = (y) logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$0;
                    kotlin.b.b(obj);
                    value = ((Result) obj).getValue();
                    if (!(value instanceof Result.Failure)) {
                        try {
                            modernAccount = (ModernAccount) value;
                            LogLevel logLevel3 = LogLevel.DEBUG;
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(logLevel3, null, "Executing deleteAccountUseCase", 10);
                            }
                            rVar = this.f;
                            logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$0 = uid;
                            logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$1 = null;
                            logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label = 3;
                        } catch (Throwable th2) {
                            Uid uid3 = uid;
                            th = th2;
                            uid2 = uid3;
                            value = new Result.Failure(th);
                            uid = uid2;
                            a = Result.a(value);
                            if (a != null) {
                            }
                        }
                        if (rVar.a(modernAccount, logoutStoreFactory$ExecutorImpl$performChallengedAction$1) != coroutineSingletons) {
                            uid2 = uid;
                            value = zy11.a;
                            uid = uid2;
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uid2 = (Uid) logoutStoreFactory$ExecutorImpl$performChallengedAction$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        value = zy11.a;
                    } catch (Throwable th3) {
                        th = th3;
                        value = new Result.Failure(th);
                        uid = uid2;
                        a = Result.a(value);
                        if (a != null) {
                        }
                    }
                    uid = uid2;
                }
                a = Result.a(value);
                if (a != null) {
                    return Boolean.TRUE;
                }
                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error performing challenged action for uid: " + uid, a);
                }
                return Boolean.FALSE;
            }
        }
        logoutStoreFactory$ExecutorImpl$performChallengedAction$1 = new LogoutStoreFactory$ExecutorImpl$performChallengedAction$1(this, continuationImpl);
        Object obj2 = logoutStoreFactory$ExecutorImpl$performChallengedAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutStoreFactory$ExecutorImpl$performChallengedAction$1.label;
        if (i != 0) {
        }
        a = Result.a(value);
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
        LogoutStoreFactory$ExecutorImpl$processReturnUrl$1 logoutStoreFactory$ExecutorImpl$processReturnUrl$1;
        int i;
        n nVar;
        com.yandex.passport.internal.ui.challenge.v vVar;
        Object b;
        if (continuationImpl instanceof LogoutStoreFactory$ExecutorImpl$processReturnUrl$1) {
            logoutStoreFactory$ExecutorImpl$processReturnUrl$1 = (LogoutStoreFactory$ExecutorImpl$processReturnUrl$1) continuationImpl;
            int i2 = logoutStoreFactory$ExecutorImpl$processReturnUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutStoreFactory$ExecutorImpl$processReturnUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutStoreFactory$ExecutorImpl$processReturnUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutStoreFactory$ExecutorImpl$processReturnUrl$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a(new c0(null));
                    nVar = ((p) g()).a;
                    if (nVar == null || (vVar = this.g) == null) {
                        return zy11Var;
                    }
                    Uid uid = nVar.a;
                    logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$0 = this;
                    logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$1 = nVar;
                    logoutStoreFactory$ExecutorImpl$processReturnUrl$1.label = 1;
                    b = this.c.b(str, uid, vVar, logoutStoreFactory$ExecutorImpl$processReturnUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (y) logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$0;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.getClass();
                        this.a(new b0(booleanValue));
                        return zy11Var;
                    }
                    n nVar2 = (n) logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$1;
                    y yVar = (y) logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$0;
                    kotlin.b.b(obj);
                    nVar = nVar2;
                    this = yVar;
                    b = obj;
                }
                if (((com.yandex.passport.internal.ui.challenge.h) b) instanceof com.yandex.passport.internal.ui.challenge.f) {
                    this.getClass();
                    this.a(new b0(false));
                    return zy11Var;
                }
                Uid uid2 = nVar.a;
                logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$0 = this;
                logoutStoreFactory$ExecutorImpl$processReturnUrl$1.L$1 = null;
                logoutStoreFactory$ExecutorImpl$processReturnUrl$1.label = 2;
                obj = this.l(uid2, logoutStoreFactory$ExecutorImpl$processReturnUrl$1);
            }
        }
        logoutStoreFactory$ExecutorImpl$processReturnUrl$1 = new LogoutStoreFactory$ExecutorImpl$processReturnUrl$1(this, continuationImpl);
        Object obj2 = logoutStoreFactory$ExecutorImpl$processReturnUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutStoreFactory$ExecutorImpl$processReturnUrl$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((com.yandex.passport.internal.ui.challenge.h) b) instanceof com.yandex.passport.internal.ui.challenge.f) {
        }
    }
}
