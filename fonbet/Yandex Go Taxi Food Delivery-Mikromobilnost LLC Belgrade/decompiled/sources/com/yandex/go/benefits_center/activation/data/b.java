package com.yandex.go.benefits_center.activation.data;

import defpackage.am5;
import defpackage.ar4;
import defpackage.br4;
import defpackage.cr4;
import defpackage.ny61;
import defpackage.w511;
import defpackage.xl5;
import defpackage.yl5;
import defpackage.zl5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final com.yandex.go.benefits_center.activation.domain.a a;

    public b(com.yandex.go.benefits_center.activation.domain.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        BenefitActivationBannersInteractorImpl$activate$1 benefitActivationBannersInteractorImpl$activate$1;
        int i;
        am5 am5Var;
        if (continuationImpl instanceof BenefitActivationBannersInteractorImpl$activate$1) {
            benefitActivationBannersInteractorImpl$activate$1 = (BenefitActivationBannersInteractorImpl$activate$1) continuationImpl;
            int i2 = benefitActivationBannersInteractorImpl$activate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benefitActivationBannersInteractorImpl$activate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = benefitActivationBannersInteractorImpl$activate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitActivationBannersInteractorImpl$activate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    benefitActivationBannersInteractorImpl$activate$1.L$0 = null;
                    benefitActivationBannersInteractorImpl$activate$1.label = 1;
                    obj = this.a.a(str, benefitActivationBannersInteractorImpl$activate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                am5Var = (am5) obj;
                if (!(am5Var instanceof zl5)) {
                    return cr4.a;
                }
                if (am5Var instanceof xl5) {
                    return ar4.a;
                }
                if (am5Var instanceof yl5) {
                    return new br4(((yl5) am5Var).a());
                }
                w511.b();
                return null;
            }
        }
        benefitActivationBannersInteractorImpl$activate$1 = new BenefitActivationBannersInteractorImpl$activate$1(this, continuationImpl);
        Object obj2 = benefitActivationBannersInteractorImpl$activate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitActivationBannersInteractorImpl$activate$1.label;
        if (i != 0) {
        }
        am5Var = (am5) obj2;
        if (!(am5Var instanceof zl5)) {
        }
    }
}
