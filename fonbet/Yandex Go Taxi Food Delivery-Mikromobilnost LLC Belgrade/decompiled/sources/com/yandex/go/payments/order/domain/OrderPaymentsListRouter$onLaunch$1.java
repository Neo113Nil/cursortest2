package com.yandex.go.payments.order.domain;

import com.yandex.go.payments.experiments.g;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.order.domain.OrderPaymentsListRouter$onLaunch$1", f = "OrderPaymentsListRouter.kt", l = {HProv.ALG_SID_KECCAK_224, 90, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrderPaymentsListRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $payload;
    final /* synthetic */ lv90 $preselectedPayment;
    boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentsListRouter$onLaunch$1(e eVar, o2y0 o2y0Var, lv90 lv90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = o2y0Var;
        this.$preselectedPayment = lv90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPaymentsListRouter$onLaunch$1(this.this$0, this.$payload, this.$preselectedPayment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPaymentsListRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (com.yandex.go.payments.order.domain.e.P(r1, r4, r2, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (com.yandex.go.payments.order.domain.e.Q(r1, r4, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.R;
            this.label = 1;
            obj = gVar.c(this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e eVar = this.this$0;
        o2y0 o2y0Var = this.$payload;
        if (booleanValue) {
            lv90 lv90Var = this.$preselectedPayment;
            this.Z$0 = booleanValue;
            this.label = 2;
        } else {
            this.Z$0 = booleanValue;
            this.label = 3;
        }
    }
}
