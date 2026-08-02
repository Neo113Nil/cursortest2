package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import defpackage.hc00;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.kc00;
import defpackage.lsw;
import defpackage.mjv0;
import defpackage.ny61;
import defpackage.qnv0;
import defpackage.unv0;
import defpackage.vnv0;
import defpackage.wnv0;
import defpackage.xnv0;
import defpackage.ynv0;
import defpackage.z3w0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g {
    public final z3w0 a;
    public final jc00 b;
    public final e c;
    public final mjv0 d;

    public g(z3w0 z3w0Var, jc00 jc00Var, e eVar, mjv0 mjv0Var) {
        this.a = z3w0Var;
        this.b = jc00Var;
        this.c = eVar;
        this.d = mjv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1 superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1;
        int i;
        if (continuationImpl instanceof SuperAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1) {
            superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1 = (SuperAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1) continuationImpl;
            int i2 = superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.label = 1;
                    if (this.c.a(superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return b(null, null);
            }
        }
        superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1 = new SuperAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1(this, continuationImpl);
        Object obj2 = superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOriginInteractorImpl$currentSummaryOriginWaitZone$1.label;
        if (i != 0) {
        }
        return b(null, null);
    }

    public final ynv0 b(lsw lswVar, qnv0 qnv0Var) {
        if (!this.d.a.isEmpty()) {
            return unv0.a;
        }
        kc00 kc00Var = (kc00) this.b;
        ic00 ic00Var = kc00Var.a;
        ic00Var.getClass();
        if ((ic00Var instanceof hc00) && this.a.a) {
            return wnv0.a;
        }
        ic00 ic00Var2 = kc00Var.a;
        ic00Var2.getClass();
        return ic00Var2 instanceof hc00 ? new vnv0(lswVar, qnv0Var) : xnv0.a;
    }
}
