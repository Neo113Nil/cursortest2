package com.ybsdk.feature.autotopup.internal.presentation.result;

import com.ybsdk.feature.autotopup.internal.domain.e;
import defpackage.ba4;
import defpackage.bqg;
import defpackage.ca4;
import defpackage.cqg;
import defpackage.da4;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v5;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy3;
import defpackage.x4c;
import defpackage.zy11;
import defpackage.zy3;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultViewModel$retryPayment$1", f = "AutoTopupResultViewModel.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupResultViewModel$retryPayment$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $failedPaymentId;
    final /* synthetic */ ba4 $paymentData;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupResultViewModel$retryPayment$1(b bVar, ba4 ba4Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$paymentData = ba4Var;
        this.$failedPaymentId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupResultViewModel$retryPayment$1(this.this$0, this.$paymentData, this.$failedPaymentId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupResultViewModel$retryPayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        lrp0 lrp0Var = lrp0.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            e eVar = bVar.H;
            String str = this.$paymentData.a;
            String str2 = this.$failedPaymentId;
            ba4 ba4Var = ((wy3) bVar.X()).i;
            boolean z = (ba4Var != null ? ba4Var.g : null) != null;
            this.label = 1;
            d = eVar.d(str, str2, bVar, z, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        ba4 ba4Var2 = this.$paymentData;
        String str3 = this.$failedPaymentId;
        boolean z2 = d instanceof Result.Failure;
        zy11 zy11Var = zy11.a;
        if (!z2) {
            dqg dqgVar = (dqg) d;
            if (dqgVar instanceof cqg) {
                da4 da4Var = (da4) ((cqg) dqgVar).a;
                int i2 = zy3.b[da4Var.a.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    ca4 ca4Var = da4Var.b;
                    if (ca4Var != null) {
                        bVar2.a0(new v5(26, ca4Var, bVar2));
                    }
                    return zy11Var;
                }
                String str4 = ba4Var2.a;
                String str5 = ba4Var2.b;
                String str6 = ba4Var2.c;
                pzt0 pzt0Var = bVar2.K;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar2.K = tje.N(ds31.a(bVar2), null, null, new AutoTopupResultViewModel$getPaymentStatus$1(bVar2, str4, str5, str6, null), 3);
            } else {
                if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    return null;
                }
                x4c.g("Can't retry autotopup payment", null, str3, Collections.singletonList(lrp0Var), 2);
                b.b0(bVar2);
            }
        }
        String str7 = this.$failedPaymentId;
        b bVar3 = this.this$0;
        if (Result.a(d) != null) {
            x4c.g("Can't retry autotopup payment", null, str7, Collections.singletonList(lrp0Var), 2);
            b.b0(bVar3);
        }
        return zy11Var;
    }
}
