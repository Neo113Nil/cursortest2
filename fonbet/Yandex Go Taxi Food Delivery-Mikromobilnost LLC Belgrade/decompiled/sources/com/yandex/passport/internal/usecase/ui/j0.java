package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class j0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.usecase.y b;
    public final com.yandex.passport.common.ui.lang.b c;
    public final com.yandex.passport.internal.core.tokens.b d;
    public final m0 e;

    public j0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.core.tokens.b bVar2, m0 m0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = yVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = m0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r0 != r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k0 k0Var, Continuation continuation) {
        ScopeAuthUrlUseCase$run$1 scopeAuthUrlUseCase$run$1;
        int i;
        Uid uid;
        Locale locale;
        com.yandex.passport.internal.usecase.y yVar;
        Throwable th;
        Object failure;
        TimeoutCancellationException e;
        j0 j0Var = this;
        k0 k0Var2 = k0Var;
        try {
            if (continuation instanceof ScopeAuthUrlUseCase$run$1) {
                scopeAuthUrlUseCase$run$1 = (ScopeAuthUrlUseCase$run$1) continuation;
                int i2 = scopeAuthUrlUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scopeAuthUrlUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scopeAuthUrlUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scopeAuthUrlUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "selectedUid " + k0Var2.a + " environment " + k0Var2.a.getEnvironment(), 8);
                        }
                        try {
                            com.yandex.passport.internal.usecase.y yVar2 = j0Var.b;
                            Uid uid2 = k0Var2.a;
                            Locale b = ((com.yandex.passport.internal.ui.lang.a) j0Var.c).b();
                            m0 m0Var = j0Var.e;
                            scopeAuthUrlUseCase$run$1.L$0 = j0Var;
                            scopeAuthUrlUseCase$run$1.L$1 = k0Var2;
                            scopeAuthUrlUseCase$run$1.L$2 = b;
                            scopeAuthUrlUseCase$run$1.L$3 = uid2;
                            scopeAuthUrlUseCase$run$1.L$4 = yVar2;
                            scopeAuthUrlUseCase$run$1.label = 1;
                            Object a = m0Var.a(k0Var2, scopeAuthUrlUseCase$run$1);
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            uid = uid2;
                            locale = b;
                            yVar = yVar2;
                            obj = a;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            failure = new Result.Failure(e);
                            if (Result.a(failure) != null) {
                            }
                            return new Result(failure);
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            if (Result.a(failure) != null) {
                            }
                            return new Result(failure);
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k0 k0Var3 = (k0) scopeAuthUrlUseCase$run$1.L$1;
                            j0 j0Var2 = (j0) scopeAuthUrlUseCase$run$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                k0Var2 = k0Var3;
                                j0Var = j0Var2;
                                Object value = ((Result) obj).getValue();
                                kotlin.b.b(value);
                                failure = new com.yandex.passport.common.url.b(((com.yandex.passport.common.url.b) value).a);
                            } catch (TimeoutCancellationException e3) {
                                e = e3;
                                k0Var2 = k0Var3;
                                j0Var = j0Var2;
                                failure = new Result.Failure(e);
                                if (Result.a(failure) != null) {
                                }
                                return new Result(failure);
                            } catch (Throwable th3) {
                                th = th3;
                                k0Var2 = k0Var3;
                                j0Var = j0Var2;
                                failure = new Result.Failure(th);
                                if (Result.a(failure) != null) {
                                }
                                return new Result(failure);
                            }
                            if (Result.a(failure) != null) {
                                com.yandex.passport.internal.core.tokens.b bVar = j0Var.d;
                                ModernAccount e4 = bVar.b.a().e(k0Var2.a);
                                if (e4 != null) {
                                    bVar.c.a(e4);
                                }
                            }
                            return new Result(failure);
                        }
                        com.yandex.passport.internal.usecase.y yVar3 = (com.yandex.passport.internal.usecase.y) scopeAuthUrlUseCase$run$1.L$4;
                        Uid uid3 = (Uid) scopeAuthUrlUseCase$run$1.L$3;
                        Locale locale2 = (Locale) scopeAuthUrlUseCase$run$1.L$2;
                        k0 k0Var4 = (k0) scopeAuthUrlUseCase$run$1.L$1;
                        j0 j0Var3 = (j0) scopeAuthUrlUseCase$run$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            uid = uid3;
                            locale = locale2;
                            k0Var2 = k0Var4;
                            yVar = yVar3;
                            j0Var = j0Var3;
                        } catch (TimeoutCancellationException e5) {
                            e = e5;
                            k0Var2 = k0Var4;
                            j0Var = j0Var3;
                            failure = new Result.Failure(e);
                            if (Result.a(failure) != null) {
                            }
                            return new Result(failure);
                        } catch (Throwable th4) {
                            th = th4;
                            k0Var2 = k0Var4;
                            j0Var = j0Var3;
                            failure = new Result.Failure(th);
                            if (Result.a(failure) != null) {
                            }
                            return new Result(failure);
                        }
                    }
                    Object value2 = ((Result) obj).getValue();
                    kotlin.b.b(value2);
                    com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(uid, locale, ((com.yandex.passport.common.url.b) value2).a, (String) null, (Map) null, (FrontendUrlType) null, 120);
                    scopeAuthUrlUseCase$run$1.L$0 = j0Var;
                    scopeAuthUrlUseCase$run$1.L$1 = k0Var2;
                    scopeAuthUrlUseCase$run$1.L$2 = null;
                    scopeAuthUrlUseCase$run$1.L$3 = null;
                    scopeAuthUrlUseCase$run$1.L$4 = null;
                    scopeAuthUrlUseCase$run$1.label = 2;
                    obj = yVar.a(wVar, scopeAuthUrlUseCase$run$1);
                }
            }
            if (i != 0) {
            }
            Object value22 = ((Result) obj).getValue();
            kotlin.b.b(value22);
            com.yandex.passport.internal.usecase.w wVar2 = new com.yandex.passport.internal.usecase.w(uid, locale, ((com.yandex.passport.common.url.b) value22).a, (String) null, (Map) null, (FrontendUrlType) null, 120);
            scopeAuthUrlUseCase$run$1.L$0 = j0Var;
            scopeAuthUrlUseCase$run$1.L$1 = k0Var2;
            scopeAuthUrlUseCase$run$1.L$2 = null;
            scopeAuthUrlUseCase$run$1.L$3 = null;
            scopeAuthUrlUseCase$run$1.L$4 = null;
            scopeAuthUrlUseCase$run$1.label = 2;
            obj = yVar.a(wVar2, scopeAuthUrlUseCase$run$1);
        } catch (CancellationException e6) {
            throw e6;
        }
        scopeAuthUrlUseCase$run$1 = new ScopeAuthUrlUseCase$run$1(j0Var, (ContinuationImpl) continuation);
        Object obj2 = scopeAuthUrlUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scopeAuthUrlUseCase$run$1.label;
    }
}
