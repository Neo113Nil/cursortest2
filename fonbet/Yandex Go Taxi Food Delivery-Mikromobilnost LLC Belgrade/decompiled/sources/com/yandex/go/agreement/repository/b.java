package com.yandex.go.agreement.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements tpr {
    public final /* synthetic */ f a;
    public final /* synthetic */ g b;

    public b(f fVar, g gVar) {
        this.a = fVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1 agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1;
        int i;
        if (continuation instanceof AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1) {
            agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1 = (AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1) continuation;
            int i2 = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.L$0 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.L$1 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.L$2 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1 = new AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1(this, continuation);
        Object obj2 = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
