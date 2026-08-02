package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.b0;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.ny61;
import defpackage.qoi0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class h implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public h(com.yandex.passport.sloth.v vVar) {
        this.a = vVar;
    }

    @Override // com.yandex.passport.sloth.command.q
    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        return b(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        PerformGetEbsAgeConfirmStatePerformer$performCommand$1 performGetEbsAgeConfirmStatePerformer$performCommand$1;
        int i;
        eyc eycVar;
        if (continuation instanceof PerformGetEbsAgeConfirmStatePerformer$performCommand$1) {
            performGetEbsAgeConfirmStatePerformer$performCommand$1 = (PerformGetEbsAgeConfirmStatePerformer$performCommand$1) continuation;
            int i2 = performGetEbsAgeConfirmStatePerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                performGetEbsAgeConfirmStatePerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = performGetEbsAgeConfirmStatePerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = performGetEbsAgeConfirmStatePerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc b = gwk0.b();
                    b0 b0Var = new b0(new com.yandex.passport.internal.sloth.performers.usermenu.c(b, 1));
                    performGetEbsAgeConfirmStatePerformer$performCommand$1.L$0 = b;
                    performGetEbsAgeConfirmStatePerformer$performCommand$1.label = 1;
                    if (this.a.c(b0Var, performGetEbsAgeConfirmStatePerformer$performCommand$1) != coroutineSingletons) {
                        eycVar = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (obj instanceof com.yandex.passport.sloth.command.r) {
                        return new iqn(obj);
                    }
                    if (obj instanceof com.yandex.passport.sloth.command.e) {
                        return new kqn(obj);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append(" is neither ");
                    sb.append(qoi0.a(com.yandex.passport.sloth.command.e.class));
                    com.yandex.passport.internal.sloth.performers.usermenu.b.b(sb, " nor ", qoi0.a(com.yandex.passport.sloth.command.r.class));
                    return null;
                }
                eycVar = (eyc) performGetEbsAgeConfirmStatePerformer$performCommand$1.L$0;
                kotlin.b.b(obj);
                performGetEbsAgeConfirmStatePerformer$performCommand$1.L$0 = null;
                performGetEbsAgeConfirmStatePerformer$performCommand$1.label = 2;
                obj = ((fyc) eycVar).s(performGetEbsAgeConfirmStatePerformer$performCommand$1);
            }
        }
        performGetEbsAgeConfirmStatePerformer$performCommand$1 = new PerformGetEbsAgeConfirmStatePerformer$performCommand$1(this, (ContinuationImpl) continuation);
        Object obj2 = performGetEbsAgeConfirmStatePerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = performGetEbsAgeConfirmStatePerformer$performCommand$1.label;
        if (i != 0) {
        }
        performGetEbsAgeConfirmStatePerformer$performCommand$1.L$0 = null;
        performGetEbsAgeConfirmStatePerformer$performCommand$1.label = 2;
        obj2 = ((fyc) eycVar).s(performGetEbsAgeConfirmStatePerformer$performCommand$1);
    }
}
