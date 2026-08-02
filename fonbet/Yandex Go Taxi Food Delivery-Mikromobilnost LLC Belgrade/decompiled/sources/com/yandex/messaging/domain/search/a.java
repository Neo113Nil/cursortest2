package com.yandex.messaging.domain.search;

import defpackage.cl21;
import defpackage.d9g;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.xx6;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r1.emit(r6, r0) == r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BusinessSearchUseCase$run$$inlined$map$1$2$1 businessSearchUseCase$run$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof BusinessSearchUseCase$run$$inlined$map$1$2$1) {
            businessSearchUseCase$run$$inlined$map$1$2$1 = (BusinessSearchUseCase$run$$inlined$map$1$2$1) continuation;
            int i2 = businessSearchUseCase$run$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessSearchUseCase$run$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = businessSearchUseCase$run$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessSearchUseCase$run$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    throw null;
                }
                if (i == 1) {
                    cl21 cl21Var = (cl21) businessSearchUseCase$run$$inlined$map$1$2$1.L$2;
                    vpr vprVar2 = (vpr) businessSearchUseCase$run$$inlined$map$1$2$1.L$1;
                    a aVar = (a) businessSearchUseCase$run$$inlined$map$1$2$1.L$0;
                    b.b(obj2);
                    xx6 xx6Var = (xx6) ((d9g) cl21Var).M0.get();
                    aVar.getClass();
                    businessSearchUseCase$run$$inlined$map$1$2$1.L$0 = vprVar2;
                    businessSearchUseCase$run$$inlined$map$1$2$1.L$1 = null;
                    businessSearchUseCase$run$$inlined$map$1$2$1.L$2 = null;
                    businessSearchUseCase$run$$inlined$map$1$2$1.label = 2;
                    obj2 = tje.k0(xx6Var.a.e, new BusinessSearchController$requestUsersGroupsDepartments$2(xx6Var, (String) obj2, null), businessSearchUseCase$run$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    if (i == 3) {
                        b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) businessSearchUseCase$run$$inlined$map$1$2$1.L$0;
                b.b(obj2);
                businessSearchUseCase$run$$inlined$map$1$2$1.L$0 = null;
                businessSearchUseCase$run$$inlined$map$1$2$1.label = 3;
            }
        }
        businessSearchUseCase$run$$inlined$map$1$2$1 = new BusinessSearchUseCase$run$$inlined$map$1$2$1(this, continuation);
        Object obj22 = businessSearchUseCase$run$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessSearchUseCase$run$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
    }
}
