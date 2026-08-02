package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.i7;
import com.yandex.passport.internal.usecase.a0;
import com.yandex.passport.internal.usecase.b0;
import com.yandex.passport.internal.usecase.c0;
import com.yandex.passport.internal.usecase.z;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public abstract class o {
    public final l a;
    public final n b;
    public final boolean c;
    public final ike d;
    public final n0 e = ffx.c(1, 0, null, 6);

    public o(l lVar, u uVar, n nVar, boolean z) {
        this.a = lVar;
        this.b = nVar;
        this.c = z;
        this.d = com.yandex.passport.internal.util.p.s(ds31.a(uVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, ContinuationImpl continuationImpl) {
        ChallengeModel$checkAgainAndPerformChallengedAction$1 challengeModel$checkAgainAndPerformChallengedAction$1;
        int i;
        c0 c0Var;
        oVar.getClass();
        if (continuationImpl instanceof ChallengeModel$checkAgainAndPerformChallengedAction$1) {
            challengeModel$checkAgainAndPerformChallengedAction$1 = (ChallengeModel$checkAgainAndPerformChallengedAction$1) continuationImpl;
            int i2 = challengeModel$checkAgainAndPerformChallengedAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeModel$checkAgainAndPerformChallengedAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeModel$checkAgainAndPerformChallengedAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeModel$checkAgainAndPerformChallengedAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uid d = oVar.d();
                    if (d == null) {
                        c0Var = null;
                        if (jl40.l(c0Var, b0.a)) {
                            challengeModel$checkAgainAndPerformChallengedAction$1.L$0 = null;
                            challengeModel$checkAgainAndPerformChallengedAction$1.label = 2;
                            Object e = oVar.e(challengeModel$checkAgainAndPerformChallengedAction$1);
                            return e == coroutineSingletons ? coroutineSingletons : e;
                        }
                        if (!(c0Var instanceof z) && !(c0Var instanceof a0) && c0Var != null) {
                            w511.b();
                            return null;
                        }
                        Uid d2 = oVar.d();
                        if (d2 != null) {
                            com.yandex.passport.internal.report.reporters.o oVar2 = oVar.b.f;
                            oVar2.getClass();
                            oVar2.g(i7.w, d2);
                        }
                        return c();
                    }
                    n nVar = oVar.b;
                    challengeModel$checkAgainAndPerformChallengedAction$1.L$0 = oVar;
                    challengeModel$checkAgainAndPerformChallengedAction$1.label = 1;
                    obj = nVar.b(d, challengeModel$checkAgainAndPerformChallengedAction$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (o) challengeModel$checkAgainAndPerformChallengedAction$1.L$0;
                    kotlin.b.b(obj);
                }
                c0Var = (c0) obj;
                if (jl40.l(c0Var, b0.a)) {
                }
            }
        }
        challengeModel$checkAgainAndPerformChallengedAction$1 = new ChallengeModel$checkAgainAndPerformChallengedAction$1(oVar, continuationImpl);
        Object obj2 = challengeModel$checkAgainAndPerformChallengedAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeModel$checkAgainAndPerformChallengedAction$1.label;
        if (i != 0) {
        }
        c0Var = (c0) obj2;
        if (jl40.l(c0Var, b0.a)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r9 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0064, code lost:
    
        if (r9.emit(com.yandex.passport.internal.ui.challenge.q.a, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, ContinuationImpl continuationImpl) {
        ChallengeModel$checkIfChallengeRequired$1 challengeModel$checkIfChallengeRequired$1;
        int i;
        c0 c0Var;
        oVar.getClass();
        if (continuationImpl instanceof ChallengeModel$checkIfChallengeRequired$1) {
            challengeModel$checkIfChallengeRequired$1 = (ChallengeModel$checkIfChallengeRequired$1) continuationImpl;
            int i2 = challengeModel$checkIfChallengeRequired$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeModel$checkIfChallengeRequired$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeModel$checkIfChallengeRequired$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeModel$checkIfChallengeRequired$1.label;
                zy11 zy11Var = zy11.a;
                b0 b0Var = b0.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        n0 n0Var = oVar.e;
                        challengeModel$checkIfChallengeRequired$1.L$0 = oVar;
                        challengeModel$checkIfChallengeRequired$1.label = 1;
                        break;
                    case 1:
                        oVar = (o) challengeModel$checkIfChallengeRequired$1.L$0;
                        kotlin.b.b(obj);
                        Uid d = oVar.d();
                        if (d != null) {
                            if (!oVar.c) {
                                c0Var = b0Var;
                                break;
                            } else {
                                n nVar = oVar.b;
                                challengeModel$checkIfChallengeRequired$1.L$0 = oVar;
                                challengeModel$checkIfChallengeRequired$1.label = 2;
                                obj = nVar.b(d, challengeModel$checkIfChallengeRequired$1);
                                break;
                            }
                        }
                        c0Var = b0Var;
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "ChallengeState = " + c0Var, 8);
                        }
                        if (c0Var instanceof z) {
                            oVar.getClass();
                            r c = c();
                            n0 n0Var2 = oVar.e;
                            challengeModel$checkIfChallengeRequired$1.L$0 = null;
                            challengeModel$checkIfChallengeRequired$1.label = 3;
                            return n0Var2.emit(c, challengeModel$checkIfChallengeRequired$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (c0Var.equals(b0Var)) {
                            challengeModel$checkIfChallengeRequired$1.L$0 = oVar;
                            challengeModel$checkIfChallengeRequired$1.label = 4;
                            obj = oVar.e(challengeModel$checkIfChallengeRequired$1);
                            break;
                        } else {
                            if (!(c0Var instanceof a0)) {
                                w511.b();
                                return null;
                            }
                            challengeModel$checkIfChallengeRequired$1.L$0 = null;
                            challengeModel$checkIfChallengeRequired$1.label = 6;
                            if (oVar.f((a0) c0Var, challengeModel$checkIfChallengeRequired$1) == coroutineSingletons) {
                            }
                        }
                    case 2:
                        oVar = (o) challengeModel$checkIfChallengeRequired$1.L$0;
                        kotlin.b.b(obj);
                        c0Var = (c0) obj;
                        break;
                    case 3:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 4:
                        oVar = (o) challengeModel$checkIfChallengeRequired$1.L$0;
                        kotlin.b.b(obj);
                        n0 n0Var3 = oVar.e;
                        challengeModel$checkIfChallengeRequired$1.L$0 = null;
                        challengeModel$checkIfChallengeRequired$1.label = 5;
                        if (n0Var3.emit((t) obj, challengeModel$checkIfChallengeRequired$1) == coroutineSingletons) {
                        }
                        break;
                    case 5:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 6:
                        kotlin.b.b(obj);
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        challengeModel$checkIfChallengeRequired$1 = new ChallengeModel$checkIfChallengeRequired$1(oVar, continuationImpl);
        Object obj2 = challengeModel$checkIfChallengeRequired$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeModel$checkIfChallengeRequired$1.label;
        zy11 zy11Var2 = zy11.a;
        b0 b0Var2 = b0.a;
        switch (i) {
        }
    }

    public static r c() {
        return new r(false);
    }

    public abstract Uid d();

    public abstract Object e(ContinuationImpl continuationImpl);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(a0 a0Var, ContinuationImpl continuationImpl) {
        ChallengeModel$showWebView$1 challengeModel$showWebView$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zy11 zy11Var;
        o oVar;
        v vVar;
        o oVar2;
        v vVar2;
        Object obj;
        if (continuationImpl instanceof ChallengeModel$showWebView$1) {
            challengeModel$showWebView$1 = (ChallengeModel$showWebView$1) continuationImpl;
            int i2 = challengeModel$showWebView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeModel$showWebView$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = challengeModel$showWebView$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeModel$showWebView$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Uid d = d();
                    if (d == null) {
                        ny61.r("internal error");
                        return null;
                    }
                    PassportTheme passportTheme = this.a.b;
                    challengeModel$showWebView$1.L$0 = this;
                    challengeModel$showWebView$1.L$1 = this;
                    challengeModel$showWebView$1.label = 1;
                    obj2 = this.b.c(d, a0Var, passportTheme, challengeModel$showWebView$1);
                    if (obj2 != coroutineSingletons) {
                        oVar = this;
                    }
                }
                if (i == 1) {
                    o oVar3 = (o) challengeModel$showWebView$1.L$1;
                    o oVar4 = (o) challengeModel$showWebView$1.L$0;
                    kotlin.b.b(obj2);
                    oVar = oVar3;
                    this = oVar4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj2);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vVar2 = (v) challengeModel$showWebView$1.L$2;
                    oVar = (o) challengeModel$showWebView$1.L$1;
                    oVar2 = (o) challengeModel$showWebView$1.L$0;
                    kotlin.b.b(obj2);
                    if (vVar2 == null) {
                        obj = new s(vVar2);
                        if (obj == null) {
                            oVar2.getClass();
                            obj = c();
                        }
                        n0 n0Var = oVar.e;
                        challengeModel$showWebView$1.L$0 = null;
                        challengeModel$showWebView$1.L$1 = null;
                        challengeModel$showWebView$1.L$2 = null;
                        challengeModel$showWebView$1.label = 3;
                        return n0Var.emit(obj, challengeModel$showWebView$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    this = oVar2;
                    oVar2 = this;
                    obj = null;
                    if (obj == null) {
                    }
                    n0 n0Var2 = oVar.e;
                    challengeModel$showWebView$1.L$0 = null;
                    challengeModel$showWebView$1.L$1 = null;
                    challengeModel$showWebView$1.L$2 = null;
                    challengeModel$showWebView$1.label = 3;
                    if (n0Var2.emit(obj, challengeModel$showWebView$1) != coroutineSingletons) {
                    }
                }
                vVar = (v) obj2;
                if (vVar != null) {
                    challengeModel$showWebView$1.L$0 = this;
                    challengeModel$showWebView$1.L$1 = oVar;
                    challengeModel$showWebView$1.L$2 = vVar;
                    challengeModel$showWebView$1.label = 2;
                    this.getClass();
                    tje.N(bvf0.a(challengeModel$showWebView$1.get_context()), null, null, new ChallengeModel$listenForResult$2(this, vVar, null), 3);
                    if (zy11Var != coroutineSingletons) {
                        oVar2 = this;
                        vVar2 = vVar;
                        if (vVar2 == null) {
                        }
                    }
                }
                oVar2 = this;
                obj = null;
                if (obj == null) {
                }
                n0 n0Var22 = oVar.e;
                challengeModel$showWebView$1.L$0 = null;
                challengeModel$showWebView$1.L$1 = null;
                challengeModel$showWebView$1.L$2 = null;
                challengeModel$showWebView$1.label = 3;
                if (n0Var22.emit(obj, challengeModel$showWebView$1) != coroutineSingletons) {
                }
            }
        }
        challengeModel$showWebView$1 = new ChallengeModel$showWebView$1(this, continuationImpl);
        Object obj22 = challengeModel$showWebView$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeModel$showWebView$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        vVar = (v) obj22;
        if (vVar != null) {
        }
        oVar2 = this;
        obj = null;
        if (obj == null) {
        }
        n0 n0Var222 = oVar.e;
        challengeModel$showWebView$1.L$0 = null;
        challengeModel$showWebView$1.L$1 = null;
        challengeModel$showWebView$1.L$2 = null;
        challengeModel$showWebView$1.label = 3;
        if (n0Var222.emit(obj, challengeModel$showWebView$1) != coroutineSingletons) {
        }
    }
}
