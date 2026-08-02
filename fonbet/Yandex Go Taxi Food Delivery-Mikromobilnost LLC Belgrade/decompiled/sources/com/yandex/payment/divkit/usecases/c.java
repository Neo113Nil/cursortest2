package com.yandex.payment.divkit.usecases;

import android.net.Uri;
import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import defpackage.ct20;
import defpackage.daj;
import defpackage.h2e0;
import defpackage.hyj0;
import defpackage.i2e0;
import defpackage.j2e0;
import defpackage.k2e0;
import defpackage.kyj0;
import defpackage.mm0;
import defpackage.nm0;
import defpackage.ny61;
import defpackage.om0;
import defpackage.p89;
import defpackage.pm0;
import defpackage.qm0;
import defpackage.qyj0;
import defpackage.rm0;
import defpackage.s89;
import defpackage.u89;
import defpackage.v89;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w89;
import defpackage.x89;
import defpackage.y89;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CoordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1 coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1;
        int i;
        Object qm0Var;
        Object kyj0Var;
        if (continuation instanceof CoordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1) {
            coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1 = (CoordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1) continuation;
            int i2 = coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qyj0 qyj0Var = (qyj0) obj;
                    if (qyj0Var instanceof hyj0) {
                        kyj0Var = new hyj0(((hyj0) qyj0Var).a);
                    } else {
                        if (!(qyj0Var instanceof kyj0)) {
                            w511.b();
                            return null;
                        }
                        k2e0 k2e0Var = (k2e0) ((kyj0) qyj0Var).a;
                        if (k2e0Var instanceof h2e0) {
                            kyj0Var = new kyj0(new mm0(((h2e0) k2e0Var).a));
                        } else if (k2e0Var instanceof j2e0) {
                            kyj0Var = new kyj0(new nm0(PaymentPollingResult.SUCCESS));
                        } else {
                            if (!(k2e0Var instanceof i2e0)) {
                                w511.b();
                                return null;
                            }
                            ct20 ct20Var = ((i2e0) k2e0Var).a;
                            if (ct20Var instanceof p89) {
                                p89 p89Var = (p89) ct20Var;
                                qm0Var = new pm0(p89Var.b, p89Var.c);
                            } else if (ct20Var instanceof w89) {
                                w89 w89Var = (w89) ct20Var;
                                qm0Var = new rm0(Uri.parse(w89Var.b), w89Var.c);
                            } else {
                                qm0Var = ((ct20Var instanceof s89) || (ct20Var instanceof x89) || (ct20Var instanceof u89) || (ct20Var instanceof y89) || (ct20Var instanceof daj)) ? new qm0(ct20Var) : ct20Var instanceof v89 ? new om0(((v89) ct20Var).b) : new nm0(PaymentPollingResult.WAIT_FOR_PROCESSING);
                            }
                            kyj0Var = new kyj0(qm0Var);
                        }
                    }
                    coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.L$0 = null;
                    coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.L$1 = null;
                    coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.L$2 = null;
                    coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.L$3 = null;
                    coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.I$0 = 0;
                    coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kyj0Var, coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1) == coroutineSingletons) {
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
        coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1 = new CoordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1(this, continuation);
        Object obj22 = coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinatorUseCaseKt$mapToOldVersion$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
