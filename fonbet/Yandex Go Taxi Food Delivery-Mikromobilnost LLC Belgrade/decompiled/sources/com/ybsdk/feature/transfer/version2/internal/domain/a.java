package com.ybsdk.feature.transfer.version2.internal.domain;

import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.jl40;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.yr01;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, b bVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1 transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof Transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1) {
            transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1 = (Transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    if (s2e0Var instanceof q2e0) {
                        obj3 = (dqg) ((q2e0) s2e0Var).a;
                    } else if (s2e0Var instanceof n2e0) {
                        obj3 = new cqg(new yr01(ResultStatus.ERROR));
                    } else if (jl40.l(s2e0Var, r2e0.a)) {
                        obj3 = new cqg(new yr01(ResultStatus.TIMEOUT));
                    }
                    if (obj3 != null) {
                        transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj3, transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1 = new Transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Interactor$callGetResult$$inlined$mapNotNull$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
