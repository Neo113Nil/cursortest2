package com.yandex.go.agreement.repository;

import defpackage.dd;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AgreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1 agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AgreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1) {
            agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1 = (AgreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1) continuation;
            int i2 = agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (!((dd) obj3).c()) {
                            arrayList.add(obj3);
                        }
                    }
                    agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.L$0 = null;
                    agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.L$1 = null;
                    agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.L$2 = null;
                    agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.L$3 = null;
                    agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1 = new AgreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
