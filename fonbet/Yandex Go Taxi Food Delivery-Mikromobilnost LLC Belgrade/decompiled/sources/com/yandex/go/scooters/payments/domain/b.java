package com.yandex.go.scooters.payments.domain;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.scooters.payments.data.c;
import defpackage.ivt;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.lvt;
import defpackage.m6a0;
import defpackage.ngo0;
import defpackage.ny61;
import defpackage.zut;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final ngo0 a;
    public final c b;

    public b(ngo0 ngo0Var, c cVar) {
        this.a = ngo0Var;
        this.b = cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:16|17))(5:18|(2:19|(2:21|(1:39)(1:26))(2:41|42))|27|(3:29|(1:31)(1:36)|(2:33|(1:35)))|37)|12|13))|46|6|7|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m6a0 m6a0Var, ContinuationImpl continuationImpl) {
        ScootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1 scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1;
        int i;
        Object obj;
        if (continuationImpl instanceof ScootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1) {
            scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1 = (ScootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1) continuationImpl;
            int i2 = scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = this.b.b().a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        lea0 lea0Var = (lea0) obj;
                        if (jl40.l(lea0Var.getId(), m6a0Var.b) && lea0Var.c() == m6a0Var.a) {
                            break;
                        }
                    }
                    lea0 lea0Var2 = (lea0) obj;
                    if (lea0Var2 != null) {
                        zut zutVar = lea0Var2 instanceof ivt ? ((ivt) lea0Var2).a : null;
                        if (zutVar != null) {
                            l0 b = this.a.b();
                            lvt lvtVar = lvt.f;
                            scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.L$0 = null;
                            scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.L$1 = null;
                            scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.L$2 = null;
                            scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.L$3 = null;
                            scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.label = 1;
                            obj2 = b.h(zutVar, lvtVar, scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                return (String) obj2;
            }
        }
        scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1 = new ScootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1(this, continuationImpl);
        Object obj22 = scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersGooglePayIdInteractorImpl$getMobilePaymentIdIfPossible$1.label;
        if (i != 0) {
        }
        return (String) obj22;
    }
}
