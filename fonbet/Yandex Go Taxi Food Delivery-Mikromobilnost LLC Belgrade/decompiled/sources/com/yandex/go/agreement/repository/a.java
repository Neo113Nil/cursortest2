package com.yandex.go.agreement.repository;

import defpackage.dd;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public a(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r9.emit(r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1 agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        List list;
        if (continuation instanceof AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1) {
            agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1 = (AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1) continuation;
            int i2 = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = (List) obj;
                    com.yandex.go.agreement.trackable.repository.b bVar = this.b.g;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$0 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$1 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$2 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$4 = vprVar2;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$5 = null;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$6 = list2;
                    agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.b(agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        list = list2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                list = (List) agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$6;
                vprVar = (vpr) agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                Set set = (Set) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!set.contains(((dd) obj3).a())) {
                        arrayList.add(obj3);
                    }
                }
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$0 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$1 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$2 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$3 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$4 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$5 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$6 = null;
                agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label = 2;
            }
        }
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1 = new AgreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1(this, continuation);
        Object obj22 = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Set set2 = (Set) obj22;
        ArrayList arrayList2 = new ArrayList();
        while (r8.hasNext()) {
        }
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$0 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$1 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$2 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$3 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$4 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$5 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.L$6 = null;
        agreementToShowRepositoryImpl$filterNotCached$$inlined$map$1$2$1.label = 2;
    }
}
