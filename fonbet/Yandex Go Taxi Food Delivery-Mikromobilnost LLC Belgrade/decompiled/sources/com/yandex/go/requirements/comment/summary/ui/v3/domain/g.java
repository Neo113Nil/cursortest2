package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.j73;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1 aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1) {
            aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1 = (AIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1) continuation;
            int i2 = aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d0l0 d0l0Var = (d0l0) obj;
                    Address h = d0l0Var.h();
                    zzs B = h != null ? h.B() : null;
                    Address b = d0l0Var.b();
                    List A = j73.A(new zzs[]{B, b != null ? b.B() : null});
                    aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.L$0 = null;
                    aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.L$1 = null;
                    aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.L$2 = null;
                    aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.L$3 = null;
                    aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(A, aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1 = new AIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aIRequirementsDataFactory$routeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
