package com.yandex.go.payments.nameedit.navigation;

import com.yandex.go.payments.domain.y;
import defpackage.agd;
import defpackage.mca0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oca0;
import defpackage.uca0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xea0;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luca0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.nameedit.navigation.PaymentMethodsNameEditRouter$content$1$1", f = "PaymentMethodsNameEditRouter.kt", l = {33, 34}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsNameEditRouter$content$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yfd $this_buildContent;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oca0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsNameEditRouter$content$1$1(oca0 oca0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oca0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMethodsNameEditRouter$content$1$1 paymentMethodsNameEditRouter$content$1$1 = new PaymentMethodsNameEditRouter$content$1$1(this.this$0, this.$this_buildContent, continuation);
        paymentMethodsNameEditRouter$content$1$1.L$0 = obj;
        return paymentMethodsNameEditRouter$content$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsNameEditRouter$content$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y yVar = this.this$0.I;
            xea0 xea0Var = ((mca0) ((agd) this.$this_buildContent).a).b;
            this.L$0 = vprVar;
            this.label = 1;
            obj = yVar.a(xea0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        uca0 uca0Var = new uca0(((mca0) ((agd) this.$this_buildContent).a).a, (String) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
