package com.ybsdk.feature.testpayment.internal.presentation;

import com.ybsdk.feature.testpayment.internal.domain.entities.TestPaymentStatusEntity$Failed$ErrorType;
import defpackage.dxv;
import defpackage.ghy0;
import defpackage.hhy0;
import defpackage.ihy0;
import defpackage.mvg;
import defpackage.nhy0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r501;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.testpayment.internal.presentation.TestPaymentViewModel$initiateTestPayment$2", f = "TestPaymentViewModel.kt", l = {60, 81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TestPaymentViewModel$initiateTestPayment$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestPaymentViewModel$initiateTestPayment$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TestPaymentViewModel$initiateTestPayment$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TestPaymentViewModel$initiateTestPayment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r2 == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        r0 r0Var;
        Object value;
        ihy0 ihy0Var;
        nhy0 nhy0Var;
        Object obj2;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.testpayment.internal.domain.b bVar = aVar.C;
            TestPaymentPayload payload = aVar.B.getPayload();
            a aVar2 = this.this$0;
            this.label = 1;
            d = bVar.d(payload, aVar2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                b.b(obj);
                d = obj2;
                a aVar3 = this.this$0;
                a = Result.a(d);
                if (a != null) {
                    pz40 Y = aVar3.Y();
                    while (true) {
                        r0 r0Var2 = (r0) Y;
                        Object value2 = r0Var2.getValue();
                        pz40 pz40Var = Y;
                        if (r0Var2.k(value2, ghy0.a((ghy0) value2, r501.a(a, null, null, null, null, null, null, null, null, null, null, null, null, 65534), null, null, 6))) {
                            break;
                        }
                        Y = pz40Var;
                    }
                }
                return zy11.a;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        if (!(d instanceof Result.Failure)) {
            dxv dxvVar = (dxv) d;
            pz40 Y2 = aVar4.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                ihy0Var = new ihy0(dxvVar.b, dxvVar.c, dxvVar.a);
                nhy0Var = dxvVar.e;
            } while (!r0Var.k(value, ghy0.a((ghy0) value, null, ihy0Var, new hhy0(nhy0Var.a, nhy0Var.b, nhy0Var.c, nhy0Var.d, nhy0Var.e, TestPaymentStatusEntity$Failed$ErrorType.TIMEOUT), 1)));
            String str = dxvVar.d;
            this.L$0 = d;
            this.label = 2;
            if (a.b0(aVar4, str, this) != coroutineSingletons) {
                obj2 = d;
                d = obj2;
            }
            return coroutineSingletons;
        }
        a aVar32 = this.this$0;
        a = Result.a(d);
        if (a != null) {
        }
        return zy11.a;
    }
}
