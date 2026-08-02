package com.yandex.go.payments.paymentlist.details;

import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.ad5;
import defpackage.l9a0;
import defpackage.lea0;
import defpackage.ny61;
import defpackage.q4a0;
import defpackage.xw91;
import defpackage.y4a0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c extends ad5 {
    public final lea0 A;
    public final xw91 B;
    public final y4a0 C;
    public final l9a0 x;
    public final i y;
    public final d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l9a0 l9a0Var, i iVar, d dVar, lea0 lea0Var, y4a0 y4a0Var) {
        super(q4a0.class);
        xw91 xw91Var = xw91.C;
        this.x = l9a0Var;
        this.y = iVar;
        this.z = dVar;
        this.A = lea0Var;
        this.B = xw91Var;
        this.C = y4a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Kg(lea0 lea0Var, ContinuationImpl continuationImpl) {
        PaymentMethodDetailsPresenter$checkAllowDelete$1 paymentMethodDetailsPresenter$checkAllowDelete$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof PaymentMethodDetailsPresenter$checkAllowDelete$1) {
            paymentMethodDetailsPresenter$checkAllowDelete$1 = (PaymentMethodDetailsPresenter$checkAllowDelete$1) continuationImpl;
            int i2 = paymentMethodDetailsPresenter$checkAllowDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodDetailsPresenter$checkAllowDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodDetailsPresenter$checkAllowDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodDetailsPresenter$checkAllowDelete$1.label;
                i iVar = this.y;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodDetailsPresenter$checkAllowDelete$1.L$0 = null;
                    paymentMethodDetailsPresenter$checkAllowDelete$1.label = 1;
                    obj = iVar.b(lea0Var, paymentMethodDetailsPresenter$checkAllowDelete$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                boolean e = iVar.f.e();
                if (booleanValue || e) {
                    ((q4a0) Dg()).hf();
                }
                return zy11.a;
            }
        }
        paymentMethodDetailsPresenter$checkAllowDelete$1 = new PaymentMethodDetailsPresenter$checkAllowDelete$1(this, continuationImpl);
        Object obj2 = paymentMethodDetailsPresenter$checkAllowDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodDetailsPresenter$checkAllowDelete$1.label;
        i iVar2 = this.y;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        boolean e2 = iVar2.f.e();
        if (booleanValue) {
        }
        ((q4a0) Dg()).hf();
        return zy11.a;
    }
}
