package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.v0;
import com.yandex.passport.sloth.e0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class i implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;
    public final h b;

    public i(com.yandex.passport.sloth.v vVar, h hVar) {
        this.a = vVar;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r13.a.c(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v0 v0Var, ContinuationImpl continuationImpl) {
        PerformSetEbsAgeConfirmStatePerformer$performCommand$1 performSetEbsAgeConfirmStatePerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof PerformSetEbsAgeConfirmStatePerformer$performCommand$1) {
            performSetEbsAgeConfirmStatePerformer$performCommand$1 = (PerformSetEbsAgeConfirmStatePerformer$performCommand$1) continuationImpl;
            int i2 = performSetEbsAgeConfirmStatePerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                performSetEbsAgeConfirmStatePerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = performSetEbsAgeConfirmStatePerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = performSetEbsAgeConfirmStatePerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e0 e0Var = new e0(v0Var.a, v0Var.b, v0Var.c, v0Var.d, v0Var.e, v0Var.f);
                    performSetEbsAgeConfirmStatePerformer$performCommand$1.L$0 = this;
                    performSetEbsAgeConfirmStatePerformer$performCommand$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (i) performSetEbsAgeConfirmStatePerformer$performCommand$1.L$0;
                    kotlin.b.b(obj);
                }
                h hVar = this.b;
                performSetEbsAgeConfirmStatePerformer$performCommand$1.L$0 = null;
                performSetEbsAgeConfirmStatePerformer$performCommand$1.label = 2;
                Object b = hVar.b(performSetEbsAgeConfirmStatePerformer$performCommand$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        performSetEbsAgeConfirmStatePerformer$performCommand$1 = new PerformSetEbsAgeConfirmStatePerformer$performCommand$1(this, continuationImpl);
        Object obj2 = performSetEbsAgeConfirmStatePerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = performSetEbsAgeConfirmStatePerformer$performCommand$1.label;
        if (i != 0) {
        }
        h hVar2 = this.b;
        performSetEbsAgeConfirmStatePerformer$performCommand$1.L$0 = null;
        performSetEbsAgeConfirmStatePerformer$performCommand$1.label = 2;
        Object b2 = hVar2.b(performSetEbsAgeConfirmStatePerformer$performCommand$1);
        if (b2 != coroutineSingletons2) {
        }
    }
}
