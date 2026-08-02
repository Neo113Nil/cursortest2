package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.report.i7;
import com.yandex.passport.internal.usecase.a0;
import com.yandex.passport.internal.usecase.b0;
import com.yandex.passport.internal.usecase.c0;
import com.yandex.passport.internal.usecase.z;
import defpackage.fyc;
import defpackage.ny61;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i {
    public final n a;

    public i(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uid uid, AppTheme appTheme, ContinuationImpl continuationImpl) {
        ChallengeChecker$checkChallenge$1 challengeChecker$checkChallenge$1;
        int i;
        c0 c0Var;
        if (continuationImpl instanceof ChallengeChecker$checkChallenge$1) {
            challengeChecker$checkChallenge$1 = (ChallengeChecker$checkChallenge$1) continuationImpl;
            int i2 = challengeChecker$checkChallenge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeChecker$checkChallenge$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeChecker$checkChallenge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeChecker$checkChallenge$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    challengeChecker$checkChallenge$1.L$0 = this;
                    challengeChecker$checkChallenge$1.L$1 = uid;
                    challengeChecker$checkChallenge$1.L$2 = appTheme;
                    challengeChecker$checkChallenge$1.label = 1;
                    obj = this.a.b(uid, challengeChecker$checkChallenge$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        v vVar = (v) obj;
                        if (vVar != null) {
                            return new g(vVar);
                        }
                        return e.a;
                    }
                    appTheme = (AppTheme) challengeChecker$checkChallenge$1.L$2;
                    uid = (Uid) challengeChecker$checkChallenge$1.L$1;
                    this = (i) challengeChecker$checkChallenge$1.L$0;
                    kotlin.b.b(obj);
                }
                c0Var = (c0) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "ChallengeState = " + c0Var, 8);
                }
                if (!(c0Var instanceof z)) {
                    if (c0Var instanceof b0) {
                        return f.a;
                    }
                    if (!(c0Var instanceof a0)) {
                        w511.b();
                        return null;
                    }
                    PassportTheme z = com.yandex.passport.internal.util.p.z(appTheme);
                    challengeChecker$checkChallenge$1.L$0 = null;
                    challengeChecker$checkChallenge$1.L$1 = null;
                    challengeChecker$checkChallenge$1.L$2 = null;
                    challengeChecker$checkChallenge$1.label = 2;
                    obj = this.a.c(uid, (a0) c0Var, z, challengeChecker$checkChallenge$1);
                }
                return e.a;
            }
        }
        challengeChecker$checkChallenge$1 = new ChallengeChecker$checkChallenge$1(this, continuationImpl);
        Object obj2 = challengeChecker$checkChallenge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeChecker$checkChallenge$1.label;
        if (i != 0) {
        }
        c0Var = (c0) obj2;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        if (!(c0Var instanceof z)) {
        }
        return e.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Uid uid, v vVar, ContinuationImpl continuationImpl) {
        ChallengeChecker$checkReturnUrl$1 challengeChecker$checkReturnUrl$1;
        Object obj;
        int i;
        i iVar;
        Uid uid2;
        c0 c0Var;
        if (continuationImpl instanceof ChallengeChecker$checkReturnUrl$1) {
            challengeChecker$checkReturnUrl$1 = (ChallengeChecker$checkReturnUrl$1) continuationImpl;
            int i2 = challengeChecker$checkReturnUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeChecker$checkReturnUrl$1.label = i2 - Integer.MIN_VALUE;
                obj = challengeChecker$checkReturnUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeChecker$checkReturnUrl$1.label;
                e eVar = e.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vVar.d(str);
                    fyc b = vVar.b();
                    challengeChecker$checkReturnUrl$1.L$0 = this;
                    challengeChecker$checkReturnUrl$1.L$1 = uid;
                    challengeChecker$checkReturnUrl$1.label = 1;
                    obj = b.s(challengeChecker$checkReturnUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uid2 = (Uid) challengeChecker$checkReturnUrl$1.L$1;
                        iVar = (i) challengeChecker$checkReturnUrl$1.L$0;
                        kotlin.b.b(obj);
                        c0Var = (c0) obj;
                        if (!(c0Var instanceof b0)) {
                            return f.a;
                        }
                        if (!(c0Var instanceof z) && !(c0Var instanceof a0)) {
                            w511.b();
                            return null;
                        }
                        com.yandex.passport.internal.report.reporters.o oVar = iVar.a.f;
                        oVar.getClass();
                        oVar.g(i7.w, uid2);
                        return eVar;
                    }
                    uid = (Uid) challengeChecker$checkReturnUrl$1.L$1;
                    this = (i) challengeChecker$checkReturnUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return eVar;
                }
                n nVar = this.a;
                challengeChecker$checkReturnUrl$1.L$0 = this;
                challengeChecker$checkReturnUrl$1.L$1 = uid;
                challengeChecker$checkReturnUrl$1.label = 2;
                obj = nVar.b(uid, challengeChecker$checkReturnUrl$1);
                if (obj != coroutineSingletons) {
                    iVar = this;
                    uid2 = uid;
                    c0Var = (c0) obj;
                    if (!(c0Var instanceof b0)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        challengeChecker$checkReturnUrl$1 = new ChallengeChecker$checkReturnUrl$1(this, continuationImpl);
        obj = challengeChecker$checkReturnUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeChecker$checkReturnUrl$1.label;
        e eVar2 = e.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
