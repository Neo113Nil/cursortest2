package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.PhoneBoundedDomikResult;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class i0 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.ui.bouncer.model.b1 a;
    public final com.yandex.passport.internal.report.reporters.n b;

    public i0(com.yandex.passport.internal.ui.bouncer.model.b1 b1Var, com.yandex.passport.internal.report.reporters.n nVar) {
        this.a = b1Var;
        this.b = nVar;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 11), this, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.internal.ui.bouncer.model.v vVar, ContinuationImpl continuationImpl) {
        ProcessFallbackResultMiddleware$processOkResult$1 processFallbackResultMiddleware$processOkResult$1;
        int i;
        Bundle extras;
        DomikResult domikResult;
        DomikResult domikResult2;
        if (continuationImpl instanceof ProcessFallbackResultMiddleware$processOkResult$1) {
            processFallbackResultMiddleware$processOkResult$1 = (ProcessFallbackResultMiddleware$processOkResult$1) continuationImpl;
            int i2 = processFallbackResultMiddleware$processOkResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processFallbackResultMiddleware$processOkResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = processFallbackResultMiddleware$processOkResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processFallbackResultMiddleware$processOkResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Intent intent = vVar.b;
                    if (intent == null || (extras = intent.getExtras()) == null) {
                        return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.l1("ProcessFallbackResultMiddleware", "No data in result"));
                    }
                    DomikResult.Companion.getClass();
                    domikResult = (DomikResult) extras.getParcelable("domik-result");
                    if (domikResult == null) {
                        ny61.r("no domik-result in the bundle");
                        return null;
                    }
                    if (domikResult instanceof PhoneBoundedDomikResult) {
                        com.yandex.passport.internal.ui.bouncer.model.z0 z0Var = new com.yandex.passport.internal.ui.bouncer.model.z0(((PhoneBoundedDomikResult) domikResult).getPhoneNumber());
                        processFallbackResultMiddleware$processOkResult$1.L$0 = domikResult;
                        processFallbackResultMiddleware$processOkResult$1.label = 1;
                        Object emit = this.a.c.emit(z0Var, processFallbackResultMiddleware$processOkResult$1);
                        if (emit != coroutineSingletons) {
                            emit = zy11.a;
                        }
                        if (emit == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        domikResult2 = domikResult;
                    }
                    return new com.yandex.passport.internal.ui.bouncer.model.l0(new com.yandex.passport.internal.ui.bouncer.model.q1(domikResult.getModernAccount(), domikResult.getClientToken(), domikResult.getLoginAction(), domikResult.getAdditionalActionResponse(), null, domikResult.getSkipFinishRegistrationActivities(), 16));
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                domikResult2 = (DomikResult) processFallbackResultMiddleware$processOkResult$1.L$0;
                kotlin.b.b(obj);
                domikResult = domikResult2;
                return new com.yandex.passport.internal.ui.bouncer.model.l0(new com.yandex.passport.internal.ui.bouncer.model.q1(domikResult.getModernAccount(), domikResult.getClientToken(), domikResult.getLoginAction(), domikResult.getAdditionalActionResponse(), null, domikResult.getSkipFinishRegistrationActivities(), 16));
            }
        }
        processFallbackResultMiddleware$processOkResult$1 = new ProcessFallbackResultMiddleware$processOkResult$1(this, continuationImpl);
        Object obj2 = processFallbackResultMiddleware$processOkResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processFallbackResultMiddleware$processOkResult$1.label;
        if (i != 0) {
        }
        domikResult = domikResult2;
        return new com.yandex.passport.internal.ui.bouncer.model.l0(new com.yandex.passport.internal.ui.bouncer.model.q1(domikResult.getModernAccount(), domikResult.getClientToken(), domikResult.getLoginAction(), domikResult.getAdditionalActionResponse(), null, domikResult.getSkipFinishRegistrationActivities(), 16));
    }
}
