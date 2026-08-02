package com.yandex.passport.internal.ui.bouncer.challenge;

import com.yandex.passport.internal.ui.challenge.v;
import defpackage.fyc;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class i extends com.yandex.passport.common.mvi.g {
    public final v c;

    public i(v vVar) {
        this.c = vVar;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        if (!jl40.l((h) obj, h.a)) {
            w511.b();
            return null;
        }
        new com.yandex.passport.internal.ui.challenge.webview.l();
        a(new k(com.yandex.passport.internal.ui.challenge.webview.l.a(this.c)));
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        r rVar = (r) obj;
        if (rVar != null) {
            Object k = k(rVar.a, (ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        this.c.b.T(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, ContinuationImpl continuationImpl) {
        BouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1 bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1;
        int i;
        if (continuationImpl instanceof BouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1) {
            bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1 = (BouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1) continuationImpl;
            int i2 = bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a(new k(null));
                    v vVar = this.c;
                    vVar.d(str);
                    fyc fycVar = vVar.b;
                    bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.L$0 = this;
                    bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.label = 1;
                    obj = fycVar.s(bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (i) bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                this.a(new j(new o(((Boolean) obj).booleanValue())));
                return zy11.a;
            }
        }
        bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1 = new BouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1(this, continuationImpl);
        Object obj2 = bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bouncerChallengeStoreFactory$ExcecutorImpl$onProcessReturnUrl$1.label;
        if (i != 0) {
        }
        this.a(new j(new o(((Boolean) obj2).booleanValue())));
        return zy11.a;
    }
}
