package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class y0 extends com.yandex.passport.internal.ui.challenge.o {
    public final com.yandex.passport.internal.usecase.ui.t f;
    public final com.yandex.passport.internal.usecase.ui.r g;
    public final com.yandex.passport.internal.account.b h;
    public final kotlinx.coroutines.flow.n0 i;
    public final ModernAccount j;

    public y0(com.yandex.passport.internal.ui.challenge.k kVar, f1 f1Var, com.yandex.passport.internal.ui.challenge.n nVar, boolean z, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.usecase.ui.t tVar, com.yandex.passport.internal.usecase.ui.r rVar, com.yandex.passport.internal.account.b bVar) {
        super(kVar, f1Var, nVar, z);
        this.f = tVar;
        this.g = rVar;
        this.h = bVar;
        com.yandex.passport.internal.util.p.s(ds31.a(f1Var));
        this.i = ffx.c(1, 0, null, 6);
        Uid d = d();
        ModernAccount e = dVar.a().e(d);
        if (e == null) {
            throw new PassportAccountNotFoundException(d);
        }
        this.j = e;
    }

    @Override // com.yandex.passport.internal.ui.challenge.o
    public final Uid d() {
        return ((com.yandex.passport.internal.ui.challenge.k) this.a).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.internal.ui.challenge.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        DeleteForeverModel$performChallengedAction$1 deleteForeverModel$performChallengedAction$1;
        int i;
        if (continuationImpl instanceof DeleteForeverModel$performChallengedAction$1) {
            deleteForeverModel$performChallengedAction$1 = (DeleteForeverModel$performChallengedAction$1) continuationImpl;
            int i2 = deleteForeverModel$performChallengedAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverModel$performChallengedAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteForeverModel$performChallengedAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverModel$performChallengedAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "performChallengedAction", 8);
                    }
                    deleteForeverModel$performChallengedAction$1.label = 1;
                    if (g(deleteForeverModel$performChallengedAction$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new com.yandex.passport.internal.ui.challenge.r(true);
            }
        }
        deleteForeverModel$performChallengedAction$1 = new DeleteForeverModel$performChallengedAction$1(this, continuationImpl);
        Object obj3 = deleteForeverModel$performChallengedAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverModel$performChallengedAction$1.label;
        if (i != 0) {
        }
        return new com.yandex.passport.internal.ui.challenge.r(true);
    }

    public final Object g(ContinuationImpl continuationImpl) {
        int i = x0.a[this.j.getAccountType().ordinal()];
        zy11 zy11Var = zy11.a;
        kotlinx.coroutines.flow.n0 n0Var = this.i;
        if (i == 1) {
            Object emit = n0Var.emit(r0.a, continuationImpl);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
        } else {
            Object emit2 = n0Var.emit(v0.a, continuationImpl);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (emit2 != coroutineSingletons) {
                emit2 = zy11Var;
            }
            if (emit2 == coroutineSingletons) {
                return emit2;
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        DeleteForeverModel$finishSuccessDelete$1 deleteForeverModel$finishSuccessDelete$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DeleteForeverModel$finishSuccessDelete$1) {
            deleteForeverModel$finishSuccessDelete$1 = (DeleteForeverModel$finishSuccessDelete$1) continuationImpl;
            int i2 = deleteForeverModel$finishSuccessDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverModel$finishSuccessDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteForeverModel$finishSuccessDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverModel$finishSuccessDelete$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.ui.r rVar = this.g;
                    ModernAccount modernAccount = this.j;
                    deleteForeverModel$finishSuccessDelete$1.L$0 = this;
                    deleteForeverModel$finishSuccessDelete$1.label = 1;
                    if (rVar.a(modernAccount, deleteForeverModel$finishSuccessDelete$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y0) deleteForeverModel$finishSuccessDelete$1.L$0;
                    kotlin.b.b(obj);
                }
                this.h.a(this.d());
                Object obj2 = zy11.a;
                a = Result.a(obj2);
                if (a == null) {
                    return new com.yandex.passport.api.q0(a);
                }
                return com.yandex.passport.api.p0.c;
            }
        }
        deleteForeverModel$finishSuccessDelete$1 = new DeleteForeverModel$finishSuccessDelete$1(this, continuationImpl);
        Object obj3 = deleteForeverModel$finishSuccessDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverModel$finishSuccessDelete$1.label;
        if (i != 0) {
        }
        this.h.a(this.d());
        Object obj22 = zy11.a;
        a = Result.a(obj22);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        if (r2.emit(r4, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        if (r11.emit(r5, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        DeleteForeverModel$onPhonishDelete$1 deleteForeverModel$onPhonishDelete$1;
        int i;
        Object value;
        y0 y0Var;
        Object obj;
        Throwable a;
        if (continuationImpl instanceof DeleteForeverModel$onPhonishDelete$1) {
            deleteForeverModel$onPhonishDelete$1 = (DeleteForeverModel$onPhonishDelete$1) continuationImpl;
            int i2 = deleteForeverModel$onPhonishDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverModel$onPhonishDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deleteForeverModel$onPhonishDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverModel$onPhonishDelete$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.usecase.ui.s sVar = new com.yandex.passport.internal.usecase.ui.s(this.j);
                    deleteForeverModel$onPhonishDelete$1.L$0 = this;
                    deleteForeverModel$onPhonishDelete$1.label = 1;
                    obj2 = this.f.a(sVar, deleteForeverModel$onPhonishDelete$1);
                } else if (i == 1) {
                    this = (y0) deleteForeverModel$onPhonishDelete$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 || i == 5) {
                                kotlin.b.b(obj2);
                                return zy11.a;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = deleteForeverModel$onPhonishDelete$1.L$1;
                        y0Var = (y0) deleteForeverModel$onPhonishDelete$1.L$0;
                        kotlin.b.b(obj2);
                        value = obj;
                        this = y0Var;
                        a = Result.a(value);
                        if (a != null) {
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onFailure " + a.getMessage(), 8);
                            }
                            if (a instanceof InvalidTokenException) {
                                kotlinx.coroutines.flow.n0 n0Var = this.i;
                                t0 t0Var = new t0(this.d(), true);
                                deleteForeverModel$onPhonishDelete$1.L$0 = value;
                                deleteForeverModel$onPhonishDelete$1.L$1 = null;
                                deleteForeverModel$onPhonishDelete$1.label = 4;
                            } else {
                                kotlinx.coroutines.flow.n0 n0Var2 = this.i;
                                u0 u0Var = new u0(new com.yandex.passport.api.q0(a));
                                deleteForeverModel$onPhonishDelete$1.L$0 = value;
                                deleteForeverModel$onPhonishDelete$1.L$1 = null;
                                deleteForeverModel$onPhonishDelete$1.label = 5;
                            }
                        }
                        return zy11.a;
                    }
                    obj = deleteForeverModel$onPhonishDelete$1.L$1;
                    y0Var = (y0) deleteForeverModel$onPhonishDelete$1.L$0;
                    kotlin.b.b(obj2);
                    kotlinx.coroutines.flow.n0 n0Var3 = y0Var.i;
                    u0 u0Var2 = new u0((com.yandex.passport.api.r0) obj2);
                    deleteForeverModel$onPhonishDelete$1.L$0 = y0Var;
                    deleteForeverModel$onPhonishDelete$1.L$1 = obj;
                    deleteForeverModel$onPhonishDelete$1.label = 3;
                }
                value = ((Result) obj2).getValue();
                if (!(value instanceof Result.Failure)) {
                    deleteForeverModel$onPhonishDelete$1.L$0 = this;
                    deleteForeverModel$onPhonishDelete$1.L$1 = value;
                    deleteForeverModel$onPhonishDelete$1.label = 2;
                    Object h = this.h(deleteForeverModel$onPhonishDelete$1);
                    if (h != coroutineSingletons) {
                        y0Var = this;
                        obj = value;
                        obj2 = h;
                        kotlinx.coroutines.flow.n0 n0Var32 = y0Var.i;
                        u0 u0Var22 = new u0((com.yandex.passport.api.r0) obj2);
                        deleteForeverModel$onPhonishDelete$1.L$0 = y0Var;
                        deleteForeverModel$onPhonishDelete$1.L$1 = obj;
                        deleteForeverModel$onPhonishDelete$1.label = 3;
                    }
                    return coroutineSingletons;
                }
                a = Result.a(value);
                if (a != null) {
                }
                return zy11.a;
            }
        }
        deleteForeverModel$onPhonishDelete$1 = new DeleteForeverModel$onPhonishDelete$1(this, continuationImpl);
        Object obj22 = deleteForeverModel$onPhonishDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverModel$onPhonishDelete$1.label;
        if (i != 0) {
        }
        value = ((Result) obj22).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(q0 q0Var, Continuation continuation) {
        DeleteForeverModel$slothWishMapper$1 deleteForeverModel$slothWishMapper$1;
        Object obj;
        int i;
        lz40 lz40Var;
        u0 u0Var;
        if (continuation instanceof DeleteForeverModel$slothWishMapper$1) {
            deleteForeverModel$slothWishMapper$1 = (DeleteForeverModel$slothWishMapper$1) continuation;
            int i2 = deleteForeverModel$slothWishMapper$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverModel$slothWishMapper$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deleteForeverModel$slothWishMapper$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverModel$slothWishMapper$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean l = jl40.l(q0Var, p0.c);
                    kotlinx.coroutines.flow.n0 n0Var = this.i;
                    if (l) {
                        t0 t0Var = new t0(d(), false);
                        deleteForeverModel$slothWishMapper$1.label = 1;
                        return n0Var.emit(t0Var, deleteForeverModel$slothWishMapper$1) == obj ? obj : zy11Var;
                    }
                    if (jl40.l(q0Var, p0.a)) {
                        u0 u0Var2 = new u0(com.yandex.passport.api.p0.a);
                        deleteForeverModel$slothWishMapper$1.label = 2;
                        if (n0Var.emit(u0Var2, deleteForeverModel$slothWishMapper$1) == obj) {
                        }
                    } else {
                        if (!jl40.l(q0Var, p0.b)) {
                            w511.b();
                            return null;
                        }
                        deleteForeverModel$slothWishMapper$1.L$0 = n0Var;
                        deleteForeverModel$slothWishMapper$1.label = 3;
                        obj2 = h(deleteForeverModel$slothWishMapper$1);
                        if (obj2 != obj) {
                            lz40Var = n0Var;
                        }
                    }
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                if (i == 2) {
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                if (i != 3) {
                    if (i == 4) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lz40Var = (lz40) deleteForeverModel$slothWishMapper$1.L$0;
                kotlin.b.b(obj2);
                u0Var = new u0((com.yandex.passport.api.r0) obj2);
                deleteForeverModel$slothWishMapper$1.L$0 = null;
                deleteForeverModel$slothWishMapper$1.label = 4;
                if (lz40Var.emit(u0Var, deleteForeverModel$slothWishMapper$1) != obj) {
                }
            }
        }
        deleteForeverModel$slothWishMapper$1 = new DeleteForeverModel$slothWishMapper$1(this, continuation);
        Object obj22 = deleteForeverModel$slothWishMapper$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverModel$slothWishMapper$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        u0Var = new u0((com.yandex.passport.api.r0) obj22);
        deleteForeverModel$slothWishMapper$1.L$0 = null;
        deleteForeverModel$slothWishMapper$1.label = 4;
        if (lz40Var.emit(u0Var, deleteForeverModel$slothWishMapper$1) != obj) {
        }
    }
}
