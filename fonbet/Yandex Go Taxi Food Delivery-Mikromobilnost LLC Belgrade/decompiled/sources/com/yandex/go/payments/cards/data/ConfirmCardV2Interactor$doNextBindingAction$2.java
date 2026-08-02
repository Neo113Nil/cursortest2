package com.yandex.go.payments.cards.data;

import defpackage.dw5;
import defpackage.j831;
import defpackage.jv5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tu5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltu5;", "<anonymous>", "(Ltse;)Ltu5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.ConfirmCardV2Interactor$doNextBindingAction$2", f = "ConfirmCardV2Interactor.kt", l = {72, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ConfirmCardV2Interactor$doNextBindingAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ dw5 $bindingData;
    final /* synthetic */ jv5 $context;
    final /* synthetic */ j831 $params;
    final /* synthetic */ boolean $required3dsPolling;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCardV2Interactor$doNextBindingAction$2(j831 j831Var, dw5 dw5Var, c cVar, jv5 jv5Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$params = j831Var;
        this.$bindingData = dw5Var;
        this.this$0 = cVar;
        this.$context = jv5Var;
        this.$required3dsPolling = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmCardV2Interactor$doNextBindingAction$2(this.$params, this.$bindingData, this.this$0, this.$context, this.$required3dsPolling, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmCardV2Interactor$doNextBindingAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        dw5 dw5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (tu5) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (tu5) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j831 j831Var = this.$params;
        if (j831Var == null && (dw5Var = this.$bindingData) != null) {
            c cVar = this.this$0;
            jv5 jv5Var = this.$context;
            this.label = 1;
            obj = c.d(cVar, jv5Var, dw5Var, this);
        } else {
            if (j831Var == null) {
                ny61.r("No card data or verification params");
                return null;
            }
            c cVar2 = this.this$0;
            jv5 jv5Var2 = this.$context;
            boolean z = this.$required3dsPolling;
            this.label = 2;
            obj = cVar2.g(jv5Var2, j831Var, z, this);
        }
        return coroutineSingletons;
    }
}
