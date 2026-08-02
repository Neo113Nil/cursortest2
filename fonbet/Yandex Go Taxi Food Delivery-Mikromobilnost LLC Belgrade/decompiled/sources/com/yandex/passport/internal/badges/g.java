package com.yandex.passport.internal.badges;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.e3;
import com.yandex.passport.data.network.v2;
import com.yandex.passport.internal.report.h2;
import com.yandex.passport.internal.report.i2;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.reporters.l;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g extends com.yandex.passport.common.domain.d {
    public final b b;
    public final e3 c;
    public final l d;
    public final com.yandex.passport.internal.network.mappers.b e;

    public g(com.yandex.passport.common.coroutine.a aVar, b bVar, e3 e3Var, l lVar, com.yandex.passport.internal.network.mappers.b bVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = bVar;
        this.c = e3Var;
        this.d = lVar;
        this.e = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0031, B:14:0x00c3, B:20:0x0043, B:21:0x0097, B:23:0x00a3, B:29:0x00ce, B:32:0x0050, B:33:0x0071, B:36:0x007a, B:40:0x0057), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0031, B:14:0x00c3, B:20:0x0043, B:21:0x0097, B:23:0x00a3, B:29:0x00ce, B:32:0x0050, B:33:0x0071, B:36:0x007a, B:40:0x0057), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0031, B:14:0x00c3, B:20:0x0043, B:21:0x0097, B:23:0x00a3, B:29:0x00ce, B:32:0x0050, B:33:0x0071, B:36:0x007a, B:40:0x0057), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Environment environment, ContinuationImpl continuationImpl) {
        UpdateBadgesConfigUseCase$run$1 updateBadgesConfigUseCase$run$1;
        Object obj;
        int i;
        zy11 zy11Var;
        Throwable a;
        try {
            if (continuationImpl instanceof UpdateBadgesConfigUseCase$run$1) {
                updateBadgesConfigUseCase$run$1 = (UpdateBadgesConfigUseCase$run$1) continuationImpl;
                int i2 = updateBadgesConfigUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    updateBadgesConfigUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    obj = updateBadgesConfigUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = updateBadgesConfigUseCase$run$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        b bVar = this.b;
                        updateBadgesConfigUseCase$run$1.L$0 = this;
                        updateBadgesConfigUseCase$run$1.L$1 = environment;
                        updateBadgesConfigUseCase$run$1.label = 1;
                        obj = tje.k0(((com.yandex.passport.common.coroutine.b) bVar.a).d, new BadgesStorage$isBadgesConfigUpToDate$2(bVar, null), updateBadgesConfigUseCase$run$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i == 1) {
                        environment = (Environment) updateBadgesConfigUseCase$run$1.L$1;
                        this = (g) updateBadgesConfigUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = (g) updateBadgesConfigUseCase$run$1.L$0;
                            kotlin.b.b(obj);
                            l lVar = this.d;
                            lVar.getClass();
                            lVar.h(i2.w);
                            return zy11Var;
                        }
                        this = (g) updateBadgesConfigUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        Object value = ((Result) obj).getValue();
                        a = Result.a(value);
                        if (a == null) {
                            l lVar2 = this.d;
                            lVar2.getClass();
                            lVar2.f(h2.w, new yd(a), new ld(a));
                            return zy11Var;
                        }
                        b bVar2 = this.b;
                        String str = ((com.yandex.passport.data.models.d) value).a;
                        updateBadgesConfigUseCase$run$1.L$0 = this;
                        updateBadgesConfigUseCase$run$1.label = 3;
                        Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) bVar2.a).d, new BadgesStorage$cacheBadgesConfig$2(bVar2, str, null), updateBadgesConfigUseCase$run$1);
                        if (k0 != coroutineSingletons) {
                            k0 = zy11Var;
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return zy11Var;
                    }
                    e3 e3Var = this.c;
                    this.e.getClass();
                    v2 v2Var = new v2(com.yandex.passport.internal.network.mappers.b.a(environment));
                    updateBadgesConfigUseCase$run$1.L$0 = this;
                    updateBadgesConfigUseCase$run$1.L$1 = null;
                    updateBadgesConfigUseCase$run$1.label = 2;
                    obj = e3Var.a(v2Var, updateBadgesConfigUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Object value2 = ((Result) obj).getValue();
                    a = Result.a(value2);
                    if (a == null) {
                    }
                }
            }
            if (i != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Exception e) {
            l lVar3 = this.d;
            lVar3.getClass();
            lVar3.f(h2.w, new yd(e), new ld(e));
            return zy11Var;
        }
        updateBadgesConfigUseCase$run$1 = new UpdateBadgesConfigUseCase$run$1(this, continuationImpl);
        obj = updateBadgesConfigUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateBadgesConfigUseCase$run$1.label;
        zy11Var = zy11.a;
    }
}
