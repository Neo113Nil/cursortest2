package com.yandex.go.payments.paymentlist.domain.converter;

import com.yandex.go.payments.paymentlist.data.EditModeState;
import defpackage.avj0;
import defpackage.gca0;
import defpackage.jfa0;
import defpackage.k4m;
import defpackage.kyh0;
import defpackage.m4a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgca0;", "<anonymous>", "(Ltse;)Lgca0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.converter.PaymentMethodsConverter$toUIState$2", f = "PaymentMethodsConverter.kt", l = {219, 220}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsConverter$toUIState$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $addCardWarning;
    final /* synthetic */ k4m $doneButtonState;
    final /* synthetic */ boolean $isPlusSdkAvailable;
    final /* synthetic */ jfa0 $paymentOptions;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsConverter$toUIState$2(i iVar, jfa0 jfa0Var, String str, k4m k4mVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$paymentOptions = jfa0Var;
        this.$addCardWarning = str;
        this.$doneButtonState = k4mVar;
        this.$isPlusSdkAvailable = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsConverter$toUIState$2(this.this$0, this.$paymentOptions, this.$addCardWarning, this.$doneButtonState, this.$isPlusSdkAvailable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsConverter$toUIState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        if (r12 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r12 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaymentMethodsConverter$toUIState$2 paymentMethodsConverter$toUIState$2;
        m4a0 m4a0Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean a = this.this$0.c.a();
            i iVar = this.this$0;
            jfa0 jfa0Var = this.$paymentOptions;
            if (a) {
                this.label = 1;
                obj = i.a(iVar, jfa0Var, this);
            } else {
                String str2 = this.$addCardWarning;
                k4m k4mVar = this.$doneButtonState;
                boolean z = this.$isPlusSdkAvailable;
                this.label = 2;
                paymentMethodsConverter$toUIState$2 = this;
                obj = i.b(iVar, jfa0Var, str2, k4mVar, z, paymentMethodsConverter$toUIState$2);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            m4a0Var = (m4a0) obj;
            paymentMethodsConverter$toUIState$2 = this;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            paymentMethodsConverter$toUIState$2 = this;
            m4a0Var = (m4a0) obj;
        }
        String k = paymentMethodsConverter$toUIState$2.this$0.k();
        i iVar2 = paymentMethodsConverter$toUIState$2.this$0;
        zuj0 zuj0Var = iVar2.f;
        int i2 = f.a[((EditModeState) iVar2.c.a.a.getValue()).ordinal()];
        if (i2 == 1) {
            str = "";
        } else if (i2 == 2) {
            str = ((avj0) zuj0Var).h(kyh0.common_done);
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            str = ((avj0) zuj0Var).h(kyh0.common_edit);
        }
        return new gca0(m4a0Var, k, str, !paymentMethodsConverter$toUIState$2.this$0.c.a());
    }
}
