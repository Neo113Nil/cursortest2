package com.yandex.go.payments.paymentlist.domain;

import android.content.Context;
import defpackage.drd;
import defpackage.kyh0;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vk2;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nfh b;

    public a(vpr vprVar, nfh nfhVar) {
        this.a = vprVar;
        this.b = nfhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1 announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1;
        int i;
        vpr vprVar;
        String str;
        if (continuation instanceof AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1) {
            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1 = (AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.label;
                nfh nfhVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    vk2 vk2Var = (vk2) rsnVar.a;
                    vprVar = this.a;
                    if (vk2Var != null) {
                        vk2 vk2Var2 = (vk2) rsnVar.b;
                        if (vk2Var.a != null && vk2Var2.a == null && !((drd) nfhVar.b).d(vk2Var2.b.a())) {
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$7 = null;
                            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        }
                    }
                    str = null;
                    if (str != null) {
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$7 = null;
                        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.label = 2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                str = ((Context) nfhVar.a).getString(kyh0.payment_methods_plus_unavailable);
                if (str != null) {
                }
                return zy11.a;
            }
        }
        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1 = new AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$2$1.label;
        nfh nfhVar2 = this.b;
        if (i != 0) {
        }
        str = ((Context) nfhVar2.a).getString(kyh0.payment_methods_plus_unavailable);
        if (str != null) {
        }
        return zy11.a;
    }
}
