package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class j extends com.yandex.passport.common.mvi.g {
    public final Uid c;
    public final AppTheme d;
    public final com.yandex.passport.internal.core.accounts.d e;
    public final com.yandex.passport.internal.usecase.ui.r f;
    public final com.yandex.passport.internal.account.b g;
    public final com.yandex.passport.internal.usecase.ui.t h;
    public final com.yandex.passport.internal.report.reporters.i1 i;

    public j(Uid uid, AppTheme appTheme, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.usecase.ui.r rVar, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.usecase.ui.t tVar, com.yandex.passport.internal.report.reporters.i1 i1Var) {
        this.c = uid;
        this.d = appTheme;
        this.e = dVar;
        this.f = rVar;
        this.g = bVar;
        this.h = tVar;
        this.i = i1Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        Object p;
        if (jl40.l((h) obj, h.a)) {
            return (jl40.l(g(), new u(null, null)) && (p = p((ContinuationImpl) continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? p : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        d0 d0Var = (d0) obj;
        boolean z = d0Var instanceof v;
        zy11 zy11Var = zy11.a;
        if (z) {
            m();
            return zy11Var;
        }
        if (d0Var instanceof w) {
            a(new l(i1.a));
            return zy11Var;
        }
        if (d0Var instanceof x) {
            Object p = p((ContinuationImpl) continuation);
            if (p == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return p;
            }
        } else {
            if (d0Var instanceof z) {
                a(new l(new h1(((z) d0Var).a)));
                return zy11Var;
            }
            if (d0Var instanceof y) {
                Object n = n((ContinuationImpl) continuation);
                if (n == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return n;
                }
            } else {
                if (d0Var instanceof a0) {
                    com.yandex.passport.sloth.i0 i0Var = ((a0) d0Var).a;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth external request: " + i0Var, 8);
                    }
                    if (i0Var instanceof com.yandex.passport.sloth.c0) {
                        f(new s(this.c, false));
                    } else if (i0Var instanceof com.yandex.passport.sloth.a0) {
                        Throwable th = ((com.yandex.passport.sloth.a0) i0Var).a;
                        if (!com.yandex.passport.internal.ui.sloth.e.j(th)) {
                            a(new l(new h1(th)));
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Internet connection is lost in Sloth.", 8);
                        }
                    } else {
                        this.i.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.DELETE_FOREVER_ACCOUNT);
                    }
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return zy11Var;
                }
                if (!(d0Var instanceof b0)) {
                    if (!(d0Var instanceof c0)) {
                        w511.b();
                        return null;
                    }
                    int i = i.b[((c0) d0Var).a.ordinal()];
                    if (i == 1 || i == 2) {
                        m();
                    } else if (i != 3) {
                        w511.b();
                        return null;
                    }
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return zy11Var;
                }
                Object o = o(((b0) d0Var).a, (ContinuationImpl) continuation);
                if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return o;
                }
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new l(new h1(th)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ModernAccount modernAccount, ContinuationImpl continuationImpl) {
        DeleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1 deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DeleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1) {
            deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1 = (DeleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1) continuationImpl;
            int i2 = deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.ui.r rVar = this.f;
                    deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.L$0 = this;
                    deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.L$1 = modernAccount;
                    deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.label = 1;
                    if (rVar.a(modernAccount, deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    modernAccount = (ModernAccount) deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.L$1;
                    this = (j) deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.L$0;
                    kotlin.b.b(obj);
                }
                this.g.a(modernAccount.getUid());
                Object obj2 = zy11.a;
                a = Result.a(obj2);
                if (a == null) {
                    return new h1(a);
                }
                return j1.a;
            }
        }
        deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1 = new DeleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1(this, continuationImpl);
        Object obj3 = deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteAccountStoreFactory$ExecutorImpl$finishSuccessDelete$1.label;
        if (i != 0) {
        }
        this.g.a(modernAccount.getUid());
        Object obj22 = zy11.a;
        a = Result.a(obj22);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Uid uid, ContinuationImpl continuationImpl) {
        DeleteAccountStoreFactory$ExecutorImpl$getAccount$1 deleteAccountStoreFactory$ExecutorImpl$getAccount$1;
        int i;
        ModernAccount modernAccount;
        if (continuationImpl instanceof DeleteAccountStoreFactory$ExecutorImpl$getAccount$1) {
            deleteAccountStoreFactory$ExecutorImpl$getAccount$1 = (DeleteAccountStoreFactory$ExecutorImpl$getAccount$1) continuationImpl;
            int i2 = deleteAccountStoreFactory$ExecutorImpl$getAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteAccountStoreFactory$ExecutorImpl$getAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteAccountStoreFactory$ExecutorImpl$getAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteAccountStoreFactory$ExecutorImpl$getAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    DeleteAccountStoreFactory$ExecutorImpl$getAccount$2 deleteAccountStoreFactory$ExecutorImpl$getAccount$2 = new DeleteAccountStoreFactory$ExecutorImpl$getAccount$2(this, uid, null);
                    deleteAccountStoreFactory$ExecutorImpl$getAccount$1.L$0 = uid;
                    deleteAccountStoreFactory$ExecutorImpl$getAccount$1.label = 1;
                    obj = tje.k0(mdhVar, deleteAccountStoreFactory$ExecutorImpl$getAccount$2, deleteAccountStoreFactory$ExecutorImpl$getAccount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uid = (Uid) deleteAccountStoreFactory$ExecutorImpl$getAccount$1.L$0;
                    kotlin.b.b(obj);
                }
                modernAccount = (ModernAccount) obj;
                if (modernAccount == null) {
                    return modernAccount;
                }
                throw new PassportAccountNotFoundException(com.yandex.passport.internal.util.p.A(uid));
            }
        }
        deleteAccountStoreFactory$ExecutorImpl$getAccount$1 = new DeleteAccountStoreFactory$ExecutorImpl$getAccount$1(this, continuationImpl);
        Object obj2 = deleteAccountStoreFactory$ExecutorImpl$getAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteAccountStoreFactory$ExecutorImpl$getAccount$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        if (modernAccount == null) {
        }
    }

    public final void m() {
        a(new l(g1.a));
        a(new k(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r2 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        DeleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1 deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1;
        int i;
        ModernAccount modernAccount;
        Object a;
        Object value;
        j jVar;
        Object obj;
        Throwable a2;
        if (continuationImpl instanceof DeleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1) {
            deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1 = (DeleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1) continuationImpl;
            int i2 = deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a(new k(null));
                    deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0 = this;
                    deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label = 1;
                    obj2 = l(this.c, deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = (j) deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$2;
                            obj = deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$1;
                            jVar = (j) deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0;
                            kotlin.b.b(obj2);
                            this.a(new l((k1) obj2));
                            this = jVar;
                            value = obj;
                            a2 = Result.a(value);
                            if (a2 != null) {
                                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onFailure " + a2.getMessage(), 8);
                                }
                                if (a2 instanceof InvalidTokenException) {
                                    this.f(new s(this.c, true));
                                } else {
                                    this.a(new l(new h1(a2)));
                                }
                            }
                            return zy11.a;
                        }
                        ModernAccount modernAccount2 = (ModernAccount) deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$1;
                        j jVar2 = (j) deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0;
                        kotlin.b.b(obj2);
                        modernAccount = modernAccount2;
                        this = jVar2;
                        a = obj2;
                        value = ((Result) a).getValue();
                        if (!(value instanceof Result.Failure)) {
                            deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0 = this;
                            deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$1 = value;
                            deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$2 = this;
                            deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label = 3;
                            obj2 = this.k(modernAccount, deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1);
                            if (obj2 != coroutineSingletons) {
                                jVar = this;
                                obj = value;
                                this.a(new l((k1) obj2));
                                this = jVar;
                                value = obj;
                            }
                            return coroutineSingletons;
                        }
                        a2 = Result.a(value);
                        if (a2 != null) {
                        }
                        return zy11.a;
                    }
                    this = (j) deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0;
                    kotlin.b.b(obj2);
                }
                modernAccount = (ModernAccount) obj2;
                com.yandex.passport.internal.usecase.ui.t tVar = this.h;
                com.yandex.passport.internal.usecase.ui.s sVar = new com.yandex.passport.internal.usecase.ui.s(modernAccount);
                deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0 = this;
                deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$1 = modernAccount;
                deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label = 2;
                a = tVar.a(sVar, deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1);
            }
        }
        deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1 = new DeleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1(this, continuationImpl);
        Object obj22 = deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj22;
        com.yandex.passport.internal.usecase.ui.t tVar2 = this.h;
        com.yandex.passport.internal.usecase.ui.s sVar2 = new com.yandex.passport.internal.usecase.ui.s(modernAccount);
        deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$0 = this;
        deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.L$1 = modernAccount;
        deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1.label = 2;
        a = tVar2.a(sVar2, deleteAccountStoreFactory$ExecutorImpl$onPhonishDelete$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(com.yandex.passport.sloth.a1 a1Var, ContinuationImpl continuationImpl) {
        DeleteAccountStoreFactory$ExecutorImpl$onSlothResult$1 deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1;
        int i;
        if (continuationImpl instanceof DeleteAccountStoreFactory$ExecutorImpl$onSlothResult$1) {
            deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1 = (DeleteAccountStoreFactory$ExecutorImpl$onSlothResult$1) continuationImpl;
            int i2 = deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth result: " + a1Var, 8);
                    }
                    if (jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                        m();
                    } else if (jl40.l(a1Var, com.yandex.passport.sloth.j0.a)) {
                        deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.L$0 = this;
                        deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label = 1;
                        obj = l(this.c, deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1);
                    } else {
                        this.i.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.DELETE_FOREVER_ACCOUNT);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (j) deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.L$0;
                    kotlin.b.b(obj);
                    this.a(new l((k1) obj));
                    return zy11.a;
                }
                this = (j) deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.L$0;
                kotlin.b.b(obj);
                deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.L$0 = this;
                deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label = 2;
                obj = this.k((ModernAccount) obj, deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1);
            }
        }
        deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1 = new DeleteAccountStoreFactory$ExecutorImpl$onSlothResult$1(this, continuationImpl);
        Object obj2 = deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label;
        if (i != 0) {
        }
        deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.L$0 = this;
        deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1.label = 2;
        obj2 = this.k((ModernAccount) obj2, deleteAccountStoreFactory$ExecutorImpl$onSlothResult$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(ContinuationImpl continuationImpl) {
        DeleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1 deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1;
        int i;
        ModernAccount modernAccount;
        r qVar;
        if (continuationImpl instanceof DeleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1) {
            deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1 = (DeleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1) continuationImpl;
            int i2 = deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.L$0 = this;
                    deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.label = 1;
                    obj = l(this.c, deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (j) deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.L$0;
                    kotlin.b.b(obj);
                }
                modernAccount = (ModernAccount) obj;
                if (i.a[modernAccount.getAccountType().ordinal()] != 1) {
                    qVar = p.a;
                } else {
                    qVar = new q(new SlothParams(new com.yandex.passport.sloth.data.i(modernAccount.getLocationId(), this.c, com.yandex.passport.internal.properties.u.X(this.d)), this.c.getEnvironment(), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null));
                }
                this.a(new k(qVar));
                return zy11.a;
            }
        }
        deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1 = new DeleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1(this, continuationImpl);
        Object obj2 = deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteAccountStoreFactory$ExecutorImpl$showDeleteUi$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        if (i.a[modernAccount.getAccountType().ordinal()] != 1) {
        }
        this.a(new k(qVar));
        return zy11.a;
    }
}
