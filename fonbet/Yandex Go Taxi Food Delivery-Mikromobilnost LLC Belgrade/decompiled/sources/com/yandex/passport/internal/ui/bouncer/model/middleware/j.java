package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.i7;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class j implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.ui.challenge.n a;

    public j(com.yandex.passport.internal.ui.challenge.n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, com.yandex.passport.internal.ui.bouncer.model.f fVar, ContinuationImpl continuationImpl) {
        ChallengeStartMiddleware$challenge$1 challengeStartMiddleware$challenge$1;
        int i;
        com.yandex.passport.internal.usecase.c0 c0Var;
        com.yandex.passport.internal.ui.bouncer.model.f fVar2;
        jVar.getClass();
        if (continuationImpl instanceof ChallengeStartMiddleware$challenge$1) {
            challengeStartMiddleware$challenge$1 = (ChallengeStartMiddleware$challenge$1) continuationImpl;
            int i2 = challengeStartMiddleware$challenge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeStartMiddleware$challenge$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeStartMiddleware$challenge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeStartMiddleware$challenge$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.ui.challenge.n nVar = jVar.a;
                    Uid uid = fVar.b;
                    challengeStartMiddleware$challenge$1.L$0 = jVar;
                    challengeStartMiddleware$challenge$1.L$1 = fVar;
                    challengeStartMiddleware$challenge$1.label = 1;
                    obj = nVar.b(uid, challengeStartMiddleware$challenge$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar2 = (com.yandex.passport.internal.ui.bouncer.model.f) challengeStartMiddleware$challenge$1.L$0;
                        kotlin.b.b(obj);
                        com.yandex.passport.internal.ui.challenge.v vVar = (com.yandex.passport.internal.ui.challenge.v) obj;
                        return vVar == null ? new com.yandex.passport.internal.ui.bouncer.model.b0(new t1(vVar, fVar2.b, fVar2.c)) : new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.l1("ChallengeStartMiddleware", "No web case for challenge"));
                    }
                    fVar = (com.yandex.passport.internal.ui.bouncer.model.f) challengeStartMiddleware$challenge$1.L$1;
                    jVar = (j) challengeStartMiddleware$challenge$1.L$0;
                    kotlin.b.b(obj);
                }
                c0Var = (com.yandex.passport.internal.usecase.c0) obj;
                if (!(c0Var instanceof com.yandex.passport.internal.usecase.z)) {
                    boolean z = ((com.yandex.passport.internal.usecase.z) c0Var).a;
                    if (z) {
                        return new com.yandex.passport.internal.ui.bouncer.model.g(fVar.a.a.getVisualProperties().isNoReturnToHost());
                    }
                    if (!z) {
                        return new com.yandex.passport.internal.ui.bouncer.model.s(com.yandex.passport.internal.ui.bouncer.model.n1.a);
                    }
                    w511.b();
                    return null;
                }
                if (jl40.l(c0Var, com.yandex.passport.internal.usecase.b0.a)) {
                    return new com.yandex.passport.internal.ui.bouncer.model.e(fVar.a);
                }
                if (!(c0Var instanceof com.yandex.passport.internal.usecase.a0)) {
                    w511.b();
                    return null;
                }
                boolean z2 = fVar.d;
                Uid uid2 = fVar.b;
                if (z2) {
                    com.yandex.passport.internal.report.reporters.o oVar = jVar.a.f;
                    oVar.getClass();
                    oVar.g(i7.w, uid2);
                }
                PassportTheme passportTheme = fVar.c;
                challengeStartMiddleware$challenge$1.L$0 = fVar;
                challengeStartMiddleware$challenge$1.L$1 = null;
                challengeStartMiddleware$challenge$1.label = 2;
                obj = jVar.a.c(uid2, (com.yandex.passport.internal.usecase.a0) c0Var, passportTheme, challengeStartMiddleware$challenge$1);
                if (obj != coroutineSingletons) {
                    fVar2 = fVar;
                    com.yandex.passport.internal.ui.challenge.v vVar2 = (com.yandex.passport.internal.ui.challenge.v) obj;
                    if (vVar2 == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        challengeStartMiddleware$challenge$1 = new ChallengeStartMiddleware$challenge$1(jVar, continuationImpl);
        Object obj2 = challengeStartMiddleware$challenge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeStartMiddleware$challenge$1.label;
        if (i != 0) {
        }
        c0Var = (com.yandex.passport.internal.usecase.c0) obj2;
        if (!(c0Var instanceof com.yandex.passport.internal.usecase.z)) {
        }
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 2), this, 3);
    }
}
