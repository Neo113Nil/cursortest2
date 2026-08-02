package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.usecase.v0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class t extends com.yandex.passport.internal.ui.challenge.o {
    public final v0 f;
    public final LogoutBehaviour g;
    public final com.yandex.passport.internal.usecase.q h;
    public final com.yandex.passport.internal.usecase.ui.r i;

    public t(com.yandex.passport.internal.ui.challenge.k kVar, g0 g0Var, com.yandex.passport.internal.ui.challenge.n nVar, v0 v0Var, LogoutBehaviour logoutBehaviour, com.yandex.passport.internal.usecase.q qVar, com.yandex.passport.internal.usecase.ui.r rVar) {
        super(kVar, g0Var, nVar, true);
        this.f = v0Var;
        this.g = logoutBehaviour;
        this.h = qVar;
        this.i = rVar;
    }

    @Override // com.yandex.passport.internal.ui.challenge.o
    public final Uid d() {
        return ((com.yandex.passport.internal.ui.challenge.k) this.a).c;
    }

    @Override // com.yandex.passport.internal.ui.challenge.o
    public final Object e(ContinuationImpl continuationImpl) {
        int i = s.a[this.g.ordinal()];
        if (i == 1) {
            return g(continuationImpl);
        }
        if (i == 2) {
            return h(continuationImpl);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        LogoutModel$dropClientToken$1 logoutModel$dropClientToken$1;
        int i;
        Object value;
        if (continuationImpl instanceof LogoutModel$dropClientToken$1) {
            logoutModel$dropClientToken$1 = (LogoutModel$dropClientToken$1) continuationImpl;
            int i2 = logoutModel$dropClientToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutModel$dropClientToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutModel$dropClientToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutModel$dropClientToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, "Executing logoutUseCase", 10);
                    }
                    Uid d = d();
                    logoutModel$dropClientToken$1.L$0 = this;
                    logoutModel$dropClientToken$1.label = 1;
                    obj = this.f.a(d, logoutModel$dropClientToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (t) logoutModel$dropClientToken$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.a(value) == null) {
                    this.getClass();
                    return com.yandex.passport.internal.ui.challenge.o.c();
                }
                this.getClass();
                return new com.yandex.passport.internal.ui.challenge.r(true);
            }
        }
        logoutModel$dropClientToken$1 = new LogoutModel$dropClientToken$1(this, continuationImpl);
        Object obj2 = logoutModel$dropClientToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutModel$dropClientToken$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (Result.a(value) == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(2:19|20))(2:22|23))(1:24))(3:33|(1:35)|36)|25|(3:27|(1:29)|30)|14|(0)(0)))|40|6|7|(0)(0)|25|(0)|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r2.a(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        r9 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0090, B:27:0x0070, B:29:0x007e, B:30:0x0083), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        LogoutModel$dropXToken$1 logoutModel$dropXToken$1;
        int i;
        Object failure;
        if (continuationImpl instanceof LogoutModel$dropXToken$1) {
            logoutModel$dropXToken$1 = (LogoutModel$dropXToken$1) continuationImpl;
            int i2 = logoutModel$dropXToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutModel$dropXToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutModel$dropXToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutModel$dropXToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, "Executing findMasterAccountUseCase", 10);
                    }
                    Uid d = d();
                    logoutModel$dropXToken$1.L$0 = this;
                    logoutModel$dropXToken$1.label = 1;
                    obj = this.h.a(d, logoutModel$dropXToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (t) logoutModel$dropXToken$1.L$0;
                        kotlin.b.b(obj);
                        failure = zy11.a;
                        if (Result.a(failure) != null) {
                            this.getClass();
                            return com.yandex.passport.internal.ui.challenge.o.c();
                        }
                        this.getClass();
                        return new com.yandex.passport.internal.ui.challenge.r(true);
                    }
                    this = (t) logoutModel$dropXToken$1.L$0;
                    kotlin.b.b(obj);
                }
                failure = ((Result) obj).getValue();
                if (!(failure instanceof Result.Failure)) {
                    ModernAccount modernAccount = (ModernAccount) failure;
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel2, null, "Executing deleteAccountUseCase", 10);
                    }
                    com.yandex.passport.internal.usecase.ui.r rVar = this.i;
                    logoutModel$dropXToken$1.L$0 = this;
                    logoutModel$dropXToken$1.label = 2;
                }
                if (Result.a(failure) != null) {
                }
            }
        }
        logoutModel$dropXToken$1 = new LogoutModel$dropXToken$1(this, continuationImpl);
        Object obj2 = logoutModel$dropXToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutModel$dropXToken$1.label;
        if (i != 0) {
        }
        failure = ((Result) obj2).getValue();
        if (!(failure instanceof Result.Failure)) {
        }
        if (Result.a(failure) != null) {
        }
    }
}
